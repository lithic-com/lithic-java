package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalBankAccountRetrieveResponseTest {

    @Test
    fun createExternalBankAccountRetrieveResponse() {
        val externalBankAccountRetrieveResponse =
            ExternalBankAccountRetrieveResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .country("string")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .lastFour("string")
                .owner("string")
                .ownerType(ExternalBankAccountRetrieveResponse.OwnerType.INDIVIDUAL)
                .routingNumber("string")
                .state(ExternalBankAccountRetrieveResponse.State.ENABLED)
                .type(ExternalBankAccountRetrieveResponse.Type.CHECKING)
                .verificationMethod(ExternalBankAccountRetrieveResponse.VerificationMethod.MANUAL)
                .verificationState(ExternalBankAccountRetrieveResponse.VerificationState.PENDING)
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
        assertThat(externalBankAccountRetrieveResponse).isNotNull
        assertThat(externalBankAccountRetrieveResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalBankAccountRetrieveResponse.country()).isEqualTo("string")
        assertThat(externalBankAccountRetrieveResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalBankAccountRetrieveResponse.currency()).isEqualTo("string")
        assertThat(externalBankAccountRetrieveResponse.lastFour()).isEqualTo("string")
        assertThat(externalBankAccountRetrieveResponse.owner()).isEqualTo("string")
        assertThat(externalBankAccountRetrieveResponse.ownerType())
            .isEqualTo(ExternalBankAccountRetrieveResponse.OwnerType.INDIVIDUAL)
        assertThat(externalBankAccountRetrieveResponse.routingNumber()).isEqualTo("string")
        assertThat(externalBankAccountRetrieveResponse.state())
            .isEqualTo(ExternalBankAccountRetrieveResponse.State.ENABLED)
        assertThat(externalBankAccountRetrieveResponse.type())
            .isEqualTo(ExternalBankAccountRetrieveResponse.Type.CHECKING)
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
                    .country("US")
                    .postalCode("11201")
                    .state("xx")
                    .address2("x")
                    .build()
            )
        assertThat(externalBankAccountRetrieveResponse.companyId()).contains("string")
        assertThat(externalBankAccountRetrieveResponse.dob())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(externalBankAccountRetrieveResponse.doingBusinessAs()).contains("string")
        assertThat(externalBankAccountRetrieveResponse.name()).contains("string")
    }
}
