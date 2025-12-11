// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountHolderDocumentUpdatedWebhookEventTest {

    @Test
    fun create() {
        val accountHolderDocumentUpdatedWebhookEvent =
            AccountHolderDocumentUpdatedWebhookEvent.builder()
                .eventType(
                    AccountHolderDocumentUpdatedWebhookEvent.EventType
                        .ACCOUNT_HOLDER_DOCUMENT_UPDATED
                )
                .token("9175a05c-a9da-4082-8e14-9296427ebba7")
                .accountHolderToken("2b52494a-ae73-4ab1-97e8-2dd1d51d18b0")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .documentType(AccountHolderDocumentUpdatedWebhookEvent.DocumentType.DRIVERS_LICENSE)
                .entityToken("c5f2d594-d957-4781-8877-fbea31f5944a")
                .addRequiredDocumentUpload(
                    AccountHolderDocumentUpdatedWebhookEvent.RequiredDocumentUpload.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addAcceptedEntityStatusReason("string")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .imageType(
                            AccountHolderDocumentUpdatedWebhookEvent.RequiredDocumentUpload
                                .ImageType
                                .FRONT
                        )
                        .addRejectedEntityStatusReason("string")
                        .status(
                            AccountHolderDocumentUpdatedWebhookEvent.RequiredDocumentUpload
                                .DocumentUploadStatus
                                .ACCEPTED
                        )
                        .addStatusReason("string")
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(accountHolderDocumentUpdatedWebhookEvent.eventType())
            .isEqualTo(
                AccountHolderDocumentUpdatedWebhookEvent.EventType.ACCOUNT_HOLDER_DOCUMENT_UPDATED
            )
        assertThat(accountHolderDocumentUpdatedWebhookEvent.token())
            .contains("9175a05c-a9da-4082-8e14-9296427ebba7")
        assertThat(accountHolderDocumentUpdatedWebhookEvent.accountHolderToken())
            .contains("2b52494a-ae73-4ab1-97e8-2dd1d51d18b0")
        assertThat(accountHolderDocumentUpdatedWebhookEvent.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountHolderDocumentUpdatedWebhookEvent.documentType())
            .contains(AccountHolderDocumentUpdatedWebhookEvent.DocumentType.DRIVERS_LICENSE)
        assertThat(accountHolderDocumentUpdatedWebhookEvent.entityToken())
            .contains("c5f2d594-d957-4781-8877-fbea31f5944a")
        assertThat(accountHolderDocumentUpdatedWebhookEvent.requiredDocumentUploads().getOrNull())
            .containsExactly(
                AccountHolderDocumentUpdatedWebhookEvent.RequiredDocumentUpload.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addAcceptedEntityStatusReason("string")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .imageType(
                        AccountHolderDocumentUpdatedWebhookEvent.RequiredDocumentUpload.ImageType
                            .FRONT
                    )
                    .addRejectedEntityStatusReason("string")
                    .status(
                        AccountHolderDocumentUpdatedWebhookEvent.RequiredDocumentUpload
                            .DocumentUploadStatus
                            .ACCEPTED
                    )
                    .addStatusReason("string")
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountHolderDocumentUpdatedWebhookEvent =
            AccountHolderDocumentUpdatedWebhookEvent.builder()
                .eventType(
                    AccountHolderDocumentUpdatedWebhookEvent.EventType
                        .ACCOUNT_HOLDER_DOCUMENT_UPDATED
                )
                .token("9175a05c-a9da-4082-8e14-9296427ebba7")
                .accountHolderToken("2b52494a-ae73-4ab1-97e8-2dd1d51d18b0")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .documentType(AccountHolderDocumentUpdatedWebhookEvent.DocumentType.DRIVERS_LICENSE)
                .entityToken("c5f2d594-d957-4781-8877-fbea31f5944a")
                .addRequiredDocumentUpload(
                    AccountHolderDocumentUpdatedWebhookEvent.RequiredDocumentUpload.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addAcceptedEntityStatusReason("string")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .imageType(
                            AccountHolderDocumentUpdatedWebhookEvent.RequiredDocumentUpload
                                .ImageType
                                .FRONT
                        )
                        .addRejectedEntityStatusReason("string")
                        .status(
                            AccountHolderDocumentUpdatedWebhookEvent.RequiredDocumentUpload
                                .DocumentUploadStatus
                                .ACCEPTED
                        )
                        .addStatusReason("string")
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedAccountHolderDocumentUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountHolderDocumentUpdatedWebhookEvent),
                jacksonTypeRef<AccountHolderDocumentUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedAccountHolderDocumentUpdatedWebhookEvent)
            .isEqualTo(accountHolderDocumentUpdatedWebhookEvent)
    }
}
