// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
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
internal class InterestTierScheduleServiceTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val interestTierScheduleService = client.financialAccounts().interestTierSchedule()

        val interestTierSchedule =
            interestTierScheduleService.create(
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

        interestTierSchedule.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val interestTierScheduleService = client.financialAccounts().interestTierSchedule()

        val interestTierSchedule =
            interestTierScheduleService.retrieve(
                FinancialAccountInterestTierScheduleRetrieveParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .build()
            )

        interestTierSchedule.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val interestTierScheduleService = client.financialAccounts().interestTierSchedule()

        val interestTierSchedule =
            interestTierScheduleService.update(
                FinancialAccountInterestTierScheduleUpdateParams.builder()
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .tierName("tier_name")
                    .tierRates(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        interestTierSchedule.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val interestTierScheduleService = client.financialAccounts().interestTierSchedule()

        val page = interestTierScheduleService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val interestTierScheduleService = client.financialAccounts().interestTierSchedule()

        interestTierScheduleService.delete(
            FinancialAccountInterestTierScheduleDeleteParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .build()
        )
    }
}
