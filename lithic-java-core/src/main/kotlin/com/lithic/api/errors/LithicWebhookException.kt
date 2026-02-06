package com.lithic.api.errors

class LithicWebhookException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : LithicException(message, cause)
