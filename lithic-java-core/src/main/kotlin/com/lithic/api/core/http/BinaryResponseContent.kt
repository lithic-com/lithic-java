package com.lithic.api.core.http

import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.lang.AutoCloseable
import java.util.Optional

interface BinaryResponseContent : AutoCloseable {

    fun contentType(): Optional<String>

    fun body(): InputStream

    @Throws(IOException::class) fun writeTo(outputStream: OutputStream)
}
