// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalPaymentCreateParamsTest {

    @Test
    fun createExternalPaymentCreateParams() {
        ExternalPaymentCreateParams.builder()
            .amount(0L)
            .category(ExternalPaymentCreateParams.ExternalPaymentCategory.EXTERNAL_WIRE)
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .paymentType(ExternalPaymentCreateParams.ExternalPaymentDirection.DEPOSIT)
            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .memo("memo")
            .progressTo(ExternalPaymentCreateParams.ExternalPaymentProgressTo.SETTLED)
            .userDefinedId("user_defined_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExternalPaymentCreateParams.builder()
                .amount(0L)
                .category(ExternalPaymentCreateParams.ExternalPaymentCategory.EXTERNAL_WIRE)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentType(ExternalPaymentCreateParams.ExternalPaymentDirection.DEPOSIT)
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .memo("memo")
                .progressTo(ExternalPaymentCreateParams.ExternalPaymentProgressTo.SETTLED)
                .userDefinedId("user_defined_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.category())
            .isEqualTo(ExternalPaymentCreateParams.ExternalPaymentCategory.EXTERNAL_WIRE)
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.financialAccountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.paymentType())
            .isEqualTo(ExternalPaymentCreateParams.ExternalPaymentDirection.DEPOSIT)
        assertThat(body.token()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.memo()).contains("memo")
        assertThat(body.progressTo())
            .contains(ExternalPaymentCreateParams.ExternalPaymentProgressTo.SETTLED)
        assertThat(body.userDefinedId()).contains("user_defined_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ExternalPaymentCreateParams.builder()
                .amount(0L)
                .category(ExternalPaymentCreateParams.ExternalPaymentCategory.EXTERNAL_WIRE)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentType(ExternalPaymentCreateParams.ExternalPaymentDirection.DEPOSIT)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.category())
            .isEqualTo(ExternalPaymentCreateParams.ExternalPaymentCategory.EXTERNAL_WIRE)
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.financialAccountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.paymentType())
            .isEqualTo(ExternalPaymentCreateParams.ExternalPaymentDirection.DEPOSIT)
    }
}
