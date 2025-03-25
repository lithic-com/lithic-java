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
import com.lithic.api.services.async.financialAccounts.statements.LineItemServiceAsync
import java.util.Collections
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** List the line items for a given statement within a given financial account. */
class FinancialAccountStatementLineItemListPageAsync
private constructor(
    private val lineItemsService: LineItemServiceAsync,
    private val params: FinancialAccountStatementLineItemListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<StatementLineItems.StatementLineItemResponse> = response().data()

    fun hasMore(): Boolean = response().hasMore()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountStatementLineItemListPageAsync && lineItemsService == other.lineItemsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lineItemsService, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountStatementLineItemListPageAsync{lineItemsService=$lineItemsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !data().isEmpty()
    }

    fun getNextPageParams(): Optional<FinancialAccountStatementLineItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return if (params.endingBefore().isPresent) {
            Optional.of(
                FinancialAccountStatementLineItemListParams.builder()
                    .from(params)
                    .endingBefore(data().first().token())
                    .build()
            )
        } else {
            Optional.of(
                FinancialAccountStatementLineItemListParams.builder()
                    .from(params)
                    .startingAfter(data().last().token())
                    .build()
            )
        }
    }

    fun getNextPage(): CompletableFuture<Optional<FinancialAccountStatementLineItemListPageAsync>> {
        return getNextPageParams()
            .map { lineItemsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            lineItemsService: LineItemServiceAsync,
            params: FinancialAccountStatementLineItemListParams,
            response: Response,
        ) = FinancialAccountStatementLineItemListPageAsync(lineItemsService, params, response)
    }

    class Response(
        private val data: JsonField<List<StatementLineItems.StatementLineItemResponse>>,
        private val hasMore: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            data: JsonField<List<StatementLineItems.StatementLineItemResponse>> = JsonMissing.of(),
            @JsonProperty("has_more") hasMore: JsonField<Boolean> = JsonMissing.of(),
        ) : this(data, hasMore, mutableMapOf())

        fun data(): List<StatementLineItems.StatementLineItemResponse> =
            data.getNullable("data") ?: listOf()

        fun hasMore(): Boolean = hasMore.getRequired("has_more")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<StatementLineItems.StatementLineItemResponse>>> =
            Optional.ofNullable(data)

        @JsonProperty("has_more")
        fun _hasMore(): Optional<JsonField<Boolean>> = Optional.ofNullable(hasMore)

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

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
             * [FinancialAccountStatementLineItemListPageAsync].
             */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<StatementLineItems.StatementLineItemResponse>> =
                JsonMissing.of()
            private var hasMore: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.hasMore = page.hasMore
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<StatementLineItems.StatementLineItemResponse>) =
                data(JsonField.of(data))

            fun data(data: JsonField<List<StatementLineItems.StatementLineItemResponse>>) = apply {
                this.data = data
            }

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
            fun build(): Response = Response(data, hasMore, additionalProperties.toMutableMap())
        }
    }

    class AutoPager(private val firstPage: FinancialAccountStatementLineItemListPageAsync) {

        fun forEach(
            action: Predicate<StatementLineItems.StatementLineItemResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<FinancialAccountStatementLineItemListPageAsync>>.forEach(
                action: (StatementLineItems.StatementLineItemResponse) -> Boolean,
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

        fun toList(
            executor: Executor
        ): CompletableFuture<List<StatementLineItems.StatementLineItemResponse>> {
            val values = mutableListOf<StatementLineItems.StatementLineItemResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
