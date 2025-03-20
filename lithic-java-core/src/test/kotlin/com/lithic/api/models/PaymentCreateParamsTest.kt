// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentCreateParamsTest {

    @Test
    fun create() {
        PaymentCreateParams.builder()
            .amount(1L)
            .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .method(PaymentCreateParams.Method.ACH_NEXT_DAY)
            .methodAttributes(
                PaymentCreateParams.PaymentMethodRequestAttributes.builder()
                    .secCode(PaymentCreateParams.PaymentMethodRequestAttributes.SecCode.CCD)
                    .build()
            )
            .type(PaymentCreateParams.Type.COLLECTION)
            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .memo("memo")
            .userDefinedId("user_defined_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            PaymentCreateParams.builder()
                .amount(1L)
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .method(PaymentCreateParams.Method.ACH_NEXT_DAY)
                .methodAttributes(
                    PaymentCreateParams.PaymentMethodRequestAttributes.builder()
                        .secCode(PaymentCreateParams.PaymentMethodRequestAttributes.SecCode.CCD)
                        .build()
                )
                .type(PaymentCreateParams.Type.COLLECTION)
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .memo("memo")
                .userDefinedId("user_defined_id")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1L)
        assertThat(body.externalBankAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.financialAccountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.method()).isEqualTo(PaymentCreateParams.Method.ACH_NEXT_DAY)
        assertThat(body.methodAttributes())
            .isEqualTo(
                PaymentCreateParams.PaymentMethodRequestAttributes.builder()
                    .secCode(PaymentCreateParams.PaymentMethodRequestAttributes.SecCode.CCD)
                    .build()
            )
        assertThat(body.type()).isEqualTo(PaymentCreateParams.Type.COLLECTION)
        assertThat(body.token()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.memo()).contains("memo")
        assertThat(body.userDefinedId()).contains("user_defined_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentCreateParams.builder()
                .amount(1L)
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .method(PaymentCreateParams.Method.ACH_NEXT_DAY)
                .methodAttributes(
                    PaymentCreateParams.PaymentMethodRequestAttributes.builder()
                        .secCode(PaymentCreateParams.PaymentMethodRequestAttributes.SecCode.CCD)
                        .build()
                )
                .type(PaymentCreateParams.Type.COLLECTION)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1L)
        assertThat(body.externalBankAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.financialAccountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.method()).isEqualTo(PaymentCreateParams.Method.ACH_NEXT_DAY)
        assertThat(body.methodAttributes())
            .isEqualTo(
                PaymentCreateParams.PaymentMethodRequestAttributes.builder()
                    .secCode(PaymentCreateParams.PaymentMethodRequestAttributes.SecCode.CCD)
                    .build()
            )
        assertThat(body.type()).isEqualTo(PaymentCreateParams.Type.COLLECTION)
    }
}
