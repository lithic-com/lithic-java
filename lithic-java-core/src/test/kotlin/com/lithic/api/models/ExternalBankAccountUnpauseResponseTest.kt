// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBankAccountUnpauseResponseTest {

    @Test
    fun create() {
        val externalBankAccountUnpauseResponse =
            ExternalBankAccountUnpauseResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("country")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .lastFour("last_four")
                .owner("owner")
                .ownerType(OwnerType.INDIVIDUAL)
                .routingNumber("routing_number")
                .state(ExternalBankAccountUnpauseResponse.State.ENABLED)
                .type(ExternalBankAccountUnpauseResponse.AccountType.CHECKING)
                .verificationAttempts(0L)
                .verificationMethod(VerificationMethod.MANUAL)
                .verificationState(ExternalBankAccountUnpauseResponse.VerificationState.PENDING)
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

        assertThat(externalBankAccountUnpauseResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountUnpauseResponse.country()).isEqualTo("country")
        assertThat(externalBankAccountUnpauseResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalBankAccountUnpauseResponse.currency()).isEqualTo("currency")
        assertThat(externalBankAccountUnpauseResponse.lastFour()).isEqualTo("last_four")
        assertThat(externalBankAccountUnpauseResponse.owner()).isEqualTo("owner")
        assertThat(externalBankAccountUnpauseResponse.ownerType()).isEqualTo(OwnerType.INDIVIDUAL)
        assertThat(externalBankAccountUnpauseResponse.routingNumber()).isEqualTo("routing_number")
        assertThat(externalBankAccountUnpauseResponse.state())
            .isEqualTo(ExternalBankAccountUnpauseResponse.State.ENABLED)
        assertThat(externalBankAccountUnpauseResponse.type())
            .isEqualTo(ExternalBankAccountUnpauseResponse.AccountType.CHECKING)
        assertThat(externalBankAccountUnpauseResponse.verificationAttempts()).isEqualTo(0L)
        assertThat(externalBankAccountUnpauseResponse.verificationMethod())
            .isEqualTo(VerificationMethod.MANUAL)
        assertThat(externalBankAccountUnpauseResponse.verificationState())
            .isEqualTo(ExternalBankAccountUnpauseResponse.VerificationState.PENDING)
        assertThat(externalBankAccountUnpauseResponse.accountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountUnpauseResponse.address())
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
        assertThat(externalBankAccountUnpauseResponse.companyId()).contains("company_id")
        assertThat(externalBankAccountUnpauseResponse.dob()).contains(LocalDate.parse("2019-12-27"))
        assertThat(externalBankAccountUnpauseResponse.doingBusinessAs())
            .contains("doing_business_as")
        assertThat(externalBankAccountUnpauseResponse.financialAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountUnpauseResponse.name()).contains("name")
        assertThat(externalBankAccountUnpauseResponse.userDefinedId()).contains("user_defined_id")
        assertThat(externalBankAccountUnpauseResponse.verificationFailedReason())
            .contains("verification_failed_reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalBankAccountUnpauseResponse =
            ExternalBankAccountUnpauseResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("country")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .lastFour("last_four")
                .owner("owner")
                .ownerType(OwnerType.INDIVIDUAL)
                .routingNumber("routing_number")
                .state(ExternalBankAccountUnpauseResponse.State.ENABLED)
                .type(ExternalBankAccountUnpauseResponse.AccountType.CHECKING)
                .verificationAttempts(0L)
                .verificationMethod(VerificationMethod.MANUAL)
                .verificationState(ExternalBankAccountUnpauseResponse.VerificationState.PENDING)
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

        val roundtrippedExternalBankAccountUnpauseResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalBankAccountUnpauseResponse),
                jacksonTypeRef<ExternalBankAccountUnpauseResponse>(),
            )

        assertThat(roundtrippedExternalBankAccountUnpauseResponse)
            .isEqualTo(externalBankAccountUnpauseResponse)
    }
}
