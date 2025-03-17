// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.lithic.api.client.LithicClient
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.core.JsonValue
import com.lithic.api.core.http.Headers
import com.lithic.api.core.jsonMapper
import com.lithic.api.errors.BadRequestException
import com.lithic.api.errors.InternalServerException
import com.lithic.api.errors.LithicError
import com.lithic.api.errors.LithicException
import com.lithic.api.errors.NotFoundException
import com.lithic.api.errors.PermissionDeniedException
import com.lithic.api.errors.RateLimitException
import com.lithic.api.errors.UnauthorizedException
import com.lithic.api.errors.UnexpectedStatusCodeException
import com.lithic.api.errors.UnprocessableEntityException
import com.lithic.api.models.CardCreateParams
import com.lithic.api.models.Carrier
import com.lithic.api.models.ShippingAddress
import com.lithic.api.models.SpendLimitDuration
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@WireMockTest
internal class ErrorHandlingTest {

    companion object {

        private val ERROR: LithicError =
            LithicError.builder()
                .putAdditionalProperty("errorProperty", JsonValue.from("42"))
                .build()

        private val ERROR_JSON: ByteArray = jsonMapper().writeValueAsBytes(ERROR)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: LithicClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            LithicOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My Lithic API Key")
                .build()
    }

    @Test
    fun cardsCreate400() {
        val cardService = client.cards()
        stubFor(
            post(anyUrl())
                .willReturn(status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<BadRequestException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun cardsCreate401() {
        val cardService = client.cards()
        stubFor(
            post(anyUrl())
                .willReturn(status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<UnauthorizedException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun cardsCreate403() {
        val cardService = client.cards()
        stubFor(
            post(anyUrl())
                .willReturn(status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun cardsCreate404() {
        val cardService = client.cards()
        stubFor(
            post(anyUrl())
                .willReturn(status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<NotFoundException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun cardsCreate422() {
        val cardService = client.cards()
        stubFor(
            post(anyUrl())
                .willReturn(status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun cardsCreate429() {
        val cardService = client.cards()
        stubFor(
            post(anyUrl())
                .willReturn(status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<RateLimitException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun cardsCreate500() {
        val cardService = client.cards()
        stubFor(
            post(anyUrl())
                .willReturn(status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<InternalServerException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun cardsCreate999() {
        val cardService = client.cards()
        stubFor(
            post(anyUrl())
                .willReturn(status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun cardsCreateInvalidJsonBody() {
        val cardService = client.cards()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<LithicException> {
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
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
