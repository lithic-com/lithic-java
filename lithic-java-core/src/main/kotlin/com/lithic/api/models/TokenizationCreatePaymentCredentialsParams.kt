// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * > 🚧 Beta API > This endpoint is in beta and subject to change.
 *
 * Create payment credentials and a purchase mandate for an ACTIVE tokenization.
 *
 * The credential value, expiration date, and CVV are only available in this response and cannot be
 * retrieved later.
 */
class TokenizationCreatePaymentCredentialsParams
private constructor(
    private val tokenizationToken: String?,
    private val body: CreatePaymentCredentialsRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun tokenizationToken(): Optional<String> = Optional.ofNullable(tokenizationToken)

    /**
     * Device used for the purchase
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun device(): PaymentCredentialsDevice = body.device()

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mandate(): PaymentCredentialsMandate = body.mandate()

    /**
     * Type of purchase for which payment credentials are requested
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): PaymentCredentialsType = body.type()

    /**
     * Returns the raw JSON value of [device].
     *
     * Unlike [device], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _device(): JsonField<PaymentCredentialsDevice> = body._device()

    /**
     * Returns the raw JSON value of [mandate].
     *
     * Unlike [mandate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mandate(): JsonField<PaymentCredentialsMandate> = body._mandate()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<PaymentCredentialsType> = body._type()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TokenizationCreatePaymentCredentialsParams].
         *
         * The following fields are required:
         * ```java
         * .device()
         * .mandate()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenizationCreatePaymentCredentialsParams]. */
    class Builder internal constructor() {

        private var tokenizationToken: String? = null
        private var body: CreatePaymentCredentialsRequest.Builder =
            CreatePaymentCredentialsRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            tokenizationCreatePaymentCredentialsParams: TokenizationCreatePaymentCredentialsParams
        ) = apply {
            tokenizationToken = tokenizationCreatePaymentCredentialsParams.tokenizationToken
            body = tokenizationCreatePaymentCredentialsParams.body.toBuilder()
            additionalHeaders =
                tokenizationCreatePaymentCredentialsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                tokenizationCreatePaymentCredentialsParams.additionalQueryParams.toBuilder()
        }

        fun tokenizationToken(tokenizationToken: String?) = apply {
            this.tokenizationToken = tokenizationToken
        }

        /** Alias for calling [Builder.tokenizationToken] with `tokenizationToken.orElse(null)`. */
        fun tokenizationToken(tokenizationToken: Optional<String>) =
            tokenizationToken(tokenizationToken.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [device]
         * - [mandate]
         * - [type]
         */
        fun body(body: CreatePaymentCredentialsRequest) = apply { this.body = body.toBuilder() }

        /** Device used for the purchase */
        fun device(device: PaymentCredentialsDevice) = apply { body.device(device) }

        /**
         * Sets [Builder.device] to an arbitrary JSON value.
         *
         * You should usually call [Builder.device] with a well-typed [PaymentCredentialsDevice]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun device(device: JsonField<PaymentCredentialsDevice>) = apply { body.device(device) }

        fun mandate(mandate: PaymentCredentialsMandate) = apply { body.mandate(mandate) }

        /**
         * Sets [Builder.mandate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mandate] with a well-typed [PaymentCredentialsMandate]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun mandate(mandate: JsonField<PaymentCredentialsMandate>) = apply { body.mandate(mandate) }

        /** Type of purchase for which payment credentials are requested */
        fun type(type: PaymentCredentialsType) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [PaymentCredentialsType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<PaymentCredentialsType>) = apply { body.type(type) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [TokenizationCreatePaymentCredentialsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .device()
         * .mandate()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TokenizationCreatePaymentCredentialsParams =
            TokenizationCreatePaymentCredentialsParams(
                tokenizationToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): CreatePaymentCredentialsRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> tokenizationToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class CreatePaymentCredentialsRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val device: JsonField<PaymentCredentialsDevice>,
        private val mandate: JsonField<PaymentCredentialsMandate>,
        private val type: JsonField<PaymentCredentialsType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("device")
            @ExcludeMissing
            device: JsonField<PaymentCredentialsDevice> = JsonMissing.of(),
            @JsonProperty("mandate")
            @ExcludeMissing
            mandate: JsonField<PaymentCredentialsMandate> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            type: JsonField<PaymentCredentialsType> = JsonMissing.of(),
        ) : this(device, mandate, type, mutableMapOf())

        /**
         * Device used for the purchase
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun device(): PaymentCredentialsDevice = device.getRequired("device")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mandate(): PaymentCredentialsMandate = mandate.getRequired("mandate")

        /**
         * Type of purchase for which payment credentials are requested
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): PaymentCredentialsType = type.getRequired("type")

        /**
         * Returns the raw JSON value of [device].
         *
         * Unlike [device], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("device")
        @ExcludeMissing
        fun _device(): JsonField<PaymentCredentialsDevice> = device

        /**
         * Returns the raw JSON value of [mandate].
         *
         * Unlike [mandate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mandate")
        @ExcludeMissing
        fun _mandate(): JsonField<PaymentCredentialsMandate> = mandate

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<PaymentCredentialsType> = type

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [CreatePaymentCredentialsRequest].
             *
             * The following fields are required:
             * ```java
             * .device()
             * .mandate()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreatePaymentCredentialsRequest]. */
        class Builder internal constructor() {

            private var device: JsonField<PaymentCredentialsDevice>? = null
            private var mandate: JsonField<PaymentCredentialsMandate>? = null
            private var type: JsonField<PaymentCredentialsType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createPaymentCredentialsRequest: CreatePaymentCredentialsRequest) =
                apply {
                    device = createPaymentCredentialsRequest.device
                    mandate = createPaymentCredentialsRequest.mandate
                    type = createPaymentCredentialsRequest.type
                    additionalProperties =
                        createPaymentCredentialsRequest.additionalProperties.toMutableMap()
                }

            /** Device used for the purchase */
            fun device(device: PaymentCredentialsDevice) = device(JsonField.of(device))

            /**
             * Sets [Builder.device] to an arbitrary JSON value.
             *
             * You should usually call [Builder.device] with a well-typed [PaymentCredentialsDevice]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun device(device: JsonField<PaymentCredentialsDevice>) = apply { this.device = device }

            fun mandate(mandate: PaymentCredentialsMandate) = mandate(JsonField.of(mandate))

            /**
             * Sets [Builder.mandate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mandate] with a well-typed
             * [PaymentCredentialsMandate] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun mandate(mandate: JsonField<PaymentCredentialsMandate>) = apply {
                this.mandate = mandate
            }

            /** Type of purchase for which payment credentials are requested */
            fun type(type: PaymentCredentialsType) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [PaymentCredentialsType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun type(type: JsonField<PaymentCredentialsType>) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [CreatePaymentCredentialsRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .device()
             * .mandate()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreatePaymentCredentialsRequest =
                CreatePaymentCredentialsRequest(
                    checkRequired("device", device),
                    checkRequired("mandate", mandate),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): CreatePaymentCredentialsRequest = apply {
            if (validated) {
                return@apply
            }

            device().validate()
            mandate().validate()
            type().validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (device.asKnown().getOrNull()?.validity() ?: 0) +
                (mandate.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreatePaymentCredentialsRequest &&
                device == other.device &&
                mandate == other.mandate &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(device, mandate, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreatePaymentCredentialsRequest{device=$device, mandate=$mandate, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Device used for the purchase */
    class PaymentCredentialsDevice
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val applicationName: JsonField<String>,
        private val brand: JsonField<String>,
        private val ipAddress: JsonField<String>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("application_name")
            @ExcludeMissing
            applicationName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("brand") @ExcludeMissing brand: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ip_address")
            @ExcludeMissing
            ipAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(applicationName, brand, ipAddress, type, mutableMapOf())

        /**
         * Name of the application used for the purchase
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun applicationName(): String = applicationName.getRequired("application_name")

        /**
         * Device brand
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun brand(): String = brand.getRequired("brand")

        /**
         * IP address of the device
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ipAddress(): String = ipAddress.getRequired("ip_address")

        /**
         * Device type
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): String = type.getRequired("type")

        /**
         * Returns the raw JSON value of [applicationName].
         *
         * Unlike [applicationName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("application_name")
        @ExcludeMissing
        fun _applicationName(): JsonField<String> = applicationName

        /**
         * Returns the raw JSON value of [brand].
         *
         * Unlike [brand], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("brand") @ExcludeMissing fun _brand(): JsonField<String> = brand

        /**
         * Returns the raw JSON value of [ipAddress].
         *
         * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ip_address") @ExcludeMissing fun _ipAddress(): JsonField<String> = ipAddress

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [PaymentCredentialsDevice].
             *
             * The following fields are required:
             * ```java
             * .applicationName()
             * .brand()
             * .ipAddress()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaymentCredentialsDevice]. */
        class Builder internal constructor() {

            private var applicationName: JsonField<String>? = null
            private var brand: JsonField<String>? = null
            private var ipAddress: JsonField<String>? = null
            private var type: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentCredentialsDevice: PaymentCredentialsDevice) = apply {
                applicationName = paymentCredentialsDevice.applicationName
                brand = paymentCredentialsDevice.brand
                ipAddress = paymentCredentialsDevice.ipAddress
                type = paymentCredentialsDevice.type
                additionalProperties = paymentCredentialsDevice.additionalProperties.toMutableMap()
            }

            /** Name of the application used for the purchase */
            fun applicationName(applicationName: String) =
                applicationName(JsonField.of(applicationName))

            /**
             * Sets [Builder.applicationName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicationName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun applicationName(applicationName: JsonField<String>) = apply {
                this.applicationName = applicationName
            }

            /** Device brand */
            fun brand(brand: String) = brand(JsonField.of(brand))

            /**
             * Sets [Builder.brand] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brand] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun brand(brand: JsonField<String>) = apply { this.brand = brand }

            /** IP address of the device */
            fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

            /**
             * Sets [Builder.ipAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

            /** Device type */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [PaymentCredentialsDevice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .applicationName()
             * .brand()
             * .ipAddress()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentCredentialsDevice =
                PaymentCredentialsDevice(
                    checkRequired("applicationName", applicationName),
                    checkRequired("brand", brand),
                    checkRequired("ipAddress", ipAddress),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): PaymentCredentialsDevice = apply {
            if (validated) {
                return@apply
            }

            applicationName()
            brand()
            ipAddress()
            type()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (applicationName.asKnown().isPresent) 1 else 0) +
                (if (brand.asKnown().isPresent) 1 else 0) +
                (if (ipAddress.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentCredentialsDevice &&
                applicationName == other.applicationName &&
                brand == other.brand &&
                ipAddress == other.ipAddress &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(applicationName, brand, ipAddress, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentCredentialsDevice{applicationName=$applicationName, brand=$brand, ipAddress=$ipAddress, type=$type, additionalProperties=$additionalProperties}"
    }

    class PaymentCredentialsMandate
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Long>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val frequency: JsonField<Frequency>,
        private val merchant: JsonField<Merchant>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("frequency")
            @ExcludeMissing
            frequency: JsonField<Frequency> = JsonMissing.of(),
            @JsonProperty("merchant")
            @ExcludeMissing
            merchant: JsonField<Merchant> = JsonMissing.of(),
        ) : this(amount, expiresAt, frequency, merchant, mutableMapOf())

        /**
         * Purchase amount and mandate limit in USD cents
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * Date and time when the mandate expires, independent of the payment credentials'
         * expiration
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

        /**
         * Purchase frequency. RECURRING purchases require WEEKLY, MONTHLY, or YEARLY
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun frequency(): Frequency = frequency.getRequired("frequency")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun merchant(): Merchant = merchant.getRequired("merchant")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /**
         * Returns the raw JSON value of [frequency].
         *
         * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("frequency")
        @ExcludeMissing
        fun _frequency(): JsonField<Frequency> = frequency

        /**
         * Returns the raw JSON value of [merchant].
         *
         * Unlike [merchant], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("merchant") @ExcludeMissing fun _merchant(): JsonField<Merchant> = merchant

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [PaymentCredentialsMandate].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .expiresAt()
             * .frequency()
             * .merchant()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaymentCredentialsMandate]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var expiresAt: JsonField<OffsetDateTime>? = null
            private var frequency: JsonField<Frequency>? = null
            private var merchant: JsonField<Merchant>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentCredentialsMandate: PaymentCredentialsMandate) = apply {
                amount = paymentCredentialsMandate.amount
                expiresAt = paymentCredentialsMandate.expiresAt
                frequency = paymentCredentialsMandate.frequency
                merchant = paymentCredentialsMandate.merchant
                additionalProperties = paymentCredentialsMandate.additionalProperties.toMutableMap()
            }

            /** Purchase amount and mandate limit in USD cents */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * Date and time when the mandate expires, independent of the payment credentials'
             * expiration
             */
            fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /** Purchase frequency. RECURRING purchases require WEEKLY, MONTHLY, or YEARLY */
            fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

            /**
             * Sets [Builder.frequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frequency] with a well-typed [Frequency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frequency(frequency: JsonField<Frequency>) = apply { this.frequency = frequency }

            fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

            /**
             * Sets [Builder.merchant] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchant] with a well-typed [Merchant] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [PaymentCredentialsMandate].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .expiresAt()
             * .frequency()
             * .merchant()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentCredentialsMandate =
                PaymentCredentialsMandate(
                    checkRequired("amount", amount),
                    checkRequired("expiresAt", expiresAt),
                    checkRequired("frequency", frequency),
                    checkRequired("merchant", merchant),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): PaymentCredentialsMandate = apply {
            if (validated) {
                return@apply
            }

            amount()
            expiresAt()
            frequency().validate()
            merchant().validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (amount.asKnown().isPresent) 1 else 0) +
                (if (expiresAt.asKnown().isPresent) 1 else 0) +
                (frequency.asKnown().getOrNull()?.validity() ?: 0) +
                (merchant.asKnown().getOrNull()?.validity() ?: 0)

        /** Purchase frequency. RECURRING purchases require WEEKLY, MONTHLY, or YEARLY */
        class Frequency @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ONE_TIME = of("ONE_TIME")

                @JvmField val WEEKLY = of("WEEKLY")

                @JvmField val MONTHLY = of("MONTHLY")

                @JvmField val YEARLY = of("YEARLY")

                @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
            }

            /** An enum containing [Frequency]'s known values. */
            enum class Known {
                ONE_TIME,
                WEEKLY,
                MONTHLY,
                YEARLY,
            }

            /**
             * An enum containing [Frequency]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Frequency] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ONE_TIME,
                WEEKLY,
                MONTHLY,
                YEARLY,
                /**
                 * An enum member indicating that [Frequency] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ONE_TIME -> Value.ONE_TIME
                    WEEKLY -> Value.WEEKLY
                    MONTHLY -> Value.MONTHLY
                    YEARLY -> Value.YEARLY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ONE_TIME -> Known.ONE_TIME
                    WEEKLY -> Known.WEEKLY
                    MONTHLY -> Known.MONTHLY
                    YEARLY -> Known.YEARLY
                    else -> throw LithicInvalidDataException("Unknown Frequency: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Frequency = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Frequency && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Merchant
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val name: JsonField<String>,
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            ) : this(name, url, mutableMapOf())

            /**
             * Merchant name
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * Merchant website URL
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Merchant].
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .url()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Merchant]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var url: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(merchant: Merchant) = apply {
                    name = merchant.name
                    url = merchant.url
                    additionalProperties = merchant.additionalProperties.toMutableMap()
                }

                /** Merchant name */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** Merchant website URL */
                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Merchant].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .url()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Merchant =
                    Merchant(
                        checkRequired("name", name),
                        checkRequired("url", url),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LithicInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Merchant = apply {
                if (validated) {
                    return@apply
                }

                name()
                url()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (name.asKnown().isPresent) 1 else 0) + (if (url.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Merchant &&
                    name == other.name &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(name, url, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Merchant{name=$name, url=$url, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentCredentialsMandate &&
                amount == other.amount &&
                expiresAt == other.expiresAt &&
                frequency == other.frequency &&
                merchant == other.merchant &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(amount, expiresAt, frequency, merchant, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentCredentialsMandate{amount=$amount, expiresAt=$expiresAt, frequency=$frequency, merchant=$merchant, additionalProperties=$additionalProperties}"
    }

    /** Type of purchase for which payment credentials are requested */
    class PaymentCredentialsType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AUTONOMOUS = of("AUTONOMOUS")

            @JvmField val HUMAN_IN_THE_LOOP = of("HUMAN_IN_THE_LOOP")

            @JvmField val RECURRING = of("RECURRING")

            @JvmStatic fun of(value: String) = PaymentCredentialsType(JsonField.of(value))
        }

        /** An enum containing [PaymentCredentialsType]'s known values. */
        enum class Known {
            AUTONOMOUS,
            HUMAN_IN_THE_LOOP,
            RECURRING,
        }

        /**
         * An enum containing [PaymentCredentialsType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [PaymentCredentialsType] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTONOMOUS,
            HUMAN_IN_THE_LOOP,
            RECURRING,
            /**
             * An enum member indicating that [PaymentCredentialsType] was instantiated with an
             * unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AUTONOMOUS -> Value.AUTONOMOUS
                HUMAN_IN_THE_LOOP -> Value.HUMAN_IN_THE_LOOP
                RECURRING -> Value.RECURRING
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AUTONOMOUS -> Known.AUTONOMOUS
                HUMAN_IN_THE_LOOP -> Known.HUMAN_IN_THE_LOOP
                RECURRING -> Known.RECURRING
                else -> throw LithicInvalidDataException("Unknown PaymentCredentialsType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LithicInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): PaymentCredentialsType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentCredentialsType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenizationCreatePaymentCredentialsParams &&
            tokenizationToken == other.tokenizationToken &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(tokenizationToken, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TokenizationCreatePaymentCredentialsParams{tokenizationToken=$tokenizationToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
