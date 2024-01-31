// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardTest {

    @Test
    fun createCard() {
        val card =
            Card.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .accountToken("f3f4918c-dee9-464d-a819-4aa42901d624")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    Card.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(Card.FundingAccount.State.DELETED)
                        .type(Card.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("string")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .spendLimit(123L)
                .spendLimitDuration(SpendLimitDuration.ANNUALLY)
                .state(Card.State.CLOSED)
                .type(Card.Type.MERCHANT_LOCKED)
                .authRuleTokens(listOf("string"))
                .cvv("776")
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .hostname("string")
                .memo("New Card")
                .pan("4111111289144142")
                .build()
        assertThat(card).isNotNull
        assertThat(card.token()).isEqualTo("7ef7d65c-9023-4da3-b113-3b8583fd7951")
        assertThat(card.accountToken()).isEqualTo("f3f4918c-dee9-464d-a819-4aa42901d624")
        assertThat(card.cardProgramToken()).isEqualTo("5e9483eb-8103-4e16-9794-2106111b2eca")
        assertThat(card.created()).isEqualTo(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
        assertThat(card.funding())
            .isEqualTo(
                Card.FundingAccount.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastFour("xxxx")
                    .state(Card.FundingAccount.State.DELETED)
                    .type(Card.FundingAccount.Type.DEPOSITORY_CHECKING)
                    .accountName("string")
                    .nickname("x")
                    .build()
            )
        assertThat(card.lastFour()).isEqualTo("xxxx")
        assertThat(card.spendLimit()).isEqualTo(123L)
        assertThat(card.spendLimitDuration()).isEqualTo(SpendLimitDuration.ANNUALLY)
        assertThat(card.state()).isEqualTo(Card.State.CLOSED)
        assertThat(card.type()).isEqualTo(Card.Type.MERCHANT_LOCKED)
        assertThat(card.authRuleTokens().get()).containsExactly("string")
        assertThat(card.cvv()).contains("776")
        assertThat(card.digitalCardArtToken()).contains("00000000-0000-0000-1000-000000000000")
        assertThat(card.expMonth()).contains("06")
        assertThat(card.expYear()).contains("2027")
        assertThat(card.hostname()).contains("string")
        assertThat(card.memo()).contains("New Card")
        assertThat(card.pan()).contains("4111111289144142")
    }
}
