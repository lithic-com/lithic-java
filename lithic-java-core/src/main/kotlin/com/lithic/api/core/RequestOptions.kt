package com.lithic.api.core

class RequestOptions
private constructor(@get:JvmName("responseValidation") val responseValidation: Boolean?) {

    companion object {

        private val NONE = builder().build()

        @JvmStatic fun none() = NONE

        @JvmStatic fun builder() = Builder()
    }

    class Builder {
        private var responseValidation: Boolean? = null

        fun responseValidation(responseValidation: Boolean?) = apply {
            this.responseValidation = responseValidation
        }

        fun build(): RequestOptions {
            return RequestOptions(responseValidation)
        }
    }
}
