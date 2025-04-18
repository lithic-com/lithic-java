// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardConvertPhysicalResponseTest {

    @Test
    fun create() {
        val cardConvertPhysicalResponse =
            CardConvertPhysicalResponse.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .accountToken("f3f4918c-dee9-464d-a819-4aa42901d624")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    CardConvertPhysicalResponse.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(CardConvertPhysicalResponse.FundingAccount.State.DELETED)
                        .type(CardConvertPhysicalResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("account_name")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .pinStatus(CardConvertPhysicalResponse.PinStatus.OK)
                .spendLimit(1000L)
                .spendLimitDuration(CardConvertPhysicalResponse.SpendLimitDuration.ANNUALLY)
                .state(CardConvertPhysicalResponse.State.CLOSED)
                .type(CardConvertPhysicalResponse.Type.MERCHANT_LOCKED)
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

        assertThat(cardConvertPhysicalResponse.token())
            .isEqualTo("7ef7d65c-9023-4da3-b113-3b8583fd7951")
        assertThat(cardConvertPhysicalResponse.accountToken())
            .isEqualTo("f3f4918c-dee9-464d-a819-4aa42901d624")
        assertThat(cardConvertPhysicalResponse.cardProgramToken())
            .isEqualTo("5e9483eb-8103-4e16-9794-2106111b2eca")
        assertThat(cardConvertPhysicalResponse.created())
            .isEqualTo(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
        assertThat(cardConvertPhysicalResponse.funding())
            .isEqualTo(
                CardConvertPhysicalResponse.FundingAccount.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastFour("xxxx")
                    .state(CardConvertPhysicalResponse.FundingAccount.State.DELETED)
                    .type(CardConvertPhysicalResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                    .accountName("account_name")
                    .nickname("x")
                    .build()
            )
        assertThat(cardConvertPhysicalResponse.lastFour()).isEqualTo("xxxx")
        assertThat(cardConvertPhysicalResponse.pinStatus())
            .isEqualTo(CardConvertPhysicalResponse.PinStatus.OK)
        assertThat(cardConvertPhysicalResponse.spendLimit()).isEqualTo(1000L)
        assertThat(cardConvertPhysicalResponse.spendLimitDuration())
            .isEqualTo(CardConvertPhysicalResponse.SpendLimitDuration.ANNUALLY)
        assertThat(cardConvertPhysicalResponse.state())
            .isEqualTo(CardConvertPhysicalResponse.State.CLOSED)
        assertThat(cardConvertPhysicalResponse.type())
            .isEqualTo(CardConvertPhysicalResponse.Type.MERCHANT_LOCKED)
        assertThat(cardConvertPhysicalResponse.authRuleTokens().getOrNull())
            .containsExactly("string")
        assertThat(cardConvertPhysicalResponse.cardholderCurrency()).contains("USD")
        assertThat(cardConvertPhysicalResponse.cvv()).contains("776")
        assertThat(cardConvertPhysicalResponse.digitalCardArtToken())
            .contains("00000000-0000-0000-1000-000000000000")
        assertThat(cardConvertPhysicalResponse.expMonth()).contains("06")
        assertThat(cardConvertPhysicalResponse.expYear()).contains("2027")
        assertThat(cardConvertPhysicalResponse.hostname()).contains("hostname")
        assertThat(cardConvertPhysicalResponse.memo()).contains("New Card")
        assertThat(cardConvertPhysicalResponse.pan()).contains("4111111289144142")
        assertThat(cardConvertPhysicalResponse.pendingCommands().getOrNull())
            .containsExactly("string")
        assertThat(cardConvertPhysicalResponse.productId()).contains("1")
        assertThat(cardConvertPhysicalResponse.replacementFor())
            .contains("5e9483eb-8103-4e16-9794-2106111b2eca")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardConvertPhysicalResponse =
            CardConvertPhysicalResponse.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .accountToken("f3f4918c-dee9-464d-a819-4aa42901d624")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    CardConvertPhysicalResponse.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(CardConvertPhysicalResponse.FundingAccount.State.DELETED)
                        .type(CardConvertPhysicalResponse.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("account_name")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .pinStatus(CardConvertPhysicalResponse.PinStatus.OK)
                .spendLimit(1000L)
                .spendLimitDuration(CardConvertPhysicalResponse.SpendLimitDuration.ANNUALLY)
                .state(CardConvertPhysicalResponse.State.CLOSED)
                .type(CardConvertPhysicalResponse.Type.MERCHANT_LOCKED)
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

        val roundtrippedCardConvertPhysicalResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardConvertPhysicalResponse),
                jacksonTypeRef<CardConvertPhysicalResponse>(),
            )

        assertThat(roundtrippedCardConvertPhysicalResponse).isEqualTo(cardConvertPhysicalResponse)
    }
}
