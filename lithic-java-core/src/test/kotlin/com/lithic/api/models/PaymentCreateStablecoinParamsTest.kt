// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentCreateStablecoinParamsTest {

    @Test
    fun create() {
        PaymentCreateStablecoinParams.builder()
            .amount(1588L)
            .blockchainRecipientToken("1e3fdb71-4b52-4a30-a7a9-52c85e26a1d9")
            .financialAccountToken("35b0c466-a3e3-519a-9549-ead6a6a2277d")
            .type(PaymentCreateStablecoinParams.Type.PAYMENT)
            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .hold(
                PaymentCreateStablecoinParams.Hold.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .memo("Vendor payout")
            .build()
    }

    @Test
    fun body() {
        val params =
            PaymentCreateStablecoinParams.builder()
                .amount(1588L)
                .blockchainRecipientToken("1e3fdb71-4b52-4a30-a7a9-52c85e26a1d9")
                .financialAccountToken("35b0c466-a3e3-519a-9549-ead6a6a2277d")
                .type(PaymentCreateStablecoinParams.Type.PAYMENT)
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .hold(
                    PaymentCreateStablecoinParams.Hold.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .memo("Vendor payout")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1588L)
        assertThat(body.blockchainRecipientToken())
            .isEqualTo("1e3fdb71-4b52-4a30-a7a9-52c85e26a1d9")
        assertThat(body.financialAccountToken()).isEqualTo("35b0c466-a3e3-519a-9549-ead6a6a2277d")
        assertThat(body.type()).isEqualTo(PaymentCreateStablecoinParams.Type.PAYMENT)
        assertThat(body.token()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.hold())
            .contains(
                PaymentCreateStablecoinParams.Hold.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.memo()).contains("Vendor payout")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentCreateStablecoinParams.builder()
                .amount(1588L)
                .blockchainRecipientToken("1e3fdb71-4b52-4a30-a7a9-52c85e26a1d9")
                .financialAccountToken("35b0c466-a3e3-519a-9549-ead6a6a2277d")
                .type(PaymentCreateStablecoinParams.Type.PAYMENT)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1588L)
        assertThat(body.blockchainRecipientToken())
            .isEqualTo("1e3fdb71-4b52-4a30-a7a9-52c85e26a1d9")
        assertThat(body.financialAccountToken()).isEqualTo("35b0c466-a3e3-519a-9549-ead6a6a2277d")
        assertThat(body.type()).isEqualTo(PaymentCreateStablecoinParams.Type.PAYMENT)
    }
}
