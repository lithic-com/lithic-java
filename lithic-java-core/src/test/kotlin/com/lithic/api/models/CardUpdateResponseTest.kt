// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardUpdateResponseTest {

    @Test
    fun create() {
        val cardUpdateResponse =
            CardUpdateResponse.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .accountToken("f3f4918c-dee9-464d-a819-4aa42901d624")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    CardUpdateResponse.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(CardUpdateResponse.FundingAccount.State.DELETED)
                        .type(CardUpdateResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("account_name")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .pinStatus(CardUpdateResponse.PinStatus.OK)
                .spendLimit(1000L)
                .spendLimitDuration(CardUpdateResponse.SpendLimitDuration.ANNUALLY)
                .state(CardUpdateResponse.State.CLOSED)
                .type(CardUpdateResponse.Type.MERCHANT_LOCKED)
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

        assertThat(cardUpdateResponse.token()).isEqualTo("7ef7d65c-9023-4da3-b113-3b8583fd7951")
        assertThat(cardUpdateResponse.accountToken())
            .isEqualTo("f3f4918c-dee9-464d-a819-4aa42901d624")
        assertThat(cardUpdateResponse.cardProgramToken())
            .isEqualTo("5e9483eb-8103-4e16-9794-2106111b2eca")
        assertThat(cardUpdateResponse.created())
            .isEqualTo(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
        assertThat(cardUpdateResponse.funding())
            .isEqualTo(
                CardUpdateResponse.FundingAccount.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastFour("xxxx")
                    .state(CardUpdateResponse.FundingAccount.State.DELETED)
                    .type(CardUpdateResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                    .accountName("account_name")
                    .nickname("x")
                    .build()
            )
        assertThat(cardUpdateResponse.lastFour()).isEqualTo("xxxx")
        assertThat(cardUpdateResponse.pinStatus()).isEqualTo(CardUpdateResponse.PinStatus.OK)
        assertThat(cardUpdateResponse.spendLimit()).isEqualTo(1000L)
        assertThat(cardUpdateResponse.spendLimitDuration())
            .isEqualTo(CardUpdateResponse.SpendLimitDuration.ANNUALLY)
        assertThat(cardUpdateResponse.state()).isEqualTo(CardUpdateResponse.State.CLOSED)
        assertThat(cardUpdateResponse.type()).isEqualTo(CardUpdateResponse.Type.MERCHANT_LOCKED)
        assertThat(cardUpdateResponse.authRuleTokens().getOrNull()).containsExactly("string")
        assertThat(cardUpdateResponse.cardholderCurrency()).contains("USD")
        assertThat(cardUpdateResponse.cvv()).contains("776")
        assertThat(cardUpdateResponse.digitalCardArtToken())
            .contains("00000000-0000-0000-1000-000000000000")
        assertThat(cardUpdateResponse.expMonth()).contains("06")
        assertThat(cardUpdateResponse.expYear()).contains("2027")
        assertThat(cardUpdateResponse.hostname()).contains("hostname")
        assertThat(cardUpdateResponse.memo()).contains("New Card")
        assertThat(cardUpdateResponse.pan()).contains("4111111289144142")
        assertThat(cardUpdateResponse.pendingCommands().getOrNull()).containsExactly("string")
        assertThat(cardUpdateResponse.productId()).contains("1")
        assertThat(cardUpdateResponse.replacementFor())
            .contains("5e9483eb-8103-4e16-9794-2106111b2eca")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardUpdateResponse =
            CardUpdateResponse.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .accountToken("f3f4918c-dee9-464d-a819-4aa42901d624")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    CardUpdateResponse.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(CardUpdateResponse.FundingAccount.State.DELETED)
                        .type(CardUpdateResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("account_name")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .pinStatus(CardUpdateResponse.PinStatus.OK)
                .spendLimit(1000L)
                .spendLimitDuration(CardUpdateResponse.SpendLimitDuration.ANNUALLY)
                .state(CardUpdateResponse.State.CLOSED)
                .type(CardUpdateResponse.Type.MERCHANT_LOCKED)
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

        val roundtrippedCardUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardUpdateResponse),
                jacksonTypeRef<CardUpdateResponse>(),
            )

        assertThat(roundtrippedCardUpdateResponse).isEqualTo(cardUpdateResponse)
    }
}
