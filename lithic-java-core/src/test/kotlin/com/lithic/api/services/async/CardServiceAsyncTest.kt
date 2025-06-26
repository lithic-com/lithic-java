// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.CardConvertPhysicalParams
import com.lithic.api.models.CardCreateParams
import com.lithic.api.models.CardEmbedParams
import com.lithic.api.models.CardProvisionParams
import com.lithic.api.models.CardReissueParams
import com.lithic.api.models.CardRenewParams
import com.lithic.api.models.CardSearchByPanParams
import com.lithic.api.models.CardUpdateParams
import com.lithic.api.models.CardWebProvisionParams
import com.lithic.api.models.Carrier
import com.lithic.api.models.ShippingAddress
import com.lithic.api.models.SpendLimitDuration
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardServiceAsyncTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val cardFuture =
            cardServiceAsync.create(
                CardCreateParams.builder()
                    .type(CardCreateParams.Type.VIRTUAL)
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cardProgramToken("00000000-0000-0000-1000-000000000000")
                    .carrier(Carrier.builder().qrCodeUrl("qr_code_url").build())
                    .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                    .expMonth("06")
                    .expYear("2027")
                    .memo("New Card")
                    .pin("pin")
                    .productId("1")
                    .replacementAccountToken("00000000-0000-0000-2000-000000000000")
                    .replacementFor("00000000-0000-0000-1000-000000000000")
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
                    .spendLimitDuration(SpendLimitDuration.TRANSACTION)
                    .state(CardCreateParams.State.OPEN)
                    .build()
            )

        val card = cardFuture.get()
        card.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val cardFuture = cardServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val card = cardFuture.get()
        card.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val cardFuture =
            cardServiceAsync.update(
                CardUpdateParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                    .memo("Updated Name")
                    .pin("pin")
                    .pinStatus(CardUpdateParams.PinStatus.OK)
                    .spendLimit(100L)
                    .spendLimitDuration(SpendLimitDuration.FOREVER)
                    .state(CardUpdateParams.State.OPEN)
                    .build()
            )

        val card = cardFuture.get()
        card.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val pageFuture = cardServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun convertPhysical() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val cardFuture =
            cardServiceAsync.convertPhysical(
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
                    .shippingMethod(CardConvertPhysicalParams.ShippingMethod.STANDARD)
                    .build()
            )

        val card = cardFuture.get()
        card.validate()
    }

    @Test
    fun embed() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val responseFuture =
            cardServiceAsync.embed(
                CardEmbedParams.builder().embedRequest("embed_request").hmac("hmac").build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun provision() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val responseFuture =
            cardServiceAsync.provision(
                CardProvisionParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .certificate("U3RhaW5sZXNzIHJvY2tz")
                    .clientDeviceId("client_device_id")
                    .clientWalletAccountId("client_wallet_account_id")
                    .digitalWallet(CardProvisionParams.DigitalWallet.GOOGLE_PAY)
                    .nonce("U3RhaW5sZXNzIHJvY2tz")
                    .nonceSignature("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun reissue() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val cardFuture =
            cardServiceAsync.reissue(
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
                    .shippingMethod(CardReissueParams.ShippingMethod.STANDARD)
                    .build()
            )

        val card = cardFuture.get()
        card.validate()
    }

    @Test
    fun renew() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val cardFuture =
            cardServiceAsync.renew(
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
                    .shippingMethod(CardRenewParams.ShippingMethod.STANDARD)
                    .build()
            )

        val card = cardFuture.get()
        card.validate()
    }

    @Test
    fun retrieveSpendLimits() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val cardSpendLimitsFuture =
            cardServiceAsync.retrieveSpendLimits("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val cardSpendLimits = cardSpendLimitsFuture.get()
        cardSpendLimits.validate()
    }

    @Test
    fun searchByPan() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val cardFuture =
            cardServiceAsync.searchByPan(
                CardSearchByPanParams.builder().pan("4111111289144142").build()
            )

        val card = cardFuture.get()
        card.validate()
    }

    @Test
    fun webProvision() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val cardServiceAsync = client.cards()

        val responseFuture =
            cardServiceAsync.webProvision(
                CardWebProvisionParams.builder()
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .digitalWallet(CardWebProvisionParams.DigitalWallet.APPLE_PAY)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
