package com.lithic.api.errors

import com.google.common.collect.ListMultimap

class UnprocessableEntityException(
    headers: ListMultimap<String, String>,
    body: String,
    error: LithicError,
) : LithicServiceException(422, headers, body, error)
