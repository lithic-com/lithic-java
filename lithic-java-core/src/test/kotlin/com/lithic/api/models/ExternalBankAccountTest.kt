// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBankAccountTest {

    @Test
    fun create() {
        val externalBankAccount =
            ExternalBankAccount.builder()
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
                .build()

        assertThat(externalBankAccount.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccount.country()).isEqualTo("country")
        assertThat(externalBankAccount.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalBankAccount.currency()).isEqualTo("currency")
        assertThat(externalBankAccount.lastFour()).isEqualTo("last_four")
        assertThat(externalBankAccount.owner()).isEqualTo("owner")
        assertThat(externalBankAccount.ownerType()).isEqualTo(OwnerType.INDIVIDUAL)
        assertThat(externalBankAccount.routingNumber()).isEqualTo("routing_number")
        assertThat(externalBankAccount.state()).isEqualTo(ExternalBankAccount.State.ENABLED)
        assertThat(externalBankAccount.type()).isEqualTo(ExternalBankAccount.AccountType.CHECKING)
        assertThat(externalBankAccount.verificationAttempts()).isEqualTo(0L)
        assertThat(externalBankAccount.verificationMethod()).isEqualTo(VerificationMethod.MANUAL)
        assertThat(externalBankAccount.verificationState())
            .isEqualTo(ExternalBankAccount.VerificationState.PENDING)
        assertThat(externalBankAccount.accountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccount.address())
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
        assertThat(externalBankAccount.companyId()).contains("company_id")
        assertThat(externalBankAccount.dob()).contains(LocalDate.parse("2019-12-27"))
        assertThat(externalBankAccount.doingBusinessAs()).contains("doing_business_as")
        assertThat(externalBankAccount.financialAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccount.name()).contains("name")
        assertThat(externalBankAccount.userDefinedId()).contains("user_defined_id")
        assertThat(externalBankAccount.verificationFailedReason())
            .contains("verification_failed_reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalBankAccount =
            ExternalBankAccount.builder()
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
                .build()

        val roundtrippedExternalBankAccount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalBankAccount),
                jacksonTypeRef<ExternalBankAccount>(),
            )

        assertThat(roundtrippedExternalBankAccount).isEqualTo(externalBankAccount)
    }
}
