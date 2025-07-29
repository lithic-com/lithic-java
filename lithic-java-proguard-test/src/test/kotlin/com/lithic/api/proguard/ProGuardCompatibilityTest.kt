// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.core.jsonMapper
import com.lithic.api.models.AccountHolderUpdateResponse
import com.lithic.api.models.CardSpendLimits
import com.lithic.api.models.KybBusinessEntity
import com.lithic.api.models.RequiredDocument
import com.lithic.api.models.SpendLimitDuration
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @BeforeAll
        @JvmStatic
        fun setUp() {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/lithic-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = LithicOkHttpClient.builder().apiKey("My Lithic API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.accounts()).isNotNull()
        assertThat(client.accountHolders()).isNotNull()
        assertThat(client.authRules()).isNotNull()
        assertThat(client.authStreamEnrollment()).isNotNull()
        assertThat(client.tokenizationDecisioning()).isNotNull()
        assertThat(client.tokenizations()).isNotNull()
        assertThat(client.cards()).isNotNull()
        assertThat(client.balances()).isNotNull()
        assertThat(client.aggregateBalances()).isNotNull()
        assertThat(client.disputes()).isNotNull()
        assertThat(client.events()).isNotNull()
        assertThat(client.transfers()).isNotNull()
        assertThat(client.financialAccounts()).isNotNull()
        assertThat(client.transactions()).isNotNull()
        assertThat(client.responderEndpoints()).isNotNull()
        assertThat(client.externalBankAccounts()).isNotNull()
        assertThat(client.payments()).isNotNull()
        assertThat(client.threeDS()).isNotNull()
        assertThat(client.reports()).isNotNull()
        assertThat(client.cardPrograms()).isNotNull()
        assertThat(client.digitalCardArt()).isNotNull()
        assertThat(client.bookTransfers()).isNotNull()
        assertThat(client.creditProducts()).isNotNull()
        assertThat(client.externalPayments()).isNotNull()
        assertThat(client.managementOperations()).isNotNull()
        assertThat(client.fundingEvents()).isNotNull()
        assertThat(client.fraud()).isNotNull()
        assertThat(client.networkPrograms()).isNotNull()
    }

    @Test
    fun cardSpendLimitsRoundtrip() {
        val jsonMapper = jsonMapper()
        val cardSpendLimits =
            CardSpendLimits.builder()
                .availableSpendLimit(
                    CardSpendLimits.AvailableSpendLimit.builder()
                        .annually(200000L)
                        .forever(300000L)
                        .monthly(200000L)
                        .build()
                )
                .spendLimit(
                    CardSpendLimits.SpendLimit.builder()
                        .annually(500000L)
                        .forever(500000L)
                        .monthly(500000L)
                        .build()
                )
                .spendVelocity(
                    CardSpendLimits.SpendVelocity.builder()
                        .annually(300000L)
                        .forever(200000L)
                        .monthly(300000L)
                        .build()
                )
                .build()

        val roundtrippedCardSpendLimits =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardSpendLimits),
                jacksonTypeRef<CardSpendLimits>(),
            )

        assertThat(roundtrippedCardSpendLimits).isEqualTo(cardSpendLimits)
    }

    @Test
    fun accountHolderUpdateResponseRoundtrip() {
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
    fun spendLimitDurationRoundtrip() {
        val jsonMapper = jsonMapper()
        val spendLimitDuration = SpendLimitDuration.ANNUALLY

        val roundtrippedSpendLimitDuration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(spendLimitDuration),
                jacksonTypeRef<SpendLimitDuration>(),
            )

        assertThat(roundtrippedSpendLimitDuration).isEqualTo(spendLimitDuration)
    }
}
