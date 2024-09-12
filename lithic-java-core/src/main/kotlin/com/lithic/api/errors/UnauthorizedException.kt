package com.lithic.api.errors

import com.google.common.collect.ListMultimap

class UnauthorizedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: LithicError,
) : LithicServiceException(401, headers, body, error)
