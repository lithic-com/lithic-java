// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.ExternalBankAccountAddress
import com.lithic.api.models.ExternalBankAccountCreateParams
import com.lithic.api.models.ExternalBankAccountRetrieveParams
import com.lithic.api.models.ExternalBankAccountRetryMicroDepositsParams
import com.lithic.api.models.ExternalBankAccountRetryPrenoteParams
import com.lithic.api.models.ExternalBankAccountUpdateParams
import com.lithic.api.models.OwnerType
import com.lithic.api.models.VerificationMethod
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalBankAccountServiceTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalBankAccountService = client.externalBankAccounts()

        val externalBankAccount =
            externalBankAccountService.create(
                ExternalBankAccountCreateParams.builder()
                    .body(
                        ExternalBankAccountCreateParams.Body.BankVerifiedCreateBankAccountApiRequest
                            .builder()
                            .accountNumber("12345678901234567")
                            .country("USD")
                            .currency("USD")
                            .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .owner("owner")
                            .ownerType(OwnerType.INDIVIDUAL)
                            .routingNumber("123456789")
                            .type(
                                ExternalBankAccountCreateParams.Body
                                    .BankVerifiedCreateBankAccountApiRequest
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
                            .companyId("sq")
                            .dob(LocalDate.parse("2019-12-27"))
                            .doingBusinessAs("x")
                            .name("name")
                            .userDefinedId("x")
                            .verificationEnforcement(true)
                            .build()
                    )
                    .build()
            )

        externalBankAccount.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalBankAccountService = client.externalBankAccounts()

        val externalBankAccount =
            externalBankAccountService.retrieve(
                ExternalBankAccountRetrieveParams.builder()
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        externalBankAccount.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalBankAccountService = client.externalBankAccounts()

        val externalBankAccount =
            externalBankAccountService.update(
                ExternalBankAccountUpdateParams.builder()
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                    .companyId("sq")
                    .dob(LocalDate.parse("2019-12-27"))
                    .doingBusinessAs("x")
                    .name("name")
                    .owner("owner")
                    .ownerType(OwnerType.INDIVIDUAL)
                    .type(ExternalBankAccountUpdateParams.AccountTypeExternal.CHECKING)
                    .userDefinedId("x")
                    .build()
            )

        externalBankAccount.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalBankAccountService = client.externalBankAccounts()

        val page = externalBankAccountService.list()

        page.response().validate()
    }

    @Test
    fun retryMicroDeposits() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalBankAccountService = client.externalBankAccounts()

        val response =
            externalBankAccountService.retryMicroDeposits(
                ExternalBankAccountRetryMicroDepositsParams.builder()
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Test
    fun retryPrenote() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalBankAccountService = client.externalBankAccounts()

        val response =
            externalBankAccountService.retryPrenote(
                ExternalBankAccountRetryPrenoteParams.builder()
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
