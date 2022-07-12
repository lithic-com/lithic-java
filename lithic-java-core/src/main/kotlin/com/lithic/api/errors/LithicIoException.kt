package com.lithic.api.errors

class LithicIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : LithicException(message, cause)
