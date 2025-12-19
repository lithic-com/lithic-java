// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class AccountActivityListResponseTest {

    @Test
    fun ofInternal() {
        val internal_ =
            AccountActivityListResponse.FinancialTransaction.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(AccountActivityListResponse.FinancialTransaction.TransactionCategory.ACH)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("USD")
                .descriptor("descriptor")
                .addEvent(
                    FinancialEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .result(FinancialEvent.Result.APPROVED)
                        .type(FinancialEvent.FinancialEventType.ACH_ORIGINATION_CANCELLED)
                        .build()
                )
                .family(AccountActivityListResponse.FinancialTransaction.Family.INTERNAL)
                .financialAccountToken("0cc87075-57cf-4607-8722-f42e2cb2c0cd")
                .pendingAmount(500L)
                .result(AccountActivityListResponse.FinancialTransaction.TransactionResult.APPROVED)
                .settledAmount(200L)
                .status(AccountActivityListResponse.FinancialTransaction.TransactionStatus.PENDING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val accountActivityListResponse = AccountActivityListResponse.ofInternal(internal_)

        assertThat(accountActivityListResponse.internal_()).contains(internal_)
        assertThat(accountActivityListResponse.transfer()).isEmpty
        assertThat(accountActivityListResponse.card()).isEmpty
        assertThat(accountActivityListResponse.payment()).isEmpty
        assertThat(accountActivityListResponse.externalPayment()).isEmpty
        assertThat(accountActivityListResponse.managementOperation()).isEmpty
    }

    @Test
    fun ofInternalRoundtrip() {
        val jsonMapper = jsonMapper()
        val accountActivityListResponse =
            AccountActivityListResponse.ofInternal(
                AccountActivityListResponse.FinancialTransaction.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .category(
                        AccountActivityListResponse.FinancialTransaction.TransactionCategory.ACH
                    )
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("USD")
                    .descriptor("descriptor")
                    .addEvent(
                        FinancialEvent.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .amount(0L)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .result(FinancialEvent.Result.APPROVED)
                            .type(FinancialEvent.FinancialEventType.ACH_ORIGINATION_CANCELLED)
                            .build()
                    )
                    .family(AccountActivityListResponse.FinancialTransaction.Family.INTERNAL)
                    .financialAccountToken("0cc87075-57cf-4607-8722-f42e2cb2c0cd")
                    .pendingAmount(500L)
                    .result(
                        AccountActivityListResponse.FinancialTransaction.TransactionResult.APPROVED
                    )
                    .settledAmount(200L)
                    .status(
                        AccountActivityListResponse.FinancialTransaction.TransactionStatus.PENDING
                    )
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val roundtrippedAccountActivityListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountActivityListResponse),
                jacksonTypeRef<AccountActivityListResponse>(),
            )

        assertThat(roundtrippedAccountActivityListResponse).isEqualTo(accountActivityListResponse)
    }

    @Test
    fun ofTransfer() {
        val transfer =
            BookTransferResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(BookTransferResponse.BookTransferCategory.ADJUSTMENT)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("USD")
                .addEvent(
                    BookTransferResponse.BookTransferEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addDetailedResult(
                            BookTransferResponse.BookTransferEvent.BookTransferDetailedResults
                                .APPROVED
                        )
                        .memo("memo")
                        .result(BookTransferResponse.BookTransferEvent.Result.APPROVED)
                        .subtype("subtype")
                        .type(
                            BookTransferResponse.BookTransferEvent.BookTransferType
                                .ATM_BALANCE_INQUIRY
                        )
                        .build()
                )
                .family(BookTransferResponse.Family.TRANSFER)
                .fromFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pendingAmount(1000L)
                .result(BookTransferResponse.TransactionResult.APPROVED)
                .settledAmount(500L)
                .status(BookTransferResponse.TransactionStatus.PENDING)
                .toFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .externalResource(
                    ExternalResource.builder()
                        .externalResourceToken("external_resource_token")
                        .externalResourceType(ExternalResourceType.STATEMENT)
                        .externalResourceSubToken("external_resource_sub_token")
                        .build()
                )
                .transactionSeries(
                    BookTransferResponse.TransactionSeries.builder()
                        .relatedTransactionEventToken("123e4567-e89b-12d3-a456-426614174000")
                        .relatedTransactionToken("123e4567-e89b-12d3-a456-426614174000")
                        .type("FEE")
                        .build()
                )
                .build()

        val accountActivityListResponse = AccountActivityListResponse.ofTransfer(transfer)

        assertThat(accountActivityListResponse.internal_()).isEmpty
        assertThat(accountActivityListResponse.transfer()).contains(transfer)
        assertThat(accountActivityListResponse.card()).isEmpty
        assertThat(accountActivityListResponse.payment()).isEmpty
        assertThat(accountActivityListResponse.externalPayment()).isEmpty
        assertThat(accountActivityListResponse.managementOperation()).isEmpty
    }

    @Test
    fun ofTransferRoundtrip() {
        val jsonMapper = jsonMapper()
        val accountActivityListResponse =
            AccountActivityListResponse.ofTransfer(
                BookTransferResponse.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .category(BookTransferResponse.BookTransferCategory.ADJUSTMENT)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("USD")
                    .addEvent(
                        BookTransferResponse.BookTransferEvent.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .amount(0L)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addDetailedResult(
                                BookTransferResponse.BookTransferEvent.BookTransferDetailedResults
                                    .APPROVED
                            )
                            .memo("memo")
                            .result(BookTransferResponse.BookTransferEvent.Result.APPROVED)
                            .subtype("subtype")
                            .type(
                                BookTransferResponse.BookTransferEvent.BookTransferType
                                    .ATM_BALANCE_INQUIRY
                            )
                            .build()
                    )
                    .family(BookTransferResponse.Family.TRANSFER)
                    .fromFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pendingAmount(1000L)
                    .result(BookTransferResponse.TransactionResult.APPROVED)
                    .settledAmount(500L)
                    .status(BookTransferResponse.TransactionStatus.PENDING)
                    .toFinancialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalId("external_id")
                    .externalResource(
                        ExternalResource.builder()
                            .externalResourceToken("external_resource_token")
                            .externalResourceType(ExternalResourceType.STATEMENT)
                            .externalResourceSubToken("external_resource_sub_token")
                            .build()
                    )
                    .transactionSeries(
                        BookTransferResponse.TransactionSeries.builder()
                            .relatedTransactionEventToken("123e4567-e89b-12d3-a456-426614174000")
                            .relatedTransactionToken("123e4567-e89b-12d3-a456-426614174000")
                            .type("FEE")
                            .build()
                    )
                    .build()
            )

        val roundtrippedAccountActivityListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountActivityListResponse),
                jacksonTypeRef<AccountActivityListResponse>(),
            )

        assertThat(roundtrippedAccountActivityListResponse).isEqualTo(accountActivityListResponse)
    }

    @Test
    fun ofCard() {
        val card =
            AccountActivityListResponse.CardTransaction.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("db3942f0-0627-4887-a190-1ea83b46d091")
                .acquirerFee(0L)
                .acquirerReferenceNumber(null)
                .amount(1800L)
                .amounts(
                    Transaction.TransactionAmounts.builder()
                        .cardholder(
                            Transaction.TransactionAmounts.Cardholder.builder()
                                .amount(0L)
                                .conversionRate("1.000000")
                                .currency("USD")
                                .build()
                        )
                        .hold(
                            Transaction.TransactionAmounts.Hold.builder()
                                .amount(-1800L)
                                .currency("USD")
                                .build()
                        )
                        .merchant(
                            Transaction.TransactionAmounts.Merchant.builder()
                                .amount(0L)
                                .currency("USD")
                                .build()
                        )
                        .settlement(
                            Transaction.TransactionAmounts.Settlement.builder()
                                .amount(0L)
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .authorizationAmount(1800L)
                .authorizationCode("071471")
                .avs(
                    Transaction.Avs.builder()
                        .address("123 Evergreen Terrace")
                        .zipcode("95006")
                        .build()
                )
                .cardToken("aac502f9-aecc-458a-954e-4bcf6edb6123")
                .cardholderAuthentication(
                    CardholderAuthentication.builder()
                        .authenticationMethod(
                            CardholderAuthentication.AuthenticationMethod.FRICTIONLESS
                        )
                        .authenticationResult(CardholderAuthentication.AuthenticationResult.SUCCESS)
                        .decisionMadeBy(CardholderAuthentication.DecisionMadeBy.NETWORK)
                        .liabilityShift(CardholderAuthentication.LiabilityShift._3DS_AUTHENTICATED)
                        .threeDSAuthenticationToken("fc60d37d-95f7-419c-b628-dd9fbf9d80d0")
                        .build()
                )
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .financialAccountToken("a3b113e8-01fe-42d3-b900-b9adf3f15496")
                .merchant(
                    Merchant.builder()
                        .acceptorId("452322000053360")
                        .acquiringInstitutionId("333301802529120")
                        .city("gosq.com")
                        .country("USA")
                        .descriptor("SQ *SOMA EATS")
                        .mcc("5812")
                        .state("CA")
                        .build()
                )
                .merchantAmount(1800L)
                .merchantAuthorizationAmount(1800L)
                .merchantCurrency("USD")
                .network(Transaction.Network.MASTERCARD)
                .networkRiskScore(5L)
                .pos(
                    Transaction.Pos.builder()
                        .entryMode(
                            Transaction.Pos.PosEntryMode.builder()
                                .card(Transaction.Pos.PosEntryMode.Card.NOT_PRESENT)
                                .cardholder(Transaction.Pos.PosEntryMode.Cardholder.NOT_PRESENT)
                                .pan(Transaction.Pos.PosEntryMode.Pan.ECOMMERCE)
                                .pinEntered(false)
                                .build()
                        )
                        .terminal(
                            Transaction.Pos.PosTerminal.builder()
                                .attended(false)
                                .cardRetentionCapable(false)
                                .onPremise(false)
                                .operator(Transaction.Pos.PosTerminal.Operator.UNKNOWN)
                                .partialApprovalCapable(false)
                                .pinCapability(
                                    Transaction.Pos.PosTerminal.PinCapability.NOT_CAPABLE
                                )
                                .type(Transaction.Pos.PosTerminal.Type.UNKNOWN)
                                .acceptorTerminalId("acceptor_terminal_id")
                                .build()
                        )
                        .build()
                )
                .result(Transaction.DeclineResult.APPROVED)
                .settledAmount(0L)
                .status(Transaction.Status.PENDING)
                .tokenInfo(TokenInfo.builder().walletType(TokenInfo.WalletType.APPLE_PAY).build())
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addEvent(
                    Transaction.TransactionEvent.builder()
                        .token("bbbf1e86-322d-11ee-9779-00505685a123")
                        .amount(1800L)
                        .amounts(
                            Transaction.TransactionEvent.TransactionEventAmounts.builder()
                                .cardholder(
                                    Transaction.TransactionEvent.TransactionEventAmounts.Cardholder
                                        .builder()
                                        .amount(1800L)
                                        .conversionRate("1.000000")
                                        .currency("USD")
                                        .build()
                                )
                                .merchant(
                                    Transaction.TransactionEvent.TransactionEventAmounts.Merchant
                                        .builder()
                                        .amount(1800L)
                                        .currency("USD")
                                        .build()
                                )
                                .settlement(
                                    Transaction.TransactionEvent.TransactionEventAmounts.Settlement
                                        .builder()
                                        .amount(1000L)
                                        .conversionRate("1.000000")
                                        .currency("USD")
                                        .build()
                                )
                                .build()
                        )
                        .created(OffsetDateTime.parse("2023-08-03T18:42:30Z"))
                        .addDetailedResult(Transaction.TransactionEvent.DetailedResult.APPROVED)
                        .effectivePolarity(Transaction.TransactionEvent.EffectivePolarity.DEBIT)
                        .networkInfo(
                            Transaction.TransactionEvent.NetworkInfo.builder()
                                .acquirer(
                                    Transaction.TransactionEvent.NetworkInfo.Acquirer.builder()
                                        .acquirerReferenceNumber(null)
                                        .retrievalReferenceNumber("064386558597")
                                        .build()
                                )
                                .amex(
                                    Transaction.TransactionEvent.NetworkInfo.Amex.builder()
                                        .originalTransactionId("original_transaction_id")
                                        .transactionId("transaction_id")
                                        .build()
                                )
                                .mastercard(
                                    Transaction.TransactionEvent.NetworkInfo.Mastercard.builder()
                                        .banknetReferenceNumber("U1HSCJ")
                                        .originalBanknetReferenceNumber(null)
                                        .originalSwitchSerialNumber(null)
                                        .switchSerialNumber(null)
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
                                    Transaction.TransactionEvent.RuleResult.DetailedResult.APPROVED
                                )
                                .build()
                        )
                        .type(Transaction.TransactionEvent.Type.AUTHORIZATION)
                        .accountType(Transaction.TransactionEvent.AccountType.CHECKING)
                        .networkSpecificData(
                            Transaction.TransactionEvent.NetworkSpecificData.builder()
                                .mastercard(
                                    Transaction.TransactionEvent.NetworkSpecificData
                                        .MastercardNetworkSpecificData
                                        .builder()
                                        .ecommerceSecurityLevelIndicator("xxx")
                                        .addOnBehalfServiceResult(
                                            Transaction.TransactionEvent.NetworkSpecificData
                                                .MastercardNetworkSpecificData
                                                .OnBehalfServiceResult
                                                .builder()
                                                .result1("x")
                                                .result2("x")
                                                .service("xx")
                                                .build()
                                        )
                                        .transactionTypeIdentifier("xxx")
                                        .build()
                                )
                                .visa(
                                    Transaction.TransactionEvent.NetworkSpecificData
                                        .VisaNetworkSpecificData
                                        .builder()
                                        .businessApplicationIdentifier("xx")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .family(AccountActivityListResponse.CardTransaction.Family.CARD)
                .build()

        val accountActivityListResponse = AccountActivityListResponse.ofCard(card)

        assertThat(accountActivityListResponse.internal_()).isEmpty
        assertThat(accountActivityListResponse.transfer()).isEmpty
        assertThat(accountActivityListResponse.card()).contains(card)
        assertThat(accountActivityListResponse.payment()).isEmpty
        assertThat(accountActivityListResponse.externalPayment()).isEmpty
        assertThat(accountActivityListResponse.managementOperation()).isEmpty
    }

    @Test
    fun ofCardRoundtrip() {
        val jsonMapper = jsonMapper()
        val accountActivityListResponse =
            AccountActivityListResponse.ofCard(
                AccountActivityListResponse.CardTransaction.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountToken("db3942f0-0627-4887-a190-1ea83b46d091")
                    .acquirerFee(0L)
                    .acquirerReferenceNumber(null)
                    .amount(1800L)
                    .amounts(
                        Transaction.TransactionAmounts.builder()
                            .cardholder(
                                Transaction.TransactionAmounts.Cardholder.builder()
                                    .amount(0L)
                                    .conversionRate("1.000000")
                                    .currency("USD")
                                    .build()
                            )
                            .hold(
                                Transaction.TransactionAmounts.Hold.builder()
                                    .amount(-1800L)
                                    .currency("USD")
                                    .build()
                            )
                            .merchant(
                                Transaction.TransactionAmounts.Merchant.builder()
                                    .amount(0L)
                                    .currency("USD")
                                    .build()
                            )
                            .settlement(
                                Transaction.TransactionAmounts.Settlement.builder()
                                    .amount(0L)
                                    .currency("USD")
                                    .build()
                            )
                            .build()
                    )
                    .authorizationAmount(1800L)
                    .authorizationCode("071471")
                    .avs(
                        Transaction.Avs.builder()
                            .address("123 Evergreen Terrace")
                            .zipcode("95006")
                            .build()
                    )
                    .cardToken("aac502f9-aecc-458a-954e-4bcf6edb6123")
                    .cardholderAuthentication(
                        CardholderAuthentication.builder()
                            .authenticationMethod(
                                CardholderAuthentication.AuthenticationMethod.FRICTIONLESS
                            )
                            .authenticationResult(
                                CardholderAuthentication.AuthenticationResult.SUCCESS
                            )
                            .decisionMadeBy(CardholderAuthentication.DecisionMadeBy.NETWORK)
                            .liabilityShift(
                                CardholderAuthentication.LiabilityShift._3DS_AUTHENTICATED
                            )
                            .threeDSAuthenticationToken("fc60d37d-95f7-419c-b628-dd9fbf9d80d0")
                            .build()
                    )
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .financialAccountToken("a3b113e8-01fe-42d3-b900-b9adf3f15496")
                    .merchant(
                        Merchant.builder()
                            .acceptorId("452322000053360")
                            .acquiringInstitutionId("333301802529120")
                            .city("gosq.com")
                            .country("USA")
                            .descriptor("SQ *SOMA EATS")
                            .mcc("5812")
                            .state("CA")
                            .build()
                    )
                    .merchantAmount(1800L)
                    .merchantAuthorizationAmount(1800L)
                    .merchantCurrency("USD")
                    .network(Transaction.Network.MASTERCARD)
                    .networkRiskScore(5L)
                    .pos(
                        Transaction.Pos.builder()
                            .entryMode(
                                Transaction.Pos.PosEntryMode.builder()
                                    .card(Transaction.Pos.PosEntryMode.Card.NOT_PRESENT)
                                    .cardholder(Transaction.Pos.PosEntryMode.Cardholder.NOT_PRESENT)
                                    .pan(Transaction.Pos.PosEntryMode.Pan.ECOMMERCE)
                                    .pinEntered(false)
                                    .build()
                            )
                            .terminal(
                                Transaction.Pos.PosTerminal.builder()
                                    .attended(false)
                                    .cardRetentionCapable(false)
                                    .onPremise(false)
                                    .operator(Transaction.Pos.PosTerminal.Operator.UNKNOWN)
                                    .partialApprovalCapable(false)
                                    .pinCapability(
                                        Transaction.Pos.PosTerminal.PinCapability.NOT_CAPABLE
                                    )
                                    .type(Transaction.Pos.PosTerminal.Type.UNKNOWN)
                                    .acceptorTerminalId("acceptor_terminal_id")
                                    .build()
                            )
                            .build()
                    )
                    .result(Transaction.DeclineResult.APPROVED)
                    .settledAmount(0L)
                    .status(Transaction.Status.PENDING)
                    .tokenInfo(
                        TokenInfo.builder().walletType(TokenInfo.WalletType.APPLE_PAY).build()
                    )
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addEvent(
                        Transaction.TransactionEvent.builder()
                            .token("bbbf1e86-322d-11ee-9779-00505685a123")
                            .amount(1800L)
                            .amounts(
                                Transaction.TransactionEvent.TransactionEventAmounts.builder()
                                    .cardholder(
                                        Transaction.TransactionEvent.TransactionEventAmounts
                                            .Cardholder
                                            .builder()
                                            .amount(1800L)
                                            .conversionRate("1.000000")
                                            .currency("USD")
                                            .build()
                                    )
                                    .merchant(
                                        Transaction.TransactionEvent.TransactionEventAmounts
                                            .Merchant
                                            .builder()
                                            .amount(1800L)
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
                            .created(OffsetDateTime.parse("2023-08-03T18:42:30Z"))
                            .addDetailedResult(Transaction.TransactionEvent.DetailedResult.APPROVED)
                            .effectivePolarity(Transaction.TransactionEvent.EffectivePolarity.DEBIT)
                            .networkInfo(
                                Transaction.TransactionEvent.NetworkInfo.builder()
                                    .acquirer(
                                        Transaction.TransactionEvent.NetworkInfo.Acquirer.builder()
                                            .acquirerReferenceNumber(null)
                                            .retrievalReferenceNumber("064386558597")
                                            .build()
                                    )
                                    .amex(
                                        Transaction.TransactionEvent.NetworkInfo.Amex.builder()
                                            .originalTransactionId("original_transaction_id")
                                            .transactionId("transaction_id")
                                            .build()
                                    )
                                    .mastercard(
                                        Transaction.TransactionEvent.NetworkInfo.Mastercard
                                            .builder()
                                            .banknetReferenceNumber("U1HSCJ")
                                            .originalBanknetReferenceNumber(null)
                                            .originalSwitchSerialNumber(null)
                                            .switchSerialNumber(null)
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
                            .type(Transaction.TransactionEvent.Type.AUTHORIZATION)
                            .accountType(Transaction.TransactionEvent.AccountType.CHECKING)
                            .networkSpecificData(
                                Transaction.TransactionEvent.NetworkSpecificData.builder()
                                    .mastercard(
                                        Transaction.TransactionEvent.NetworkSpecificData
                                            .MastercardNetworkSpecificData
                                            .builder()
                                            .ecommerceSecurityLevelIndicator("xxx")
                                            .addOnBehalfServiceResult(
                                                Transaction.TransactionEvent.NetworkSpecificData
                                                    .MastercardNetworkSpecificData
                                                    .OnBehalfServiceResult
                                                    .builder()
                                                    .result1("x")
                                                    .result2("x")
                                                    .service("xx")
                                                    .build()
                                            )
                                            .transactionTypeIdentifier("xxx")
                                            .build()
                                    )
                                    .visa(
                                        Transaction.TransactionEvent.NetworkSpecificData
                                            .VisaNetworkSpecificData
                                            .builder()
                                            .businessApplicationIdentifier("xx")
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .family(AccountActivityListResponse.CardTransaction.Family.CARD)
                    .build()
            )

        val roundtrippedAccountActivityListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountActivityListResponse),
                jacksonTypeRef<AccountActivityListResponse>(),
            )

        assertThat(roundtrippedAccountActivityListResponse).isEqualTo(accountActivityListResponse)
    }

    @Test
    fun ofPayment() {
        val payment =
            Payment.builder()
                .token("bd4efddb-771b-49e3-9af9-49b077ab5eb8")
                .category(Payment.TransactionCategory.ACH)
                .created(OffsetDateTime.parse("2025-10-27T20:12:22Z"))
                .descriptor("ach_origination_credit")
                .direction(Payment.Direction.CREDIT)
                .addEvent(
                    Payment.PaymentEvent.builder()
                        .token("327dccc3-fe42-54d2-962c-7f8135805464")
                        .amount(-1588L)
                        .created(OffsetDateTime.parse("2025-10-27T20:12:22Z"))
                        .result(Payment.PaymentEvent.Result.APPROVED)
                        .type(Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_INITIATED)
                        .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                        .externalId("external_id")
                        .build()
                )
                .addEvent(
                    Payment.PaymentEvent.builder()
                        .token("f9165477-7cfc-53c6-98f1-84e9ec856a60")
                        .amount(-1588L)
                        .created(OffsetDateTime.parse("2025-10-27T20:12:25Z"))
                        .result(Payment.PaymentEvent.Result.APPROVED)
                        .type(Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_REVIEWED)
                        .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                        .externalId("external_id")
                        .build()
                )
                .family(Payment.Family.PAYMENT)
                .financialAccountToken("35b0c466-a3e3-519a-9549-ead6a6a2277d")
                .method(Payment.Method.ACH_NEXT_DAY)
                .methodAttributes(
                    Payment.MethodAttributes.AchMethodAttributes.builder()
                        .secCode(Payment.MethodAttributes.AchMethodAttributes.SecCode.CCD)
                        .achHoldPeriod(1L)
                        .addenda(null)
                        .companyId("1111111111")
                        .receiptRoutingNumber(null)
                        .retries(0L)
                        .returnReasonCode(null)
                        .addTraceNumber("string")
                        .build()
                )
                .pendingAmount(-1588L)
                .relatedAccountTokens(
                    Payment.RelatedAccountTokens.builder()
                        .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .result(Payment.TransactionResult.APPROVED)
                .settledAmount(0L)
                .source(Payment.Source.LITHIC)
                .status(Payment.TransactionStatus.PENDING)
                .updated(OffsetDateTime.parse("2025-10-27T20:12:25Z"))
                .currency("USD")
                .expectedReleaseDate(null)
                .externalBankAccountToken("feb4fee1-2414-4c38-a5f6-9deac293c8f4")
                .type(Payment.TransferType.ORIGINATION_CREDIT)
                .userDefinedId(null)
                .build()

        val accountActivityListResponse = AccountActivityListResponse.ofPayment(payment)

        assertThat(accountActivityListResponse.internal_()).isEmpty
        assertThat(accountActivityListResponse.transfer()).isEmpty
        assertThat(accountActivityListResponse.card()).isEmpty
        assertThat(accountActivityListResponse.payment()).contains(payment)
        assertThat(accountActivityListResponse.externalPayment()).isEmpty
        assertThat(accountActivityListResponse.managementOperation()).isEmpty
    }

    @Test
    fun ofPaymentRoundtrip() {
        val jsonMapper = jsonMapper()
        val accountActivityListResponse =
            AccountActivityListResponse.ofPayment(
                Payment.builder()
                    .token("bd4efddb-771b-49e3-9af9-49b077ab5eb8")
                    .category(Payment.TransactionCategory.ACH)
                    .created(OffsetDateTime.parse("2025-10-27T20:12:22Z"))
                    .descriptor("ach_origination_credit")
                    .direction(Payment.Direction.CREDIT)
                    .addEvent(
                        Payment.PaymentEvent.builder()
                            .token("327dccc3-fe42-54d2-962c-7f8135805464")
                            .amount(-1588L)
                            .created(OffsetDateTime.parse("2025-10-27T20:12:22Z"))
                            .result(Payment.PaymentEvent.Result.APPROVED)
                            .type(Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_INITIATED)
                            .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                            .externalId("external_id")
                            .build()
                    )
                    .addEvent(
                        Payment.PaymentEvent.builder()
                            .token("f9165477-7cfc-53c6-98f1-84e9ec856a60")
                            .amount(-1588L)
                            .created(OffsetDateTime.parse("2025-10-27T20:12:25Z"))
                            .result(Payment.PaymentEvent.Result.APPROVED)
                            .type(Payment.PaymentEvent.PaymentEventType.ACH_ORIGINATION_REVIEWED)
                            .addDetailedResult(Payment.PaymentEvent.DetailedResult.APPROVED)
                            .externalId("external_id")
                            .build()
                    )
                    .family(Payment.Family.PAYMENT)
                    .financialAccountToken("35b0c466-a3e3-519a-9549-ead6a6a2277d")
                    .method(Payment.Method.ACH_NEXT_DAY)
                    .methodAttributes(
                        Payment.MethodAttributes.AchMethodAttributes.builder()
                            .secCode(Payment.MethodAttributes.AchMethodAttributes.SecCode.CCD)
                            .achHoldPeriod(1L)
                            .addenda(null)
                            .companyId("1111111111")
                            .receiptRoutingNumber(null)
                            .retries(0L)
                            .returnReasonCode(null)
                            .addTraceNumber("string")
                            .build()
                    )
                    .pendingAmount(-1588L)
                    .relatedAccountTokens(
                        Payment.RelatedAccountTokens.builder()
                            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .businessAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .result(Payment.TransactionResult.APPROVED)
                    .settledAmount(0L)
                    .source(Payment.Source.LITHIC)
                    .status(Payment.TransactionStatus.PENDING)
                    .updated(OffsetDateTime.parse("2025-10-27T20:12:25Z"))
                    .currency("USD")
                    .expectedReleaseDate(null)
                    .externalBankAccountToken("feb4fee1-2414-4c38-a5f6-9deac293c8f4")
                    .type(Payment.TransferType.ORIGINATION_CREDIT)
                    .userDefinedId(null)
                    .build()
            )

        val roundtrippedAccountActivityListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountActivityListResponse),
                jacksonTypeRef<AccountActivityListResponse>(),
            )

        assertThat(roundtrippedAccountActivityListResponse).isEqualTo(accountActivityListResponse)
    }

    @Test
    fun ofExternalPayment() {
        val externalPayment =
            ExternalPayment.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(ExternalPayment.TransactionStatus.PENDING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .category(ExternalPayment.ExternalPaymentCategory.EXTERNAL_WIRE)
                .currency("currency")
                .addEvent(
                    ExternalPayment.ExternalPaymentEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addDetailedResult(
                            ExternalPayment.ExternalPaymentEvent.DetailedResults.APPROVED
                        )
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .memo("memo")
                        .result(ExternalPayment.ExternalPaymentEvent.TransactionResult.APPROVED)
                        .type(
                            ExternalPayment.ExternalPaymentEvent.ExternalPaymentEventType
                                .EXTERNAL_WIRE_INITIATED
                        )
                        .build()
                )
                .family(ExternalPayment.Family.EXTERNAL_PAYMENT)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentType(ExternalPayment.ExternalPaymentDirection.DEPOSIT)
                .pendingAmount(0L)
                .result(ExternalPayment.TransactionResult.APPROVED)
                .settledAmount(0L)
                .userDefinedId("user_defined_id")
                .build()

        val accountActivityListResponse =
            AccountActivityListResponse.ofExternalPayment(externalPayment)

        assertThat(accountActivityListResponse.internal_()).isEmpty
        assertThat(accountActivityListResponse.transfer()).isEmpty
        assertThat(accountActivityListResponse.card()).isEmpty
        assertThat(accountActivityListResponse.payment()).isEmpty
        assertThat(accountActivityListResponse.externalPayment()).contains(externalPayment)
        assertThat(accountActivityListResponse.managementOperation()).isEmpty
    }

    @Test
    fun ofExternalPaymentRoundtrip() {
        val jsonMapper = jsonMapper()
        val accountActivityListResponse =
            AccountActivityListResponse.ofExternalPayment(
                ExternalPayment.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(ExternalPayment.TransactionStatus.PENDING)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .category(ExternalPayment.ExternalPaymentCategory.EXTERNAL_WIRE)
                    .currency("currency")
                    .addEvent(
                        ExternalPayment.ExternalPaymentEvent.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .amount(0L)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addDetailedResult(
                                ExternalPayment.ExternalPaymentEvent.DetailedResults.APPROVED
                            )
                            .effectiveDate(LocalDate.parse("2019-12-27"))
                            .memo("memo")
                            .result(ExternalPayment.ExternalPaymentEvent.TransactionResult.APPROVED)
                            .type(
                                ExternalPayment.ExternalPaymentEvent.ExternalPaymentEventType
                                    .EXTERNAL_WIRE_INITIATED
                            )
                            .build()
                    )
                    .family(ExternalPayment.Family.EXTERNAL_PAYMENT)
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .paymentType(ExternalPayment.ExternalPaymentDirection.DEPOSIT)
                    .pendingAmount(0L)
                    .result(ExternalPayment.TransactionResult.APPROVED)
                    .settledAmount(0L)
                    .userDefinedId("user_defined_id")
                    .build()
            )

        val roundtrippedAccountActivityListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountActivityListResponse),
                jacksonTypeRef<AccountActivityListResponse>(),
            )

        assertThat(roundtrippedAccountActivityListResponse).isEqualTo(accountActivityListResponse)
    }

    @Test
    fun ofManagementOperation() {
        val managementOperation =
            ManagementOperationTransaction.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(ManagementOperationTransaction.TransactionStatus.PENDING)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .category(ManagementOperationTransaction.ManagementOperationCategory.MANAGEMENT_FEE)
                .currency("currency")
                .direction(ManagementOperationTransaction.ManagementOperationDirection.CREDIT)
                .addEvent(
                    ManagementOperationTransaction.ManagementOperationEvent.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addDetailedResult(
                            ManagementOperationTransaction.ManagementOperationEvent.DetailedResults
                                .APPROVED
                        )
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .memo("memo")
                        .result(
                            ManagementOperationTransaction.ManagementOperationEvent
                                .TransactionResult
                                .APPROVED
                        )
                        .type(
                            ManagementOperationTransaction.ManagementOperationEvent
                                .ManagementOperationEventType
                                .LOSS_WRITE_OFF
                        )
                        .subtype("subtype")
                        .build()
                )
                .externalResource(
                    ExternalResource.builder()
                        .externalResourceToken("external_resource_token")
                        .externalResourceType(ExternalResourceType.STATEMENT)
                        .externalResourceSubToken("external_resource_sub_token")
                        .build()
                )
                .family(ManagementOperationTransaction.Family.MANAGEMENT_OPERATION)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pendingAmount(0L)
                .result(ManagementOperationTransaction.TransactionResult.APPROVED)
                .settledAmount(0L)
                .transactionSeries(
                    ManagementOperationTransaction.TransactionSeries.builder()
                        .relatedTransactionEventToken("123e4567-e89b-12d3-a456-426614174000")
                        .relatedTransactionToken("123e4567-e89b-12d3-a456-426614174000")
                        .type("FEE")
                        .build()
                )
                .userDefinedId("user_defined_id")
                .build()

        val accountActivityListResponse =
            AccountActivityListResponse.ofManagementOperation(managementOperation)

        assertThat(accountActivityListResponse.internal_()).isEmpty
        assertThat(accountActivityListResponse.transfer()).isEmpty
        assertThat(accountActivityListResponse.card()).isEmpty
        assertThat(accountActivityListResponse.payment()).isEmpty
        assertThat(accountActivityListResponse.externalPayment()).isEmpty
        assertThat(accountActivityListResponse.managementOperation()).contains(managementOperation)
    }

    @Test
    fun ofManagementOperationRoundtrip() {
        val jsonMapper = jsonMapper()
        val accountActivityListResponse =
            AccountActivityListResponse.ofManagementOperation(
                ManagementOperationTransaction.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(ManagementOperationTransaction.TransactionStatus.PENDING)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .category(
                        ManagementOperationTransaction.ManagementOperationCategory.MANAGEMENT_FEE
                    )
                    .currency("currency")
                    .direction(ManagementOperationTransaction.ManagementOperationDirection.CREDIT)
                    .addEvent(
                        ManagementOperationTransaction.ManagementOperationEvent.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .amount(0L)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addDetailedResult(
                                ManagementOperationTransaction.ManagementOperationEvent
                                    .DetailedResults
                                    .APPROVED
                            )
                            .effectiveDate(LocalDate.parse("2019-12-27"))
                            .memo("memo")
                            .result(
                                ManagementOperationTransaction.ManagementOperationEvent
                                    .TransactionResult
                                    .APPROVED
                            )
                            .type(
                                ManagementOperationTransaction.ManagementOperationEvent
                                    .ManagementOperationEventType
                                    .LOSS_WRITE_OFF
                            )
                            .subtype("subtype")
                            .build()
                    )
                    .externalResource(
                        ExternalResource.builder()
                            .externalResourceToken("external_resource_token")
                            .externalResourceType(ExternalResourceType.STATEMENT)
                            .externalResourceSubToken("external_resource_sub_token")
                            .build()
                    )
                    .family(ManagementOperationTransaction.Family.MANAGEMENT_OPERATION)
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pendingAmount(0L)
                    .result(ManagementOperationTransaction.TransactionResult.APPROVED)
                    .settledAmount(0L)
                    .transactionSeries(
                        ManagementOperationTransaction.TransactionSeries.builder()
                            .relatedTransactionEventToken("123e4567-e89b-12d3-a456-426614174000")
                            .relatedTransactionToken("123e4567-e89b-12d3-a456-426614174000")
                            .type("FEE")
                            .build()
                    )
                    .userDefinedId("user_defined_id")
                    .build()
            )

        val roundtrippedAccountActivityListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountActivityListResponse),
                jacksonTypeRef<AccountActivityListResponse>(),
            )

        assertThat(roundtrippedAccountActivityListResponse).isEqualTo(accountActivityListResponse)
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
        val accountActivityListResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<AccountActivityListResponse>())

        val e = assertThrows<LithicInvalidDataException> { accountActivityListResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
