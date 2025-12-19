// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.core.jsonMapper
import com.lithic.api.models.CardSpendLimits
import com.lithic.api.models.CardWebProvisionResponse
import com.lithic.api.models.SpendLimitDuration
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
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
        assertThat(client.cardBulkOrders()).isNotNull()
        assertThat(client.balances()).isNotNull()
        assertThat(client.disputes()).isNotNull()
        assertThat(client.disputesV2()).isNotNull()
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
        assertThat(client.internalTransaction()).isNotNull()
        assertThat(client.fundingEvents()).isNotNull()
        assertThat(client.fraud()).isNotNull()
        assertThat(client.networkPrograms()).isNotNull()
        assertThat(client.accountActivity()).isNotNull()
        assertThat(client.transferLimits()).isNotNull()
        assertThat(client.webhooks()).isNotNull()
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
    fun cardWebProvisionResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val cardWebProvisionResponse =
            CardWebProvisionResponse.ofAppleWebPushProvisioning(
                CardWebProvisionResponse.AppleWebPushProvisioningResponse.builder()
                    .jws(
                        CardWebProvisionResponse.AppleWebPushProvisioningResponse
                            .WebPushProvisioningResponseJws
                            .builder()
                            .header(
                                CardWebProvisionResponse.AppleWebPushProvisioningResponse
                                    .WebPushProvisioningResponseJws
                                    .WebPushProvisioningResponseHeader
                                    .builder()
                                    .kid("8dc7aed4-29e3-41e4-9cdb-673a05e6615c")
                                    .build()
                            )
                            .payload("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9")
                            .protected_("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9")
                            .signature("SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c")
                            .build()
                    )
                    .state("3cc4c292-727b-4ca8-b9a8-f96c15485f4e")
                    .build()
            )

        val roundtrippedCardWebProvisionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardWebProvisionResponse),
                jacksonTypeRef<CardWebProvisionResponse>(),
            )

        assertThat(roundtrippedCardWebProvisionResponse).isEqualTo(cardWebProvisionResponse)
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
