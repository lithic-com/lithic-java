package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderResubmitParamsTest {

    @Test
    fun createAccountHolderResubmitParams() {
        AccountHolderResubmitParams.builder()
            .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .workflow(AccountHolderResubmitParams.Workflow.KYC_ADVANCED)
            .tosTimestamp("2022-03-08T08:00:00Z")
            .individual(
                AccountHolderResubmitParams.Individual.builder()
                    .address(
                        Address.builder()
                            .address1("123 Old Forest Way")
                            .address2("string")
                            .city("Omaha")
                            .country("USA")
                            .postalCode("68022")
                            .state("NE")
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
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountHolderResubmitParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .workflow(AccountHolderResubmitParams.Workflow.KYC_ADVANCED)
                .tosTimestamp("2022-03-08T08:00:00Z")
                .individual(
                    AccountHolderResubmitParams.Individual.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .address2("string")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
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
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.workflow()).isEqualTo(AccountHolderResubmitParams.Workflow.KYC_ADVANCED)
        assertThat(body.tosTimestamp()).isEqualTo("2022-03-08T08:00:00Z")
        assertThat(body.individual())
            .isEqualTo(
                AccountHolderResubmitParams.Individual.builder()
                    .address(
                        Address.builder()
                            .address1("123 Old Forest Way")
                            .address2("string")
                            .city("Omaha")
                            .country("USA")
                            .postalCode("68022")
                            .state("NE")
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
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AccountHolderResubmitParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .workflow(AccountHolderResubmitParams.Workflow.KYC_ADVANCED)
                .tosTimestamp("2022-03-08T08:00:00Z")
                .individual(
                    AccountHolderResubmitParams.Individual.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
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
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.workflow()).isEqualTo(AccountHolderResubmitParams.Workflow.KYC_ADVANCED)
        assertThat(body.tosTimestamp()).isEqualTo("2022-03-08T08:00:00Z")
        assertThat(body.individual())
            .isEqualTo(
                AccountHolderResubmitParams.Individual.builder()
                    .address(
                        Address.builder()
                            .address1("123 Old Forest Way")
                            .city("Omaha")
                            .country("USA")
                            .postalCode("68022")
                            .state("NE")
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
    }

    @Test
    fun getPathParam() {
        val params =
            AccountHolderResubmitParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .workflow(AccountHolderResubmitParams.Workflow.KYC_ADVANCED)
                .tosTimestamp("2022-03-08T08:00:00Z")
                .individual(
                    AccountHolderResubmitParams.Individual.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
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
                .build()
        assertThat(params).isNotNull
        // path param "accountHolderToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
