// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalBankAccountCreateParamsTest {

    @Test
    fun create() {
        ExternalBankAccountCreateParams.builder()
            .body(
                ExternalBankAccountCreateParams.Body.BankVerifiedCreateBankAccountApiRequest
                    .builder()
                    .accountNumber("13719713158835300")
                    .country("USA")
                    .currency("USD")
                    .financialAccountToken("dabadb3b-700c-41e3-8801-d5dfc84ebea0")
                    .owner("John Doe")
                    .ownerType(OwnerType.BUSINESS)
                    .routingNumber("011103093")
                    .type(
                        ExternalBankAccountCreateParams.Body.BankVerifiedCreateBankAccountApiRequest
                            .AccountType
                            .CHECKING
                    )
                    .verificationMethod(VerificationMethod.PRENOTE)
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .address(
                        ExternalBankAccountAddress.builder()
                            .address1("5 Broad Street")
                            .city("New York")
                            .country("USA")
                            .postalCode("10001")
                            .state("NY")
                            .address2("x")
                            .build()
                    )
                    .companyId("sq")
                    .dob(LocalDate.parse("2019-12-27"))
                    .doingBusinessAs("x")
                    .name("John Does Checking")
                    .userDefinedId("x")
                    .verificationEnforcement(true)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ExternalBankAccountCreateParams.builder()
                .body(
                    ExternalBankAccountCreateParams.Body.BankVerifiedCreateBankAccountApiRequest
                        .builder()
                        .accountNumber("13719713158835300")
                        .country("USA")
                        .currency("USD")
                        .financialAccountToken("dabadb3b-700c-41e3-8801-d5dfc84ebea0")
                        .owner("John Doe")
                        .ownerType(OwnerType.BUSINESS)
                        .routingNumber("011103093")
                        .type(
                            ExternalBankAccountCreateParams.Body
                                .BankVerifiedCreateBankAccountApiRequest
                                .AccountType
                                .CHECKING
                        )
                        .verificationMethod(VerificationMethod.PRENOTE)
                        .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .address(
                            ExternalBankAccountAddress.builder()
                                .address1("5 Broad Street")
                                .city("New York")
                                .country("USA")
                                .postalCode("10001")
                                .state("NY")
                                .address2("x")
                                .build()
                        )
                        .companyId("sq")
                        .dob(LocalDate.parse("2019-12-27"))
                        .doingBusinessAs("x")
                        .name("John Does Checking")
                        .userDefinedId("x")
                        .verificationEnforcement(true)
                        .build()
                )
                .build()

        val body = params._body().getOrNull()

        assertThat(body)
            .isEqualTo(
                ExternalBankAccountCreateParams.Body.ofBankVerifiedCreateBankAccountApiRequest(
                    ExternalBankAccountCreateParams.Body.BankVerifiedCreateBankAccountApiRequest
                        .builder()
                        .accountNumber("13719713158835300")
                        .country("USA")
                        .currency("USD")
                        .financialAccountToken("dabadb3b-700c-41e3-8801-d5dfc84ebea0")
                        .owner("John Doe")
                        .ownerType(OwnerType.BUSINESS)
                        .routingNumber("011103093")
                        .type(
                            ExternalBankAccountCreateParams.Body
                                .BankVerifiedCreateBankAccountApiRequest
                                .AccountType
                                .CHECKING
                        )
                        .verificationMethod(VerificationMethod.PRENOTE)
                        .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .address(
                            ExternalBankAccountAddress.builder()
                                .address1("5 Broad Street")
                                .city("New York")
                                .country("USA")
                                .postalCode("10001")
                                .state("NY")
                                .address2("x")
                                .build()
                        )
                        .companyId("sq")
                        .dob(LocalDate.parse("2019-12-27"))
                        .doingBusinessAs("x")
                        .name("John Does Checking")
                        .userDefinedId("x")
                        .verificationEnforcement(true)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ExternalBankAccountCreateParams.builder().build()

        val body = params._body().getOrNull()
    }
}
