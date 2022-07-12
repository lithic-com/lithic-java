@file:JvmName("HttpRequestBodies")

package com.lithic.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.lithic.api.core.http.HttpRequestBody
import com.lithic.api.errors.LithicException
import java.io.OutputStream

@JvmSynthetic
internal inline fun <reified T> json(
    jsonMapper: JsonMapper,
    value: T,
): HttpRequestBody {
    return object : HttpRequestBody {
        override fun writeTo(outputStream: OutputStream) {
            try {
                return jsonMapper.writeValue(outputStream, value)
            } catch (e: Exception) {
                throw LithicException("Error writing request", e)
            }
        }

        override fun contentType(): String = "application/json"

        override fun repeatable(): Boolean = true

        override fun close() {}
    }
}
