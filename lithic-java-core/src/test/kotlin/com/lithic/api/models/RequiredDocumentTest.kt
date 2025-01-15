// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RequiredDocumentTest {

    @Test
    fun createRequiredDocument() {
        val requiredDocument =
            RequiredDocument.builder()
                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addStatusReason("string")
                .addValidDocument("string")
                .build()
        assertThat(requiredDocument).isNotNull
        assertThat(requiredDocument.entityToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(requiredDocument.statusReasons()).containsExactly("string")
        assertThat(requiredDocument.validDocuments()).containsExactly("string")
    }
}
