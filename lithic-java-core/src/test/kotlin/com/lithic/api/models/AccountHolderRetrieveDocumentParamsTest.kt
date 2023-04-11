package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.*

class AccountHolderRetrieveDocumentParamsTest {

    @Test
    fun createAccountHolderRetrieveDocumentParams() {
      AccountHolderRetrieveDocumentParams.builder()
          .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .documentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = AccountHolderRetrieveDocumentParams.builder()
          .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .documentToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      assertThat(params).isNotNull
      // path param "accountHolderToken"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // path param "documentToken"
      assertThat(params.getPathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
