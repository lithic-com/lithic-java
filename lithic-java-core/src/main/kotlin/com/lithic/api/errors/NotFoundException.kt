package com.lithic.api.errors

import com.google.common.collect.ListMultimap

class NotFoundException
constructor(
    headers: ListMultimap<String, String>,
    private val error: LithicError,
) : LithicServiceException(headers) {
    override fun statusCode(): Int = 404
    fun error(): LithicError = error
}
