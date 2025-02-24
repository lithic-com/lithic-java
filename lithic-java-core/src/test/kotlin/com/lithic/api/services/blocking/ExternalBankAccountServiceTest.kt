// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.ExternalBankAccountAddress
import com.lithic.api.models.ExternalBankAccountCreateParams
import com.lithic.api.models.ExternalBankAccountListParams
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
class ExternalBankAccountServiceTest {

    @Test
    fun callCreate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalBankAccountService = client.externalBankAccounts()
        val externalBankAccountCreateResponse =
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
        println(externalBankAccountCreateResponse)
        externalBankAccountCreateResponse.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalBankAccountService = client.externalBankAccounts()
        val externalBankAccountRetrieveResponse =
            externalBankAccountService.retrieve(
                ExternalBankAccountRetrieveParams.builder()
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(externalBankAccountRetrieveResponse)
        externalBankAccountRetrieveResponse.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalBankAccountService = client.externalBankAccounts()
        val externalBankAccountUpdateResponse =
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
        println(externalBankAccountUpdateResponse)
        externalBankAccountUpdateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalBankAccountService = client.externalBankAccounts()
        val bankAccountsApiResponse =
            externalBankAccountService.list(ExternalBankAccountListParams.builder().build())
        println(bankAccountsApiResponse)
        bankAccountsApiResponse.data().forEach { it.validate() }
    }

    @Test
    fun callRetryMicroDeposits() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalBankAccountService = client.externalBankAccounts()
        val externalBankAccountRetryMicroDepositsResponse =
            externalBankAccountService.retryMicroDeposits(
                ExternalBankAccountRetryMicroDepositsParams.builder()
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(externalBankAccountRetryMicroDepositsResponse)
        externalBankAccountRetryMicroDepositsResponse.validate()
    }

    @Test
    fun callRetryPrenote() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalBankAccountService = client.externalBankAccounts()
        val externalBankAccountRetryPrenoteResponse =
            externalBankAccountService.retryPrenote(
                ExternalBankAccountRetryPrenoteParams.builder()
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(externalBankAccountRetryPrenoteResponse)
        externalBankAccountRetryPrenoteResponse.validate()
    }
}
