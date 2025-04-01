// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBankAccountRetrieveResponseTest {

    @Test
    fun create() {
        val externalBankAccountRetrieveResponse =
            ExternalBankAccountRetrieveResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("country")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .lastFour("last_four")
                .owner("owner")
                .ownerType(ExternalBankAccountRetrieveResponse.OwnerType.BUSINESS)
                .routingNumber("routing_number")
                .state(ExternalBankAccountRetrieveResponse.State.ENABLED)
                .type(ExternalBankAccountRetrieveResponse.Type.CHECKING)
                .verificationAttempts(0L)
                .verificationMethod(ExternalBankAccountRetrieveResponse.VerificationMethod.MANUAL)
                .verificationState(ExternalBankAccountRetrieveResponse.VerificationState.PENDING)
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

        assertThat(externalBankAccountRetrieveResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountRetrieveResponse.country()).isEqualTo("country")
        assertThat(externalBankAccountRetrieveResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalBankAccountRetrieveResponse.currency()).isEqualTo("currency")
        assertThat(externalBankAccountRetrieveResponse.lastFour()).isEqualTo("last_four")
        assertThat(externalBankAccountRetrieveResponse.owner()).isEqualTo("owner")
        assertThat(externalBankAccountRetrieveResponse.ownerType())
            .isEqualTo(ExternalBankAccountRetrieveResponse.OwnerType.BUSINESS)
        assertThat(externalBankAccountRetrieveResponse.routingNumber()).isEqualTo("routing_number")
        assertThat(externalBankAccountRetrieveResponse.state())
            .isEqualTo(ExternalBankAccountRetrieveResponse.State.ENABLED)
        assertThat(externalBankAccountRetrieveResponse.type())
            .isEqualTo(ExternalBankAccountRetrieveResponse.Type.CHECKING)
        assertThat(externalBankAccountRetrieveResponse.verificationAttempts()).isEqualTo(0L)
        assertThat(externalBankAccountRetrieveResponse.verificationMethod())
            .isEqualTo(ExternalBankAccountRetrieveResponse.VerificationMethod.MANUAL)
        assertThat(externalBankAccountRetrieveResponse.verificationState())
            .isEqualTo(ExternalBankAccountRetrieveResponse.VerificationState.PENDING)
        assertThat(externalBankAccountRetrieveResponse.accountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountRetrieveResponse.address())
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
        assertThat(externalBankAccountRetrieveResponse.companyId()).contains("company_id")
        assertThat(externalBankAccountRetrieveResponse.dob())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(externalBankAccountRetrieveResponse.doingBusinessAs())
            .contains("doing_business_as")
        assertThat(externalBankAccountRetrieveResponse.financialAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountRetrieveResponse.name()).contains("name")
        assertThat(externalBankAccountRetrieveResponse.userDefinedId()).contains("user_defined_id")
        assertThat(externalBankAccountRetrieveResponse.verificationFailedReason())
            .contains("verification_failed_reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalBankAccountRetrieveResponse =
            ExternalBankAccountRetrieveResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("country")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .lastFour("last_four")
                .owner("owner")
                .ownerType(ExternalBankAccountRetrieveResponse.OwnerType.BUSINESS)
                .routingNumber("routing_number")
                .state(ExternalBankAccountRetrieveResponse.State.ENABLED)
                .type(ExternalBankAccountRetrieveResponse.Type.CHECKING)
                .verificationAttempts(0L)
                .verificationMethod(ExternalBankAccountRetrieveResponse.VerificationMethod.MANUAL)
                .verificationState(ExternalBankAccountRetrieveResponse.VerificationState.PENDING)
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

        val roundtrippedExternalBankAccountRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalBankAccountRetrieveResponse),
                jacksonTypeRef<ExternalBankAccountRetrieveResponse>(),
            )

        assertThat(roundtrippedExternalBankAccountRetrieveResponse)
            .isEqualTo(externalBankAccountRetrieveResponse)
    }
}
