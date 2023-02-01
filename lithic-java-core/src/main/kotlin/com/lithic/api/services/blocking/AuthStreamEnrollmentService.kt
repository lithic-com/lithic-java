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

interface AuthStreamEnrollmentService {

    /**
     * Check status for whether you have enrolled in Authorization Stream Access (ASA)
     * for your program in Sandbox.
     */
    @JvmOverloads
    fun retrieve(params: AuthStreamEnrollmentRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): AuthStreamEnrollment

    /** Disenroll Authorization Stream Access (ASA) in Sandbox. */
    @JvmOverloads
    fun disenroll(params: AuthStreamEnrollmentDisenrollParams, requestOptions: RequestOptions = RequestOptions.none())

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
    @JvmOverloads
    fun enroll(params: AuthStreamEnrollmentEnrollParams, requestOptions: RequestOptions = RequestOptions.none())
}
