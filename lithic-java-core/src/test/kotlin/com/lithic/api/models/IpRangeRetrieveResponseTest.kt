// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpRangeRetrieveResponseTest {

    @Test
    fun create() {
        val ipRangeRetrieveResponse =
            IpRangeRetrieveResponse.builder()
                .addResponder("3.130.20.154/32")
                .addResponder("18.227.57.16/32")
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(ipRangeRetrieveResponse.responders())
            .containsExactly("3.130.20.154/32", "18.227.57.16/32")
        assertThat(ipRangeRetrieveResponse.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ipRangeRetrieveResponse =
            IpRangeRetrieveResponse.builder()
                .addResponder("3.130.20.154/32")
                .addResponder("18.227.57.16/32")
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedIpRangeRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ipRangeRetrieveResponse),
                jacksonTypeRef<IpRangeRetrieveResponse>(),
            )

        assertThat(roundtrippedIpRangeRetrieveResponse).isEqualTo(ipRangeRetrieveResponse)
    }
}
