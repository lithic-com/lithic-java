// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MerchantLockParametersTest {

    @Test
    fun create() {
        val merchantLockParameters =
            MerchantLockParameters.builder()
                .addMerchant(
                    MerchantLockParameters.Merchant.builder()
                        .comment("comment")
                        .descriptor("descriptor")
                        .merchantId("merchant_id")
                        .build()
                )
                .build()

        assertThat(merchantLockParameters.merchants())
            .containsExactly(
                MerchantLockParameters.Merchant.builder()
                    .comment("comment")
                    .descriptor("descriptor")
                    .merchantId("merchant_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val merchantLockParameters =
            MerchantLockParameters.builder()
                .addMerchant(
                    MerchantLockParameters.Merchant.builder()
                        .comment("comment")
                        .descriptor("descriptor")
                        .merchantId("merchant_id")
                        .build()
                )
                .build()

        val roundtrippedMerchantLockParameters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(merchantLockParameters),
                jacksonTypeRef<MerchantLockParameters>(),
            )

        assertThat(roundtrippedMerchantLockParameters).isEqualTo(merchantLockParameters)
    }
}
