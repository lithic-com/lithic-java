// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialAccountListPageResponseTest {

    @Test
    fun create() {
        val financialAccountListPageResponse =
            FinancialAccountListPageResponse.builder()
                .addData(
                    FinancialAccount.builder()
                        .token("b68b7424-aa69-4cbc-a946-30d90181b621")
                        .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .creditConfiguration(
                            FinancialAccount.FinancialAccountCreditConfig.builder()
                                .autoCollectionConfiguration(
                                    FinancialAccount.FinancialAccountCreditConfig
                                        .AutoCollectionConfigurationResponse
                                        .builder()
                                        .autoCollectionEnabled(true)
                                        .build()
                                )
                                .creditLimit(0L)
                                .creditProductToken("credit_product_token")
                                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .tier("tier")
                                .chargedOffReason(
                                    FinancialAccount.FinancialAccountCreditConfig.ChargedOffReason
                                        .DELINQUENT
                                )
                                .financialAccountState(
                                    FinancialAccount.FinancialAccountCreditConfig
                                        .FinancialAccountState
                                        .PENDING
                                )
                                .isSpendBlocked(true)
                                .build()
                        )
                        .isForBenefitOf(true)
                        .nickname("nickname")
                        .status(FinancialAccount.FinancialAccountStatus.OPEN)
                        .type(FinancialAccount.Type.ISSUING)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .accountNumber("account_number")
                        .routingNumber("routing_number")
                        .substatus(
                            FinancialAccount.FinancialAccountSubstatus.CHARGED_OFF_DELINQUENT
                        )
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(financialAccountListPageResponse.data())
            .containsExactly(
                FinancialAccount.builder()
                    .token("b68b7424-aa69-4cbc-a946-30d90181b621")
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditConfiguration(
                        FinancialAccount.FinancialAccountCreditConfig.builder()
                            .autoCollectionConfiguration(
                                FinancialAccount.FinancialAccountCreditConfig
                                    .AutoCollectionConfigurationResponse
                                    .builder()
                                    .autoCollectionEnabled(true)
                                    .build()
                            )
                            .creditLimit(0L)
                            .creditProductToken("credit_product_token")
                            .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .tier("tier")
                            .chargedOffReason(
                                FinancialAccount.FinancialAccountCreditConfig.ChargedOffReason
                                    .DELINQUENT
                            )
                            .financialAccountState(
                                FinancialAccount.FinancialAccountCreditConfig.FinancialAccountState
                                    .PENDING
                            )
                            .isSpendBlocked(true)
                            .build()
                    )
                    .isForBenefitOf(true)
                    .nickname("nickname")
                    .status(FinancialAccount.FinancialAccountStatus.OPEN)
                    .type(FinancialAccount.Type.ISSUING)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .accountNumber("account_number")
                    .routingNumber("routing_number")
                    .substatus(FinancialAccount.FinancialAccountSubstatus.CHARGED_OFF_DELINQUENT)
                    .build()
            )
        assertThat(financialAccountListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val financialAccountListPageResponse =
            FinancialAccountListPageResponse.builder()
                .addData(
                    FinancialAccount.builder()
                        .token("b68b7424-aa69-4cbc-a946-30d90181b621")
                        .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .creditConfiguration(
                            FinancialAccount.FinancialAccountCreditConfig.builder()
                                .autoCollectionConfiguration(
                                    FinancialAccount.FinancialAccountCreditConfig
                                        .AutoCollectionConfigurationResponse
                                        .builder()
                                        .autoCollectionEnabled(true)
                                        .build()
                                )
                                .creditLimit(0L)
                                .creditProductToken("credit_product_token")
                                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .tier("tier")
                                .chargedOffReason(
                                    FinancialAccount.FinancialAccountCreditConfig.ChargedOffReason
                                        .DELINQUENT
                                )
                                .financialAccountState(
                                    FinancialAccount.FinancialAccountCreditConfig
                                        .FinancialAccountState
                                        .PENDING
                                )
                                .isSpendBlocked(true)
                                .build()
                        )
                        .isForBenefitOf(true)
                        .nickname("nickname")
                        .status(FinancialAccount.FinancialAccountStatus.OPEN)
                        .type(FinancialAccount.Type.ISSUING)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .accountNumber("account_number")
                        .routingNumber("routing_number")
                        .substatus(
                            FinancialAccount.FinancialAccountSubstatus.CHARGED_OFF_DELINQUENT
                        )
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedFinancialAccountListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(financialAccountListPageResponse),
                jacksonTypeRef<FinancialAccountListPageResponse>(),
            )

        assertThat(roundtrippedFinancialAccountListPageResponse)
            .isEqualTo(financialAccountListPageResponse)
    }
}
