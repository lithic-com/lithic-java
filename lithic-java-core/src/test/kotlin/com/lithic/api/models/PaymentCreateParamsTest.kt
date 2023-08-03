package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentCreateParamsTest {

    @Test
    fun createPaymentCreateParams() {
        PaymentCreateParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .type(PaymentCreateParams.Type.PAYMENT)
            .amount(123L)
            .memo("string")
            .methodAttributes(
                PaymentCreateParams.PaymentMethodAttributes.builder()
                    .secCode(PaymentCreateParams.PaymentMethodAttributes.SecCode.PPD)
                    .build()
            )
            .method(PaymentCreateParams.Method.ACH_NEXT_DAY)
            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .userDefinedId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PaymentCreateParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(PaymentCreateParams.Type.PAYMENT)
                .amount(123L)
                .memo("string")
                .methodAttributes(
                    PaymentCreateParams.PaymentMethodAttributes.builder()
                        .secCode(PaymentCreateParams.PaymentMethodAttributes.SecCode.PPD)
                        .build()
                )
                .method(PaymentCreateParams.Method.ACH_NEXT_DAY)
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userDefinedId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.financialAccountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.externalBankAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.type()).isEqualTo(PaymentCreateParams.Type.PAYMENT)
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.memo()).isEqualTo("string")
        assertThat(body.methodAttributes())
            .isEqualTo(
                PaymentCreateParams.PaymentMethodAttributes.builder()
                    .secCode(PaymentCreateParams.PaymentMethodAttributes.SecCode.PPD)
                    .build()
            )
        assertThat(body.method()).isEqualTo(PaymentCreateParams.Method.ACH_NEXT_DAY)
        assertThat(body.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.userDefinedId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PaymentCreateParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(PaymentCreateParams.Type.PAYMENT)
                .amount(123L)
                .methodAttributes(
                    PaymentCreateParams.PaymentMethodAttributes.builder()
                        .secCode(PaymentCreateParams.PaymentMethodAttributes.SecCode.PPD)
                        .build()
                )
                .method(PaymentCreateParams.Method.ACH_NEXT_DAY)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.financialAccountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.externalBankAccountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.type()).isEqualTo(PaymentCreateParams.Type.PAYMENT)
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.methodAttributes())
            .isEqualTo(
                PaymentCreateParams.PaymentMethodAttributes.builder()
                    .secCode(PaymentCreateParams.PaymentMethodAttributes.SecCode.PPD)
                    .build()
            )
        assertThat(body.method()).isEqualTo(PaymentCreateParams.Method.ACH_NEXT_DAY)
    }
}
