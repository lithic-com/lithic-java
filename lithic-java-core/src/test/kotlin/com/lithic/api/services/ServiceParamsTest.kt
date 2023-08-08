package com.lithic.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.lithic.api.client.LithicClient
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.core.JsonString
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import com.lithic.api.models.*
import com.lithic.api.models.CardListPage
import com.lithic.api.models.CardListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val API_KEY: String = "apiKey"

    private lateinit var client: LithicClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            LithicOkHttpClient.builder()
                .apiKey(API_KEY)
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .webhookSecret("string")
                .build()
    }

    @Test
    fun cardsCreateWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val additionalBodyProperties = mutableMapOf<String, JsonValue>()

        additionalBodyProperties.put("testBodyProperty", JsonString.of("ghi890"))

        val params =
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
                .additionalHeaders(additionalHeaders)
                .additionalBodyProperties(additionalBodyProperties)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            Card.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    Card.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(Card.FundingAccount.State.ENABLED)
                        .type(Card.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("string")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .spendLimit(123L)
                .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                .state(Card.State.CLOSED)
                .type(Card.Type.VIRTUAL)
                .authRuleTokens(listOf("string"))
                .cvv("776")
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .hostname("string")
                .memo("New Card")
                .pan("4111111289144142")
                .build()

        stubFor(
            post(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .withRequestBody(matchingJsonPath("$.testBodyProperty", equalTo("ghi890")))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.cards().create(params)

        verify(postRequestedFor(anyUrl()))
    }

    @Test
    fun cardsListWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val params =
            CardListParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .state(CardListParams.State.OPEN)
                .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .page(123L)
                .pageSize(123L)
                .additionalHeaders(additionalHeaders)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            CardListPage.Response.builder()
                .data(
                    listOf(
                        Card.builder()
                            .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                            .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                            .funding(
                                Card.FundingAccount.builder()
                                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .lastFour("xxxx")
                                    .state(Card.FundingAccount.State.ENABLED)
                                    .type(Card.FundingAccount.Type.DEPOSITORY_CHECKING)
                                    .accountName("string")
                                    .nickname("x")
                                    .build()
                            )
                            .lastFour("xxxx")
                            .spendLimit(123L)
                            .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                            .state(Card.State.CLOSED)
                            .type(Card.Type.VIRTUAL)
                            .authRuleTokens(listOf("string"))
                            .cvv("776")
                            .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                            .expMonth("06")
                            .expYear("2027")
                            .hostname("string")
                            .memo("New Card")
                            .pan("4111111289144142")
                            .build()
                    )
                )
                .page(123L)
                .totalEntries(123L)
                .totalPages(123L)
                .build()

        stubFor(
            get(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.cards().list(params)

        verify(getRequestedFor(anyUrl()))
    }
}
