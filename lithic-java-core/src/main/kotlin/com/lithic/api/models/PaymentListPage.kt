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
import com.lithic.api.services.blocking.PaymentService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List all the payments for the provided search criteria. */
class PaymentListPage
private constructor(
    private val paymentsService: PaymentService,
    private val params: PaymentListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<Payment> = response().data()

    fun hasMore(): Boolean = response().hasMore()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentListPage && paymentsService == other.paymentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentsService, params, response) /* spotless:on */

    override fun toString() =
        "PaymentListPage{paymentsService=$paymentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !data().isEmpty()
    }

    fun getNextPageParams(): Optional<PaymentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return if (params.endingBefore().isPresent) {
            Optional.of(
                PaymentListParams.builder()
                    .from(params)
                    .endingBefore(data().first().token())
                    .build()
            )
        } else {
            Optional.of(
                PaymentListParams.builder()
                    .from(params)
                    .startingAfter(data().last().token())
                    .build()
            )
        }
    }

    fun getNextPage(): Optional<PaymentListPage> {
        return getNextPageParams().map { paymentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(paymentsService: PaymentService, params: PaymentListParams, response: Response) =
            PaymentListPage(paymentsService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("data") private val data: JsonField<List<Payment>> = JsonMissing.of(),
        @JsonProperty("has_more") private val hasMore: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun data(): List<Payment> = data.getNullable("data") ?: listOf()

        fun hasMore(): Boolean = hasMore.getRequired("has_more")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<Payment>>> = Optional.ofNullable(data)

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

            /** Returns a mutable builder for constructing an instance of [PaymentListPage]. */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<Payment>> = JsonMissing.of()
            private var hasMore: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.hasMore = page.hasMore
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<Payment>) = data(JsonField.of(data))

            fun data(data: JsonField<List<Payment>>) = apply { this.data = data }

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

    class AutoPager(private val firstPage: PaymentListPage) : Iterable<Payment> {

        override fun iterator(): Iterator<Payment> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<Payment> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
