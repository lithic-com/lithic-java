// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.google.common.collect.ImmutableListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.client.LithicClient
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.core.JsonString
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
import com.lithic.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.assertj.guava.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val LITHIC_ERROR: LithicError =
        LithicError.builder().putAdditionalProperty("key", JsonString.of("value")).build()

    private lateinit var client: LithicClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            LithicOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .apiKey("My Lithic API Key")
                .webhookSecret("My Webhook Secret")
                .build()
    }

    @Test
    fun cardsCreate200() {
        val params =
            CardCreateParams.builder()
                .type(CardCreateParams.Type.MERCHANT_LOCKED)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardProgramToken("00000000-0000-0000-1000-000000000000")
                .carrier(Carrier.builder().qrCodeUrl("string").build())
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .memo("New Card")
                .pin("string")
                .productId("1")
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
                        .phoneNumber("+12124007676")
                        .build()
                )
                .shippingMethod(CardCreateParams.ShippingMethod._2_DAY)
                .spendLimit(123L)
                .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                .state(CardCreateParams.State.OPEN)
                .build()

        val expected =
            Card.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    Card.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(Card.FundingAccount.State.DELETED)
                        .type(Card.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("string")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .spendLimit(123L)
                .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                .state(Card.State.CLOSED)
                .type(Card.Type.MERCHANT_LOCKED)
                .authRuleTokens(listOf("string"))
                .cvv("776")
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .hostname("string")
                .memo("New Card")
                .pan("4111111289144142")
                .build()

        stubFor(post(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.cards().create(params)).isEqualTo(expected)
    }

    @Test
    fun cardsCreate400() {
        val params =
            CardCreateParams.builder()
                .type(CardCreateParams.Type.MERCHANT_LOCKED)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardProgramToken("00000000-0000-0000-1000-000000000000")
                .carrier(Carrier.builder().qrCodeUrl("string").build())
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .memo("New Card")
                .pin("string")
                .productId("1")
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
                        .phoneNumber("+12124007676")
                        .build()
                )
                .shippingMethod(CardCreateParams.ShippingMethod._2_DAY)
                .spendLimit(123L)
                .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                .state(CardCreateParams.State.OPEN)
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(LITHIC_ERROR)))
        )

        assertThatThrownBy({ client.cards().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of("Foo", "Bar"), LITHIC_ERROR)
            })
    }

    @Test
    fun cardsCreate401() {
        val params =
            CardCreateParams.builder()
                .type(CardCreateParams.Type.MERCHANT_LOCKED)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardProgramToken("00000000-0000-0000-1000-000000000000")
                .carrier(Carrier.builder().qrCodeUrl("string").build())
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .memo("New Card")
                .pin("string")
                .productId("1")
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
                        .phoneNumber("+12124007676")
                        .build()
                )
                .shippingMethod(CardCreateParams.ShippingMethod._2_DAY)
                .spendLimit(123L)
                .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                .state(CardCreateParams.State.OPEN)
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(LITHIC_ERROR)))
        )

        assertThatThrownBy({ client.cards().create(params) })
            .satisfies({ e ->
                assertUnauthorized(e, ImmutableListMultimap.of("Foo", "Bar"), LITHIC_ERROR)
            })
    }

    @Test
    fun cardsCreate403() {
        val params =
            CardCreateParams.builder()
                .type(CardCreateParams.Type.MERCHANT_LOCKED)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardProgramToken("00000000-0000-0000-1000-000000000000")
                .carrier(Carrier.builder().qrCodeUrl("string").build())
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .memo("New Card")
                .pin("string")
                .productId("1")
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
                        .phoneNumber("+12124007676")
                        .build()
                )
                .shippingMethod(CardCreateParams.ShippingMethod._2_DAY)
                .spendLimit(123L)
                .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                .state(CardCreateParams.State.OPEN)
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(LITHIC_ERROR)))
        )

        assertThatThrownBy({ client.cards().create(params) })
            .satisfies({ e ->
                assertPermissionDenied(e, ImmutableListMultimap.of("Foo", "Bar"), LITHIC_ERROR)
            })
    }

    @Test
    fun cardsCreate404() {
        val params =
            CardCreateParams.builder()
                .type(CardCreateParams.Type.MERCHANT_LOCKED)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardProgramToken("00000000-0000-0000-1000-000000000000")
                .carrier(Carrier.builder().qrCodeUrl("string").build())
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .memo("New Card")
                .pin("string")
                .productId("1")
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
                        .phoneNumber("+12124007676")
                        .build()
                )
                .shippingMethod(CardCreateParams.ShippingMethod._2_DAY)
                .spendLimit(123L)
                .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                .state(CardCreateParams.State.OPEN)
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(LITHIC_ERROR)))
        )

        assertThatThrownBy({ client.cards().create(params) })
            .satisfies({ e ->
                assertNotFound(e, ImmutableListMultimap.of("Foo", "Bar"), LITHIC_ERROR)
            })
    }

    @Test
    fun cardsCreate422() {
        val params =
            CardCreateParams.builder()
                .type(CardCreateParams.Type.MERCHANT_LOCKED)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardProgramToken("00000000-0000-0000-1000-000000000000")
                .carrier(Carrier.builder().qrCodeUrl("string").build())
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .memo("New Card")
                .pin("string")
                .productId("1")
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
                        .phoneNumber("+12124007676")
                        .build()
                )
                .shippingMethod(CardCreateParams.ShippingMethod._2_DAY)
                .spendLimit(123L)
                .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                .state(CardCreateParams.State.OPEN)
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(LITHIC_ERROR)))
        )

        assertThatThrownBy({ client.cards().create(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(e, ImmutableListMultimap.of("Foo", "Bar"), LITHIC_ERROR)
            })
    }

    @Test
    fun cardsCreate429() {
        val params =
            CardCreateParams.builder()
                .type(CardCreateParams.Type.MERCHANT_LOCKED)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardProgramToken("00000000-0000-0000-1000-000000000000")
                .carrier(Carrier.builder().qrCodeUrl("string").build())
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .memo("New Card")
                .pin("string")
                .productId("1")
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
                        .phoneNumber("+12124007676")
                        .build()
                )
                .shippingMethod(CardCreateParams.ShippingMethod._2_DAY)
                .spendLimit(123L)
                .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                .state(CardCreateParams.State.OPEN)
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(LITHIC_ERROR)))
        )

        assertThatThrownBy({ client.cards().create(params) })
            .satisfies({ e ->
                assertRateLimit(e, ImmutableListMultimap.of("Foo", "Bar"), LITHIC_ERROR)
            })
    }

    @Test
    fun cardsCreate500() {
        val params =
            CardCreateParams.builder()
                .type(CardCreateParams.Type.MERCHANT_LOCKED)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardProgramToken("00000000-0000-0000-1000-000000000000")
                .carrier(Carrier.builder().qrCodeUrl("string").build())
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .memo("New Card")
                .pin("string")
                .productId("1")
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
                        .phoneNumber("+12124007676")
                        .build()
                )
                .shippingMethod(CardCreateParams.ShippingMethod._2_DAY)
                .spendLimit(123L)
                .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                .state(CardCreateParams.State.OPEN)
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(LITHIC_ERROR)))
        )

        assertThatThrownBy({ client.cards().create(params) })
            .satisfies({ e ->
                assertInternalServer(e, ImmutableListMultimap.of("Foo", "Bar"), LITHIC_ERROR)
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params =
            CardCreateParams.builder()
                .type(CardCreateParams.Type.MERCHANT_LOCKED)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardProgramToken("00000000-0000-0000-1000-000000000000")
                .carrier(Carrier.builder().qrCodeUrl("string").build())
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .memo("New Card")
                .pin("string")
                .productId("1")
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
                        .phoneNumber("+12124007676")
                        .build()
                )
                .shippingMethod(CardCreateParams.ShippingMethod._2_DAY)
                .spendLimit(123L)
                .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                .state(CardCreateParams.State.OPEN)
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(999).withHeader("Foo", "Bar").withBody(toJson(LITHIC_ERROR)))
        )

        assertThatThrownBy({ client.cards().create(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    toJson(LITHIC_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
        val params =
            CardCreateParams.builder()
                .type(CardCreateParams.Type.MERCHANT_LOCKED)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardProgramToken("00000000-0000-0000-1000-000000000000")
                .carrier(Carrier.builder().qrCodeUrl("string").build())
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .memo("New Card")
                .pin("string")
                .productId("1")
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
                        .phoneNumber("+12124007676")
                        .build()
                )
                .shippingMethod(CardCreateParams.ShippingMethod._2_DAY)
                .spendLimit(123L)
                .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                .state(CardCreateParams.State.OPEN)
                .build()

        stubFor(post(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.cards().create(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(LithicException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
        val params =
            CardCreateParams.builder()
                .type(CardCreateParams.Type.MERCHANT_LOCKED)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardProgramToken("00000000-0000-0000-1000-000000000000")
                .carrier(Carrier.builder().qrCodeUrl("string").build())
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .memo("New Card")
                .pin("string")
                .productId("1")
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
                        .phoneNumber("+12124007676")
                        .build()
                )
                .shippingMethod(CardCreateParams.ShippingMethod._2_DAY)
                .spendLimit(123L)
                .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                .state(CardCreateParams.State.OPEN)
                .build()

        stubFor(post(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.cards().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of(), LithicError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: ListMultimap<String, String>,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertBadRequest(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LithicError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnauthorized(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LithicError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LithicError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertNotFound(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LithicError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LithicError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertRateLimit(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LithicError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertInternalServer(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: LithicError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }
}
