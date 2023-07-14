package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class KycExemptTest {

    @Test
    fun createKycExempt() {
        val kycExempt =
            KycExempt.builder()
                .email("string")
                .firstName("string")
                .kycExemptionType(KycExempt.KycExemptionType.AUTHORIZED_USER)
                .lastName("string")
                .phoneNumber("string")
                .workflow(KycExempt.Workflow.KYC_EXEMPT)
                .address(
                    Address.builder()
                        .address1("123 Old Forest Way")
                        .city("Omaha")
                        .country("USA")
                        .postalCode("68022")
                        .state("NE")
                        .address2("string")
                        .build()
                )
                .businessAccountToken("string")
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
                    .city("Omaha")
                    .country("USA")
                    .postalCode("68022")
                    .state("NE")
                    .address2("string")
                    .build()
            )
    }
}
