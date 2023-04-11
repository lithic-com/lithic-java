package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.*
import com.lithic.api.models.AccountHolderUpdateParams.AccountHolderUpdateBody

class AccountHolderUpdateParamsTest {

    @Test
    fun createAccountHolderUpdateParams() {
      AccountHolderUpdateParams.builder()
          .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .email("string")
          .phoneNumber("string")
          .businessAccountToken("string")
          .build()
    }

    @Test
    fun getBody() {
      val params = AccountHolderUpdateParams.builder()
          .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .email("string")
          .phoneNumber("string")
          .businessAccountToken("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.email()).isEqualTo("string")
      assertThat(body.phoneNumber()).isEqualTo("string")
      assertThat(body.businessAccountToken()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = AccountHolderUpdateParams.builder()
          .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = AccountHolderUpdateParams.builder()
          .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      assertThat(params).isNotNull
      // path param "accountHolderToken"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
