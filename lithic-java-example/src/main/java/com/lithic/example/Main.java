package com.lithic.example;

import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;
import com.lithic.api.models.*;
import com.lithic.api.models.Card;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.stream.Stream;

public class Main {
    static final String SANDBOX_API_KEY = System.getenv("LITHIC_API_KEY");

    static final LithicClient client =
            LithicOkHttpClient.builder().sandbox().apiKey(SANDBOX_API_KEY).build();

    public static void main(String[] args) {
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
        CardListParams params = CardListParams.builder()
                .begin(OffsetDateTime.now(ZoneOffset.UTC).minusDays(7))
                .build();
        return client.cards().list(params).autoPager().stream();
    }
}
