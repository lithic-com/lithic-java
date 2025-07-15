// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalResourceTest {

    @Test
    fun create() {
        val externalResource =
            ExternalResource.builder()
                .externalResourceToken("external_resource_token")
                .externalResourceType(ExternalResourceType.STATEMENT)
                .externalResourceSubToken("external_resource_sub_token")
                .build()

        assertThat(externalResource.externalResourceToken()).isEqualTo("external_resource_token")
        assertThat(externalResource.externalResourceType())
            .isEqualTo(ExternalResourceType.STATEMENT)
        assertThat(externalResource.externalResourceSubToken())
            .contains("external_resource_sub_token")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalResource =
            ExternalResource.builder()
                .externalResourceToken("external_resource_token")
                .externalResourceType(ExternalResourceType.STATEMENT)
                .externalResourceSubToken("external_resource_sub_token")
                .build()

        val roundtrippedExternalResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalResource),
                jacksonTypeRef<ExternalResource>(),
            )

        assertThat(roundtrippedExternalResource).isEqualTo(externalResource)
    }
}
