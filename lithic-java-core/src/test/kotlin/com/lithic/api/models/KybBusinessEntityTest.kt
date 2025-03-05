// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class KybBusinessEntityTest {

    @Test
    fun createKybBusinessEntity() {
        val kybBusinessEntity =
            KybBusinessEntity.builder()
                .address(
                    KybBusinessEntity.Address.builder()
                        .address1("123 Old Forest Way")
                        .city("Omaha")
                        .country("USA")
                        .postalCode("68022")
                        .state("NE")
                        .address2("address2")
                        .build()
                )
                .governmentId("114-123-1513")
                .legalBusinessName("Acme, Inc.")
                .addPhoneNumber("+15555555555")
                .dbaBusinessName("dba_business_name")
                .parentCompany("parent_company")
                .build()
        assertThat(kybBusinessEntity).isNotNull
        assertThat(kybBusinessEntity.address())
            .isEqualTo(
                KybBusinessEntity.Address.builder()
                    .address1("123 Old Forest Way")
                    .city("Omaha")
                    .country("USA")
                    .postalCode("68022")
                    .state("NE")
                    .address2("address2")
                    .build()
            )
        assertThat(kybBusinessEntity.governmentId()).isEqualTo("114-123-1513")
        assertThat(kybBusinessEntity.legalBusinessName()).isEqualTo("Acme, Inc.")
        assertThat(kybBusinessEntity.phoneNumbers()).containsExactly("+15555555555")
        assertThat(kybBusinessEntity.dbaBusinessName()).contains("dba_business_name")
        assertThat(kybBusinessEntity.parentCompany()).contains("parent_company")
    }
}
