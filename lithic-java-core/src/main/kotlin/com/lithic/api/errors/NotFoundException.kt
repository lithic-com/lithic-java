package com.lithic.api.errors

import com.lithic.api.core.http.Headers

class NotFoundException(
    headers: Headers,
    body: String,
    error: LithicError,
) : LithicServiceException(404, headers, body, error)
