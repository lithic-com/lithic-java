package com.lithic.api.errors

import com.lithic.api.core.http.Headers

class UnprocessableEntityException(headers: Headers, body: String, error: LithicError) :
    LithicServiceException(422, headers, body, error)
