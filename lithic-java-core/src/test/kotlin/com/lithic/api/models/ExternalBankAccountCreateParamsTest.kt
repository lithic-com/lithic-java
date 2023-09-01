package com.lithic.api.models

import com.lithic.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalBankAccountCreateParamsTest {

    @Test
    fun createExternalBankAccountCreateParams() {
        ExternalBankAccountCreateParams.builder()
            .forPlaidCreateBankAccountApiRequest(
                ExternalBankAccountCreateParams.PlaidCreateBankAccountApiRequest.builder()
                    .owner("x")
                    .ownerType(OwnerType.INDIVIDUAL)
                    .processorToken("x")
                    .verificationMethod(VerificationMethod.MANUAL)
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .companyId("x")
                    .dob(LocalDate.parse("2019-12-27"))
                    .doingBusinessAs("string")
                    .userDefinedId("string")
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExternalBankAccountCreateParams.builder()
                .forPlaidCreateBankAccountApiRequest(
                    ExternalBankAccountCreateParams.PlaidCreateBankAccountApiRequest.builder()
                        .owner("x")
                        .ownerType(OwnerType.INDIVIDUAL)
                        .processorToken("x")
                        .verificationMethod(VerificationMethod.MANUAL)
                        .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .companyId("x")
                        .dob(LocalDate.parse("2019-12-27"))
                        .doingBusinessAs("string")
                        .userDefinedId("string")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ExternalBankAccountCreateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
