package com.lithic.api.errors

import com.lithic.api.core.http.Headers

class InternalServerException(statusCode: Int, headers: Headers, body: String, error: LithicError) :
    LithicServiceException(statusCode, headers, body, error)
