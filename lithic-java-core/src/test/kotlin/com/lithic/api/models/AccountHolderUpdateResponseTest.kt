// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountHolderUpdateResponseTest {

    @Test
    fun ofKybKycPatch() {
        val kybKycPatch = AccountHolderUpdateResponse.KybKycPatchResponse.builder().build()

        val accountHolderUpdateResponse = AccountHolderUpdateResponse.ofKybKycPatch(kybKycPatch)

        assertThat(accountHolderUpdateResponse.kybKycPatch()).contains(kybKycPatch)
        assertThat(accountHolderUpdateResponse.patch()).isEmpty
    }

    @Test
    fun ofPatch() {
        val patch = AccountHolderUpdateResponse.PatchResponse.builder().build()

        val accountHolderUpdateResponse = AccountHolderUpdateResponse.ofPatch(patch)

        assertThat(accountHolderUpdateResponse.kybKycPatch()).isEmpty
        assertThat(accountHolderUpdateResponse.patch()).contains(patch)
    }
}
