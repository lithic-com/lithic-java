package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class KycExemptTest {

    @Test
    fun createKycExempt() {
        val kycExempt =
            KycExempt.builder()
                .workflow(KycExempt.Workflow.KYC_EXEMPT)
                .kycExemptionType(KycExempt.KycExemptionType.AUTHORIZED_USER)
                .firstName("string")
                .lastName("string")
                .email("string")
                .phoneNumber("string")
                .businessAccountToken("string")
                .address(
                    Address.builder()
                        .address1("123 Old Forest Way")
                        .address2("string")
                        .city("Omaha")
                        .country("USA")
                        .postalCode("68022")
                        .state("NE")
                        .build()
                )
                .build()
        assertThat(kycExempt).isNotNull
        assertThat(kycExempt.workflow()).isEqualTo(KycExempt.Workflow.KYC_EXEMPT)
        assertThat(kycExempt.kycExemptionType())
            .isEqualTo(KycExempt.KycExemptionType.AUTHORIZED_USER)
        assertThat(kycExempt.firstName()).isEqualTo("string")
        assertThat(kycExempt.lastName()).isEqualTo("string")
        assertThat(kycExempt.email()).isEqualTo("string")
        assertThat(kycExempt.phoneNumber()).isEqualTo("string")
        assertThat(kycExempt.businessAccountToken()).contains("string")
        assertThat(kycExempt.address())
            .contains(
                Address.builder()
                    .address1("123 Old Forest Way")
                    .address2("string")
                    .city("Omaha")
                    .country("USA")
                    .postalCode("68022")
                    .state("NE")
                    .build()
            )
    }
}
