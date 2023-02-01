package com.lithic.api.models

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.google.common.collect.ArrayListMultimap
import com.lithic.api.models.*
import com.lithic.api.models.AccountHolderCreateParams.AccountHolderCreateBody

class AccountHolderCreateParamsTest {

    @Test
    fun createAccountHolderCreateParams() {
      AccountHolderCreateParams.builder()
          .forKyb(AccountHolderCreateParams.Kyb.builder()
              .businessEntity(AccountHolderCreateParams.Kyb.BusinessEntity.builder()
                  .address(Address.builder()
                      .address1("123 Old Forest Way")
                      .address2("string")
                      .city("Omaha")
                      .country("USA")
                      .postalCode("68022")
                      .state("NE")
                      .build())
                  .dbaBusinessName("string")
                  .governmentId("114-123-1513")
                  .legalBusinessName("Acme, Inc.")
                  .parentCompany("string")
                  .phoneNumbers(listOf("+12124007676"))
                  .build())
              .beneficialOwnerEntities(listOf(AccountHolderCreateParams.Kyb.BusinessEntity.builder()
                  .address(Address.builder()
                      .address1("123 Old Forest Way")
                      .address2("string")
                      .city("Omaha")
                      .country("USA")
                      .postalCode("68022")
                      .state("NE")
                      .build())
                  .dbaBusinessName("string")
                  .governmentId("114-123-1513")
                  .legalBusinessName("Acme, Inc.")
                  .parentCompany("string")
                  .phoneNumbers(listOf("+12124007676"))
                  .build()))
              .beneficialOwnerIndividuals(listOf(AccountHolderCreateParams.Kyb.Individual.builder()
                  .address(Address.builder()
                      .address1("123 Old Forest Way")
                      .address2("string")
                      .city("Omaha")
                      .country("USA")
                      .postalCode("68022")
                      .state("NE")
                      .build())
                  .dob("1991-03-08 08:00:00")
                  .email("tom@middle-earth.com")
                  .firstName("Tom")
                  .governmentId("111-23-1412")
                  .lastName("Bombadil")
                  .phoneNumber("+12124007676")
                  .build()))
              .controlPerson(AccountHolderCreateParams.Kyb.Individual.builder()
                  .address(Address.builder()
                      .address1("123 Old Forest Way")
                      .address2("string")
                      .city("Omaha")
                      .country("USA")
                      .postalCode("68022")
                      .state("NE")
                      .build())
                  .dob("1991-03-08 08:00:00")
                  .email("tom@middle-earth.com")
                  .firstName("Tom")
                  .governmentId("111-23-1412")
                  .lastName("Bombadil")
                  .phoneNumber("+12124007676")
                  .build())
              .kybPassedTimestamp("2022-03-08 08:00:00")
              .natureOfBusiness("Software company selling solutions to the restaurant industry")
              .tosTimestamp("2022-03-08 08:00:00")
              .websiteUrl("www.mybusiness.com")
              .workflow(AccountHolderCreateParams.Kyb.Workflow.KYB_BASIC)
              .build())
          .build()
    }

    @Test
    fun toBody() {
      val params = AccountHolderCreateParams.builder()
          .forKyb(AccountHolderCreateParams.Kyb.builder()
              .businessEntity(AccountHolderCreateParams.Kyb.BusinessEntity.builder()
                  .address(Address.builder()
                      .address1("123 Old Forest Way")
                      .address2("string")
                      .city("Omaha")
                      .country("USA")
                      .postalCode("68022")
                      .state("NE")
                      .build())
                  .dbaBusinessName("string")
                  .governmentId("114-123-1513")
                  .legalBusinessName("Acme, Inc.")
                  .parentCompany("string")
                  .phoneNumbers(listOf("+12124007676"))
                  .build())
              .beneficialOwnerEntities(listOf(AccountHolderCreateParams.Kyb.BusinessEntity.builder()
                  .address(Address.builder()
                      .address1("123 Old Forest Way")
                      .address2("string")
                      .city("Omaha")
                      .country("USA")
                      .postalCode("68022")
                      .state("NE")
                      .build())
                  .dbaBusinessName("string")
                  .governmentId("114-123-1513")
                  .legalBusinessName("Acme, Inc.")
                  .parentCompany("string")
                  .phoneNumbers(listOf("+12124007676"))
                  .build()))
              .beneficialOwnerIndividuals(listOf(AccountHolderCreateParams.Kyb.Individual.builder()
                  .address(Address.builder()
                      .address1("123 Old Forest Way")
                      .address2("string")
                      .city("Omaha")
                      .country("USA")
                      .postalCode("68022")
                      .state("NE")
                      .build())
                  .dob("1991-03-08 08:00:00")
                  .email("tom@middle-earth.com")
                  .firstName("Tom")
                  .governmentId("111-23-1412")
                  .lastName("Bombadil")
                  .phoneNumber("+12124007676")
                  .build()))
              .controlPerson(AccountHolderCreateParams.Kyb.Individual.builder()
                  .address(Address.builder()
                      .address1("123 Old Forest Way")
                      .address2("string")
                      .city("Omaha")
                      .country("USA")
                      .postalCode("68022")
                      .state("NE")
                      .build())
                  .dob("1991-03-08 08:00:00")
                  .email("tom@middle-earth.com")
                  .firstName("Tom")
                  .governmentId("111-23-1412")
                  .lastName("Bombadil")
                  .phoneNumber("+12124007676")
                  .build())
              .kybPassedTimestamp("2022-03-08 08:00:00")
              .natureOfBusiness("Software company selling solutions to the restaurant industry")
              .tosTimestamp("2022-03-08 08:00:00")
              .websiteUrl("www.mybusiness.com")
              .workflow(AccountHolderCreateParams.Kyb.Workflow.KYB_BASIC)
              .build())
          .build()
      val body = params.toBody()
      assertThat(body).isNotNull
    }

    @Test
    fun toBodyWithoutOptionalFields() {
      val params = AccountHolderCreateParams.builder().build()
      val body = params.toBody()
      assertThat(body).isNotNull
    }
}
