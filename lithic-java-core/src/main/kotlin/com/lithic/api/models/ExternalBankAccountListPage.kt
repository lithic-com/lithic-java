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
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.services.blocking.ExternalBankAccountService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

/** List all the external bank accounts for the provided search criteria. */
class ExternalBankAccountListPage
private constructor(
    private val externalBankAccountsService: ExternalBankAccountService,
    private val params: ExternalBankAccountListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<ExternalBankAccountListResponse> = response().data()

    fun hasMore(): Boolean = response().hasMore()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalBankAccountListPage && externalBankAccountsService == other.externalBankAccountsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalBankAccountsService, params, response) /* spotless:on */

    override fun toString() =
        "ExternalBankAccountListPage{externalBankAccountsService=$externalBankAccountsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !data().isEmpty()
    }

    fun getNextPageParams(): Optional<ExternalBankAccountListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return if (params.endingBefore().isPresent) {
            Optional.of(
                ExternalBankAccountListParams.builder()
                    .from(params)
                    .endingBefore(data().first().token())
                    .build()
            )
        } else {
            Optional.of(
                ExternalBankAccountListParams.builder()
                    .from(params)
                    .startingAfter(data().last().token())
                    .build()
            )
        }
    }

    fun getNextPage(): Optional<ExternalBankAccountListPage> {
        return getNextPageParams().map { externalBankAccountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            externalBankAccountsService: ExternalBankAccountService,
            params: ExternalBankAccountListParams,
            response: Response
        ) =
            ExternalBankAccountListPage(
                externalBankAccountsService,
                params,
                response,
            )
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("data")
        private val data: JsonField<List<ExternalBankAccountListResponse>> = JsonMissing.of(),
        @JsonProperty("has_more") private val hasMore: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun data(): List<ExternalBankAccountListResponse> = data.getNullable("data") ?: listOf()

        fun hasMore(): Boolean = hasMore.getRequired("has_more")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<ExternalBankAccountListResponse>>> =
            Optional.ofNullable(data)

        @JsonProperty("has_more")
        fun _hasMore(): Optional<JsonField<Boolean>> = Optional.ofNullable(hasMore)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            data().map { it.validate() }
            hasMore()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && data == other.data && hasMore == other.hasMore && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(data, hasMore, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{data=$data, hasMore=$hasMore, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<ExternalBankAccountListResponse>> = JsonMissing.of()
            private var hasMore: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.hasMore = page.hasMore
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<ExternalBankAccountListResponse>) = data(JsonField.of(data))

            fun data(data: JsonField<List<ExternalBankAccountListResponse>>) = apply {
                this.data = data
            }

            fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

            fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    data,
                    hasMore,
                    additionalProperties.toImmutable(),
                )
        }
    }

    class AutoPager(
        private val firstPage: ExternalBankAccountListPage,
    ) : Iterable<ExternalBankAccountListResponse> {

        override fun iterator(): Iterator<ExternalBankAccountListResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().orElse(null) ?: break
                index = 0
            }
        }

        fun stream(): Stream<ExternalBankAccountListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
