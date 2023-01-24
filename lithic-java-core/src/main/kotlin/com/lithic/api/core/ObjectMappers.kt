@file:JvmName("ObjectMappers")

package com.lithic.api.core

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.databind.cfg.CoercionAction.Fail
import com.fasterxml.jackson.databind.cfg.CoercionInputShape.Integer
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonMapperBuilder

fun jsonMapper(): JsonMapper =
    jacksonMapperBuilder()
        .addModule(Jdk8Module())
        .addModule(JavaTimeModule())
        .serializationInclusion(JsonInclude.Include.NON_ABSENT)
        .disable(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)
        .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
        .disable(SerializationFeature.WRITE_DURATIONS_AS_TIMESTAMPS)
        .withCoercionConfig(String::class.java) { it.setCoercion(Integer, Fail) }
        .build()
