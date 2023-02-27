package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FundingSourceTest {

    @Test
    fun createFundingSource() {
        val fundingSource =
            FundingSource.builder()
                .accountName("string")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastFour("xxxx")
                .nickname("x")
                .state(FundingSource.State.ENABLED)
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(FundingSource.Type.DEPOSITORY_CHECKING)
                .build()
        assertThat(fundingSource).isNotNull
        assertThat(fundingSource.accountName()).contains("string")
        assertThat(fundingSource.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fundingSource.lastFour()).isEqualTo("xxxx")
        assertThat(fundingSource.nickname()).contains("x")
        assertThat(fundingSource.state()).isEqualTo(FundingSource.State.ENABLED)
        assertThat(fundingSource.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(fundingSource.type()).isEqualTo(FundingSource.Type.DEPOSITORY_CHECKING)
    }
}
