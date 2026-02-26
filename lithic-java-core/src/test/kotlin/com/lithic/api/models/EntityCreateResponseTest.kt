// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityCreateResponseTest {

    @Test
    fun create() {
        val entityCreateResponse =
            EntityCreateResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRequiredDocument(
                    RequiredDocument.builder()
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addStatusReason("string")
                        .addValidDocument("string")
                        .build()
                )
                .status(EntityCreateResponse.EntityStatus.ACCEPTED)
                .addStatusReason(EntityCreateResponse.StatusReasons.ADDRESS_VERIFICATION_FAILURE)
                .build()

        assertThat(entityCreateResponse.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(entityCreateResponse.accountHolderToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(entityCreateResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entityCreateResponse.requiredDocuments())
            .containsExactly(
                RequiredDocument.builder()
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addStatusReason("string")
                    .addValidDocument("string")
                    .build()
            )
        assertThat(entityCreateResponse.status())
            .isEqualTo(EntityCreateResponse.EntityStatus.ACCEPTED)
        assertThat(entityCreateResponse.statusReasons())
            .containsExactly(EntityCreateResponse.StatusReasons.ADDRESS_VERIFICATION_FAILURE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entityCreateResponse =
            EntityCreateResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRequiredDocument(
                    RequiredDocument.builder()
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addStatusReason("string")
                        .addValidDocument("string")
                        .build()
                )
                .status(EntityCreateResponse.EntityStatus.ACCEPTED)
                .addStatusReason(EntityCreateResponse.StatusReasons.ADDRESS_VERIFICATION_FAILURE)
                .build()

        val roundtrippedEntityCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entityCreateResponse),
                jacksonTypeRef<EntityCreateResponse>(),
            )

        assertThat(roundtrippedEntityCreateResponse).isEqualTo(entityCreateResponse)
    }
}
