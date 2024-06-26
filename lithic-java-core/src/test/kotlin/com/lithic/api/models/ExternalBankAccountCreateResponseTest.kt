// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalBankAccountCreateResponseTest {

    @Test
    fun createExternalBankAccountCreateResponse() {
        val externalBankAccountCreateResponse =
            ExternalBankAccountCreateResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("string")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .lastFour("string")
                .owner("string")
                .ownerType(ExternalBankAccountCreateResponse.OwnerType.BUSINESS)
                .routingNumber("string")
                .state(ExternalBankAccountCreateResponse.State.ENABLED)
                .type(ExternalBankAccountCreateResponse.Type.CHECKING)
                .verificationAttempts(123L)
                .verificationMethod(ExternalBankAccountCreateResponse.VerificationMethod.MANUAL)
                .verificationState(ExternalBankAccountCreateResponse.VerificationState.PENDING)
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
        assertThat(externalBankAccountCreateResponse).isNotNull
        assertThat(externalBankAccountCreateResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountCreateResponse.country()).isEqualTo("string")
        assertThat(externalBankAccountCreateResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalBankAccountCreateResponse.currency()).isEqualTo("string")
        assertThat(externalBankAccountCreateResponse.lastFour()).isEqualTo("string")
        assertThat(externalBankAccountCreateResponse.owner()).isEqualTo("string")
        assertThat(externalBankAccountCreateResponse.ownerType())
            .isEqualTo(ExternalBankAccountCreateResponse.OwnerType.BUSINESS)
        assertThat(externalBankAccountCreateResponse.routingNumber()).isEqualTo("string")
        assertThat(externalBankAccountCreateResponse.state())
            .isEqualTo(ExternalBankAccountCreateResponse.State.ENABLED)
        assertThat(externalBankAccountCreateResponse.type())
            .isEqualTo(ExternalBankAccountCreateResponse.Type.CHECKING)
        assertThat(externalBankAccountCreateResponse.verificationAttempts()).isEqualTo(123L)
        assertThat(externalBankAccountCreateResponse.verificationMethod())
            .isEqualTo(ExternalBankAccountCreateResponse.VerificationMethod.MANUAL)
        assertThat(externalBankAccountCreateResponse.verificationState())
            .isEqualTo(ExternalBankAccountCreateResponse.VerificationState.PENDING)
        assertThat(externalBankAccountCreateResponse.accountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountCreateResponse.address())
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
        assertThat(externalBankAccountCreateResponse.companyId()).contains("string")
        assertThat(externalBankAccountCreateResponse.dob()).contains(LocalDate.parse("2019-12-27"))
        assertThat(externalBankAccountCreateResponse.doingBusinessAs()).contains("string")
        assertThat(externalBankAccountCreateResponse.financialAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountCreateResponse.name()).contains("string")
        assertThat(externalBankAccountCreateResponse.userDefinedId()).contains("string")
        assertThat(externalBankAccountCreateResponse.verificationFailedReason()).contains("string")
    }
}
