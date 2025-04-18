// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardRetrieveResponseTest {

    @Test
    fun create() {
        val cardRetrieveResponse =
            CardRetrieveResponse.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .accountToken("f3f4918c-dee9-464d-a819-4aa42901d624")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    CardRetrieveResponse.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(CardRetrieveResponse.FundingAccount.State.DELETED)
                        .type(CardRetrieveResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("account_name")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .pinStatus(CardRetrieveResponse.PinStatus.OK)
                .spendLimit(1000L)
                .spendLimitDuration(CardRetrieveResponse.SpendLimitDuration.ANNUALLY)
                .state(CardRetrieveResponse.State.CLOSED)
                .type(CardRetrieveResponse.Type.MERCHANT_LOCKED)
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

        assertThat(cardRetrieveResponse.token()).isEqualTo("7ef7d65c-9023-4da3-b113-3b8583fd7951")
        assertThat(cardRetrieveResponse.accountToken())
            .isEqualTo("f3f4918c-dee9-464d-a819-4aa42901d624")
        assertThat(cardRetrieveResponse.cardProgramToken())
            .isEqualTo("5e9483eb-8103-4e16-9794-2106111b2eca")
        assertThat(cardRetrieveResponse.created())
            .isEqualTo(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
        assertThat(cardRetrieveResponse.funding())
            .isEqualTo(
                CardRetrieveResponse.FundingAccount.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastFour("xxxx")
                    .state(CardRetrieveResponse.FundingAccount.State.DELETED)
                    .type(CardRetrieveResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                    .accountName("account_name")
                    .nickname("x")
                    .build()
            )
        assertThat(cardRetrieveResponse.lastFour()).isEqualTo("xxxx")
        assertThat(cardRetrieveResponse.pinStatus()).isEqualTo(CardRetrieveResponse.PinStatus.OK)
        assertThat(cardRetrieveResponse.spendLimit()).isEqualTo(1000L)
        assertThat(cardRetrieveResponse.spendLimitDuration())
            .isEqualTo(CardRetrieveResponse.SpendLimitDuration.ANNUALLY)
        assertThat(cardRetrieveResponse.state()).isEqualTo(CardRetrieveResponse.State.CLOSED)
        assertThat(cardRetrieveResponse.type()).isEqualTo(CardRetrieveResponse.Type.MERCHANT_LOCKED)
        assertThat(cardRetrieveResponse.authRuleTokens().getOrNull()).containsExactly("string")
        assertThat(cardRetrieveResponse.cardholderCurrency()).contains("USD")
        assertThat(cardRetrieveResponse.cvv()).contains("776")
        assertThat(cardRetrieveResponse.digitalCardArtToken())
            .contains("00000000-0000-0000-1000-000000000000")
        assertThat(cardRetrieveResponse.expMonth()).contains("06")
        assertThat(cardRetrieveResponse.expYear()).contains("2027")
        assertThat(cardRetrieveResponse.hostname()).contains("hostname")
        assertThat(cardRetrieveResponse.memo()).contains("New Card")
        assertThat(cardRetrieveResponse.pan()).contains("4111111289144142")
        assertThat(cardRetrieveResponse.pendingCommands().getOrNull()).containsExactly("string")
        assertThat(cardRetrieveResponse.productId()).contains("1")
        assertThat(cardRetrieveResponse.replacementFor())
            .contains("5e9483eb-8103-4e16-9794-2106111b2eca")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardRetrieveResponse =
            CardRetrieveResponse.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .accountToken("f3f4918c-dee9-464d-a819-4aa42901d624")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    CardRetrieveResponse.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(CardRetrieveResponse.FundingAccount.State.DELETED)
                        .type(CardRetrieveResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("account_name")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .pinStatus(CardRetrieveResponse.PinStatus.OK)
                .spendLimit(1000L)
                .spendLimitDuration(CardRetrieveResponse.SpendLimitDuration.ANNUALLY)
                .state(CardRetrieveResponse.State.CLOSED)
                .type(CardRetrieveResponse.Type.MERCHANT_LOCKED)
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

        val roundtrippedCardRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardRetrieveResponse),
                jacksonTypeRef<CardRetrieveResponse>(),
            )

        assertThat(roundtrippedCardRetrieveResponse).isEqualTo(cardRetrieveResponse)
    }
}
