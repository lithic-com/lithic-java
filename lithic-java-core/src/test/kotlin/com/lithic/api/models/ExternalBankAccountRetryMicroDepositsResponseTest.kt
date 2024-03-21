// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalBankAccountRetryMicroDepositsResponseTest {

    @Test
    fun createExternalBankAccountRetryMicroDepositsResponse() {
        val externalBankAccountRetryMicroDepositsResponse =
            ExternalBankAccountRetryMicroDepositsResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("string")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .lastFour("string")
                .owner("string")
                .ownerType(ExternalBankAccountRetryMicroDepositsResponse.OwnerType.BUSINESS)
                .routingNumber("string")
                .state(ExternalBankAccountRetryMicroDepositsResponse.State.CLOSED)
                .type(ExternalBankAccountRetryMicroDepositsResponse.Type.CHECKING)
                .verificationAttempts(123L)
                .verificationMethod(
                    ExternalBankAccountRetryMicroDepositsResponse.VerificationMethod.MANUAL
                )
                .verificationState(
                    ExternalBankAccountRetryMicroDepositsResponse.VerificationState.ENABLED
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
        assertThat(externalBankAccountRetryMicroDepositsResponse).isNotNull
        assertThat(externalBankAccountRetryMicroDepositsResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountRetryMicroDepositsResponse.country()).isEqualTo("string")
        assertThat(externalBankAccountRetryMicroDepositsResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalBankAccountRetryMicroDepositsResponse.currency()).isEqualTo("string")
        assertThat(externalBankAccountRetryMicroDepositsResponse.lastFour()).isEqualTo("string")
        assertThat(externalBankAccountRetryMicroDepositsResponse.owner()).isEqualTo("string")
        assertThat(externalBankAccountRetryMicroDepositsResponse.ownerType())
            .isEqualTo(ExternalBankAccountRetryMicroDepositsResponse.OwnerType.BUSINESS)
        assertThat(externalBankAccountRetryMicroDepositsResponse.routingNumber())
            .isEqualTo("string")
        assertThat(externalBankAccountRetryMicroDepositsResponse.state())
            .isEqualTo(ExternalBankAccountRetryMicroDepositsResponse.State.CLOSED)
        assertThat(externalBankAccountRetryMicroDepositsResponse.type())
            .isEqualTo(ExternalBankAccountRetryMicroDepositsResponse.Type.CHECKING)
        assertThat(externalBankAccountRetryMicroDepositsResponse.verificationAttempts())
            .isEqualTo(123L)
        assertThat(externalBankAccountRetryMicroDepositsResponse.verificationMethod())
            .isEqualTo(ExternalBankAccountRetryMicroDepositsResponse.VerificationMethod.MANUAL)
        assertThat(externalBankAccountRetryMicroDepositsResponse.verificationState())
            .isEqualTo(ExternalBankAccountRetryMicroDepositsResponse.VerificationState.ENABLED)
        assertThat(externalBankAccountRetryMicroDepositsResponse.accountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountRetryMicroDepositsResponse.address())
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
        assertThat(externalBankAccountRetryMicroDepositsResponse.companyId()).contains("string")
        assertThat(externalBankAccountRetryMicroDepositsResponse.dob())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(externalBankAccountRetryMicroDepositsResponse.doingBusinessAs())
            .contains("string")
        assertThat(externalBankAccountRetryMicroDepositsResponse.financialAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountRetryMicroDepositsResponse.name()).contains("string")
        assertThat(externalBankAccountRetryMicroDepositsResponse.userDefinedId()).contains("string")
        assertThat(externalBankAccountRetryMicroDepositsResponse.verificationFailedReason())
            .contains("string")
    }
}
