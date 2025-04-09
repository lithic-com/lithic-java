// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBankAccountListPageResponseTest {

    @Test
    fun create() {
        val externalBankAccountListPageResponse =
            ExternalBankAccountListPageResponse.builder()
                .addData(
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
                        .verificationMethod(
                            ExternalBankAccountListResponse.VerificationMethod.MANUAL
                        )
                        .verificationState(
                            ExternalBankAccountListResponse.VerificationState.PENDING
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
                )
                .hasMore(true)
                .build()

        assertThat(externalBankAccountListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(externalBankAccountListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalBankAccountListPageResponse =
            ExternalBankAccountListPageResponse.builder()
                .addData(
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
                        .verificationMethod(
                            ExternalBankAccountListResponse.VerificationMethod.MANUAL
                        )
                        .verificationState(
                            ExternalBankAccountListResponse.VerificationState.PENDING
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
                )
                .hasMore(true)
                .build()

        val roundtrippedExternalBankAccountListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalBankAccountListPageResponse),
                jacksonTypeRef<ExternalBankAccountListPageResponse>(),
            )

        assertThat(roundtrippedExternalBankAccountListPageResponse)
            .isEqualTo(externalBankAccountListPageResponse)
    }
}
