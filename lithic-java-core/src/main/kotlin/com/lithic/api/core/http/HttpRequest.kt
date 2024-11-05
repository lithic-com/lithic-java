package com.lithic.api.core.http

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.google.common.collect.MultimapBuilder
import com.lithic.api.core.toImmutable

class HttpRequest
private constructor(
    @get:JvmName("method") val method: HttpMethod,
    @get:JvmName("url") val url: String?,
    @get:JvmName("pathSegments") val pathSegments: List<String>,
    @get:JvmName("headers") val headers: ListMultimap<String, String>,
    @get:JvmName("queryParams") val queryParams: ListMultimap<String, String>,
    @get:JvmName("body") val body: HttpRequestBody?,
) {

    override fun toString(): String =
        "HttpRequest{method=$method, url=$url, pathSegments=$pathSegments, headers=$headers, queryParams=$queryParams, body=$body}"

    companion object {
        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var method: HttpMethod? = null
        private var url: String? = null
        private var pathSegments: MutableList<String> = mutableListOf()
        private var headers: ListMultimap<String, String> =
            MultimapBuilder.treeKeys(String.CASE_INSENSITIVE_ORDER).arrayListValues().build()
        private var queryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var body: HttpRequestBody? = null

        fun method(method: HttpMethod) = apply { this.method = method }

        fun url(url: String) = apply { this.url = url }

        fun addPathSegment(pathSegment: String) = apply { pathSegments.add(pathSegment) }

        fun addPathSegments(vararg pathSegments: String) = apply {
            this.pathSegments.addAll(pathSegments)
        }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun putHeader(name: String, value: String) = apply { headers.put(name, value) }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            headers.putAll(name, values)
        }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            headers.forEach(::putHeaders)
        }

        fun replaceHeaders(name: String, value: String) = apply {
            headers.replaceValues(name, listOf(value))
        }

        fun replaceHeaders(name: String, values: Iterable<String>) = apply {
            headers.replaceValues(name, values)
        }

        fun replaceAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            headers.forEach(::replaceHeaders)
        }

        fun removeHeaders(name: String) = apply { headers.removeAll(name) }

        fun removeAllHeaders(names: Set<String>) = apply { names.forEach(::removeHeaders) }

        fun queryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun putQueryParam(key: String, value: String) = apply { queryParams.put(key, value) }

        fun putQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.putAll(key, values)
        }

        fun putAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            queryParams.forEach(::putQueryParams)
        }

        fun replaceQueryParams(key: String, value: String) = apply {
            queryParams.replaceValues(key, listOf(value))
        }

        fun replaceQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.replaceValues(key, values)
        }

        fun replaceAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            queryParams.forEach(::replaceQueryParams)
        }

        fun removeQueryParams(key: String) = apply { queryParams.removeAll(key) }

        fun removeAllQueryParams(keys: Set<String>) = apply { keys.forEach(::removeQueryParams) }

        fun body(body: HttpRequestBody) = apply { this.body = body }

        fun build(): HttpRequest =
            HttpRequest(
                checkNotNull(method) { "`method` is required but was not set" },
                url,
                pathSegments.toImmutable(),
                headers,
                queryParams.toImmutable(),
                body,
            )
    }
}
