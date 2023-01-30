package com.lithic.example;

import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;
import com.lithic.api.models.*;
import com.lithic.api.models.AccountHolderCreateParams.Kyc;
import com.lithic.api.models.Card;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    static final String SANDBOX_API_KEY = "5344d81a-da4a-4843-bce5-5495e79096b3";

    static final LithicClient client =
            LithicOkHttpClient.builder().sandbox().apiKey(SANDBOX_API_KEY).build();

    public static void main(String[] args) {
        System.out.println("Creating an account");
        Account account = createAccount();
        System.out.println("Account created: " + account.token() + ", state: " + account.state());

        System.out.println("Scanning for declined transactions in account");
        Stream<Transaction> declinedTransactions = findDeclinedTransactions(account);
        declinedTransactions.forEach((declined -> System.out.println("declined transaction: " + declined)));

        System.out.println("Creating card");
        Card card = createCard().validate();
        System.out.println("Created card: " + card.token() + ", memo: " + card.memo());

        System.out.println("Updating memo");
        card = updateMemo(card, "new memo").validate();
        System.out.println("Updated memo: " + card.token() + ", memo: " + card.memo());

        System.out.println("Scanning new cards");
        Stream<Card> newCards = cardsCreatedLastWeek();
        System.out.println("Spend limit of cards created within the last week: "
                + newCards.mapToLong(Card::spendLimit).sum());
    }

    public static Account createAccount() {
        Address address = Address.builder()
                .address1("Smith Street 42")
                .city("New York")
                .country("USA")
                .postalCode("11201")
                .state("NY")
                .build();

        Kyc.Individual individual = Kyc.Individual.builder()
                .address(address)
                .dob("1970-01-01")
                .email("Jane.Doe@example.com")
                .firstName("Jane")
                .lastName("Doe")
                .phoneNumber("+16175551212")
                .governmentId("123456789")
                .build();

        Kyc kyc = Kyc.builder()
                .individual(individual)
                .tosTimestamp("2022-11-16 09:00:00")
                .kycPassedTimestamp("2022-11-16 09:00:00")
                .workflow(Kyc.Workflow.KYC_BASIC)
                .build();

        AccountHolder accountHolder = client.accountHolders()
                .create(AccountHolderCreateParams.builder().forKyc(kyc).build());
        if (!accountHolder.accountToken().isPresent()) {
            throw new Error("account holder without account");
        }
        String accountToken = accountHolder.accountToken().get();
        return client.accounts()
                .retrieve(AccountRetrieveParams.builder()
                        .accountToken(accountToken)
                        .build());
    }

    public static Stream<Transaction> findDeclinedTransactions(Account account) {
        TransactionListParams params =
                TransactionListParams.builder().accountToken(account.token()).build();
        return client.transactions().list(params).autoPager().stream()
                .filter((transaction -> transaction.status().equals(Optional.of(Transaction.Status.DECLINED))));
    }

    public static Card createCard() {
        ShippingAddress address = ShippingAddress.builder()
                .firstName("Jane")
                .lastName("Doe")
                .address1("Smith St., 42")
                .city("New York")
                .state("NY")
                .postalCode("10000")
                .country("USA")
                .build();
        return client.cards()
                .create(CardCreateParams.builder()
                        .type(CardCreateParams.Type.VIRTUAL)
                        .shippingAddress(address)
                        .spendLimit(2000)
                        .build());
    }

    public static Card updateMemo(Card card, String memo) {
        CardUpdateParams params =
                CardUpdateParams.builder().cardToken(card.token()).memo(memo).build();
        return client.cards().update(params);
    }

    public static Stream<Card> cardsCreatedLastWeek() {
        String begin = ZonedDateTime.now(ZoneOffset.UTC).minusDays(7).format(DateTimeFormatter.ISO_INSTANT);
        CardListParams params = CardListParams.builder().begin(begin).build();
        return client.cards().list(params).autoPager().stream();
    }
}
