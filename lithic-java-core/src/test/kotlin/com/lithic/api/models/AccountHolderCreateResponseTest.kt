// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderCreateResponseTest {

    @Test
    fun createAccountHolderCreateResponse() {
        val accountHolderCreateResponse =
            AccountHolderCreateResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(AccountHolderCreateResponse.Status.ACCEPTED)
                .statusReasons(
                    listOf(AccountHolderCreateResponse.StatusReason.ADDRESS_VERIFICATION_FAILURE)
                )
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .build()
        assertThat(accountHolderCreateResponse).isNotNull
        assertThat(accountHolderCreateResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderCreateResponse.accountToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderCreateResponse.status())
            .isEqualTo(AccountHolderCreateResponse.Status.ACCEPTED)
        assertThat(accountHolderCreateResponse.statusReasons())
            .containsExactly(AccountHolderCreateResponse.StatusReason.ADDRESS_VERIFICATION_FAILURE)
        assertThat(accountHolderCreateResponse.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountHolderCreateResponse.externalId()).contains("external_id")
    }
}
