// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class AccountHolderUpdateResponseTest {

    @Test
    fun ofKybKycPatch() {
        val kybKycPatch =
            AccountHolderUpdateResponse.KybKycPatchResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBeneficialOwnerEntity(
                    KybBusinessEntity.builder()
                        .address(
                            KybBusinessEntity.Address.builder()
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
                .addBeneficialOwnerIndividual(
                    AccountHolderUpdateResponse.KybKycPatchResponse.Individual.builder()
                        .address(
                            AccountHolderUpdateResponse.KybKycPatchResponse.Individual.Address
                                .builder()
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
                .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .businessEntity(
                    KybBusinessEntity.builder()
                        .address(
                            KybBusinessEntity.Address.builder()
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
                    AccountHolderUpdateResponse.KybKycPatchResponse.Individual.builder()
                        .address(
                            AccountHolderUpdateResponse.KybKycPatchResponse.Individual.Address
                                .builder()
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
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .exemptionType(
                    AccountHolderUpdateResponse.KybKycPatchResponse.ExemptionType.AUTHORIZED_USER
                )
                .externalId("external_id")
                .individual(
                    AccountHolderUpdateResponse.KybKycPatchResponse.Individual.builder()
                        .address(
                            AccountHolderUpdateResponse.KybKycPatchResponse.Individual.Address
                                .builder()
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
                .natureOfBusiness("nature_of_business")
                .phoneNumber("phone_number")
                .addRequiredDocument(
                    RequiredDocument.builder()
                        .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addStatusReason("string")
                        .addValidDocument("string")
                        .build()
                )
                .status(AccountHolderUpdateResponse.KybKycPatchResponse.Status.ACCEPTED)
                .addStatusReason(
                    AccountHolderUpdateResponse.KybKycPatchResponse.StatusReasons
                        .ADDRESS_VERIFICATION_FAILURE
                )
                .userType(AccountHolderUpdateResponse.KybKycPatchResponse.UserType.BUSINESS)
                .verificationApplication(
                    AccountHolderUpdateResponse.KybKycPatchResponse.VerificationApplication
                        .builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            AccountHolderUpdateResponse.KybKycPatchResponse.VerificationApplication
                                .Status
                                .ACCEPTED
                        )
                        .addStatusReason(
                            AccountHolderUpdateResponse.KybKycPatchResponse.VerificationApplication
                                .StatusReasons
                                .ADDRESS_VERIFICATION_FAILURE
                        )
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .kyPassedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .websiteUrl("website_url")
                .build()

        val accountHolderUpdateResponse = AccountHolderUpdateResponse.ofKybKycPatch(kybKycPatch)

        assertThat(accountHolderUpdateResponse.kybKycPatch()).contains(kybKycPatch)
        assertThat(accountHolderUpdateResponse.patch()).isEmpty
    }

    @Test
    fun ofKybKycPatchRoundtrip() {
        val jsonMapper = jsonMapper()
        val accountHolderUpdateResponse =
            AccountHolderUpdateResponse.ofKybKycPatch(
                AccountHolderUpdateResponse.KybKycPatchResponse.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addBeneficialOwnerEntity(
                        KybBusinessEntity.builder()
                            .address(
                                KybBusinessEntity.Address.builder()
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
                    .addBeneficialOwnerIndividual(
                        AccountHolderUpdateResponse.KybKycPatchResponse.Individual.builder()
                            .address(
                                AccountHolderUpdateResponse.KybKycPatchResponse.Individual.Address
                                    .builder()
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
                    .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .businessEntity(
                        KybBusinessEntity.builder()
                            .address(
                                KybBusinessEntity.Address.builder()
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
                        AccountHolderUpdateResponse.KybKycPatchResponse.Individual.builder()
                            .address(
                                AccountHolderUpdateResponse.KybKycPatchResponse.Individual.Address
                                    .builder()
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
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .email("email")
                    .exemptionType(
                        AccountHolderUpdateResponse.KybKycPatchResponse.ExemptionType
                            .AUTHORIZED_USER
                    )
                    .externalId("external_id")
                    .individual(
                        AccountHolderUpdateResponse.KybKycPatchResponse.Individual.builder()
                            .address(
                                AccountHolderUpdateResponse.KybKycPatchResponse.Individual.Address
                                    .builder()
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
                    .natureOfBusiness("nature_of_business")
                    .phoneNumber("phone_number")
                    .addRequiredDocument(
                        RequiredDocument.builder()
                            .entityToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addStatusReason("string")
                            .addValidDocument("string")
                            .build()
                    )
                    .status(AccountHolderUpdateResponse.KybKycPatchResponse.Status.ACCEPTED)
                    .addStatusReason(
                        AccountHolderUpdateResponse.KybKycPatchResponse.StatusReasons
                            .ADDRESS_VERIFICATION_FAILURE
                    )
                    .userType(AccountHolderUpdateResponse.KybKycPatchResponse.UserType.BUSINESS)
                    .verificationApplication(
                        AccountHolderUpdateResponse.KybKycPatchResponse.VerificationApplication
                            .builder()
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .status(
                                AccountHolderUpdateResponse.KybKycPatchResponse
                                    .VerificationApplication
                                    .Status
                                    .ACCEPTED
                            )
                            .addStatusReason(
                                AccountHolderUpdateResponse.KybKycPatchResponse
                                    .VerificationApplication
                                    .StatusReasons
                                    .ADDRESS_VERIFICATION_FAILURE
                            )
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .kyPassedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .websiteUrl("website_url")
                    .build()
            )

        val roundtrippedAccountHolderUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountHolderUpdateResponse),
                jacksonTypeRef<AccountHolderUpdateResponse>(),
            )

        assertThat(roundtrippedAccountHolderUpdateResponse).isEqualTo(accountHolderUpdateResponse)
    }

    @Test
    fun ofPatch() {
        val patch =
            AccountHolderUpdateResponse.PatchResponse.builder()
                .token("token")
                .address(
                    AccountHolderUpdateResponse.PatchResponse.Address.builder()
                        .address1("123 Old Forest Way")
                        .city("Omaha")
                        .country("USA")
                        .postalCode("68022")
                        .state("NE")
                        .address2("address2")
                        .build()
                )
                .businessAccountToken("business_account_token")
                .email("email")
                .firstName("first_name")
                .lastName("last_name")
                .legalBusinessName("legal_business_name")
                .phoneNumber("phone_number")
                .build()

        val accountHolderUpdateResponse = AccountHolderUpdateResponse.ofPatch(patch)

        assertThat(accountHolderUpdateResponse.kybKycPatch()).isEmpty
        assertThat(accountHolderUpdateResponse.patch()).contains(patch)
    }

    @Test
    fun ofPatchRoundtrip() {
        val jsonMapper = jsonMapper()
        val accountHolderUpdateResponse =
            AccountHolderUpdateResponse.ofPatch(
                AccountHolderUpdateResponse.PatchResponse.builder()
                    .token("token")
                    .address(
                        AccountHolderUpdateResponse.PatchResponse.Address.builder()
                            .address1("123 Old Forest Way")
                            .city("Omaha")
                            .country("USA")
                            .postalCode("68022")
                            .state("NE")
                            .address2("address2")
                            .build()
                    )
                    .businessAccountToken("business_account_token")
                    .email("email")
                    .firstName("first_name")
                    .lastName("last_name")
                    .legalBusinessName("legal_business_name")
                    .phoneNumber("phone_number")
                    .build()
            )

        val roundtrippedAccountHolderUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountHolderUpdateResponse),
                jacksonTypeRef<AccountHolderUpdateResponse>(),
            )

        assertThat(roundtrippedAccountHolderUpdateResponse).isEqualTo(accountHolderUpdateResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val accountHolderUpdateResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<AccountHolderUpdateResponse>())

        val e = assertThrows<LithicInvalidDataException> { accountHolderUpdateResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
