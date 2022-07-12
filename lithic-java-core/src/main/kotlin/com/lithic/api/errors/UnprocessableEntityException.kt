package com.lithic.api.errors

import com.google.common.collect.ListMultimap

class UnprocessableEntityException
constructor(
    headers: ListMultimap<String, String>,
    private val error: LithicError,
) : LithicServiceException(headers) {
    override fun statusCode(): Int = 422
    fun error(): LithicError = error
}
