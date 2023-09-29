package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionTest {

    @Test
    fun createTransaction() {
        val transaction =
            Transaction.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .acquirerFee(123L)
                .acquirerReferenceNumber("12345678987654321234567")
                .amount(123L)
                .authorizationAmount(123L)
                .authorizationCode("123456")
                .cardToken("19c22c47-7a75-43ee-9891-595419830f7e")
                .created(OffsetDateTime.parse("2023-09-26T21:14:28.637Z"))
                .events(
                    listOf(
                        Transaction.TransactionEvent.builder()
                            .token("0c2adae9-f535-4505-8c35-421dad9bd0b6")
                            .amount(123L)
                            .created(OffsetDateTime.parse("2018-05-29T21:16:05Z"))
                            .result(Transaction.TransactionEvent.Result.ACCOUNT_STATE_TRANSACTION)
                            .type(Transaction.TransactionEvent.Type.AUTHORIZATION)
                            .build()
                    )
                )
                .merchant(
                    Transaction.Merchant.builder()
                        .acceptorId("333301802529120")
                        .city("NEW YORK")
                        .country("USA")
                        .descriptor("COFFEE SHOP")
                        .mcc("5812")
                        .state("NY")
                        .build()
                )
                .merchantAmount(123L)
                .merchantAuthorizationAmount(123L)
                .merchantCurrency("USD")
                .network(Transaction.Network.INTERLINK)
                .result(Transaction.Result.ACCOUNT_STATE_TRANSACTION)
                .settledAmount(123L)
                .status(Transaction.Status.BOUNCED)
                .cardholderAuthentication(
                    Transaction.CardholderAuthentication.builder()
                        ._3dsVersion("2")
                        .acquirerExemption(
                            Transaction.CardholderAuthentication.AcquirerExemption
                                .AUTHENTICATION_OUTAGE_EXCEPTION
                        )
                        .authenticationResult(
                            Transaction.CardholderAuthentication.AuthenticationResult.SUCCESS
                        )
                        .decisionMadeBy(Transaction.CardholderAuthentication.DecisionMadeBy.NETWORK)
                        .liabilityShift(
                            Transaction.CardholderAuthentication.LiabilityShift._3DS_AUTHENTICATED
                        )
                        .threeDSAuthenticationToken("a6e372d0-b40a-43eb-b0d1-4e1aebef5875")
                        .verificationAttempted(
                            Transaction.CardholderAuthentication.VerificationAttempted.APP_LOGIN
                        )
                        .verificationResult(
                            Transaction.CardholderAuthentication.VerificationResult.CANCELLED
                        )
                        .build()
                )
                .build()
        assertThat(transaction).isNotNull
        assertThat(transaction.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transaction.acquirerFee()).isEqualTo(123L)
        assertThat(transaction.acquirerReferenceNumber()).contains("12345678987654321234567")
        assertThat(transaction.amount()).isEqualTo(123L)
        assertThat(transaction.authorizationAmount()).isEqualTo(123L)
        assertThat(transaction.authorizationCode()).isEqualTo("123456")
        assertThat(transaction.cardToken()).isEqualTo("19c22c47-7a75-43ee-9891-595419830f7e")
        assertThat(transaction.created())
            .isEqualTo(OffsetDateTime.parse("2023-09-26T21:14:28.637Z"))
        assertThat(transaction.events())
            .containsExactly(
                Transaction.TransactionEvent.builder()
                    .token("0c2adae9-f535-4505-8c35-421dad9bd0b6")
                    .amount(123L)
                    .created(OffsetDateTime.parse("2018-05-29T21:16:05Z"))
                    .result(Transaction.TransactionEvent.Result.ACCOUNT_STATE_TRANSACTION)
                    .type(Transaction.TransactionEvent.Type.AUTHORIZATION)
                    .build()
            )
        assertThat(transaction.merchant())
            .isEqualTo(
                Transaction.Merchant.builder()
                    .acceptorId("333301802529120")
                    .city("NEW YORK")
                    .country("USA")
                    .descriptor("COFFEE SHOP")
                    .mcc("5812")
                    .state("NY")
                    .build()
            )
        assertThat(transaction.merchantAmount()).isEqualTo(123L)
        assertThat(transaction.merchantAuthorizationAmount()).isEqualTo(123L)
        assertThat(transaction.merchantCurrency()).isEqualTo("USD")
        assertThat(transaction.network()).contains(Transaction.Network.INTERLINK)
        assertThat(transaction.result()).isEqualTo(Transaction.Result.ACCOUNT_STATE_TRANSACTION)
        assertThat(transaction.settledAmount()).isEqualTo(123L)
        assertThat(transaction.status()).isEqualTo(Transaction.Status.BOUNCED)
        assertThat(transaction.cardholderAuthentication())
            .contains(
                Transaction.CardholderAuthentication.builder()
                    ._3dsVersion("2")
                    .acquirerExemption(
                        Transaction.CardholderAuthentication.AcquirerExemption
                            .AUTHENTICATION_OUTAGE_EXCEPTION
                    )
                    .authenticationResult(
                        Transaction.CardholderAuthentication.AuthenticationResult.SUCCESS
                    )
                    .decisionMadeBy(Transaction.CardholderAuthentication.DecisionMadeBy.NETWORK)
                    .liabilityShift(
                        Transaction.CardholderAuthentication.LiabilityShift._3DS_AUTHENTICATED
                    )
                    .threeDSAuthenticationToken("a6e372d0-b40a-43eb-b0d1-4e1aebef5875")
                    .verificationAttempted(
                        Transaction.CardholderAuthentication.VerificationAttempted.APP_LOGIN
                    )
                    .verificationResult(
                        Transaction.CardholderAuthentication.VerificationResult.CANCELLED
                    )
                    .build()
            )
    }
}
