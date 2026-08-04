// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountInterestTierScheduleCreateParams
import com.lithic.api.models.FinancialAccountInterestTierScheduleDeleteParams
import com.lithic.api.models.FinancialAccountInterestTierScheduleListPageAsync
import com.lithic.api.models.FinancialAccountInterestTierScheduleListParams
import com.lithic.api.models.FinancialAccountInterestTierScheduleRetrieveParams
import com.lithic.api.models.FinancialAccountInterestTierScheduleUpdateParams
import com.lithic.api.models.InterestTierSchedule
import java.time.LocalDate
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InterestTierScheduleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InterestTierScheduleServiceAsync

    /** Create a new interest tier schedule entry for a supported financial account */
    fun create(
        financialAccountToken: String,
        params: FinancialAccountInterestTierScheduleCreateParams,
    ): CompletableFuture<InterestTierSchedule> =
        create(financialAccountToken, params, RequestOptions.none())

    /** @see create */
    fun create(
        financialAccountToken: String,
        params: FinancialAccountInterestTierScheduleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InterestTierSchedule> =
        create(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        params: FinancialAccountInterestTierScheduleCreateParams
    ): CompletableFuture<InterestTierSchedule> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FinancialAccountInterestTierScheduleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InterestTierSchedule>

    /** Get a specific interest tier schedule by effective date */
    fun retrieve(
        effectiveDate: LocalDate,
        params: FinancialAccountInterestTierScheduleRetrieveParams,
    ): CompletableFuture<InterestTierSchedule> =
        retrieve(effectiveDate, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        effectiveDate: LocalDate,
        params: FinancialAccountInterestTierScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InterestTierSchedule> =
        retrieve(params.toBuilder().effectiveDate(effectiveDate).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: FinancialAccountInterestTierScheduleRetrieveParams
    ): CompletableFuture<InterestTierSchedule> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FinancialAccountInterestTierScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InterestTierSchedule>

    /** Update an existing interest tier schedule */
    fun update(
        effectiveDate: LocalDate,
        params: FinancialAccountInterestTierScheduleUpdateParams,
    ): CompletableFuture<InterestTierSchedule> =
        update(effectiveDate, params, RequestOptions.none())

    /** @see update */
    fun update(
        effectiveDate: LocalDate,
        params: FinancialAccountInterestTierScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InterestTierSchedule> =
        update(params.toBuilder().effectiveDate(effectiveDate).build(), requestOptions)

    /** @see update */
    fun update(
        params: FinancialAccountInterestTierScheduleUpdateParams
    ): CompletableFuture<InterestTierSchedule> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FinancialAccountInterestTierScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InterestTierSchedule>

    /**
     * List interest tier schedules for a financial account with optional date filtering.
     *
     * If no date parameters are provided, returns all tier schedules. If date parameters are
     * provided, uses filtering to return matching schedules (max 100).
     * - for_date: Returns exact match (takes precedence over other dates)
     * - before_date: Returns schedules with effective_date <= before_date
     * - after_date: Returns schedules with effective_date >= after_date
     * - Both before_date and after_date: Returns schedules in range
     */
    fun list(
        financialAccountToken: String
    ): CompletableFuture<FinancialAccountInterestTierScheduleListPageAsync> =
        list(financialAccountToken, FinancialAccountInterestTierScheduleListParams.none())

    /** @see list */
    fun list(
        financialAccountToken: String,
        params: FinancialAccountInterestTierScheduleListParams =
            FinancialAccountInterestTierScheduleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountInterestTierScheduleListPageAsync> =
        list(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see list */
    fun list(
        financialAccountToken: String,
        params: FinancialAccountInterestTierScheduleListParams =
            FinancialAccountInterestTierScheduleListParams.none(),
    ): CompletableFuture<FinancialAccountInterestTierScheduleListPageAsync> =
        list(financialAccountToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FinancialAccountInterestTierScheduleListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountInterestTierScheduleListPageAsync>

    /** @see list */
    fun list(
        params: FinancialAccountInterestTierScheduleListParams
    ): CompletableFuture<FinancialAccountInterestTierScheduleListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialAccountInterestTierScheduleListPageAsync> =
        list(
            financialAccountToken,
            FinancialAccountInterestTierScheduleListParams.none(),
            requestOptions,
        )

    /**
     * Delete an interest tier schedule entry.
     *
     * Returns:
     * - 400 Bad Request: Invalid effective_date format OR attempting to delete the earliest tier
     *   schedule entry for a non-PENDING account
     * - 404 Not Found: Tier schedule entry not found for the given effective_date OR ledger account
     *   not found
     *
     * Note: PENDING accounts can delete the earliest tier schedule entry (account hasn't opened
     * yet). Active/non-PENDING accounts cannot delete the earliest entry to prevent orphaning the
     * account.
     *
     * If the deleted tier schedule has a past effective_date and the account is ACTIVE, the loan
     * tape rebuild configuration will be updated to trigger rebuilds from that date.
     */
    fun delete(
        effectiveDate: LocalDate,
        params: FinancialAccountInterestTierScheduleDeleteParams,
    ): CompletableFuture<Void?> = delete(effectiveDate, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        effectiveDate: LocalDate,
        params: FinancialAccountInterestTierScheduleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().effectiveDate(effectiveDate).build(), requestOptions)

    /** @see delete */
    fun delete(params: FinancialAccountInterestTierScheduleDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FinancialAccountInterestTierScheduleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [InterestTierScheduleServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InterestTierScheduleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/financial_accounts/{financial_account_token}/interest_tier_schedule`, but is
         * otherwise the same as [InterestTierScheduleServiceAsync.create].
         */
        fun create(
            financialAccountToken: String,
            params: FinancialAccountInterestTierScheduleCreateParams,
        ): CompletableFuture<HttpResponseFor<InterestTierSchedule>> =
            create(financialAccountToken, params, RequestOptions.none())

        /** @see create */
        fun create(
            financialAccountToken: String,
            params: FinancialAccountInterestTierScheduleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InterestTierSchedule>> =
            create(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            params: FinancialAccountInterestTierScheduleCreateParams
        ): CompletableFuture<HttpResponseFor<InterestTierSchedule>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FinancialAccountInterestTierScheduleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InterestTierSchedule>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/interest_tier_schedule/{effective_date}`,
         * but is otherwise the same as [InterestTierScheduleServiceAsync.retrieve].
         */
        fun retrieve(
            effectiveDate: LocalDate,
            params: FinancialAccountInterestTierScheduleRetrieveParams,
        ): CompletableFuture<HttpResponseFor<InterestTierSchedule>> =
            retrieve(effectiveDate, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            effectiveDate: LocalDate,
            params: FinancialAccountInterestTierScheduleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InterestTierSchedule>> =
            retrieve(params.toBuilder().effectiveDate(effectiveDate).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: FinancialAccountInterestTierScheduleRetrieveParams
        ): CompletableFuture<HttpResponseFor<InterestTierSchedule>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FinancialAccountInterestTierScheduleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InterestTierSchedule>>

        /**
         * Returns a raw HTTP response for `put
         * /v1/financial_accounts/{financial_account_token}/interest_tier_schedule/{effective_date}`,
         * but is otherwise the same as [InterestTierScheduleServiceAsync.update].
         */
        fun update(
            effectiveDate: LocalDate,
            params: FinancialAccountInterestTierScheduleUpdateParams,
        ): CompletableFuture<HttpResponseFor<InterestTierSchedule>> =
            update(effectiveDate, params, RequestOptions.none())

        /** @see update */
        fun update(
            effectiveDate: LocalDate,
            params: FinancialAccountInterestTierScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InterestTierSchedule>> =
            update(params.toBuilder().effectiveDate(effectiveDate).build(), requestOptions)

        /** @see update */
        fun update(
            params: FinancialAccountInterestTierScheduleUpdateParams
        ): CompletableFuture<HttpResponseFor<InterestTierSchedule>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FinancialAccountInterestTierScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InterestTierSchedule>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/interest_tier_schedule`, but is
         * otherwise the same as [InterestTierScheduleServiceAsync.list].
         */
        fun list(
            financialAccountToken: String
        ): CompletableFuture<HttpResponseFor<FinancialAccountInterestTierScheduleListPageAsync>> =
            list(financialAccountToken, FinancialAccountInterestTierScheduleListParams.none())

        /** @see list */
        fun list(
            financialAccountToken: String,
            params: FinancialAccountInterestTierScheduleListParams =
                FinancialAccountInterestTierScheduleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountInterestTierScheduleListPageAsync>> =
            list(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see list */
        fun list(
            financialAccountToken: String,
            params: FinancialAccountInterestTierScheduleListParams =
                FinancialAccountInterestTierScheduleListParams.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountInterestTierScheduleListPageAsync>> =
            list(financialAccountToken, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: FinancialAccountInterestTierScheduleListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountInterestTierScheduleListPageAsync>>

        /** @see list */
        fun list(
            params: FinancialAccountInterestTierScheduleListParams
        ): CompletableFuture<HttpResponseFor<FinancialAccountInterestTierScheduleListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialAccountInterestTierScheduleListPageAsync>> =
            list(
                financialAccountToken,
                FinancialAccountInterestTierScheduleListParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `delete
         * /v1/financial_accounts/{financial_account_token}/interest_tier_schedule/{effective_date}`,
         * but is otherwise the same as [InterestTierScheduleServiceAsync.delete].
         */
        fun delete(
            effectiveDate: LocalDate,
            params: FinancialAccountInterestTierScheduleDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(effectiveDate, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            effectiveDate: LocalDate,
            params: FinancialAccountInterestTierScheduleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().effectiveDate(effectiveDate).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: FinancialAccountInterestTierScheduleDeleteParams
        ): CompletableFuture<HttpResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FinancialAccountInterestTierScheduleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
