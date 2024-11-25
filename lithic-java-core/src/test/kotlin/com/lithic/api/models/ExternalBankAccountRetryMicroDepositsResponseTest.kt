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
                .country("country")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .lastFour("last_four")
                .owner("owner")
                .ownerType(ExternalBankAccountRetryMicroDepositsResponse.OwnerType.BUSINESS)
                .routingNumber("routing_number")
                .state(ExternalBankAccountRetryMicroDepositsResponse.State.ENABLED)
                .type(ExternalBankAccountRetryMicroDepositsResponse.Type.CHECKING)
                .verificationAttempts(0L)
                .verificationMethod(
                    ExternalBankAccountRetryMicroDepositsResponse.VerificationMethod.MANUAL
                )
                .verificationState(
                    ExternalBankAccountRetryMicroDepositsResponse.VerificationState.PENDING
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
        assertThat(externalBankAccountRetryMicroDepositsResponse).isNotNull
        assertThat(externalBankAccountRetryMicroDepositsResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountRetryMicroDepositsResponse.country()).isEqualTo("country")
        assertThat(externalBankAccountRetryMicroDepositsResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalBankAccountRetryMicroDepositsResponse.currency()).isEqualTo("currency")
        assertThat(externalBankAccountRetryMicroDepositsResponse.lastFour()).isEqualTo("last_four")
        assertThat(externalBankAccountRetryMicroDepositsResponse.owner()).isEqualTo("owner")
        assertThat(externalBankAccountRetryMicroDepositsResponse.ownerType())
            .isEqualTo(ExternalBankAccountRetryMicroDepositsResponse.OwnerType.BUSINESS)
        assertThat(externalBankAccountRetryMicroDepositsResponse.routingNumber())
            .isEqualTo("routing_number")
        assertThat(externalBankAccountRetryMicroDepositsResponse.state())
            .isEqualTo(ExternalBankAccountRetryMicroDepositsResponse.State.ENABLED)
        assertThat(externalBankAccountRetryMicroDepositsResponse.type())
            .isEqualTo(ExternalBankAccountRetryMicroDepositsResponse.Type.CHECKING)
        assertThat(externalBankAccountRetryMicroDepositsResponse.verificationAttempts())
            .isEqualTo(0L)
        assertThat(externalBankAccountRetryMicroDepositsResponse.verificationMethod())
            .isEqualTo(ExternalBankAccountRetryMicroDepositsResponse.VerificationMethod.MANUAL)
        assertThat(externalBankAccountRetryMicroDepositsResponse.verificationState())
            .isEqualTo(ExternalBankAccountRetryMicroDepositsResponse.VerificationState.PENDING)
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
        assertThat(externalBankAccountRetryMicroDepositsResponse.companyId()).contains("company_id")
        assertThat(externalBankAccountRetryMicroDepositsResponse.dob())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(externalBankAccountRetryMicroDepositsResponse.doingBusinessAs())
            .contains("doing_business_as")
        assertThat(externalBankAccountRetryMicroDepositsResponse.financialAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountRetryMicroDepositsResponse.name()).contains("name")
        assertThat(externalBankAccountRetryMicroDepositsResponse.userDefinedId())
            .contains("user_defined_id")
        assertThat(externalBankAccountRetryMicroDepositsResponse.verificationFailedReason())
            .contains("verification_failed_reason")
    }
}
