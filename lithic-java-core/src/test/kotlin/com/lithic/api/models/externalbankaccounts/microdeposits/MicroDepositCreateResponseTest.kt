// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models.externalbankaccounts.microdeposits

import com.lithic.api.models.externalbankaccounts.ExternalBankAccountAddress
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MicroDepositCreateResponseTest {

    @Test
    fun create() {
        val microDepositCreateResponse =
            MicroDepositCreateResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("country")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .lastFour("last_four")
                .owner("owner")
                .ownerType(MicroDepositCreateResponse.OwnerType.BUSINESS)
                .routingNumber("routing_number")
                .state(MicroDepositCreateResponse.State.ENABLED)
                .type(MicroDepositCreateResponse.Type.CHECKING)
                .verificationAttempts(0L)
                .verificationMethod(MicroDepositCreateResponse.VerificationMethod.MANUAL)
                .verificationState(MicroDepositCreateResponse.VerificationState.PENDING)
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

        assertThat(microDepositCreateResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(microDepositCreateResponse.country()).isEqualTo("country")
        assertThat(microDepositCreateResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(microDepositCreateResponse.currency()).isEqualTo("currency")
        assertThat(microDepositCreateResponse.lastFour()).isEqualTo("last_four")
        assertThat(microDepositCreateResponse.owner()).isEqualTo("owner")
        assertThat(microDepositCreateResponse.ownerType())
            .isEqualTo(MicroDepositCreateResponse.OwnerType.BUSINESS)
        assertThat(microDepositCreateResponse.routingNumber()).isEqualTo("routing_number")
        assertThat(microDepositCreateResponse.state())
            .isEqualTo(MicroDepositCreateResponse.State.ENABLED)
        assertThat(microDepositCreateResponse.type())
            .isEqualTo(MicroDepositCreateResponse.Type.CHECKING)
        assertThat(microDepositCreateResponse.verificationAttempts()).isEqualTo(0L)
        assertThat(microDepositCreateResponse.verificationMethod())
            .isEqualTo(MicroDepositCreateResponse.VerificationMethod.MANUAL)
        assertThat(microDepositCreateResponse.verificationState())
            .isEqualTo(MicroDepositCreateResponse.VerificationState.PENDING)
        assertThat(microDepositCreateResponse.accountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(microDepositCreateResponse.address())
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
        assertThat(microDepositCreateResponse.companyId()).contains("company_id")
        assertThat(microDepositCreateResponse.dob()).contains(LocalDate.parse("2019-12-27"))
        assertThat(microDepositCreateResponse.doingBusinessAs()).contains("doing_business_as")
        assertThat(microDepositCreateResponse.financialAccountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(microDepositCreateResponse.name()).contains("name")
        assertThat(microDepositCreateResponse.userDefinedId()).contains("user_defined_id")
        assertThat(microDepositCreateResponse.verificationFailedReason())
            .contains("verification_failed_reason")
    }
}
