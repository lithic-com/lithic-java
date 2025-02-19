package com.lithic.api.errors

import com.lithic.api.core.http.Headers

class RateLimitException(headers: Headers, body: String, error: LithicError) :
    LithicServiceException(429, headers, body, error)
