// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BusinessAccountTest {

    @Test
    fun createBusinessAccount() {
        val businessAccount =
            BusinessAccount.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .collectionsConfiguration(
                    BusinessAccount.AccountHolderCollectionsConfiguration.builder()
                        .billingPeriod(123L)
                        .paymentPeriod(123L)
                        .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .creditLimit(123L)
                .build()
        assertThat(businessAccount).isNotNull
        assertThat(businessAccount.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(businessAccount.collectionsConfiguration())
            .contains(
                BusinessAccount.AccountHolderCollectionsConfiguration.builder()
                    .billingPeriod(123L)
                    .paymentPeriod(123L)
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(businessAccount.creditLimit()).contains(123L)
    }
}
