// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadConstraintsTest {

    @Test
    fun create() {
        val uploadConstraints =
            UploadConstraints.builder().addAcceptedMimeType("string").maxSizeBytes(0L).build()

        assertThat(uploadConstraints.acceptedMimeTypes()).containsExactly("string")
        assertThat(uploadConstraints.maxSizeBytes()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uploadConstraints =
            UploadConstraints.builder().addAcceptedMimeType("string").maxSizeBytes(0L).build()

        val roundtrippedUploadConstraints =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uploadConstraints),
                jacksonTypeRef<UploadConstraints>(),
            )

        assertThat(roundtrippedUploadConstraints).isEqualTo(uploadConstraints)
    }
}
