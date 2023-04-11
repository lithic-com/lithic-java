package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.AccountHolder

class AccountHolderTest {

    @Test
    fun createAccountHolder() {
      val accountHolder = AccountHolder.builder()
          .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .status(AccountHolder.Status.ACCEPTED)
          .statusReasons(listOf(AccountHolder.StatusReason.ADDRESS_VERIFICATION_FAILURE))
          .build()
      assertThat(accountHolder).isNotNull
      assertThat(accountHolder.token()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(accountHolder.accountToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(accountHolder.businessAccountToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(accountHolder.status()).contains(AccountHolder.Status.ACCEPTED)
      assertThat(accountHolder.statusReasons().get()).containsExactly(AccountHolder.StatusReason.ADDRESS_VERIFICATION_FAILURE)
    }
}
