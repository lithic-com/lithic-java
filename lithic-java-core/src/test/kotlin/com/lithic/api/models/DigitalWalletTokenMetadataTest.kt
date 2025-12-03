// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalWalletTokenMetadataTest {

    @Test
    fun create() {
        val digitalWalletTokenMetadata =
            DigitalWalletTokenMetadata.builder()
                .paymentAccountInfo(
                    DigitalWalletTokenMetadata.PaymentAccountInfo.builder()
                        .accountHolderData(
                            DigitalWalletTokenMetadata.PaymentAccountInfo.AccountHolderData
                                .builder()
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
                .tokenRequestorName(DigitalWalletTokenMetadata.TokenRequestorName.APPLE_PAY)
                .build()

        assertThat(digitalWalletTokenMetadata.paymentAccountInfo())
            .isEqualTo(
                DigitalWalletTokenMetadata.PaymentAccountInfo.builder()
                    .accountHolderData(
                        DigitalWalletTokenMetadata.PaymentAccountInfo.AccountHolderData.builder()
                            .phoneNumber("phone_number")
                            .build()
                    )
                    .panUniqueReference("pan_unique_reference")
                    .paymentAccountReference("payment_account_reference")
                    .tokenUniqueReference("token_unique_reference")
                    .build()
            )
        assertThat(digitalWalletTokenMetadata.status()).isEqualTo("status")
        assertThat(digitalWalletTokenMetadata.paymentAppInstanceId())
            .contains("payment_app_instance_id")
        assertThat(digitalWalletTokenMetadata.tokenRequestorId()).contains("xxxxxxxxxxx")
        assertThat(digitalWalletTokenMetadata.tokenRequestorName())
            .contains(DigitalWalletTokenMetadata.TokenRequestorName.APPLE_PAY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digitalWalletTokenMetadata =
            DigitalWalletTokenMetadata.builder()
                .paymentAccountInfo(
                    DigitalWalletTokenMetadata.PaymentAccountInfo.builder()
                        .accountHolderData(
                            DigitalWalletTokenMetadata.PaymentAccountInfo.AccountHolderData
                                .builder()
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
                .tokenRequestorName(DigitalWalletTokenMetadata.TokenRequestorName.APPLE_PAY)
                .build()

        val roundtrippedDigitalWalletTokenMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(digitalWalletTokenMetadata),
                jacksonTypeRef<DigitalWalletTokenMetadata>(),
            )

        assertThat(roundtrippedDigitalWalletTokenMetadata).isEqualTo(digitalWalletTokenMetadata)
    }
}
