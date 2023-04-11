package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import java.util.Spliterator
import java.util.Spliterators
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import java.util.stream.StreamSupport
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.JsonField
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.models.DisputeEvidence
import com.lithic.api.services.blocking.DisputeService

class DisputeListEvidencesPage private constructor(private val disputesService: DisputeService,private val params: DisputeListEvidencesParams,private val response: Response,) {

    fun response(): Response = response

    fun data(): List<DisputeEvidence> = response().data()

    fun hasMore(): Boolean = response().hasMore()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is DisputeListEvidencesPage &&
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

    override fun toString() = "DisputeListEvidencesPage{disputesService=$disputesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
      return data().isEmpty()
    }

    fun getNextPageParams(): Optional<DisputeListEvidencesParams> {
      if (!hasNextPage()) {
        return Optional.empty()
      }

      return if (params.endingBefore().isPresent) {
        Optional.of(DisputeListEvidencesParams.builder().from(params).endingBefore(data().first().token()).build());
      } else {
        Optional.of(DisputeListEvidencesParams.builder().from(params).startingAfter(data().last().token()).build());
      }
    }

    fun getNextPage(): Optional<DisputeListEvidencesPage> {
      return getNextPageParams().map { disputesService.listEvidences(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(disputesService: DisputeService, params: DisputeListEvidencesParams, response: Response) = DisputeListEvidencesPage(
            disputesService,
            params,
            response,
        )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response constructor(private val data: JsonField<List<DisputeEvidence>>,private val hasMore: JsonField<Boolean>,private val additionalProperties: Map<String, JsonValue>,) {

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

        fun validate() = apply {
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

        override fun toString() = "DisputeListEvidencesPage.Response{data=$data, hasMore=$hasMore, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
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

            fun build() = Response(
                data,
                hasMore,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    class AutoPager constructor(private val firstPage: DisputeListEvidencesPage,) : Iterable<DisputeEvidence> {

        override fun iterator(): Iterator<DisputeEvidence> = sequence {
            var page = firstPage
            var index = 0
            while (true) {
              while (index >= page.data().size) {
                page = page.getNextPage().orElse(null) ?: return@sequence
                index = 0
              }
              yield(page.data()[index++])
            }
        }
        .iterator()

        fun stream(): Stream<DisputeEvidence> {
          return StreamSupport.stream(spliterator(), false)
        }
    }
}
