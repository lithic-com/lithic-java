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
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Contains the metadata for the digital wallet being tokenized. */
class TokenMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val paymentAccountInfo: JsonField<PaymentAccountInfo>,
    private val status: JsonField<String>,
    private val paymentAppInstanceId: JsonField<String>,
    private val tokenRequestorId: JsonField<String>,
    private val tokenRequestorName: JsonField<TokenRequestorName>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("payment_account_info")
        @ExcludeMissing
        paymentAccountInfo: JsonField<PaymentAccountInfo> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_app_instance_id")
        @ExcludeMissing
        paymentAppInstanceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token_requestor_id")
        @ExcludeMissing
        tokenRequestorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token_requestor_name")
        @ExcludeMissing
        tokenRequestorName: JsonField<TokenRequestorName> = JsonMissing.of(),
    ) : this(
        paymentAccountInfo,
        status,
        paymentAppInstanceId,
        tokenRequestorId,
        tokenRequestorName,
        mutableMapOf(),
    )

    /**
     * Contains the information of the account responsible for the payment.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentAccountInfo(): PaymentAccountInfo =
        paymentAccountInfo.getRequired("payment_account_info")

    /**
     * The current status of the digital wallet token. Pending or declined.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): String = status.getRequired("status")

    /**
     * The identifier of the Payment App instance within a device that will be provisioned with a
     * token
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentAppInstanceId(): Optional<String> =
        paymentAppInstanceId.getOptional("payment_app_instance_id")

    /**
     * The party that requested the digitization
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenRequestorId(): Optional<String> = tokenRequestorId.getOptional("token_requestor_id")

    /**
     * Human-readable name of the wallet that the token_requestor_id maps to.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenRequestorName(): Optional<TokenRequestorName> =
        tokenRequestorName.getOptional("token_requestor_name")

    /**
     * Returns the raw JSON value of [paymentAccountInfo].
     *
     * Unlike [paymentAccountInfo], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payment_account_info")
    @ExcludeMissing
    fun _paymentAccountInfo(): JsonField<PaymentAccountInfo> = paymentAccountInfo

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [paymentAppInstanceId].
     *
     * Unlike [paymentAppInstanceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payment_app_instance_id")
    @ExcludeMissing
    fun _paymentAppInstanceId(): JsonField<String> = paymentAppInstanceId

    /**
     * Returns the raw JSON value of [tokenRequestorId].
     *
     * Unlike [tokenRequestorId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("token_requestor_id")
    @ExcludeMissing
    fun _tokenRequestorId(): JsonField<String> = tokenRequestorId

    /**
     * Returns the raw JSON value of [tokenRequestorName].
     *
     * Unlike [tokenRequestorName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("token_requestor_name")
    @ExcludeMissing
    fun _tokenRequestorName(): JsonField<TokenRequestorName> = tokenRequestorName

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
         * Returns a mutable builder for constructing an instance of [TokenMetadata].
         *
         * The following fields are required:
         * ```java
         * .paymentAccountInfo()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenMetadata]. */
    class Builder internal constructor() {

        private var paymentAccountInfo: JsonField<PaymentAccountInfo>? = null
        private var status: JsonField<String>? = null
        private var paymentAppInstanceId: JsonField<String> = JsonMissing.of()
        private var tokenRequestorId: JsonField<String> = JsonMissing.of()
        private var tokenRequestorName: JsonField<TokenRequestorName> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tokenMetadata: TokenMetadata) = apply {
            paymentAccountInfo = tokenMetadata.paymentAccountInfo
            status = tokenMetadata.status
            paymentAppInstanceId = tokenMetadata.paymentAppInstanceId
            tokenRequestorId = tokenMetadata.tokenRequestorId
            tokenRequestorName = tokenMetadata.tokenRequestorName
            additionalProperties = tokenMetadata.additionalProperties.toMutableMap()
        }

        /** Contains the information of the account responsible for the payment. */
        fun paymentAccountInfo(paymentAccountInfo: PaymentAccountInfo) =
            paymentAccountInfo(JsonField.of(paymentAccountInfo))

        /**
         * Sets [Builder.paymentAccountInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentAccountInfo] with a well-typed
         * [PaymentAccountInfo] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun paymentAccountInfo(paymentAccountInfo: JsonField<PaymentAccountInfo>) = apply {
            this.paymentAccountInfo = paymentAccountInfo
        }

        /** The current status of the digital wallet token. Pending or declined. */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /**
         * The identifier of the Payment App instance within a device that will be provisioned with
         * a token
         */
        fun paymentAppInstanceId(paymentAppInstanceId: String?) =
            paymentAppInstanceId(JsonField.ofNullable(paymentAppInstanceId))

        /**
         * Alias for calling [Builder.paymentAppInstanceId] with
         * `paymentAppInstanceId.orElse(null)`.
         */
        fun paymentAppInstanceId(paymentAppInstanceId: Optional<String>) =
            paymentAppInstanceId(paymentAppInstanceId.getOrNull())

        /**
         * Sets [Builder.paymentAppInstanceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentAppInstanceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentAppInstanceId(paymentAppInstanceId: JsonField<String>) = apply {
            this.paymentAppInstanceId = paymentAppInstanceId
        }

        /** The party that requested the digitization */
        fun tokenRequestorId(tokenRequestorId: String) =
            tokenRequestorId(JsonField.of(tokenRequestorId))

        /**
         * Sets [Builder.tokenRequestorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenRequestorId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tokenRequestorId(tokenRequestorId: JsonField<String>) = apply {
            this.tokenRequestorId = tokenRequestorId
        }

        /** Human-readable name of the wallet that the token_requestor_id maps to. */
        fun tokenRequestorName(tokenRequestorName: TokenRequestorName) =
            tokenRequestorName(JsonField.of(tokenRequestorName))

        /**
         * Sets [Builder.tokenRequestorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenRequestorName] with a well-typed
         * [TokenRequestorName] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun tokenRequestorName(tokenRequestorName: JsonField<TokenRequestorName>) = apply {
            this.tokenRequestorName = tokenRequestorName
        }

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
         * Returns an immutable instance of [TokenMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .paymentAccountInfo()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TokenMetadata =
            TokenMetadata(
                checkRequired("paymentAccountInfo", paymentAccountInfo),
                checkRequired("status", status),
                paymentAppInstanceId,
                tokenRequestorId,
                tokenRequestorName,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TokenMetadata = apply {
        if (validated) {
            return@apply
        }

        paymentAccountInfo().validate()
        status()
        paymentAppInstanceId()
        tokenRequestorId()
        tokenRequestorName().ifPresent { it.validate() }
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
        (paymentAccountInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (paymentAppInstanceId.asKnown().isPresent) 1 else 0) +
            (if (tokenRequestorId.asKnown().isPresent) 1 else 0) +
            (tokenRequestorName.asKnown().getOrNull()?.validity() ?: 0)

    /** Contains the information of the account responsible for the payment. */
    class PaymentAccountInfo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountHolderData: JsonField<AccountHolderData>,
        private val panUniqueReference: JsonField<String>,
        private val paymentAccountReference: JsonField<String>,
        private val tokenUniqueReference: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_holder_data")
            @ExcludeMissing
            accountHolderData: JsonField<AccountHolderData> = JsonMissing.of(),
            @JsonProperty("pan_unique_reference")
            @ExcludeMissing
            panUniqueReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_account_reference")
            @ExcludeMissing
            paymentAccountReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("token_unique_reference")
            @ExcludeMissing
            tokenUniqueReference: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountHolderData,
            panUniqueReference,
            paymentAccountReference,
            tokenUniqueReference,
            mutableMapOf(),
        )

        /**
         * Additional information that can be used to identify the account holder, such as name,
         * address, etc
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountHolderData(): AccountHolderData =
            accountHolderData.getRequired("account_holder_data")

        /**
         * Reference to the PAN that is unique per Wallet Provider
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun panUniqueReference(): Optional<String> =
            panUniqueReference.getOptional("pan_unique_reference")

        /**
         * The unique account reference assigned to the PAN
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentAccountReference(): Optional<String> =
            paymentAccountReference.getOptional("payment_account_reference")

        /**
         * A unique reference assigned following the allocation of a token used to identify the
         * token for the duration of its lifetime.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokenUniqueReference(): Optional<String> =
            tokenUniqueReference.getOptional("token_unique_reference")

        /**
         * Returns the raw JSON value of [accountHolderData].
         *
         * Unlike [accountHolderData], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_holder_data")
        @ExcludeMissing
        fun _accountHolderData(): JsonField<AccountHolderData> = accountHolderData

        /**
         * Returns the raw JSON value of [panUniqueReference].
         *
         * Unlike [panUniqueReference], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("pan_unique_reference")
        @ExcludeMissing
        fun _panUniqueReference(): JsonField<String> = panUniqueReference

        /**
         * Returns the raw JSON value of [paymentAccountReference].
         *
         * Unlike [paymentAccountReference], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("payment_account_reference")
        @ExcludeMissing
        fun _paymentAccountReference(): JsonField<String> = paymentAccountReference

        /**
         * Returns the raw JSON value of [tokenUniqueReference].
         *
         * Unlike [tokenUniqueReference], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("token_unique_reference")
        @ExcludeMissing
        fun _tokenUniqueReference(): JsonField<String> = tokenUniqueReference

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
             * Returns a mutable builder for constructing an instance of [PaymentAccountInfo].
             *
             * The following fields are required:
             * ```java
             * .accountHolderData()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaymentAccountInfo]. */
        class Builder internal constructor() {

            private var accountHolderData: JsonField<AccountHolderData>? = null
            private var panUniqueReference: JsonField<String> = JsonMissing.of()
            private var paymentAccountReference: JsonField<String> = JsonMissing.of()
            private var tokenUniqueReference: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentAccountInfo: PaymentAccountInfo) = apply {
                accountHolderData = paymentAccountInfo.accountHolderData
                panUniqueReference = paymentAccountInfo.panUniqueReference
                paymentAccountReference = paymentAccountInfo.paymentAccountReference
                tokenUniqueReference = paymentAccountInfo.tokenUniqueReference
                additionalProperties = paymentAccountInfo.additionalProperties.toMutableMap()
            }

            /**
             * Additional information that can be used to identify the account holder, such as name,
             * address, etc
             */
            fun accountHolderData(accountHolderData: AccountHolderData) =
                accountHolderData(JsonField.of(accountHolderData))

            /**
             * Sets [Builder.accountHolderData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountHolderData] with a well-typed
             * [AccountHolderData] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun accountHolderData(accountHolderData: JsonField<AccountHolderData>) = apply {
                this.accountHolderData = accountHolderData
            }

            /** Reference to the PAN that is unique per Wallet Provider */
            fun panUniqueReference(panUniqueReference: String?) =
                panUniqueReference(JsonField.ofNullable(panUniqueReference))

            /**
             * Alias for calling [Builder.panUniqueReference] with
             * `panUniqueReference.orElse(null)`.
             */
            fun panUniqueReference(panUniqueReference: Optional<String>) =
                panUniqueReference(panUniqueReference.getOrNull())

            /**
             * Sets [Builder.panUniqueReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.panUniqueReference] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun panUniqueReference(panUniqueReference: JsonField<String>) = apply {
                this.panUniqueReference = panUniqueReference
            }

            /** The unique account reference assigned to the PAN */
            fun paymentAccountReference(paymentAccountReference: String?) =
                paymentAccountReference(JsonField.ofNullable(paymentAccountReference))

            /**
             * Alias for calling [Builder.paymentAccountReference] with
             * `paymentAccountReference.orElse(null)`.
             */
            fun paymentAccountReference(paymentAccountReference: Optional<String>) =
                paymentAccountReference(paymentAccountReference.getOrNull())

            /**
             * Sets [Builder.paymentAccountReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentAccountReference] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun paymentAccountReference(paymentAccountReference: JsonField<String>) = apply {
                this.paymentAccountReference = paymentAccountReference
            }

            /**
             * A unique reference assigned following the allocation of a token used to identify the
             * token for the duration of its lifetime.
             */
            fun tokenUniqueReference(tokenUniqueReference: String?) =
                tokenUniqueReference(JsonField.ofNullable(tokenUniqueReference))

            /**
             * Alias for calling [Builder.tokenUniqueReference] with
             * `tokenUniqueReference.orElse(null)`.
             */
            fun tokenUniqueReference(tokenUniqueReference: Optional<String>) =
                tokenUniqueReference(tokenUniqueReference.getOrNull())

            /**
             * Sets [Builder.tokenUniqueReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenUniqueReference] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun tokenUniqueReference(tokenUniqueReference: JsonField<String>) = apply {
                this.tokenUniqueReference = tokenUniqueReference
            }

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
             * Returns an immutable instance of [PaymentAccountInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountHolderData()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentAccountInfo =
                PaymentAccountInfo(
                    checkRequired("accountHolderData", accountHolderData),
                    panUniqueReference,
                    paymentAccountReference,
                    tokenUniqueReference,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PaymentAccountInfo = apply {
            if (validated) {
                return@apply
            }

            accountHolderData().validate()
            panUniqueReference()
            paymentAccountReference()
            tokenUniqueReference()
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
            (accountHolderData.asKnown().getOrNull()?.validity() ?: 0) +
                (if (panUniqueReference.asKnown().isPresent) 1 else 0) +
                (if (paymentAccountReference.asKnown().isPresent) 1 else 0) +
                (if (tokenUniqueReference.asKnown().isPresent) 1 else 0)

        /**
         * Additional information that can be used to identify the account holder, such as name,
         * address, etc
         */
        class AccountHolderData
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val phoneNumber: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("phone_number")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of()
            ) : this(phoneNumber, mutableMapOf())

            /**
             * The phone number, may contain country code along with phone number when
             * countryDialInCode is not present
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

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
                 * Returns a mutable builder for constructing an instance of [AccountHolderData].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AccountHolderData]. */
            class Builder internal constructor() {

                private var phoneNumber: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accountHolderData: AccountHolderData) = apply {
                    phoneNumber = accountHolderData.phoneNumber
                    additionalProperties = accountHolderData.additionalProperties.toMutableMap()
                }

                /**
                 * The phone number, may contain country code along with phone number when
                 * countryDialInCode is not present
                 */
                fun phoneNumber(phoneNumber: String?) =
                    phoneNumber(JsonField.ofNullable(phoneNumber))

                /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
                fun phoneNumber(phoneNumber: Optional<String>) =
                    phoneNumber(phoneNumber.getOrNull())

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

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
                 * Returns an immutable instance of [AccountHolderData].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AccountHolderData =
                    AccountHolderData(phoneNumber, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): AccountHolderData = apply {
                if (validated) {
                    return@apply
                }

                phoneNumber()
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
            internal fun validity(): Int = (if (phoneNumber.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccountHolderData &&
                    phoneNumber == other.phoneNumber &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(phoneNumber, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccountHolderData{phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentAccountInfo &&
                accountHolderData == other.accountHolderData &&
                panUniqueReference == other.panUniqueReference &&
                paymentAccountReference == other.paymentAccountReference &&
                tokenUniqueReference == other.tokenUniqueReference &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountHolderData,
                panUniqueReference,
                paymentAccountReference,
                tokenUniqueReference,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentAccountInfo{accountHolderData=$accountHolderData, panUniqueReference=$panUniqueReference, paymentAccountReference=$paymentAccountReference, tokenUniqueReference=$tokenUniqueReference, additionalProperties=$additionalProperties}"
    }

    /** Human-readable name of the wallet that the token_requestor_id maps to. */
    class TokenRequestorName
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

            @JvmField val AMAZON_ONE = of("AMAZON_ONE")

            @JvmField val ANDROID_PAY = of("ANDROID_PAY")

            @JvmField val APPLE_PAY = of("APPLE_PAY")

            @JvmField val FACEBOOK = of("FACEBOOK")

            @JvmField val FITBIT_PAY = of("FITBIT_PAY")

            @JvmField val GARMIN_PAY = of("GARMIN_PAY")

            @JvmField val GOOGLE_PAY = of("GOOGLE_PAY")

            @JvmField val MICROSOFT_PAY = of("MICROSOFT_PAY")

            @JvmField val NETFLIX = of("NETFLIX")

            @JvmField val SAMSUNG_PAY = of("SAMSUNG_PAY")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val VISA_CHECKOUT = of("VISA_CHECKOUT")

            @JvmStatic fun of(value: String) = TokenRequestorName(JsonField.of(value))
        }

        /** An enum containing [TokenRequestorName]'s known values. */
        enum class Known {
            AMAZON_ONE,
            ANDROID_PAY,
            APPLE_PAY,
            FACEBOOK,
            FITBIT_PAY,
            GARMIN_PAY,
            GOOGLE_PAY,
            MICROSOFT_PAY,
            NETFLIX,
            SAMSUNG_PAY,
            UNKNOWN,
            VISA_CHECKOUT,
        }

        /**
         * An enum containing [TokenRequestorName]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TokenRequestorName] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AMAZON_ONE,
            ANDROID_PAY,
            APPLE_PAY,
            FACEBOOK,
            FITBIT_PAY,
            GARMIN_PAY,
            GOOGLE_PAY,
            MICROSOFT_PAY,
            NETFLIX,
            SAMSUNG_PAY,
            UNKNOWN,
            VISA_CHECKOUT,
            /**
             * An enum member indicating that [TokenRequestorName] was instantiated with an unknown
             * value.
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
                AMAZON_ONE -> Value.AMAZON_ONE
                ANDROID_PAY -> Value.ANDROID_PAY
                APPLE_PAY -> Value.APPLE_PAY
                FACEBOOK -> Value.FACEBOOK
                FITBIT_PAY -> Value.FITBIT_PAY
                GARMIN_PAY -> Value.GARMIN_PAY
                GOOGLE_PAY -> Value.GOOGLE_PAY
                MICROSOFT_PAY -> Value.MICROSOFT_PAY
                NETFLIX -> Value.NETFLIX
                SAMSUNG_PAY -> Value.SAMSUNG_PAY
                UNKNOWN -> Value.UNKNOWN
                VISA_CHECKOUT -> Value.VISA_CHECKOUT
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
                AMAZON_ONE -> Known.AMAZON_ONE
                ANDROID_PAY -> Known.ANDROID_PAY
                APPLE_PAY -> Known.APPLE_PAY
                FACEBOOK -> Known.FACEBOOK
                FITBIT_PAY -> Known.FITBIT_PAY
                GARMIN_PAY -> Known.GARMIN_PAY
                GOOGLE_PAY -> Known.GOOGLE_PAY
                MICROSOFT_PAY -> Known.MICROSOFT_PAY
                NETFLIX -> Known.NETFLIX
                SAMSUNG_PAY -> Known.SAMSUNG_PAY
                UNKNOWN -> Known.UNKNOWN
                VISA_CHECKOUT -> Known.VISA_CHECKOUT
                else -> throw LithicInvalidDataException("Unknown TokenRequestorName: $value")
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

        fun validate(): TokenRequestorName = apply {
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

            return other is TokenRequestorName && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenMetadata &&
            paymentAccountInfo == other.paymentAccountInfo &&
            status == other.status &&
            paymentAppInstanceId == other.paymentAppInstanceId &&
            tokenRequestorId == other.tokenRequestorId &&
            tokenRequestorName == other.tokenRequestorName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            paymentAccountInfo,
            status,
            paymentAppInstanceId,
            tokenRequestorId,
            tokenRequestorName,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TokenMetadata{paymentAccountInfo=$paymentAccountInfo, status=$status, paymentAppInstanceId=$paymentAppInstanceId, tokenRequestorId=$tokenRequestorId, tokenRequestorName=$tokenRequestorName, additionalProperties=$additionalProperties}"
}
