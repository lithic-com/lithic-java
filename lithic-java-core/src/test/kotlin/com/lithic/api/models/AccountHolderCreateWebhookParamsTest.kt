package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountHolderCreateWebhookParamsTest {

    @Test
    fun createAccountHolderCreateWebhookParams() {
        AccountHolderCreateWebhookParams.builder().url("string").build()
    }

    @Test
    fun toBody() {
        val params = AccountHolderCreateWebhookParams.builder().url("string").build()
        val body = params.toBody()
        assertThat(body).isNotNull
        assertThat(body.url()).isEqualTo("string")
    }

    @Test
    fun toBodyWithoutOptionalFields() {
        val params = AccountHolderCreateWebhookParams.builder().url("string").build()
        val body = params.toBody()
        assertThat(body).isNotNull
        assertThat(body.url()).isEqualTo("string")
    }
}
