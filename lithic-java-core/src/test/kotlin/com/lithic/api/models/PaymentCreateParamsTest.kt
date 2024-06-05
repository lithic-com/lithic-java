// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentCreateParamsTest {

    @Test
    fun createPaymentCreateParams() {
        PaymentCreateParams.builder()
            .amount(123L)
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
            .memo("string")
            .userDefinedId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PaymentCreateParams.builder()
                .amount(123L)
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
                .memo("string")
                .userDefinedId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
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
        assertThat(body.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.memo()).isEqualTo("string")
        assertThat(body.userDefinedId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PaymentCreateParams.builder()
                .amount(123L)
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
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
