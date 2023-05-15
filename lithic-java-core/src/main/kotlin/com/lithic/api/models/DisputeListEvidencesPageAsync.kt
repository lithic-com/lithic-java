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
import com.lithic.api.services.async.DisputeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

class DisputeListEvidencesPageAsync
private constructor(
    private val disputesService: DisputeServiceAsync,
    private val params: DisputeListEvidencesParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<DisputeEvidence> = response().data()

    fun hasMore(): Boolean = response().hasMore()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DisputeListEvidencesPageAsync &&
            this.disputesService == other.disputesService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            disputesService,
            params,
            response,
        )
    }

    override fun toString() =
        "DisputeListEvidencesPageAsync{disputesService=$disputesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return data().isEmpty()
    }

    fun getNextPageParams(): Optional<DisputeListEvidencesParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return if (params.endingBefore().isPresent) {
            Optional.of(
                DisputeListEvidencesParams.builder()
                    .from(params)
                    .endingBefore(data().first().token())
                    .build()
            )
        } else {
            Optional.of(
                DisputeListEvidencesParams.builder()
                    .from(params)
                    .startingAfter(data().last().token())
                    .build()
            )
        }
    }

    fun getNextPage(): CompletableFuture<Optional<DisputeListEvidencesPageAsync>> {
        return getNextPageParams()
            .map { disputesService.listEvidences(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            disputesService: DisputeServiceAsync,
            params: DisputeListEvidencesParams,
            response: Response
        ) =
            DisputeListEvidencesPageAsync(
                disputesService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<DisputeEvidence>>,
        private val hasMore: JsonField<Boolean>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<DisputeEvidence> = data.getRequired("data")

        fun hasMore(): Boolean = hasMore.getRequired("has_more")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<DisputeEvidence>>> = Optional.ofNullable(data)

        @JsonProperty("has_more")
        fun _hasMore(): Optional<JsonField<Boolean>> = Optional.ofNullable(hasMore)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                data().forEach { it.validate() }
                hasMore()
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
                this.hasMore == other.hasMore &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                data,
                hasMore,
                additionalProperties,
            )
        }

        override fun toString() =
            "DisputeListEvidencesPageAsync.Response{data=$data, hasMore=$hasMore, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<DisputeEvidence>> = JsonMissing.of()
            private var hasMore: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.hasMore = page.hasMore
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<DisputeEvidence>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<DisputeEvidence>>) = apply { this.data = data }

            fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

            @JsonProperty("has_more")
            fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    data,
                    hasMore,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: DisputeListEvidencesPageAsync,
    ) {

        fun forEach(
            action: Predicate<DisputeEvidence>,
            executor: Executor
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DisputeListEvidencesPageAsync>>.forEach(
                action: (DisputeEvidence) -> Boolean,
                executor: Executor
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<DisputeEvidence>> {
            val values = mutableListOf<DisputeEvidence>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
