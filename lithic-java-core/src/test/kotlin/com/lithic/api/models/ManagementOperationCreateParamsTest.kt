// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ManagementOperationCreateParamsTest {

    @Test
    fun createManagementOperationCreateParams() {
        ManagementOperationCreateParams.builder()
            .amount(0L)
            .category(ManagementOperationCreateParams.ManagementOperationCategory.MANAGEMENT_FEE)
            .direction(ManagementOperationCreateParams.ManagementOperationDirection.CREDIT)
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .eventType(ManagementOperationCreateParams.ManagementOperationEventType.CASH_BACK)
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .memo("memo")
            .subtype("subtype")
            .userDefinedId("user_defined_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ManagementOperationCreateParams.builder()
                .amount(0L)
                .category(
                    ManagementOperationCreateParams.ManagementOperationCategory.MANAGEMENT_FEE
                )
                .direction(ManagementOperationCreateParams.ManagementOperationDirection.CREDIT)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .eventType(ManagementOperationCreateParams.ManagementOperationEventType.CASH_BACK)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .memo("memo")
                .subtype("subtype")
                .userDefinedId("user_defined_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.category())
            .isEqualTo(ManagementOperationCreateParams.ManagementOperationCategory.MANAGEMENT_FEE)
        assertThat(body.direction())
            .isEqualTo(ManagementOperationCreateParams.ManagementOperationDirection.CREDIT)
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.eventType())
            .isEqualTo(ManagementOperationCreateParams.ManagementOperationEventType.CASH_BACK)
        assertThat(body.financialAccountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.memo()).isEqualTo("memo")
        assertThat(body.subtype()).isEqualTo("subtype")
        assertThat(body.userDefinedId()).isEqualTo("user_defined_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ManagementOperationCreateParams.builder()
                .amount(0L)
                .category(
                    ManagementOperationCreateParams.ManagementOperationCategory.MANAGEMENT_FEE
                )
                .direction(ManagementOperationCreateParams.ManagementOperationDirection.CREDIT)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .eventType(ManagementOperationCreateParams.ManagementOperationEventType.CASH_BACK)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.category())
            .isEqualTo(ManagementOperationCreateParams.ManagementOperationCategory.MANAGEMENT_FEE)
        assertThat(body.direction())
            .isEqualTo(ManagementOperationCreateParams.ManagementOperationDirection.CREDIT)
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.eventType())
            .isEqualTo(ManagementOperationCreateParams.ManagementOperationEventType.CASH_BACK)
        assertThat(body.financialAccountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
