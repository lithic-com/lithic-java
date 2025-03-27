// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.authrules

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.authrules.v2.AuthRuleCondition
import com.lithic.api.models.authrules.v2.ConditionalAttribute
import com.lithic.api.models.authrules.v2.ConditionalBlockParameters
import com.lithic.api.models.authrules.v2.V2ApplyParams
import com.lithic.api.models.authrules.v2.V2CreateParams
import com.lithic.api.models.authrules.v2.V2DeleteParams
import com.lithic.api.models.authrules.v2.V2DraftParams
import com.lithic.api.models.authrules.v2.V2PromoteParams
import com.lithic.api.models.authrules.v2.V2ReportParams
import com.lithic.api.models.authrules.v2.V2RetrieveParams
import com.lithic.api.models.authrules.v2.V2UpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V2ServiceAsyncTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val v2Future =
            v2ServiceAsync.create(
                V2CreateParams.builder()
                    .body(
                        V2CreateParams.Body.CreateAuthRuleRequestAccountTokens.builder()
                            .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .parameters(
                                ConditionalBlockParameters.builder()
                                    .addCondition(
                                        AuthRuleCondition.builder()
                                            .attribute(ConditionalAttribute.MCC)
                                            .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                            .value("string")
                                            .build()
                                    )
                                    .build()
                            )
                            .type(
                                V2CreateParams.Body.CreateAuthRuleRequestAccountTokens.AuthRuleType
                                    .CONDITIONAL_BLOCK
                            )
                            .build()
                    )
                    .build()
            )

        val v2 = v2Future.get()
        v2.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val v2Future =
            v2ServiceAsync.retrieve(
                V2RetrieveParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val v2 = v2Future.get()
        v2.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val v2Future =
            v2ServiceAsync.update(
                V2UpdateParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .body(
                        V2UpdateParams.Body.AccountLevelRule.builder()
                            .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .state(V2UpdateParams.Body.AccountLevelRule.State.INACTIVE)
                            .build()
                    )
                    .build()
            )

        val v2 = v2Future.get()
        v2.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val pageFuture = v2ServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val future =
            v2ServiceAsync.delete(
                V2DeleteParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun apply() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val responseFuture =
            v2ServiceAsync.apply(
                V2ApplyParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .body(
                        V2ApplyParams.Body.ApplyAuthRuleRequestAccountTokens.builder()
                            .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun draft() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val responseFuture =
            v2ServiceAsync.draft(
                V2DraftParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .parameters(
                        ConditionalBlockParameters.builder()
                            .addCondition(
                                AuthRuleCondition.builder()
                                    .attribute(ConditionalAttribute.MCC)
                                    .operation(AuthRuleCondition.Operation.IS_ONE_OF)
                                    .value("string")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun promote() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val responseFuture =
            v2ServiceAsync.promote(
                V2PromoteParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun report() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val responseFuture =
            v2ServiceAsync.report(
                V2ReportParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
