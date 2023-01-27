package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FundingSourceCreateParamsTest {

    @Test
    fun createFundingSourceCreateParams() {
        FundingSourceCreateParams.builder()
            .forBank(
                FundingSourceCreateParams.Bank.builder()
                    .validationMethod(FundingSourceCreateParams.Bank.ValidationMethod.BANK)
                    .accountName("Sandbox")
                    .accountNumber("13719713158835300")
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .routingNumber("011103093")
                    .build()
            )
            .build()
    }

    @Test
    fun toBody() {
        val params =
            FundingSourceCreateParams.builder()
                .forBank(
                    FundingSourceCreateParams.Bank.builder()
                        .validationMethod(FundingSourceCreateParams.Bank.ValidationMethod.BANK)
                        .accountName("Sandbox")
                        .accountNumber("13719713158835300")
                        .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .routingNumber("011103093")
                        .build()
                )
                .build()
        val body = params.toBody()
        assertThat(body).isNotNull
    }

    @Test
    fun toBodyWithoutOptionalFields() {
        val params = FundingSourceCreateParams.builder().build()
        val body = params.toBody()
        assertThat(body).isNotNull
    }
}
