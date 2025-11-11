// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2RetrieveFeaturesResponseTest {

    @Test
    fun create() {
        val v2RetrieveFeaturesResponse =
            V2RetrieveFeaturesResponse.builder()
                .evaluated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFeature(
                    V2RetrieveFeaturesResponse.SpendFeatureState.builder()
                        .filters(
                            V2RetrieveFeaturesResponse.SpendFeatureState.VelocityLimitFilters
                                .builder()
                                .addExcludeCountry("USD")
                                .addExcludeMcc("5542")
                                .addIncludeCountry("USD")
                                .addIncludeMcc("5542")
                                .addIncludePanEntryMode(
                                    V2RetrieveFeaturesResponse.SpendFeatureState
                                        .VelocityLimitFilters
                                        .IncludePanEntryMode
                                        .AUTO_ENTRY
                                )
                                .build()
                        )
                        .period(
                            VelocityLimitPeriod.TrailingWindowObject.builder()
                                .duration(10L)
                                .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                                .build()
                        )
                        .scope(V2RetrieveFeaturesResponse.SpendFeatureState.VelocityScope.CARD)
                        .value(
                            V2RetrieveFeaturesResponse.SpendFeatureState.Value.builder()
                                .amount(0L)
                                .count(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(v2RetrieveFeaturesResponse.evaluated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v2RetrieveFeaturesResponse.features())
            .containsExactly(
                V2RetrieveFeaturesResponse.SpendFeatureState.builder()
                    .filters(
                        V2RetrieveFeaturesResponse.SpendFeatureState.VelocityLimitFilters.builder()
                            .addExcludeCountry("USD")
                            .addExcludeMcc("5542")
                            .addIncludeCountry("USD")
                            .addIncludeMcc("5542")
                            .addIncludePanEntryMode(
                                V2RetrieveFeaturesResponse.SpendFeatureState.VelocityLimitFilters
                                    .IncludePanEntryMode
                                    .AUTO_ENTRY
                            )
                            .build()
                    )
                    .period(
                        VelocityLimitPeriod.TrailingWindowObject.builder()
                            .duration(10L)
                            .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                            .build()
                    )
                    .scope(V2RetrieveFeaturesResponse.SpendFeatureState.VelocityScope.CARD)
                    .value(
                        V2RetrieveFeaturesResponse.SpendFeatureState.Value.builder()
                            .amount(0L)
                            .count(0L)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v2RetrieveFeaturesResponse =
            V2RetrieveFeaturesResponse.builder()
                .evaluated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFeature(
                    V2RetrieveFeaturesResponse.SpendFeatureState.builder()
                        .filters(
                            V2RetrieveFeaturesResponse.SpendFeatureState.VelocityLimitFilters
                                .builder()
                                .addExcludeCountry("USD")
                                .addExcludeMcc("5542")
                                .addIncludeCountry("USD")
                                .addIncludeMcc("5542")
                                .addIncludePanEntryMode(
                                    V2RetrieveFeaturesResponse.SpendFeatureState
                                        .VelocityLimitFilters
                                        .IncludePanEntryMode
                                        .AUTO_ENTRY
                                )
                                .build()
                        )
                        .period(
                            VelocityLimitPeriod.TrailingWindowObject.builder()
                                .duration(10L)
                                .type(VelocityLimitPeriod.TrailingWindowObject.Type.CUSTOM)
                                .build()
                        )
                        .scope(V2RetrieveFeaturesResponse.SpendFeatureState.VelocityScope.CARD)
                        .value(
                            V2RetrieveFeaturesResponse.SpendFeatureState.Value.builder()
                                .amount(0L)
                                .count(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedV2RetrieveFeaturesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v2RetrieveFeaturesResponse),
                jacksonTypeRef<V2RetrieveFeaturesResponse>(),
            )

        assertThat(roundtrippedV2RetrieveFeaturesResponse).isEqualTo(v2RetrieveFeaturesResponse)
    }
}
