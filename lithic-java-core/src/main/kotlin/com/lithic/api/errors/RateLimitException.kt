package com.lithic.api.errors

import com.google.common.collect.ListMultimap

class RateLimitException(
    headers: ListMultimap<String, String>,
    body: String,
    error: LithicError,
) : LithicServiceException(429, headers, body, error)
