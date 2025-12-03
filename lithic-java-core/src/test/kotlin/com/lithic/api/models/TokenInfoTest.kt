// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenInfoTest {

    @Test
    fun create() {
        val tokenInfo = TokenInfo.builder().walletType(TokenInfo.WalletType.APPLE_PAY).build()

        assertThat(tokenInfo.walletType()).isEqualTo(TokenInfo.WalletType.APPLE_PAY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenInfo = TokenInfo.builder().walletType(TokenInfo.WalletType.APPLE_PAY).build()

        val roundtrippedTokenInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenInfo),
                jacksonTypeRef<TokenInfo>(),
            )

        assertThat(roundtrippedTokenInfo).isEqualTo(tokenInfo)
    }
}
