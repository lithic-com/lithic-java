package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionTest {

    @Test
    fun createTransaction() {
        val transaction =
            Transaction.builder()
                .acquirerReferenceNumber("xxxxxxxxxxxxxxxxxxxxxxx")
                .amount(123L)
                .authorizationAmount(123L)
                .cardholderAuthentication(
                    Transaction.CardholderAuthentication.builder()
                        ._3dsVersion("string")
                        .acquirerExemption(
                            Transaction.CardholderAuthentication.AcquirerExemption
                                .AUTHENTICATION_OUTAGE_EXCEPTION
                        )
                        .liabilityShift(
                            Transaction.CardholderAuthentication.LiabilityShift._3_DS_AUTHENTICATED
                        )
                        .verificationAttempted(
                            Transaction.CardholderAuthentication.VerificationAttempted.APP_LOGIN
                        )
                        .verificationResult(
                            Transaction.CardholderAuthentication.VerificationResult.CANCELLED
                        )
                        .build()
                )
                .merchantAmount(123L)
                .merchantAuthorizationAmount(123L)
                .merchantCurrency("string")
                .authorizationCode("xxxxxx")
                .card(
                    Card.builder()
                        .created("2021-06-28T22:53:15Z")
                        .cvv("776")
                        .funding(
                            FundingSource.builder()
                                .accountName("string")
                                .created("2019-12-27T18:11:19.117Z")
                                .lastFour("xxxx")
                                .nickname("x")
                                .state(FundingSource.State.ENABLED)
                                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .type(FundingSource.Type.DEPOSITORY_CHECKING)
                                .build()
                        )
                        .expMonth("06")
                        .expYear("2027")
                        .hostname("string")
                        .lastFour("xxxx")
                        .memo("New Card")
                        .pan("4111111289144142")
                        .spendLimit(123L)
                        .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                        .state(Card.State.CLOSED)
                        .authRuleTokens(listOf("string"))
                        .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                        .type(Card.Type.VIRTUAL)
                        .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                        .build()
                )
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created("2019-12-27T18:11:19.117Z")
                .events(
                    listOf(
                        Transaction.Event.builder()
                            .amount(123L)
                            .created("2018-05-29 21:16:05")
                            .result(Transaction.Event.Result.ACCOUNT_STATE_TRANSACTION)
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .type(Transaction.Event.Type.AUTHORIZATION)
                            .build()
                    )
                )
                .funding(
                    listOf(
                        Transaction.Funding.builder()
                            .amount(123L)
                            .token("string")
                            .type(Transaction.Funding.Type.DEPOSITORY_CHECKING)
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
                .network(Transaction.Network.INTERLINK)
                .result(Transaction.Result.ACCOUNT_STATE_TRANSACTION)
                .settledAmount(123L)
                .status(Transaction.Status.BOUNCED)
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(transaction).isNotNull
        assertThat(transaction.acquirerReferenceNumber()).contains("xxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(transaction.amount()).contains(123L)
        assertThat(transaction.authorizationAmount()).contains(123L)
        assertThat(transaction.cardholderAuthentication())
            .contains(
                Transaction.CardholderAuthentication.builder()
                    ._3dsVersion("string")
                    .acquirerExemption(
                        Transaction.CardholderAuthentication.AcquirerExemption
                            .AUTHENTICATION_OUTAGE_EXCEPTION
                    )
                    .liabilityShift(
                        Transaction.CardholderAuthentication.LiabilityShift._3_DS_AUTHENTICATED
                    )
                    .verificationAttempted(
                        Transaction.CardholderAuthentication.VerificationAttempted.APP_LOGIN
                    )
                    .verificationResult(
                        Transaction.CardholderAuthentication.VerificationResult.CANCELLED
                    )
                    .build()
            )
        assertThat(transaction.merchantAmount()).contains(123L)
        assertThat(transaction.merchantAuthorizationAmount()).contains(123L)
        assertThat(transaction.merchantCurrency()).contains("string")
        assertThat(transaction.authorizationCode()).contains("xxxxxx")
        assertThat(transaction.card())
            .contains(
                Card.builder()
                    .created("2021-06-28T22:53:15Z")
                    .cvv("776")
                    .funding(
                        FundingSource.builder()
                            .accountName("string")
                            .created("2019-12-27T18:11:19.117Z")
                            .lastFour("xxxx")
                            .nickname("x")
                            .state(FundingSource.State.ENABLED)
                            .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .type(FundingSource.Type.DEPOSITORY_CHECKING)
                            .build()
                    )
                    .expMonth("06")
                    .expYear("2027")
                    .hostname("string")
                    .lastFour("xxxx")
                    .memo("New Card")
                    .pan("4111111289144142")
                    .spendLimit(123L)
                    .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                    .state(Card.State.CLOSED)
                    .authRuleTokens(listOf("string"))
                    .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                    .type(Card.Type.VIRTUAL)
                    .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                    .build()
            )
        assertThat(transaction.cardToken()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transaction.created()).contains("2019-12-27T18:11:19.117Z")
        assertThat(transaction.events().get())
            .containsExactly(
                Transaction.Event.builder()
                    .amount(123L)
                    .created("2018-05-29 21:16:05")
                    .result(Transaction.Event.Result.ACCOUNT_STATE_TRANSACTION)
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(Transaction.Event.Type.AUTHORIZATION)
                    .build()
            )
        assertThat(transaction.funding().get())
            .containsExactly(
                Transaction.Funding.builder()
                    .amount(123L)
                    .token("string")
                    .type(Transaction.Funding.Type.DEPOSITORY_CHECKING)
                    .build()
            )
        assertThat(transaction.merchant())
            .contains(
                Transaction.Merchant.builder()
                    .acceptorId("72600003")
                    .city("NEW YORK")
                    .country("USA")
                    .descriptor("COFFEE SHOP")
                    .mcc("5812")
                    .state("NY")
                    .build()
            )
        assertThat(transaction.network()).contains(Transaction.Network.INTERLINK)
        assertThat(transaction.result()).contains(Transaction.Result.ACCOUNT_STATE_TRANSACTION)
        assertThat(transaction.settledAmount()).contains(123L)
        assertThat(transaction.status()).contains(Transaction.Status.BOUNCED)
        assertThat(transaction.token()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
