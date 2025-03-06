// File generated from our OpenAPI spec by Stainless.

@file:JvmName("HttpRequestBodies")

package com.lithic.api.core.http

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.databind.node.JsonNodeType
import com.lithic.api.core.MultipartField
import com.lithic.api.errors.LithicInvalidDataException
import java.io.ByteArrayInputStream
import java.io.InputStream
import java.io.OutputStream
import kotlin.jvm.optionals.getOrNull
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder
import org.apache.hc.core5.http.ContentType
import org.apache.hc.core5.http.HttpEntity

@JvmSynthetic
internal inline fun <reified T> json(jsonMapper: JsonMapper, value: T): HttpRequestBody =
    object : HttpRequestBody {
        private val bytes: ByteArray by lazy { jsonMapper.writeValueAsBytes(value) }

        override fun writeTo(outputStream: OutputStream) = outputStream.write(bytes)

        override fun contentType(): String = "application/json"

        override fun contentLength(): Long = bytes.size.toLong()

        override fun repeatable(): Boolean = true

        override fun close() {}
    }

@JvmSynthetic
internal fun multipartFormData(
    jsonMapper: JsonMapper,
    fields: Map<String, MultipartField<*>>,
): HttpRequestBody =
    object : HttpRequestBody {
        private val entity: HttpEntity by lazy {
            MultipartEntityBuilder.create()
                .apply {
                    fields.forEach { (name, field) ->
                        val knownValue = field.value.asKnown().getOrNull()
                        val parts =
                            if (knownValue is InputStream) {
                                // Read directly from the `InputStream` instead of reading it all
                                // into memory due to the `jsonMapper` serialization below.
                                sequenceOf(name to knownValue)
                            } else {
                                val node = jsonMapper.valueToTree<JsonNode>(field.value)
                                serializePart(name, node)
                            }

                        parts.forEach { (name, bytes) ->
                            addBinaryBody(
                                name,
                                bytes,
                                ContentType.parseLenient(field.contentType),
                                field.filename().getOrNull(),
                            )
                        }
                    }
                }
                .build()
        }

        private fun serializePart(
            name: String,
            node: JsonNode,
        ): Sequence<Pair<String, InputStream>> =
            when (node.nodeType) {
                JsonNodeType.MISSING,
                JsonNodeType.NULL -> emptySequence()
                JsonNodeType.BINARY -> sequenceOf(name to ByteArrayInputStream(node.binaryValue()))
                JsonNodeType.STRING -> sequenceOf(name to node.textValue().toInputStream())
                JsonNodeType.BOOLEAN ->
                    sequenceOf(name to node.booleanValue().toString().toInputStream())
                JsonNodeType.NUMBER ->
                    sequenceOf(name to node.numberValue().toString().toInputStream())
                JsonNodeType.ARRAY ->
                    sequenceOf(
                        name to
                            node
                                .elements()
                                .asSequence()
                                .mapNotNull { element ->
                                    when (element.nodeType) {
                                        JsonNodeType.MISSING,
                                        JsonNodeType.NULL -> null
                                        JsonNodeType.STRING -> node.textValue()
                                        JsonNodeType.BOOLEAN -> node.booleanValue().toString()
                                        JsonNodeType.NUMBER -> node.numberValue().toString()
                                        null,
                                        JsonNodeType.BINARY,
                                        JsonNodeType.ARRAY,
                                        JsonNodeType.OBJECT,
                                        JsonNodeType.POJO ->
                                            throw LithicInvalidDataException(
                                                "Unexpected JsonNode type in array: ${node.nodeType}"
                                            )
                                    }
                                }
                                .joinToString(",")
                                .toInputStream()
                    )
                JsonNodeType.OBJECT ->
                    node.fields().asSequence().flatMap { (key, value) ->
                        serializePart("$name[$key]", value)
                    }
                JsonNodeType.POJO,
                null ->
                    throw LithicInvalidDataException("Unexpected JsonNode type: ${node.nodeType}")
            }

        private fun String.toInputStream(): InputStream = ByteArrayInputStream(toByteArray())

        override fun writeTo(outputStream: OutputStream) = entity.writeTo(outputStream)

        override fun contentType(): String = entity.contentType

        override fun contentLength(): Long = entity.contentLength

        override fun repeatable(): Boolean = entity.isRepeatable

        override fun close() = entity.close()
    }
