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
                .acquirerReferenceNumber("xxxxxxxxxxxxxxxxxxxxxxx")
                .amount(123L)
                .authorizationAmount(123L)
                .authorizationCode("xxxxxx")
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .events(
                    listOf(
                        Transaction.TransactionEvent.builder()
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .amount(123L)
                            .created(OffsetDateTime.parse("2018-05-29T21:16:05Z"))
                            .result(Transaction.TransactionEvent.Result.ACCOUNT_STATE_TRANSACTION)
                            .type(Transaction.TransactionEvent.Type.AUTHORIZATION)
                            .build()
                    )
                )
                .merchant(
                    Transaction.Merchant.builder()
                        .acceptorId("72600003")
                        .city("NEW YORK")
                        .country("USA")
                        .descriptor("COFFEE SHOP")
                        .mcc("5812")
                        .state("NY")
                        .build()
                )
                .merchantAmount(123L)
                .merchantAuthorizationAmount(123L)
                .merchantCurrency("string")
                .network(Transaction.Network.INTERLINK)
                .result(Transaction.Result.ACCOUNT_STATE_TRANSACTION)
                .settledAmount(123L)
                .status(Transaction.Status.BOUNCED)
                .cardholderAuthentication(
                    Transaction.CardholderAuthentication.builder()
                        ._3dsVersion("string")
                        .acquirerExemption(
                            Transaction.CardholderAuthentication.AcquirerExemption
                                .AUTHENTICATION_OUTAGE_EXCEPTION
                        )
                        .liabilityShift(
                            Transaction.CardholderAuthentication.LiabilityShift._3DS_AUTHENTICATED
                        )
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
        assertThat(transaction.acquirerReferenceNumber()).contains("xxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(transaction.amount()).isEqualTo(123L)
        assertThat(transaction.authorizationAmount()).isEqualTo(123L)
        assertThat(transaction.authorizationCode()).isEqualTo("xxxxxx")
        assertThat(transaction.cardToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transaction.cardholderAuthentication())
            .contains(
                Transaction.CardholderAuthentication.builder()
                    ._3dsVersion("string")
                    .acquirerExemption(
                        Transaction.CardholderAuthentication.AcquirerExemption
                            .AUTHENTICATION_OUTAGE_EXCEPTION
                    )
                    .liabilityShift(
                        Transaction.CardholderAuthentication.LiabilityShift._3DS_AUTHENTICATED
                    )
                    .verificationAttempted(
                        Transaction.CardholderAuthentication.VerificationAttempted.APP_LOGIN
                    )
                    .verificationResult(
                        Transaction.CardholderAuthentication.VerificationResult.CANCELLED
                    )
                    .build()
            )
        assertThat(transaction.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.events())
            .containsExactly(
                Transaction.TransactionEvent.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(123L)
                    .created(OffsetDateTime.parse("2018-05-29T21:16:05Z"))
                    .result(Transaction.TransactionEvent.Result.ACCOUNT_STATE_TRANSACTION)
                    .type(Transaction.TransactionEvent.Type.AUTHORIZATION)
                    .build()
            )
        assertThat(transaction.merchant())
            .isEqualTo(
                Transaction.Merchant.builder()
                    .acceptorId("72600003")
                    .city("NEW YORK")
                    .country("USA")
                    .descriptor("COFFEE SHOP")
                    .mcc("5812")
                    .state("NY")
                    .build()
            )
        assertThat(transaction.merchantAmount()).isEqualTo(123L)
        assertThat(transaction.merchantAuthorizationAmount()).isEqualTo(123L)
        assertThat(transaction.merchantCurrency()).isEqualTo("string")
        assertThat(transaction.network()).contains(Transaction.Network.INTERLINK)
        assertThat(transaction.result()).isEqualTo(Transaction.Result.ACCOUNT_STATE_TRANSACTION)
        assertThat(transaction.settledAmount()).isEqualTo(123L)
        assertThat(transaction.status()).isEqualTo(Transaction.Status.BOUNCED)
        assertThat(transaction.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
