package com.lithic.api.core.http;

import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import com.lithic.api.client.okhttp.OkHttpClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions.assertThat;
import org.assertj.core.api.Assertions.assertThatThrownBy;
import com.github.tomakehurst.wiremock.stubbing.Scenario
import com.github.tomakehurst.wiremock.client.WireMock.*;


@WireMockTest
internal class RetryingHttpClientTest {
    private var client: HttpClient? = null
    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client = OkHttpClient.builder()
            .baseUrl(wmRuntimeInfo.httpBaseUrl)
            .build()
        resetAllScenarios()
    }

    @Test
    @Throws(Exception::class)
    fun byDefaultShouldNotAddIdempotencyHeaderToRequest() {
        val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegment("something")
            .build()
        stubFor(
            post(urlPathEqualTo("/something"))
                .willReturn(ok())
        )
        val retryingClient = RetryingHttpClient.builder()
            .delegate(client!!)
            .build()
        val response = retryingClient.execute(request)
        assertThat(response.statusCode()).isEqualTo(200)
        verify(1, postRequestedFor(urlPathEqualTo("/something")))
    }

    @Test
    @Throws(Exception::class)
    fun whenProvidedShouldAddIdempotencyHeaderToRequest() {
        val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegment("something")
            .build()
        stubFor(
            post(urlPathEqualTo("/something"))
                .withHeader("X-Some-Header", matching("stainless-java-retry-.+"))
                .willReturn(ok())
        )
        val retryingClient = RetryingHttpClient.builder()
            .delegate(client!!)
            .idempotencyHeader("X-Some-Header")
            .build()
        val response = retryingClient.execute(request)
        assertThat(response.statusCode()).isEqualTo(200)
        verify(1, postRequestedFor(urlPathEqualTo("/something")))
    }

    @Test
    @Throws(Exception::class)
    fun retryAfterHeader() {
        val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegment("something")
            .build()
        stubFor(
            post(urlPathEqualTo("/something"))
                .inScenario("foo") // first we fail with a retry after header given as a date
                .whenScenarioStateIs(Scenario.STARTED)
                .willReturn(serviceUnavailable().withHeader("Retry-After", "Wed, 21 Oct 2015 07:28:00 GMT"))
                .willSetStateTo("RETRY_AFTER_DATE")
        )
        stubFor(
            post(urlPathEqualTo("/something"))
                .inScenario("foo") // then we fail with a retry after header given as a delay
                .whenScenarioStateIs("RETRY_AFTER_DATE")
                .willReturn(serviceUnavailable().withHeader("Retry-After", "1.234"))
                .willSetStateTo("RETRY_AFTER_DELAY")
        )
        stubFor(
            post(urlPathEqualTo("/something"))
                .inScenario("foo") // then we return a success
                .whenScenarioStateIs("RETRY_AFTER_DELAY")
                .willReturn(ok())
                .willSetStateTo("COMPLETED")
        )
        val retryingClient = RetryingHttpClient.builder()
            .delegate(client!!)
            .build()
        val response = retryingClient.execute(request)
        assertThat(response.statusCode()).isEqualTo(200)
        verify(3, postRequestedFor(urlPathEqualTo("/something")))
    }
}
