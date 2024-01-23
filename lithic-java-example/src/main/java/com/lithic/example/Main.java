package com.lithic.example;

import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;
import com.lithic.api.models.*;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.stream.Stream;

public class Main {
    static final String SANDBOX_API_KEY = System.getenv("LITHIC_API_KEY");

    static final LithicClient client =
            LithicOkHttpClient.builder().sandbox().apiKey(SANDBOX_API_KEY).build();

    public static void main(String[] args) {
        System.out.println("Creating card");
        ShippingAddress address = ShippingAddress.builder()
                .firstName("Jane")
                .lastName("Doe")
                .address1("Smith St., 42")
                .city("New York")
                .state("NY")
                .postalCode("10000")
                .country("USA")
                .build();
        Card card = client.cards()
                .create(CardCreateParams.builder()
                        .type(CardCreateParams.Type.VIRTUAL)
                        .shippingAddress(address)
                        .spendLimit(2000)
                        .build())
                .validate();
        System.out.println("Created card: " + card.token() + ", memo: " + card.memo());

        System.out.println("Updating memo");
        CardUpdateParams params = CardUpdateParams.builder()
                .cardToken(card.token())
                .memo("new memo")
                .build();
        card = client.cards().update(params);
        System.out.println("Updated memo: " + card.token() + ", memo: " + card.memo());

        System.out.println("Scanning new cards");
        CardListParams listParams = CardListParams.builder()
                .begin(OffsetDateTime.now(ZoneOffset.UTC).minusDays(7))
                .build();
        Stream<Card> cardsCreatedLastWeek = client.cards().list(listParams).autoPager().stream();
        Long totalSpendLimit = cardsCreatedLastWeek.mapToLong(Card::spendLimit).sum();
        System.out.println("Spend limit of cards created within the last week: " + totalSpendLimit);
    }

    @SuppressWarnings("unused")
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

        AccountHolderCreateResponse accountHolder = client.accountHolders()
                .create(AccountHolderCreateParams.builder().forKyc(kyc).build());
        String accountToken = accountHolder.accountToken();
        return client.accounts()
                .retrieve(AccountRetrieveParams.builder()
                        .accountToken(accountToken)
                        .build());
    }
}
