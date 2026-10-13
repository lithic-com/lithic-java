// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.authRules

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync
import com.lithic.api.models.AuthRuleEntities
import com.lithic.api.models.AuthRuleEntity
import com.lithic.api.models.AuthRuleV2CreateParams
import com.lithic.api.models.AuthRuleV2DraftParams
import com.lithic.api.models.AuthRuleV2RetrieveFeaturesParams
import com.lithic.api.models.AuthRuleV2RetrieveReportParams
import com.lithic.api.models.AuthRuleV2UpdateEntitiesParams
import com.lithic.api.models.AuthRuleV2UpdateParams
import com.lithic.api.models.EventStream
import com.lithic.api.models.VelocityLimitFilters
import com.lithic.api.models.VelocityLimitParams
import com.lithic.api.models.VelocityLimitPeriod
import java.time.LocalDate
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

        val authRuleFuture =
            v2ServiceAsync.create(
                AuthRuleV2CreateParams.Body.Rule.builder()
                    .entities(
                        AuthRuleEntities.builder()
                            .addExclude(
                                AuthRuleEntity.AuthRuleProgramEntity.builder()
                                    .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                                    .build()
                            )
                            .addInclude(
                                AuthRuleEntity.AuthRuleProgramEntity.builder()
                                    .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                                    .build()
                            )
                            .build()
                    )
                    .parameters(
                        VelocityLimitParams.builder()
                            .period(
                                VelocityLimitPeriod.TrailingWindowObject.builder()
                                    .duration(10L)
                                    .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                                    .build()
                            )
                            .scope(VelocityLimitParams.VelocityScope.CARD)
                            .filters(
                                VelocityLimitFilters.builder()
                                    .addExcludeCountry("USD")
                                    .addExcludeMcc("5542")
                                    .addIncludeCountry("USD")
                                    .addIncludeMcc("5542")
                                    .addIncludePanEntryMode(
                                        VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY
                                    )
                                    .build()
                            )
                            .limitAmount(10000L)
                            .limitCashAmount(5000L)
                            .limitCashCount(0L)
                            .limitCount(0L)
                            .build()
                    )
                    .type(AuthRuleV2CreateParams.Body.Rule.AuthRuleType.VELOCITY_LIMIT)
                    .eventStream(EventStream.AUTHORIZATION)
                    .name("name")
                    .build()
            )

        val authRule = authRuleFuture.get()
        authRule.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val authRuleFuture = v2ServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val authRule = authRuleFuture.get()
        authRule.validate()
    }

    @Test
    fun update() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val authRuleFuture =
            v2ServiceAsync.update(
                AuthRuleV2UpdateParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .body(
                        AuthRuleV2UpdateParams.Body.Rule.builder()
                            .entities(
                                AuthRuleEntities.builder()
                                    .addExclude(
                                        AuthRuleEntity.AuthRuleProgramEntity.builder()
                                            .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                                            .build()
                                    )
                                    .addInclude(
                                        AuthRuleEntity.AuthRuleProgramEntity.builder()
                                            .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                                            .build()
                                    )
                                    .build()
                            )
                            .name("name")
                            .state(AuthRuleV2UpdateParams.Body.Rule.State.INACTIVE)
                            .build()
                    )
                    .build()
            )

        val authRule = authRuleFuture.get()
        authRule.validate()
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

        val future = v2ServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Test
    fun draft() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val authRuleFuture =
            v2ServiceAsync.draft(
                AuthRuleV2DraftParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .parameters(
                        VelocityLimitParams.builder()
                            .period(
                                VelocityLimitPeriod.TrailingWindowObject.builder()
                                    .duration(10L)
                                    .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                                    .build()
                            )
                            .scope(VelocityLimitParams.VelocityScope.CARD)
                            .filters(
                                VelocityLimitFilters.builder()
                                    .addExcludeCountry("USD")
                                    .addExcludeMcc("5542")
                                    .addIncludeCountry("USD")
                                    .addIncludeMcc("5542")
                                    .addIncludePanEntryMode(
                                        VelocityLimitFilters.IncludePanEntryMode.AUTO_ENTRY
                                    )
                                    .build()
                            )
                            .limitAmount(10000L)
                            .limitCashAmount(5000L)
                            .limitCashCount(0L)
                            .limitCount(0L)
                            .build()
                    )
                    .build()
            )

        val authRule = authRuleFuture.get()
        authRule.validate()
    }

    @Test
    fun listResults() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val pageFuture = v2ServiceAsync.listResults()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun listVersions() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val responseFuture = v2ServiceAsync.listVersions("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

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

        val authRuleFuture = v2ServiceAsync.promote("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val authRule = authRuleFuture.get()
        authRule.validate()
    }

    @Test
    fun retrieveFeatures() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val responseFuture =
            v2ServiceAsync.retrieveFeatures(
                AuthRuleV2RetrieveFeaturesParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun retrieveReport() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val responseFuture =
            v2ServiceAsync.retrieveReport(
                AuthRuleV2RetrieveReportParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .begin(LocalDate.parse("2019-12-27"))
                    .end(LocalDate.parse("2019-12-27"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun updateEntities() {
        val client =
            LithicOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My Lithic API Key")
                .build()
        val v2ServiceAsync = client.authRules().v2()

        val authRuleFuture =
            v2ServiceAsync.updateEntities(
                AuthRuleV2UpdateEntitiesParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .add(
                        AuthRuleEntities.builder()
                            .addExclude(
                                AuthRuleEntity.AuthRuleProgramEntity.builder()
                                    .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                                    .build()
                            )
                            .addInclude(
                                AuthRuleEntity.AuthRuleProgramEntity.builder()
                                    .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                                    .build()
                            )
                            .build()
                    )
                    .remove(
                        AuthRuleEntities.builder()
                            .addExclude(
                                AuthRuleEntity.AuthRuleProgramEntity.builder()
                                    .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                                    .build()
                            )
                            .addInclude(
                                AuthRuleEntity.AuthRuleProgramEntity.builder()
                                    .type(AuthRuleEntity.AuthRuleProgramEntity.Type.PROGRAM)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val authRule = authRuleFuture.get()
        authRule.validate()
    }
}
