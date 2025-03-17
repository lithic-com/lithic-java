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
import com.lithic.api.services.async.EventServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** List all the message attempts for a given event. */
class EventListAttemptsPageAsync
private constructor(
    private val eventsService: EventServiceAsync,
    private val params: EventListAttemptsParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<MessageAttempt> = response().data()

    fun hasMore(): Boolean = response().hasMore()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventListAttemptsPageAsync && eventsService == other.eventsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(eventsService, params, response) /* spotless:on */

    override fun toString() =
        "EventListAttemptsPageAsync{eventsService=$eventsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !data().isEmpty()
    }

    fun getNextPageParams(): Optional<EventListAttemptsParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return if (params.endingBefore().isPresent) {
            Optional.of(
                EventListAttemptsParams.builder()
                    .from(params)
                    .endingBefore(data().first().token())
                    .build()
            )
        } else {
            Optional.of(
                EventListAttemptsParams.builder()
                    .from(params)
                    .startingAfter(data().last().token())
                    .build()
            )
        }
    }

    fun getNextPage(): CompletableFuture<Optional<EventListAttemptsPageAsync>> {
        return getNextPageParams()
            .map { eventsService.listAttempts(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            eventsService: EventServiceAsync,
            params: EventListAttemptsParams,
            response: Response,
        ) = EventListAttemptsPageAsync(eventsService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("data") private val data: JsonField<List<MessageAttempt>> = JsonMissing.of(),
        @JsonProperty("has_more") private val hasMore: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun data(): List<MessageAttempt> = data.getNullable("data") ?: listOf()

        fun hasMore(): Boolean = hasMore.getRequired("has_more")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<MessageAttempt>>> = Optional.ofNullable(data)

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

            /**
             * Returns a mutable builder for constructing an instance of
             * [EventListAttemptsPageAsync].
             */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<MessageAttempt>> = JsonMissing.of()
            private var hasMore: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.hasMore = page.hasMore
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<MessageAttempt>) = data(JsonField.of(data))

            fun data(data: JsonField<List<MessageAttempt>>) = apply { this.data = data }

            fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

            fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            /**
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response = Response(data, hasMore, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: EventListAttemptsPageAsync) {

        fun forEach(
            action: Predicate<MessageAttempt>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<EventListAttemptsPageAsync>>.forEach(
                action: (MessageAttempt) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<MessageAttempt>> {
            val values = mutableListOf<MessageAttempt>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
