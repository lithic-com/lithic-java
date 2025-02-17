package com.lithic.api.errors

import com.lithic.api.core.http.Headers

abstract class LithicServiceException
@JvmOverloads
constructor(
    private val statusCode: Int,
    private val headers: Headers,
    private val body: String,
    private val error: LithicError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null,
) : LithicException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): LithicError = error
}
