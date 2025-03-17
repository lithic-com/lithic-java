// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
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
internal class ExternalBankAccountServiceAsyncTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalBankAccountServiceAsync = client.externalBankAccounts()

        val externalBankAccountFuture =
            externalBankAccountServiceAsync.create(
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

        val externalBankAccount = externalBankAccountFuture.get()
        externalBankAccount.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalBankAccountServiceAsync = client.externalBankAccounts()

        val externalBankAccountFuture =
            externalBankAccountServiceAsync.retrieve(
                ExternalBankAccountRetrieveParams.builder()
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val externalBankAccount = externalBankAccountFuture.get()
        externalBankAccount.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalBankAccountServiceAsync = client.externalBankAccounts()

        val externalBankAccountFuture =
            externalBankAccountServiceAsync.update(
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

        val externalBankAccount = externalBankAccountFuture.get()
        externalBankAccount.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalBankAccountServiceAsync = client.externalBankAccounts()

        val pageFuture = externalBankAccountServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun retryMicroDeposits() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalBankAccountServiceAsync = client.externalBankAccounts()

        val responseFuture =
            externalBankAccountServiceAsync.retryMicroDeposits(
                ExternalBankAccountRetryMicroDepositsParams.builder()
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun retryPrenote() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val externalBankAccountServiceAsync = client.externalBankAccounts()

        val responseFuture =
            externalBankAccountServiceAsync.retryPrenote(
                ExternalBankAccountRetryPrenoteParams.builder()
                    .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
