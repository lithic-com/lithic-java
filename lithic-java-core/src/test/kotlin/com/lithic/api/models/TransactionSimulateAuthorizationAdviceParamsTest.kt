// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionSimulateAuthorizationAdviceParamsTest {

    @Test
    fun create() {
        TransactionSimulateAuthorizationAdviceParams.builder()
            .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
            .amount(3831L)
            .build()
    }

    @Test
    fun body() {
        val params =
            TransactionSimulateAuthorizationAdviceParams.builder()
                .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                .amount(3831L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.token()).isEqualTo("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
        assertThat(body.amount()).isEqualTo(3831L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransactionSimulateAuthorizationAdviceParams.builder()
                .token("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
                .amount(3831L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.token()).isEqualTo("fabd829d-7f7b-4432-a8f2-07ea4889aaac")
        assertThat(body.amount()).isEqualTo(3831L)
    }
}
