// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardSearchByPanResponseTest {

    @Test
    fun create() {
        val cardSearchByPanResponse =
            CardSearchByPanResponse.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .accountToken("f3f4918c-dee9-464d-a819-4aa42901d624")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    CardSearchByPanResponse.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(CardSearchByPanResponse.FundingAccount.State.DELETED)
                        .type(CardSearchByPanResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("account_name")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .pinStatus(CardSearchByPanResponse.PinStatus.OK)
                .spendLimit(1000L)
                .spendLimitDuration(CardSearchByPanResponse.SpendLimitDuration.ANNUALLY)
                .state(CardSearchByPanResponse.State.CLOSED)
                .type(CardSearchByPanResponse.Type.MERCHANT_LOCKED)
                .addAuthRuleToken("string")
                .cardholderCurrency("USD")
                .cvv("776")
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .hostname("hostname")
                .memo("New Card")
                .pan("4111111289144142")
                .addPendingCommand("string")
                .productId("1")
                .replacementFor("5e9483eb-8103-4e16-9794-2106111b2eca")
                .build()

        assertThat(cardSearchByPanResponse.token())
            .isEqualTo("7ef7d65c-9023-4da3-b113-3b8583fd7951")
        assertThat(cardSearchByPanResponse.accountToken())
            .isEqualTo("f3f4918c-dee9-464d-a819-4aa42901d624")
        assertThat(cardSearchByPanResponse.cardProgramToken())
            .isEqualTo("5e9483eb-8103-4e16-9794-2106111b2eca")
        assertThat(cardSearchByPanResponse.created())
            .isEqualTo(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
        assertThat(cardSearchByPanResponse.funding())
            .isEqualTo(
                CardSearchByPanResponse.FundingAccount.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastFour("xxxx")
                    .state(CardSearchByPanResponse.FundingAccount.State.DELETED)
                    .type(CardSearchByPanResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                    .accountName("account_name")
                    .nickname("x")
                    .build()
            )
        assertThat(cardSearchByPanResponse.lastFour()).isEqualTo("xxxx")
        assertThat(cardSearchByPanResponse.pinStatus())
            .isEqualTo(CardSearchByPanResponse.PinStatus.OK)
        assertThat(cardSearchByPanResponse.spendLimit()).isEqualTo(1000L)
        assertThat(cardSearchByPanResponse.spendLimitDuration())
            .isEqualTo(CardSearchByPanResponse.SpendLimitDuration.ANNUALLY)
        assertThat(cardSearchByPanResponse.state()).isEqualTo(CardSearchByPanResponse.State.CLOSED)
        assertThat(cardSearchByPanResponse.type())
            .isEqualTo(CardSearchByPanResponse.Type.MERCHANT_LOCKED)
        assertThat(cardSearchByPanResponse.authRuleTokens().getOrNull()).containsExactly("string")
        assertThat(cardSearchByPanResponse.cardholderCurrency()).contains("USD")
        assertThat(cardSearchByPanResponse.cvv()).contains("776")
        assertThat(cardSearchByPanResponse.digitalCardArtToken())
            .contains("00000000-0000-0000-1000-000000000000")
        assertThat(cardSearchByPanResponse.expMonth()).contains("06")
        assertThat(cardSearchByPanResponse.expYear()).contains("2027")
        assertThat(cardSearchByPanResponse.hostname()).contains("hostname")
        assertThat(cardSearchByPanResponse.memo()).contains("New Card")
        assertThat(cardSearchByPanResponse.pan()).contains("4111111289144142")
        assertThat(cardSearchByPanResponse.pendingCommands().getOrNull()).containsExactly("string")
        assertThat(cardSearchByPanResponse.productId()).contains("1")
        assertThat(cardSearchByPanResponse.replacementFor())
            .contains("5e9483eb-8103-4e16-9794-2106111b2eca")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardSearchByPanResponse =
            CardSearchByPanResponse.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .accountToken("f3f4918c-dee9-464d-a819-4aa42901d624")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    CardSearchByPanResponse.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(CardSearchByPanResponse.FundingAccount.State.DELETED)
                        .type(CardSearchByPanResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("account_name")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .pinStatus(CardSearchByPanResponse.PinStatus.OK)
                .spendLimit(1000L)
                .spendLimitDuration(CardSearchByPanResponse.SpendLimitDuration.ANNUALLY)
                .state(CardSearchByPanResponse.State.CLOSED)
                .type(CardSearchByPanResponse.Type.MERCHANT_LOCKED)
                .addAuthRuleToken("string")
                .cardholderCurrency("USD")
                .cvv("776")
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .hostname("hostname")
                .memo("New Card")
                .pan("4111111289144142")
                .addPendingCommand("string")
                .productId("1")
                .replacementFor("5e9483eb-8103-4e16-9794-2106111b2eca")
                .build()

        val roundtrippedCardSearchByPanResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardSearchByPanResponse),
                jacksonTypeRef<CardSearchByPanResponse>(),
            )

        assertThat(roundtrippedCardSearchByPanResponse).isEqualTo(cardSearchByPanResponse)
    }
}
