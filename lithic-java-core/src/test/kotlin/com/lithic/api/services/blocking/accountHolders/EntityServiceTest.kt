// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.accountHolders

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.AccountHolderEntityCreateParams
import com.lithic.api.models.AccountHolderEntityDeleteParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EntityServiceTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val entityService = client.accountHolders().entities()

        val entity =
            entityService.create(
                AccountHolderEntityCreateParams.builder()
                    .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .address(
                        AccountHolderEntityCreateParams.Address.builder()
                            .address1("300 Normal Forest Way")
                            .city("Portland")
                            .country("USA")
                            .postalCode("90210")
                            .state("OR")
                            .address2("address2")
                            .build()
                    )
                    .dob("1991-03-08T08:00:00Z")
                    .email("tim@left-earth.com")
                    .firstName("Timmy")
                    .governmentId("211-23-1412")
                    .lastName("Turner")
                    .phoneNumber("+15555555555")
                    .type(AccountHolderEntityCreateParams.EntityType.BENEFICIAL_OWNER_INDIVIDUAL)
                    .build()
            )

        entity.validate()
    }

    @Test
    fun delete() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val entityService = client.accountHolders().entities()

        val accountHolderEntity =
            entityService.delete(
                AccountHolderEntityDeleteParams.builder()
                    .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        accountHolderEntity.validate()
    }
}
