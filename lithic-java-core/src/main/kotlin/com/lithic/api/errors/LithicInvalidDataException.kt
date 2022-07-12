package com.lithic.api.errors

class LithicInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : LithicException(message, cause)
