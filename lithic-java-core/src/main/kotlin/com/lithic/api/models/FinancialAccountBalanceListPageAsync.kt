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
import com.lithic.api.services.async.financialAccounts.BalanceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

class FinancialAccountBalanceListPageAsync
private constructor(
    private val balancesService: BalanceServiceAsync,
    private val params: FinancialAccountBalanceListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<Balance> = response().data()

    fun hasMore(): Boolean = response().hasMore()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountBalanceListPageAsync &&
            this.balancesService == other.balancesService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            balancesService,
            params,
            response,
        )
    }

    override fun toString() =
        "FinancialAccountBalanceListPageAsync{balancesService=$balancesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return data().isEmpty()
    }

    fun getNextPageParams(): Optional<FinancialAccountBalanceListParams> {
        return Optional.empty()
    }

    fun getNextPage(): CompletableFuture<Optional<FinancialAccountBalanceListPageAsync>> {
        return getNextPageParams()
            .map { balancesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            balancesService: BalanceServiceAsync,
            params: FinancialAccountBalanceListParams,
            response: Response
        ) =
            FinancialAccountBalanceListPageAsync(
                balancesService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<Balance>>,
        private val hasMore: JsonField<Boolean>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<Balance> = data.getRequired("data")

        fun hasMore(): Boolean = hasMore.getRequired("has_more")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<Balance>>> = Optional.ofNullable(data)

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
            "FinancialAccountBalanceListPageAsync.Response{data=$data, hasMore=$hasMore, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<Balance>> = JsonMissing.of()
            private var hasMore: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.hasMore = page.hasMore
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<Balance>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<Balance>>) = apply { this.data = data }

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
        private val firstPage: FinancialAccountBalanceListPageAsync,
    ) {

        fun forEach(action: Predicate<Balance>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<FinancialAccountBalanceListPageAsync>>.forEach(
                action: (Balance) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Balance>> {
            val values = mutableListOf<Balance>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
