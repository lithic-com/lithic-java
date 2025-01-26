// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.checkRequired
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class ConditionalBlockParameters
@JsonCreator
private constructor(
    @JsonProperty("conditions")
    @ExcludeMissing
    private val conditions: JsonField<List<AuthRuleCondition>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun conditions(): List<AuthRuleCondition> = conditions.getRequired("conditions")

    @JsonProperty("conditions")
    @ExcludeMissing
    fun _conditions(): JsonField<List<AuthRuleCondition>> = conditions

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ConditionalBlockParameters = apply {
        if (validated) {
            return@apply
        }

        conditions().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var conditions: JsonField<MutableList<AuthRuleCondition>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(conditionalBlockParameters: ConditionalBlockParameters) = apply {
            conditions = conditionalBlockParameters.conditions.map { it.toMutableList() }
            additionalProperties = conditionalBlockParameters.additionalProperties.toMutableMap()
        }

        fun conditions(conditions: List<AuthRuleCondition>) = conditions(JsonField.of(conditions))

        fun conditions(conditions: JsonField<List<AuthRuleCondition>>) = apply {
            this.conditions = conditions.map { it.toMutableList() }
        }

        fun addCondition(condition: AuthRuleCondition) = apply {
            conditions =
                (conditions ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(condition)
                }
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): ConditionalBlockParameters =
            ConditionalBlockParameters(
                checkRequired("conditions", conditions).map { it.toImmutable() },
                additionalProperties.toImmutable()
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConditionalBlockParameters && conditions == other.conditions && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(conditions, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConditionalBlockParameters{conditions=$conditions, additionalProperties=$additionalProperties}"
}
