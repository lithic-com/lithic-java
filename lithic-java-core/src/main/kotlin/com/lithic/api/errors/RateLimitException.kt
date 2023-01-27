package com.lithic.api.errors

import com.google.common.collect.ListMultimap

class RateLimitException
constructor(
    headers: ListMultimap<String, String>,
    private val error: LithicError,
) : LithicServiceException(headers, "${error}") {
    override fun statusCode(): Int = 429
    fun error(): LithicError = error
}
