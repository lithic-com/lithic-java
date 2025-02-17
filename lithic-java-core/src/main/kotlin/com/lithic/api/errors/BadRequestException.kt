package com.lithic.api.errors

import com.lithic.api.core.http.Headers

class BadRequestException(headers: Headers, body: String, error: LithicError) :
    LithicServiceException(400, headers, body, error)
