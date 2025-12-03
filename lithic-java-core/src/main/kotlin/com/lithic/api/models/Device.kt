// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Device
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val imei: JsonField<String>,
    private val ipAddress: JsonField<String>,
    private val location: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("imei") @ExcludeMissing imei: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ip_address") @ExcludeMissing ipAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("location") @ExcludeMissing location: JsonField<String> = JsonMissing.of(),
    ) : this(imei, ipAddress, location, mutableMapOf())

    /**
     * The IMEI number of the device being provisioned. For Amex, this field contains device ID
     * instead as IMEI is not provided
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun imei(): Optional<String> = imei.getOptional("imei")

    /**
     * The IP address of the device initiating the request
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ipAddress(): Optional<String> = ipAddress.getOptional("ip_address")

    /**
     * Latitude and longitude where the device is located during the authorization attempt
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun location(): Optional<String> = location.getOptional("location")

    /**
     * Returns the raw JSON value of [imei].
     *
     * Unlike [imei], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imei") @ExcludeMissing fun _imei(): JsonField<String> = imei

    /**
     * Returns the raw JSON value of [ipAddress].
     *
     * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ip_address") @ExcludeMissing fun _ipAddress(): JsonField<String> = ipAddress

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<String> = location

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
         * Returns a mutable builder for constructing an instance of [Device].
         *
         * The following fields are required:
         * ```java
         * .imei()
         * .ipAddress()
         * .location()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Device]. */
    class Builder internal constructor() {

        private var imei: JsonField<String>? = null
        private var ipAddress: JsonField<String>? = null
        private var location: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(device: Device) = apply {
            imei = device.imei
            ipAddress = device.ipAddress
            location = device.location
            additionalProperties = device.additionalProperties.toMutableMap()
        }

        /**
         * The IMEI number of the device being provisioned. For Amex, this field contains device ID
         * instead as IMEI is not provided
         */
        fun imei(imei: String?) = imei(JsonField.ofNullable(imei))

        /** Alias for calling [Builder.imei] with `imei.orElse(null)`. */
        fun imei(imei: Optional<String>) = imei(imei.getOrNull())

        /**
         * Sets [Builder.imei] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imei] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun imei(imei: JsonField<String>) = apply { this.imei = imei }

        /** The IP address of the device initiating the request */
        fun ipAddress(ipAddress: String?) = ipAddress(JsonField.ofNullable(ipAddress))

        /** Alias for calling [Builder.ipAddress] with `ipAddress.orElse(null)`. */
        fun ipAddress(ipAddress: Optional<String>) = ipAddress(ipAddress.getOrNull())

        /**
         * Sets [Builder.ipAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

        /** Latitude and longitude where the device is located during the authorization attempt */
        fun location(location: String?) = location(JsonField.ofNullable(location))

        /** Alias for calling [Builder.location] with `location.orElse(null)`. */
        fun location(location: Optional<String>) = location(location.getOrNull())

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun location(location: JsonField<String>) = apply { this.location = location }

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
         * Returns an immutable instance of [Device].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .imei()
         * .ipAddress()
         * .location()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Device =
            Device(
                checkRequired("imei", imei),
                checkRequired("ipAddress", ipAddress),
                checkRequired("location", location),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Device = apply {
        if (validated) {
            return@apply
        }

        imei()
        ipAddress()
        location()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (imei.asKnown().isPresent) 1 else 0) +
            (if (ipAddress.asKnown().isPresent) 1 else 0) +
            (if (location.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Device &&
            imei == other.imei &&
            ipAddress == other.ipAddress &&
            location == other.location &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(imei, ipAddress, location, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Device{imei=$imei, ipAddress=$ipAddress, location=$location, additionalProperties=$additionalProperties}"
}
