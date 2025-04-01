// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBankAccountListResponseTest {

    @Test
    fun create() {
        val externalBankAccountListResponse =
            ExternalBankAccountListResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("country")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .lastFour("last_four")
                .owner("owner")
                .ownerType(ExternalBankAccountListResponse.OwnerType.BUSINESS)
                .routingNumber("routing_number")
                .state(ExternalBankAccountListResponse.State.ENABLED)
                .type(ExternalBankAccountListResponse.Type.CHECKING)
                .verificationAttempts(0L)
                .verificationMethod(ExternalBankAccountListResponse.VerificationMethod.MANUAL)
                .verificationState(ExternalBankAccountListResponse.VerificationState.PENDING)
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

        assertThat(externalBankAccountListResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountListResponse.country()).isEqualTo("country")
        assertThat(externalBankAccountListResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalBankAccountListResponse.currency()).isEqualTo("currency")
        assertThat(externalBankAccountListResponse.lastFour()).isEqualTo("last_four")
        assertThat(externalBankAccountListResponse.owner()).isEqualTo("owner")
        assertThat(externalBankAccountListResponse.ownerType())
            .isEqualTo(ExternalBankAccountListResponse.OwnerType.BUSINESS)
        assertThat(externalBankAccountListResponse.routingNumber()).isEqualTo("routing_number")
        assertThat(externalBankAccountListResponse.state())
            .isEqualTo(ExternalBankAccountListResponse.State.ENABLED)
        assertThat(externalBankAccountListResponse.type())
            .isEqualTo(ExternalBankAccountListResponse.Type.CHECKING)
        assertThat(externalBankAccountListResponse.verificationAttempts()).isEqualTo(0L)
        assertThat(externalBankAccountListResponse.verificationMethod())
            .isEqualTo(ExternalBankAccountListResponse.VerificationMethod.MANUAL)
        assertThat(externalBankAccountListResponse.verificationState())
            .isEqualTo(ExternalBankAccountListResponse.VerificationState.PENDING)
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
        assertThat(externalBankAccountListResponse.companyId()).contains("company_id")
        assertThat(externalBankAccountListResponse.dob()).contains(LocalDate.parse("2019-12-27"))
        assertThat(externalBankAccountListResponse.doingBusinessAs()).contains("doing_business_as")
        assertThat(externalBankAccountListResponse.financialAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountListResponse.name()).contains("name")
        assertThat(externalBankAccountListResponse.userDefinedId()).contains("user_defined_id")
        assertThat(externalBankAccountListResponse.verificationFailedReason())
            .contains("verification_failed_reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalBankAccountListResponse =
            ExternalBankAccountListResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("country")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .lastFour("last_four")
                .owner("owner")
                .ownerType(ExternalBankAccountListResponse.OwnerType.BUSINESS)
                .routingNumber("routing_number")
                .state(ExternalBankAccountListResponse.State.ENABLED)
                .type(ExternalBankAccountListResponse.Type.CHECKING)
                .verificationAttempts(0L)
                .verificationMethod(ExternalBankAccountListResponse.VerificationMethod.MANUAL)
                .verificationState(ExternalBankAccountListResponse.VerificationState.PENDING)
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

        val roundtrippedExternalBankAccountListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalBankAccountListResponse),
                jacksonTypeRef<ExternalBankAccountListResponse>(),
            )

        assertThat(roundtrippedExternalBankAccountListResponse)
            .isEqualTo(externalBankAccountListResponse)
    }
}
