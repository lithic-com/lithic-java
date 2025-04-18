// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardReissueResponseTest {

    @Test
    fun create() {
        val cardReissueResponse =
            CardReissueResponse.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .accountToken("f3f4918c-dee9-464d-a819-4aa42901d624")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    CardReissueResponse.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(CardReissueResponse.FundingAccount.State.DELETED)
                        .type(CardReissueResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("account_name")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .pinStatus(CardReissueResponse.PinStatus.OK)
                .spendLimit(1000L)
                .spendLimitDuration(CardReissueResponse.SpendLimitDuration.ANNUALLY)
                .state(CardReissueResponse.State.CLOSED)
                .type(CardReissueResponse.Type.MERCHANT_LOCKED)
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

        assertThat(cardReissueResponse.token()).isEqualTo("7ef7d65c-9023-4da3-b113-3b8583fd7951")
        assertThat(cardReissueResponse.accountToken())
            .isEqualTo("f3f4918c-dee9-464d-a819-4aa42901d624")
        assertThat(cardReissueResponse.cardProgramToken())
            .isEqualTo("5e9483eb-8103-4e16-9794-2106111b2eca")
        assertThat(cardReissueResponse.created())
            .isEqualTo(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
        assertThat(cardReissueResponse.funding())
            .isEqualTo(
                CardReissueResponse.FundingAccount.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastFour("xxxx")
                    .state(CardReissueResponse.FundingAccount.State.DELETED)
                    .type(CardReissueResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                    .accountName("account_name")
                    .nickname("x")
                    .build()
            )
        assertThat(cardReissueResponse.lastFour()).isEqualTo("xxxx")
        assertThat(cardReissueResponse.pinStatus()).isEqualTo(CardReissueResponse.PinStatus.OK)
        assertThat(cardReissueResponse.spendLimit()).isEqualTo(1000L)
        assertThat(cardReissueResponse.spendLimitDuration())
            .isEqualTo(CardReissueResponse.SpendLimitDuration.ANNUALLY)
        assertThat(cardReissueResponse.state()).isEqualTo(CardReissueResponse.State.CLOSED)
        assertThat(cardReissueResponse.type()).isEqualTo(CardReissueResponse.Type.MERCHANT_LOCKED)
        assertThat(cardReissueResponse.authRuleTokens().getOrNull()).containsExactly("string")
        assertThat(cardReissueResponse.cardholderCurrency()).contains("USD")
        assertThat(cardReissueResponse.cvv()).contains("776")
        assertThat(cardReissueResponse.digitalCardArtToken())
            .contains("00000000-0000-0000-1000-000000000000")
        assertThat(cardReissueResponse.expMonth()).contains("06")
        assertThat(cardReissueResponse.expYear()).contains("2027")
        assertThat(cardReissueResponse.hostname()).contains("hostname")
        assertThat(cardReissueResponse.memo()).contains("New Card")
        assertThat(cardReissueResponse.pan()).contains("4111111289144142")
        assertThat(cardReissueResponse.pendingCommands().getOrNull()).containsExactly("string")
        assertThat(cardReissueResponse.productId()).contains("1")
        assertThat(cardReissueResponse.replacementFor())
            .contains("5e9483eb-8103-4e16-9794-2106111b2eca")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardReissueResponse =
            CardReissueResponse.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .accountToken("f3f4918c-dee9-464d-a819-4aa42901d624")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    CardReissueResponse.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(CardReissueResponse.FundingAccount.State.DELETED)
                        .type(CardReissueResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("account_name")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .pinStatus(CardReissueResponse.PinStatus.OK)
                .spendLimit(1000L)
                .spendLimitDuration(CardReissueResponse.SpendLimitDuration.ANNUALLY)
                .state(CardReissueResponse.State.CLOSED)
                .type(CardReissueResponse.Type.MERCHANT_LOCKED)
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

        val roundtrippedCardReissueResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardReissueResponse),
                jacksonTypeRef<CardReissueResponse>(),
            )

        assertThat(roundtrippedCardReissueResponse).isEqualTo(cardReissueResponse)
    }
}
