// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequiredDocumentTest {

    @Test
    fun create() {
        val requiredDocument =
            RequiredDocument.builder()
                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addStatusReason("string")
                .addValidDocument("string")
                .build()

        assertThat(requiredDocument.entityToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(requiredDocument.statusReasons()).containsExactly("string")
        assertThat(requiredDocument.validDocuments()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val requiredDocument =
            RequiredDocument.builder()
                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addStatusReason("string")
                .addValidDocument("string")
                .build()

        val roundtrippedRequiredDocument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(requiredDocument),
                jacksonTypeRef<RequiredDocument>(),
            )

        assertThat(roundtrippedRequiredDocument).isEqualTo(requiredDocument)
    }
}
