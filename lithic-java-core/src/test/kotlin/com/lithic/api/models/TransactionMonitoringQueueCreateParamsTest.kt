// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionMonitoringQueueCreateParamsTest {

    @Test
    fun create() {
        TransactionMonitoringQueueCreateParams.builder()
            .name("name")
            .addAllowedResolution("x")
            .description("description")
            .build()
    }

    @Test
    fun body() {
        val params =
            TransactionMonitoringQueueCreateParams.builder()
                .name("name")
                .addAllowedResolution("x")
                .description("description")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.allowedResolutions().getOrNull()).containsExactly("x")
        assertThat(body.description()).contains("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TransactionMonitoringQueueCreateParams.builder().name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
