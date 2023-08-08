package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import com.lithic.api.models.CardListParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardServiceTest {

    @Test
    fun callCreate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val cardService = client.cards()
        val card =
            cardService.create(
                CardCreateParams.builder()
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cardProgramToken("00000000-0000-0000-1000-000000000000")
                    .expMonth("06")
                    .expYear("2027")
                    .memo("New Card")
                    .spendLimit(123L)
                    .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                    .state(CardCreateParams.State.OPEN)
                    .type(CardCreateParams.Type.VIRTUAL)
                    .pin("string")
                    .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                    .productId("1")
                    .shippingAddress(
                        ShippingAddress.builder()
                            .address1("5 Broad Street")
                            .city("NEW YORK")
                            .country("USA")
                            .firstName("Michael")
                            .lastName("Bluth")
                            .postalCode("10001-1809")
                            .state("NY")
                            .address2("Unit 25A")
                            .email("johnny@appleseed.com")
                            .line2Text("The Bluth Company")
                            .phoneNumber("+12124007676")
                            .build()
                    )
                    .shippingMethod(CardCreateParams.ShippingMethod.STANDARD)
                    .carrier(Carrier.builder().qrCodeUrl("string").build())
                    .build()
            )
        println(card)
        card.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val cardService = client.cards()
        val card =
            cardService.retrieve(
                CardRetrieveParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(card)
        card.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val cardService = client.cards()
        val card =
            cardService.update(
                CardUpdateParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("New Card")
                    .spendLimit(123L)
                    .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                    .authRuleToken("string")
                    .state(CardUpdateParams.State.CLOSED)
                    .pin("string")
                    .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                    .build()
            )
        println(card)
        card.validate()
    }

    @Test
    fun callList() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val cardService = client.cards()
        val response = cardService.list(CardListParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callEmbed() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val cardService = client.cards()
        val cardEmbedResponse =
            cardService.embed(
                CardEmbedParams.builder().embedRequest("string").hmac("string").build()
            )
        println(cardEmbedResponse)
        assertThat(cardEmbedResponse).isNotBlank()
    }

    @Test
    fun callProvision() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val cardService = client.cards()
        val cardProvisionResponse =
            cardService.provision(
                CardProvisionParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .digitalWallet(CardProvisionParams.DigitalWallet.APPLE_PAY)
                    .nonce("U3RhaW5sZXNzIHJvY2tz")
                    .nonceSignature("U3RhaW5sZXNzIHJvY2tz")
                    .certificate("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )
        println(cardProvisionResponse)
        cardProvisionResponse.validate()
    }

    @Test
    fun callReissue() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val cardService = client.cards()
        val card =
            cardService.reissue(
                CardReissueParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .shippingAddress(
                        ShippingAddress.builder()
                            .address1("5 Broad Street")
                            .city("NEW YORK")
                            .country("USA")
                            .firstName("Michael")
                            .lastName("Bluth")
                            .postalCode("10001-1809")
                            .state("NY")
                            .address2("Unit 25A")
                            .email("johnny@appleseed.com")
                            .line2Text("The Bluth Company")
                            .phoneNumber("+12124007676")
                            .build()
                    )
                    .shippingMethod(CardReissueParams.ShippingMethod.STANDARD)
                    .productId("string")
                    .carrier(Carrier.builder().qrCodeUrl("string").build())
                    .build()
            )
        println(card)
        card.validate()
    }

    @Test
    fun callGetEmbedHtml() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val cardService = client.cards()
        val cardEmbedResponse =
            cardService.getEmbedHtml(CardGetEmbedHtmlParams.builder().token("foo").build())
        println(cardEmbedResponse)
        assertThat(cardEmbedResponse).contains("<html>")
    }

    @Test
    fun callGetEmbedUrl() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .webhookSecret("string")
                .build()
        val cardService = client.cards()
        val cardEmbedUrl =
            cardService.getEmbedUrl(CardGetEmbedUrlParams.builder().token("foo").build())
        println(cardEmbedUrl)
        assertThat(cardEmbedUrl).contains("hmac")
    }
}
