// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import com.lithic.api.errors.LithicInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class RuleFeatureTest {

    @Test
    fun ofAuthorization() {
        val authorization =
            RuleFeature.AuthorizationFeature.builder()
                .type(RuleFeature.AuthorizationFeature.Type.AUTHORIZATION)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofAuthorization(authorization)

        assertThat(ruleFeature.authorization()).contains(authorization)
        assertThat(ruleFeature.authentication()).isEmpty
        assertThat(ruleFeature.tokenization()).isEmpty
        assertThat(ruleFeature.achReceipt()).isEmpty
        assertThat(ruleFeature.card()).isEmpty
        assertThat(ruleFeature.accountHolder()).isEmpty
        assertThat(ruleFeature.ipMetadata()).isEmpty
        assertThat(ruleFeature.spendVelocity()).isEmpty
        assertThat(ruleFeature.transactionHistorySignals()).isEmpty
    }

    @Test
    fun ofAuthorizationRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofAuthorization(
                RuleFeature.AuthorizationFeature.builder()
                    .type(RuleFeature.AuthorizationFeature.Type.AUTHORIZATION)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofAuthentication() {
        val authentication =
            RuleFeature.AuthenticationFeature.builder()
                .type(RuleFeature.AuthenticationFeature.Type.AUTHENTICATION)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofAuthentication(authentication)

        assertThat(ruleFeature.authorization()).isEmpty
        assertThat(ruleFeature.authentication()).contains(authentication)
        assertThat(ruleFeature.tokenization()).isEmpty
        assertThat(ruleFeature.achReceipt()).isEmpty
        assertThat(ruleFeature.card()).isEmpty
        assertThat(ruleFeature.accountHolder()).isEmpty
        assertThat(ruleFeature.ipMetadata()).isEmpty
        assertThat(ruleFeature.spendVelocity()).isEmpty
        assertThat(ruleFeature.transactionHistorySignals()).isEmpty
    }

    @Test
    fun ofAuthenticationRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofAuthentication(
                RuleFeature.AuthenticationFeature.builder()
                    .type(RuleFeature.AuthenticationFeature.Type.AUTHENTICATION)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofTokenization() {
        val tokenization =
            RuleFeature.TokenizationFeature.builder()
                .type(RuleFeature.TokenizationFeature.Type.TOKENIZATION)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofTokenization(tokenization)

        assertThat(ruleFeature.authorization()).isEmpty
        assertThat(ruleFeature.authentication()).isEmpty
        assertThat(ruleFeature.tokenization()).contains(tokenization)
        assertThat(ruleFeature.achReceipt()).isEmpty
        assertThat(ruleFeature.card()).isEmpty
        assertThat(ruleFeature.accountHolder()).isEmpty
        assertThat(ruleFeature.ipMetadata()).isEmpty
        assertThat(ruleFeature.spendVelocity()).isEmpty
        assertThat(ruleFeature.transactionHistorySignals()).isEmpty
    }

    @Test
    fun ofTokenizationRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofTokenization(
                RuleFeature.TokenizationFeature.builder()
                    .type(RuleFeature.TokenizationFeature.Type.TOKENIZATION)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofAchReceipt() {
        val achReceipt =
            RuleFeature.AchReceiptFeature.builder()
                .type(RuleFeature.AchReceiptFeature.Type.ACH_RECEIPT)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofAchReceipt(achReceipt)

        assertThat(ruleFeature.authorization()).isEmpty
        assertThat(ruleFeature.authentication()).isEmpty
        assertThat(ruleFeature.tokenization()).isEmpty
        assertThat(ruleFeature.achReceipt()).contains(achReceipt)
        assertThat(ruleFeature.card()).isEmpty
        assertThat(ruleFeature.accountHolder()).isEmpty
        assertThat(ruleFeature.ipMetadata()).isEmpty
        assertThat(ruleFeature.spendVelocity()).isEmpty
        assertThat(ruleFeature.transactionHistorySignals()).isEmpty
    }

    @Test
    fun ofAchReceiptRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofAchReceipt(
                RuleFeature.AchReceiptFeature.builder()
                    .type(RuleFeature.AchReceiptFeature.Type.ACH_RECEIPT)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofCard() {
        val card =
            RuleFeature.CardFeature.builder()
                .type(RuleFeature.CardFeature.Type.CARD)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofCard(card)

        assertThat(ruleFeature.authorization()).isEmpty
        assertThat(ruleFeature.authentication()).isEmpty
        assertThat(ruleFeature.tokenization()).isEmpty
        assertThat(ruleFeature.achReceipt()).isEmpty
        assertThat(ruleFeature.card()).contains(card)
        assertThat(ruleFeature.accountHolder()).isEmpty
        assertThat(ruleFeature.ipMetadata()).isEmpty
        assertThat(ruleFeature.spendVelocity()).isEmpty
        assertThat(ruleFeature.transactionHistorySignals()).isEmpty
    }

    @Test
    fun ofCardRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofCard(
                RuleFeature.CardFeature.builder()
                    .type(RuleFeature.CardFeature.Type.CARD)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofAccountHolder() {
        val accountHolder =
            RuleFeature.AccountHolderFeature.builder()
                .type(RuleFeature.AccountHolderFeature.Type.ACCOUNT_HOLDER)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofAccountHolder(accountHolder)

        assertThat(ruleFeature.authorization()).isEmpty
        assertThat(ruleFeature.authentication()).isEmpty
        assertThat(ruleFeature.tokenization()).isEmpty
        assertThat(ruleFeature.achReceipt()).isEmpty
        assertThat(ruleFeature.card()).isEmpty
        assertThat(ruleFeature.accountHolder()).contains(accountHolder)
        assertThat(ruleFeature.ipMetadata()).isEmpty
        assertThat(ruleFeature.spendVelocity()).isEmpty
        assertThat(ruleFeature.transactionHistorySignals()).isEmpty
    }

    @Test
    fun ofAccountHolderRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofAccountHolder(
                RuleFeature.AccountHolderFeature.builder()
                    .type(RuleFeature.AccountHolderFeature.Type.ACCOUNT_HOLDER)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofIpMetadata() {
        val ipMetadata =
            RuleFeature.IpMetadataFeature.builder()
                .type(RuleFeature.IpMetadataFeature.Type.IP_METADATA)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofIpMetadata(ipMetadata)

        assertThat(ruleFeature.authorization()).isEmpty
        assertThat(ruleFeature.authentication()).isEmpty
        assertThat(ruleFeature.tokenization()).isEmpty
        assertThat(ruleFeature.achReceipt()).isEmpty
        assertThat(ruleFeature.card()).isEmpty
        assertThat(ruleFeature.accountHolder()).isEmpty
        assertThat(ruleFeature.ipMetadata()).contains(ipMetadata)
        assertThat(ruleFeature.spendVelocity()).isEmpty
        assertThat(ruleFeature.transactionHistorySignals()).isEmpty
    }

    @Test
    fun ofIpMetadataRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofIpMetadata(
                RuleFeature.IpMetadataFeature.builder()
                    .type(RuleFeature.IpMetadataFeature.Type.IP_METADATA)
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofSpendVelocity() {
        val spendVelocity =
            RuleFeature.SpendVelocityFeature.builder()
                .period(
                    VelocityLimitPeriod.TrailingWindowObject.builder()
                        .duration(10L)
                        .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                        .build()
                )
                .scope(RuleFeature.SpendVelocityFeature.VelocityScope.CARD)
                .type(RuleFeature.SpendVelocityFeature.Type.SPEND_VELOCITY)
                .filters(
                    VelocityLimitFilters.builder()
                        .addExcludeCountry("USD")
                        .addExcludeMcc("5542")
                        .addIncludeCountry("USD")
                        .addIncludeMcc("5542")
                        .addIncludePanEntryMode(VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY)
                        .build()
                )
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofSpendVelocity(spendVelocity)

        assertThat(ruleFeature.authorization()).isEmpty
        assertThat(ruleFeature.authentication()).isEmpty
        assertThat(ruleFeature.tokenization()).isEmpty
        assertThat(ruleFeature.achReceipt()).isEmpty
        assertThat(ruleFeature.card()).isEmpty
        assertThat(ruleFeature.accountHolder()).isEmpty
        assertThat(ruleFeature.ipMetadata()).isEmpty
        assertThat(ruleFeature.spendVelocity()).contains(spendVelocity)
        assertThat(ruleFeature.transactionHistorySignals()).isEmpty
    }

    @Test
    fun ofSpendVelocityRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofSpendVelocity(
                RuleFeature.SpendVelocityFeature.builder()
                    .period(
                        VelocityLimitPeriod.TrailingWindowObject.builder()
                            .duration(10L)
                            .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                            .build()
                    )
                    .scope(RuleFeature.SpendVelocityFeature.VelocityScope.CARD)
                    .type(RuleFeature.SpendVelocityFeature.Type.SPEND_VELOCITY)
                    .filters(
                        VelocityLimitFilters.builder()
                            .addExcludeCountry("USD")
                            .addExcludeMcc("5542")
                            .addIncludeCountry("USD")
                            .addIncludeMcc("5542")
                            .addIncludePanEntryMode(
                                VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY
                            )
                            .build()
                    )
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
    }

    @Test
    fun ofTransactionHistorySignals() {
        val transactionHistorySignals =
            RuleFeature.TransactionHistorySignalsFeature.builder()
                .scope(RuleFeature.TransactionHistorySignalsFeature.Scope.CARD)
                .type(RuleFeature.TransactionHistorySignalsFeature.Type.TRANSACTION_HISTORY_SIGNALS)
                .name("name")
                .build()

        val ruleFeature = RuleFeature.ofTransactionHistorySignals(transactionHistorySignals)

        assertThat(ruleFeature.authorization()).isEmpty
        assertThat(ruleFeature.authentication()).isEmpty
        assertThat(ruleFeature.tokenization()).isEmpty
        assertThat(ruleFeature.achReceipt()).isEmpty
        assertThat(ruleFeature.card()).isEmpty
        assertThat(ruleFeature.accountHolder()).isEmpty
        assertThat(ruleFeature.ipMetadata()).isEmpty
        assertThat(ruleFeature.spendVelocity()).isEmpty
        assertThat(ruleFeature.transactionHistorySignals()).contains(transactionHistorySignals)
    }

    @Test
    fun ofTransactionHistorySignalsRoundtrip() {
        val jsonMapper = jsonMapper()
        val ruleFeature =
            RuleFeature.ofTransactionHistorySignals(
                RuleFeature.TransactionHistorySignalsFeature.builder()
                    .scope(RuleFeature.TransactionHistorySignalsFeature.Scope.CARD)
                    .type(
                        RuleFeature.TransactionHistorySignalsFeature.Type
                            .TRANSACTION_HISTORY_SIGNALS
                    )
                    .name("name")
                    .build()
            )

        val roundtrippedRuleFeature =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleFeature),
                jacksonTypeRef<RuleFeature>(),
            )

        assertThat(roundtrippedRuleFeature).isEqualTo(ruleFeature)
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
        val ruleFeature = jsonMapper().convertValue(testCase.value, jacksonTypeRef<RuleFeature>())

        val e = assertThrows<LithicInvalidDataException> { ruleFeature.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
