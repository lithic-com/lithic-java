package com.lithic.api.errors

import com.google.common.collect.ListMultimap

class PermissionDeniedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: LithicError,
) : LithicServiceException(403, headers, body, error)
