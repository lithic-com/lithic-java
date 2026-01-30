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

internal class AccountHolderUpdatedWebhookEventTest {

    @Test
    fun ofKybPayload() {
        val kybPayload =
            AccountHolderUpdatedWebhookEvent.KybPayload.builder()
                .token("00000000-0000-0000-0000-000000000001")
                .updateRequest(
                    AccountHolderUpdatedWebhookEvent.KybPayload.UpdateRequest.builder()
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
                            AccountHolderUpdatedWebhookEvent.KybPayload.UpdateRequest.Individual
                                .builder()
                                .address(
                                    AccountHolderUpdatedWebhookEvent.KybPayload.UpdateRequest
                                        .Individual
                                        .Address
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
                            AccountHolderUpdatedWebhookEvent.KybPayload.UpdateRequest.Individual
                                .builder()
                                .address(
                                    AccountHolderUpdatedWebhookEvent.KybPayload.UpdateRequest
                                        .Individual
                                        .Address
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
                        .build()
                )
                .eventType(
                    AccountHolderUpdatedWebhookEvent.KybPayload.EventType.ACCOUNT_HOLDER_UPDATED
                )
                .externalId("external_id")
                .naicsCode("541512")
                .natureOfBusiness("Software company selling solutions to the restaurant industry")
                .websiteUrl("www.mybusiness.com")
                .build()

        val accountHolderUpdatedWebhookEvent =
            AccountHolderUpdatedWebhookEvent.ofKybPayload(kybPayload)

        assertThat(accountHolderUpdatedWebhookEvent.kybPayload()).contains(kybPayload)
        assertThat(accountHolderUpdatedWebhookEvent.kycPayload()).isEmpty
        assertThat(accountHolderUpdatedWebhookEvent.legacyPayload()).isEmpty
    }

    @Test
    fun ofKybPayloadRoundtrip() {
        val jsonMapper = jsonMapper()
        val accountHolderUpdatedWebhookEvent =
            AccountHolderUpdatedWebhookEvent.ofKybPayload(
                AccountHolderUpdatedWebhookEvent.KybPayload.builder()
                    .token("00000000-0000-0000-0000-000000000001")
                    .updateRequest(
                        AccountHolderUpdatedWebhookEvent.KybPayload.UpdateRequest.builder()
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
                                AccountHolderUpdatedWebhookEvent.KybPayload.UpdateRequest.Individual
                                    .builder()
                                    .address(
                                        AccountHolderUpdatedWebhookEvent.KybPayload.UpdateRequest
                                            .Individual
                                            .Address
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
                                AccountHolderUpdatedWebhookEvent.KybPayload.UpdateRequest.Individual
                                    .builder()
                                    .address(
                                        AccountHolderUpdatedWebhookEvent.KybPayload.UpdateRequest
                                            .Individual
                                            .Address
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
                            .build()
                    )
                    .eventType(
                        AccountHolderUpdatedWebhookEvent.KybPayload.EventType.ACCOUNT_HOLDER_UPDATED
                    )
                    .externalId("external_id")
                    .naicsCode("541512")
                    .natureOfBusiness(
                        "Software company selling solutions to the restaurant industry"
                    )
                    .websiteUrl("www.mybusiness.com")
                    .build()
            )

        val roundtrippedAccountHolderUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountHolderUpdatedWebhookEvent),
                jacksonTypeRef<AccountHolderUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedAccountHolderUpdatedWebhookEvent)
            .isEqualTo(accountHolderUpdatedWebhookEvent)
    }

    @Test
    fun ofKycPayload() {
        val kycPayload =
            AccountHolderUpdatedWebhookEvent.KycPayload.builder()
                .token("00000000-0000-0000-0000-000000000001")
                .updateRequest(
                    AccountHolderUpdatedWebhookEvent.KycPayload.UpdateRequest.builder()
                        .individual(
                            AccountHolderUpdatedWebhookEvent.KycPayload.UpdateRequest.Individual
                                .builder()
                                .address(
                                    AccountHolderUpdatedWebhookEvent.KycPayload.UpdateRequest
                                        .Individual
                                        .Address
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
                        .build()
                )
                .eventType(
                    AccountHolderUpdatedWebhookEvent.KycPayload.EventType.ACCOUNT_HOLDER_UPDATED
                )
                .externalId("external_id")
                .build()

        val accountHolderUpdatedWebhookEvent =
            AccountHolderUpdatedWebhookEvent.ofKycPayload(kycPayload)

        assertThat(accountHolderUpdatedWebhookEvent.kybPayload()).isEmpty
        assertThat(accountHolderUpdatedWebhookEvent.kycPayload()).contains(kycPayload)
        assertThat(accountHolderUpdatedWebhookEvent.legacyPayload()).isEmpty
    }

    @Test
    fun ofKycPayloadRoundtrip() {
        val jsonMapper = jsonMapper()
        val accountHolderUpdatedWebhookEvent =
            AccountHolderUpdatedWebhookEvent.ofKycPayload(
                AccountHolderUpdatedWebhookEvent.KycPayload.builder()
                    .token("00000000-0000-0000-0000-000000000001")
                    .updateRequest(
                        AccountHolderUpdatedWebhookEvent.KycPayload.UpdateRequest.builder()
                            .individual(
                                AccountHolderUpdatedWebhookEvent.KycPayload.UpdateRequest.Individual
                                    .builder()
                                    .address(
                                        AccountHolderUpdatedWebhookEvent.KycPayload.UpdateRequest
                                            .Individual
                                            .Address
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
                            .build()
                    )
                    .eventType(
                        AccountHolderUpdatedWebhookEvent.KycPayload.EventType.ACCOUNT_HOLDER_UPDATED
                    )
                    .externalId("external_id")
                    .build()
            )

        val roundtrippedAccountHolderUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountHolderUpdatedWebhookEvent),
                jacksonTypeRef<AccountHolderUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedAccountHolderUpdatedWebhookEvent)
            .isEqualTo(accountHolderUpdatedWebhookEvent)
    }

    @Test
    fun ofLegacyPayload() {
        val legacyPayload =
            AccountHolderUpdatedWebhookEvent.LegacyPayload.builder()
                .token("00000000-0000-0000-0000-000000000001")
                .businessAccountToken("00000000-0000-0000-0000-000000000001")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("johnny@lithic.com")
                .eventType(
                    AccountHolderUpdatedWebhookEvent.LegacyPayload.EventType.ACCOUNT_HOLDER_UPDATED
                )
                .externalId("00000000-0000-0000-0000-000000000001")
                .firstName("Johnny")
                .lastName("Appleseed")
                .legalBusinessName("Lithic")
                .phoneNumber("+15555555555")
                .build()

        val accountHolderUpdatedWebhookEvent =
            AccountHolderUpdatedWebhookEvent.ofLegacyPayload(legacyPayload)

        assertThat(accountHolderUpdatedWebhookEvent.kybPayload()).isEmpty
        assertThat(accountHolderUpdatedWebhookEvent.kycPayload()).isEmpty
        assertThat(accountHolderUpdatedWebhookEvent.legacyPayload()).contains(legacyPayload)
    }

    @Test
    fun ofLegacyPayloadRoundtrip() {
        val jsonMapper = jsonMapper()
        val accountHolderUpdatedWebhookEvent =
            AccountHolderUpdatedWebhookEvent.ofLegacyPayload(
                AccountHolderUpdatedWebhookEvent.LegacyPayload.builder()
                    .token("00000000-0000-0000-0000-000000000001")
                    .businessAccountToken("00000000-0000-0000-0000-000000000001")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .email("johnny@lithic.com")
                    .eventType(
                        AccountHolderUpdatedWebhookEvent.LegacyPayload.EventType
                            .ACCOUNT_HOLDER_UPDATED
                    )
                    .externalId("00000000-0000-0000-0000-000000000001")
                    .firstName("Johnny")
                    .lastName("Appleseed")
                    .legalBusinessName("Lithic")
                    .phoneNumber("+15555555555")
                    .build()
            )

        val roundtrippedAccountHolderUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountHolderUpdatedWebhookEvent),
                jacksonTypeRef<AccountHolderUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedAccountHolderUpdatedWebhookEvent)
            .isEqualTo(accountHolderUpdatedWebhookEvent)
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
        val accountHolderUpdatedWebhookEvent =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<AccountHolderUpdatedWebhookEvent>())

        val e =
            assertThrows<LithicInvalidDataException> { accountHolderUpdatedWebhookEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
