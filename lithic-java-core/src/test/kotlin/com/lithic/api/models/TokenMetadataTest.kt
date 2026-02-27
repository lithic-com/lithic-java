// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenMetadataTest {

    @Test
    fun create() {
        val tokenMetadata =
            TokenMetadata.builder()
                .paymentAccountInfo(
                    TokenMetadata.PaymentAccountInfo.builder()
                        .accountHolderData(
                            TokenMetadata.PaymentAccountInfo.AccountHolderData.builder()
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .panUniqueReference("pan_unique_reference")
                        .paymentAccountReference("payment_account_reference")
                        .tokenUniqueReference("token_unique_reference")
                        .build()
                )
                .status("status")
                .paymentAppInstanceId("payment_app_instance_id")
                .tokenRequestorId("xxxxxxxxxxx")
                .tokenRequestorName(TokenMetadata.TokenRequestorName.APPLE_PAY)
                .build()

        assertThat(tokenMetadata.paymentAccountInfo())
            .isEqualTo(
                TokenMetadata.PaymentAccountInfo.builder()
                    .accountHolderData(
                        TokenMetadata.PaymentAccountInfo.AccountHolderData.builder()
                            .phoneNumber("phone_number")
                            .build()
                    )
                    .panUniqueReference("pan_unique_reference")
                    .paymentAccountReference("payment_account_reference")
                    .tokenUniqueReference("token_unique_reference")
                    .build()
            )
        assertThat(tokenMetadata.status()).isEqualTo("status")
        assertThat(tokenMetadata.paymentAppInstanceId()).contains("payment_app_instance_id")
        assertThat(tokenMetadata.tokenRequestorId()).contains("xxxxxxxxxxx")
        assertThat(tokenMetadata.tokenRequestorName())
            .contains(TokenMetadata.TokenRequestorName.APPLE_PAY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenMetadata =
            TokenMetadata.builder()
                .paymentAccountInfo(
                    TokenMetadata.PaymentAccountInfo.builder()
                        .accountHolderData(
                            TokenMetadata.PaymentAccountInfo.AccountHolderData.builder()
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .panUniqueReference("pan_unique_reference")
                        .paymentAccountReference("payment_account_reference")
                        .tokenUniqueReference("token_unique_reference")
                        .build()
                )
                .status("status")
                .paymentAppInstanceId("payment_app_instance_id")
                .tokenRequestorId("xxxxxxxxxxx")
                .tokenRequestorName(TokenMetadata.TokenRequestorName.APPLE_PAY)
                .build()

        val roundtrippedTokenMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenMetadata),
                jacksonTypeRef<TokenMetadata>(),
            )

        assertThat(roundtrippedTokenMetadata).isEqualTo(tokenMetadata)
    }
}
