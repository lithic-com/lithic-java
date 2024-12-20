// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalBankAccountUpdateParamsTest {

    @Test
    fun createExternalBankAccountUpdateParams() {
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
            .companyId("x")
            .dob(LocalDate.parse("2019-12-27"))
            .doingBusinessAs("x")
            .name("x")
            .owner("x")
            .ownerType(OwnerType.INDIVIDUAL)
            .userDefinedId("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
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
                .companyId("x")
                .dob(LocalDate.parse("2019-12-27"))
                .doingBusinessAs("x")
                .name("x")
                .owner("x")
                .ownerType(OwnerType.INDIVIDUAL)
                .userDefinedId("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.address())
            .contains(
                ExternalBankAccountAddress.builder()
                    .address1("x")
                    .city("x")
                    .country("USD")
                    .postalCode("11201")
                    .state("xx")
                    .address2("x")
                    .build()
            )
        assertThat(body.companyId()).contains("x")
        assertThat(body.dob()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.doingBusinessAs()).contains("x")
        assertThat(body.name()).contains("x")
        assertThat(body.owner()).contains("x")
        assertThat(body.ownerType()).contains(OwnerType.INDIVIDUAL)
        assertThat(body.userDefinedId()).contains("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ExternalBankAccountUpdateParams.builder()
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            ExternalBankAccountUpdateParams.builder()
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "externalBankAccountToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
