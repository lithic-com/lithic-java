package com.lithic.api.models

import com.lithic.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransferCreateParamsTest {

    @Test
    fun createTransferCreateParams() {
        TransferCreateParams.builder()
            .from(
                FinancialAccount.builder()
                    .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(FinancialAccount.Type.ISSUING)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .accountNumber("string")
                    .routingNumber("string")
                    .build()
            )
            .to(
                FinancialAccount.builder()
                    .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(FinancialAccount.Type.ISSUING)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .accountNumber("string")
                    .routingNumber("string")
                    .build()
            )
            .amount(123L)
            .memo("string")
            .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TransferCreateParams.builder()
                .from(
                    FinancialAccount.builder()
                        .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(FinancialAccount.Type.ISSUING)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .accountNumber("string")
                        .routingNumber("string")
                        .build()
                )
                .to(
                    FinancialAccount.builder()
                        .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(FinancialAccount.Type.ISSUING)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .accountNumber("string")
                        .routingNumber("string")
                        .build()
                )
                .amount(123L)
                .memo("string")
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.from())
            .isEqualTo(
                FinancialAccount.builder()
                    .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(FinancialAccount.Type.ISSUING)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .accountNumber("string")
                    .routingNumber("string")
                    .build()
            )
        assertThat(body.to())
            .isEqualTo(
                FinancialAccount.builder()
                    .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(FinancialAccount.Type.ISSUING)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .accountNumber("string")
                    .routingNumber("string")
                    .build()
            )
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.memo()).isEqualTo("string")
        assertThat(body.transactionToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            TransferCreateParams.builder()
                .from(
                    FinancialAccount.builder()
                        .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(FinancialAccount.Type.ISSUING)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .to(
                    FinancialAccount.builder()
                        .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(FinancialAccount.Type.ISSUING)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .amount(123L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.from())
            .isEqualTo(
                FinancialAccount.builder()
                    .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(FinancialAccount.Type.ISSUING)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(body.to())
            .isEqualTo(
                FinancialAccount.builder()
                    .token("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(FinancialAccount.Type.ISSUING)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(body.amount()).isEqualTo(123L)
    }
}
