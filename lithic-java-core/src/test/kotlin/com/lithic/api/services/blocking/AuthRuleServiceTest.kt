package com.lithic.api.services.blocking

import com.lithic.api.TestServerExtension
import com.lithic.api.client.okhttp.LithicOkHttpClient
import com.lithic.api.models.*
import com.lithic.api.models.AuthRuleListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AuthRuleServiceTest {

    @Test
    fun callCreate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val authRuleService = client.authRules()
        val authRuleCreateResponse =
            authRuleService.create(
                AuthRuleCreateParams.builder()
                    .accountTokens(listOf("string"))
                    .allowedCountries(listOf("string"))
                    .allowedMcc(listOf("string"))
                    .blockedCountries(listOf("string"))
                    .blockedMcc(listOf("string"))
                    .cardTokens(listOf("string"))
                    .programLevel(true)
                    .build()
            )
        println(authRuleCreateResponse)
        authRuleCreateResponse.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val authRuleService = client.authRules()
        val authRuleRetrieveResponse =
            authRuleService.retrieve(
                AuthRuleRetrieveParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(authRuleRetrieveResponse)
        authRuleRetrieveResponse.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val authRuleService = client.authRules()
        val authRuleUpdateResponse =
            authRuleService.update(
                AuthRuleUpdateParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .allowedCountries(listOf("string"))
                    .allowedMcc(listOf("string"))
                    .blockedCountries(listOf("string"))
                    .blockedMcc(listOf("string"))
                    .build()
            )
        println(authRuleUpdateResponse)
        authRuleUpdateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val authRuleService = client.authRules()
        val response = authRuleService.list(AuthRuleListParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callApply() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val authRuleService = client.authRules()
        val authRuleApplyResponse =
            authRuleService.apply(
                AuthRuleApplyParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountTokens(listOf("string"))
                    .cardTokens(listOf("string"))
                    .programLevel(true)
                    .build()
            )
        println(authRuleApplyResponse)
        authRuleApplyResponse.validate()
    }

    @Test
    fun callRemove() {
        val client =
            LithicOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val authRuleService = client.authRules()
        val authRuleRemoveResponse =
            authRuleService.remove(
                AuthRuleRemoveParams.builder()
                    .accountTokens(listOf("string"))
                    .cardTokens(listOf("string"))
                    .programLevel(true)
                    .build()
            )
        println(authRuleRemoveResponse)
        authRuleRemoveResponse.validate()
    }
}
