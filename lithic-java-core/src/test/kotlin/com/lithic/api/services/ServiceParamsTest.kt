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
import com.google.common.collect.ArrayListMultimap
import com.lithic.api.client.okhttp.LithicClient
import com.lithic.api.core.JsonString
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import com.lithic.api.models.*
import com.lithic.api.models.CardListPage
import com.lithic.api.models.CardListParams
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
            LithicClient.builder().apiKey(API_KEY).baseUrl(wmRuntimeInfo.getHttpBaseUrl()).build()
    }

    @Test
    fun cardsCreateWithAdditionalParams() {
        val additionalHeaders = ArrayListMultimap.create<String, String>()

        additionalHeaders.put("x-test-header", "abc1234")

        val additionalQueryParams = ArrayListMultimap.create<String, String>()

        additionalQueryParams.put("test_query_param", "def567")

        val additionalBodyProperties = mutableMapOf<String, JsonValue>()

        additionalBodyProperties.put("testBodyProperty", JsonString.of("ghi890"))

        val params =
            CardCreateParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardProgramToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .fundingToken("ecbd1d58-0299-48b3-84da-6ed7f5bf9ec1")
                .memo("New Card")
                .spendLimit(123L)
                .spendLimitDuration(CardCreateParams.SpendLimitDuration.ANNUALLY)
                .state(CardCreateParams.State.OPEN)
                .type(CardCreateParams.Type.VIRTUAL)
                .pin("string")
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .productId("1")
                .shippingAddress(
                    ShippingAddress.builder()
                        .firstName("Michael")
                        .lastName("Bluth")
                        .line2Text("The Bluth Company")
                        .address1("5 Broad Street")
                        .address2("Unit 25A")
                        .city("NEW YORK")
                        .state("NY")
                        .postalCode("10001-1809")
                        .country("USA")
                        .email("johnny@appleseed.com")
                        .phoneNumber("+12124007676")
                        .build()
                )
                .shippingMethod(CardCreateParams.ShippingMethod.STANDARD)
                .additionalHeaders(additionalHeaders)
                .additionalBodyProperties(additionalBodyProperties)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            Card.builder()
                .created("2021-06-28T22:53:15Z")
                .cvv("776")
                .funding(
                    FundingSource.builder()
                        .accountName("string")
                        .created("2019-12-27T18:11:19.117Z")
                        .lastFour("xxxx")
                        .nickname("x")
                        .state(FundingSource.State.ENABLED)
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .type(FundingSource.Type.DEPOSITORY_CHECKING)
                        .build()
                )
                .expMonth("06")
                .expYear("2027")
                .hostname("string")
                .lastFour("xxxx")
                .memo("New Card")
                .pan("4111111289144142")
                .spendLimit(123L)
                .spendLimitDuration(Card.SpendLimitDuration.ANNUALLY)
                .state(Card.State.CLOSED)
                .authRuleTokens(listOf("string"))
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .type(Card.Type.VIRTUAL)
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
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
        val additionalHeaders = ArrayListMultimap.create<String, String>()

        additionalHeaders.put("x-test-header", "abc1234")

        val additionalQueryParams = ArrayListMultimap.create<String, String>()

        additionalQueryParams.put("test_query_param", "def567")

        val params =
            CardListParams.builder()
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .begin("2019-12-27T18:11:19.117Z")
                .end("2019-12-27T18:11:19.117Z")
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
                            .created("2021-06-28T22:53:15Z")
                            .cvv("776")
                            .funding(
                                FundingSource.builder()
                                    .accountName("string")
                                    .created("2019-12-27T18:11:19.117Z")
                                    .lastFour("xxxx")
                                    .nickname("x")
                                    .state(FundingSource.State.ENABLED)
                                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .type(FundingSource.Type.DEPOSITORY_CHECKING)
                                    .build()
                            )
                            .expMonth("06")
                            .expYear("2027")
                            .hostname("string")
                            .lastFour("xxxx")
                            .memo("New Card")
                            .pan("4111111289144142")
                            .spendLimit(123L)
                            .spendLimitDuration(Card.SpendLimitDuration.ANNUALLY)
                            .state(Card.State.CLOSED)
                            .authRuleTokens(listOf("string"))
                            .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                            .type(Card.Type.VIRTUAL)
                            .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
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
