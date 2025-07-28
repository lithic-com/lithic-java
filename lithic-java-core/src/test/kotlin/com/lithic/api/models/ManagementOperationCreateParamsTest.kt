// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManagementOperationCreateParamsTest {

    @Test
    fun create() {
        ManagementOperationCreateParams.builder()
            .amount(1L)
            .category(ManagementOperationCreateParams.ManagementOperationCategory.MANAGEMENT_FEE)
            .direction(ManagementOperationCreateParams.ManagementOperationDirection.CREDIT)
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .eventType(ManagementOperationCreateParams.ManagementOperationEventType.LOSS_WRITE_OFF)
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .memo("memo")
            .onClosedAccount(ManagementOperationCreateParams.OnClosedAccount.FAIL)
            .subtype("subtype")
            .userDefinedId("user_defined_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            ManagementOperationCreateParams.builder()
                .amount(1L)
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
                .onClosedAccount(ManagementOperationCreateParams.OnClosedAccount.FAIL)
                .subtype("subtype")
                .userDefinedId("user_defined_id")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1L)
        assertThat(body.category())
            .isEqualTo(ManagementOperationCreateParams.ManagementOperationCategory.MANAGEMENT_FEE)
        assertThat(body.direction())
            .isEqualTo(ManagementOperationCreateParams.ManagementOperationDirection.CREDIT)
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.eventType())
            .isEqualTo(ManagementOperationCreateParams.ManagementOperationEventType.LOSS_WRITE_OFF)
        assertThat(body.financialAccountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.token()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.memo()).contains("memo")
        assertThat(body.onClosedAccount())
            .contains(ManagementOperationCreateParams.OnClosedAccount.FAIL)
        assertThat(body.subtype()).contains("subtype")
        assertThat(body.userDefinedId()).contains("user_defined_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ManagementOperationCreateParams.builder()
                .amount(1L)
                .category(
                    ManagementOperationCreateParams.ManagementOperationCategory.MANAGEMENT_FEE
                )
                .direction(ManagementOperationCreateParams.ManagementOperationDirection.CREDIT)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .eventType(
                    ManagementOperationCreateParams.ManagementOperationEventType.LOSS_WRITE_OFF
                )
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1L)
        assertThat(body.category())
            .isEqualTo(ManagementOperationCreateParams.ManagementOperationCategory.MANAGEMENT_FEE)
        assertThat(body.direction())
            .isEqualTo(ManagementOperationCreateParams.ManagementOperationDirection.CREDIT)
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.eventType())
            .isEqualTo(ManagementOperationCreateParams.ManagementOperationEventType.LOSS_WRITE_OFF)
        assertThat(body.financialAccountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
