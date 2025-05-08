// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.ManagementOperationCreateParams
import com.lithic.api.models.ManagementOperationReverseParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ManagementOperationServiceTest {

    @Test
    fun create() {
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
                        ManagementOperationCreateParams.ManagementOperationEventType.LOSS_WRITE_OFF
                    )
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .memo("memo")
                    .subtype("subtype")
                    .userDefinedId("user_defined_id")
                    .build()
            )

        managementOperationTransaction.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val managementOperationService = client.managementOperations()

        val managementOperationTransaction =
            managementOperationService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        managementOperationTransaction.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val managementOperationService = client.managementOperations()

        val page = managementOperationService.list()

        page.response().validate()
    }

    @Test
    fun reverse() {
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

        managementOperationTransaction.validate()
    }
}
