// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalBankAccountRetryPrenoteResponseTest {

    @Test
    fun createExternalBankAccountRetryPrenoteResponse() {
        val externalBankAccountRetryPrenoteResponse =
            ExternalBankAccountRetryPrenoteResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("country")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .lastFour("last_four")
                .owner("owner")
                .ownerType(OwnerType.INDIVIDUAL)
                .routingNumber("routing_number")
                .state(ExternalBankAccountRetryPrenoteResponse.State.ENABLED)
                .type(ExternalBankAccountRetryPrenoteResponse.Type.CHECKING)
                .verificationAttempts(0L)
                .verificationMethod(VerificationMethod.MANUAL)
                .verificationState(
                    ExternalBankAccountRetryPrenoteResponse.VerificationState.PENDING
                )
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
        assertThat(externalBankAccountRetryPrenoteResponse).isNotNull
        assertThat(externalBankAccountRetryPrenoteResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountRetryPrenoteResponse.country()).isEqualTo("country")
        assertThat(externalBankAccountRetryPrenoteResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalBankAccountRetryPrenoteResponse.currency()).isEqualTo("currency")
        assertThat(externalBankAccountRetryPrenoteResponse.lastFour()).isEqualTo("last_four")
        assertThat(externalBankAccountRetryPrenoteResponse.owner()).isEqualTo("owner")
        assertThat(externalBankAccountRetryPrenoteResponse.ownerType())
            .isEqualTo(OwnerType.INDIVIDUAL)
        assertThat(externalBankAccountRetryPrenoteResponse.routingNumber())
            .isEqualTo("routing_number")
        assertThat(externalBankAccountRetryPrenoteResponse.state())
            .isEqualTo(ExternalBankAccountRetryPrenoteResponse.State.ENABLED)
        assertThat(externalBankAccountRetryPrenoteResponse.type())
            .isEqualTo(ExternalBankAccountRetryPrenoteResponse.Type.CHECKING)
        assertThat(externalBankAccountRetryPrenoteResponse.verificationAttempts()).isEqualTo(0L)
        assertThat(externalBankAccountRetryPrenoteResponse.verificationMethod())
            .isEqualTo(VerificationMethod.MANUAL)
        assertThat(externalBankAccountRetryPrenoteResponse.verificationState())
            .isEqualTo(ExternalBankAccountRetryPrenoteResponse.VerificationState.PENDING)
        assertThat(externalBankAccountRetryPrenoteResponse.accountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountRetryPrenoteResponse.address())
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
        assertThat(externalBankAccountRetryPrenoteResponse.companyId()).contains("company_id")
        assertThat(externalBankAccountRetryPrenoteResponse.dob())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(externalBankAccountRetryPrenoteResponse.doingBusinessAs())
            .contains("doing_business_as")
        assertThat(externalBankAccountRetryPrenoteResponse.financialAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountRetryPrenoteResponse.name()).contains("name")
        assertThat(externalBankAccountRetryPrenoteResponse.userDefinedId())
            .contains("user_defined_id")
        assertThat(externalBankAccountRetryPrenoteResponse.verificationFailedReason())
            .contains("verification_failed_reason")
    }
}
