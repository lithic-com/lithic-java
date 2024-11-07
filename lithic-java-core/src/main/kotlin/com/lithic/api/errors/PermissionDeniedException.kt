package com.lithic.api.errors

import com.lithic.api.core.http.Headers

class PermissionDeniedException(
    headers: Headers,
    body: String,
    error: LithicError,
) : LithicServiceException(403, headers, body, error)
