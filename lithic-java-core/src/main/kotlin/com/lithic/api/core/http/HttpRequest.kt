package com.lithic.api.core.http

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.google.common.collect.Multimap
import com.google.common.collect.MultimapBuilder
import com.lithic.api.core.toImmutable

class HttpRequest
private constructor(
    @get:JvmName("method") val method: HttpMethod,
    @get:JvmName("url") val url: String?,
    @get:JvmName("pathSegments") val pathSegments: List<String>,
    @get:JvmName("queryParams") val queryParams: ListMultimap<String, String>,
    @get:JvmName("headers") val headers: ListMultimap<String, String>,
    @get:JvmName("body") val body: HttpRequestBody?,
) {

    override fun toString(): String =
        "HttpRequest{method=$method, pathSegments=$pathSegments, queryParams=$queryParams, headers=$headers, body=$body}"

    companion object {
        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var method: HttpMethod? = null
        private var url: String? = null
        private var pathSegments: MutableList<String> = ArrayList()
        private var queryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var body: HttpRequestBody? = null
        private var headers: ListMultimap<String, String> =
            MultimapBuilder.treeKeys(String.CASE_INSENSITIVE_ORDER).arrayListValues().build()

        fun method(method: HttpMethod) = apply { this.method = method }

        fun url(url: String) = apply { this.url = url }

        fun addPathSegment(pathSegment: String) = apply { this.pathSegments.add(pathSegment) }

        fun addPathSegments(vararg pathSegments: String) = apply {
            for (pathSegment in pathSegments) {
                this.pathSegments.add(pathSegment)
            }
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.queryParams.replaceValues(name, listOf(value))
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.queryParams.replaceValues(name, values)
        }

        fun putAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            queryParams.forEach(this::putQueryParams)
        }

        fun putAllQueryParams(queryParams: Multimap<String, String>) = apply {
            queryParams.asMap().forEach(this::putQueryParams)
        }

        fun putHeader(name: String, value: String) = apply {
            this.headers.replaceValues(name, listOf(value))
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.headers.replaceValues(name, values)
        }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            headers.forEach(this::putHeaders)
        }

        fun putAllHeaders(headers: Multimap<String, String>) = apply {
            headers.asMap().forEach(this::putHeaders)
        }

        fun body(body: HttpRequestBody) = apply { this.body = body }

        fun build(): HttpRequest =
            HttpRequest(
                checkNotNull(method) { "`method` is required but was not set" },
                url,
                pathSegments.toImmutable(),
                queryParams.toImmutable(),
                headers,
                body,
            )
    }
}
