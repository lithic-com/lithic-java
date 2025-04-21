// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardTest {

    @Test
    fun create() {
        val card =
            Card.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .accountToken("f3f4918c-dee9-464d-a819-4aa42901d624")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    NonPciCard.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(NonPciCard.FundingAccount.State.DELETED)
                        .type(NonPciCard.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("account_name")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .pinStatus(NonPciCard.PinStatus.OK)
                .spendLimit(1000L)
                .spendLimitDuration(NonPciCard.SpendLimitDuration.ANNUALLY)
                .state(NonPciCard.State.CLOSED)
                .type(NonPciCard.Type.MERCHANT_LOCKED)
                .addAuthRuleToken("string")
                .cardholderCurrency("USD")
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .hostname("hostname")
                .memo("New Card")
                .addPendingCommand("string")
                .productId("1")
                .replacementFor("5e9483eb-8103-4e16-9794-2106111b2eca")
                .cvv("776")
                .pan("4111111289144142")
                .build()

        assertThat(card.token()).isEqualTo("7ef7d65c-9023-4da3-b113-3b8583fd7951")
        assertThat(card.accountToken()).isEqualTo("f3f4918c-dee9-464d-a819-4aa42901d624")
        assertThat(card.cardProgramToken()).isEqualTo("5e9483eb-8103-4e16-9794-2106111b2eca")
        assertThat(card.created()).isEqualTo(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
        assertThat(card.funding())
            .isEqualTo(
                NonPciCard.FundingAccount.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastFour("xxxx")
                    .state(NonPciCard.FundingAccount.State.DELETED)
                    .type(NonPciCard.FundingAccount.Type.DEPOSITORY_CHECKING)
                    .accountName("account_name")
                    .nickname("x")
                    .build()
            )
        assertThat(card.lastFour()).isEqualTo("xxxx")
        assertThat(card.pinStatus()).isEqualTo(NonPciCard.PinStatus.OK)
        assertThat(card.spendLimit()).isEqualTo(1000L)
        assertThat(card.spendLimitDuration()).isEqualTo(NonPciCard.SpendLimitDuration.ANNUALLY)
        assertThat(card.state()).isEqualTo(NonPciCard.State.CLOSED)
        assertThat(card.type()).isEqualTo(NonPciCard.Type.MERCHANT_LOCKED)
        assertThat(card.authRuleTokens().getOrNull()).containsExactly("string")
        assertThat(card.cardholderCurrency()).contains("USD")
        assertThat(card.digitalCardArtToken()).contains("00000000-0000-0000-1000-000000000000")
        assertThat(card.expMonth()).contains("06")
        assertThat(card.expYear()).contains("2027")
        assertThat(card.hostname()).contains("hostname")
        assertThat(card.memo()).contains("New Card")
        assertThat(card.pendingCommands().getOrNull()).containsExactly("string")
        assertThat(card.productId()).contains("1")
        assertThat(card.replacementFor()).contains("5e9483eb-8103-4e16-9794-2106111b2eca")
        assertThat(card.cvv()).contains("776")
        assertThat(card.pan()).contains("4111111289144142")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val card =
            Card.builder()
                .token("7ef7d65c-9023-4da3-b113-3b8583fd7951")
                .accountToken("f3f4918c-dee9-464d-a819-4aa42901d624")
                .cardProgramToken("5e9483eb-8103-4e16-9794-2106111b2eca")
                .created(OffsetDateTime.parse("2021-06-28T22:53:15Z"))
                .funding(
                    NonPciCard.FundingAccount.builder()
                        .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastFour("xxxx")
                        .state(NonPciCard.FundingAccount.State.DELETED)
                        .type(NonPciCard.FundingAccount.Type.DEPOSITORY_CHECKING)
                        .accountName("account_name")
                        .nickname("x")
                        .build()
                )
                .lastFour("xxxx")
                .pinStatus(NonPciCard.PinStatus.OK)
                .spendLimit(1000L)
                .spendLimitDuration(NonPciCard.SpendLimitDuration.ANNUALLY)
                .state(NonPciCard.State.CLOSED)
                .type(NonPciCard.Type.MERCHANT_LOCKED)
                .addAuthRuleToken("string")
                .cardholderCurrency("USD")
                .digitalCardArtToken("00000000-0000-0000-1000-000000000000")
                .expMonth("06")
                .expYear("2027")
                .hostname("hostname")
                .memo("New Card")
                .addPendingCommand("string")
                .productId("1")
                .replacementFor("5e9483eb-8103-4e16-9794-2106111b2eca")
                .cvv("776")
                .pan("4111111289144142")
                .build()

        val roundtrippedCard =
            jsonMapper.readValue(jsonMapper.writeValueAsString(card), jacksonTypeRef<Card>())

        assertThat(roundtrippedCard).isEqualTo(card)
    }
}
