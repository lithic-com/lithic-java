// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.core.JsonValue
import com.lithic.api.models.FinancialAccountInterestTierScheduleCreateParams
import com.lithic.api.models.FinancialAccountInterestTierScheduleDeleteParams
import com.lithic.api.models.FinancialAccountInterestTierScheduleRetrieveParams
import com.lithic.api.models.FinancialAccountInterestTierScheduleUpdateParams
import com.lithic.api.models.InterestTierSchedule
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InterestTierScheduleServiceAsyncTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val interestTierScheduleServiceAsync = client.financialAccounts().interestTierSchedule()

        val interestTierScheduleFuture =
            interestTierScheduleServiceAsync.create(
                FinancialAccountInterestTierScheduleCreateParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .interestTierSchedule(
                        InterestTierSchedule.builder()
                            .creditProductToken("credit_product_token")
                            .effectiveDate(LocalDate.parse("2019-12-27"))
                            .tierName("tier_name")
                            .tierRates(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        val interestTierSchedule = interestTierScheduleFuture.get()
        interestTierSchedule.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val interestTierScheduleServiceAsync = client.financialAccounts().interestTierSchedule()

        val interestTierScheduleFuture =
            interestTierScheduleServiceAsync.retrieve(
                FinancialAccountInterestTierScheduleRetrieveParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .build()
            )

        val interestTierSchedule = interestTierScheduleFuture.get()
        interestTierSchedule.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val interestTierScheduleServiceAsync = client.financialAccounts().interestTierSchedule()

        val interestTierScheduleFuture =
            interestTierScheduleServiceAsync.update(
                FinancialAccountInterestTierScheduleUpdateParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .tierName("tier_name")
                    .tierRates(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        val interestTierSchedule = interestTierScheduleFuture.get()
        interestTierSchedule.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val interestTierScheduleServiceAsync = client.financialAccounts().interestTierSchedule()

        val pageFuture =
            interestTierScheduleServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val interestTierScheduleServiceAsync = client.financialAccounts().interestTierSchedule()

        val future =
            interestTierScheduleServiceAsync.delete(
                FinancialAccountInterestTierScheduleDeleteParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .build()
            )

        val response = future.get()
    }
}
