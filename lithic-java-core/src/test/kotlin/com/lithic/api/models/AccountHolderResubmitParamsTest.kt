// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderResubmitParamsTest {

    @Test
    fun createAccountHolderResubmitParams() {
        AccountHolderResubmitParams.builder()
            .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .individual(
                AccountHolderResubmitParams.Individual.builder()
                    .address(
                        Address.builder()
                            .address1("123 Old Forest Way")
                            .city("Omaha")
                            .country("CAN")
                            .postalCode("M5V 1S8")
                            .state("ON")
                            .address2("address2")
                            .build()
                    )
                    .dob("1991-03-08 08:00:00")
                    .email("tom@middle-earth.com")
                    .firstName("Tom")
                    .governmentId("111-23-1412")
                    .lastName("Bombadil")
                    .phoneNumber("+12124007676")
                    .build()
            )
            .tosTimestamp("2018-05-29T21:16:05Z")
            .workflow(AccountHolderResubmitParams.Workflow.KYC_ADVANCED)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountHolderResubmitParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .individual(
                    AccountHolderResubmitParams.Individual.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("CAN")
                                .postalCode("M5V 1S8")
                                .state("ON")
                                .address2("address2")
                                .build()
                        )
                        .dob("1991-03-08 08:00:00")
                        .email("tom@middle-earth.com")
                        .firstName("Tom")
                        .governmentId("111-23-1412")
                        .lastName("Bombadil")
                        .phoneNumber("+12124007676")
                        .build()
                )
                .tosTimestamp("2018-05-29T21:16:05Z")
                .workflow(AccountHolderResubmitParams.Workflow.KYC_ADVANCED)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.individual())
            .isEqualTo(
                AccountHolderResubmitParams.Individual.builder()
                    .address(
                        Address.builder()
                            .address1("123 Old Forest Way")
                            .city("Omaha")
                            .country("CAN")
                            .postalCode("M5V 1S8")
                            .state("ON")
                            .address2("address2")
                            .build()
                    )
                    .dob("1991-03-08 08:00:00")
                    .email("tom@middle-earth.com")
                    .firstName("Tom")
                    .governmentId("111-23-1412")
                    .lastName("Bombadil")
                    .phoneNumber("+12124007676")
                    .build()
            )
        assertThat(body.tosTimestamp()).isEqualTo("2018-05-29T21:16:05Z")
        assertThat(body.workflow()).isEqualTo(AccountHolderResubmitParams.Workflow.KYC_ADVANCED)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AccountHolderResubmitParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .individual(
                    AccountHolderResubmitParams.Individual.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("CAN")
                                .postalCode("M5V 1S8")
                                .state("ON")
                                .build()
                        )
                        .dob("1991-03-08 08:00:00")
                        .email("tom@middle-earth.com")
                        .firstName("Tom")
                        .governmentId("111-23-1412")
                        .lastName("Bombadil")
                        .phoneNumber("+12124007676")
                        .build()
                )
                .tosTimestamp("2018-05-29T21:16:05Z")
                .workflow(AccountHolderResubmitParams.Workflow.KYC_ADVANCED)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.individual())
            .isEqualTo(
                AccountHolderResubmitParams.Individual.builder()
                    .address(
                        Address.builder()
                            .address1("123 Old Forest Way")
                            .city("Omaha")
                            .country("CAN")
                            .postalCode("M5V 1S8")
                            .state("ON")
                            .build()
                    )
                    .dob("1991-03-08 08:00:00")
                    .email("tom@middle-earth.com")
                    .firstName("Tom")
                    .governmentId("111-23-1412")
                    .lastName("Bombadil")
                    .phoneNumber("+12124007676")
                    .build()
            )
        assertThat(body.tosTimestamp()).isEqualTo("2018-05-29T21:16:05Z")
        assertThat(body.workflow()).isEqualTo(AccountHolderResubmitParams.Workflow.KYC_ADVANCED)
    }

    @Test
    fun getPathParam() {
        val params =
            AccountHolderResubmitParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .individual(
                    AccountHolderResubmitParams.Individual.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("CAN")
                                .postalCode("M5V 1S8")
                                .state("ON")
                                .build()
                        )
                        .dob("1991-03-08 08:00:00")
                        .email("tom@middle-earth.com")
                        .firstName("Tom")
                        .governmentId("111-23-1412")
                        .lastName("Bombadil")
                        .phoneNumber("+12124007676")
                        .build()
                )
                .tosTimestamp("2018-05-29T21:16:05Z")
                .workflow(AccountHolderResubmitParams.Workflow.KYC_ADVANCED)
                .build()
        assertThat(params).isNotNull
        // path param "accountHolderToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
