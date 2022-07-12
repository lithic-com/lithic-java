package com.lithic.api.services

import com.lithic.api.client.okhttp.LithicClient
import com.lithic.api.models.*
import com.lithic.api.models.AuthRuleListParams
import org.junit.jupiter.api.Test

class AuthRuleServiceTest {
    @Test
    fun callCreate() {
        val client =
            LithicClient.builder().baseUrl("http://127.0.0.1:4010").apiKey("test-api-key").build()
        val authRuleService = client.authRules
        val authRuleCreateResponse =
            authRuleService.create(
                AuthRuleCreateParams.builder()
                    .allowedMcc(listOf("string"))
                    .blockedMcc(listOf("string"))
                    .allowedCountries(listOf("string"))
                    .blockedCountries(listOf("string"))
                    .avsType(AuthRuleCreateParams.AvsType.ZIP_ONLY)
                    .accountTokens(listOf("string"))
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
            LithicClient.builder().baseUrl("http://127.0.0.1:4010").apiKey("test-api-key").build()
        val authRuleService = client.authRules
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
            LithicClient.builder().baseUrl("http://127.0.0.1:4010").apiKey("test-api-key").build()
        val authRuleService = client.authRules
        val authRuleUpdateResponse =
            authRuleService.update(
                AuthRuleUpdateParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .allowedMcc(listOf("string"))
                    .blockedMcc(listOf("string"))
                    .allowedCountries(listOf("string"))
                    .blockedCountries(listOf("string"))
                    .avsType(AuthRuleUpdateParams.AvsType.ZIP_ONLY)
                    .build()
            )
        println(authRuleUpdateResponse)
        authRuleUpdateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            LithicClient.builder().baseUrl("http://127.0.0.1:4010").apiKey("test-api-key").build()
        val authRuleService = client.authRules
        val response = authRuleService.list(AuthRuleListParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callApply() {
        val client =
            LithicClient.builder().baseUrl("http://127.0.0.1:4010").apiKey("test-api-key").build()
        val authRuleService = client.authRules
        val authRuleApplyResponse =
            authRuleService.apply(
                AuthRuleApplyParams.builder()
                    .authRuleToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .cardTokens(listOf("string"))
                    .accountTokens(listOf("string"))
                    .programLevel(true)
                    .build()
            )
        println(authRuleApplyResponse)
        authRuleApplyResponse.validate()
    }

    @Test
    fun callRemove() {
        val client =
            LithicClient.builder().baseUrl("http://127.0.0.1:4010").apiKey("test-api-key").build()
        val authRuleService = client.authRules
        val authRuleRemoveResponse =
            authRuleService.remove(
                AuthRuleRemoveParams.builder()
                    .cardTokens(listOf("string"))
                    .accountTokens(listOf("string"))
                    .programLevel(true)
                    .build()
            )
        println(authRuleRemoveResponse)
        authRuleRemoveResponse.validate()
    }
}
