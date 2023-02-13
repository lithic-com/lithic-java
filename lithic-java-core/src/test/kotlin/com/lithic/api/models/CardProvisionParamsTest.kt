package com.lithic.api.models

import com.lithic.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardProvisionParamsTest {

    @Test
    fun createCardProvisionParams() {
        CardProvisionParams.builder()
            .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .digitalWallet(CardProvisionParams.DigitalWallet.APPLE_PAY)
            .nonce("U3RhaW5sZXNzIHJvY2tz")
            .nonceSignature("U3RhaW5sZXNzIHJvY2tz")
            .certificate("U3RhaW5sZXNzIHJvY2tz")
            .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CardProvisionParams.builder()
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .digitalWallet(CardProvisionParams.DigitalWallet.APPLE_PAY)
                .nonce("U3RhaW5sZXNzIHJvY2tz")
                .nonceSignature("U3RhaW5sZXNzIHJvY2tz")
                .certificate("U3RhaW5sZXNzIHJvY2tz")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.digitalWallet()).isEqualTo(CardProvisionParams.DigitalWallet.APPLE_PAY)
        assertThat(body.nonce()).isEqualTo("U3RhaW5sZXNzIHJvY2tz")
        assertThat(body.nonceSignature()).isEqualTo("U3RhaW5sZXNzIHJvY2tz")
        assertThat(body.certificate()).isEqualTo("U3RhaW5sZXNzIHJvY2tz")
        assertThat(body.accountToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CardProvisionParams.builder().cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            CardProvisionParams.builder().cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        assertThat(params).isNotNull
        // path param "cardToken"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
