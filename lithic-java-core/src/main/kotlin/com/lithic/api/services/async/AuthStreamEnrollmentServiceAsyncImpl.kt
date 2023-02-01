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
import com.lithic.api.models.AuthStreamEnrollment
import com.lithic.api.models.AuthStreamEnrollmentDisenrollParams
import com.lithic.api.models.AuthStreamEnrollmentEnrollParams
import com.lithic.api.models.AuthStreamEnrollmentRetrieveParams
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

class AuthStreamEnrollmentServiceAsyncImpl constructor(private val clientOptions: ClientOptions,) : AuthStreamEnrollmentServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<AuthStreamEnrollment> =
    jsonHandler<AuthStreamEnrollment>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * Check status for whether you have enrolled in Authorization Stream Access (ASA)
     * for your program in Sandbox.
     */
    override fun retrieve(params: AuthStreamEnrollmentRetrieveParams, requestOptions: RequestOptions): CompletableFuture<AuthStreamEnrollment> {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("auth_stream")
        .putAllQueryParams(params.toQueryParams())
        .putHeader("Authorization", clientOptions.apiKey)
        .putAllHeaders(params.toHeaders())
        .build()
      return clientOptions.httpClient.executeAsync(request)
      .thenApply { response -> 
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

    private val disenrollHandler: Handler<Void?> =
    emptyHandler()
    .withErrorHandler(errorHandler)

    /** Disenroll Authorization Stream Access (ASA) in Sandbox. */
    override fun disenroll(params: AuthStreamEnrollmentDisenrollParams, requestOptions: RequestOptions): CompletableFuture<Void> {
      val request = HttpRequest.builder()
        .method(HttpMethod.DELETE)
        .addPathSegments("auth_stream")
        .putAllQueryParams(params.toQueryParams())
        .putHeader("Authorization", clientOptions.apiKey)
        .putAllHeaders(params.toHeaders())
        .apply {
            params.toBody().ifPresent {
                body(json(clientOptions.jsonMapper, it))
            }
        }
        .build()
      return clientOptions.httpClient.executeAsync(request)
      .thenApply { response -> 
          response.let {
              disenrollHandler.handle(it)
          }
      }
    }

    private val enrollHandler: Handler<Void?> =
    emptyHandler()
    .withErrorHandler(errorHandler)

    /**
     * Authorization Stream Access (ASA) provides the ability to make custom
     * transaction approval decisions through an HTTP interface to the ISO 8583 message
     * stream.
     *
     * ASA requests are delivered as an HTTP POST during authorization. The ASA request
     * body adheres to the Lithic transaction schema, with some additional fields added
     * for use in decisioning. A response should be sent with HTTP response code 200
     * and the approval decision in the response body. This response is converted by
     * Lithic back into ISO 8583 format and forwarded to the network.
     *
     * In Sandbox, users can self-enroll and disenroll in ASA. In production,
     * onboarding requires manual approval and setup.
     */
    override fun enroll(params: AuthStreamEnrollmentEnrollParams, requestOptions: RequestOptions): CompletableFuture<Void> {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("auth_stream")
        .putAllQueryParams(params.toQueryParams())
        .putHeader("Authorization", clientOptions.apiKey)
        .putAllHeaders(params.toHeaders())
        .body(json(clientOptions.jsonMapper, params.toBody()))
        .build()
      return clientOptions.httpClient.executeAsync(request)
      .thenApply { response -> 
          response.let {
              enrollHandler.handle(it)
          }
      }
    }
}
