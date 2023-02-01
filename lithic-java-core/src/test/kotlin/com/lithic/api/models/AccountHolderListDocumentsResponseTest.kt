package com.lithic.api.models

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.AccountHolderListDocumentsResponse

class AccountHolderListDocumentsResponseTest {

    @Test
    fun createAccountHolderListDocumentsResponse() {
      val accountHolderListDocumentsResponse = AccountHolderListDocumentsResponse.builder()
          .data(listOf(AccountHolderDocument.builder()
              .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .documentType(AccountHolderDocument.DocumentType.COMMERCIAL_LICENSE)
              .requiredDocumentUploads(listOf(AccountHolderDocument.RequiredDocumentUpload.builder()
                  .imageType(AccountHolderDocument.RequiredDocumentUpload.ImageType.BACK)
                  .status(AccountHolderDocument.RequiredDocumentUpload.Status.COMPLETED)
                  .statusReasons(listOf(AccountHolderDocument.RequiredDocumentUpload.StatusReason.BACK_IMAGE_BLURRY))
                  .uploadUrl("string")
                  .build()))
              .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .build()))
          .build()
      assertThat(accountHolderListDocumentsResponse).isNotNull
      assertThat(accountHolderListDocumentsResponse.data().get()).containsExactly(AccountHolderDocument.builder()
          .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .documentType(AccountHolderDocument.DocumentType.COMMERCIAL_LICENSE)
          .requiredDocumentUploads(listOf(AccountHolderDocument.RequiredDocumentUpload.builder()
              .imageType(AccountHolderDocument.RequiredDocumentUpload.ImageType.BACK)
              .status(AccountHolderDocument.RequiredDocumentUpload.Status.COMPLETED)
              .statusReasons(listOf(AccountHolderDocument.RequiredDocumentUpload.StatusReason.BACK_IMAGE_BLURRY))
              .uploadUrl("string")
              .build()))
          .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build())
    }
}
