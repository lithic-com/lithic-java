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
import com.lithic.api.services.blocking.CardService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

class CardListPage
private constructor(
    private val cardsService: CardService,
    private val params: CardListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<Card> = response().data()

    fun page(): Long = response().page()

    fun totalEntries(): Long = response().totalEntries()

    fun totalPages(): Long = response().totalPages()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardListPage &&
            this.cardsService == other.cardsService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            cardsService,
            params,
            response,
        )
    }

    override fun toString() =
        "CardListPage{cardsService=$cardsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return page() < totalPages()
    }

    fun getNextPageParams(): Optional<CardListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            CardListParams.builder().from(params).page(params.page().orElse(0) + 1).build()
        )
    }

    fun getNextPage(): Optional<CardListPage> {
        return getNextPageParams().map { cardsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(cardsService: CardService, params: CardListParams, response: Response) =
            CardListPage(
                cardsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<Card>>,
        private val page: JsonField<Long>,
        private val totalEntries: JsonField<Long>,
        private val totalPages: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<Card> = data.getRequired("data")

        fun page(): Long = page.getRequired("page")

        fun totalEntries(): Long = totalEntries.getRequired("total_entries")

        fun totalPages(): Long = totalPages.getRequired("total_pages")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<Card>>> = Optional.ofNullable(data)

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
            "CardListPage.Response{data=$data, page=$page, totalEntries=$totalEntries, totalPages=$totalPages, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<Card>> = JsonMissing.of()
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

            fun data(data: List<Card>) = data(JsonField.of(data))

            @JsonProperty("data") fun data(data: JsonField<List<Card>>) = apply { this.data = data }

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

    class AutoPager
    constructor(
        private val firstPage: CardListPage,
    ) : Iterable<Card> {

        override fun iterator(): Iterator<Card> = iterator {
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

        fun stream(): Stream<Card> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
