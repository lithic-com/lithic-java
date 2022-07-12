package com.lithic.api.core.http

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.google.common.collect.Multimap
import com.google.common.collect.MultimapBuilder
import com.lithic.api.core.toUnmodifiable

class HttpRequest
private constructor(
    @get:JvmName("method") val method: HttpMethod,
    @get:JvmName("pathSegments") val pathSegments: List<String>,
    @get:JvmName("queryParams") val queryParams: ListMultimap<String, String>,
    @get:JvmName("headers") val headers: ListMultimap<String, String>,
    @get:JvmName("body") val body: HttpRequestBody?,
) {

    override fun toString(): String =
        "HttpRequest {method=$method, pathSegments=$pathSegments, queryParams=$queryParams, headers=$headers, body=$body}"

    companion object {
        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var method: HttpMethod? = null
        private var pathSegments: MutableList<String> = ArrayList()
        private var queryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var body: HttpRequestBody? = null
        private var headers: ListMultimap<String, String> =
            MultimapBuilder.treeKeys(String.CASE_INSENSITIVE_ORDER).arrayListValues().build()

        fun method(method: HttpMethod) = apply { this.method = method }

        fun addPathSegment(pathSegment: String) = apply { this.pathSegments.add(pathSegment) }

        fun addPathSegments(vararg pathSegments: String) = apply {
            for (pathSegment in pathSegments) {
                this.pathSegments.add(pathSegment)
            }
        }

        fun putQueryParam(name: String, value: String) = apply { this.queryParams.put(name, value) }

        fun putAllQueryParams(queryParams: Multimap<String, String>) = apply {
            this.queryParams.putAll(queryParams)
        }

        fun putHeader(name: String, value: String) = apply { this.headers.put(name, value) }

        fun putAllHeaders(headers: Multimap<String, String>) = apply {
            this.headers.putAll(headers)
        }

        fun body(body: HttpRequestBody) = apply { this.body = body }

        fun build(): HttpRequest =
            HttpRequest(
                checkNotNull(method) { "Method is required but was not set" },
                pathSegments.toUnmodifiable(),
                queryParams.toUnmodifiable(),
                headers,
                body,
            )
    }
}
