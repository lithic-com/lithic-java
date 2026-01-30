// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.allMaxBy
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** KYB payload for an updated account holder. */
@JsonDeserialize(using = ParsedWebhookEvent.Deserializer::class)
@JsonSerialize(using = ParsedWebhookEvent.Serializer::class)
class ParsedWebhookEvent
private constructor(
    private val accountHolderCreated: AccountHolderCreatedWebhookEvent? = null,
    private val kybPayload: KybPayload? = null,
    private val kycPayload: KycPayload? = null,
    private val legacyPayload: LegacyPayload? = null,
    private val accountHolderVerification: AccountHolderVerificationWebhookEvent? = null,
    private val accountHolderDocumentUpdated: AccountHolderDocumentUpdatedWebhookEvent? = null,
    private val cardAuthorizationApprovalRequest: CardAuthorizationApprovalRequestWebhookEvent? =
        null,
    private val tokenizationDecisioningRequest: TokenizationDecisioningRequestWebhookEvent? = null,
    private val authRulesBacktestReportCreated: AuthRulesBacktestReportCreatedWebhookEvent? = null,
    private val balanceUpdated: BalanceUpdatedWebhookEvent? = null,
    private val bookTransferTransactionCreated: BookTransferTransactionCreatedWebhookEvent? = null,
    private val bookTransferTransactionUpdated: BookTransferTransactionUpdatedWebhookEvent? = null,
    private val cardCreated: CardCreatedWebhookEvent? = null,
    private val cardConverted: CardConvertedWebhookEvent? = null,
    private val cardRenewed: CardRenewedWebhookEvent? = null,
    private val cardReissued: CardReissuedWebhookEvent? = null,
    private val cardShipped: CardShippedWebhookEvent? = null,
    private val cardUpdated: CardUpdatedWebhookEvent? = null,
    private val cardTransactionUpdated: CardTransactionUpdatedWebhookEvent? = null,
    private val cardTransactionEnhancedDataCreated:
        CardTransactionEnhancedDataCreatedWebhookEvent? =
        null,
    private val cardTransactionEnhancedDataUpdated:
        CardTransactionEnhancedDataUpdatedWebhookEvent? =
        null,
    private val digitalWalletTokenizationApprovalRequest:
        DigitalWalletTokenizationApprovalRequestWebhookEvent? =
        null,
    private val digitalWalletTokenizationResult: DigitalWalletTokenizationResultWebhookEvent? =
        null,
    private val digitalWalletTokenizationTwoFactorAuthenticationCode:
        DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent? =
        null,
    private val digitalWalletTokenizationTwoFactorAuthenticationCodeSent:
        DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent? =
        null,
    private val digitalWalletTokenizationUpdated: DigitalWalletTokenizationUpdatedWebhookEvent? =
        null,
    private val disputeUpdated: DisputeUpdatedWebhookEvent? = null,
    private val disputeEvidenceUploadFailed: DisputeEvidenceUploadFailedWebhookEvent? = null,
    private val externalBankAccountCreated: ExternalBankAccountCreatedWebhookEvent? = null,
    private val externalBankAccountUpdated: ExternalBankAccountUpdatedWebhookEvent? = null,
    private val externalPaymentCreated: ExternalPaymentCreatedWebhookEvent? = null,
    private val externalPaymentUpdated: ExternalPaymentUpdatedWebhookEvent? = null,
    private val financialAccountCreated: FinancialAccountCreatedWebhookEvent? = null,
    private val financialAccountUpdated: FinancialAccountUpdatedWebhookEvent? = null,
    private val fundingEventCreated: FundingEventCreatedWebhookEvent? = null,
    private val loanTapeCreated: LoanTapeCreatedWebhookEvent? = null,
    private val loanTapeUpdated: LoanTapeUpdatedWebhookEvent? = null,
    private val managementOperationCreated: ManagementOperationCreatedWebhookEvent? = null,
    private val managementOperationUpdated: ManagementOperationUpdatedWebhookEvent? = null,
    private val internalTransactionCreated: InternalTransactionCreatedWebhookEvent? = null,
    private val internalTransactionUpdated: InternalTransactionUpdatedWebhookEvent? = null,
    private val networkTotalCreated: NetworkTotalCreatedWebhookEvent? = null,
    private val networkTotalUpdated: NetworkTotalUpdatedWebhookEvent? = null,
    private val paymentTransactionCreated: PaymentTransactionCreatedWebhookEvent? = null,
    private val paymentTransactionUpdated: PaymentTransactionUpdatedWebhookEvent? = null,
    private val settlementReportUpdated: SettlementReportUpdatedWebhookEvent? = null,
    private val statementsCreated: StatementsCreatedWebhookEvent? = null,
    private val threeDSAuthenticationCreated: ThreeDSAuthenticationCreatedWebhookEvent? = null,
    private val threeDSAuthenticationUpdated: ThreeDSAuthenticationUpdatedWebhookEvent? = null,
    private val threeDSAuthenticationChallenge: ThreeDSAuthenticationChallengeWebhookEvent? = null,
    private val tokenizationApprovalRequest: TokenizationApprovalRequestWebhookEvent? = null,
    private val tokenizationResult: TokenizationResultWebhookEvent? = null,
    private val tokenizationTwoFactorAuthenticationCode:
        TokenizationTwoFactorAuthenticationCodeWebhookEvent? =
        null,
    private val tokenizationTwoFactorAuthenticationCodeSent:
        TokenizationTwoFactorAuthenticationCodeSentWebhookEvent? =
        null,
    private val tokenizationUpdated: TokenizationUpdatedWebhookEvent? = null,
    private val threeDSAuthenticationApprovalRequest:
        ThreeDSAuthenticationApprovalRequestWebhookEvent? =
        null,
    private val disputeTransactionCreated: DisputeTransactionCreatedWebhookEvent? = null,
    private val disputeTransactionUpdated: DisputeTransactionUpdatedWebhookEvent? = null,
    private val _json: JsonValue? = null,
) {

    fun accountHolderCreated(): Optional<AccountHolderCreatedWebhookEvent> =
        Optional.ofNullable(accountHolderCreated)

    /** KYB payload for an updated account holder. */
    fun kybPayload(): Optional<KybPayload> = Optional.ofNullable(kybPayload)

    /** KYC payload for an updated account holder. */
    fun kycPayload(): Optional<KycPayload> = Optional.ofNullable(kycPayload)

    /** Legacy payload for an updated account holder. */
    fun legacyPayload(): Optional<LegacyPayload> = Optional.ofNullable(legacyPayload)

    fun accountHolderVerification(): Optional<AccountHolderVerificationWebhookEvent> =
        Optional.ofNullable(accountHolderVerification)

    fun accountHolderDocumentUpdated(): Optional<AccountHolderDocumentUpdatedWebhookEvent> =
        Optional.ofNullable(accountHolderDocumentUpdated)

    fun cardAuthorizationApprovalRequest(): Optional<CardAuthorizationApprovalRequestWebhookEvent> =
        Optional.ofNullable(cardAuthorizationApprovalRequest)

    /** A webhook for tokenization decisioning sent to the customer's responder endpoint */
    fun tokenizationDecisioningRequest(): Optional<TokenizationDecisioningRequestWebhookEvent> =
        Optional.ofNullable(tokenizationDecisioningRequest)

    fun authRulesBacktestReportCreated(): Optional<AuthRulesBacktestReportCreatedWebhookEvent> =
        Optional.ofNullable(authRulesBacktestReportCreated)

    fun balanceUpdated(): Optional<BalanceUpdatedWebhookEvent> = Optional.ofNullable(balanceUpdated)

    /** Book transfer transaction */
    fun bookTransferTransactionCreated(): Optional<BookTransferTransactionCreatedWebhookEvent> =
        Optional.ofNullable(bookTransferTransactionCreated)

    /** Book transfer transaction */
    fun bookTransferTransactionUpdated(): Optional<BookTransferTransactionUpdatedWebhookEvent> =
        Optional.ofNullable(bookTransferTransactionUpdated)

    fun cardCreated(): Optional<CardCreatedWebhookEvent> = Optional.ofNullable(cardCreated)

    fun cardConverted(): Optional<CardConvertedWebhookEvent> = Optional.ofNullable(cardConverted)

    fun cardRenewed(): Optional<CardRenewedWebhookEvent> = Optional.ofNullable(cardRenewed)

    fun cardReissued(): Optional<CardReissuedWebhookEvent> = Optional.ofNullable(cardReissued)

    fun cardShipped(): Optional<CardShippedWebhookEvent> = Optional.ofNullable(cardShipped)

    fun cardUpdated(): Optional<CardUpdatedWebhookEvent> = Optional.ofNullable(cardUpdated)

    fun cardTransactionUpdated(): Optional<CardTransactionUpdatedWebhookEvent> =
        Optional.ofNullable(cardTransactionUpdated)

    fun cardTransactionEnhancedDataCreated():
        Optional<CardTransactionEnhancedDataCreatedWebhookEvent> =
        Optional.ofNullable(cardTransactionEnhancedDataCreated)

    fun cardTransactionEnhancedDataUpdated():
        Optional<CardTransactionEnhancedDataUpdatedWebhookEvent> =
        Optional.ofNullable(cardTransactionEnhancedDataUpdated)

    fun digitalWalletTokenizationApprovalRequest():
        Optional<DigitalWalletTokenizationApprovalRequestWebhookEvent> =
        Optional.ofNullable(digitalWalletTokenizationApprovalRequest)

    fun digitalWalletTokenizationResult(): Optional<DigitalWalletTokenizationResultWebhookEvent> =
        Optional.ofNullable(digitalWalletTokenizationResult)

    fun digitalWalletTokenizationTwoFactorAuthenticationCode():
        Optional<DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent> =
        Optional.ofNullable(digitalWalletTokenizationTwoFactorAuthenticationCode)

    fun digitalWalletTokenizationTwoFactorAuthenticationCodeSent():
        Optional<DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent> =
        Optional.ofNullable(digitalWalletTokenizationTwoFactorAuthenticationCodeSent)

    fun digitalWalletTokenizationUpdated(): Optional<DigitalWalletTokenizationUpdatedWebhookEvent> =
        Optional.ofNullable(digitalWalletTokenizationUpdated)

    /** Dispute. */
    fun disputeUpdated(): Optional<DisputeUpdatedWebhookEvent> = Optional.ofNullable(disputeUpdated)

    /** Dispute evidence. */
    fun disputeEvidenceUploadFailed(): Optional<DisputeEvidenceUploadFailedWebhookEvent> =
        Optional.ofNullable(disputeEvidenceUploadFailed)

    fun externalBankAccountCreated(): Optional<ExternalBankAccountCreatedWebhookEvent> =
        Optional.ofNullable(externalBankAccountCreated)

    fun externalBankAccountUpdated(): Optional<ExternalBankAccountUpdatedWebhookEvent> =
        Optional.ofNullable(externalBankAccountUpdated)

    fun externalPaymentCreated(): Optional<ExternalPaymentCreatedWebhookEvent> =
        Optional.ofNullable(externalPaymentCreated)

    fun externalPaymentUpdated(): Optional<ExternalPaymentUpdatedWebhookEvent> =
        Optional.ofNullable(externalPaymentUpdated)

    fun financialAccountCreated(): Optional<FinancialAccountCreatedWebhookEvent> =
        Optional.ofNullable(financialAccountCreated)

    fun financialAccountUpdated(): Optional<FinancialAccountUpdatedWebhookEvent> =
        Optional.ofNullable(financialAccountUpdated)

    fun fundingEventCreated(): Optional<FundingEventCreatedWebhookEvent> =
        Optional.ofNullable(fundingEventCreated)

    fun loanTapeCreated(): Optional<LoanTapeCreatedWebhookEvent> =
        Optional.ofNullable(loanTapeCreated)

    fun loanTapeUpdated(): Optional<LoanTapeUpdatedWebhookEvent> =
        Optional.ofNullable(loanTapeUpdated)

    fun managementOperationCreated(): Optional<ManagementOperationCreatedWebhookEvent> =
        Optional.ofNullable(managementOperationCreated)

    fun managementOperationUpdated(): Optional<ManagementOperationUpdatedWebhookEvent> =
        Optional.ofNullable(managementOperationUpdated)

    fun internalTransactionCreated(): Optional<InternalTransactionCreatedWebhookEvent> =
        Optional.ofNullable(internalTransactionCreated)

    fun internalTransactionUpdated(): Optional<InternalTransactionUpdatedWebhookEvent> =
        Optional.ofNullable(internalTransactionUpdated)

    fun networkTotalCreated(): Optional<NetworkTotalCreatedWebhookEvent> =
        Optional.ofNullable(networkTotalCreated)

    fun networkTotalUpdated(): Optional<NetworkTotalUpdatedWebhookEvent> =
        Optional.ofNullable(networkTotalUpdated)

    /** Payment transaction */
    fun paymentTransactionCreated(): Optional<PaymentTransactionCreatedWebhookEvent> =
        Optional.ofNullable(paymentTransactionCreated)

    /** Payment transaction */
    fun paymentTransactionUpdated(): Optional<PaymentTransactionUpdatedWebhookEvent> =
        Optional.ofNullable(paymentTransactionUpdated)

    fun settlementReportUpdated(): Optional<SettlementReportUpdatedWebhookEvent> =
        Optional.ofNullable(settlementReportUpdated)

    fun statementsCreated(): Optional<StatementsCreatedWebhookEvent> =
        Optional.ofNullable(statementsCreated)

    /** Represents a 3DS authentication */
    fun threeDSAuthenticationCreated(): Optional<ThreeDSAuthenticationCreatedWebhookEvent> =
        Optional.ofNullable(threeDSAuthenticationCreated)

    /** Represents a 3DS authentication */
    fun threeDSAuthenticationUpdated(): Optional<ThreeDSAuthenticationUpdatedWebhookEvent> =
        Optional.ofNullable(threeDSAuthenticationUpdated)

    fun threeDSAuthenticationChallenge(): Optional<ThreeDSAuthenticationChallengeWebhookEvent> =
        Optional.ofNullable(threeDSAuthenticationChallenge)

    fun tokenizationApprovalRequest(): Optional<TokenizationApprovalRequestWebhookEvent> =
        Optional.ofNullable(tokenizationApprovalRequest)

    fun tokenizationResult(): Optional<TokenizationResultWebhookEvent> =
        Optional.ofNullable(tokenizationResult)

    fun tokenizationTwoFactorAuthenticationCode():
        Optional<TokenizationTwoFactorAuthenticationCodeWebhookEvent> =
        Optional.ofNullable(tokenizationTwoFactorAuthenticationCode)

    fun tokenizationTwoFactorAuthenticationCodeSent():
        Optional<TokenizationTwoFactorAuthenticationCodeSentWebhookEvent> =
        Optional.ofNullable(tokenizationTwoFactorAuthenticationCodeSent)

    fun tokenizationUpdated(): Optional<TokenizationUpdatedWebhookEvent> =
        Optional.ofNullable(tokenizationUpdated)

    /** Represents a 3DS authentication */
    fun threeDSAuthenticationApprovalRequest():
        Optional<ThreeDSAuthenticationApprovalRequestWebhookEvent> =
        Optional.ofNullable(threeDSAuthenticationApprovalRequest)

    /** The Dispute object tracks the progression of a dispute throughout its lifecycle. */
    fun disputeTransactionCreated(): Optional<DisputeTransactionCreatedWebhookEvent> =
        Optional.ofNullable(disputeTransactionCreated)

    /** The Dispute object tracks the progression of a dispute throughout its lifecycle. */
    fun disputeTransactionUpdated(): Optional<DisputeTransactionUpdatedWebhookEvent> =
        Optional.ofNullable(disputeTransactionUpdated)

    fun isAccountHolderCreated(): Boolean = accountHolderCreated != null

    fun isKybPayload(): Boolean = kybPayload != null

    fun isKycPayload(): Boolean = kycPayload != null

    fun isLegacyPayload(): Boolean = legacyPayload != null

    fun isAccountHolderVerification(): Boolean = accountHolderVerification != null

    fun isAccountHolderDocumentUpdated(): Boolean = accountHolderDocumentUpdated != null

    fun isCardAuthorizationApprovalRequest(): Boolean = cardAuthorizationApprovalRequest != null

    fun isTokenizationDecisioningRequest(): Boolean = tokenizationDecisioningRequest != null

    fun isAuthRulesBacktestReportCreated(): Boolean = authRulesBacktestReportCreated != null

    fun isBalanceUpdated(): Boolean = balanceUpdated != null

    fun isBookTransferTransactionCreated(): Boolean = bookTransferTransactionCreated != null

    fun isBookTransferTransactionUpdated(): Boolean = bookTransferTransactionUpdated != null

    fun isCardCreated(): Boolean = cardCreated != null

    fun isCardConverted(): Boolean = cardConverted != null

    fun isCardRenewed(): Boolean = cardRenewed != null

    fun isCardReissued(): Boolean = cardReissued != null

    fun isCardShipped(): Boolean = cardShipped != null

    fun isCardUpdated(): Boolean = cardUpdated != null

    fun isCardTransactionUpdated(): Boolean = cardTransactionUpdated != null

    fun isCardTransactionEnhancedDataCreated(): Boolean = cardTransactionEnhancedDataCreated != null

    fun isCardTransactionEnhancedDataUpdated(): Boolean = cardTransactionEnhancedDataUpdated != null

    fun isDigitalWalletTokenizationApprovalRequest(): Boolean =
        digitalWalletTokenizationApprovalRequest != null

    fun isDigitalWalletTokenizationResult(): Boolean = digitalWalletTokenizationResult != null

    fun isDigitalWalletTokenizationTwoFactorAuthenticationCode(): Boolean =
        digitalWalletTokenizationTwoFactorAuthenticationCode != null

    fun isDigitalWalletTokenizationTwoFactorAuthenticationCodeSent(): Boolean =
        digitalWalletTokenizationTwoFactorAuthenticationCodeSent != null

    fun isDigitalWalletTokenizationUpdated(): Boolean = digitalWalletTokenizationUpdated != null

    fun isDisputeUpdated(): Boolean = disputeUpdated != null

    fun isDisputeEvidenceUploadFailed(): Boolean = disputeEvidenceUploadFailed != null

    fun isExternalBankAccountCreated(): Boolean = externalBankAccountCreated != null

    fun isExternalBankAccountUpdated(): Boolean = externalBankAccountUpdated != null

    fun isExternalPaymentCreated(): Boolean = externalPaymentCreated != null

    fun isExternalPaymentUpdated(): Boolean = externalPaymentUpdated != null

    fun isFinancialAccountCreated(): Boolean = financialAccountCreated != null

    fun isFinancialAccountUpdated(): Boolean = financialAccountUpdated != null

    fun isFundingEventCreated(): Boolean = fundingEventCreated != null

    fun isLoanTapeCreated(): Boolean = loanTapeCreated != null

    fun isLoanTapeUpdated(): Boolean = loanTapeUpdated != null

    fun isManagementOperationCreated(): Boolean = managementOperationCreated != null

    fun isManagementOperationUpdated(): Boolean = managementOperationUpdated != null

    fun isInternalTransactionCreated(): Boolean = internalTransactionCreated != null

    fun isInternalTransactionUpdated(): Boolean = internalTransactionUpdated != null

    fun isNetworkTotalCreated(): Boolean = networkTotalCreated != null

    fun isNetworkTotalUpdated(): Boolean = networkTotalUpdated != null

    fun isPaymentTransactionCreated(): Boolean = paymentTransactionCreated != null

    fun isPaymentTransactionUpdated(): Boolean = paymentTransactionUpdated != null

    fun isSettlementReportUpdated(): Boolean = settlementReportUpdated != null

    fun isStatementsCreated(): Boolean = statementsCreated != null

    fun isThreeDSAuthenticationCreated(): Boolean = threeDSAuthenticationCreated != null

    fun isThreeDSAuthenticationUpdated(): Boolean = threeDSAuthenticationUpdated != null

    fun isThreeDSAuthenticationChallenge(): Boolean = threeDSAuthenticationChallenge != null

    fun isTokenizationApprovalRequest(): Boolean = tokenizationApprovalRequest != null

    fun isTokenizationResult(): Boolean = tokenizationResult != null

    fun isTokenizationTwoFactorAuthenticationCode(): Boolean =
        tokenizationTwoFactorAuthenticationCode != null

    fun isTokenizationTwoFactorAuthenticationCodeSent(): Boolean =
        tokenizationTwoFactorAuthenticationCodeSent != null

    fun isTokenizationUpdated(): Boolean = tokenizationUpdated != null

    fun isThreeDSAuthenticationApprovalRequest(): Boolean =
        threeDSAuthenticationApprovalRequest != null

    fun isDisputeTransactionCreated(): Boolean = disputeTransactionCreated != null

    fun isDisputeTransactionUpdated(): Boolean = disputeTransactionUpdated != null

    fun asAccountHolderCreated(): AccountHolderCreatedWebhookEvent =
        accountHolderCreated.getOrThrow("accountHolderCreated")

    /** KYB payload for an updated account holder. */
    fun asKybPayload(): KybPayload = kybPayload.getOrThrow("kybPayload")

    /** KYC payload for an updated account holder. */
    fun asKycPayload(): KycPayload = kycPayload.getOrThrow("kycPayload")

    /** Legacy payload for an updated account holder. */
    fun asLegacyPayload(): LegacyPayload = legacyPayload.getOrThrow("legacyPayload")

    fun asAccountHolderVerification(): AccountHolderVerificationWebhookEvent =
        accountHolderVerification.getOrThrow("accountHolderVerification")

    fun asAccountHolderDocumentUpdated(): AccountHolderDocumentUpdatedWebhookEvent =
        accountHolderDocumentUpdated.getOrThrow("accountHolderDocumentUpdated")

    fun asCardAuthorizationApprovalRequest(): CardAuthorizationApprovalRequestWebhookEvent =
        cardAuthorizationApprovalRequest.getOrThrow("cardAuthorizationApprovalRequest")

    /** A webhook for tokenization decisioning sent to the customer's responder endpoint */
    fun asTokenizationDecisioningRequest(): TokenizationDecisioningRequestWebhookEvent =
        tokenizationDecisioningRequest.getOrThrow("tokenizationDecisioningRequest")

    fun asAuthRulesBacktestReportCreated(): AuthRulesBacktestReportCreatedWebhookEvent =
        authRulesBacktestReportCreated.getOrThrow("authRulesBacktestReportCreated")

    fun asBalanceUpdated(): BalanceUpdatedWebhookEvent = balanceUpdated.getOrThrow("balanceUpdated")

    /** Book transfer transaction */
    fun asBookTransferTransactionCreated(): BookTransferTransactionCreatedWebhookEvent =
        bookTransferTransactionCreated.getOrThrow("bookTransferTransactionCreated")

    /** Book transfer transaction */
    fun asBookTransferTransactionUpdated(): BookTransferTransactionUpdatedWebhookEvent =
        bookTransferTransactionUpdated.getOrThrow("bookTransferTransactionUpdated")

    fun asCardCreated(): CardCreatedWebhookEvent = cardCreated.getOrThrow("cardCreated")

    fun asCardConverted(): CardConvertedWebhookEvent = cardConverted.getOrThrow("cardConverted")

    fun asCardRenewed(): CardRenewedWebhookEvent = cardRenewed.getOrThrow("cardRenewed")

    fun asCardReissued(): CardReissuedWebhookEvent = cardReissued.getOrThrow("cardReissued")

    fun asCardShipped(): CardShippedWebhookEvent = cardShipped.getOrThrow("cardShipped")

    fun asCardUpdated(): CardUpdatedWebhookEvent = cardUpdated.getOrThrow("cardUpdated")

    fun asCardTransactionUpdated(): CardTransactionUpdatedWebhookEvent =
        cardTransactionUpdated.getOrThrow("cardTransactionUpdated")

    fun asCardTransactionEnhancedDataCreated(): CardTransactionEnhancedDataCreatedWebhookEvent =
        cardTransactionEnhancedDataCreated.getOrThrow("cardTransactionEnhancedDataCreated")

    fun asCardTransactionEnhancedDataUpdated(): CardTransactionEnhancedDataUpdatedWebhookEvent =
        cardTransactionEnhancedDataUpdated.getOrThrow("cardTransactionEnhancedDataUpdated")

    fun asDigitalWalletTokenizationApprovalRequest():
        DigitalWalletTokenizationApprovalRequestWebhookEvent =
        digitalWalletTokenizationApprovalRequest.getOrThrow(
            "digitalWalletTokenizationApprovalRequest"
        )

    fun asDigitalWalletTokenizationResult(): DigitalWalletTokenizationResultWebhookEvent =
        digitalWalletTokenizationResult.getOrThrow("digitalWalletTokenizationResult")

    fun asDigitalWalletTokenizationTwoFactorAuthenticationCode():
        DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent =
        digitalWalletTokenizationTwoFactorAuthenticationCode.getOrThrow(
            "digitalWalletTokenizationTwoFactorAuthenticationCode"
        )

    fun asDigitalWalletTokenizationTwoFactorAuthenticationCodeSent():
        DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent =
        digitalWalletTokenizationTwoFactorAuthenticationCodeSent.getOrThrow(
            "digitalWalletTokenizationTwoFactorAuthenticationCodeSent"
        )

    fun asDigitalWalletTokenizationUpdated(): DigitalWalletTokenizationUpdatedWebhookEvent =
        digitalWalletTokenizationUpdated.getOrThrow("digitalWalletTokenizationUpdated")

    /** Dispute. */
    fun asDisputeUpdated(): DisputeUpdatedWebhookEvent = disputeUpdated.getOrThrow("disputeUpdated")

    /** Dispute evidence. */
    fun asDisputeEvidenceUploadFailed(): DisputeEvidenceUploadFailedWebhookEvent =
        disputeEvidenceUploadFailed.getOrThrow("disputeEvidenceUploadFailed")

    fun asExternalBankAccountCreated(): ExternalBankAccountCreatedWebhookEvent =
        externalBankAccountCreated.getOrThrow("externalBankAccountCreated")

    fun asExternalBankAccountUpdated(): ExternalBankAccountUpdatedWebhookEvent =
        externalBankAccountUpdated.getOrThrow("externalBankAccountUpdated")

    fun asExternalPaymentCreated(): ExternalPaymentCreatedWebhookEvent =
        externalPaymentCreated.getOrThrow("externalPaymentCreated")

    fun asExternalPaymentUpdated(): ExternalPaymentUpdatedWebhookEvent =
        externalPaymentUpdated.getOrThrow("externalPaymentUpdated")

    fun asFinancialAccountCreated(): FinancialAccountCreatedWebhookEvent =
        financialAccountCreated.getOrThrow("financialAccountCreated")

    fun asFinancialAccountUpdated(): FinancialAccountUpdatedWebhookEvent =
        financialAccountUpdated.getOrThrow("financialAccountUpdated")

    fun asFundingEventCreated(): FundingEventCreatedWebhookEvent =
        fundingEventCreated.getOrThrow("fundingEventCreated")

    fun asLoanTapeCreated(): LoanTapeCreatedWebhookEvent =
        loanTapeCreated.getOrThrow("loanTapeCreated")

    fun asLoanTapeUpdated(): LoanTapeUpdatedWebhookEvent =
        loanTapeUpdated.getOrThrow("loanTapeUpdated")

    fun asManagementOperationCreated(): ManagementOperationCreatedWebhookEvent =
        managementOperationCreated.getOrThrow("managementOperationCreated")

    fun asManagementOperationUpdated(): ManagementOperationUpdatedWebhookEvent =
        managementOperationUpdated.getOrThrow("managementOperationUpdated")

    fun asInternalTransactionCreated(): InternalTransactionCreatedWebhookEvent =
        internalTransactionCreated.getOrThrow("internalTransactionCreated")

    fun asInternalTransactionUpdated(): InternalTransactionUpdatedWebhookEvent =
        internalTransactionUpdated.getOrThrow("internalTransactionUpdated")

    fun asNetworkTotalCreated(): NetworkTotalCreatedWebhookEvent =
        networkTotalCreated.getOrThrow("networkTotalCreated")

    fun asNetworkTotalUpdated(): NetworkTotalUpdatedWebhookEvent =
        networkTotalUpdated.getOrThrow("networkTotalUpdated")

    /** Payment transaction */
    fun asPaymentTransactionCreated(): PaymentTransactionCreatedWebhookEvent =
        paymentTransactionCreated.getOrThrow("paymentTransactionCreated")

    /** Payment transaction */
    fun asPaymentTransactionUpdated(): PaymentTransactionUpdatedWebhookEvent =
        paymentTransactionUpdated.getOrThrow("paymentTransactionUpdated")

    fun asSettlementReportUpdated(): SettlementReportUpdatedWebhookEvent =
        settlementReportUpdated.getOrThrow("settlementReportUpdated")

    fun asStatementsCreated(): StatementsCreatedWebhookEvent =
        statementsCreated.getOrThrow("statementsCreated")

    /** Represents a 3DS authentication */
    fun asThreeDSAuthenticationCreated(): ThreeDSAuthenticationCreatedWebhookEvent =
        threeDSAuthenticationCreated.getOrThrow("threeDSAuthenticationCreated")

    /** Represents a 3DS authentication */
    fun asThreeDSAuthenticationUpdated(): ThreeDSAuthenticationUpdatedWebhookEvent =
        threeDSAuthenticationUpdated.getOrThrow("threeDSAuthenticationUpdated")

    fun asThreeDSAuthenticationChallenge(): ThreeDSAuthenticationChallengeWebhookEvent =
        threeDSAuthenticationChallenge.getOrThrow("threeDSAuthenticationChallenge")

    fun asTokenizationApprovalRequest(): TokenizationApprovalRequestWebhookEvent =
        tokenizationApprovalRequest.getOrThrow("tokenizationApprovalRequest")

    fun asTokenizationResult(): TokenizationResultWebhookEvent =
        tokenizationResult.getOrThrow("tokenizationResult")

    fun asTokenizationTwoFactorAuthenticationCode():
        TokenizationTwoFactorAuthenticationCodeWebhookEvent =
        tokenizationTwoFactorAuthenticationCode.getOrThrow(
            "tokenizationTwoFactorAuthenticationCode"
        )

    fun asTokenizationTwoFactorAuthenticationCodeSent():
        TokenizationTwoFactorAuthenticationCodeSentWebhookEvent =
        tokenizationTwoFactorAuthenticationCodeSent.getOrThrow(
            "tokenizationTwoFactorAuthenticationCodeSent"
        )

    fun asTokenizationUpdated(): TokenizationUpdatedWebhookEvent =
        tokenizationUpdated.getOrThrow("tokenizationUpdated")

    /** Represents a 3DS authentication */
    fun asThreeDSAuthenticationApprovalRequest(): ThreeDSAuthenticationApprovalRequestWebhookEvent =
        threeDSAuthenticationApprovalRequest.getOrThrow("threeDSAuthenticationApprovalRequest")

    /** The Dispute object tracks the progression of a dispute throughout its lifecycle. */
    fun asDisputeTransactionCreated(): DisputeTransactionCreatedWebhookEvent =
        disputeTransactionCreated.getOrThrow("disputeTransactionCreated")

    /** The Dispute object tracks the progression of a dispute throughout its lifecycle. */
    fun asDisputeTransactionUpdated(): DisputeTransactionUpdatedWebhookEvent =
        disputeTransactionUpdated.getOrThrow("disputeTransactionUpdated")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            accountHolderCreated != null -> visitor.visitAccountHolderCreated(accountHolderCreated)
            kybPayload != null -> visitor.visitKybPayload(kybPayload)
            kycPayload != null -> visitor.visitKycPayload(kycPayload)
            legacyPayload != null -> visitor.visitLegacyPayload(legacyPayload)
            accountHolderVerification != null ->
                visitor.visitAccountHolderVerification(accountHolderVerification)
            accountHolderDocumentUpdated != null ->
                visitor.visitAccountHolderDocumentUpdated(accountHolderDocumentUpdated)
            cardAuthorizationApprovalRequest != null ->
                visitor.visitCardAuthorizationApprovalRequest(cardAuthorizationApprovalRequest)
            tokenizationDecisioningRequest != null ->
                visitor.visitTokenizationDecisioningRequest(tokenizationDecisioningRequest)
            authRulesBacktestReportCreated != null ->
                visitor.visitAuthRulesBacktestReportCreated(authRulesBacktestReportCreated)
            balanceUpdated != null -> visitor.visitBalanceUpdated(balanceUpdated)
            bookTransferTransactionCreated != null ->
                visitor.visitBookTransferTransactionCreated(bookTransferTransactionCreated)
            bookTransferTransactionUpdated != null ->
                visitor.visitBookTransferTransactionUpdated(bookTransferTransactionUpdated)
            cardCreated != null -> visitor.visitCardCreated(cardCreated)
            cardConverted != null -> visitor.visitCardConverted(cardConverted)
            cardRenewed != null -> visitor.visitCardRenewed(cardRenewed)
            cardReissued != null -> visitor.visitCardReissued(cardReissued)
            cardShipped != null -> visitor.visitCardShipped(cardShipped)
            cardUpdated != null -> visitor.visitCardUpdated(cardUpdated)
            cardTransactionUpdated != null ->
                visitor.visitCardTransactionUpdated(cardTransactionUpdated)
            cardTransactionEnhancedDataCreated != null ->
                visitor.visitCardTransactionEnhancedDataCreated(cardTransactionEnhancedDataCreated)
            cardTransactionEnhancedDataUpdated != null ->
                visitor.visitCardTransactionEnhancedDataUpdated(cardTransactionEnhancedDataUpdated)
            digitalWalletTokenizationApprovalRequest != null ->
                visitor.visitDigitalWalletTokenizationApprovalRequest(
                    digitalWalletTokenizationApprovalRequest
                )
            digitalWalletTokenizationResult != null ->
                visitor.visitDigitalWalletTokenizationResult(digitalWalletTokenizationResult)
            digitalWalletTokenizationTwoFactorAuthenticationCode != null ->
                visitor.visitDigitalWalletTokenizationTwoFactorAuthenticationCode(
                    digitalWalletTokenizationTwoFactorAuthenticationCode
                )
            digitalWalletTokenizationTwoFactorAuthenticationCodeSent != null ->
                visitor.visitDigitalWalletTokenizationTwoFactorAuthenticationCodeSent(
                    digitalWalletTokenizationTwoFactorAuthenticationCodeSent
                )
            digitalWalletTokenizationUpdated != null ->
                visitor.visitDigitalWalletTokenizationUpdated(digitalWalletTokenizationUpdated)
            disputeUpdated != null -> visitor.visitDisputeUpdated(disputeUpdated)
            disputeEvidenceUploadFailed != null ->
                visitor.visitDisputeEvidenceUploadFailed(disputeEvidenceUploadFailed)
            externalBankAccountCreated != null ->
                visitor.visitExternalBankAccountCreated(externalBankAccountCreated)
            externalBankAccountUpdated != null ->
                visitor.visitExternalBankAccountUpdated(externalBankAccountUpdated)
            externalPaymentCreated != null ->
                visitor.visitExternalPaymentCreated(externalPaymentCreated)
            externalPaymentUpdated != null ->
                visitor.visitExternalPaymentUpdated(externalPaymentUpdated)
            financialAccountCreated != null ->
                visitor.visitFinancialAccountCreated(financialAccountCreated)
            financialAccountUpdated != null ->
                visitor.visitFinancialAccountUpdated(financialAccountUpdated)
            fundingEventCreated != null -> visitor.visitFundingEventCreated(fundingEventCreated)
            loanTapeCreated != null -> visitor.visitLoanTapeCreated(loanTapeCreated)
            loanTapeUpdated != null -> visitor.visitLoanTapeUpdated(loanTapeUpdated)
            managementOperationCreated != null ->
                visitor.visitManagementOperationCreated(managementOperationCreated)
            managementOperationUpdated != null ->
                visitor.visitManagementOperationUpdated(managementOperationUpdated)
            internalTransactionCreated != null ->
                visitor.visitInternalTransactionCreated(internalTransactionCreated)
            internalTransactionUpdated != null ->
                visitor.visitInternalTransactionUpdated(internalTransactionUpdated)
            networkTotalCreated != null -> visitor.visitNetworkTotalCreated(networkTotalCreated)
            networkTotalUpdated != null -> visitor.visitNetworkTotalUpdated(networkTotalUpdated)
            paymentTransactionCreated != null ->
                visitor.visitPaymentTransactionCreated(paymentTransactionCreated)
            paymentTransactionUpdated != null ->
                visitor.visitPaymentTransactionUpdated(paymentTransactionUpdated)
            settlementReportUpdated != null ->
                visitor.visitSettlementReportUpdated(settlementReportUpdated)
            statementsCreated != null -> visitor.visitStatementsCreated(statementsCreated)
            threeDSAuthenticationCreated != null ->
                visitor.visitThreeDSAuthenticationCreated(threeDSAuthenticationCreated)
            threeDSAuthenticationUpdated != null ->
                visitor.visitThreeDSAuthenticationUpdated(threeDSAuthenticationUpdated)
            threeDSAuthenticationChallenge != null ->
                visitor.visitThreeDSAuthenticationChallenge(threeDSAuthenticationChallenge)
            tokenizationApprovalRequest != null ->
                visitor.visitTokenizationApprovalRequest(tokenizationApprovalRequest)
            tokenizationResult != null -> visitor.visitTokenizationResult(tokenizationResult)
            tokenizationTwoFactorAuthenticationCode != null ->
                visitor.visitTokenizationTwoFactorAuthenticationCode(
                    tokenizationTwoFactorAuthenticationCode
                )
            tokenizationTwoFactorAuthenticationCodeSent != null ->
                visitor.visitTokenizationTwoFactorAuthenticationCodeSent(
                    tokenizationTwoFactorAuthenticationCodeSent
                )
            tokenizationUpdated != null -> visitor.visitTokenizationUpdated(tokenizationUpdated)
            threeDSAuthenticationApprovalRequest != null ->
                visitor.visitThreeDSAuthenticationApprovalRequest(
                    threeDSAuthenticationApprovalRequest
                )
            disputeTransactionCreated != null ->
                visitor.visitDisputeTransactionCreated(disputeTransactionCreated)
            disputeTransactionUpdated != null ->
                visitor.visitDisputeTransactionUpdated(disputeTransactionUpdated)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ParsedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAccountHolderCreated(
                    accountHolderCreated: AccountHolderCreatedWebhookEvent
                ) {
                    accountHolderCreated.validate()
                }

                override fun visitKybPayload(kybPayload: KybPayload) {
                    kybPayload.validate()
                }

                override fun visitKycPayload(kycPayload: KycPayload) {
                    kycPayload.validate()
                }

                override fun visitLegacyPayload(legacyPayload: LegacyPayload) {
                    legacyPayload.validate()
                }

                override fun visitAccountHolderVerification(
                    accountHolderVerification: AccountHolderVerificationWebhookEvent
                ) {
                    accountHolderVerification.validate()
                }

                override fun visitAccountHolderDocumentUpdated(
                    accountHolderDocumentUpdated: AccountHolderDocumentUpdatedWebhookEvent
                ) {
                    accountHolderDocumentUpdated.validate()
                }

                override fun visitCardAuthorizationApprovalRequest(
                    cardAuthorizationApprovalRequest: CardAuthorizationApprovalRequestWebhookEvent
                ) {
                    cardAuthorizationApprovalRequest.validate()
                }

                override fun visitTokenizationDecisioningRequest(
                    tokenizationDecisioningRequest: TokenizationDecisioningRequestWebhookEvent
                ) {
                    tokenizationDecisioningRequest.validate()
                }

                override fun visitAuthRulesBacktestReportCreated(
                    authRulesBacktestReportCreated: AuthRulesBacktestReportCreatedWebhookEvent
                ) {
                    authRulesBacktestReportCreated.validate()
                }

                override fun visitBalanceUpdated(balanceUpdated: BalanceUpdatedWebhookEvent) {
                    balanceUpdated.validate()
                }

                override fun visitBookTransferTransactionCreated(
                    bookTransferTransactionCreated: BookTransferTransactionCreatedWebhookEvent
                ) {
                    bookTransferTransactionCreated.validate()
                }

                override fun visitBookTransferTransactionUpdated(
                    bookTransferTransactionUpdated: BookTransferTransactionUpdatedWebhookEvent
                ) {
                    bookTransferTransactionUpdated.validate()
                }

                override fun visitCardCreated(cardCreated: CardCreatedWebhookEvent) {
                    cardCreated.validate()
                }

                override fun visitCardConverted(cardConverted: CardConvertedWebhookEvent) {
                    cardConverted.validate()
                }

                override fun visitCardRenewed(cardRenewed: CardRenewedWebhookEvent) {
                    cardRenewed.validate()
                }

                override fun visitCardReissued(cardReissued: CardReissuedWebhookEvent) {
                    cardReissued.validate()
                }

                override fun visitCardShipped(cardShipped: CardShippedWebhookEvent) {
                    cardShipped.validate()
                }

                override fun visitCardUpdated(cardUpdated: CardUpdatedWebhookEvent) {
                    cardUpdated.validate()
                }

                override fun visitCardTransactionUpdated(
                    cardTransactionUpdated: CardTransactionUpdatedWebhookEvent
                ) {
                    cardTransactionUpdated.validate()
                }

                override fun visitCardTransactionEnhancedDataCreated(
                    cardTransactionEnhancedDataCreated:
                        CardTransactionEnhancedDataCreatedWebhookEvent
                ) {
                    cardTransactionEnhancedDataCreated.validate()
                }

                override fun visitCardTransactionEnhancedDataUpdated(
                    cardTransactionEnhancedDataUpdated:
                        CardTransactionEnhancedDataUpdatedWebhookEvent
                ) {
                    cardTransactionEnhancedDataUpdated.validate()
                }

                override fun visitDigitalWalletTokenizationApprovalRequest(
                    digitalWalletTokenizationApprovalRequest:
                        DigitalWalletTokenizationApprovalRequestWebhookEvent
                ) {
                    digitalWalletTokenizationApprovalRequest.validate()
                }

                override fun visitDigitalWalletTokenizationResult(
                    digitalWalletTokenizationResult: DigitalWalletTokenizationResultWebhookEvent
                ) {
                    digitalWalletTokenizationResult.validate()
                }

                override fun visitDigitalWalletTokenizationTwoFactorAuthenticationCode(
                    digitalWalletTokenizationTwoFactorAuthenticationCode:
                        DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent
                ) {
                    digitalWalletTokenizationTwoFactorAuthenticationCode.validate()
                }

                override fun visitDigitalWalletTokenizationTwoFactorAuthenticationCodeSent(
                    digitalWalletTokenizationTwoFactorAuthenticationCodeSent:
                        DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent
                ) {
                    digitalWalletTokenizationTwoFactorAuthenticationCodeSent.validate()
                }

                override fun visitDigitalWalletTokenizationUpdated(
                    digitalWalletTokenizationUpdated: DigitalWalletTokenizationUpdatedWebhookEvent
                ) {
                    digitalWalletTokenizationUpdated.validate()
                }

                override fun visitDisputeUpdated(disputeUpdated: DisputeUpdatedWebhookEvent) {
                    disputeUpdated.validate()
                }

                override fun visitDisputeEvidenceUploadFailed(
                    disputeEvidenceUploadFailed: DisputeEvidenceUploadFailedWebhookEvent
                ) {
                    disputeEvidenceUploadFailed.validate()
                }

                override fun visitExternalBankAccountCreated(
                    externalBankAccountCreated: ExternalBankAccountCreatedWebhookEvent
                ) {
                    externalBankAccountCreated.validate()
                }

                override fun visitExternalBankAccountUpdated(
                    externalBankAccountUpdated: ExternalBankAccountUpdatedWebhookEvent
                ) {
                    externalBankAccountUpdated.validate()
                }

                override fun visitExternalPaymentCreated(
                    externalPaymentCreated: ExternalPaymentCreatedWebhookEvent
                ) {
                    externalPaymentCreated.validate()
                }

                override fun visitExternalPaymentUpdated(
                    externalPaymentUpdated: ExternalPaymentUpdatedWebhookEvent
                ) {
                    externalPaymentUpdated.validate()
                }

                override fun visitFinancialAccountCreated(
                    financialAccountCreated: FinancialAccountCreatedWebhookEvent
                ) {
                    financialAccountCreated.validate()
                }

                override fun visitFinancialAccountUpdated(
                    financialAccountUpdated: FinancialAccountUpdatedWebhookEvent
                ) {
                    financialAccountUpdated.validate()
                }

                override fun visitFundingEventCreated(
                    fundingEventCreated: FundingEventCreatedWebhookEvent
                ) {
                    fundingEventCreated.validate()
                }

                override fun visitLoanTapeCreated(loanTapeCreated: LoanTapeCreatedWebhookEvent) {
                    loanTapeCreated.validate()
                }

                override fun visitLoanTapeUpdated(loanTapeUpdated: LoanTapeUpdatedWebhookEvent) {
                    loanTapeUpdated.validate()
                }

                override fun visitManagementOperationCreated(
                    managementOperationCreated: ManagementOperationCreatedWebhookEvent
                ) {
                    managementOperationCreated.validate()
                }

                override fun visitManagementOperationUpdated(
                    managementOperationUpdated: ManagementOperationUpdatedWebhookEvent
                ) {
                    managementOperationUpdated.validate()
                }

                override fun visitInternalTransactionCreated(
                    internalTransactionCreated: InternalTransactionCreatedWebhookEvent
                ) {
                    internalTransactionCreated.validate()
                }

                override fun visitInternalTransactionUpdated(
                    internalTransactionUpdated: InternalTransactionUpdatedWebhookEvent
                ) {
                    internalTransactionUpdated.validate()
                }

                override fun visitNetworkTotalCreated(
                    networkTotalCreated: NetworkTotalCreatedWebhookEvent
                ) {
                    networkTotalCreated.validate()
                }

                override fun visitNetworkTotalUpdated(
                    networkTotalUpdated: NetworkTotalUpdatedWebhookEvent
                ) {
                    networkTotalUpdated.validate()
                }

                override fun visitPaymentTransactionCreated(
                    paymentTransactionCreated: PaymentTransactionCreatedWebhookEvent
                ) {
                    paymentTransactionCreated.validate()
                }

                override fun visitPaymentTransactionUpdated(
                    paymentTransactionUpdated: PaymentTransactionUpdatedWebhookEvent
                ) {
                    paymentTransactionUpdated.validate()
                }

                override fun visitSettlementReportUpdated(
                    settlementReportUpdated: SettlementReportUpdatedWebhookEvent
                ) {
                    settlementReportUpdated.validate()
                }

                override fun visitStatementsCreated(
                    statementsCreated: StatementsCreatedWebhookEvent
                ) {
                    statementsCreated.validate()
                }

                override fun visitThreeDSAuthenticationCreated(
                    threeDSAuthenticationCreated: ThreeDSAuthenticationCreatedWebhookEvent
                ) {
                    threeDSAuthenticationCreated.validate()
                }

                override fun visitThreeDSAuthenticationUpdated(
                    threeDSAuthenticationUpdated: ThreeDSAuthenticationUpdatedWebhookEvent
                ) {
                    threeDSAuthenticationUpdated.validate()
                }

                override fun visitThreeDSAuthenticationChallenge(
                    threeDSAuthenticationChallenge: ThreeDSAuthenticationChallengeWebhookEvent
                ) {
                    threeDSAuthenticationChallenge.validate()
                }

                override fun visitTokenizationApprovalRequest(
                    tokenizationApprovalRequest: TokenizationApprovalRequestWebhookEvent
                ) {
                    tokenizationApprovalRequest.validate()
                }

                override fun visitTokenizationResult(
                    tokenizationResult: TokenizationResultWebhookEvent
                ) {
                    tokenizationResult.validate()
                }

                override fun visitTokenizationTwoFactorAuthenticationCode(
                    tokenizationTwoFactorAuthenticationCode:
                        TokenizationTwoFactorAuthenticationCodeWebhookEvent
                ) {
                    tokenizationTwoFactorAuthenticationCode.validate()
                }

                override fun visitTokenizationTwoFactorAuthenticationCodeSent(
                    tokenizationTwoFactorAuthenticationCodeSent:
                        TokenizationTwoFactorAuthenticationCodeSentWebhookEvent
                ) {
                    tokenizationTwoFactorAuthenticationCodeSent.validate()
                }

                override fun visitTokenizationUpdated(
                    tokenizationUpdated: TokenizationUpdatedWebhookEvent
                ) {
                    tokenizationUpdated.validate()
                }

                override fun visitThreeDSAuthenticationApprovalRequest(
                    threeDSAuthenticationApprovalRequest:
                        ThreeDSAuthenticationApprovalRequestWebhookEvent
                ) {
                    threeDSAuthenticationApprovalRequest.validate()
                }

                override fun visitDisputeTransactionCreated(
                    disputeTransactionCreated: DisputeTransactionCreatedWebhookEvent
                ) {
                    disputeTransactionCreated.validate()
                }

                override fun visitDisputeTransactionUpdated(
                    disputeTransactionUpdated: DisputeTransactionUpdatedWebhookEvent
                ) {
                    disputeTransactionUpdated.validate()
                }
            }
        )
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LithicInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitAccountHolderCreated(
                    accountHolderCreated: AccountHolderCreatedWebhookEvent
                ) = accountHolderCreated.validity()

                override fun visitKybPayload(kybPayload: KybPayload) = kybPayload.validity()

                override fun visitKycPayload(kycPayload: KycPayload) = kycPayload.validity()

                override fun visitLegacyPayload(legacyPayload: LegacyPayload) =
                    legacyPayload.validity()

                override fun visitAccountHolderVerification(
                    accountHolderVerification: AccountHolderVerificationWebhookEvent
                ) = accountHolderVerification.validity()

                override fun visitAccountHolderDocumentUpdated(
                    accountHolderDocumentUpdated: AccountHolderDocumentUpdatedWebhookEvent
                ) = accountHolderDocumentUpdated.validity()

                override fun visitCardAuthorizationApprovalRequest(
                    cardAuthorizationApprovalRequest: CardAuthorizationApprovalRequestWebhookEvent
                ) = cardAuthorizationApprovalRequest.validity()

                override fun visitTokenizationDecisioningRequest(
                    tokenizationDecisioningRequest: TokenizationDecisioningRequestWebhookEvent
                ) = tokenizationDecisioningRequest.validity()

                override fun visitAuthRulesBacktestReportCreated(
                    authRulesBacktestReportCreated: AuthRulesBacktestReportCreatedWebhookEvent
                ) = authRulesBacktestReportCreated.validity()

                override fun visitBalanceUpdated(balanceUpdated: BalanceUpdatedWebhookEvent) =
                    balanceUpdated.validity()

                override fun visitBookTransferTransactionCreated(
                    bookTransferTransactionCreated: BookTransferTransactionCreatedWebhookEvent
                ) = bookTransferTransactionCreated.validity()

                override fun visitBookTransferTransactionUpdated(
                    bookTransferTransactionUpdated: BookTransferTransactionUpdatedWebhookEvent
                ) = bookTransferTransactionUpdated.validity()

                override fun visitCardCreated(cardCreated: CardCreatedWebhookEvent) =
                    cardCreated.validity()

                override fun visitCardConverted(cardConverted: CardConvertedWebhookEvent) =
                    cardConverted.validity()

                override fun visitCardRenewed(cardRenewed: CardRenewedWebhookEvent) =
                    cardRenewed.validity()

                override fun visitCardReissued(cardReissued: CardReissuedWebhookEvent) =
                    cardReissued.validity()

                override fun visitCardShipped(cardShipped: CardShippedWebhookEvent) =
                    cardShipped.validity()

                override fun visitCardUpdated(cardUpdated: CardUpdatedWebhookEvent) =
                    cardUpdated.validity()

                override fun visitCardTransactionUpdated(
                    cardTransactionUpdated: CardTransactionUpdatedWebhookEvent
                ) = cardTransactionUpdated.validity()

                override fun visitCardTransactionEnhancedDataCreated(
                    cardTransactionEnhancedDataCreated:
                        CardTransactionEnhancedDataCreatedWebhookEvent
                ) = cardTransactionEnhancedDataCreated.validity()

                override fun visitCardTransactionEnhancedDataUpdated(
                    cardTransactionEnhancedDataUpdated:
                        CardTransactionEnhancedDataUpdatedWebhookEvent
                ) = cardTransactionEnhancedDataUpdated.validity()

                override fun visitDigitalWalletTokenizationApprovalRequest(
                    digitalWalletTokenizationApprovalRequest:
                        DigitalWalletTokenizationApprovalRequestWebhookEvent
                ) = digitalWalletTokenizationApprovalRequest.validity()

                override fun visitDigitalWalletTokenizationResult(
                    digitalWalletTokenizationResult: DigitalWalletTokenizationResultWebhookEvent
                ) = digitalWalletTokenizationResult.validity()

                override fun visitDigitalWalletTokenizationTwoFactorAuthenticationCode(
                    digitalWalletTokenizationTwoFactorAuthenticationCode:
                        DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent
                ) = digitalWalletTokenizationTwoFactorAuthenticationCode.validity()

                override fun visitDigitalWalletTokenizationTwoFactorAuthenticationCodeSent(
                    digitalWalletTokenizationTwoFactorAuthenticationCodeSent:
                        DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent
                ) = digitalWalletTokenizationTwoFactorAuthenticationCodeSent.validity()

                override fun visitDigitalWalletTokenizationUpdated(
                    digitalWalletTokenizationUpdated: DigitalWalletTokenizationUpdatedWebhookEvent
                ) = digitalWalletTokenizationUpdated.validity()

                override fun visitDisputeUpdated(disputeUpdated: DisputeUpdatedWebhookEvent) =
                    disputeUpdated.validity()

                override fun visitDisputeEvidenceUploadFailed(
                    disputeEvidenceUploadFailed: DisputeEvidenceUploadFailedWebhookEvent
                ) = disputeEvidenceUploadFailed.validity()

                override fun visitExternalBankAccountCreated(
                    externalBankAccountCreated: ExternalBankAccountCreatedWebhookEvent
                ) = externalBankAccountCreated.validity()

                override fun visitExternalBankAccountUpdated(
                    externalBankAccountUpdated: ExternalBankAccountUpdatedWebhookEvent
                ) = externalBankAccountUpdated.validity()

                override fun visitExternalPaymentCreated(
                    externalPaymentCreated: ExternalPaymentCreatedWebhookEvent
                ) = externalPaymentCreated.validity()

                override fun visitExternalPaymentUpdated(
                    externalPaymentUpdated: ExternalPaymentUpdatedWebhookEvent
                ) = externalPaymentUpdated.validity()

                override fun visitFinancialAccountCreated(
                    financialAccountCreated: FinancialAccountCreatedWebhookEvent
                ) = financialAccountCreated.validity()

                override fun visitFinancialAccountUpdated(
                    financialAccountUpdated: FinancialAccountUpdatedWebhookEvent
                ) = financialAccountUpdated.validity()

                override fun visitFundingEventCreated(
                    fundingEventCreated: FundingEventCreatedWebhookEvent
                ) = fundingEventCreated.validity()

                override fun visitLoanTapeCreated(loanTapeCreated: LoanTapeCreatedWebhookEvent) =
                    loanTapeCreated.validity()

                override fun visitLoanTapeUpdated(loanTapeUpdated: LoanTapeUpdatedWebhookEvent) =
                    loanTapeUpdated.validity()

                override fun visitManagementOperationCreated(
                    managementOperationCreated: ManagementOperationCreatedWebhookEvent
                ) = managementOperationCreated.validity()

                override fun visitManagementOperationUpdated(
                    managementOperationUpdated: ManagementOperationUpdatedWebhookEvent
                ) = managementOperationUpdated.validity()

                override fun visitInternalTransactionCreated(
                    internalTransactionCreated: InternalTransactionCreatedWebhookEvent
                ) = internalTransactionCreated.validity()

                override fun visitInternalTransactionUpdated(
                    internalTransactionUpdated: InternalTransactionUpdatedWebhookEvent
                ) = internalTransactionUpdated.validity()

                override fun visitNetworkTotalCreated(
                    networkTotalCreated: NetworkTotalCreatedWebhookEvent
                ) = networkTotalCreated.validity()

                override fun visitNetworkTotalUpdated(
                    networkTotalUpdated: NetworkTotalUpdatedWebhookEvent
                ) = networkTotalUpdated.validity()

                override fun visitPaymentTransactionCreated(
                    paymentTransactionCreated: PaymentTransactionCreatedWebhookEvent
                ) = paymentTransactionCreated.validity()

                override fun visitPaymentTransactionUpdated(
                    paymentTransactionUpdated: PaymentTransactionUpdatedWebhookEvent
                ) = paymentTransactionUpdated.validity()

                override fun visitSettlementReportUpdated(
                    settlementReportUpdated: SettlementReportUpdatedWebhookEvent
                ) = settlementReportUpdated.validity()

                override fun visitStatementsCreated(
                    statementsCreated: StatementsCreatedWebhookEvent
                ) = statementsCreated.validity()

                override fun visitThreeDSAuthenticationCreated(
                    threeDSAuthenticationCreated: ThreeDSAuthenticationCreatedWebhookEvent
                ) = threeDSAuthenticationCreated.validity()

                override fun visitThreeDSAuthenticationUpdated(
                    threeDSAuthenticationUpdated: ThreeDSAuthenticationUpdatedWebhookEvent
                ) = threeDSAuthenticationUpdated.validity()

                override fun visitThreeDSAuthenticationChallenge(
                    threeDSAuthenticationChallenge: ThreeDSAuthenticationChallengeWebhookEvent
                ) = threeDSAuthenticationChallenge.validity()

                override fun visitTokenizationApprovalRequest(
                    tokenizationApprovalRequest: TokenizationApprovalRequestWebhookEvent
                ) = tokenizationApprovalRequest.validity()

                override fun visitTokenizationResult(
                    tokenizationResult: TokenizationResultWebhookEvent
                ) = tokenizationResult.validity()

                override fun visitTokenizationTwoFactorAuthenticationCode(
                    tokenizationTwoFactorAuthenticationCode:
                        TokenizationTwoFactorAuthenticationCodeWebhookEvent
                ) = tokenizationTwoFactorAuthenticationCode.validity()

                override fun visitTokenizationTwoFactorAuthenticationCodeSent(
                    tokenizationTwoFactorAuthenticationCodeSent:
                        TokenizationTwoFactorAuthenticationCodeSentWebhookEvent
                ) = tokenizationTwoFactorAuthenticationCodeSent.validity()

                override fun visitTokenizationUpdated(
                    tokenizationUpdated: TokenizationUpdatedWebhookEvent
                ) = tokenizationUpdated.validity()

                override fun visitThreeDSAuthenticationApprovalRequest(
                    threeDSAuthenticationApprovalRequest:
                        ThreeDSAuthenticationApprovalRequestWebhookEvent
                ) = threeDSAuthenticationApprovalRequest.validity()

                override fun visitDisputeTransactionCreated(
                    disputeTransactionCreated: DisputeTransactionCreatedWebhookEvent
                ) = disputeTransactionCreated.validity()

                override fun visitDisputeTransactionUpdated(
                    disputeTransactionUpdated: DisputeTransactionUpdatedWebhookEvent
                ) = disputeTransactionUpdated.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParsedWebhookEvent &&
            accountHolderCreated == other.accountHolderCreated &&
            kybPayload == other.kybPayload &&
            kycPayload == other.kycPayload &&
            legacyPayload == other.legacyPayload &&
            accountHolderVerification == other.accountHolderVerification &&
            accountHolderDocumentUpdated == other.accountHolderDocumentUpdated &&
            cardAuthorizationApprovalRequest == other.cardAuthorizationApprovalRequest &&
            tokenizationDecisioningRequest == other.tokenizationDecisioningRequest &&
            authRulesBacktestReportCreated == other.authRulesBacktestReportCreated &&
            balanceUpdated == other.balanceUpdated &&
            bookTransferTransactionCreated == other.bookTransferTransactionCreated &&
            bookTransferTransactionUpdated == other.bookTransferTransactionUpdated &&
            cardCreated == other.cardCreated &&
            cardConverted == other.cardConverted &&
            cardRenewed == other.cardRenewed &&
            cardReissued == other.cardReissued &&
            cardShipped == other.cardShipped &&
            cardUpdated == other.cardUpdated &&
            cardTransactionUpdated == other.cardTransactionUpdated &&
            cardTransactionEnhancedDataCreated == other.cardTransactionEnhancedDataCreated &&
            cardTransactionEnhancedDataUpdated == other.cardTransactionEnhancedDataUpdated &&
            digitalWalletTokenizationApprovalRequest ==
                other.digitalWalletTokenizationApprovalRequest &&
            digitalWalletTokenizationResult == other.digitalWalletTokenizationResult &&
            digitalWalletTokenizationTwoFactorAuthenticationCode ==
                other.digitalWalletTokenizationTwoFactorAuthenticationCode &&
            digitalWalletTokenizationTwoFactorAuthenticationCodeSent ==
                other.digitalWalletTokenizationTwoFactorAuthenticationCodeSent &&
            digitalWalletTokenizationUpdated == other.digitalWalletTokenizationUpdated &&
            disputeUpdated == other.disputeUpdated &&
            disputeEvidenceUploadFailed == other.disputeEvidenceUploadFailed &&
            externalBankAccountCreated == other.externalBankAccountCreated &&
            externalBankAccountUpdated == other.externalBankAccountUpdated &&
            externalPaymentCreated == other.externalPaymentCreated &&
            externalPaymentUpdated == other.externalPaymentUpdated &&
            financialAccountCreated == other.financialAccountCreated &&
            financialAccountUpdated == other.financialAccountUpdated &&
            fundingEventCreated == other.fundingEventCreated &&
            loanTapeCreated == other.loanTapeCreated &&
            loanTapeUpdated == other.loanTapeUpdated &&
            managementOperationCreated == other.managementOperationCreated &&
            managementOperationUpdated == other.managementOperationUpdated &&
            internalTransactionCreated == other.internalTransactionCreated &&
            internalTransactionUpdated == other.internalTransactionUpdated &&
            networkTotalCreated == other.networkTotalCreated &&
            networkTotalUpdated == other.networkTotalUpdated &&
            paymentTransactionCreated == other.paymentTransactionCreated &&
            paymentTransactionUpdated == other.paymentTransactionUpdated &&
            settlementReportUpdated == other.settlementReportUpdated &&
            statementsCreated == other.statementsCreated &&
            threeDSAuthenticationCreated == other.threeDSAuthenticationCreated &&
            threeDSAuthenticationUpdated == other.threeDSAuthenticationUpdated &&
            threeDSAuthenticationChallenge == other.threeDSAuthenticationChallenge &&
            tokenizationApprovalRequest == other.tokenizationApprovalRequest &&
            tokenizationResult == other.tokenizationResult &&
            tokenizationTwoFactorAuthenticationCode ==
                other.tokenizationTwoFactorAuthenticationCode &&
            tokenizationTwoFactorAuthenticationCodeSent ==
                other.tokenizationTwoFactorAuthenticationCodeSent &&
            tokenizationUpdated == other.tokenizationUpdated &&
            threeDSAuthenticationApprovalRequest == other.threeDSAuthenticationApprovalRequest &&
            disputeTransactionCreated == other.disputeTransactionCreated &&
            disputeTransactionUpdated == other.disputeTransactionUpdated
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountHolderCreated,
            kybPayload,
            kycPayload,
            legacyPayload,
            accountHolderVerification,
            accountHolderDocumentUpdated,
            cardAuthorizationApprovalRequest,
            tokenizationDecisioningRequest,
            authRulesBacktestReportCreated,
            balanceUpdated,
            bookTransferTransactionCreated,
            bookTransferTransactionUpdated,
            cardCreated,
            cardConverted,
            cardRenewed,
            cardReissued,
            cardShipped,
            cardUpdated,
            cardTransactionUpdated,
            cardTransactionEnhancedDataCreated,
            cardTransactionEnhancedDataUpdated,
            digitalWalletTokenizationApprovalRequest,
            digitalWalletTokenizationResult,
            digitalWalletTokenizationTwoFactorAuthenticationCode,
            digitalWalletTokenizationTwoFactorAuthenticationCodeSent,
            digitalWalletTokenizationUpdated,
            disputeUpdated,
            disputeEvidenceUploadFailed,
            externalBankAccountCreated,
            externalBankAccountUpdated,
            externalPaymentCreated,
            externalPaymentUpdated,
            financialAccountCreated,
            financialAccountUpdated,
            fundingEventCreated,
            loanTapeCreated,
            loanTapeUpdated,
            managementOperationCreated,
            managementOperationUpdated,
            internalTransactionCreated,
            internalTransactionUpdated,
            networkTotalCreated,
            networkTotalUpdated,
            paymentTransactionCreated,
            paymentTransactionUpdated,
            settlementReportUpdated,
            statementsCreated,
            threeDSAuthenticationCreated,
            threeDSAuthenticationUpdated,
            threeDSAuthenticationChallenge,
            tokenizationApprovalRequest,
            tokenizationResult,
            tokenizationTwoFactorAuthenticationCode,
            tokenizationTwoFactorAuthenticationCodeSent,
            tokenizationUpdated,
            threeDSAuthenticationApprovalRequest,
            disputeTransactionCreated,
            disputeTransactionUpdated,
        )

    override fun toString(): String =
        when {
            accountHolderCreated != null ->
                "ParsedWebhookEvent{accountHolderCreated=$accountHolderCreated}"
            kybPayload != null -> "ParsedWebhookEvent{kybPayload=$kybPayload}"
            kycPayload != null -> "ParsedWebhookEvent{kycPayload=$kycPayload}"
            legacyPayload != null -> "ParsedWebhookEvent{legacyPayload=$legacyPayload}"
            accountHolderVerification != null ->
                "ParsedWebhookEvent{accountHolderVerification=$accountHolderVerification}"
            accountHolderDocumentUpdated != null ->
                "ParsedWebhookEvent{accountHolderDocumentUpdated=$accountHolderDocumentUpdated}"
            cardAuthorizationApprovalRequest != null ->
                "ParsedWebhookEvent{cardAuthorizationApprovalRequest=$cardAuthorizationApprovalRequest}"
            tokenizationDecisioningRequest != null ->
                "ParsedWebhookEvent{tokenizationDecisioningRequest=$tokenizationDecisioningRequest}"
            authRulesBacktestReportCreated != null ->
                "ParsedWebhookEvent{authRulesBacktestReportCreated=$authRulesBacktestReportCreated}"
            balanceUpdated != null -> "ParsedWebhookEvent{balanceUpdated=$balanceUpdated}"
            bookTransferTransactionCreated != null ->
                "ParsedWebhookEvent{bookTransferTransactionCreated=$bookTransferTransactionCreated}"
            bookTransferTransactionUpdated != null ->
                "ParsedWebhookEvent{bookTransferTransactionUpdated=$bookTransferTransactionUpdated}"
            cardCreated != null -> "ParsedWebhookEvent{cardCreated=$cardCreated}"
            cardConverted != null -> "ParsedWebhookEvent{cardConverted=$cardConverted}"
            cardRenewed != null -> "ParsedWebhookEvent{cardRenewed=$cardRenewed}"
            cardReissued != null -> "ParsedWebhookEvent{cardReissued=$cardReissued}"
            cardShipped != null -> "ParsedWebhookEvent{cardShipped=$cardShipped}"
            cardUpdated != null -> "ParsedWebhookEvent{cardUpdated=$cardUpdated}"
            cardTransactionUpdated != null ->
                "ParsedWebhookEvent{cardTransactionUpdated=$cardTransactionUpdated}"
            cardTransactionEnhancedDataCreated != null ->
                "ParsedWebhookEvent{cardTransactionEnhancedDataCreated=$cardTransactionEnhancedDataCreated}"
            cardTransactionEnhancedDataUpdated != null ->
                "ParsedWebhookEvent{cardTransactionEnhancedDataUpdated=$cardTransactionEnhancedDataUpdated}"
            digitalWalletTokenizationApprovalRequest != null ->
                "ParsedWebhookEvent{digitalWalletTokenizationApprovalRequest=$digitalWalletTokenizationApprovalRequest}"
            digitalWalletTokenizationResult != null ->
                "ParsedWebhookEvent{digitalWalletTokenizationResult=$digitalWalletTokenizationResult}"
            digitalWalletTokenizationTwoFactorAuthenticationCode != null ->
                "ParsedWebhookEvent{digitalWalletTokenizationTwoFactorAuthenticationCode=$digitalWalletTokenizationTwoFactorAuthenticationCode}"
            digitalWalletTokenizationTwoFactorAuthenticationCodeSent != null ->
                "ParsedWebhookEvent{digitalWalletTokenizationTwoFactorAuthenticationCodeSent=$digitalWalletTokenizationTwoFactorAuthenticationCodeSent}"
            digitalWalletTokenizationUpdated != null ->
                "ParsedWebhookEvent{digitalWalletTokenizationUpdated=$digitalWalletTokenizationUpdated}"
            disputeUpdated != null -> "ParsedWebhookEvent{disputeUpdated=$disputeUpdated}"
            disputeEvidenceUploadFailed != null ->
                "ParsedWebhookEvent{disputeEvidenceUploadFailed=$disputeEvidenceUploadFailed}"
            externalBankAccountCreated != null ->
                "ParsedWebhookEvent{externalBankAccountCreated=$externalBankAccountCreated}"
            externalBankAccountUpdated != null ->
                "ParsedWebhookEvent{externalBankAccountUpdated=$externalBankAccountUpdated}"
            externalPaymentCreated != null ->
                "ParsedWebhookEvent{externalPaymentCreated=$externalPaymentCreated}"
            externalPaymentUpdated != null ->
                "ParsedWebhookEvent{externalPaymentUpdated=$externalPaymentUpdated}"
            financialAccountCreated != null ->
                "ParsedWebhookEvent{financialAccountCreated=$financialAccountCreated}"
            financialAccountUpdated != null ->
                "ParsedWebhookEvent{financialAccountUpdated=$financialAccountUpdated}"
            fundingEventCreated != null ->
                "ParsedWebhookEvent{fundingEventCreated=$fundingEventCreated}"
            loanTapeCreated != null -> "ParsedWebhookEvent{loanTapeCreated=$loanTapeCreated}"
            loanTapeUpdated != null -> "ParsedWebhookEvent{loanTapeUpdated=$loanTapeUpdated}"
            managementOperationCreated != null ->
                "ParsedWebhookEvent{managementOperationCreated=$managementOperationCreated}"
            managementOperationUpdated != null ->
                "ParsedWebhookEvent{managementOperationUpdated=$managementOperationUpdated}"
            internalTransactionCreated != null ->
                "ParsedWebhookEvent{internalTransactionCreated=$internalTransactionCreated}"
            internalTransactionUpdated != null ->
                "ParsedWebhookEvent{internalTransactionUpdated=$internalTransactionUpdated}"
            networkTotalCreated != null ->
                "ParsedWebhookEvent{networkTotalCreated=$networkTotalCreated}"
            networkTotalUpdated != null ->
                "ParsedWebhookEvent{networkTotalUpdated=$networkTotalUpdated}"
            paymentTransactionCreated != null ->
                "ParsedWebhookEvent{paymentTransactionCreated=$paymentTransactionCreated}"
            paymentTransactionUpdated != null ->
                "ParsedWebhookEvent{paymentTransactionUpdated=$paymentTransactionUpdated}"
            settlementReportUpdated != null ->
                "ParsedWebhookEvent{settlementReportUpdated=$settlementReportUpdated}"
            statementsCreated != null -> "ParsedWebhookEvent{statementsCreated=$statementsCreated}"
            threeDSAuthenticationCreated != null ->
                "ParsedWebhookEvent{threeDSAuthenticationCreated=$threeDSAuthenticationCreated}"
            threeDSAuthenticationUpdated != null ->
                "ParsedWebhookEvent{threeDSAuthenticationUpdated=$threeDSAuthenticationUpdated}"
            threeDSAuthenticationChallenge != null ->
                "ParsedWebhookEvent{threeDSAuthenticationChallenge=$threeDSAuthenticationChallenge}"
            tokenizationApprovalRequest != null ->
                "ParsedWebhookEvent{tokenizationApprovalRequest=$tokenizationApprovalRequest}"
            tokenizationResult != null ->
                "ParsedWebhookEvent{tokenizationResult=$tokenizationResult}"
            tokenizationTwoFactorAuthenticationCode != null ->
                "ParsedWebhookEvent{tokenizationTwoFactorAuthenticationCode=$tokenizationTwoFactorAuthenticationCode}"
            tokenizationTwoFactorAuthenticationCodeSent != null ->
                "ParsedWebhookEvent{tokenizationTwoFactorAuthenticationCodeSent=$tokenizationTwoFactorAuthenticationCodeSent}"
            tokenizationUpdated != null ->
                "ParsedWebhookEvent{tokenizationUpdated=$tokenizationUpdated}"
            threeDSAuthenticationApprovalRequest != null ->
                "ParsedWebhookEvent{threeDSAuthenticationApprovalRequest=$threeDSAuthenticationApprovalRequest}"
            disputeTransactionCreated != null ->
                "ParsedWebhookEvent{disputeTransactionCreated=$disputeTransactionCreated}"
            disputeTransactionUpdated != null ->
                "ParsedWebhookEvent{disputeTransactionUpdated=$disputeTransactionUpdated}"
            _json != null -> "ParsedWebhookEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ParsedWebhookEvent")
        }

    companion object {

        @JvmStatic
        fun ofAccountHolderCreated(accountHolderCreated: AccountHolderCreatedWebhookEvent) =
            ParsedWebhookEvent(accountHolderCreated = accountHolderCreated)

        /** KYB payload for an updated account holder. */
        @JvmStatic
        fun ofKybPayload(kybPayload: KybPayload) = ParsedWebhookEvent(kybPayload = kybPayload)

        /** KYC payload for an updated account holder. */
        @JvmStatic
        fun ofKycPayload(kycPayload: KycPayload) = ParsedWebhookEvent(kycPayload = kycPayload)

        /** Legacy payload for an updated account holder. */
        @JvmStatic
        fun ofLegacyPayload(legacyPayload: LegacyPayload) =
            ParsedWebhookEvent(legacyPayload = legacyPayload)

        @JvmStatic
        fun ofAccountHolderVerification(
            accountHolderVerification: AccountHolderVerificationWebhookEvent
        ) = ParsedWebhookEvent(accountHolderVerification = accountHolderVerification)

        @JvmStatic
        fun ofAccountHolderDocumentUpdated(
            accountHolderDocumentUpdated: AccountHolderDocumentUpdatedWebhookEvent
        ) = ParsedWebhookEvent(accountHolderDocumentUpdated = accountHolderDocumentUpdated)

        @JvmStatic
        fun ofCardAuthorizationApprovalRequest(
            cardAuthorizationApprovalRequest: CardAuthorizationApprovalRequestWebhookEvent
        ) = ParsedWebhookEvent(cardAuthorizationApprovalRequest = cardAuthorizationApprovalRequest)

        /** A webhook for tokenization decisioning sent to the customer's responder endpoint */
        @JvmStatic
        fun ofTokenizationDecisioningRequest(
            tokenizationDecisioningRequest: TokenizationDecisioningRequestWebhookEvent
        ) = ParsedWebhookEvent(tokenizationDecisioningRequest = tokenizationDecisioningRequest)

        @JvmStatic
        fun ofAuthRulesBacktestReportCreated(
            authRulesBacktestReportCreated: AuthRulesBacktestReportCreatedWebhookEvent
        ) = ParsedWebhookEvent(authRulesBacktestReportCreated = authRulesBacktestReportCreated)

        @JvmStatic
        fun ofBalanceUpdated(balanceUpdated: BalanceUpdatedWebhookEvent) =
            ParsedWebhookEvent(balanceUpdated = balanceUpdated)

        /** Book transfer transaction */
        @JvmStatic
        fun ofBookTransferTransactionCreated(
            bookTransferTransactionCreated: BookTransferTransactionCreatedWebhookEvent
        ) = ParsedWebhookEvent(bookTransferTransactionCreated = bookTransferTransactionCreated)

        /** Book transfer transaction */
        @JvmStatic
        fun ofBookTransferTransactionUpdated(
            bookTransferTransactionUpdated: BookTransferTransactionUpdatedWebhookEvent
        ) = ParsedWebhookEvent(bookTransferTransactionUpdated = bookTransferTransactionUpdated)

        @JvmStatic
        fun ofCardCreated(cardCreated: CardCreatedWebhookEvent) =
            ParsedWebhookEvent(cardCreated = cardCreated)

        @JvmStatic
        fun ofCardConverted(cardConverted: CardConvertedWebhookEvent) =
            ParsedWebhookEvent(cardConverted = cardConverted)

        @JvmStatic
        fun ofCardRenewed(cardRenewed: CardRenewedWebhookEvent) =
            ParsedWebhookEvent(cardRenewed = cardRenewed)

        @JvmStatic
        fun ofCardReissued(cardReissued: CardReissuedWebhookEvent) =
            ParsedWebhookEvent(cardReissued = cardReissued)

        @JvmStatic
        fun ofCardShipped(cardShipped: CardShippedWebhookEvent) =
            ParsedWebhookEvent(cardShipped = cardShipped)

        @JvmStatic
        fun ofCardUpdated(cardUpdated: CardUpdatedWebhookEvent) =
            ParsedWebhookEvent(cardUpdated = cardUpdated)

        @JvmStatic
        fun ofCardTransactionUpdated(cardTransactionUpdated: CardTransactionUpdatedWebhookEvent) =
            ParsedWebhookEvent(cardTransactionUpdated = cardTransactionUpdated)

        @JvmStatic
        fun ofCardTransactionEnhancedDataCreated(
            cardTransactionEnhancedDataCreated: CardTransactionEnhancedDataCreatedWebhookEvent
        ) =
            ParsedWebhookEvent(
                cardTransactionEnhancedDataCreated = cardTransactionEnhancedDataCreated
            )

        @JvmStatic
        fun ofCardTransactionEnhancedDataUpdated(
            cardTransactionEnhancedDataUpdated: CardTransactionEnhancedDataUpdatedWebhookEvent
        ) =
            ParsedWebhookEvent(
                cardTransactionEnhancedDataUpdated = cardTransactionEnhancedDataUpdated
            )

        @JvmStatic
        fun ofDigitalWalletTokenizationApprovalRequest(
            digitalWalletTokenizationApprovalRequest:
                DigitalWalletTokenizationApprovalRequestWebhookEvent
        ) =
            ParsedWebhookEvent(
                digitalWalletTokenizationApprovalRequest = digitalWalletTokenizationApprovalRequest
            )

        @JvmStatic
        fun ofDigitalWalletTokenizationResult(
            digitalWalletTokenizationResult: DigitalWalletTokenizationResultWebhookEvent
        ) = ParsedWebhookEvent(digitalWalletTokenizationResult = digitalWalletTokenizationResult)

        @JvmStatic
        fun ofDigitalWalletTokenizationTwoFactorAuthenticationCode(
            digitalWalletTokenizationTwoFactorAuthenticationCode:
                DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent
        ) =
            ParsedWebhookEvent(
                digitalWalletTokenizationTwoFactorAuthenticationCode =
                    digitalWalletTokenizationTwoFactorAuthenticationCode
            )

        @JvmStatic
        fun ofDigitalWalletTokenizationTwoFactorAuthenticationCodeSent(
            digitalWalletTokenizationTwoFactorAuthenticationCodeSent:
                DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent
        ) =
            ParsedWebhookEvent(
                digitalWalletTokenizationTwoFactorAuthenticationCodeSent =
                    digitalWalletTokenizationTwoFactorAuthenticationCodeSent
            )

        @JvmStatic
        fun ofDigitalWalletTokenizationUpdated(
            digitalWalletTokenizationUpdated: DigitalWalletTokenizationUpdatedWebhookEvent
        ) = ParsedWebhookEvent(digitalWalletTokenizationUpdated = digitalWalletTokenizationUpdated)

        /** Dispute. */
        @JvmStatic
        fun ofDisputeUpdated(disputeUpdated: DisputeUpdatedWebhookEvent) =
            ParsedWebhookEvent(disputeUpdated = disputeUpdated)

        /** Dispute evidence. */
        @JvmStatic
        fun ofDisputeEvidenceUploadFailed(
            disputeEvidenceUploadFailed: DisputeEvidenceUploadFailedWebhookEvent
        ) = ParsedWebhookEvent(disputeEvidenceUploadFailed = disputeEvidenceUploadFailed)

        @JvmStatic
        fun ofExternalBankAccountCreated(
            externalBankAccountCreated: ExternalBankAccountCreatedWebhookEvent
        ) = ParsedWebhookEvent(externalBankAccountCreated = externalBankAccountCreated)

        @JvmStatic
        fun ofExternalBankAccountUpdated(
            externalBankAccountUpdated: ExternalBankAccountUpdatedWebhookEvent
        ) = ParsedWebhookEvent(externalBankAccountUpdated = externalBankAccountUpdated)

        @JvmStatic
        fun ofExternalPaymentCreated(externalPaymentCreated: ExternalPaymentCreatedWebhookEvent) =
            ParsedWebhookEvent(externalPaymentCreated = externalPaymentCreated)

        @JvmStatic
        fun ofExternalPaymentUpdated(externalPaymentUpdated: ExternalPaymentUpdatedWebhookEvent) =
            ParsedWebhookEvent(externalPaymentUpdated = externalPaymentUpdated)

        @JvmStatic
        fun ofFinancialAccountCreated(
            financialAccountCreated: FinancialAccountCreatedWebhookEvent
        ) = ParsedWebhookEvent(financialAccountCreated = financialAccountCreated)

        @JvmStatic
        fun ofFinancialAccountUpdated(
            financialAccountUpdated: FinancialAccountUpdatedWebhookEvent
        ) = ParsedWebhookEvent(financialAccountUpdated = financialAccountUpdated)

        @JvmStatic
        fun ofFundingEventCreated(fundingEventCreated: FundingEventCreatedWebhookEvent) =
            ParsedWebhookEvent(fundingEventCreated = fundingEventCreated)

        @JvmStatic
        fun ofLoanTapeCreated(loanTapeCreated: LoanTapeCreatedWebhookEvent) =
            ParsedWebhookEvent(loanTapeCreated = loanTapeCreated)

        @JvmStatic
        fun ofLoanTapeUpdated(loanTapeUpdated: LoanTapeUpdatedWebhookEvent) =
            ParsedWebhookEvent(loanTapeUpdated = loanTapeUpdated)

        @JvmStatic
        fun ofManagementOperationCreated(
            managementOperationCreated: ManagementOperationCreatedWebhookEvent
        ) = ParsedWebhookEvent(managementOperationCreated = managementOperationCreated)

        @JvmStatic
        fun ofManagementOperationUpdated(
            managementOperationUpdated: ManagementOperationUpdatedWebhookEvent
        ) = ParsedWebhookEvent(managementOperationUpdated = managementOperationUpdated)

        @JvmStatic
        fun ofInternalTransactionCreated(
            internalTransactionCreated: InternalTransactionCreatedWebhookEvent
        ) = ParsedWebhookEvent(internalTransactionCreated = internalTransactionCreated)

        @JvmStatic
        fun ofInternalTransactionUpdated(
            internalTransactionUpdated: InternalTransactionUpdatedWebhookEvent
        ) = ParsedWebhookEvent(internalTransactionUpdated = internalTransactionUpdated)

        @JvmStatic
        fun ofNetworkTotalCreated(networkTotalCreated: NetworkTotalCreatedWebhookEvent) =
            ParsedWebhookEvent(networkTotalCreated = networkTotalCreated)

        @JvmStatic
        fun ofNetworkTotalUpdated(networkTotalUpdated: NetworkTotalUpdatedWebhookEvent) =
            ParsedWebhookEvent(networkTotalUpdated = networkTotalUpdated)

        /** Payment transaction */
        @JvmStatic
        fun ofPaymentTransactionCreated(
            paymentTransactionCreated: PaymentTransactionCreatedWebhookEvent
        ) = ParsedWebhookEvent(paymentTransactionCreated = paymentTransactionCreated)

        /** Payment transaction */
        @JvmStatic
        fun ofPaymentTransactionUpdated(
            paymentTransactionUpdated: PaymentTransactionUpdatedWebhookEvent
        ) = ParsedWebhookEvent(paymentTransactionUpdated = paymentTransactionUpdated)

        @JvmStatic
        fun ofSettlementReportUpdated(
            settlementReportUpdated: SettlementReportUpdatedWebhookEvent
        ) = ParsedWebhookEvent(settlementReportUpdated = settlementReportUpdated)

        @JvmStatic
        fun ofStatementsCreated(statementsCreated: StatementsCreatedWebhookEvent) =
            ParsedWebhookEvent(statementsCreated = statementsCreated)

        /** Represents a 3DS authentication */
        @JvmStatic
        fun ofThreeDSAuthenticationCreated(
            threeDSAuthenticationCreated: ThreeDSAuthenticationCreatedWebhookEvent
        ) = ParsedWebhookEvent(threeDSAuthenticationCreated = threeDSAuthenticationCreated)

        /** Represents a 3DS authentication */
        @JvmStatic
        fun ofThreeDSAuthenticationUpdated(
            threeDSAuthenticationUpdated: ThreeDSAuthenticationUpdatedWebhookEvent
        ) = ParsedWebhookEvent(threeDSAuthenticationUpdated = threeDSAuthenticationUpdated)

        @JvmStatic
        fun ofThreeDSAuthenticationChallenge(
            threeDSAuthenticationChallenge: ThreeDSAuthenticationChallengeWebhookEvent
        ) = ParsedWebhookEvent(threeDSAuthenticationChallenge = threeDSAuthenticationChallenge)

        @JvmStatic
        fun ofTokenizationApprovalRequest(
            tokenizationApprovalRequest: TokenizationApprovalRequestWebhookEvent
        ) = ParsedWebhookEvent(tokenizationApprovalRequest = tokenizationApprovalRequest)

        @JvmStatic
        fun ofTokenizationResult(tokenizationResult: TokenizationResultWebhookEvent) =
            ParsedWebhookEvent(tokenizationResult = tokenizationResult)

        @JvmStatic
        fun ofTokenizationTwoFactorAuthenticationCode(
            tokenizationTwoFactorAuthenticationCode:
                TokenizationTwoFactorAuthenticationCodeWebhookEvent
        ) =
            ParsedWebhookEvent(
                tokenizationTwoFactorAuthenticationCode = tokenizationTwoFactorAuthenticationCode
            )

        @JvmStatic
        fun ofTokenizationTwoFactorAuthenticationCodeSent(
            tokenizationTwoFactorAuthenticationCodeSent:
                TokenizationTwoFactorAuthenticationCodeSentWebhookEvent
        ) =
            ParsedWebhookEvent(
                tokenizationTwoFactorAuthenticationCodeSent =
                    tokenizationTwoFactorAuthenticationCodeSent
            )

        @JvmStatic
        fun ofTokenizationUpdated(tokenizationUpdated: TokenizationUpdatedWebhookEvent) =
            ParsedWebhookEvent(tokenizationUpdated = tokenizationUpdated)

        /** Represents a 3DS authentication */
        @JvmStatic
        fun ofThreeDSAuthenticationApprovalRequest(
            threeDSAuthenticationApprovalRequest: ThreeDSAuthenticationApprovalRequestWebhookEvent
        ) =
            ParsedWebhookEvent(
                threeDSAuthenticationApprovalRequest = threeDSAuthenticationApprovalRequest
            )

        /** The Dispute object tracks the progression of a dispute throughout its lifecycle. */
        @JvmStatic
        fun ofDisputeTransactionCreated(
            disputeTransactionCreated: DisputeTransactionCreatedWebhookEvent
        ) = ParsedWebhookEvent(disputeTransactionCreated = disputeTransactionCreated)

        /** The Dispute object tracks the progression of a dispute throughout its lifecycle. */
        @JvmStatic
        fun ofDisputeTransactionUpdated(
            disputeTransactionUpdated: DisputeTransactionUpdatedWebhookEvent
        ) = ParsedWebhookEvent(disputeTransactionUpdated = disputeTransactionUpdated)
    }

    /**
     * An interface that defines how to map each variant of [ParsedWebhookEvent] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitAccountHolderCreated(accountHolderCreated: AccountHolderCreatedWebhookEvent): T

        /** KYB payload for an updated account holder. */
        fun visitKybPayload(kybPayload: KybPayload): T

        /** KYC payload for an updated account holder. */
        fun visitKycPayload(kycPayload: KycPayload): T

        /** Legacy payload for an updated account holder. */
        fun visitLegacyPayload(legacyPayload: LegacyPayload): T

        fun visitAccountHolderVerification(
            accountHolderVerification: AccountHolderVerificationWebhookEvent
        ): T

        fun visitAccountHolderDocumentUpdated(
            accountHolderDocumentUpdated: AccountHolderDocumentUpdatedWebhookEvent
        ): T

        fun visitCardAuthorizationApprovalRequest(
            cardAuthorizationApprovalRequest: CardAuthorizationApprovalRequestWebhookEvent
        ): T

        /** A webhook for tokenization decisioning sent to the customer's responder endpoint */
        fun visitTokenizationDecisioningRequest(
            tokenizationDecisioningRequest: TokenizationDecisioningRequestWebhookEvent
        ): T

        fun visitAuthRulesBacktestReportCreated(
            authRulesBacktestReportCreated: AuthRulesBacktestReportCreatedWebhookEvent
        ): T

        fun visitBalanceUpdated(balanceUpdated: BalanceUpdatedWebhookEvent): T

        /** Book transfer transaction */
        fun visitBookTransferTransactionCreated(
            bookTransferTransactionCreated: BookTransferTransactionCreatedWebhookEvent
        ): T

        /** Book transfer transaction */
        fun visitBookTransferTransactionUpdated(
            bookTransferTransactionUpdated: BookTransferTransactionUpdatedWebhookEvent
        ): T

        fun visitCardCreated(cardCreated: CardCreatedWebhookEvent): T

        fun visitCardConverted(cardConverted: CardConvertedWebhookEvent): T

        fun visitCardRenewed(cardRenewed: CardRenewedWebhookEvent): T

        fun visitCardReissued(cardReissued: CardReissuedWebhookEvent): T

        fun visitCardShipped(cardShipped: CardShippedWebhookEvent): T

        fun visitCardUpdated(cardUpdated: CardUpdatedWebhookEvent): T

        fun visitCardTransactionUpdated(
            cardTransactionUpdated: CardTransactionUpdatedWebhookEvent
        ): T

        fun visitCardTransactionEnhancedDataCreated(
            cardTransactionEnhancedDataCreated: CardTransactionEnhancedDataCreatedWebhookEvent
        ): T

        fun visitCardTransactionEnhancedDataUpdated(
            cardTransactionEnhancedDataUpdated: CardTransactionEnhancedDataUpdatedWebhookEvent
        ): T

        fun visitDigitalWalletTokenizationApprovalRequest(
            digitalWalletTokenizationApprovalRequest:
                DigitalWalletTokenizationApprovalRequestWebhookEvent
        ): T

        fun visitDigitalWalletTokenizationResult(
            digitalWalletTokenizationResult: DigitalWalletTokenizationResultWebhookEvent
        ): T

        fun visitDigitalWalletTokenizationTwoFactorAuthenticationCode(
            digitalWalletTokenizationTwoFactorAuthenticationCode:
                DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent
        ): T

        fun visitDigitalWalletTokenizationTwoFactorAuthenticationCodeSent(
            digitalWalletTokenizationTwoFactorAuthenticationCodeSent:
                DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent
        ): T

        fun visitDigitalWalletTokenizationUpdated(
            digitalWalletTokenizationUpdated: DigitalWalletTokenizationUpdatedWebhookEvent
        ): T

        /** Dispute. */
        fun visitDisputeUpdated(disputeUpdated: DisputeUpdatedWebhookEvent): T

        /** Dispute evidence. */
        fun visitDisputeEvidenceUploadFailed(
            disputeEvidenceUploadFailed: DisputeEvidenceUploadFailedWebhookEvent
        ): T

        fun visitExternalBankAccountCreated(
            externalBankAccountCreated: ExternalBankAccountCreatedWebhookEvent
        ): T

        fun visitExternalBankAccountUpdated(
            externalBankAccountUpdated: ExternalBankAccountUpdatedWebhookEvent
        ): T

        fun visitExternalPaymentCreated(
            externalPaymentCreated: ExternalPaymentCreatedWebhookEvent
        ): T

        fun visitExternalPaymentUpdated(
            externalPaymentUpdated: ExternalPaymentUpdatedWebhookEvent
        ): T

        fun visitFinancialAccountCreated(
            financialAccountCreated: FinancialAccountCreatedWebhookEvent
        ): T

        fun visitFinancialAccountUpdated(
            financialAccountUpdated: FinancialAccountUpdatedWebhookEvent
        ): T

        fun visitFundingEventCreated(fundingEventCreated: FundingEventCreatedWebhookEvent): T

        fun visitLoanTapeCreated(loanTapeCreated: LoanTapeCreatedWebhookEvent): T

        fun visitLoanTapeUpdated(loanTapeUpdated: LoanTapeUpdatedWebhookEvent): T

        fun visitManagementOperationCreated(
            managementOperationCreated: ManagementOperationCreatedWebhookEvent
        ): T

        fun visitManagementOperationUpdated(
            managementOperationUpdated: ManagementOperationUpdatedWebhookEvent
        ): T

        fun visitInternalTransactionCreated(
            internalTransactionCreated: InternalTransactionCreatedWebhookEvent
        ): T

        fun visitInternalTransactionUpdated(
            internalTransactionUpdated: InternalTransactionUpdatedWebhookEvent
        ): T

        fun visitNetworkTotalCreated(networkTotalCreated: NetworkTotalCreatedWebhookEvent): T

        fun visitNetworkTotalUpdated(networkTotalUpdated: NetworkTotalUpdatedWebhookEvent): T

        /** Payment transaction */
        fun visitPaymentTransactionCreated(
            paymentTransactionCreated: PaymentTransactionCreatedWebhookEvent
        ): T

        /** Payment transaction */
        fun visitPaymentTransactionUpdated(
            paymentTransactionUpdated: PaymentTransactionUpdatedWebhookEvent
        ): T

        fun visitSettlementReportUpdated(
            settlementReportUpdated: SettlementReportUpdatedWebhookEvent
        ): T

        fun visitStatementsCreated(statementsCreated: StatementsCreatedWebhookEvent): T

        /** Represents a 3DS authentication */
        fun visitThreeDSAuthenticationCreated(
            threeDSAuthenticationCreated: ThreeDSAuthenticationCreatedWebhookEvent
        ): T

        /** Represents a 3DS authentication */
        fun visitThreeDSAuthenticationUpdated(
            threeDSAuthenticationUpdated: ThreeDSAuthenticationUpdatedWebhookEvent
        ): T

        fun visitThreeDSAuthenticationChallenge(
            threeDSAuthenticationChallenge: ThreeDSAuthenticationChallengeWebhookEvent
        ): T

        fun visitTokenizationApprovalRequest(
            tokenizationApprovalRequest: TokenizationApprovalRequestWebhookEvent
        ): T

        fun visitTokenizationResult(tokenizationResult: TokenizationResultWebhookEvent): T

        fun visitTokenizationTwoFactorAuthenticationCode(
            tokenizationTwoFactorAuthenticationCode:
                TokenizationTwoFactorAuthenticationCodeWebhookEvent
        ): T

        fun visitTokenizationTwoFactorAuthenticationCodeSent(
            tokenizationTwoFactorAuthenticationCodeSent:
                TokenizationTwoFactorAuthenticationCodeSentWebhookEvent
        ): T

        fun visitTokenizationUpdated(tokenizationUpdated: TokenizationUpdatedWebhookEvent): T

        /** Represents a 3DS authentication */
        fun visitThreeDSAuthenticationApprovalRequest(
            threeDSAuthenticationApprovalRequest: ThreeDSAuthenticationApprovalRequestWebhookEvent
        ): T

        /** The Dispute object tracks the progression of a dispute throughout its lifecycle. */
        fun visitDisputeTransactionCreated(
            disputeTransactionCreated: DisputeTransactionCreatedWebhookEvent
        ): T

        /** The Dispute object tracks the progression of a dispute throughout its lifecycle. */
        fun visitDisputeTransactionUpdated(
            disputeTransactionUpdated: DisputeTransactionUpdatedWebhookEvent
        ): T

        /**
         * Maps an unknown variant of [ParsedWebhookEvent] to a value of type [T].
         *
         * An instance of [ParsedWebhookEvent] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws LithicInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LithicInvalidDataException("Unknown ParsedWebhookEvent: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<ParsedWebhookEvent>(ParsedWebhookEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ParsedWebhookEvent {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<AccountHolderCreatedWebhookEvent>())
                            ?.let { ParsedWebhookEvent(accountHolderCreated = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<KybPayload>())?.let {
                            ParsedWebhookEvent(kybPayload = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<KycPayload>())?.let {
                            ParsedWebhookEvent(kycPayload = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<LegacyPayload>())?.let {
                            ParsedWebhookEvent(legacyPayload = it, _json = json)
                        },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<AccountHolderVerificationWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(accountHolderVerification = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<AccountHolderDocumentUpdatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(accountHolderDocumentUpdated = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CardAuthorizationApprovalRequestWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(
                                    cardAuthorizationApprovalRequest = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<TokenizationDecisioningRequestWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(
                                    tokenizationDecisioningRequest = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<AuthRulesBacktestReportCreatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(
                                    authRulesBacktestReportCreated = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<BalanceUpdatedWebhookEvent>())?.let {
                            ParsedWebhookEvent(balanceUpdated = it, _json = json)
                        },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<BookTransferTransactionCreatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(
                                    bookTransferTransactionCreated = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<BookTransferTransactionUpdatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(
                                    bookTransferTransactionUpdated = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<CardCreatedWebhookEvent>())?.let {
                            ParsedWebhookEvent(cardCreated = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CardConvertedWebhookEvent>())?.let {
                            ParsedWebhookEvent(cardConverted = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CardRenewedWebhookEvent>())?.let {
                            ParsedWebhookEvent(cardRenewed = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CardReissuedWebhookEvent>())?.let {
                            ParsedWebhookEvent(cardReissued = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CardShippedWebhookEvent>())?.let {
                            ParsedWebhookEvent(cardShipped = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CardUpdatedWebhookEvent>())?.let {
                            ParsedWebhookEvent(cardUpdated = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CardTransactionUpdatedWebhookEvent>())
                            ?.let { ParsedWebhookEvent(cardTransactionUpdated = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CardTransactionEnhancedDataCreatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(
                                    cardTransactionEnhancedDataCreated = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CardTransactionEnhancedDataUpdatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(
                                    cardTransactionEnhancedDataUpdated = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    DigitalWalletTokenizationApprovalRequestWebhookEvent
                                >(),
                            )
                            ?.let {
                                ParsedWebhookEvent(
                                    digitalWalletTokenizationApprovalRequest = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<DigitalWalletTokenizationResultWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(
                                    digitalWalletTokenizationResult = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    DigitalWalletTokenizationTwoFactorAuthenticationCodeWebhookEvent
                                >(),
                            )
                            ?.let {
                                ParsedWebhookEvent(
                                    digitalWalletTokenizationTwoFactorAuthenticationCode = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    DigitalWalletTokenizationTwoFactorAuthenticationCodeSentWebhookEvent
                                >(),
                            )
                            ?.let {
                                ParsedWebhookEvent(
                                    digitalWalletTokenizationTwoFactorAuthenticationCodeSent = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<DigitalWalletTokenizationUpdatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(
                                    digitalWalletTokenizationUpdated = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<DisputeUpdatedWebhookEvent>())?.let {
                            ParsedWebhookEvent(disputeUpdated = it, _json = json)
                        },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<DisputeEvidenceUploadFailedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(disputeEvidenceUploadFailed = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ExternalBankAccountCreatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(externalBankAccountCreated = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ExternalBankAccountUpdatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(externalBankAccountUpdated = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<ExternalPaymentCreatedWebhookEvent>())
                            ?.let { ParsedWebhookEvent(externalPaymentCreated = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<ExternalPaymentUpdatedWebhookEvent>())
                            ?.let { ParsedWebhookEvent(externalPaymentUpdated = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<FinancialAccountCreatedWebhookEvent>())
                            ?.let {
                                ParsedWebhookEvent(financialAccountCreated = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<FinancialAccountUpdatedWebhookEvent>())
                            ?.let {
                                ParsedWebhookEvent(financialAccountUpdated = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<FundingEventCreatedWebhookEvent>())
                            ?.let { ParsedWebhookEvent(fundingEventCreated = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<LoanTapeCreatedWebhookEvent>())?.let {
                            ParsedWebhookEvent(loanTapeCreated = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<LoanTapeUpdatedWebhookEvent>())?.let {
                            ParsedWebhookEvent(loanTapeUpdated = it, _json = json)
                        },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ManagementOperationCreatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(managementOperationCreated = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ManagementOperationUpdatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(managementOperationUpdated = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InternalTransactionCreatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(internalTransactionCreated = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InternalTransactionUpdatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(internalTransactionUpdated = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<NetworkTotalCreatedWebhookEvent>())
                            ?.let { ParsedWebhookEvent(networkTotalCreated = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<NetworkTotalUpdatedWebhookEvent>())
                            ?.let { ParsedWebhookEvent(networkTotalUpdated = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<PaymentTransactionCreatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(paymentTransactionCreated = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<PaymentTransactionUpdatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(paymentTransactionUpdated = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<SettlementReportUpdatedWebhookEvent>())
                            ?.let {
                                ParsedWebhookEvent(settlementReportUpdated = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<StatementsCreatedWebhookEvent>())?.let {
                            ParsedWebhookEvent(statementsCreated = it, _json = json)
                        },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ThreeDSAuthenticationCreatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(threeDSAuthenticationCreated = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ThreeDSAuthenticationUpdatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(threeDSAuthenticationUpdated = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ThreeDSAuthenticationChallengeWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(
                                    threeDSAuthenticationChallenge = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<TokenizationApprovalRequestWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(tokenizationApprovalRequest = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<TokenizationResultWebhookEvent>())
                            ?.let { ParsedWebhookEvent(tokenizationResult = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    TokenizationTwoFactorAuthenticationCodeWebhookEvent
                                >(),
                            )
                            ?.let {
                                ParsedWebhookEvent(
                                    tokenizationTwoFactorAuthenticationCode = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    TokenizationTwoFactorAuthenticationCodeSentWebhookEvent
                                >(),
                            )
                            ?.let {
                                ParsedWebhookEvent(
                                    tokenizationTwoFactorAuthenticationCodeSent = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<TokenizationUpdatedWebhookEvent>())
                            ?.let { ParsedWebhookEvent(tokenizationUpdated = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ThreeDSAuthenticationApprovalRequestWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(
                                    threeDSAuthenticationApprovalRequest = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<DisputeTransactionCreatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(disputeTransactionCreated = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<DisputeTransactionUpdatedWebhookEvent>(),
                            )
                            ?.let {
                                ParsedWebhookEvent(disputeTransactionUpdated = it, _json = json)
                            },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ParsedWebhookEvent(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<ParsedWebhookEvent>(ParsedWebhookEvent::class) {

        override fun serialize(
            value: ParsedWebhookEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.accountHolderCreated != null ->
                    generator.writeObject(value.accountHolderCreated)
                value.kybPayload != null -> generator.writeObject(value.kybPayload)
                value.kycPayload != null -> generator.writeObject(value.kycPayload)
                value.legacyPayload != null -> generator.writeObject(value.legacyPayload)
                value.accountHolderVerification != null ->
                    generator.writeObject(value.accountHolderVerification)
                value.accountHolderDocumentUpdated != null ->
                    generator.writeObject(value.accountHolderDocumentUpdated)
                value.cardAuthorizationApprovalRequest != null ->
                    generator.writeObject(value.cardAuthorizationApprovalRequest)
                value.tokenizationDecisioningRequest != null ->
                    generator.writeObject(value.tokenizationDecisioningRequest)
                value.authRulesBacktestReportCreated != null ->
                    generator.writeObject(value.authRulesBacktestReportCreated)
                value.balanceUpdated != null -> generator.writeObject(value.balanceUpdated)
                value.bookTransferTransactionCreated != null ->
                    generator.writeObject(value.bookTransferTransactionCreated)
                value.bookTransferTransactionUpdated != null ->
                    generator.writeObject(value.bookTransferTransactionUpdated)
                value.cardCreated != null -> generator.writeObject(value.cardCreated)
                value.cardConverted != null -> generator.writeObject(value.cardConverted)
                value.cardRenewed != null -> generator.writeObject(value.cardRenewed)
                value.cardReissued != null -> generator.writeObject(value.cardReissued)
                value.cardShipped != null -> generator.writeObject(value.cardShipped)
                value.cardUpdated != null -> generator.writeObject(value.cardUpdated)
                value.cardTransactionUpdated != null ->
                    generator.writeObject(value.cardTransactionUpdated)
                value.cardTransactionEnhancedDataCreated != null ->
                    generator.writeObject(value.cardTransactionEnhancedDataCreated)
                value.cardTransactionEnhancedDataUpdated != null ->
                    generator.writeObject(value.cardTransactionEnhancedDataUpdated)
                value.digitalWalletTokenizationApprovalRequest != null ->
                    generator.writeObject(value.digitalWalletTokenizationApprovalRequest)
                value.digitalWalletTokenizationResult != null ->
                    generator.writeObject(value.digitalWalletTokenizationResult)
                value.digitalWalletTokenizationTwoFactorAuthenticationCode != null ->
                    generator.writeObject(
                        value.digitalWalletTokenizationTwoFactorAuthenticationCode
                    )
                value.digitalWalletTokenizationTwoFactorAuthenticationCodeSent != null ->
                    generator.writeObject(
                        value.digitalWalletTokenizationTwoFactorAuthenticationCodeSent
                    )
                value.digitalWalletTokenizationUpdated != null ->
                    generator.writeObject(value.digitalWalletTokenizationUpdated)
                value.disputeUpdated != null -> generator.writeObject(value.disputeUpdated)
                value.disputeEvidenceUploadFailed != null ->
                    generator.writeObject(value.disputeEvidenceUploadFailed)
                value.externalBankAccountCreated != null ->
                    generator.writeObject(value.externalBankAccountCreated)
                value.externalBankAccountUpdated != null ->
                    generator.writeObject(value.externalBankAccountUpdated)
                value.externalPaymentCreated != null ->
                    generator.writeObject(value.externalPaymentCreated)
                value.externalPaymentUpdated != null ->
                    generator.writeObject(value.externalPaymentUpdated)
                value.financialAccountCreated != null ->
                    generator.writeObject(value.financialAccountCreated)
                value.financialAccountUpdated != null ->
                    generator.writeObject(value.financialAccountUpdated)
                value.fundingEventCreated != null ->
                    generator.writeObject(value.fundingEventCreated)
                value.loanTapeCreated != null -> generator.writeObject(value.loanTapeCreated)
                value.loanTapeUpdated != null -> generator.writeObject(value.loanTapeUpdated)
                value.managementOperationCreated != null ->
                    generator.writeObject(value.managementOperationCreated)
                value.managementOperationUpdated != null ->
                    generator.writeObject(value.managementOperationUpdated)
                value.internalTransactionCreated != null ->
                    generator.writeObject(value.internalTransactionCreated)
                value.internalTransactionUpdated != null ->
                    generator.writeObject(value.internalTransactionUpdated)
                value.networkTotalCreated != null ->
                    generator.writeObject(value.networkTotalCreated)
                value.networkTotalUpdated != null ->
                    generator.writeObject(value.networkTotalUpdated)
                value.paymentTransactionCreated != null ->
                    generator.writeObject(value.paymentTransactionCreated)
                value.paymentTransactionUpdated != null ->
                    generator.writeObject(value.paymentTransactionUpdated)
                value.settlementReportUpdated != null ->
                    generator.writeObject(value.settlementReportUpdated)
                value.statementsCreated != null -> generator.writeObject(value.statementsCreated)
                value.threeDSAuthenticationCreated != null ->
                    generator.writeObject(value.threeDSAuthenticationCreated)
                value.threeDSAuthenticationUpdated != null ->
                    generator.writeObject(value.threeDSAuthenticationUpdated)
                value.threeDSAuthenticationChallenge != null ->
                    generator.writeObject(value.threeDSAuthenticationChallenge)
                value.tokenizationApprovalRequest != null ->
                    generator.writeObject(value.tokenizationApprovalRequest)
                value.tokenizationResult != null -> generator.writeObject(value.tokenizationResult)
                value.tokenizationTwoFactorAuthenticationCode != null ->
                    generator.writeObject(value.tokenizationTwoFactorAuthenticationCode)
                value.tokenizationTwoFactorAuthenticationCodeSent != null ->
                    generator.writeObject(value.tokenizationTwoFactorAuthenticationCodeSent)
                value.tokenizationUpdated != null ->
                    generator.writeObject(value.tokenizationUpdated)
                value.threeDSAuthenticationApprovalRequest != null ->
                    generator.writeObject(value.threeDSAuthenticationApprovalRequest)
                value.disputeTransactionCreated != null ->
                    generator.writeObject(value.disputeTransactionCreated)
                value.disputeTransactionUpdated != null ->
                    generator.writeObject(value.disputeTransactionUpdated)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ParsedWebhookEvent")
            }
        }
    }

    /** KYB payload for an updated account holder. */
    class KybPayload
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val updateRequest: JsonField<UpdateRequest>,
        private val eventType: JsonField<EventType>,
        private val externalId: JsonField<String>,
        private val naicsCode: JsonField<String>,
        private val natureOfBusiness: JsonField<String>,
        private val websiteUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("update_request")
            @ExcludeMissing
            updateRequest: JsonField<UpdateRequest> = JsonMissing.of(),
            @JsonProperty("event_type")
            @ExcludeMissing
            eventType: JsonField<EventType> = JsonMissing.of(),
            @JsonProperty("external_id")
            @ExcludeMissing
            externalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("naics_code")
            @ExcludeMissing
            naicsCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nature_of_business")
            @ExcludeMissing
            natureOfBusiness: JsonField<String> = JsonMissing.of(),
            @JsonProperty("website_url")
            @ExcludeMissing
            websiteUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            token,
            updateRequest,
            eventType,
            externalId,
            naicsCode,
            natureOfBusiness,
            websiteUrl,
            mutableMapOf(),
        )

        /**
         * The token of the account_holder that was created.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * Original request to update the account holder.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updateRequest(): UpdateRequest = updateRequest.getRequired("update_request")

        /**
         * The type of event that occurred.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

        /**
         * A user provided id that can be used to link an account holder with an external system
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalId(): Optional<String> = externalId.getOptional("external_id")

        /**
         * 6-digit North American Industry Classification System (NAICS) code for the business. Only
         * present if naics_code was included in the update request.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun naicsCode(): Optional<String> = naicsCode.getOptional("naics_code")

        /**
         * Short description of the company's line of business (i.e., what does the company do?).
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun natureOfBusiness(): Optional<String> =
            natureOfBusiness.getOptional("nature_of_business")

        /**
         * Company website URL.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun websiteUrl(): Optional<String> = websiteUrl.getOptional("website_url")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [updateRequest].
         *
         * Unlike [updateRequest], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("update_request")
        @ExcludeMissing
        fun _updateRequest(): JsonField<UpdateRequest> = updateRequest

        /**
         * Returns the raw JSON value of [eventType].
         *
         * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_type")
        @ExcludeMissing
        fun _eventType(): JsonField<EventType> = eventType

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Returns the raw JSON value of [naicsCode].
         *
         * Unlike [naicsCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("naics_code") @ExcludeMissing fun _naicsCode(): JsonField<String> = naicsCode

        /**
         * Returns the raw JSON value of [natureOfBusiness].
         *
         * Unlike [natureOfBusiness], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("nature_of_business")
        @ExcludeMissing
        fun _natureOfBusiness(): JsonField<String> = natureOfBusiness

        /**
         * Returns the raw JSON value of [websiteUrl].
         *
         * Unlike [websiteUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("website_url")
        @ExcludeMissing
        fun _websiteUrl(): JsonField<String> = websiteUrl

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [KybPayload].
             *
             * The following fields are required:
             * ```java
             * .token()
             * .updateRequest()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [KybPayload]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var updateRequest: JsonField<UpdateRequest>? = null
            private var eventType: JsonField<EventType> = JsonMissing.of()
            private var externalId: JsonField<String> = JsonMissing.of()
            private var naicsCode: JsonField<String> = JsonMissing.of()
            private var natureOfBusiness: JsonField<String> = JsonMissing.of()
            private var websiteUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(kybPayload: KybPayload) = apply {
                token = kybPayload.token
                updateRequest = kybPayload.updateRequest
                eventType = kybPayload.eventType
                externalId = kybPayload.externalId
                naicsCode = kybPayload.naicsCode
                natureOfBusiness = kybPayload.natureOfBusiness
                websiteUrl = kybPayload.websiteUrl
                additionalProperties = kybPayload.additionalProperties.toMutableMap()
            }

            /** The token of the account_holder that was created. */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Original request to update the account holder. */
            fun updateRequest(updateRequest: UpdateRequest) =
                updateRequest(JsonField.of(updateRequest))

            /**
             * Sets [Builder.updateRequest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updateRequest] with a well-typed [UpdateRequest]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun updateRequest(updateRequest: JsonField<UpdateRequest>) = apply {
                this.updateRequest = updateRequest
            }

            /** The type of event that occurred. */
            fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed [EventType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

            /**
             * A user provided id that can be used to link an account holder with an external system
             */
            fun externalId(externalId: String) = externalId(JsonField.of(externalId))

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            /**
             * 6-digit North American Industry Classification System (NAICS) code for the business.
             * Only present if naics_code was included in the update request.
             */
            fun naicsCode(naicsCode: String) = naicsCode(JsonField.of(naicsCode))

            /**
             * Sets [Builder.naicsCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.naicsCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun naicsCode(naicsCode: JsonField<String>) = apply { this.naicsCode = naicsCode }

            /**
             * Short description of the company's line of business (i.e., what does the company
             * do?).
             */
            fun natureOfBusiness(natureOfBusiness: String) =
                natureOfBusiness(JsonField.of(natureOfBusiness))

            /**
             * Sets [Builder.natureOfBusiness] to an arbitrary JSON value.
             *
             * You should usually call [Builder.natureOfBusiness] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun natureOfBusiness(natureOfBusiness: JsonField<String>) = apply {
                this.natureOfBusiness = natureOfBusiness
            }

            /** Company website URL. */
            fun websiteUrl(websiteUrl: String) = websiteUrl(JsonField.of(websiteUrl))

            /**
             * Sets [Builder.websiteUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.websiteUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun websiteUrl(websiteUrl: JsonField<String>) = apply { this.websiteUrl = websiteUrl }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [KybPayload].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .token()
             * .updateRequest()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): KybPayload =
                KybPayload(
                    checkRequired("token", token),
                    checkRequired("updateRequest", updateRequest),
                    eventType,
                    externalId,
                    naicsCode,
                    natureOfBusiness,
                    websiteUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): KybPayload = apply {
            if (validated) {
                return@apply
            }

            token()
            updateRequest().validate()
            eventType().ifPresent { it.validate() }
            externalId()
            naicsCode()
            natureOfBusiness()
            websiteUrl()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (token.asKnown().isPresent) 1 else 0) +
                (updateRequest.asKnown().getOrNull()?.validity() ?: 0) +
                (eventType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (externalId.asKnown().isPresent) 1 else 0) +
                (if (naicsCode.asKnown().isPresent) 1 else 0) +
                (if (natureOfBusiness.asKnown().isPresent) 1 else 0) +
                (if (websiteUrl.asKnown().isPresent) 1 else 0)

        /** Original request to update the account holder. */
        class UpdateRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val beneficialOwnerEntities: JsonField<List<KybBusinessEntity>>,
            private val beneficialOwnerIndividuals: JsonField<List<Individual>>,
            private val businessEntity: JsonField<KybBusinessEntity>,
            private val controlPerson: JsonField<Individual>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("beneficial_owner_entities")
                @ExcludeMissing
                beneficialOwnerEntities: JsonField<List<KybBusinessEntity>> = JsonMissing.of(),
                @JsonProperty("beneficial_owner_individuals")
                @ExcludeMissing
                beneficialOwnerIndividuals: JsonField<List<Individual>> = JsonMissing.of(),
                @JsonProperty("business_entity")
                @ExcludeMissing
                businessEntity: JsonField<KybBusinessEntity> = JsonMissing.of(),
                @JsonProperty("control_person")
                @ExcludeMissing
                controlPerson: JsonField<Individual> = JsonMissing.of(),
            ) : this(
                beneficialOwnerEntities,
                beneficialOwnerIndividuals,
                businessEntity,
                controlPerson,
                mutableMapOf(),
            )

            /**
             * Deprecated.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            @Deprecated("deprecated")
            fun beneficialOwnerEntities(): Optional<List<KybBusinessEntity>> =
                beneficialOwnerEntities.getOptional("beneficial_owner_entities")

            /**
             * You must submit a list of all direct and indirect individuals with 25% or more
             * ownership in the company. A maximum of 4 beneficial owners can be submitted. If no
             * individual owns 25% of the company you do not need to send beneficial owner
             * information. See
             * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
             * (Section I) for more background on individuals that should be included.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun beneficialOwnerIndividuals(): Optional<List<Individual>> =
                beneficialOwnerIndividuals.getOptional("beneficial_owner_individuals")

            /**
             * Information for business for which the account is being opened and KYB is being run.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun businessEntity(): Optional<KybBusinessEntity> =
                businessEntity.getOptional("business_entity")

            /**
             * An individual with significant responsibility for managing the legal entity (e.g., a
             * Chief Executive Officer, Chief Financial Officer, Chief Operating Officer, Managing
             * Member, General Partner, President, Vice President, or Treasurer). This can be an
             * executive, or someone who will have program-wide access to the cards that Lithic will
             * provide. In some cases, this individual could also be a beneficial owner listed
             * above. See
             * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
             * (Section II) for more background.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun controlPerson(): Optional<Individual> = controlPerson.getOptional("control_person")

            /**
             * Returns the raw JSON value of [beneficialOwnerEntities].
             *
             * Unlike [beneficialOwnerEntities], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @Deprecated("deprecated")
            @JsonProperty("beneficial_owner_entities")
            @ExcludeMissing
            fun _beneficialOwnerEntities(): JsonField<List<KybBusinessEntity>> =
                beneficialOwnerEntities

            /**
             * Returns the raw JSON value of [beneficialOwnerIndividuals].
             *
             * Unlike [beneficialOwnerIndividuals], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("beneficial_owner_individuals")
            @ExcludeMissing
            fun _beneficialOwnerIndividuals(): JsonField<List<Individual>> =
                beneficialOwnerIndividuals

            /**
             * Returns the raw JSON value of [businessEntity].
             *
             * Unlike [businessEntity], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("business_entity")
            @ExcludeMissing
            fun _businessEntity(): JsonField<KybBusinessEntity> = businessEntity

            /**
             * Returns the raw JSON value of [controlPerson].
             *
             * Unlike [controlPerson], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("control_person")
            @ExcludeMissing
            fun _controlPerson(): JsonField<Individual> = controlPerson

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [UpdateRequest]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UpdateRequest]. */
            class Builder internal constructor() {

                private var beneficialOwnerEntities: JsonField<MutableList<KybBusinessEntity>>? =
                    null
                private var beneficialOwnerIndividuals: JsonField<MutableList<Individual>>? = null
                private var businessEntity: JsonField<KybBusinessEntity> = JsonMissing.of()
                private var controlPerson: JsonField<Individual> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(updateRequest: UpdateRequest) = apply {
                    beneficialOwnerEntities =
                        updateRequest.beneficialOwnerEntities.map { it.toMutableList() }
                    beneficialOwnerIndividuals =
                        updateRequest.beneficialOwnerIndividuals.map { it.toMutableList() }
                    businessEntity = updateRequest.businessEntity
                    controlPerson = updateRequest.controlPerson
                    additionalProperties = updateRequest.additionalProperties.toMutableMap()
                }

                /** Deprecated. */
                @Deprecated("deprecated")
                fun beneficialOwnerEntities(beneficialOwnerEntities: List<KybBusinessEntity>) =
                    beneficialOwnerEntities(JsonField.of(beneficialOwnerEntities))

                /**
                 * Sets [Builder.beneficialOwnerEntities] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.beneficialOwnerEntities] with a well-typed
                 * `List<KybBusinessEntity>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                @Deprecated("deprecated")
                fun beneficialOwnerEntities(
                    beneficialOwnerEntities: JsonField<List<KybBusinessEntity>>
                ) = apply {
                    this.beneficialOwnerEntities =
                        beneficialOwnerEntities.map { it.toMutableList() }
                }

                /**
                 * Adds a single [KybBusinessEntity] to [beneficialOwnerEntities].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                @Deprecated("deprecated")
                fun addBeneficialOwnerEntity(beneficialOwnerEntity: KybBusinessEntity) = apply {
                    beneficialOwnerEntities =
                        (beneficialOwnerEntities ?: JsonField.of(mutableListOf())).also {
                            checkKnown("beneficialOwnerEntities", it).add(beneficialOwnerEntity)
                        }
                }

                /**
                 * You must submit a list of all direct and indirect individuals with 25% or more
                 * ownership in the company. A maximum of 4 beneficial owners can be submitted. If
                 * no individual owns 25% of the company you do not need to send beneficial owner
                 * information. See
                 * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
                 * (Section I) for more background on individuals that should be included.
                 */
                fun beneficialOwnerIndividuals(beneficialOwnerIndividuals: List<Individual>) =
                    beneficialOwnerIndividuals(JsonField.of(beneficialOwnerIndividuals))

                /**
                 * Sets [Builder.beneficialOwnerIndividuals] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.beneficialOwnerIndividuals] with a well-typed
                 * `List<Individual>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun beneficialOwnerIndividuals(
                    beneficialOwnerIndividuals: JsonField<List<Individual>>
                ) = apply {
                    this.beneficialOwnerIndividuals =
                        beneficialOwnerIndividuals.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Individual] to [beneficialOwnerIndividuals].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addBeneficialOwnerIndividual(beneficialOwnerIndividual: Individual) = apply {
                    beneficialOwnerIndividuals =
                        (beneficialOwnerIndividuals ?: JsonField.of(mutableListOf())).also {
                            checkKnown("beneficialOwnerIndividuals", it)
                                .add(beneficialOwnerIndividual)
                        }
                }

                /**
                 * Information for business for which the account is being opened and KYB is being
                 * run.
                 */
                fun businessEntity(businessEntity: KybBusinessEntity) =
                    businessEntity(JsonField.of(businessEntity))

                /**
                 * Sets [Builder.businessEntity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.businessEntity] with a well-typed
                 * [KybBusinessEntity] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun businessEntity(businessEntity: JsonField<KybBusinessEntity>) = apply {
                    this.businessEntity = businessEntity
                }

                /**
                 * An individual with significant responsibility for managing the legal entity
                 * (e.g., a Chief Executive Officer, Chief Financial Officer, Chief Operating
                 * Officer, Managing Member, General Partner, President, Vice President, or
                 * Treasurer). This can be an executive, or someone who will have program-wide
                 * access to the cards that Lithic will provide. In some cases, this individual
                 * could also be a beneficial owner listed above. See
                 * [FinCEN requirements](https://www.fincen.gov/sites/default/files/shared/CDD_Rev6.7_Sept_2017_Certificate.pdf)
                 * (Section II) for more background.
                 */
                fun controlPerson(controlPerson: Individual) =
                    controlPerson(JsonField.of(controlPerson))

                /**
                 * Sets [Builder.controlPerson] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.controlPerson] with a well-typed [Individual]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun controlPerson(controlPerson: JsonField<Individual>) = apply {
                    this.controlPerson = controlPerson
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UpdateRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UpdateRequest =
                    UpdateRequest(
                        (beneficialOwnerEntities ?: JsonMissing.of()).map { it.toImmutable() },
                        (beneficialOwnerIndividuals ?: JsonMissing.of()).map { it.toImmutable() },
                        businessEntity,
                        controlPerson,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UpdateRequest = apply {
                if (validated) {
                    return@apply
                }

                beneficialOwnerEntities().ifPresent { it.forEach { it.validate() } }
                beneficialOwnerIndividuals().ifPresent { it.forEach { it.validate() } }
                businessEntity().ifPresent { it.validate() }
                controlPerson().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (beneficialOwnerEntities.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                    (beneficialOwnerIndividuals.asKnown().getOrNull()?.sumOf {
                        it.validity().toInt()
                    } ?: 0) +
                    (businessEntity.asKnown().getOrNull()?.validity() ?: 0) +
                    (controlPerson.asKnown().getOrNull()?.validity() ?: 0)

            class Individual
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val address: JsonField<Address>,
                private val dob: JsonField<String>,
                private val email: JsonField<String>,
                private val firstName: JsonField<String>,
                private val governmentId: JsonField<String>,
                private val lastName: JsonField<String>,
                private val phoneNumber: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                    @JsonProperty("dob") @ExcludeMissing dob: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("first_name")
                    @ExcludeMissing
                    firstName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("government_id")
                    @ExcludeMissing
                    governmentId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("last_name")
                    @ExcludeMissing
                    lastName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("phone_number")
                    @ExcludeMissing
                    phoneNumber: JsonField<String> = JsonMissing.of(),
                ) : this(
                    address,
                    dob,
                    email,
                    firstName,
                    governmentId,
                    lastName,
                    phoneNumber,
                    mutableMapOf(),
                )

                /**
                 * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
                 * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun address(): Optional<Address> = address.getOptional("address")

                /**
                 * Individual's date of birth, as an RFC 3339 date.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun dob(): Optional<String> = dob.getOptional("dob")

                /**
                 * Individual's email address. If utilizing Lithic for chargeback processing, this
                 * customer email address may be used to communicate dispute status and resolution.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun email(): Optional<String> = email.getOptional("email")

                /**
                 * Individual's first name, as it appears on government-issued identity documents.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun firstName(): Optional<String> = firstName.getOptional("first_name")

                /**
                 * Government-issued identification number (required for identity verification and
                 * compliance with banking regulations). Social Security Numbers (SSN) and
                 * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
                 * entered as full nine-digits, with or without hyphens
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun governmentId(): Optional<String> = governmentId.getOptional("government_id")

                /**
                 * Individual's last name, as it appears on government-issued identity documents.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun lastName(): Optional<String> = lastName.getOptional("last_name")

                /**
                 * Individual's phone number, entered in E.164 format.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

                /**
                 * Returns the raw JSON value of [dob].
                 *
                 * Unlike [dob], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<String> = dob

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                /**
                 * Returns the raw JSON value of [firstName].
                 *
                 * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("first_name")
                @ExcludeMissing
                fun _firstName(): JsonField<String> = firstName

                /**
                 * Returns the raw JSON value of [governmentId].
                 *
                 * Unlike [governmentId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("government_id")
                @ExcludeMissing
                fun _governmentId(): JsonField<String> = governmentId

                /**
                 * Returns the raw JSON value of [lastName].
                 *
                 * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("last_name")
                @ExcludeMissing
                fun _lastName(): JsonField<String> = lastName

                /**
                 * Returns the raw JSON value of [phoneNumber].
                 *
                 * Unlike [phoneNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("phone_number")
                @ExcludeMissing
                fun _phoneNumber(): JsonField<String> = phoneNumber

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Individual]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var address: JsonField<Address> = JsonMissing.of()
                    private var dob: JsonField<String> = JsonMissing.of()
                    private var email: JsonField<String> = JsonMissing.of()
                    private var firstName: JsonField<String> = JsonMissing.of()
                    private var governmentId: JsonField<String> = JsonMissing.of()
                    private var lastName: JsonField<String> = JsonMissing.of()
                    private var phoneNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(individual: Individual) = apply {
                        address = individual.address
                        dob = individual.dob
                        email = individual.email
                        firstName = individual.firstName
                        governmentId = individual.governmentId
                        lastName = individual.lastName
                        phoneNumber = individual.phoneNumber
                        additionalProperties = individual.additionalProperties.toMutableMap()
                    }

                    /**
                     * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
                     * acceptable; APO/FPO are acceptable. Only USA addresses are currently
                     * supported.
                     */
                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** Individual's date of birth, as an RFC 3339 date. */
                    fun dob(dob: String) = dob(JsonField.of(dob))

                    /**
                     * Sets [Builder.dob] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dob] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun dob(dob: JsonField<String>) = apply { this.dob = dob }

                    /**
                     * Individual's email address. If utilizing Lithic for chargeback processing,
                     * this customer email address may be used to communicate dispute status and
                     * resolution.
                     */
                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    /**
                     * Individual's first name, as it appears on government-issued identity
                     * documents.
                     */
                    fun firstName(firstName: String) = firstName(JsonField.of(firstName))

                    /**
                     * Sets [Builder.firstName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.firstName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun firstName(firstName: JsonField<String>) = apply {
                        this.firstName = firstName
                    }

                    /**
                     * Government-issued identification number (required for identity verification
                     * and compliance with banking regulations). Social Security Numbers (SSN) and
                     * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
                     * entered as full nine-digits, with or without hyphens
                     */
                    fun governmentId(governmentId: String) =
                        governmentId(JsonField.of(governmentId))

                    /**
                     * Sets [Builder.governmentId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.governmentId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun governmentId(governmentId: JsonField<String>) = apply {
                        this.governmentId = governmentId
                    }

                    /**
                     * Individual's last name, as it appears on government-issued identity
                     * documents.
                     */
                    fun lastName(lastName: String) = lastName(JsonField.of(lastName))

                    /**
                     * Sets [Builder.lastName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lastName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

                    /** Individual's phone number, entered in E.164 format. */
                    fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                    /**
                     * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phoneNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                        this.phoneNumber = phoneNumber
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Individual =
                        Individual(
                            address,
                            dob,
                            email,
                            firstName,
                            governmentId,
                            lastName,
                            phoneNumber,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Individual = apply {
                    if (validated) {
                        return@apply
                    }

                    address().ifPresent { it.validate() }
                    dob()
                    email()
                    firstName()
                    governmentId()
                    lastName()
                    phoneNumber()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (address.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (dob.asKnown().isPresent) 1 else 0) +
                        (if (email.asKnown().isPresent) 1 else 0) +
                        (if (firstName.asKnown().isPresent) 1 else 0) +
                        (if (governmentId.asKnown().isPresent) 1 else 0) +
                        (if (lastName.asKnown().isPresent) 1 else 0) +
                        (if (phoneNumber.asKnown().isPresent) 1 else 0)

                /**
                 * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
                 * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
                 */
                class Address
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val address1: JsonField<String>,
                    private val city: JsonField<String>,
                    private val country: JsonField<String>,
                    private val postalCode: JsonField<String>,
                    private val state: JsonField<String>,
                    private val address2: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("address1")
                        @ExcludeMissing
                        address1: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("city")
                        @ExcludeMissing
                        city: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("country")
                        @ExcludeMissing
                        country: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("postal_code")
                        @ExcludeMissing
                        postalCode: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("state")
                        @ExcludeMissing
                        state: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("address2")
                        @ExcludeMissing
                        address2: JsonField<String> = JsonMissing.of(),
                    ) : this(address1, city, country, postalCode, state, address2, mutableMapOf())

                    /**
                     * Valid deliverable address (no PO boxes).
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun address1(): String = address1.getRequired("address1")

                    /**
                     * Name of city.
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun city(): String = city.getRequired("city")

                    /**
                     * Valid country code. Only USA is currently supported, entered in uppercase ISO
                     * 3166-1 alpha-3 three-character format.
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun country(): String = country.getRequired("country")

                    /**
                     * Valid postal code. Only USA ZIP codes are currently supported, entered as a
                     * five-digit ZIP or nine-digit ZIP+4.
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun postalCode(): String = postalCode.getRequired("postal_code")

                    /**
                     * Valid state code. Only USA state codes are currently supported, entered in
                     * uppercase ISO 3166-2 two-character format.
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun state(): String = state.getRequired("state")

                    /**
                     * Unit or apartment number (if applicable).
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun address2(): Optional<String> = address2.getOptional("address2")

                    /**
                     * Returns the raw JSON value of [address1].
                     *
                     * Unlike [address1], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("address1")
                    @ExcludeMissing
                    fun _address1(): JsonField<String> = address1

                    /**
                     * Returns the raw JSON value of [city].
                     *
                     * Unlike [city], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                    /**
                     * Returns the raw JSON value of [country].
                     *
                     * Unlike [country], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("country")
                    @ExcludeMissing
                    fun _country(): JsonField<String> = country

                    /**
                     * Returns the raw JSON value of [postalCode].
                     *
                     * Unlike [postalCode], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("postal_code")
                    @ExcludeMissing
                    fun _postalCode(): JsonField<String> = postalCode

                    /**
                     * Returns the raw JSON value of [state].
                     *
                     * Unlike [state], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                    /**
                     * Returns the raw JSON value of [address2].
                     *
                     * Unlike [address2], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("address2")
                    @ExcludeMissing
                    fun _address2(): JsonField<String> = address2

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Address].
                         *
                         * The following fields are required:
                         * ```java
                         * .address1()
                         * .city()
                         * .country()
                         * .postalCode()
                         * .state()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Address]. */
                    class Builder internal constructor() {

                        private var address1: JsonField<String>? = null
                        private var city: JsonField<String>? = null
                        private var country: JsonField<String>? = null
                        private var postalCode: JsonField<String>? = null
                        private var state: JsonField<String>? = null
                        private var address2: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(address: Address) = apply {
                            address1 = address.address1
                            city = address.city
                            country = address.country
                            postalCode = address.postalCode
                            state = address.state
                            address2 = address.address2
                            additionalProperties = address.additionalProperties.toMutableMap()
                        }

                        /** Valid deliverable address (no PO boxes). */
                        fun address1(address1: String) = address1(JsonField.of(address1))

                        /**
                         * Sets [Builder.address1] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.address1] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun address1(address1: JsonField<String>) = apply {
                            this.address1 = address1
                        }

                        /** Name of city. */
                        fun city(city: String) = city(JsonField.of(city))

                        /**
                         * Sets [Builder.city] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.city] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun city(city: JsonField<String>) = apply { this.city = city }

                        /**
                         * Valid country code. Only USA is currently supported, entered in uppercase
                         * ISO 3166-1 alpha-3 three-character format.
                         */
                        fun country(country: String) = country(JsonField.of(country))

                        /**
                         * Sets [Builder.country] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.country] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun country(country: JsonField<String>) = apply { this.country = country }

                        /**
                         * Valid postal code. Only USA ZIP codes are currently supported, entered as
                         * a five-digit ZIP or nine-digit ZIP+4.
                         */
                        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                        /**
                         * Sets [Builder.postalCode] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.postalCode] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun postalCode(postalCode: JsonField<String>) = apply {
                            this.postalCode = postalCode
                        }

                        /**
                         * Valid state code. Only USA state codes are currently supported, entered
                         * in uppercase ISO 3166-2 two-character format.
                         */
                        fun state(state: String) = state(JsonField.of(state))

                        /**
                         * Sets [Builder.state] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.state] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun state(state: JsonField<String>) = apply { this.state = state }

                        /** Unit or apartment number (if applicable). */
                        fun address2(address2: String) = address2(JsonField.of(address2))

                        /**
                         * Sets [Builder.address2] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.address2] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun address2(address2: JsonField<String>) = apply {
                            this.address2 = address2
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Address].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .address1()
                         * .city()
                         * .country()
                         * .postalCode()
                         * .state()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Address =
                            Address(
                                checkRequired("address1", address1),
                                checkRequired("city", city),
                                checkRequired("country", country),
                                checkRequired("postalCode", postalCode),
                                checkRequired("state", state),
                                address2,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Address = apply {
                        if (validated) {
                            return@apply
                        }

                        address1()
                        city()
                        country()
                        postalCode()
                        state()
                        address2()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LithicInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (address1.asKnown().isPresent) 1 else 0) +
                            (if (city.asKnown().isPresent) 1 else 0) +
                            (if (country.asKnown().isPresent) 1 else 0) +
                            (if (postalCode.asKnown().isPresent) 1 else 0) +
                            (if (state.asKnown().isPresent) 1 else 0) +
                            (if (address2.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Address &&
                            address1 == other.address1 &&
                            city == other.city &&
                            country == other.country &&
                            postalCode == other.postalCode &&
                            state == other.state &&
                            address2 == other.address2 &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            address1,
                            city,
                            country,
                            postalCode,
                            state,
                            address2,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Address{address1=$address1, city=$city, country=$country, postalCode=$postalCode, state=$state, address2=$address2, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        address == other.address &&
                        dob == other.dob &&
                        email == other.email &&
                        firstName == other.firstName &&
                        governmentId == other.governmentId &&
                        lastName == other.lastName &&
                        phoneNumber == other.phoneNumber &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        address,
                        dob,
                        email,
                        firstName,
                        governmentId,
                        lastName,
                        phoneNumber,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{address=$address, dob=$dob, email=$email, firstName=$firstName, governmentId=$governmentId, lastName=$lastName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UpdateRequest &&
                    beneficialOwnerEntities == other.beneficialOwnerEntities &&
                    beneficialOwnerIndividuals == other.beneficialOwnerIndividuals &&
                    businessEntity == other.businessEntity &&
                    controlPerson == other.controlPerson &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    beneficialOwnerEntities,
                    beneficialOwnerIndividuals,
                    businessEntity,
                    controlPerson,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UpdateRequest{beneficialOwnerEntities=$beneficialOwnerEntities, beneficialOwnerIndividuals=$beneficialOwnerIndividuals, businessEntity=$businessEntity, controlPerson=$controlPerson, additionalProperties=$additionalProperties}"
        }

        /** The type of event that occurred. */
        class EventType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ACCOUNT_HOLDER_UPDATED = of("account_holder.updated")

                @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
            }

            /** An enum containing [EventType]'s known values. */
            enum class Known {
                ACCOUNT_HOLDER_UPDATED
            }

            /**
             * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EventType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACCOUNT_HOLDER_UPDATED,
                /**
                 * An enum member indicating that [EventType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACCOUNT_HOLDER_UPDATED -> Value.ACCOUNT_HOLDER_UPDATED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACCOUNT_HOLDER_UPDATED -> Known.ACCOUNT_HOLDER_UPDATED
                    else -> throw LithicInvalidDataException("Unknown EventType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): EventType = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EventType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is KybPayload &&
                token == other.token &&
                updateRequest == other.updateRequest &&
                eventType == other.eventType &&
                externalId == other.externalId &&
                naicsCode == other.naicsCode &&
                natureOfBusiness == other.natureOfBusiness &&
                websiteUrl == other.websiteUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                token,
                updateRequest,
                eventType,
                externalId,
                naicsCode,
                natureOfBusiness,
                websiteUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "KybPayload{token=$token, updateRequest=$updateRequest, eventType=$eventType, externalId=$externalId, naicsCode=$naicsCode, natureOfBusiness=$natureOfBusiness, websiteUrl=$websiteUrl, additionalProperties=$additionalProperties}"
    }

    /** KYC payload for an updated account holder. */
    class KycPayload
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val updateRequest: JsonField<UpdateRequest>,
        private val eventType: JsonField<EventType>,
        private val externalId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("update_request")
            @ExcludeMissing
            updateRequest: JsonField<UpdateRequest> = JsonMissing.of(),
            @JsonProperty("event_type")
            @ExcludeMissing
            eventType: JsonField<EventType> = JsonMissing.of(),
            @JsonProperty("external_id")
            @ExcludeMissing
            externalId: JsonField<String> = JsonMissing.of(),
        ) : this(token, updateRequest, eventType, externalId, mutableMapOf())

        /**
         * The token of the account_holder that was created.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * Original request to update the account holder.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updateRequest(): UpdateRequest = updateRequest.getRequired("update_request")

        /**
         * The type of event that occurred.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

        /**
         * A user provided id that can be used to link an account holder with an external system
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalId(): Optional<String> = externalId.getOptional("external_id")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [updateRequest].
         *
         * Unlike [updateRequest], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("update_request")
        @ExcludeMissing
        fun _updateRequest(): JsonField<UpdateRequest> = updateRequest

        /**
         * Returns the raw JSON value of [eventType].
         *
         * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_type")
        @ExcludeMissing
        fun _eventType(): JsonField<EventType> = eventType

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [KycPayload].
             *
             * The following fields are required:
             * ```java
             * .token()
             * .updateRequest()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [KycPayload]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var updateRequest: JsonField<UpdateRequest>? = null
            private var eventType: JsonField<EventType> = JsonMissing.of()
            private var externalId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(kycPayload: KycPayload) = apply {
                token = kycPayload.token
                updateRequest = kycPayload.updateRequest
                eventType = kycPayload.eventType
                externalId = kycPayload.externalId
                additionalProperties = kycPayload.additionalProperties.toMutableMap()
            }

            /** The token of the account_holder that was created. */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Original request to update the account holder. */
            fun updateRequest(updateRequest: UpdateRequest) =
                updateRequest(JsonField.of(updateRequest))

            /**
             * Sets [Builder.updateRequest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updateRequest] with a well-typed [UpdateRequest]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun updateRequest(updateRequest: JsonField<UpdateRequest>) = apply {
                this.updateRequest = updateRequest
            }

            /** The type of event that occurred. */
            fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed [EventType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

            /**
             * A user provided id that can be used to link an account holder with an external system
             */
            fun externalId(externalId: String) = externalId(JsonField.of(externalId))

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [KycPayload].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .token()
             * .updateRequest()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): KycPayload =
                KycPayload(
                    checkRequired("token", token),
                    checkRequired("updateRequest", updateRequest),
                    eventType,
                    externalId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): KycPayload = apply {
            if (validated) {
                return@apply
            }

            token()
            updateRequest().validate()
            eventType().ifPresent { it.validate() }
            externalId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (token.asKnown().isPresent) 1 else 0) +
                (updateRequest.asKnown().getOrNull()?.validity() ?: 0) +
                (eventType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (externalId.asKnown().isPresent) 1 else 0)

        /** Original request to update the account holder. */
        class UpdateRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val individual: JsonField<Individual>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("individual")
                @ExcludeMissing
                individual: JsonField<Individual> = JsonMissing.of()
            ) : this(individual, mutableMapOf())

            /**
             * Information on the individual for whom the account is being opened and KYC is being
             * run.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun individual(): Optional<Individual> = individual.getOptional("individual")

            /**
             * Returns the raw JSON value of [individual].
             *
             * Unlike [individual], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("individual")
            @ExcludeMissing
            fun _individual(): JsonField<Individual> = individual

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [UpdateRequest]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UpdateRequest]. */
            class Builder internal constructor() {

                private var individual: JsonField<Individual> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(updateRequest: UpdateRequest) = apply {
                    individual = updateRequest.individual
                    additionalProperties = updateRequest.additionalProperties.toMutableMap()
                }

                /**
                 * Information on the individual for whom the account is being opened and KYC is
                 * being run.
                 */
                fun individual(individual: Individual) = individual(JsonField.of(individual))

                /**
                 * Sets [Builder.individual] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.individual] with a well-typed [Individual] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun individual(individual: JsonField<Individual>) = apply {
                    this.individual = individual
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UpdateRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UpdateRequest =
                    UpdateRequest(individual, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): UpdateRequest = apply {
                if (validated) {
                    return@apply
                }

                individual().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int = (individual.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * Information on the individual for whom the account is being opened and KYC is being
             * run.
             */
            class Individual
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val address: JsonField<Address>,
                private val dob: JsonField<String>,
                private val email: JsonField<String>,
                private val firstName: JsonField<String>,
                private val governmentId: JsonField<String>,
                private val lastName: JsonField<String>,
                private val phoneNumber: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                    @JsonProperty("dob") @ExcludeMissing dob: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("first_name")
                    @ExcludeMissing
                    firstName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("government_id")
                    @ExcludeMissing
                    governmentId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("last_name")
                    @ExcludeMissing
                    lastName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("phone_number")
                    @ExcludeMissing
                    phoneNumber: JsonField<String> = JsonMissing.of(),
                ) : this(
                    address,
                    dob,
                    email,
                    firstName,
                    governmentId,
                    lastName,
                    phoneNumber,
                    mutableMapOf(),
                )

                /**
                 * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
                 * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun address(): Optional<Address> = address.getOptional("address")

                /**
                 * Individual's date of birth, as an RFC 3339 date.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun dob(): Optional<String> = dob.getOptional("dob")

                /**
                 * Individual's email address. If utilizing Lithic for chargeback processing, this
                 * customer email address may be used to communicate dispute status and resolution.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun email(): Optional<String> = email.getOptional("email")

                /**
                 * Individual's first name, as it appears on government-issued identity documents.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun firstName(): Optional<String> = firstName.getOptional("first_name")

                /**
                 * Government-issued identification number (required for identity verification and
                 * compliance with banking regulations). Social Security Numbers (SSN) and
                 * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
                 * entered as full nine-digits, with or without hyphens
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun governmentId(): Optional<String> = governmentId.getOptional("government_id")

                /**
                 * Individual's last name, as it appears on government-issued identity documents.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun lastName(): Optional<String> = lastName.getOptional("last_name")

                /**
                 * Individual's phone number, entered in E.164 format.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

                /**
                 * Returns the raw JSON value of [dob].
                 *
                 * Unlike [dob], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<String> = dob

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                /**
                 * Returns the raw JSON value of [firstName].
                 *
                 * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("first_name")
                @ExcludeMissing
                fun _firstName(): JsonField<String> = firstName

                /**
                 * Returns the raw JSON value of [governmentId].
                 *
                 * Unlike [governmentId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("government_id")
                @ExcludeMissing
                fun _governmentId(): JsonField<String> = governmentId

                /**
                 * Returns the raw JSON value of [lastName].
                 *
                 * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("last_name")
                @ExcludeMissing
                fun _lastName(): JsonField<String> = lastName

                /**
                 * Returns the raw JSON value of [phoneNumber].
                 *
                 * Unlike [phoneNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("phone_number")
                @ExcludeMissing
                fun _phoneNumber(): JsonField<String> = phoneNumber

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Individual]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var address: JsonField<Address> = JsonMissing.of()
                    private var dob: JsonField<String> = JsonMissing.of()
                    private var email: JsonField<String> = JsonMissing.of()
                    private var firstName: JsonField<String> = JsonMissing.of()
                    private var governmentId: JsonField<String> = JsonMissing.of()
                    private var lastName: JsonField<String> = JsonMissing.of()
                    private var phoneNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(individual: Individual) = apply {
                        address = individual.address
                        dob = individual.dob
                        email = individual.email
                        firstName = individual.firstName
                        governmentId = individual.governmentId
                        lastName = individual.lastName
                        phoneNumber = individual.phoneNumber
                        additionalProperties = individual.additionalProperties.toMutableMap()
                    }

                    /**
                     * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
                     * acceptable; APO/FPO are acceptable. Only USA addresses are currently
                     * supported.
                     */
                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** Individual's date of birth, as an RFC 3339 date. */
                    fun dob(dob: String) = dob(JsonField.of(dob))

                    /**
                     * Sets [Builder.dob] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dob] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun dob(dob: JsonField<String>) = apply { this.dob = dob }

                    /**
                     * Individual's email address. If utilizing Lithic for chargeback processing,
                     * this customer email address may be used to communicate dispute status and
                     * resolution.
                     */
                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    /**
                     * Individual's first name, as it appears on government-issued identity
                     * documents.
                     */
                    fun firstName(firstName: String) = firstName(JsonField.of(firstName))

                    /**
                     * Sets [Builder.firstName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.firstName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun firstName(firstName: JsonField<String>) = apply {
                        this.firstName = firstName
                    }

                    /**
                     * Government-issued identification number (required for identity verification
                     * and compliance with banking regulations). Social Security Numbers (SSN) and
                     * Individual Taxpayer Identification Numbers (ITIN) are currently supported,
                     * entered as full nine-digits, with or without hyphens
                     */
                    fun governmentId(governmentId: String) =
                        governmentId(JsonField.of(governmentId))

                    /**
                     * Sets [Builder.governmentId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.governmentId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun governmentId(governmentId: JsonField<String>) = apply {
                        this.governmentId = governmentId
                    }

                    /**
                     * Individual's last name, as it appears on government-issued identity
                     * documents.
                     */
                    fun lastName(lastName: String) = lastName(JsonField.of(lastName))

                    /**
                     * Sets [Builder.lastName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lastName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

                    /** Individual's phone number, entered in E.164 format. */
                    fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                    /**
                     * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phoneNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                        this.phoneNumber = phoneNumber
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Individual =
                        Individual(
                            address,
                            dob,
                            email,
                            firstName,
                            governmentId,
                            lastName,
                            phoneNumber,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Individual = apply {
                    if (validated) {
                        return@apply
                    }

                    address().ifPresent { it.validate() }
                    dob()
                    email()
                    firstName()
                    governmentId()
                    lastName()
                    phoneNumber()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (address.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (dob.asKnown().isPresent) 1 else 0) +
                        (if (email.asKnown().isPresent) 1 else 0) +
                        (if (firstName.asKnown().isPresent) 1 else 0) +
                        (if (governmentId.asKnown().isPresent) 1 else 0) +
                        (if (lastName.asKnown().isPresent) 1 else 0) +
                        (if (phoneNumber.asKnown().isPresent) 1 else 0)

                /**
                 * Individual's current address - PO boxes, UPS drops, and FedEx drops are not
                 * acceptable; APO/FPO are acceptable. Only USA addresses are currently supported.
                 */
                class Address
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val address1: JsonField<String>,
                    private val city: JsonField<String>,
                    private val country: JsonField<String>,
                    private val postalCode: JsonField<String>,
                    private val state: JsonField<String>,
                    private val address2: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("address1")
                        @ExcludeMissing
                        address1: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("city")
                        @ExcludeMissing
                        city: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("country")
                        @ExcludeMissing
                        country: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("postal_code")
                        @ExcludeMissing
                        postalCode: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("state")
                        @ExcludeMissing
                        state: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("address2")
                        @ExcludeMissing
                        address2: JsonField<String> = JsonMissing.of(),
                    ) : this(address1, city, country, postalCode, state, address2, mutableMapOf())

                    /**
                     * Valid deliverable address (no PO boxes).
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun address1(): String = address1.getRequired("address1")

                    /**
                     * Name of city.
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun city(): String = city.getRequired("city")

                    /**
                     * Valid country code. Only USA is currently supported, entered in uppercase ISO
                     * 3166-1 alpha-3 three-character format.
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun country(): String = country.getRequired("country")

                    /**
                     * Valid postal code. Only USA ZIP codes are currently supported, entered as a
                     * five-digit ZIP or nine-digit ZIP+4.
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun postalCode(): String = postalCode.getRequired("postal_code")

                    /**
                     * Valid state code. Only USA state codes are currently supported, entered in
                     * uppercase ISO 3166-2 two-character format.
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun state(): String = state.getRequired("state")

                    /**
                     * Unit or apartment number (if applicable).
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun address2(): Optional<String> = address2.getOptional("address2")

                    /**
                     * Returns the raw JSON value of [address1].
                     *
                     * Unlike [address1], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("address1")
                    @ExcludeMissing
                    fun _address1(): JsonField<String> = address1

                    /**
                     * Returns the raw JSON value of [city].
                     *
                     * Unlike [city], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                    /**
                     * Returns the raw JSON value of [country].
                     *
                     * Unlike [country], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("country")
                    @ExcludeMissing
                    fun _country(): JsonField<String> = country

                    /**
                     * Returns the raw JSON value of [postalCode].
                     *
                     * Unlike [postalCode], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("postal_code")
                    @ExcludeMissing
                    fun _postalCode(): JsonField<String> = postalCode

                    /**
                     * Returns the raw JSON value of [state].
                     *
                     * Unlike [state], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                    /**
                     * Returns the raw JSON value of [address2].
                     *
                     * Unlike [address2], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("address2")
                    @ExcludeMissing
                    fun _address2(): JsonField<String> = address2

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Address].
                         *
                         * The following fields are required:
                         * ```java
                         * .address1()
                         * .city()
                         * .country()
                         * .postalCode()
                         * .state()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Address]. */
                    class Builder internal constructor() {

                        private var address1: JsonField<String>? = null
                        private var city: JsonField<String>? = null
                        private var country: JsonField<String>? = null
                        private var postalCode: JsonField<String>? = null
                        private var state: JsonField<String>? = null
                        private var address2: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(address: Address) = apply {
                            address1 = address.address1
                            city = address.city
                            country = address.country
                            postalCode = address.postalCode
                            state = address.state
                            address2 = address.address2
                            additionalProperties = address.additionalProperties.toMutableMap()
                        }

                        /** Valid deliverable address (no PO boxes). */
                        fun address1(address1: String) = address1(JsonField.of(address1))

                        /**
                         * Sets [Builder.address1] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.address1] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun address1(address1: JsonField<String>) = apply {
                            this.address1 = address1
                        }

                        /** Name of city. */
                        fun city(city: String) = city(JsonField.of(city))

                        /**
                         * Sets [Builder.city] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.city] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun city(city: JsonField<String>) = apply { this.city = city }

                        /**
                         * Valid country code. Only USA is currently supported, entered in uppercase
                         * ISO 3166-1 alpha-3 three-character format.
                         */
                        fun country(country: String) = country(JsonField.of(country))

                        /**
                         * Sets [Builder.country] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.country] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun country(country: JsonField<String>) = apply { this.country = country }

                        /**
                         * Valid postal code. Only USA ZIP codes are currently supported, entered as
                         * a five-digit ZIP or nine-digit ZIP+4.
                         */
                        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                        /**
                         * Sets [Builder.postalCode] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.postalCode] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun postalCode(postalCode: JsonField<String>) = apply {
                            this.postalCode = postalCode
                        }

                        /**
                         * Valid state code. Only USA state codes are currently supported, entered
                         * in uppercase ISO 3166-2 two-character format.
                         */
                        fun state(state: String) = state(JsonField.of(state))

                        /**
                         * Sets [Builder.state] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.state] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun state(state: JsonField<String>) = apply { this.state = state }

                        /** Unit or apartment number (if applicable). */
                        fun address2(address2: String) = address2(JsonField.of(address2))

                        /**
                         * Sets [Builder.address2] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.address2] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun address2(address2: JsonField<String>) = apply {
                            this.address2 = address2
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Address].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .address1()
                         * .city()
                         * .country()
                         * .postalCode()
                         * .state()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Address =
                            Address(
                                checkRequired("address1", address1),
                                checkRequired("city", city),
                                checkRequired("country", country),
                                checkRequired("postalCode", postalCode),
                                checkRequired("state", state),
                                address2,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Address = apply {
                        if (validated) {
                            return@apply
                        }

                        address1()
                        city()
                        country()
                        postalCode()
                        state()
                        address2()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LithicInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (address1.asKnown().isPresent) 1 else 0) +
                            (if (city.asKnown().isPresent) 1 else 0) +
                            (if (country.asKnown().isPresent) 1 else 0) +
                            (if (postalCode.asKnown().isPresent) 1 else 0) +
                            (if (state.asKnown().isPresent) 1 else 0) +
                            (if (address2.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Address &&
                            address1 == other.address1 &&
                            city == other.city &&
                            country == other.country &&
                            postalCode == other.postalCode &&
                            state == other.state &&
                            address2 == other.address2 &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            address1,
                            city,
                            country,
                            postalCode,
                            state,
                            address2,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Address{address1=$address1, city=$city, country=$country, postalCode=$postalCode, state=$state, address2=$address2, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        address == other.address &&
                        dob == other.dob &&
                        email == other.email &&
                        firstName == other.firstName &&
                        governmentId == other.governmentId &&
                        lastName == other.lastName &&
                        phoneNumber == other.phoneNumber &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        address,
                        dob,
                        email,
                        firstName,
                        governmentId,
                        lastName,
                        phoneNumber,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{address=$address, dob=$dob, email=$email, firstName=$firstName, governmentId=$governmentId, lastName=$lastName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UpdateRequest &&
                    individual == other.individual &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(individual, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UpdateRequest{individual=$individual, additionalProperties=$additionalProperties}"
        }

        /** The type of event that occurred. */
        class EventType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ACCOUNT_HOLDER_UPDATED = of("account_holder.updated")

                @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
            }

            /** An enum containing [EventType]'s known values. */
            enum class Known {
                ACCOUNT_HOLDER_UPDATED
            }

            /**
             * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EventType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACCOUNT_HOLDER_UPDATED,
                /**
                 * An enum member indicating that [EventType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACCOUNT_HOLDER_UPDATED -> Value.ACCOUNT_HOLDER_UPDATED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACCOUNT_HOLDER_UPDATED -> Known.ACCOUNT_HOLDER_UPDATED
                    else -> throw LithicInvalidDataException("Unknown EventType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): EventType = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EventType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is KycPayload &&
                token == other.token &&
                updateRequest == other.updateRequest &&
                eventType == other.eventType &&
                externalId == other.externalId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(token, updateRequest, eventType, externalId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "KycPayload{token=$token, updateRequest=$updateRequest, eventType=$eventType, externalId=$externalId, additionalProperties=$additionalProperties}"
    }

    /** Legacy payload for an updated account holder. */
    class LegacyPayload
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val businessAccountToken: JsonField<String>,
        private val created: JsonField<OffsetDateTime>,
        private val email: JsonField<String>,
        private val eventType: JsonField<EventType>,
        private val externalId: JsonField<String>,
        private val firstName: JsonField<String>,
        private val lastName: JsonField<String>,
        private val legalBusinessName: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("business_account_token")
            @ExcludeMissing
            businessAccountToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created")
            @ExcludeMissing
            created: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("event_type")
            @ExcludeMissing
            eventType: JsonField<EventType> = JsonMissing.of(),
            @JsonProperty("external_id")
            @ExcludeMissing
            externalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("legal_business_name")
            @ExcludeMissing
            legalBusinessName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
        ) : this(
            token,
            businessAccountToken,
            created,
            email,
            eventType,
            externalId,
            firstName,
            lastName,
            legalBusinessName,
            phoneNumber,
            mutableMapOf(),
        )

        /**
         * The token of the account_holder that was created.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * If applicable, represents the business account token associated with the account_holder.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun businessAccountToken(): Optional<String> =
            businessAccountToken.getOptional("business_account_token")

        /**
         * When the account_holder updated event was created
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun created(): Optional<OffsetDateTime> = created.getOptional("created")

        /**
         * If updated, the newly updated email associated with the account_holder otherwise the
         * existing email is provided.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * The type of event that occurred.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

        /**
         * If applicable, represents the external_id associated with the account_holder.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalId(): Optional<String> = externalId.getOptional("external_id")

        /**
         * If applicable, represents the account_holder's first name.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun firstName(): Optional<String> = firstName.getOptional("first_name")

        /**
         * If applicable, represents the account_holder's last name.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastName(): Optional<String> = lastName.getOptional("last_name")

        /**
         * If applicable, represents the account_holder's business name.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun legalBusinessName(): Optional<String> =
            legalBusinessName.getOptional("legal_business_name")

        /**
         * If updated, the newly updated phone_number associated with the account_holder otherwise
         * the existing phone_number is provided.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [businessAccountToken].
         *
         * Unlike [businessAccountToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("business_account_token")
        @ExcludeMissing
        fun _businessAccountToken(): JsonField<String> = businessAccountToken

        /**
         * Returns the raw JSON value of [created].
         *
         * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [eventType].
         *
         * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_type")
        @ExcludeMissing
        fun _eventType(): JsonField<EventType> = eventType

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [legalBusinessName].
         *
         * Unlike [legalBusinessName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("legal_business_name")
        @ExcludeMissing
        fun _legalBusinessName(): JsonField<String> = legalBusinessName

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [LegacyPayload].
             *
             * The following fields are required:
             * ```java
             * .token()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LegacyPayload]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var businessAccountToken: JsonField<String> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var eventType: JsonField<EventType> = JsonMissing.of()
            private var externalId: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var legalBusinessName: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(legacyPayload: LegacyPayload) = apply {
                token = legacyPayload.token
                businessAccountToken = legacyPayload.businessAccountToken
                created = legacyPayload.created
                email = legacyPayload.email
                eventType = legacyPayload.eventType
                externalId = legacyPayload.externalId
                firstName = legacyPayload.firstName
                lastName = legacyPayload.lastName
                legalBusinessName = legacyPayload.legalBusinessName
                phoneNumber = legacyPayload.phoneNumber
                additionalProperties = legacyPayload.additionalProperties.toMutableMap()
            }

            /** The token of the account_holder that was created. */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /**
             * If applicable, represents the business account token associated with the
             * account_holder.
             */
            fun businessAccountToken(businessAccountToken: String?) =
                businessAccountToken(JsonField.ofNullable(businessAccountToken))

            /**
             * Alias for calling [Builder.businessAccountToken] with
             * `businessAccountToken.orElse(null)`.
             */
            fun businessAccountToken(businessAccountToken: Optional<String>) =
                businessAccountToken(businessAccountToken.getOrNull())

            /**
             * Sets [Builder.businessAccountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.businessAccountToken] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun businessAccountToken(businessAccountToken: JsonField<String>) = apply {
                this.businessAccountToken = businessAccountToken
            }

            /** When the account_holder updated event was created */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /**
             * Sets [Builder.created] to an arbitrary JSON value.
             *
             * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /**
             * If updated, the newly updated email associated with the account_holder otherwise the
             * existing email is provided.
             */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** The type of event that occurred. */
            fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed [EventType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

            /** If applicable, represents the external_id associated with the account_holder. */
            fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

            /** Alias for calling [Builder.externalId] with `externalId.orElse(null)`. */
            fun externalId(externalId: Optional<String>) = externalId(externalId.getOrNull())

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            /** If applicable, represents the account_holder's first name. */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** If applicable, represents the account_holder's last name. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** If applicable, represents the account_holder's business name. */
            fun legalBusinessName(legalBusinessName: String) =
                legalBusinessName(JsonField.of(legalBusinessName))

            /**
             * Sets [Builder.legalBusinessName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalBusinessName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legalBusinessName(legalBusinessName: JsonField<String>) = apply {
                this.legalBusinessName = legalBusinessName
            }

            /**
             * If updated, the newly updated phone_number associated with the account_holder
             * otherwise the existing phone_number is provided.
             */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [LegacyPayload].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .token()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LegacyPayload =
                LegacyPayload(
                    checkRequired("token", token),
                    businessAccountToken,
                    created,
                    email,
                    eventType,
                    externalId,
                    firstName,
                    lastName,
                    legalBusinessName,
                    phoneNumber,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LegacyPayload = apply {
            if (validated) {
                return@apply
            }

            token()
            businessAccountToken()
            created()
            email()
            eventType().ifPresent { it.validate() }
            externalId()
            firstName()
            lastName()
            legalBusinessName()
            phoneNumber()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (token.asKnown().isPresent) 1 else 0) +
                (if (businessAccountToken.asKnown().isPresent) 1 else 0) +
                (if (created.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (eventType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (externalId.asKnown().isPresent) 1 else 0) +
                (if (firstName.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0) +
                (if (legalBusinessName.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0)

        /** The type of event that occurred. */
        class EventType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ACCOUNT_HOLDER_UPDATED = of("account_holder.updated")

                @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
            }

            /** An enum containing [EventType]'s known values. */
            enum class Known {
                ACCOUNT_HOLDER_UPDATED
            }

            /**
             * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EventType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACCOUNT_HOLDER_UPDATED,
                /**
                 * An enum member indicating that [EventType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACCOUNT_HOLDER_UPDATED -> Value.ACCOUNT_HOLDER_UPDATED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACCOUNT_HOLDER_UPDATED -> Known.ACCOUNT_HOLDER_UPDATED
                    else -> throw LithicInvalidDataException("Unknown EventType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): EventType = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EventType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LegacyPayload &&
                token == other.token &&
                businessAccountToken == other.businessAccountToken &&
                created == other.created &&
                email == other.email &&
                eventType == other.eventType &&
                externalId == other.externalId &&
                firstName == other.firstName &&
                lastName == other.lastName &&
                legalBusinessName == other.legalBusinessName &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                token,
                businessAccountToken,
                created,
                email,
                eventType,
                externalId,
                firstName,
                lastName,
                legalBusinessName,
                phoneNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegacyPayload{token=$token, businessAccountToken=$businessAccountToken, created=$created, email=$email, eventType=$eventType, externalId=$externalId, firstName=$firstName, lastName=$lastName, legalBusinessName=$legalBusinessName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }
}
