// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.authrules

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
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
internal class V2ServiceTest {

    @Test
    fun create() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()

        val v2 =
            v2Service.create(
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

        v2.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()

        val v2 =
            v2Service.retrieve(
                V2RetrieveParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        v2.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()

        val v2 =
            v2Service.update(
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

        v2.validate()
    }

    @Test
    fun list() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()

        val page = v2Service.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()

        v2Service.delete(
            V2DeleteParams.builder().authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        )
    }

    @Test
    fun apply() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()

        val response =
            v2Service.apply(
                V2ApplyParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .body(
                        V2ApplyParams.Body.ApplyAuthRuleRequestAccountTokens.builder()
                            .addAccountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    fun draft() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()

        val response =
            v2Service.draft(
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

        response.validate()
    }

    @Test
    fun promote() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()

        val response =
            v2Service.promote(
                V2PromoteParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Test
    fun report() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()

        val response =
            v2Service.report(
                V2ReportParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
