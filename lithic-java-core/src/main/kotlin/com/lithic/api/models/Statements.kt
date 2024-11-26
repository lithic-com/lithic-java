// File generated from our OpenAPI spec by Stainless.

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
import com.lithic.api.core.toImmutable
import java.util.Objects

@JsonDeserialize(builder = Statements.Builder::class)
@NoAutoDetect
class Statements
private constructor(
    private val data: JsonField<List<Statement>>,
    private val hasMore: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun data(): List<Statement> = data.getRequired("data")

    fun hasMore(): Boolean = hasMore.getRequired("has_more")

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonProperty("has_more") @ExcludeMissing fun _hasMore() = hasMore

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Statements = apply {
        if (!validated) {
            data().forEach { it.validate() }
            hasMore()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Statement>> = JsonMissing.of()
        private var hasMore: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(statements: Statements) = apply {
            this.data = statements.data
            this.hasMore = statements.hasMore
            additionalProperties(statements.additionalProperties)
        }

        fun data(data: List<Statement>) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<Statement>>) = apply { this.data = data }

        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        @JsonProperty("has_more")
        @ExcludeMissing
        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

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

        fun build(): Statements =
            Statements(
                data.map { it.toImmutable() },
                hasMore,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Statements && data == other.data && hasMore == other.hasMore && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, hasMore, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Statements{data=$data, hasMore=$hasMore, additionalProperties=$additionalProperties}"
}
