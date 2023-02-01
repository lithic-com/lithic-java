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

@JsonDeserialize(builder = AccountHolderListDocumentsResponse.Builder::class)
@NoAutoDetect
class AccountHolderListDocumentsResponse
private constructor(
    private val data: JsonField<List<AccountHolderDocument>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun data(): Optional<List<AccountHolderDocument>> =
        Optional.ofNullable(data.getNullable("data"))

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            data().map { it.forEach { it.validate() } }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountHolderListDocumentsResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(data, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "AccountHolderListDocumentsResponse{data=$data, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<AccountHolderDocument>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountHolderListDocumentsResponse: AccountHolderListDocumentsResponse) =
            apply {
                this.data = accountHolderListDocumentsResponse.data
                additionalProperties(accountHolderListDocumentsResponse.additionalProperties)
            }

        fun data(data: List<AccountHolderDocument>) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<AccountHolderDocument>>) = apply { this.data = data }

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

        fun build(): AccountHolderListDocumentsResponse =
            AccountHolderListDocumentsResponse(
                data.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable()
            )
    }
}
