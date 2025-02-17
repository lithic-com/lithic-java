// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalBankAccountUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
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
                .companyId("sq")
                .dob(LocalDate.parse("2019-12-27"))
                .doingBusinessAs("x")
                .name("name")
                .owner("owner")
                .ownerType(OwnerType.INDIVIDUAL)
                .type(ExternalBankAccountUpdateParams.AccountTypeExternal.CHECKING)
                .userDefinedId("x")
                .build()
        val body = params._body()
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
        assertThat(body.companyId()).contains("sq")
        assertThat(body.dob()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.doingBusinessAs()).contains("x")
        assertThat(body.name()).contains("name")
        assertThat(body.owner()).contains("owner")
        assertThat(body.ownerType()).contains(OwnerType.INDIVIDUAL)
        assertThat(body.type())
            .contains(ExternalBankAccountUpdateParams.AccountTypeExternal.CHECKING)
        assertThat(body.userDefinedId()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalBankAccountUpdateParams.builder()
                .externalBankAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params._body()
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
