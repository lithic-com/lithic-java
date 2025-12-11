// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountHolderCreatedWebhookEventTest {

    @Test
    fun create() {
        val accountHolderCreatedWebhookEvent =
            AccountHolderCreatedWebhookEvent.builder()
                .eventType(AccountHolderCreatedWebhookEvent.EventType.ACCOUNT_HOLDER_CREATED)
                .token("00000000-0000-0000-0000-000000000001")
                .accountToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRequiredDocument(
                    RequiredDocument.builder()
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addStatusReason("string")
                        .addValidDocument("string")
                        .build()
                )
                .status(AccountHolderCreatedWebhookEvent.Status.ACCEPTED)
                .addStatusReason("string")
                .build()

        assertThat(accountHolderCreatedWebhookEvent.eventType())
            .isEqualTo(AccountHolderCreatedWebhookEvent.EventType.ACCOUNT_HOLDER_CREATED)
        assertThat(accountHolderCreatedWebhookEvent.token())
            .contains("00000000-0000-0000-0000-000000000001")
        assertThat(accountHolderCreatedWebhookEvent.accountToken())
            .contains("00000000-0000-0000-0000-000000000001")
        assertThat(accountHolderCreatedWebhookEvent.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountHolderCreatedWebhookEvent.requiredDocuments().getOrNull())
            .containsExactly(
                RequiredDocument.builder()
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addStatusReason("string")
                    .addValidDocument("string")
                    .build()
            )
        assertThat(accountHolderCreatedWebhookEvent.status())
            .contains(AccountHolderCreatedWebhookEvent.Status.ACCEPTED)
        assertThat(accountHolderCreatedWebhookEvent.statusReason().getOrNull())
            .containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountHolderCreatedWebhookEvent =
            AccountHolderCreatedWebhookEvent.builder()
                .eventType(AccountHolderCreatedWebhookEvent.EventType.ACCOUNT_HOLDER_CREATED)
                .token("00000000-0000-0000-0000-000000000001")
                .accountToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRequiredDocument(
                    RequiredDocument.builder()
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addStatusReason("string")
                        .addValidDocument("string")
                        .build()
                )
                .status(AccountHolderCreatedWebhookEvent.Status.ACCEPTED)
                .addStatusReason("string")
                .build()

        val roundtrippedAccountHolderCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountHolderCreatedWebhookEvent),
                jacksonTypeRef<AccountHolderCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedAccountHolderCreatedWebhookEvent)
            .isEqualTo(accountHolderCreatedWebhookEvent)
    }
}
