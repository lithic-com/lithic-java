// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.authRules

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.AuthRuleCondition
import com.lithic.api.models.AuthRuleV2ApplyParams
import com.lithic.api.models.AuthRuleV2CreateParams
import com.lithic.api.models.AuthRuleV2DraftParams
import com.lithic.api.models.AuthRuleV2ListParams
import com.lithic.api.models.AuthRuleV2PromoteParams
import com.lithic.api.models.AuthRuleV2ReportParams
import com.lithic.api.models.AuthRuleV2RetrieveParams
import com.lithic.api.models.AuthRuleV2UpdateParams
import com.lithic.api.models.ConditionalAttribute
import com.lithic.api.models.ConditionalBlockParameters
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class V2ServiceTest {

    @Test
    fun callCreate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()
        val v2CreateResponse =
            v2Service.create(
                AuthRuleV2CreateParams.builder()
                    .forCreateAuthRuleRequestAccountTokens(
                        AuthRuleV2CreateParams.CreateAuthRuleRequestAccountTokens.builder()
                            .accountTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                            .name("name")
                            .parameters(
                                AuthRuleV2CreateParams.CreateAuthRuleRequestAccountTokens.Parameters
                                    .ofConditionalBlockParameters(
                                        ConditionalBlockParameters.builder()
                                            .addCondition(
                                                AuthRuleCondition.builder()
                                                    .attribute(ConditionalAttribute.MCC)
                                                    .operation(
                                                        AuthRuleCondition.Operation.IS_ONE_OF
                                                    )
                                                    .value("string")
                                                    .build()
                                            )
                                            .build()
                                    )
                            )
                            .type(
                                AuthRuleV2CreateParams.CreateAuthRuleRequestAccountTokens
                                    .AuthRuleType
                                    .CONDITIONAL_BLOCK
                            )
                            .build()
                    )
                    .build()
            )
        println(v2CreateResponse)
        v2CreateResponse.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()
        val v2RetrieveResponse =
            v2Service.retrieve(
                AuthRuleV2RetrieveParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(v2RetrieveResponse)
        v2RetrieveResponse.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()
        val v2UpdateResponse =
            v2Service.update(
                AuthRuleV2UpdateParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .state(AuthRuleV2UpdateParams.State.INACTIVE)
                    .build()
            )
        println(v2UpdateResponse)
        v2UpdateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()
        val response = v2Service.list(AuthRuleV2ListParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callApply() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()
        val v2ApplyResponse =
            v2Service.apply(
                AuthRuleV2ApplyParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .forApplyAuthRuleRequestAccountTokens(
                        AuthRuleV2ApplyParams.ApplyAuthRuleRequestAccountTokens.builder()
                            .accountTokens(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                            .build()
                    )
                    .build()
            )
        println(v2ApplyResponse)
        v2ApplyResponse.validate()
    }

    @Test
    fun callDraft() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()
        val v2DraftResponse =
            v2Service.draft(
                AuthRuleV2DraftParams.builder()
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
        println(v2DraftResponse)
        v2DraftResponse.validate()
    }

    @Test
    fun callPromote() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()
        val v2PromoteResponse =
            v2Service.promote(
                AuthRuleV2PromoteParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(v2PromoteResponse)
        v2PromoteResponse.validate()
    }

    @Test
    fun callReport() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2Service = client.authRules().v2()
        val v2ReportResponse =
            v2Service.report(
                AuthRuleV2ReportParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(v2ReportResponse)
        v2ReportResponse.validate()
    }
}
