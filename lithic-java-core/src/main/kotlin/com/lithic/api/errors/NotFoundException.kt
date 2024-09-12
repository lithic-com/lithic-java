package com.lithic.api.errors

import com.google.common.collect.ListMultimap

class NotFoundException(
    headers: ListMultimap<String, String>,
    body: String,
    error: LithicError,
) : LithicServiceException(404, headers, body, error)
