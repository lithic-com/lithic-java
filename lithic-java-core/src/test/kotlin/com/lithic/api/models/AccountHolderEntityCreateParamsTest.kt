// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountHolderEntityCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            AccountHolderEntityCreateParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .address(
                    AccountHolderEntityCreateParams.Address.builder()
                        .address1("300 Normal Forest Way")
                        .city("Portland")
                        .country("USA")
                        .postalCode("90210")
                        .state("OR")
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

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.address())
            .isEqualTo(
                AccountHolderEntityCreateParams.Address.builder()
                    .address1("300 Normal Forest Way")
                    .city("Portland")
                    .country("USA")
                    .postalCode("90210")
                    .state("OR")
                    .address2("address2")
                    .build()
            )
        assertThat(body.dob()).isEqualTo("1991-03-08T08:00:00Z")
        assertThat(body.email()).isEqualTo("tim@left-earth.com")
        assertThat(body.firstName()).isEqualTo("Timmy")
        assertThat(body.governmentId()).isEqualTo("211-23-1412")
        assertThat(body.lastName()).isEqualTo("Turner")
        assertThat(body.phoneNumber()).isEqualTo("+15555555555")
        assertThat(body.type())
            .isEqualTo(AccountHolderEntityCreateParams.EntityType.BENEFICIAL_OWNER_INDIVIDUAL)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountHolderEntityCreateParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .address(
                    AccountHolderEntityCreateParams.Address.builder()
                        .address1("300 Normal Forest Way")
                        .city("Portland")
                        .country("USA")
                        .postalCode("90210")
                        .state("OR")
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

        val body = params._body()

        assertThat(body.address())
            .isEqualTo(
                AccountHolderEntityCreateParams.Address.builder()
                    .address1("300 Normal Forest Way")
                    .city("Portland")
                    .country("USA")
                    .postalCode("90210")
                    .state("OR")
                    .build()
            )
        assertThat(body.dob()).isEqualTo("1991-03-08T08:00:00Z")
        assertThat(body.email()).isEqualTo("tim@left-earth.com")
        assertThat(body.firstName()).isEqualTo("Timmy")
        assertThat(body.governmentId()).isEqualTo("211-23-1412")
        assertThat(body.lastName()).isEqualTo("Turner")
        assertThat(body.phoneNumber()).isEqualTo("+15555555555")
        assertThat(body.type())
            .isEqualTo(AccountHolderEntityCreateParams.EntityType.BENEFICIAL_OWNER_INDIVIDUAL)
    }
}
