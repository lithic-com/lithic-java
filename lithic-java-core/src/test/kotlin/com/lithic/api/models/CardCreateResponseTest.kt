// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardCreateResponseTest {

    @Test
    fun create() {
        val cardCreateResponse =
            CardCreateResponse.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .accountToken("f3f4918c-dee9-464d-a819-4aa42901d624")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    CardCreateResponse.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(CardCreateResponse.FundingAccount.State.DELETED)
                        .type(CardCreateResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("account_name")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .pinStatus(CardCreateResponse.PinStatus.OK)
                .spendLimit(1000L)
                .spendLimitDuration(CardCreateResponse.SpendLimitDuration.ANNUALLY)
                .state(CardCreateResponse.State.CLOSED)
                .type(CardCreateResponse.Type.MERCHANT_LOCKED)
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

        assertThat(cardCreateResponse.token()).isEqualTo("7ef7d65c-9023-4da3-b113-3b8583fd7951")
        assertThat(cardCreateResponse.accountToken())
            .isEqualTo("f3f4918c-dee9-464d-a819-4aa42901d624")
        assertThat(cardCreateResponse.cardProgramToken())
            .isEqualTo("5e9483eb-8103-4e16-9794-2106111b2eca")
        assertThat(cardCreateResponse.created())
            .isEqualTo(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
        assertThat(cardCreateResponse.funding())
            .isEqualTo(
                CardCreateResponse.FundingAccount.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastFour("xxxx")
                    .state(CardCreateResponse.FundingAccount.State.DELETED)
                    .type(CardCreateResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                    .accountName("account_name")
                    .nickname("x")
                    .build()
            )
        assertThat(cardCreateResponse.lastFour()).isEqualTo("xxxx")
        assertThat(cardCreateResponse.pinStatus()).isEqualTo(CardCreateResponse.PinStatus.OK)
        assertThat(cardCreateResponse.spendLimit()).isEqualTo(1000L)
        assertThat(cardCreateResponse.spendLimitDuration())
            .isEqualTo(CardCreateResponse.SpendLimitDuration.ANNUALLY)
        assertThat(cardCreateResponse.state()).isEqualTo(CardCreateResponse.State.CLOSED)
        assertThat(cardCreateResponse.type()).isEqualTo(CardCreateResponse.Type.MERCHANT_LOCKED)
        assertThat(cardCreateResponse.authRuleTokens().getOrNull()).containsExactly("string")
        assertThat(cardCreateResponse.cardholderCurrency()).contains("USD")
        assertThat(cardCreateResponse.cvv()).contains("776")
        assertThat(cardCreateResponse.digitalCardArtToken())
            .contains("00000000-0000-0000-1000-000000000000")
        assertThat(cardCreateResponse.expMonth()).contains("06")
        assertThat(cardCreateResponse.expYear()).contains("2027")
        assertThat(cardCreateResponse.hostname()).contains("hostname")
        assertThat(cardCreateResponse.memo()).contains("New Card")
        assertThat(cardCreateResponse.pan()).contains("4111111289144142")
        assertThat(cardCreateResponse.pendingCommands().getOrNull()).containsExactly("string")
        assertThat(cardCreateResponse.productId()).contains("1")
        assertThat(cardCreateResponse.replacementFor())
            .contains("5e9483eb-8103-4e16-9794-2106111b2eca")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardCreateResponse =
            CardCreateResponse.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .accountToken("f3f4918c-dee9-464d-a819-4aa42901d624")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    CardCreateResponse.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(CardCreateResponse.FundingAccount.State.DELETED)
                        .type(CardCreateResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("account_name")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .pinStatus(CardCreateResponse.PinStatus.OK)
                .spendLimit(1000L)
                .spendLimitDuration(CardCreateResponse.SpendLimitDuration.ANNUALLY)
                .state(CardCreateResponse.State.CLOSED)
                .type(CardCreateResponse.Type.MERCHANT_LOCKED)
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

        val roundtrippedCardCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardCreateResponse),
                jacksonTypeRef<CardCreateResponse>(),
            )

        assertThat(roundtrippedCardCreateResponse).isEqualTo(cardCreateResponse)
    }
}
