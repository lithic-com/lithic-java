// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalBankAccountListResponseTest {

    @Test
    fun createExternalBankAccountListResponse() {
        val externalBankAccountListResponse =
            ExternalBankAccountListResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("string")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .lastFour("string")
                .owner("string")
                .ownerType(ExternalBankAccountListResponse.OwnerType.BUSINESS)
                .routingNumber("string")
                .state(ExternalBankAccountListResponse.State.CLOSED)
                .type(ExternalBankAccountListResponse.Type.CHECKING)
                .verificationAttempts(123L)
                .verificationMethod(ExternalBankAccountListResponse.VerificationMethod.MANUAL)
                .verificationState(ExternalBankAccountListResponse.VerificationState.ENABLED)
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
        assertThat(externalBankAccountListResponse).isNotNull
        assertThat(externalBankAccountListResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountListResponse.country()).isEqualTo("string")
        assertThat(externalBankAccountListResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalBankAccountListResponse.currency()).isEqualTo("string")
        assertThat(externalBankAccountListResponse.lastFour()).isEqualTo("string")
        assertThat(externalBankAccountListResponse.owner()).isEqualTo("string")
        assertThat(externalBankAccountListResponse.ownerType())
            .isEqualTo(ExternalBankAccountListResponse.OwnerType.BUSINESS)
        assertThat(externalBankAccountListResponse.routingNumber()).isEqualTo("string")
        assertThat(externalBankAccountListResponse.state())
            .isEqualTo(ExternalBankAccountListResponse.State.CLOSED)
        assertThat(externalBankAccountListResponse.type())
            .isEqualTo(ExternalBankAccountListResponse.Type.CHECKING)
        assertThat(externalBankAccountListResponse.verificationAttempts()).isEqualTo(123L)
        assertThat(externalBankAccountListResponse.verificationMethod())
            .isEqualTo(ExternalBankAccountListResponse.VerificationMethod.MANUAL)
        assertThat(externalBankAccountListResponse.verificationState())
            .isEqualTo(ExternalBankAccountListResponse.VerificationState.ENABLED)
        assertThat(externalBankAccountListResponse.accountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountListResponse.address())
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
        assertThat(externalBankAccountListResponse.companyId()).contains("string")
        assertThat(externalBankAccountListResponse.dob()).contains(LocalDate.parse("2019-12-27"))
        assertThat(externalBankAccountListResponse.doingBusinessAs()).contains("string")
        assertThat(externalBankAccountListResponse.financialAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountListResponse.name()).contains("string")
        assertThat(externalBankAccountListResponse.userDefinedId()).contains("string")
        assertThat(externalBankAccountListResponse.verificationFailedReason()).contains("string")
    }
}
