@file:JvmName("EmptyHandler")

package com.lithic.api.core.handlers

import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
