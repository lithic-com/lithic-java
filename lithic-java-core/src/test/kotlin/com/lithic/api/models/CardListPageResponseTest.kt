// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardListPageResponseTest {

    @Test
    fun create() {
        val cardListPageResponse =
            CardListPageResponse.builder()
                .addData(
                    NonPciCard.builder()
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
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(cardListPageResponse.data())
            .containsExactly(
                NonPciCard.builder()
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
                    .build()
            )
        assertThat(cardListPageResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardListPageResponse =
            CardListPageResponse.builder()
                .addData(
                    NonPciCard.builder()
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
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedCardListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardListPageResponse),
                jacksonTypeRef<CardListPageResponse>(),
            )

        assertThat(roundtrippedCardListPageResponse).isEqualTo(cardListPageResponse)
    }
}
