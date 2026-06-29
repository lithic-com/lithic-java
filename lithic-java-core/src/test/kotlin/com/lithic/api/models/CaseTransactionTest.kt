// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.JsonValue
import com.lithic.api.core.jsonMapper
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class CaseTransactionTest {

    @Test
    fun ofCard() {
        val card =
            CaseTransaction.CardCaseTransaction.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(CaseTransaction.CardCaseTransaction.Category.CARD)
                .transactionCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val caseTransaction = CaseTransaction.ofCard(card)

        assertThat(caseTransaction.card()).contains(card)
        assertThat(caseTransaction.payment()).isEmpty
    }

    @Test
    fun ofCardRoundtrip() {
        val jsonMapper = jsonMapper()
        val caseTransaction =
            CaseTransaction.ofCard(
                CaseTransaction.CardCaseTransaction.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .category(CaseTransaction.CardCaseTransaction.Category.CARD)
                    .transactionCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val roundtrippedCaseTransaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(caseTransaction),
                jacksonTypeRef<CaseTransaction>(),
            )

        assertThat(roundtrippedCaseTransaction).isEqualTo(caseTransaction)
    }

    @Test
    fun ofPayment() {
        val payment =
            CaseTransaction.PaymentCaseTransaction.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .category(CaseTransaction.PaymentCaseTransaction.Category.PAYMENT)
                .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val caseTransaction = CaseTransaction.ofPayment(payment)

        assertThat(caseTransaction.card()).isEmpty
        assertThat(caseTransaction.payment()).contains(payment)
    }

    @Test
    fun ofPaymentRoundtrip() {
        val jsonMapper = jsonMapper()
        val caseTransaction =
            CaseTransaction.ofPayment(
                CaseTransaction.PaymentCaseTransaction.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .category(CaseTransaction.PaymentCaseTransaction.Category.PAYMENT)
                    .financialAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .transactionCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val roundtrippedCaseTransaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(caseTransaction),
                jacksonTypeRef<CaseTransaction>(),
            )

        assertThat(roundtrippedCaseTransaction).isEqualTo(caseTransaction)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val caseTransaction =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<CaseTransaction>())

        val e = assertThrows<LithicInvalidDataException> { caseTransaction.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
