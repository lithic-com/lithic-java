// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardRenewResponseTest {

    @Test
    fun create() {
        val cardRenewResponse =
            CardRenewResponse.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .accountToken("f3f4918c-dee9-464d-a819-4aa42901d624")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    CardRenewResponse.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(CardRenewResponse.FundingAccount.State.DELETED)
                        .type(CardRenewResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("account_name")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .pinStatus(CardRenewResponse.PinStatus.OK)
                .spendLimit(1000L)
                .spendLimitDuration(CardRenewResponse.SpendLimitDuration.ANNUALLY)
                .state(CardRenewResponse.State.CLOSED)
                .type(CardRenewResponse.Type.MERCHANT_LOCKED)
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

        assertThat(cardRenewResponse.token()).isEqualTo("7ef7d65c-9023-4da3-b113-3b8583fd7951")
        assertThat(cardRenewResponse.accountToken())
            .isEqualTo("f3f4918c-dee9-464d-a819-4aa42901d624")
        assertThat(cardRenewResponse.cardProgramToken())
            .isEqualTo("5e9483eb-8103-4e16-9794-2106111b2eca")
        assertThat(cardRenewResponse.created())
            .isEqualTo(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
        assertThat(cardRenewResponse.funding())
            .isEqualTo(
                CardRenewResponse.FundingAccount.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastFour("xxxx")
                    .state(CardRenewResponse.FundingAccount.State.DELETED)
                    .type(CardRenewResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                    .accountName("account_name")
                    .nickname("x")
                    .build()
            )
        assertThat(cardRenewResponse.lastFour()).isEqualTo("xxxx")
        assertThat(cardRenewResponse.pinStatus()).isEqualTo(CardRenewResponse.PinStatus.OK)
        assertThat(cardRenewResponse.spendLimit()).isEqualTo(1000L)
        assertThat(cardRenewResponse.spendLimitDuration())
            .isEqualTo(CardRenewResponse.SpendLimitDuration.ANNUALLY)
        assertThat(cardRenewResponse.state()).isEqualTo(CardRenewResponse.State.CLOSED)
        assertThat(cardRenewResponse.type()).isEqualTo(CardRenewResponse.Type.MERCHANT_LOCKED)
        assertThat(cardRenewResponse.authRuleTokens().getOrNull()).containsExactly("string")
        assertThat(cardRenewResponse.cardholderCurrency()).contains("USD")
        assertThat(cardRenewResponse.cvv()).contains("776")
        assertThat(cardRenewResponse.digitalCardArtToken())
            .contains("00000000-0000-0000-1000-000000000000")
        assertThat(cardRenewResponse.expMonth()).contains("06")
        assertThat(cardRenewResponse.expYear()).contains("2027")
        assertThat(cardRenewResponse.hostname()).contains("hostname")
        assertThat(cardRenewResponse.memo()).contains("New Card")
        assertThat(cardRenewResponse.pan()).contains("4111111289144142")
        assertThat(cardRenewResponse.pendingCommands().getOrNull()).containsExactly("string")
        assertThat(cardRenewResponse.productId()).contains("1")
        assertThat(cardRenewResponse.replacementFor())
            .contains("5e9483eb-8103-4e16-9794-2106111b2eca")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardRenewResponse =
            CardRenewResponse.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .accountToken("f3f4918c-dee9-464d-a819-4aa42901d624")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    CardRenewResponse.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(CardRenewResponse.FundingAccount.State.DELETED)
                        .type(CardRenewResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("account_name")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .pinStatus(CardRenewResponse.PinStatus.OK)
                .spendLimit(1000L)
                .spendLimitDuration(CardRenewResponse.SpendLimitDuration.ANNUALLY)
                .state(CardRenewResponse.State.CLOSED)
                .type(CardRenewResponse.Type.MERCHANT_LOCKED)
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

        val roundtrippedCardRenewResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardRenewResponse),
                jacksonTypeRef<CardRenewResponse>(),
            )

        assertThat(roundtrippedCardRenewResponse).isEqualTo(cardRenewResponse)
    }
}
