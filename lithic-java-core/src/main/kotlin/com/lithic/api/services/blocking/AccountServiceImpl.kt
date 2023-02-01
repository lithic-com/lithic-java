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

class AccountServiceImpl constructor(private val clientOptions: ClientOptions,) : AccountService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Account> =
    jsonHandler<Account>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Get account configuration such as spend limits. */
    override fun retrieve(params: AccountRetrieveParams, requestOptions: RequestOptions): Account {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("accounts", params.getPathParam(0))
        .putAllQueryParams(params.toQueryParams())
        .putHeader("Authorization", clientOptions.apiKey)
        .putAllHeaders(params.toHeaders())
        .build()
      return clientOptions.httpClient.execute(request)
      .let { response -> 
          response.let {
              retrieveHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val updateHandler: Handler<Account> =
    jsonHandler<Account>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * Update account configuration such as spend limits and verification address. Can
     * only be run on accounts that are part of the program managed by this API key.
     *
     * Accounts that are in the `PAUSED` state will not be able to transact or create
     * new cards.
     */
    override fun update(params: AccountUpdateParams, requestOptions: RequestOptions): Account {
      val request = HttpRequest.builder()
        .method(HttpMethod.PATCH)
        .addPathSegments("accounts", params.getPathParam(0))
        .putAllQueryParams(params.toQueryParams())
        .putHeader("Authorization", clientOptions.apiKey)
        .putAllHeaders(params.toHeaders())
        .body(json(clientOptions.jsonMapper, params.toBody()))
        .build()
      return clientOptions.httpClient.execute(request)
      .let { response -> 
          response.let {
              updateHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val listHandler: Handler<AccountListPage.Response> =
    jsonHandler<AccountListPage.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** List account configurations. */
    override fun list(params: AccountListParams, requestOptions: RequestOptions): AccountListPage {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("accounts")
        .putAllQueryParams(params.toQueryParams())
        .putHeader("Authorization", clientOptions.apiKey)
        .putAllHeaders(params.toHeaders())
        .build()
      return clientOptions.httpClient.execute(request)
      .let { response -> 
          response.let {
              listHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
          .let {
              AccountListPage.of(this, params, it)
          }
      }
    }
}
