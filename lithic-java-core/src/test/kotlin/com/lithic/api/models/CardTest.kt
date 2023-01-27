package com.lithic.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardTest {

    @Test
    fun createCard() {
        val card =
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
                .spendLimitDuration(Card.SpendLimitDuration.ANNUALLY)
                .state(Card.State.CLOSED)
                .authRuleTokens(listOf("string"))
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .type(Card.Type.VIRTUAL)
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .build()
        assertThat(card).isNotNull
        assertThat(card.created()).isEqualTo("2021-06-28T22:53:15Z")
        assertThat(card.cvv()).contains("776")
        assertThat(card.funding())
            .isEqualTo(
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
        assertThat(card.expMonth()).contains("06")
        assertThat(card.expYear()).contains("2027")
        assertThat(card.hostname()).contains("string")
        assertThat(card.lastFour()).isEqualTo("xxxx")
        assertThat(card.memo()).contains("New Card")
        assertThat(card.pan()).contains("4111111289144142")
        assertThat(card.spendLimit()).isEqualTo(123L)
        assertThat(card.spendLimitDuration()).isEqualTo(Card.SpendLimitDuration.ANNUALLY)
        assertThat(card.state()).isEqualTo(Card.State.CLOSED)
        assertThat(card.authRuleTokens().get()).containsExactly("string")
        assertThat(card.token()).isEqualTo("7ef7d65c-9023-4da3-b113-3b8583fd7951")
        assertThat(card.type()).isEqualTo(Card.Type.VIRTUAL)
        assertThat(card.digitalCardArtToken()).contains("00000000-0000-0000-1000-000000000000")
    }
}
