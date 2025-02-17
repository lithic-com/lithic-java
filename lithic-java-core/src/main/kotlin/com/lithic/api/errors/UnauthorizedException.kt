package com.lithic.api.errors

import com.lithic.api.core.http.Headers

class UnauthorizedException(headers: Headers, body: String, error: LithicError) :
    LithicServiceException(401, headers, body, error)
