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
import com.lithic.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = CardProgram.Builder::class)
@NoAutoDetect
class CardProgram
private constructor(
    private val created: JsonField<OffsetDateTime>,
    private val token: JsonField<String>,
    private val panRangeStart: JsonField<String>,
    private val panRangeEnd: JsonField<String>,
    private val name: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Timestamp of when the card program was created. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /** The first digits of the card number that this card program starts with. */
    fun panRangeStart(): String = panRangeStart.getRequired("pan_range_start")

    /** The first digits of the card number that this card program ends with. */
    fun panRangeEnd(): String = panRangeEnd.getRequired("pan_range_end")

    /** The name of the card program. */
    fun name(): String = name.getRequired("name")

    /** Timestamp of when the card program was created. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** The first digits of the card number that this card program starts with. */
    @JsonProperty("pan_range_start") @ExcludeMissing fun _panRangeStart() = panRangeStart

    /** The first digits of the card number that this card program ends with. */
    @JsonProperty("pan_range_end") @ExcludeMissing fun _panRangeEnd() = panRangeEnd

    /** The name of the card program. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CardProgram = apply {
        if (!validated) {
            created()
            token()
            panRangeStart()
            panRangeEnd()
            name()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardProgram &&
            this.created == other.created &&
            this.token == other.token &&
            this.panRangeStart == other.panRangeStart &&
            this.panRangeEnd == other.panRangeEnd &&
            this.name == other.name &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    created,
                    token,
                    panRangeStart,
                    panRangeEnd,
                    name,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CardProgram{created=$created, token=$token, panRangeStart=$panRangeStart, panRangeEnd=$panRangeEnd, name=$name, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var panRangeStart: JsonField<String> = JsonMissing.of()
        private var panRangeEnd: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardProgram: CardProgram) = apply {
            this.created = cardProgram.created
            this.token = cardProgram.token
            this.panRangeStart = cardProgram.panRangeStart
            this.panRangeEnd = cardProgram.panRangeEnd
            this.name = cardProgram.name
            additionalProperties(cardProgram.additionalProperties)
        }

        /** Timestamp of when the card program was created. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when the card program was created. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** The first digits of the card number that this card program starts with. */
        fun panRangeStart(panRangeStart: String) = panRangeStart(JsonField.of(panRangeStart))

        /** The first digits of the card number that this card program starts with. */
        @JsonProperty("pan_range_start")
        @ExcludeMissing
        fun panRangeStart(panRangeStart: JsonField<String>) = apply {
            this.panRangeStart = panRangeStart
        }

        /** The first digits of the card number that this card program ends with. */
        fun panRangeEnd(panRangeEnd: String) = panRangeEnd(JsonField.of(panRangeEnd))

        /** The first digits of the card number that this card program ends with. */
        @JsonProperty("pan_range_end")
        @ExcludeMissing
        fun panRangeEnd(panRangeEnd: JsonField<String>) = apply { this.panRangeEnd = panRangeEnd }

        /** The name of the card program. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the card program. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun build(): CardProgram =
            CardProgram(
                created,
                token,
                panRangeStart,
                panRangeEnd,
                name,
                additionalProperties.toUnmodifiable(),
            )
    }
}
