// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FinancialAccountCreatedWebhookEventTest {

    @Test
    fun create() {
        val financialAccountCreatedWebhookEvent =
            FinancialAccountCreatedWebhookEvent.builder()
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
                .type(FinancialAccount.Type.ISSUING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountNumber("account_number")
                .routingNumber("routing_number")
                .substatus(FinancialAccount.FinancialAccountSubstatus.CHARGED_OFF_DELINQUENT)
                .eventType(FinancialAccountCreatedWebhookEvent.EventType.FINANCIAL_ACCOUNT_CREATED)
                .build()

        assertThat(financialAccountCreatedWebhookEvent.token())
            .isEqualTo("b68b7424-aa69-4cbc-a946-30d90181b621")
        assertThat(financialAccountCreatedWebhookEvent.accountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(financialAccountCreatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(financialAccountCreatedWebhookEvent.creditConfiguration())
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
        assertThat(financialAccountCreatedWebhookEvent.isForBenefitOf()).isEqualTo(true)
        assertThat(financialAccountCreatedWebhookEvent.nickname()).contains("nickname")
        assertThat(financialAccountCreatedWebhookEvent.status())
            .isEqualTo(FinancialAccount.FinancialAccountStatus.OPEN)
        assertThat(financialAccountCreatedWebhookEvent.type())
            .isEqualTo(FinancialAccount.Type.ISSUING)
        assertThat(financialAccountCreatedWebhookEvent.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(financialAccountCreatedWebhookEvent.accountNumber()).contains("account_number")
        assertThat(financialAccountCreatedWebhookEvent.routingNumber()).contains("routing_number")
        assertThat(financialAccountCreatedWebhookEvent.substatus())
            .contains(FinancialAccount.FinancialAccountSubstatus.CHARGED_OFF_DELINQUENT)
        assertThat(financialAccountCreatedWebhookEvent.eventType())
            .isEqualTo(FinancialAccountCreatedWebhookEvent.EventType.FINANCIAL_ACCOUNT_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val financialAccountCreatedWebhookEvent =
            FinancialAccountCreatedWebhookEvent.builder()
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
                .type(FinancialAccount.Type.ISSUING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountNumber("account_number")
                .routingNumber("routing_number")
                .substatus(FinancialAccount.FinancialAccountSubstatus.CHARGED_OFF_DELINQUENT)
                .eventType(FinancialAccountCreatedWebhookEvent.EventType.FINANCIAL_ACCOUNT_CREATED)
                .build()

        val roundtrippedFinancialAccountCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(financialAccountCreatedWebhookEvent),
                jacksonTypeRef<FinancialAccountCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedFinancialAccountCreatedWebhookEvent)
            .isEqualTo(financialAccountCreatedWebhookEvent)
    }
}
