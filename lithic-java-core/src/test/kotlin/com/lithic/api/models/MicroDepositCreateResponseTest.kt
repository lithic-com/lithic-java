package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MicroDepositCreateResponseTest {

    @Test
    fun createMicroDepositCreateResponse() {
        val microDepositCreateResponse =
            MicroDepositCreateResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("string")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .lastFour("string")
                .owner("string")
                .ownerType(MicroDepositCreateResponse.OwnerType.INDIVIDUAL)
                .routingNumber("string")
                .state(MicroDepositCreateResponse.State.ENABLED)
                .type(MicroDepositCreateResponse.Type.CHECKING)
                .verificationMethod(MicroDepositCreateResponse.VerificationMethod.MANUAL)
                .verificationState(MicroDepositCreateResponse.VerificationState.PENDING)
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .address(
                    ExternalBankAccountAddress.builder()
                        .address1("x")
                        .city("x")
                        .country("US")
                        .postalCode("11201")
                        .state("xx")
                        .address2("x")
                        .build()
                )
                .companyId("string")
                .dob(LocalDate.parse("2019-12-27"))
                .doingBusinessAs("string")
                .name("string")
                .build()
        assertThat(microDepositCreateResponse).isNotNull
        assertThat(microDepositCreateResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(microDepositCreateResponse.country()).isEqualTo("string")
        assertThat(microDepositCreateResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(microDepositCreateResponse.currency()).isEqualTo("string")
        assertThat(microDepositCreateResponse.lastFour()).isEqualTo("string")
        assertThat(microDepositCreateResponse.owner()).isEqualTo("string")
        assertThat(microDepositCreateResponse.ownerType())
            .isEqualTo(MicroDepositCreateResponse.OwnerType.INDIVIDUAL)
        assertThat(microDepositCreateResponse.routingNumber()).isEqualTo("string")
        assertThat(microDepositCreateResponse.state())
            .isEqualTo(MicroDepositCreateResponse.State.ENABLED)
        assertThat(microDepositCreateResponse.type())
            .isEqualTo(MicroDepositCreateResponse.Type.CHECKING)
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
                    .country("US")
                    .postalCode("11201")
                    .state("xx")
                    .address2("x")
                    .build()
            )
        assertThat(microDepositCreateResponse.companyId()).contains("string")
        assertThat(microDepositCreateResponse.dob()).contains(LocalDate.parse("2019-12-27"))
        assertThat(microDepositCreateResponse.doingBusinessAs()).contains("string")
        assertThat(microDepositCreateResponse.name()).contains("string")
    }
}
