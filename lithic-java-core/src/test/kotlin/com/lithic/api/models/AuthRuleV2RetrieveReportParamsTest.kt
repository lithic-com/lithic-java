// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRuleV2RetrieveReportParamsTest {

    @Test
    fun create() {
        AuthRuleV2RetrieveReportParams.builder()
            .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .begin(LocalDate.parse("2019-12-27"))
            .end(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AuthRuleV2RetrieveReportParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .begin(LocalDate.parse("2019-12-27"))
                .end(LocalDate.parse("2019-12-27"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AuthRuleV2RetrieveReportParams.builder()
                .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .begin(LocalDate.parse("2019-12-27"))
                .end(LocalDate.parse("2019-12-27"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("begin", "2019-12-27").put("end", "2019-12-27").build()
            )
    }
}
