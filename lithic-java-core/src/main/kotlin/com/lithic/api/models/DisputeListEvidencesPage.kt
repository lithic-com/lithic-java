// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.DisputeService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [DisputeService.listEvidences] */
class DisputeListEvidencesPage
private constructor(
    private val service: DisputeService,
    private val params: DisputeListEvidencesParams,
    private val response: DisputeListEvidencesPageResponse,
) : Page<DisputeEvidence> {

    /**
     * Delegates to [DisputeListEvidencesPageResponse], but gracefully handles missing data.
     *
     * @see [DisputeListEvidencesPageResponse.data]
     */
    fun data(): List<DisputeEvidence> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DisputeListEvidencesPageResponse], but gracefully handles missing data.
     *
     * @see [DisputeListEvidencesPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<DisputeEvidence> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DisputeListEvidencesParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): DisputeListEvidencesPage = service.listEvidences(nextPageParams())

    fun autoPager(): AutoPager<DisputeEvidence> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DisputeListEvidencesParams = params

    /** The response that this page was parsed from. */
    fun response(): DisputeListEvidencesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DisputeListEvidencesPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DisputeListEvidencesPage]. */
    class Builder internal constructor() {

        private var service: DisputeService? = null
        private var params: DisputeListEvidencesParams? = null
        private var response: DisputeListEvidencesPageResponse? = null

        @JvmSynthetic
        internal fun from(disputeListEvidencesPage: DisputeListEvidencesPage) = apply {
            service = disputeListEvidencesPage.service
            params = disputeListEvidencesPage.params
            response = disputeListEvidencesPage.response
        }

        fun service(service: DisputeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DisputeListEvidencesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DisputeListEvidencesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DisputeListEvidencesPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DisputeListEvidencesPage =
            DisputeListEvidencesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DisputeListEvidencesPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DisputeListEvidencesPage{service=$service, params=$params, response=$response}"
}
