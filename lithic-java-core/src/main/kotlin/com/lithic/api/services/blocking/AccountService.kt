@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

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
import com.lithic.api.models.Account
import com.lithic.api.models.AccountListPage
import com.lithic.api.models.AccountListParams
import com.lithic.api.models.AccountRetrieveParams
import com.lithic.api.models.AccountUpdateParams
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

interface AccountService {

    /** Get account configuration such as spend limits. */
    @JvmOverloads
    fun retrieve(params: AccountRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): Account

    /**
     * Update account configuration such as spend limits and verification address. Can
     * only be run on accounts that are part of the program managed by this API key.
     *
     * Accounts that are in the `PAUSED` state will not be able to transact or create
     * new cards.
     */
    @JvmOverloads
    fun update(params: AccountUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Account

    /** List account configurations. */
    @JvmOverloads
    fun list(params: AccountListParams, requestOptions: RequestOptions = RequestOptions.none()): AccountListPage
}
