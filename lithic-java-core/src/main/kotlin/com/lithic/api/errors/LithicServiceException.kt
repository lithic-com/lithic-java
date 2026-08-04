// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.errors

import com.lithic.api.core.JsonValue
import com.lithic.api.core.http.Headers

abstract class LithicServiceException
protected constructor(message: String, cause: Throwable? = null) : LithicException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
