package com.lithic.api.errors

import com.google.common.collect.ListMultimap

abstract class LithicServiceException
@JvmOverloads
constructor(
    private val statusCode: Int,
    private val headers: ListMultimap<String, String>,
    private val body: String,
    private val error: LithicError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : LithicException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): ListMultimap<String, String> = headers

    fun body(): String = body

    fun error(): LithicError = error
}
