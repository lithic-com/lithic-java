// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderUpdateParamsTest {

    @Test
    fun create() {
        AccountHolderUpdateParams.builder()
            .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .body(
                AccountHolderUpdateParams.Body.KybPatchRequest.builder()
                    .addBeneficialOwnerEntity(
                        AccountHolderUpdateParams.Body.KybPatchRequest.KybBusinessEntityPatch
                            .builder()
                            .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .address(
                                AddressUpdate.builder()
                                    .address1("123 Old Forest Way")
                                    .address2("address2")
                                    .city("Omaha")
                                    .country("USA")
                                    .postalCode("68022")
                                    .state("NE")
                                    .build()
                            )
                            .dbaBusinessName("dba_business_name")
                            .governmentId("114-123-1513")
                            .legalBusinessName("Acme, Inc.")
                            .parentCompany("parent_company")
                            .addPhoneNumber("+15555555555")
                            .build()
                    )
                    .addBeneficialOwnerIndividual(
                        AccountHolderUpdateParams.Body.KybPatchRequest.IndividualPatch.builder()
                            .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .address(
                                AddressUpdate.builder()
                                    .address1("123 Old Forest Way")
                                    .address2("address2")
                                    .city("Omaha")
                                    .country("USA")
                                    .postalCode("68022")
                                    .state("NE")
                                    .build()
                            )
                            .dob("1991-03-08 08:00:00")
                            .email("tom@middle-earth.com")
                            .firstName("Tom")
                            .lastName("Bombadil")
                            .phoneNumber("+15555555555")
                            .build()
                    )
                    .businessEntity(
                        AccountHolderUpdateParams.Body.KybPatchRequest.KybBusinessEntityPatch
                            .builder()
                            .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .address(
                                AddressUpdate.builder()
                                    .address1("123 Old Forest Way")
                                    .address2("address2")
                                    .city("Omaha")
                                    .country("USA")
                                    .postalCode("68022")
                                    .state("NE")
                                    .build()
                            )
                            .dbaBusinessName("dba_business_name")
                            .governmentId("114-123-1513")
                            .legalBusinessName("Acme, Inc.")
                            .parentCompany("parent_company")
                            .addPhoneNumber("+15555555555")
                            .build()
                    )
                    .controlPerson(
                        AccountHolderUpdateParams.Body.KybPatchRequest.IndividualPatch.builder()
                            .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .address(
                                AddressUpdate.builder()
                                    .address1("123 Old Forest Way")
                                    .address2("address2")
                                    .city("Omaha")
                                    .country("USA")
                                    .postalCode("68022")
                                    .state("NE")
                                    .build()
                            )
                            .dob("1991-03-08 08:00:00")
                            .email("tom@middle-earth.com")
                            .firstName("Tom")
                            .lastName("Bombadil")
                            .phoneNumber("+15555555555")
                            .build()
                    )
                    .externalId("external_id")
                    .natureOfBusiness(
                        "Software company selling solutions to the restaurant industry"
                    )
                    .websiteUrl("www.mybusiness.com")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountHolderUpdateParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(
                    AccountHolderUpdateParams.Body.KybPatchRequest.builder()
                        .addBeneficialOwnerEntity(
                            AccountHolderUpdateParams.Body.KybPatchRequest.KybBusinessEntityPatch
                                .builder()
                                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .address(
                                    AddressUpdate.builder()
                                        .address1("123 Old Forest Way")
                                        .address2("address2")
                                        .city("Omaha")
                                        .country("USA")
                                        .postalCode("68022")
                                        .state("NE")
                                        .build()
                                )
                                .dbaBusinessName("dba_business_name")
                                .governmentId("114-123-1513")
                                .legalBusinessName("Acme, Inc.")
                                .parentCompany("parent_company")
                                .addPhoneNumber("+15555555555")
                                .build()
                        )
                        .addBeneficialOwnerIndividual(
                            AccountHolderUpdateParams.Body.KybPatchRequest.IndividualPatch.builder()
                                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .address(
                                    AddressUpdate.builder()
                                        .address1("123 Old Forest Way")
                                        .address2("address2")
                                        .city("Omaha")
                                        .country("USA")
                                        .postalCode("68022")
                                        .state("NE")
                                        .build()
                                )
                                .dob("1991-03-08 08:00:00")
                                .email("tom@middle-earth.com")
                                .firstName("Tom")
                                .lastName("Bombadil")
                                .phoneNumber("+15555555555")
                                .build()
                        )
                        .businessEntity(
                            AccountHolderUpdateParams.Body.KybPatchRequest.KybBusinessEntityPatch
                                .builder()
                                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .address(
                                    AddressUpdate.builder()
                                        .address1("123 Old Forest Way")
                                        .address2("address2")
                                        .city("Omaha")
                                        .country("USA")
                                        .postalCode("68022")
                                        .state("NE")
                                        .build()
                                )
                                .dbaBusinessName("dba_business_name")
                                .governmentId("114-123-1513")
                                .legalBusinessName("Acme, Inc.")
                                .parentCompany("parent_company")
                                .addPhoneNumber("+15555555555")
                                .build()
                        )
                        .controlPerson(
                            AccountHolderUpdateParams.Body.KybPatchRequest.IndividualPatch.builder()
                                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .address(
                                    AddressUpdate.builder()
                                        .address1("123 Old Forest Way")
                                        .address2("address2")
                                        .city("Omaha")
                                        .country("USA")
                                        .postalCode("68022")
                                        .state("NE")
                                        .build()
                                )
                                .dob("1991-03-08 08:00:00")
                                .email("tom@middle-earth.com")
                                .firstName("Tom")
                                .lastName("Bombadil")
                                .phoneNumber("+15555555555")
                                .build()
                        )
                        .externalId("external_id")
                        .natureOfBusiness(
                            "Software company selling solutions to the restaurant industry"
                        )
                        .websiteUrl("www.mybusiness.com")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AccountHolderUpdateParams.Body.ofKybPatchRequest(
                    AccountHolderUpdateParams.Body.KybPatchRequest.builder()
                        .addBeneficialOwnerEntity(
                            AccountHolderUpdateParams.Body.KybPatchRequest.KybBusinessEntityPatch
                                .builder()
                                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .address(
                                    AddressUpdate.builder()
                                        .address1("123 Old Forest Way")
                                        .address2("address2")
                                        .city("Omaha")
                                        .country("USA")
                                        .postalCode("68022")
                                        .state("NE")
                                        .build()
                                )
                                .dbaBusinessName("dba_business_name")
                                .governmentId("114-123-1513")
                                .legalBusinessName("Acme, Inc.")
                                .parentCompany("parent_company")
                                .addPhoneNumber("+15555555555")
                                .build()
                        )
                        .addBeneficialOwnerIndividual(
                            AccountHolderUpdateParams.Body.KybPatchRequest.IndividualPatch.builder()
                                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .address(
                                    AddressUpdate.builder()
                                        .address1("123 Old Forest Way")
                                        .address2("address2")
                                        .city("Omaha")
                                        .country("USA")
                                        .postalCode("68022")
                                        .state("NE")
                                        .build()
                                )
                                .dob("1991-03-08 08:00:00")
                                .email("tom@middle-earth.com")
                                .firstName("Tom")
                                .lastName("Bombadil")
                                .phoneNumber("+15555555555")
                                .build()
                        )
                        .businessEntity(
                            AccountHolderUpdateParams.Body.KybPatchRequest.KybBusinessEntityPatch
                                .builder()
                                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .address(
                                    AddressUpdate.builder()
                                        .address1("123 Old Forest Way")
                                        .address2("address2")
                                        .city("Omaha")
                                        .country("USA")
                                        .postalCode("68022")
                                        .state("NE")
                                        .build()
                                )
                                .dbaBusinessName("dba_business_name")
                                .governmentId("114-123-1513")
                                .legalBusinessName("Acme, Inc.")
                                .parentCompany("parent_company")
                                .addPhoneNumber("+15555555555")
                                .build()
                        )
                        .controlPerson(
                            AccountHolderUpdateParams.Body.KybPatchRequest.IndividualPatch.builder()
                                .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .address(
                                    AddressUpdate.builder()
                                        .address1("123 Old Forest Way")
                                        .address2("address2")
                                        .city("Omaha")
                                        .country("USA")
                                        .postalCode("68022")
                                        .state("NE")
                                        .build()
                                )
                                .dob("1991-03-08 08:00:00")
                                .email("tom@middle-earth.com")
                                .firstName("Tom")
                                .lastName("Bombadil")
                                .phoneNumber("+15555555555")
                                .build()
                        )
                        .externalId("external_id")
                        .natureOfBusiness(
                            "Software company selling solutions to the restaurant industry"
                        )
                        .websiteUrl("www.mybusiness.com")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountHolderUpdateParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(AccountHolderUpdateParams.Body.KybPatchRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AccountHolderUpdateParams.Body.ofKybPatchRequest(
                    AccountHolderUpdateParams.Body.KybPatchRequest.builder().build()
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            AccountHolderUpdateParams.builder()
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body(AccountHolderUpdateParams.Body.KybPatchRequest.builder().build())
                .build()
        assertThat(params).isNotNull
        // path param "accountHolderToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
