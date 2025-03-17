// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialAccountTest {

    @Test
    fun createFinancialAccount() {
        val financialAccount =
            FinancialAccount.builder()
                .token("b68b7424-aa69-4cbc-a946-30d90181b621")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditConfiguration(
                    FinancialAccount.FinancialAccountCreditConfig.builder()
                        .chargedOffReason(
                            FinancialAccount.FinancialAccountCreditConfig.ChargedOffReason
                                .DELINQUENT
                        )
                        .creditLimit(0L)
                        .creditProductToken("credit_product_token")
                        .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .financialAccountState(
                            FinancialAccount.FinancialAccountCreditConfig.FinancialAccountState
                                .PENDING
                        )
                        .isSpendBlocked(true)
                        .tier("tier")
                        .build()
                )
                .isForBenefitOf(true)
                .nickname("nickname")
                .status(FinancialAccount.FinancialAccountStatus.OPEN)
                .type(FinancialAccount.Type.ISSUING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountNumber("account_number")
                .routingNumber("routing_number")
                .statusChangeReason(
                    FinancialAccount.FinancialAccountStatusChangeReason.CHARGED_OFF_DELINQUENT
                )
                .build()
        assertThat(financialAccount).isNotNull
        assertThat(financialAccount.token()).isEqualTo("b68b7424-aa69-4cbc-a946-30d90181b621")
        assertThat(financialAccount.accountToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(financialAccount.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(financialAccount.creditConfiguration())
            .contains(
                FinancialAccount.FinancialAccountCreditConfig.builder()
                    .chargedOffReason(
                        FinancialAccount.FinancialAccountCreditConfig.ChargedOffReason.DELINQUENT
                    )
                    .creditLimit(0L)
                    .creditProductToken("credit_product_token")
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .financialAccountState(
                        FinancialAccount.FinancialAccountCreditConfig.FinancialAccountState.PENDING
                    )
                    .isSpendBlocked(true)
                    .tier("tier")
                    .build()
            )
        assertThat(financialAccount.isForBenefitOf()).isEqualTo(true)
        assertThat(financialAccount.nickname()).contains("nickname")
        assertThat(financialAccount.status())
            .isEqualTo(FinancialAccount.FinancialAccountStatus.OPEN)
        assertThat(financialAccount.type()).isEqualTo(FinancialAccount.Type.ISSUING)
        assertThat(financialAccount.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(financialAccount.accountNumber()).contains("account_number")
        assertThat(financialAccount.routingNumber()).contains("routing_number")
        assertThat(financialAccount.statusChangeReason())
            .contains(FinancialAccount.FinancialAccountStatusChangeReason.CHARGED_OFF_DELINQUENT)
    }
}
