// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.authRules.v2

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.AuthRuleV2BacktestCreateParams
import com.lithic.api.models.AuthRuleV2BacktestRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BacktestServiceAsyncTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val backtestServiceAsync = client.authRules().v2().backtests()

        val backtestFuture =
            backtestServiceAsync.create(
                AuthRuleV2BacktestCreateParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val backtest = backtestFuture.get()
        backtest.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val backtestServiceAsync = client.authRules().v2().backtests()

        val backtestResultsFuture =
            backtestServiceAsync.retrieve(
                AuthRuleV2BacktestRetrieveParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .authRuleBacktestToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val backtestResults = backtestResultsFuture.get()
        backtestResults.validate()
    }
}
