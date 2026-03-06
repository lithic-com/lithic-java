// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HoldCreateParamsTest {

    @Test
    fun create() {
        HoldCreateParams.builder()
            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .amount(1L)
            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .expirationDatetime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .memo("memo")
            .userDefinedId("user_defined_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            HoldCreateParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(1L)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            HoldCreateParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(1L)
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expirationDatetime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .memo("memo")
                .userDefinedId("user_defined_id")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1L)
        assertThat(body.token()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.expirationDatetime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.memo()).contains("memo")
        assertThat(body.userDefinedId()).contains("user_defined_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            HoldCreateParams.builder()
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(1L)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1L)
    }
}
