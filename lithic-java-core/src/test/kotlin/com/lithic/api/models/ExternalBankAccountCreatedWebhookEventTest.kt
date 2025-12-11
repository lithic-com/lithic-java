// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBankAccountCreatedWebhookEventTest {

    @Test
    fun create() {
        val externalBankAccountCreatedWebhookEvent =
            ExternalBankAccountCreatedWebhookEvent.builder()
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
                    ExternalBankAccountCreatedWebhookEvent.EventType.EXTERNAL_BANK_ACCOUNT_CREATED
                )
                .build()

        assertThat(externalBankAccountCreatedWebhookEvent.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountCreatedWebhookEvent.country()).isEqualTo("country")
        assertThat(externalBankAccountCreatedWebhookEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalBankAccountCreatedWebhookEvent.currency()).isEqualTo("currency")
        assertThat(externalBankAccountCreatedWebhookEvent.lastFour()).isEqualTo("last_four")
        assertThat(externalBankAccountCreatedWebhookEvent.owner()).isEqualTo("owner")
        assertThat(externalBankAccountCreatedWebhookEvent.ownerType())
            .isEqualTo(OwnerType.INDIVIDUAL)
        assertThat(externalBankAccountCreatedWebhookEvent.routingNumber())
            .isEqualTo("routing_number")
        assertThat(externalBankAccountCreatedWebhookEvent.state())
            .isEqualTo(ExternalBankAccount.State.ENABLED)
        assertThat(externalBankAccountCreatedWebhookEvent.type())
            .isEqualTo(ExternalBankAccount.AccountType.CHECKING)
        assertThat(externalBankAccountCreatedWebhookEvent.verificationAttempts()).isEqualTo(0L)
        assertThat(externalBankAccountCreatedWebhookEvent.verificationMethod())
            .isEqualTo(VerificationMethod.MANUAL)
        assertThat(externalBankAccountCreatedWebhookEvent.verificationState())
            .isEqualTo(ExternalBankAccount.VerificationState.PENDING)
        assertThat(externalBankAccountCreatedWebhookEvent.accountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountCreatedWebhookEvent.address())
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
        assertThat(externalBankAccountCreatedWebhookEvent.companyId()).contains("company_id")
        assertThat(externalBankAccountCreatedWebhookEvent.dob())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(externalBankAccountCreatedWebhookEvent.doingBusinessAs())
            .contains("doing_business_as")
        assertThat(externalBankAccountCreatedWebhookEvent.financialAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountCreatedWebhookEvent.name()).contains("name")
        assertThat(externalBankAccountCreatedWebhookEvent.userDefinedId())
            .contains("user_defined_id")
        assertThat(externalBankAccountCreatedWebhookEvent.verificationFailedReason())
            .contains("verification_failed_reason")
        assertThat(externalBankAccountCreatedWebhookEvent.eventType())
            .isEqualTo(
                ExternalBankAccountCreatedWebhookEvent.EventType.EXTERNAL_BANK_ACCOUNT_CREATED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalBankAccountCreatedWebhookEvent =
            ExternalBankAccountCreatedWebhookEvent.builder()
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
                    ExternalBankAccountCreatedWebhookEvent.EventType.EXTERNAL_BANK_ACCOUNT_CREATED
                )
                .build()

        val roundtrippedExternalBankAccountCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalBankAccountCreatedWebhookEvent),
                jacksonTypeRef<ExternalBankAccountCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedExternalBankAccountCreatedWebhookEvent)
            .isEqualTo(externalBankAccountCreatedWebhookEvent)
    }
}
