package com.lithic.api.errors

import com.google.common.collect.ListMultimap

class UnexpectedStatusCodeException
constructor(
    private val statusCode: Int,
    headers: ListMultimap<String, String>,
    private val body: String
) : LithicServiceException(headers, "Unexpected status code: ${statusCode}") {
    override fun statusCode(): Int = statusCode

    fun body() = body
}
