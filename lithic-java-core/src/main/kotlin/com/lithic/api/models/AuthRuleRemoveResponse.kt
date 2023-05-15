package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = AuthRuleRemoveResponse.Builder::class)
@NoAutoDetect
class AuthRuleRemoveResponse
private constructor(
    private val accountTokens: JsonField<List<String>>,
    private val cardTokens: JsonField<List<String>>,
    private val previousAuthRuleTokens: JsonField<List<String>>,
    private val programLevel: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun accountTokens(): Optional<List<String>> =
        Optional.ofNullable(accountTokens.getNullable("account_tokens"))

    fun cardTokens(): Optional<List<String>> =
        Optional.ofNullable(cardTokens.getNullable("card_tokens"))

    fun previousAuthRuleTokens(): Optional<List<String>> =
        Optional.ofNullable(previousAuthRuleTokens.getNullable("previous_auth_rule_tokens"))

    fun programLevel(): Optional<Boolean> =
        Optional.ofNullable(programLevel.getNullable("program_level"))

    @JsonProperty("account_tokens") @ExcludeMissing fun _accountTokens() = accountTokens

    @JsonProperty("card_tokens") @ExcludeMissing fun _cardTokens() = cardTokens

    @JsonProperty("previous_auth_rule_tokens")
    @ExcludeMissing
    fun _previousAuthRuleTokens() = previousAuthRuleTokens

    @JsonProperty("program_level") @ExcludeMissing fun _programLevel() = programLevel

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AuthRuleRemoveResponse = apply {
        if (!validated) {
            accountTokens()
            cardTokens()
            previousAuthRuleTokens()
            programLevel()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthRuleRemoveResponse &&
            this.accountTokens == other.accountTokens &&
            this.cardTokens == other.cardTokens &&
            this.previousAuthRuleTokens == other.previousAuthRuleTokens &&
            this.programLevel == other.programLevel &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountTokens,
                    cardTokens,
                    previousAuthRuleTokens,
                    programLevel,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "AuthRuleRemoveResponse{accountTokens=$accountTokens, cardTokens=$cardTokens, previousAuthRuleTokens=$previousAuthRuleTokens, programLevel=$programLevel, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountTokens: JsonField<List<String>> = JsonMissing.of()
        private var cardTokens: JsonField<List<String>> = JsonMissing.of()
        private var previousAuthRuleTokens: JsonField<List<String>> = JsonMissing.of()
        private var programLevel: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRuleRemoveResponse: AuthRuleRemoveResponse) = apply {
            this.accountTokens = authRuleRemoveResponse.accountTokens
            this.cardTokens = authRuleRemoveResponse.cardTokens
            this.previousAuthRuleTokens = authRuleRemoveResponse.previousAuthRuleTokens
            this.programLevel = authRuleRemoveResponse.programLevel
            additionalProperties(authRuleRemoveResponse.additionalProperties)
        }

        fun accountTokens(accountTokens: List<String>) = accountTokens(JsonField.of(accountTokens))

        @JsonProperty("account_tokens")
        @ExcludeMissing
        fun accountTokens(accountTokens: JsonField<List<String>>) = apply {
            this.accountTokens = accountTokens
        }

        fun cardTokens(cardTokens: List<String>) = cardTokens(JsonField.of(cardTokens))

        @JsonProperty("card_tokens")
        @ExcludeMissing
        fun cardTokens(cardTokens: JsonField<List<String>>) = apply { this.cardTokens = cardTokens }

        fun previousAuthRuleTokens(previousAuthRuleTokens: List<String>) =
            previousAuthRuleTokens(JsonField.of(previousAuthRuleTokens))

        @JsonProperty("previous_auth_rule_tokens")
        @ExcludeMissing
        fun previousAuthRuleTokens(previousAuthRuleTokens: JsonField<List<String>>) = apply {
            this.previousAuthRuleTokens = previousAuthRuleTokens
        }

        fun programLevel(programLevel: Boolean) = programLevel(JsonField.of(programLevel))

        @JsonProperty("program_level")
        @ExcludeMissing
        fun programLevel(programLevel: JsonField<Boolean>) = apply {
            this.programLevel = programLevel
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): AuthRuleRemoveResponse =
            AuthRuleRemoveResponse(
                accountTokens.map { it.toUnmodifiable() },
                cardTokens.map { it.toUnmodifiable() },
                previousAuthRuleTokens.map { it.toUnmodifiable() },
                programLevel,
                additionalProperties.toUnmodifiable(),
            )
    }
}
