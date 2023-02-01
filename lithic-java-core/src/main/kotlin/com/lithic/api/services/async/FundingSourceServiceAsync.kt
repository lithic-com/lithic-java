@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import okhttp3.HttpUrl
import okhttp3.Request
import com.fasterxml.jackson.databind.json.JsonMapper
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.util.Base64
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.FundingSource
import com.lithic.api.models.FundingSourceCreateParams
import com.lithic.api.models.FundingSourceListPageAsync
import com.lithic.api.models.FundingSourceListParams
import com.lithic.api.models.FundingSourceUpdateParams
import com.lithic.api.models.FundingSourceVerifyParams
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.JsonField
import com.lithic.api.core.RequestOptions
import com.lithic.api.errors.LithicError
import com.lithic.api.services.emptyHandler
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.stringHandler
import com.lithic.api.services.withErrorHandler

interface FundingSourceServiceAsync {

    /**
     * Add a funding source using bank routing and account numbers or via Plaid.
     *
     * In the production environment, funding accounts will be set to `PENDING` state
     * until micro-deposit validation completes while funding accounts in sandbox will
     * be set to `ENABLED` state automatically.
     */
    @JvmOverloads
    fun create(params: FundingSourceCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<FundingSource>

    /** Update a funding source. */
    @JvmOverloads
    fun update(params: FundingSourceUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<FundingSource>

    /** List all the funding sources associated with the Lithic account. */
    @JvmOverloads
    fun list(params: FundingSourceListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<FundingSourceListPageAsync>

    /**
     * Verify a bank account as a funding source by providing received micro-deposit
     * amounts.
     */
    @JvmOverloads
    fun verify(params: FundingSourceVerifyParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<FundingSource>
}
