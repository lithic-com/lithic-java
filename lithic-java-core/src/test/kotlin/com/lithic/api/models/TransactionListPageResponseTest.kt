// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionListPageResponseTest {

    @Test
    fun create() {
        val transactionListPageResponse =
            TransactionListPageResponse.builder()
                .addData(
                    Transaction.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accountToken("bd5e5649-1be8-4117-9bc5-3268258d1417")
                        .acquirerFee(0L)
                        .acquirerReferenceNumber("12345678987654321234567")
                        .amount(1000L)
                        .amounts(
                            Transaction.TransactionAmounts.builder()
                                .cardholder(
                                    Transaction.TransactionAmounts.Cardholder.builder()
                                        .amount(-1000L)
                                        .conversionRate("1.000000")
                                        .currency("USD")
                                        .build()
                                )
                                .hold(
                                    Transaction.TransactionAmounts.Hold.builder()
                                        .amount(0L)
                                        .currency("USD")
                                        .build()
                                )
                                .merchant(
                                    Transaction.TransactionAmounts.Merchant.builder()
                                        .amount(-1000L)
                                        .currency("USD")
                                        .build()
                                )
                                .settlement(
                                    Transaction.TransactionAmounts.Settlement.builder()
                                        .amount(-1000L)
                                        .currency("USD")
                                        .build()
                                )
                                .build()
                        )
                        .authorizationAmount(1000L)
                        .authorizationCode("123456")
                        .avs(
                            Transaction.Avs.builder().address("address").zipcode("zipcode").build()
                        )
                        .cardToken("19c22c47-7a75-43ee-9891-595419830f7e")
                        .cardholderAuthentication(
                            Transaction.CardholderAuthentication.builder()
                                .threeDSVersion("2")
                                .acquirerExemption(
                                    Transaction.CardholderAuthentication.AcquirerExemption.NONE
                                )
                                .authenticationResult(
                                    Transaction.CardholderAuthentication.AuthenticationResult
                                        .SUCCESS
                                )
                                .decisionMadeBy(
                                    Transaction.CardholderAuthentication.DecisionMadeBy.LITHIC_RULES
                                )
                                .liabilityShift(
                                    Transaction.CardholderAuthentication.LiabilityShift
                                        ._3DS_AUTHENTICATED
                                )
                                .threeDSAuthenticationToken("a6e372d0-b40a-43eb-b0d1-4e1aebef5875")
                                .verificationAttempted(
                                    Transaction.CardholderAuthentication.VerificationAttempted.NONE
                                )
                                .verificationResult(
                                    Transaction.CardholderAuthentication.VerificationResult
                                        .FRICTIONLESS
                                )
                                .build()
                        )
                        .created(OffsetDateTime.parse("2023-09-26T21:14:28.637Z"))
                        .merchant(
                            Transaction.Merchant.builder()
                                .acceptorId("333301802529120")
                                .acquiringInstitutionId("191231")
                                .city("NEW YORK")
                                .country("USA")
                                .descriptor("COFFEE SHOP")
                                .mcc("5812")
                                .state("NY")
                                .build()
                        )
                        .merchantAmount(1000L)
                        .merchantAuthorizationAmount(1000L)
                        .merchantCurrency("USD")
                        .network(Transaction.Network.MASTERCARD)
                        .networkRiskScore(0L)
                        .pos(
                            Transaction.Pos.builder()
                                .entryMode(
                                    Transaction.Pos.PosEntryMode.builder()
                                        .card(Transaction.Pos.PosEntryMode.Card.NOT_PRESENT)
                                        .cardholder(
                                            Transaction.Pos.PosEntryMode.Cardholder.DEFERRED_BILLING
                                        )
                                        .pan(Transaction.Pos.PosEntryMode.Pan.AUTO_ENTRY)
                                        .pinEntered(true)
                                        .build()
                                )
                                .terminal(
                                    Transaction.Pos.PosTerminal.builder()
                                        .attended(true)
                                        .cardRetentionCapable(true)
                                        .onPremise(true)
                                        .operator(
                                            Transaction.Pos.PosTerminal.Operator.ADMINISTRATIVE
                                        )
                                        .partialApprovalCapable(true)
                                        .pinCapability(
                                            Transaction.Pos.PosTerminal.PinCapability.CAPABLE
                                        )
                                        .type(Transaction.Pos.PosTerminal.Type.ADMINISTRATIVE)
                                        .build()
                                )
                                .build()
                        )
                        .result(Transaction.DeclineResult.APPROVED)
                        .settledAmount(1000L)
                        .status(Transaction.Status.SETTLED)
                        .tokenInfo(
                            Transaction.TokenInfo.builder()
                                .walletType(Transaction.TokenInfo.WalletType.APPLE_PAY)
                                .build()
                        )
                        .updated(OffsetDateTime.parse("2023-09-26T21:14:28.637Z"))
                        .addEvent(
                            Transaction.TransactionEvent.builder()
                                .token("0c2adae9-f535-4505-8c35-421dad9bd0b6")
                                .amount(1000L)
                                .amounts(
                                    Transaction.TransactionEvent.TransactionEventAmounts.builder()
                                        .cardholder(
                                            Transaction.TransactionEvent.TransactionEventAmounts
                                                .Cardholder
                                                .builder()
                                                .amount(1000L)
                                                .conversionRate("1.000000")
                                                .currency("USD")
                                                .build()
                                        )
                                        .merchant(
                                            Transaction.TransactionEvent.TransactionEventAmounts
                                                .Merchant
                                                .builder()
                                                .amount(1000L)
                                                .currency("USD")
                                                .build()
                                        )
                                        .settlement(
                                            Transaction.TransactionEvent.TransactionEventAmounts
                                                .Settlement
                                                .builder()
                                                .amount(1000L)
                                                .conversionRate("1.000000")
                                                .currency("USD")
                                                .build()
                                        )
                                        .build()
                                )
                                .created(OffsetDateTime.parse("2023-09-26T21:14:28.637Z"))
                                .addDetailedResult(
                                    Transaction.TransactionEvent.DetailedResult.APPROVED
                                )
                                .effectivePolarity(
                                    Transaction.TransactionEvent.EffectivePolarity.DEBIT
                                )
                                .networkInfo(
                                    Transaction.TransactionEvent.NetworkInfo.builder()
                                        .acquirer(
                                            Transaction.TransactionEvent.NetworkInfo.Acquirer
                                                .builder()
                                                .acquirerReferenceNumber(
                                                    "acquirer_reference_number"
                                                )
                                                .retrievalReferenceNumber(
                                                    "retrieval_reference_number"
                                                )
                                                .build()
                                        )
                                        .mastercard(
                                            Transaction.TransactionEvent.NetworkInfo.Mastercard
                                                .builder()
                                                .banknetReferenceNumber("banknet_reference_number")
                                                .originalBanknetReferenceNumber(
                                                    "original_banknet_reference_number"
                                                )
                                                .originalSwitchSerialNumber(
                                                    "original_switch_serial_number"
                                                )
                                                .switchSerialNumber("switch_serial_number")
                                                .build()
                                        )
                                        .visa(
                                            Transaction.TransactionEvent.NetworkInfo.Visa.builder()
                                                .originalTransactionId("original_transaction_id")
                                                .transactionId("transaction_id")
                                                .build()
                                        )
                                        .build()
                                )
                                .result(Transaction.TransactionEvent.DeclineResult.APPROVED)
                                .addRuleResult(
                                    Transaction.TransactionEvent.RuleResult.builder()
                                        .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .explanation("explanation")
                                        .name("name")
                                        .result(
                                            Transaction.TransactionEvent.RuleResult.DetailedResult
                                                .APPROVED
                                        )
                                        .build()
                                )
                                .type(Transaction.TransactionEvent.Type.CLEARING)
                                .build()
                        )
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(transactionListPageResponse.data().getOrNull())
            .containsExactly(
                Transaction.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountToken("bd5e5649-1be8-4117-9bc5-3268258d1417")
                    .acquirerFee(0L)
                    .acquirerReferenceNumber("12345678987654321234567")
                    .amount(1000L)
                    .amounts(
                        Transaction.TransactionAmounts.builder()
                            .cardholder(
                                Transaction.TransactionAmounts.Cardholder.builder()
                                    .amount(-1000L)
                                    .conversionRate("1.000000")
                                    .currency("USD")
                                    .build()
                            )
                            .hold(
                                Transaction.TransactionAmounts.Hold.builder()
                                    .amount(0L)
                                    .currency("USD")
                                    .build()
                            )
                            .merchant(
                                Transaction.TransactionAmounts.Merchant.builder()
                                    .amount(-1000L)
                                    .currency("USD")
                                    .build()
                            )
                            .settlement(
                                Transaction.TransactionAmounts.Settlement.builder()
                                    .amount(-1000L)
                                    .currency("USD")
                                    .build()
                            )
                            .build()
                    )
                    .authorizationAmount(1000L)
                    .authorizationCode("123456")
                    .avs(Transaction.Avs.builder().address("address").zipcode("zipcode").build())
                    .cardToken("19c22c47-7a75-43ee-9891-595419830f7e")
                    .cardholderAuthentication(
                        Transaction.CardholderAuthentication.builder()
                            .threeDSVersion("2")
                            .acquirerExemption(
                                Transaction.CardholderAuthentication.AcquirerExemption.NONE
                            )
                            .authenticationResult(
                                Transaction.CardholderAuthentication.AuthenticationResult.SUCCESS
                            )
                            .decisionMadeBy(
                                Transaction.CardholderAuthentication.DecisionMadeBy.LITHIC_RULES
                            )
                            .liabilityShift(
                                Transaction.CardholderAuthentication.LiabilityShift
                                    ._3DS_AUTHENTICATED
                            )
                            .threeDSAuthenticationToken("a6e372d0-b40a-43eb-b0d1-4e1aebef5875")
                            .verificationAttempted(
                                Transaction.CardholderAuthentication.VerificationAttempted.NONE
                            )
                            .verificationResult(
                                Transaction.CardholderAuthentication.VerificationResult.FRICTIONLESS
                            )
                            .build()
                    )
                    .created(OffsetDateTime.parse("2023-09-26T21:14:28.637Z"))
                    .merchant(
                        Transaction.Merchant.builder()
                            .acceptorId("333301802529120")
                            .acquiringInstitutionId("191231")
                            .city("NEW YORK")
                            .country("USA")
                            .descriptor("COFFEE SHOP")
                            .mcc("5812")
                            .state("NY")
                            .build()
                    )
                    .merchantAmount(1000L)
                    .merchantAuthorizationAmount(1000L)
                    .merchantCurrency("USD")
                    .network(Transaction.Network.MASTERCARD)
                    .networkRiskScore(0L)
                    .pos(
                        Transaction.Pos.builder()
                            .entryMode(
                                Transaction.Pos.PosEntryMode.builder()
                                    .card(Transaction.Pos.PosEntryMode.Card.NOT_PRESENT)
                                    .cardholder(
                                        Transaction.Pos.PosEntryMode.Cardholder.DEFERRED_BILLING
                                    )
                                    .pan(Transaction.Pos.PosEntryMode.Pan.AUTO_ENTRY)
                                    .pinEntered(true)
                                    .build()
                            )
                            .terminal(
                                Transaction.Pos.PosTerminal.builder()
                                    .attended(true)
                                    .cardRetentionCapable(true)
                                    .onPremise(true)
                                    .operator(Transaction.Pos.PosTerminal.Operator.ADMINISTRATIVE)
                                    .partialApprovalCapable(true)
                                    .pinCapability(
                                        Transaction.Pos.PosTerminal.PinCapability.CAPABLE
                                    )
                                    .type(Transaction.Pos.PosTerminal.Type.ADMINISTRATIVE)
                                    .build()
                            )
                            .build()
                    )
                    .result(Transaction.DeclineResult.APPROVED)
                    .settledAmount(1000L)
                    .status(Transaction.Status.SETTLED)
                    .tokenInfo(
                        Transaction.TokenInfo.builder()
                            .walletType(Transaction.TokenInfo.WalletType.APPLE_PAY)
                            .build()
                    )
                    .updated(OffsetDateTime.parse("2023-09-26T21:14:28.637Z"))
                    .addEvent(
                        Transaction.TransactionEvent.builder()
                            .token("0c2adae9-f535-4505-8c35-421dad9bd0b6")
                            .amount(1000L)
                            .amounts(
                                Transaction.TransactionEvent.TransactionEventAmounts.builder()
                                    .cardholder(
                                        Transaction.TransactionEvent.TransactionEventAmounts
                                            .Cardholder
                                            .builder()
                                            .amount(1000L)
                                            .conversionRate("1.000000")
                                            .currency("USD")
                                            .build()
                                    )
                                    .merchant(
                                        Transaction.TransactionEvent.TransactionEventAmounts
                                            .Merchant
                                            .builder()
                                            .amount(1000L)
                                            .currency("USD")
                                            .build()
                                    )
                                    .settlement(
                                        Transaction.TransactionEvent.TransactionEventAmounts
                                            .Settlement
                                            .builder()
                                            .amount(1000L)
                                            .conversionRate("1.000000")
                                            .currency("USD")
                                            .build()
                                    )
                                    .build()
                            )
                            .created(OffsetDateTime.parse("2023-09-26T21:14:28.637Z"))
                            .addDetailedResult(Transaction.TransactionEvent.DetailedResult.APPROVED)
                            .effectivePolarity(Transaction.TransactionEvent.EffectivePolarity.DEBIT)
                            .networkInfo(
                                Transaction.TransactionEvent.NetworkInfo.builder()
                                    .acquirer(
                                        Transaction.TransactionEvent.NetworkInfo.Acquirer.builder()
                                            .acquirerReferenceNumber("acquirer_reference_number")
                                            .retrievalReferenceNumber("retrieval_reference_number")
                                            .build()
                                    )
                                    .mastercard(
                                        Transaction.TransactionEvent.NetworkInfo.Mastercard
                                            .builder()
                                            .banknetReferenceNumber("banknet_reference_number")
                                            .originalBanknetReferenceNumber(
                                                "original_banknet_reference_number"
                                            )
                                            .originalSwitchSerialNumber(
                                                "original_switch_serial_number"
                                            )
                                            .switchSerialNumber("switch_serial_number")
                                            .build()
                                    )
                                    .visa(
                                        Transaction.TransactionEvent.NetworkInfo.Visa.builder()
                                            .originalTransactionId("original_transaction_id")
                                            .transactionId("transaction_id")
                                            .build()
                                    )
                                    .build()
                            )
                            .result(Transaction.TransactionEvent.DeclineResult.APPROVED)
                            .addRuleResult(
                                Transaction.TransactionEvent.RuleResult.builder()
                                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .explanation("explanation")
                                    .name("name")
                                    .result(
                                        Transaction.TransactionEvent.RuleResult.DetailedResult
                                            .APPROVED
                                    )
                                    .build()
                            )
                            .type(Transaction.TransactionEvent.Type.CLEARING)
                            .build()
                    )
                    .build()
            )
        assertThat(transactionListPageResponse.hasMore()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionListPageResponse =
            TransactionListPageResponse.builder()
                .addData(
                    Transaction.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accountToken("bd5e5649-1be8-4117-9bc5-3268258d1417")
                        .acquirerFee(0L)
                        .acquirerReferenceNumber("12345678987654321234567")
                        .amount(1000L)
                        .amounts(
                            Transaction.TransactionAmounts.builder()
                                .cardholder(
                                    Transaction.TransactionAmounts.Cardholder.builder()
                                        .amount(-1000L)
                                        .conversionRate("1.000000")
                                        .currency("USD")
                                        .build()
                                )
                                .hold(
                                    Transaction.TransactionAmounts.Hold.builder()
                                        .amount(0L)
                                        .currency("USD")
                                        .build()
                                )
                                .merchant(
                                    Transaction.TransactionAmounts.Merchant.builder()
                                        .amount(-1000L)
                                        .currency("USD")
                                        .build()
                                )
                                .settlement(
                                    Transaction.TransactionAmounts.Settlement.builder()
                                        .amount(-1000L)
                                        .currency("USD")
                                        .build()
                                )
                                .build()
                        )
                        .authorizationAmount(1000L)
                        .authorizationCode("123456")
                        .avs(
                            Transaction.Avs.builder().address("address").zipcode("zipcode").build()
                        )
                        .cardToken("19c22c47-7a75-43ee-9891-595419830f7e")
                        .cardholderAuthentication(
                            Transaction.CardholderAuthentication.builder()
                                .threeDSVersion("2")
                                .acquirerExemption(
                                    Transaction.CardholderAuthentication.AcquirerExemption.NONE
                                )
                                .authenticationResult(
                                    Transaction.CardholderAuthentication.AuthenticationResult
                                        .SUCCESS
                                )
                                .decisionMadeBy(
                                    Transaction.CardholderAuthentication.DecisionMadeBy.LITHIC_RULES
                                )
                                .liabilityShift(
                                    Transaction.CardholderAuthentication.LiabilityShift
                                        ._3DS_AUTHENTICATED
                                )
                                .threeDSAuthenticationToken("a6e372d0-b40a-43eb-b0d1-4e1aebef5875")
                                .verificationAttempted(
                                    Transaction.CardholderAuthentication.VerificationAttempted.NONE
                                )
                                .verificationResult(
                                    Transaction.CardholderAuthentication.VerificationResult
                                        .FRICTIONLESS
                                )
                                .build()
                        )
                        .created(OffsetDateTime.parse("2023-09-26T21:14:28.637Z"))
                        .merchant(
                            Transaction.Merchant.builder()
                                .acceptorId("333301802529120")
                                .acquiringInstitutionId("191231")
                                .city("NEW YORK")
                                .country("USA")
                                .descriptor("COFFEE SHOP")
                                .mcc("5812")
                                .state("NY")
                                .build()
                        )
                        .merchantAmount(1000L)
                        .merchantAuthorizationAmount(1000L)
                        .merchantCurrency("USD")
                        .network(Transaction.Network.MASTERCARD)
                        .networkRiskScore(0L)
                        .pos(
                            Transaction.Pos.builder()
                                .entryMode(
                                    Transaction.Pos.PosEntryMode.builder()
                                        .card(Transaction.Pos.PosEntryMode.Card.NOT_PRESENT)
                                        .cardholder(
                                            Transaction.Pos.PosEntryMode.Cardholder.DEFERRED_BILLING
                                        )
                                        .pan(Transaction.Pos.PosEntryMode.Pan.AUTO_ENTRY)
                                        .pinEntered(true)
                                        .build()
                                )
                                .terminal(
                                    Transaction.Pos.PosTerminal.builder()
                                        .attended(true)
                                        .cardRetentionCapable(true)
                                        .onPremise(true)
                                        .operator(
                                            Transaction.Pos.PosTerminal.Operator.ADMINISTRATIVE
                                        )
                                        .partialApprovalCapable(true)
                                        .pinCapability(
                                            Transaction.Pos.PosTerminal.PinCapability.CAPABLE
                                        )
                                        .type(Transaction.Pos.PosTerminal.Type.ADMINISTRATIVE)
                                        .build()
                                )
                                .build()
                        )
                        .result(Transaction.DeclineResult.APPROVED)
                        .settledAmount(1000L)
                        .status(Transaction.Status.SETTLED)
                        .tokenInfo(
                            Transaction.TokenInfo.builder()
                                .walletType(Transaction.TokenInfo.WalletType.APPLE_PAY)
                                .build()
                        )
                        .updated(OffsetDateTime.parse("2023-09-26T21:14:28.637Z"))
                        .addEvent(
                            Transaction.TransactionEvent.builder()
                                .token("0c2adae9-f535-4505-8c35-421dad9bd0b6")
                                .amount(1000L)
                                .amounts(
                                    Transaction.TransactionEvent.TransactionEventAmounts.builder()
                                        .cardholder(
                                            Transaction.TransactionEvent.TransactionEventAmounts
                                                .Cardholder
                                                .builder()
                                                .amount(1000L)
                                                .conversionRate("1.000000")
                                                .currency("USD")
                                                .build()
                                        )
                                        .merchant(
                                            Transaction.TransactionEvent.TransactionEventAmounts
                                                .Merchant
                                                .builder()
                                                .amount(1000L)
                                                .currency("USD")
                                                .build()
                                        )
                                        .settlement(
                                            Transaction.TransactionEvent.TransactionEventAmounts
                                                .Settlement
                                                .builder()
                                                .amount(1000L)
                                                .conversionRate("1.000000")
                                                .currency("USD")
                                                .build()
                                        )
                                        .build()
                                )
                                .created(OffsetDateTime.parse("2023-09-26T21:14:28.637Z"))
                                .addDetailedResult(
                                    Transaction.TransactionEvent.DetailedResult.APPROVED
                                )
                                .effectivePolarity(
                                    Transaction.TransactionEvent.EffectivePolarity.DEBIT
                                )
                                .networkInfo(
                                    Transaction.TransactionEvent.NetworkInfo.builder()
                                        .acquirer(
                                            Transaction.TransactionEvent.NetworkInfo.Acquirer
                                                .builder()
                                                .acquirerReferenceNumber(
                                                    "acquirer_reference_number"
                                                )
                                                .retrievalReferenceNumber(
                                                    "retrieval_reference_number"
                                                )
                                                .build()
                                        )
                                        .mastercard(
                                            Transaction.TransactionEvent.NetworkInfo.Mastercard
                                                .builder()
                                                .banknetReferenceNumber("banknet_reference_number")
                                                .originalBanknetReferenceNumber(
                                                    "original_banknet_reference_number"
                                                )
                                                .originalSwitchSerialNumber(
                                                    "original_switch_serial_number"
                                                )
                                                .switchSerialNumber("switch_serial_number")
                                                .build()
                                        )
                                        .visa(
                                            Transaction.TransactionEvent.NetworkInfo.Visa.builder()
                                                .originalTransactionId("original_transaction_id")
                                                .transactionId("transaction_id")
                                                .build()
                                        )
                                        .build()
                                )
                                .result(Transaction.TransactionEvent.DeclineResult.APPROVED)
                                .addRuleResult(
                                    Transaction.TransactionEvent.RuleResult.builder()
                                        .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .explanation("explanation")
                                        .name("name")
                                        .result(
                                            Transaction.TransactionEvent.RuleResult.DetailedResult
                                                .APPROVED
                                        )
                                        .build()
                                )
                                .type(Transaction.TransactionEvent.Type.CLEARING)
                                .build()
                        )
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedTransactionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionListPageResponse),
                jacksonTypeRef<TransactionListPageResponse>(),
            )

        assertThat(roundtrippedTransactionListPageResponse).isEqualTo(transactionListPageResponse)
    }
}
