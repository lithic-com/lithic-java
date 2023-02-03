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
import com.lithic.api.services.async.FundingSourceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture

class FundingSourceListPageAsync
private constructor(
    private val fundingSourcesService: FundingSourceServiceAsync,
    private val params: FundingSourceListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<FundingSource> = response().data()

    fun page(): Long = response().page()

    fun totalEntries(): Long = response().totalEntries()

    fun totalPages(): Long = response().totalPages()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FundingSourceListPageAsync &&
            this.fundingSourcesService == other.fundingSourcesService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            fundingSourcesService,
            params,
            response,
        )
    }

    override fun toString() =
        "FundingSourceListPageAsync{fundingSourcesService=$fundingSourcesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = this.data().isNotEmpty() && this.page() < this.totalPages()

    fun getNextPageParams(): Optional<FundingSourceListParams> {
        return if (hasNextPage()) {
            Optional.of(
                FundingSourceListParams.builder()
                    .from(params)
                    .page(params.page().orElse(0) + 1)
                    .build()
            )
        } else {
            Optional.empty()
        }
    }

    fun getNextPage(): CompletableFuture<Optional<FundingSourceListPageAsync>> {
        return getNextPageParams()
            .map { fundingSourcesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    companion object {

        @JvmStatic
        fun of(
            fundingSourcesService: FundingSourceServiceAsync,
            params: FundingSourceListParams,
            response: Response
        ) =
            FundingSourceListPageAsync(
                fundingSourcesService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<FundingSource>>,
        private val page: JsonField<Long>,
        private val totalEntries: JsonField<Long>,
        private val totalPages: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<FundingSource> = data.getRequired("data")

        fun page(): Long = page.getRequired("page")

        fun totalEntries(): Long = totalEntries.getRequired("total_entries")

        fun totalPages(): Long = totalPages.getRequired("total_pages")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<FundingSource>>> = Optional.ofNullable(data)

        @JsonProperty("page") fun _page(): Optional<JsonField<Long>> = Optional.ofNullable(page)

        @JsonProperty("total_entries")
        fun _totalEntries(): Optional<JsonField<Long>> = Optional.ofNullable(totalEntries)

        @JsonProperty("total_pages")
        fun _totalPages(): Optional<JsonField<Long>> = Optional.ofNullable(totalPages)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                data().forEach { it.validate() }
                page()
                totalEntries()
                totalPages()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.data == other.data &&
                this.page == other.page &&
                this.totalEntries == other.totalEntries &&
                this.totalPages == other.totalPages &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                data,
                page,
                totalEntries,
                totalPages,
                additionalProperties,
            )
        }

        override fun toString() =
            "FundingSourceListPageAsync.Response{data=$data, page=$page, totalEntries=$totalEntries, totalPages=$totalPages, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<FundingSource>> = JsonMissing.of()
            private var page: JsonField<Long> = JsonMissing.of()
            private var totalEntries: JsonField<Long> = JsonMissing.of()
            private var totalPages: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.page = page.page
                this.totalEntries = page.totalEntries
                this.totalPages = page.totalPages
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<FundingSource>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<FundingSource>>) = apply { this.data = data }

            fun page(page: Long) = page(JsonField.of(page))

            @JsonProperty("page") fun page(page: JsonField<Long>) = apply { this.page = page }

            fun totalEntries(totalEntries: Long) = totalEntries(JsonField.of(totalEntries))

            @JsonProperty("total_entries")
            fun totalEntries(totalEntries: JsonField<Long>) = apply {
                this.totalEntries = totalEntries
            }

            fun totalPages(totalPages: Long) = totalPages(JsonField.of(totalPages))

            @JsonProperty("total_pages")
            fun totalPages(totalPages: JsonField<Long>) = apply { this.totalPages = totalPages }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    data,
                    page,
                    totalEntries,
                    totalPages,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
