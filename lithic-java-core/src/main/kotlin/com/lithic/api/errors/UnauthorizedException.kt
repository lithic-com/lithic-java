package com.lithic.api.errors

import com.google.common.collect.ListMultimap

class UnauthorizedException
constructor(
    headers: ListMultimap<String, String>,
    private val error: LithicError,
) : LithicServiceException(headers, "${error}") {
    override fun statusCode(): Int = 401

    fun error(): LithicError = error
}
