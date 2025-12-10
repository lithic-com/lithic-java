// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBankAccountUpdatedWebhookEventTest {

    @Test
    fun create() {
        val externalBankAccountUpdatedWebhookEvent =
            ExternalBankAccountUpdatedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("country")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .lastFour("last_four")
                .owner("owner")
                .ownerType(OwnerType.INDIVIDUAL)
                .routingNumber("routing_number")
                .state(ExternalBankAccount.State.ENABLED)
                .type(ExternalBankAccount.AccountType.CHECKING)
                .verificationAttempts(0L)
                .verificationMethod(VerificationMethod.MANUAL)
                .verificationState(ExternalBankAccount.VerificationState.PENDING)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .address(
                    ExternalBankAccountAddress.builder()
                        .address1("x")
                        .city("x")
                        .country("USD")
                        .postalCode("11201")
                        .state("xx")
                        .address2("x")
                        .build()
                )
                .companyId("company_id")
                .dob(LocalDate.parse("2019-12-27"))
                .doingBusinessAs("doing_business_as")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .userDefinedId("user_defined_id")
                .verificationFailedReason("verification_failed_reason")
                .eventType(
                    ExternalBankAccountUpdatedWebhookEvent.EventType.EXTERNAL_BANK_ACCOUNT_UPDATED
                )
                .build()

        assertThat(externalBankAccountUpdatedWebhookEvent.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountUpdatedWebhookEvent.country()).isEqualTo("country")
        assertThat(externalBankAccountUpdatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalBankAccountUpdatedWebhookEvent.currency()).isEqualTo("currency")
        assertThat(externalBankAccountUpdatedWebhookEvent.lastFour()).isEqualTo("last_four")
        assertThat(externalBankAccountUpdatedWebhookEvent.owner()).isEqualTo("owner")
        assertThat(externalBankAccountUpdatedWebhookEvent.ownerType())
            .isEqualTo(OwnerType.INDIVIDUAL)
        assertThat(externalBankAccountUpdatedWebhookEvent.routingNumber())
            .isEqualTo("routing_number")
        assertThat(externalBankAccountUpdatedWebhookEvent.state())
            .isEqualTo(ExternalBankAccount.State.ENABLED)
        assertThat(externalBankAccountUpdatedWebhookEvent.type())
            .isEqualTo(ExternalBankAccount.AccountType.CHECKING)
        assertThat(externalBankAccountUpdatedWebhookEvent.verificationAttempts()).isEqualTo(0L)
        assertThat(externalBankAccountUpdatedWebhookEvent.verificationMethod())
            .isEqualTo(VerificationMethod.MANUAL)
        assertThat(externalBankAccountUpdatedWebhookEvent.verificationState())
            .isEqualTo(ExternalBankAccount.VerificationState.PENDING)
        assertThat(externalBankAccountUpdatedWebhookEvent.accountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountUpdatedWebhookEvent.address())
            .contains(
                ExternalBankAccountAddress.builder()
                    .address1("x")
                    .city("x")
                    .country("USD")
                    .postalCode("11201")
                    .state("xx")
                    .address2("x")
                    .build()
            )
        assertThat(externalBankAccountUpdatedWebhookEvent.companyId()).contains("company_id")
        assertThat(externalBankAccountUpdatedWebhookEvent.dob())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(externalBankAccountUpdatedWebhookEvent.doingBusinessAs())
            .contains("doing_business_as")
        assertThat(externalBankAccountUpdatedWebhookEvent.financialAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountUpdatedWebhookEvent.name()).contains("name")
        assertThat(externalBankAccountUpdatedWebhookEvent.userDefinedId())
            .contains("user_defined_id")
        assertThat(externalBankAccountUpdatedWebhookEvent.verificationFailedReason())
            .contains("verification_failed_reason")
        assertThat(externalBankAccountUpdatedWebhookEvent.eventType())
            .isEqualTo(
                ExternalBankAccountUpdatedWebhookEvent.EventType.EXTERNAL_BANK_ACCOUNT_UPDATED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalBankAccountUpdatedWebhookEvent =
            ExternalBankAccountUpdatedWebhookEvent.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("country")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .lastFour("last_four")
                .owner("owner")
                .ownerType(OwnerType.INDIVIDUAL)
                .routingNumber("routing_number")
                .state(ExternalBankAccount.State.ENABLED)
                .type(ExternalBankAccount.AccountType.CHECKING)
                .verificationAttempts(0L)
                .verificationMethod(VerificationMethod.MANUAL)
                .verificationState(ExternalBankAccount.VerificationState.PENDING)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .address(
                    ExternalBankAccountAddress.builder()
                        .address1("x")
                        .city("x")
                        .country("USD")
                        .postalCode("11201")
                        .state("xx")
                        .address2("x")
                        .build()
                )
                .companyId("company_id")
                .dob(LocalDate.parse("2019-12-27"))
                .doingBusinessAs("doing_business_as")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .userDefinedId("user_defined_id")
                .verificationFailedReason("verification_failed_reason")
                .eventType(
                    ExternalBankAccountUpdatedWebhookEvent.EventType.EXTERNAL_BANK_ACCOUNT_UPDATED
                )
                .build()

        val roundtrippedExternalBankAccountUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalBankAccountUpdatedWebhookEvent),
                jacksonTypeRef<ExternalBankAccountUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedExternalBankAccountUpdatedWebhookEvent)
            .isEqualTo(externalBankAccountUpdatedWebhookEvent)
    }
}
