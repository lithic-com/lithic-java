package com.lithic.api.core.http

import java.io.Closeable
import java.util.concurrent.CompletableFuture

interface HttpClient : Closeable {

    fun execute(
        request: HttpRequest,
    ): HttpResponse

    fun executeAsync(
        request: HttpRequest,
    ): CompletableFuture<HttpResponse>
}
