// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.CardConvertPhysicalParams
import com.lithic.api.models.CardCreateParams
import com.lithic.api.models.CardEmbedParams
import com.lithic.api.models.CardProvisionParams
import com.lithic.api.models.CardReissueParams
import com.lithic.api.models.CardRenewParams
import com.lithic.api.models.CardRetrieveParams
import com.lithic.api.models.CardRetrieveSpendLimitsParams
import com.lithic.api.models.CardSearchByPanParams
import com.lithic.api.models.CardUpdateParams
import com.lithic.api.models.Carrier
import com.lithic.api.models.ShippingAddress
import com.lithic.api.models.SpendLimitDuration
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
                .apiKey("My Lithic API Key")
                .build()
        val cardService = client.cards()
        val card =
            cardService.create(
                CardCreateParams.builder()
                    .type(CardCreateParams.Type.MERCHANT_LOCKED)
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cardProgramToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .carrier(Carrier.builder().qrCodeUrl("qr_code_url").build())
                    .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expMonth("06")
                    .expYear("2027")
                    .memo("New Card")
                    .pin("pin")
                    .productId("1")
                    .replacementAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .replacementFor("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                            .phoneNumber("+15555555555")
                            .build()
                    )
                    .shippingMethod(CardCreateParams.ShippingMethod._2_DAY)
                    .spendLimit(1000L)
                    .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                    .state(CardCreateParams.State.OPEN)
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
                .apiKey("My Lithic API Key")
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
                .apiKey("My Lithic API Key")
                .build()
        val cardService = client.cards()
        val card =
            cardService.update(
                CardUpdateParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .digitalCardArtToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("Updated Name")
                    .pin("pin")
                    .pinStatus(CardUpdateParams.PinStatus.OK)
                    .spendLimit(100L)
                    .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                    .state(CardUpdateParams.State.CLOSED)
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
                .apiKey("My Lithic API Key")
                .build()
        val cardService = client.cards()
        val response = cardService.list()
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callConvertPhysical() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardService = client.cards()
        val card =
            cardService.convertPhysical(
                CardConvertPhysicalParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .shippingAddress(
                        ShippingAddress.builder()
                            .address1("5 Broad Street")
                            .city("NEW YORK")
                            .country("USA")
                            .firstName("Janet")
                            .lastName("Yellen")
                            .postalCode("10001")
                            .state("NY")
                            .address2("Unit 5A")
                            .email("johnny@appleseed.com")
                            .line2Text("The Bluth Company")
                            .phoneNumber("+15555555555")
                            .build()
                    )
                    .carrier(
                        Carrier.builder().qrCodeUrl("https://lithic.com/activate-card/1").build()
                    )
                    .productId("100")
                    .shippingMethod(CardConvertPhysicalParams.ShippingMethod._2_DAY)
                    .build()
            )
        println(card)
        card.validate()
    }

    @Test
    fun callEmbed() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardService = client.cards()
        val cardEmbedResponse =
            cardService.embed(
                CardEmbedParams.builder().embedRequest("embed_request").hmac("hmac").build()
            )
        println(cardEmbedResponse)
        assertThat(cardEmbedResponse).isNotBlank()
    }

    @Test
    fun callProvision() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardService = client.cards()
        val cardProvisionResponse =
            cardService.provision(
                CardProvisionParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .certificate("U3RhaW5sZXNzIHJvY2tz")
                    .clientDeviceId("client_device_id")
                    .clientWalletAccountId("client_wallet_account_id")
                    .digitalWallet(CardProvisionParams.DigitalWallet.APPLE_PAY)
                    .nonce("U3RhaW5sZXNzIHJvY2tz")
                    .nonceSignature("U3RhaW5sZXNzIHJvY2tz")
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
                .apiKey("My Lithic API Key")
                .build()
        val cardService = client.cards()
        val card =
            cardService.reissue(
                CardReissueParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .carrier(
                        Carrier.builder().qrCodeUrl("https://lithic.com/activate-card/1").build()
                    )
                    .productId("100")
                    .shippingAddress(
                        ShippingAddress.builder()
                            .address1("5 Broad Street")
                            .city("NEW YORK")
                            .country("USA")
                            .firstName("Janet")
                            .lastName("Yellen")
                            .postalCode("10001")
                            .state("NY")
                            .address2("Unit 5A")
                            .email("johnny@appleseed.com")
                            .line2Text("The Bluth Company")
                            .phoneNumber("+15555555555")
                            .build()
                    )
                    .shippingMethod(CardReissueParams.ShippingMethod._2_DAY)
                    .build()
            )
        println(card)
        card.validate()
    }

    @Test
    fun callRenew() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardService = client.cards()
        val card =
            cardService.renew(
                CardRenewParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .shippingAddress(
                        ShippingAddress.builder()
                            .address1("5 Broad Street")
                            .city("NEW YORK")
                            .country("USA")
                            .firstName("Janet")
                            .lastName("Yellen")
                            .postalCode("10001")
                            .state("NY")
                            .address2("Unit 5A")
                            .email("johnny@appleseed.com")
                            .line2Text("The Bluth Company")
                            .phoneNumber("+15555555555")
                            .build()
                    )
                    .carrier(
                        Carrier.builder().qrCodeUrl("https://lithic.com/activate-card/1").build()
                    )
                    .expMonth("06")
                    .expYear("2027")
                    .productId("100")
                    .shippingMethod(CardRenewParams.ShippingMethod._2_DAY)
                    .build()
            )
        println(card)
        card.validate()
    }

    @Test
    fun callRetrieveSpendLimits() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardService = client.cards()
        val cardSpendLimits =
            cardService.retrieveSpendLimits(
                CardRetrieveSpendLimitsParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(cardSpendLimits)
        cardSpendLimits.validate()
    }

    @Test
    fun callSearchByPan() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardService = client.cards()
        val card =
            cardService.searchByPan(CardSearchByPanParams.builder().pan("4111111289144142").build())
        println(card)
        card.validate()
    }
}
