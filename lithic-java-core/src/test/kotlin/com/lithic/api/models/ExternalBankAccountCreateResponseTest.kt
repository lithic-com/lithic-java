// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBankAccountCreateResponseTest {

    @Test
    fun create() {
        val externalBankAccountCreateResponse =
            ExternalBankAccountCreateResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("country")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .lastFour("last_four")
                .owner("owner")
                .ownerType(ExternalBankAccountCreateResponse.OwnerType.BUSINESS)
                .routingNumber("routing_number")
                .state(ExternalBankAccountCreateResponse.State.ENABLED)
                .type(ExternalBankAccountCreateResponse.AccountType.CHECKING)
                .verificationAttempts(0L)
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
                .companyId("company_id")
                .dob(LocalDate.parse("2019-12-27"))
                .doingBusinessAs("doing_business_as")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .userDefinedId("user_defined_id")
                .verificationFailedReason("verification_failed_reason")
                .build()

        assertThat(externalBankAccountCreateResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountCreateResponse.country()).isEqualTo("country")
        assertThat(externalBankAccountCreateResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalBankAccountCreateResponse.currency()).isEqualTo("currency")
        assertThat(externalBankAccountCreateResponse.lastFour()).isEqualTo("last_four")
        assertThat(externalBankAccountCreateResponse.owner()).isEqualTo("owner")
        assertThat(externalBankAccountCreateResponse.ownerType())
            .isEqualTo(ExternalBankAccountCreateResponse.OwnerType.BUSINESS)
        assertThat(externalBankAccountCreateResponse.routingNumber()).isEqualTo("routing_number")
        assertThat(externalBankAccountCreateResponse.state())
            .isEqualTo(ExternalBankAccountCreateResponse.State.ENABLED)
        assertThat(externalBankAccountCreateResponse.type())
            .isEqualTo(ExternalBankAccountCreateResponse.AccountType.CHECKING)
        assertThat(externalBankAccountCreateResponse.verificationAttempts()).isEqualTo(0L)
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
        assertThat(externalBankAccountCreateResponse.companyId()).contains("company_id")
        assertThat(externalBankAccountCreateResponse.dob()).contains(LocalDate.parse("2019-12-27"))
        assertThat(externalBankAccountCreateResponse.doingBusinessAs())
            .contains("doing_business_as")
        assertThat(externalBankAccountCreateResponse.financialAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountCreateResponse.name()).contains("name")
        assertThat(externalBankAccountCreateResponse.userDefinedId()).contains("user_defined_id")
        assertThat(externalBankAccountCreateResponse.verificationFailedReason())
            .contains("verification_failed_reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalBankAccountCreateResponse =
            ExternalBankAccountCreateResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("country")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .lastFour("last_four")
                .owner("owner")
                .ownerType(ExternalBankAccountCreateResponse.OwnerType.BUSINESS)
                .routingNumber("routing_number")
                .state(ExternalBankAccountCreateResponse.State.ENABLED)
                .type(ExternalBankAccountCreateResponse.AccountType.CHECKING)
                .verificationAttempts(0L)
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
                .companyId("company_id")
                .dob(LocalDate.parse("2019-12-27"))
                .doingBusinessAs("doing_business_as")
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .userDefinedId("user_defined_id")
                .verificationFailedReason("verification_failed_reason")
                .build()

        val roundtrippedExternalBankAccountCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalBankAccountCreateResponse),
                jacksonTypeRef<ExternalBankAccountCreateResponse>(),
            )

        assertThat(roundtrippedExternalBankAccountCreateResponse)
            .isEqualTo(externalBankAccountCreateResponse)
    }
}
