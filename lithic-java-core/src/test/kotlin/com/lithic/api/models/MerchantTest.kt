// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MerchantTest {

    @Test
    fun create() {
        val merchant =
            Merchant.builder()
                .acceptorId("333301802529120")
                .acquiringInstitutionId("191231")
                .city("NEW YORK")
                .country("USA")
                .descriptor("COFFEE SHOP")
                .mcc("5812")
                .state("NY")
                .build()

        assertThat(merchant.acceptorId()).isEqualTo("333301802529120")
        assertThat(merchant.acquiringInstitutionId()).isEqualTo("191231")
        assertThat(merchant.city()).isEqualTo("NEW YORK")
        assertThat(merchant.country()).isEqualTo("USA")
        assertThat(merchant.descriptor()).isEqualTo("COFFEE SHOP")
        assertThat(merchant.mcc()).isEqualTo("5812")
        assertThat(merchant.state()).isEqualTo("NY")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val merchant =
            Merchant.builder()
                .acceptorId("333301802529120")
                .acquiringInstitutionId("191231")
                .city("NEW YORK")
                .country("USA")
                .descriptor("COFFEE SHOP")
                .mcc("5812")
                .state("NY")
                .build()

        val roundtrippedMerchant =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(merchant),
                jacksonTypeRef<Merchant>(),
            )

        assertThat(roundtrippedMerchant).isEqualTo(merchant)
    }
}
