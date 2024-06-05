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
                .country("string")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .lastFour("string")
                .owner("string")
                .ownerType(OwnerType.INDIVIDUAL)
                .routingNumber("string")
                .state(ExternalBankAccountRetryPrenoteResponse.State.ENABLED)
                .type(ExternalBankAccountRetryPrenoteResponse.Type.CHECKING)
                .verificationAttempts(123L)
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
                .companyId("string")
                .dob(LocalDate.parse("2019-12-27"))
                .doingBusinessAs("string")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("string")
                .userDefinedId("string")
                .verificationFailedReason("string")
                .build()
        assertThat(externalBankAccountRetryPrenoteResponse).isNotNull
        assertThat(externalBankAccountRetryPrenoteResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountRetryPrenoteResponse.country()).isEqualTo("string")
        assertThat(externalBankAccountRetryPrenoteResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalBankAccountRetryPrenoteResponse.currency()).isEqualTo("string")
        assertThat(externalBankAccountRetryPrenoteResponse.lastFour()).isEqualTo("string")
        assertThat(externalBankAccountRetryPrenoteResponse.owner()).isEqualTo("string")
        assertThat(externalBankAccountRetryPrenoteResponse.ownerType())
            .isEqualTo(OwnerType.INDIVIDUAL)
        assertThat(externalBankAccountRetryPrenoteResponse.routingNumber()).isEqualTo("string")
        assertThat(externalBankAccountRetryPrenoteResponse.state())
            .isEqualTo(ExternalBankAccountRetryPrenoteResponse.State.ENABLED)
        assertThat(externalBankAccountRetryPrenoteResponse.type())
            .isEqualTo(ExternalBankAccountRetryPrenoteResponse.Type.CHECKING)
        assertThat(externalBankAccountRetryPrenoteResponse.verificationAttempts()).isEqualTo(123L)
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
        assertThat(externalBankAccountRetryPrenoteResponse.companyId()).contains("string")
        assertThat(externalBankAccountRetryPrenoteResponse.dob())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(externalBankAccountRetryPrenoteResponse.doingBusinessAs()).contains("string")
        assertThat(externalBankAccountRetryPrenoteResponse.financialAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountRetryPrenoteResponse.name()).contains("string")
        assertThat(externalBankAccountRetryPrenoteResponse.userDefinedId()).contains("string")
        assertThat(externalBankAccountRetryPrenoteResponse.verificationFailedReason())
            .contains("string")
    }
}
