// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import com.lithic.api.models.ManagementOperationListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ManagementOperationServiceTest {

    @Test
    fun callCreate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val managementOperationService = client.managementOperations()
        val managementOperationTransaction =
            managementOperationService.create(
                ManagementOperationCreateParams.builder()
                    .amount(0L)
                    .category(
                        ManagementOperationCreateParams.ManagementOperationCategory.MANAGEMENT_FEE
                    )
                    .direction(ManagementOperationCreateParams.ManagementOperationDirection.CREDIT)
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .eventType(
                        ManagementOperationCreateParams.ManagementOperationEventType.CASH_BACK
                    )
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("memo")
                    .subtype("subtype")
                    .userDefinedId("user_defined_id")
                    .build()
            )
        println(managementOperationTransaction)
        managementOperationTransaction.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val managementOperationService = client.managementOperations()
        val managementOperationTransaction =
            managementOperationService.retrieve(
                ManagementOperationRetrieveParams.builder()
                    .managementOperationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(managementOperationTransaction)
        managementOperationTransaction.validate()
    }

    @Test
    fun callList() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val managementOperationService = client.managementOperations()
        val managementOperationTransactionsResponse =
            managementOperationService.list(ManagementOperationListParams.builder().build())
        println(managementOperationTransactionsResponse)
        managementOperationTransactionsResponse.data().forEach { it.validate() }
    }

    @Test
    fun callReverse() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val managementOperationService = client.managementOperations()
        val managementOperationTransaction =
            managementOperationService.reverse(
                ManagementOperationReverseParams.builder()
                    .managementOperationToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .memo("memo")
                    .build()
            )
        println(managementOperationTransaction)
        managementOperationTransaction.validate()
    }
}