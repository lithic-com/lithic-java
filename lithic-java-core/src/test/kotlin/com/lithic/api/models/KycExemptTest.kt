// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KycExemptTest {

    @Test
    fun create() {
        val kycExempt =
            KycExempt.builder()
                .address(
                    Address.builder()
                        .address1("123 Old Forest Way")
                        .city("Omaha")
                        .country("USA")
                        .postalCode("68022")
                        .state("NE")
                        .address2("address2")
                        .build()
                )
                .email("email")
                .firstName("first_name")
                .kycExemptionType(KycExempt.KycExemptionType.AUTHORIZED_USER)
                .lastName("last_name")
                .phoneNumber("phone_number")
                .workflow(KycExempt.Workflow.KYC_EXEMPT)
                .businessAccountToken("business_account_token")
                .externalId("external_id")
                .build()

        assertThat(kycExempt.address())
            .isEqualTo(
                Address.builder()
                    .address1("123 Old Forest Way")
                    .city("Omaha")
                    .country("USA")
                    .postalCode("68022")
                    .state("NE")
                    .address2("address2")
                    .build()
            )
        assertThat(kycExempt.email()).isEqualTo("email")
        assertThat(kycExempt.firstName()).isEqualTo("first_name")
        assertThat(kycExempt.kycExemptionType())
            .isEqualTo(KycExempt.KycExemptionType.AUTHORIZED_USER)
        assertThat(kycExempt.lastName()).isEqualTo("last_name")
        assertThat(kycExempt.phoneNumber()).isEqualTo("phone_number")
        assertThat(kycExempt.workflow()).isEqualTo(KycExempt.Workflow.KYC_EXEMPT)
        assertThat(kycExempt.businessAccountToken()).contains("business_account_token")
        assertThat(kycExempt.externalId()).contains("external_id")
    }
}
