// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import java.time.LocalDate
import org.junit.jupiter.api.Test

class ExternalBankAccountCreateParamsTest {

    @Test
    fun createExternalBankAccountCreateParams() {
        ExternalBankAccountCreateParams.builder()
            .forBankVerifiedCreateBankAccountApiRequest(
                ExternalBankAccountCreateParams.BankVerifiedCreateBankAccountApiRequest.builder()
                    .accountNumber("12345678901234567")
                    .country("USD")
                    .currency("USD")
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .owner("x")
                    .ownerType(OwnerType.BUSINESS)
                    .routingNumber("123456789")
                    .type(
                        ExternalBankAccountCreateParams.BankVerifiedCreateBankAccountApiRequest
                            .AccountType
                            .CHECKING
                    )
                    .verificationMethod(VerificationMethod.MANUAL)
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .address(
                        ExternalBankAccountAddress.builder()
                            .address1("x")
                            .city("x")
                            .country("USD")
                            .postalCode("11201")
                            .state("xx")
                            .address2("x")
                            .build()
                    )
                    .companyId("x")
                    .dob(LocalDate.parse("2019-12-27"))
                    .doingBusinessAs("string")
                    .name("x")
                    .userDefinedId("string")
                    .verificationEnforcement(true)
                    .build()
            )
            .build()
    }
}
