package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.*

class AccountHolderRetrieveParamsTest {

    @Test
    fun createAccountHolderRetrieveParams() {
      AccountHolderRetrieveParams.builder()
          .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = AccountHolderRetrieveParams.builder()
          .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      assertThat(params).isNotNull
      // path param "accountHolderToken"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
