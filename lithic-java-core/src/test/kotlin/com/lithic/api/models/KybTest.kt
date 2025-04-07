// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KybTest {

    @Test
    fun create() {
        val kyb =
            Kyb.builder()
                .addBeneficialOwnerIndividual(
                    Kyb.KybIndividual.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
                                .address2("address2")
                                .build()
                        )
                        .dob("1991-03-08 08:00:00")
                        .email("tom@middle-earth.com")
                        .firstName("Tom")
                        .governmentId("111-23-1412")
                        .lastName("Bombadil")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .businessEntity(
                    Kyb.BusinessEntity.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
                                .address2("address2")
                                .build()
                        )
                        .governmentId("114-123-1513")
                        .legalBusinessName("Acme, Inc.")
                        .addPhoneNumber("+15555555555")
                        .dbaBusinessName("dba_business_name")
                        .parentCompany("parent_company")
                        .build()
                )
                .controlPerson(
                    Kyb.KybIndividual.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
                                .address2("address2")
                                .build()
                        )
                        .dob("1991-03-08 08:00:00")
                        .email("tom@middle-earth.com")
                        .firstName("Tom")
                        .governmentId("111-23-1412")
                        .lastName("Bombadil")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .natureOfBusiness("Software company selling solutions to the restaurant industry")
                .tosTimestamp("2018-05-29T21:16:05Z")
                .workflow(Kyb.Workflow.KYB_BASIC)
                .addBeneficialOwnerEntity(
                    Kyb.BusinessEntity.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
                                .address2("address2")
                                .build()
                        )
                        .governmentId("114-123-1513")
                        .legalBusinessName("Acme, Inc.")
                        .addPhoneNumber("+15555555555")
                        .dbaBusinessName("dba_business_name")
                        .parentCompany("parent_company")
                        .build()
                )
                .externalId("external_id")
                .kybPassedTimestamp("2018-05-29T21:16:05Z")
                .websiteUrl("www.mybusiness.com")
                .build()

        assertThat(kyb.beneficialOwnerIndividuals())
            .containsExactly(
                Kyb.KybIndividual.builder()
                    .address(
                        Address.builder()
                            .address1("123 Old Forest Way")
                            .city("Omaha")
                            .country("USA")
                            .postalCode("68022")
                            .state("NE")
                            .address2("address2")
                            .build()
                    )
                    .dob("1991-03-08 08:00:00")
                    .email("tom@middle-earth.com")
                    .firstName("Tom")
                    .governmentId("111-23-1412")
                    .lastName("Bombadil")
                    .phoneNumber("+15555555555")
                    .build()
            )
        assertThat(kyb.businessEntity())
            .isEqualTo(
                Kyb.BusinessEntity.builder()
                    .address(
                        Address.builder()
                            .address1("123 Old Forest Way")
                            .city("Omaha")
                            .country("USA")
                            .postalCode("68022")
                            .state("NE")
                            .address2("address2")
                            .build()
                    )
                    .governmentId("114-123-1513")
                    .legalBusinessName("Acme, Inc.")
                    .addPhoneNumber("+15555555555")
                    .dbaBusinessName("dba_business_name")
                    .parentCompany("parent_company")
                    .build()
            )
        assertThat(kyb.controlPerson())
            .isEqualTo(
                Kyb.KybIndividual.builder()
                    .address(
                        Address.builder()
                            .address1("123 Old Forest Way")
                            .city("Omaha")
                            .country("USA")
                            .postalCode("68022")
                            .state("NE")
                            .address2("address2")
                            .build()
                    )
                    .dob("1991-03-08 08:00:00")
                    .email("tom@middle-earth.com")
                    .firstName("Tom")
                    .governmentId("111-23-1412")
                    .lastName("Bombadil")
                    .phoneNumber("+15555555555")
                    .build()
            )
        assertThat(kyb.natureOfBusiness())
            .isEqualTo("Software company selling solutions to the restaurant industry")
        assertThat(kyb.tosTimestamp()).isEqualTo("2018-05-29T21:16:05Z")
        assertThat(kyb.workflow()).isEqualTo(Kyb.Workflow.KYB_BASIC)
        assertThat(kyb.beneficialOwnerEntities().getOrNull())
            .containsExactly(
                Kyb.BusinessEntity.builder()
                    .address(
                        Address.builder()
                            .address1("123 Old Forest Way")
                            .city("Omaha")
                            .country("USA")
                            .postalCode("68022")
                            .state("NE")
                            .address2("address2")
                            .build()
                    )
                    .governmentId("114-123-1513")
                    .legalBusinessName("Acme, Inc.")
                    .addPhoneNumber("+15555555555")
                    .dbaBusinessName("dba_business_name")
                    .parentCompany("parent_company")
                    .build()
            )
        assertThat(kyb.externalId()).contains("external_id")
        assertThat(kyb.kybPassedTimestamp()).contains("2018-05-29T21:16:05Z")
        assertThat(kyb.websiteUrl()).contains("www.mybusiness.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val kyb =
            Kyb.builder()
                .addBeneficialOwnerIndividual(
                    Kyb.KybIndividual.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
                                .address2("address2")
                                .build()
                        )
                        .dob("1991-03-08 08:00:00")
                        .email("tom@middle-earth.com")
                        .firstName("Tom")
                        .governmentId("111-23-1412")
                        .lastName("Bombadil")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .businessEntity(
                    Kyb.BusinessEntity.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
                                .address2("address2")
                                .build()
                        )
                        .governmentId("114-123-1513")
                        .legalBusinessName("Acme, Inc.")
                        .addPhoneNumber("+15555555555")
                        .dbaBusinessName("dba_business_name")
                        .parentCompany("parent_company")
                        .build()
                )
                .controlPerson(
                    Kyb.KybIndividual.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
                                .address2("address2")
                                .build()
                        )
                        .dob("1991-03-08 08:00:00")
                        .email("tom@middle-earth.com")
                        .firstName("Tom")
                        .governmentId("111-23-1412")
                        .lastName("Bombadil")
                        .phoneNumber("+15555555555")
                        .build()
                )
                .natureOfBusiness("Software company selling solutions to the restaurant industry")
                .tosTimestamp("2018-05-29T21:16:05Z")
                .workflow(Kyb.Workflow.KYB_BASIC)
                .addBeneficialOwnerEntity(
                    Kyb.BusinessEntity.builder()
                        .address(
                            Address.builder()
                                .address1("123 Old Forest Way")
                                .city("Omaha")
                                .country("USA")
                                .postalCode("68022")
                                .state("NE")
                                .address2("address2")
                                .build()
                        )
                        .governmentId("114-123-1513")
                        .legalBusinessName("Acme, Inc.")
                        .addPhoneNumber("+15555555555")
                        .dbaBusinessName("dba_business_name")
                        .parentCompany("parent_company")
                        .build()
                )
                .externalId("external_id")
                .kybPassedTimestamp("2018-05-29T21:16:05Z")
                .websiteUrl("www.mybusiness.com")
                .build()

        val roundtrippedKyb =
            jsonMapper.readValue(jsonMapper.writeValueAsString(kyb), jacksonTypeRef<Kyb>())

        assertThat(roundtrippedKyb).isEqualTo(kyb)
    }
}
