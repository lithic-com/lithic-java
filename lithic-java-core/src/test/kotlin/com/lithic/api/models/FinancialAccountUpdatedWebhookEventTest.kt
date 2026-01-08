// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialAccountUpdatedWebhookEventTest {

    @Test
    fun create() {
        val financialAccountUpdatedWebhookEvent =
            FinancialAccountUpdatedWebhookEvent.builder()
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
                        .build()
                )
                .isForBenefitOf(true)
                .nickname("nickname")
                .status(FinancialAccount.FinancialAccountStatus.OPEN)
                .substatus(FinancialAccount.FinancialAccountSubstatus.CHARGED_OFF_DELINQUENT)
                .type(FinancialAccount.Type.ISSUING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userDefinedStatus("user_defined_status")
                .accountNumber("account_number")
                .routingNumber("routing_number")
                .eventType(FinancialAccountUpdatedWebhookEvent.EventType.FINANCIAL_ACCOUNT_UPDATED)
                .build()

        assertThat(financialAccountUpdatedWebhookEvent.token())
            .isEqualTo("b68b7424-aa69-4cbc-a946-30d90181b621")
        assertThat(financialAccountUpdatedWebhookEvent.accountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(financialAccountUpdatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(financialAccountUpdatedWebhookEvent.creditConfiguration())
            .contains(
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
                    .build()
            )
        assertThat(financialAccountUpdatedWebhookEvent.isForBenefitOf()).isEqualTo(true)
        assertThat(financialAccountUpdatedWebhookEvent.nickname()).contains("nickname")
        assertThat(financialAccountUpdatedWebhookEvent.status())
            .isEqualTo(FinancialAccount.FinancialAccountStatus.OPEN)
        assertThat(financialAccountUpdatedWebhookEvent.substatus())
            .contains(FinancialAccount.FinancialAccountSubstatus.CHARGED_OFF_DELINQUENT)
        assertThat(financialAccountUpdatedWebhookEvent.type())
            .isEqualTo(FinancialAccount.Type.ISSUING)
        assertThat(financialAccountUpdatedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(financialAccountUpdatedWebhookEvent.userDefinedStatus())
            .contains("user_defined_status")
        assertThat(financialAccountUpdatedWebhookEvent.accountNumber()).contains("account_number")
        assertThat(financialAccountUpdatedWebhookEvent.routingNumber()).contains("routing_number")
        assertThat(financialAccountUpdatedWebhookEvent.eventType())
            .isEqualTo(FinancialAccountUpdatedWebhookEvent.EventType.FINANCIAL_ACCOUNT_UPDATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val financialAccountUpdatedWebhookEvent =
            FinancialAccountUpdatedWebhookEvent.builder()
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
                        .build()
                )
                .isForBenefitOf(true)
                .nickname("nickname")
                .status(FinancialAccount.FinancialAccountStatus.OPEN)
                .substatus(FinancialAccount.FinancialAccountSubstatus.CHARGED_OFF_DELINQUENT)
                .type(FinancialAccount.Type.ISSUING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userDefinedStatus("user_defined_status")
                .accountNumber("account_number")
                .routingNumber("routing_number")
                .eventType(FinancialAccountUpdatedWebhookEvent.EventType.FINANCIAL_ACCOUNT_UPDATED)
                .build()

        val roundtrippedFinancialAccountUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(financialAccountUpdatedWebhookEvent),
                jacksonTypeRef<FinancialAccountUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedFinancialAccountUpdatedWebhookEvent)
            .isEqualTo(financialAccountUpdatedWebhookEvent)
    }
}
