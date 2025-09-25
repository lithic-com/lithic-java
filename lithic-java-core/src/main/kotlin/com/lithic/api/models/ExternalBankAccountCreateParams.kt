// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.BaseDeserializer
import com.lithic.api.core.BaseSerializer
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.Params
import com.lithic.api.core.allMaxBy
import com.lithic.api.core.checkRequired
import com.lithic.api.core.getOrThrow
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Creates an external bank account within a program or Lithic account. */
class ExternalBankAccountCreateParams
private constructor(
    private val body: Body?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun body(): Optional<Body> = Optional.ofNullable(body)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ExternalBankAccountCreateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExternalBankAccountCreateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalBankAccountCreateParams]. */
    class Builder internal constructor() {

        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(externalBankAccountCreateParams: ExternalBankAccountCreateParams) =
            apply {
                body = externalBankAccountCreateParams.body
                additionalHeaders = externalBankAccountCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    externalBankAccountCreateParams.additionalQueryParams.toBuilder()
            }

        fun body(body: Body?) = apply { this.body = body }

        /** Alias for calling [Builder.body] with `body.orElse(null)`. */
        fun body(body: Optional<Body>) = body(body.getOrNull())

        /**
         * Alias for calling [body] with
         * `Body.ofBankVerifiedCreateBankAccountApiRequest(bankVerifiedCreateBankAccountApiRequest)`.
         */
        fun body(
            bankVerifiedCreateBankAccountApiRequest: Body.BankVerifiedCreateBankAccountApiRequest
        ) =
            body(
                Body.ofBankVerifiedCreateBankAccountApiRequest(
                    bankVerifiedCreateBankAccountApiRequest
                )
            )

        /**
         * Alias for calling [body] with
         * `Body.ofPlaidCreateBankAccountApiRequest(plaidCreateBankAccountApiRequest)`.
         */
        fun body(plaidCreateBankAccountApiRequest: Body.PlaidCreateBankAccountApiRequest) =
            body(Body.ofPlaidCreateBankAccountApiRequest(plaidCreateBankAccountApiRequest))

        /** Alias for calling [body] with `Body.ofExternallyVerified(externallyVerified)`. */
        fun body(externallyVerified: Body.ExternallyVerifiedCreateBankAccountApiRequest) =
            body(Body.ofExternallyVerified(externallyVerified))

        /** Alias for calling [body] with `Body.ofUnverified(unverified)`. */
        fun body(unverified: Body.UnverifiedCreateBankAccountApiRequest) =
            body(Body.ofUnverified(unverified))

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
         * Returns an immutable instance of [ExternalBankAccountCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExternalBankAccountCreateParams =
            ExternalBankAccountCreateParams(
                body,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Optional<Body> = Optional.ofNullable(body)

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val bankVerifiedCreateBankAccountApiRequest:
            BankVerifiedCreateBankAccountApiRequest? =
            null,
        private val plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest? = null,
        private val externallyVerified: ExternallyVerifiedCreateBankAccountApiRequest? = null,
        private val unverified: UnverifiedCreateBankAccountApiRequest? = null,
        private val _json: JsonValue? = null,
    ) {

        fun bankVerifiedCreateBankAccountApiRequest():
            Optional<BankVerifiedCreateBankAccountApiRequest> =
            Optional.ofNullable(bankVerifiedCreateBankAccountApiRequest)

        fun plaidCreateBankAccountApiRequest(): Optional<PlaidCreateBankAccountApiRequest> =
            Optional.ofNullable(plaidCreateBankAccountApiRequest)

        fun externallyVerified(): Optional<ExternallyVerifiedCreateBankAccountApiRequest> =
            Optional.ofNullable(externallyVerified)

        fun unverified(): Optional<UnverifiedCreateBankAccountApiRequest> =
            Optional.ofNullable(unverified)

        fun isBankVerifiedCreateBankAccountApiRequest(): Boolean =
            bankVerifiedCreateBankAccountApiRequest != null

        fun isPlaidCreateBankAccountApiRequest(): Boolean = plaidCreateBankAccountApiRequest != null

        fun isExternallyVerified(): Boolean = externallyVerified != null

        fun isUnverified(): Boolean = unverified != null

        fun asBankVerifiedCreateBankAccountApiRequest(): BankVerifiedCreateBankAccountApiRequest =
            bankVerifiedCreateBankAccountApiRequest.getOrThrow(
                "bankVerifiedCreateBankAccountApiRequest"
            )

        fun asPlaidCreateBankAccountApiRequest(): PlaidCreateBankAccountApiRequest =
            plaidCreateBankAccountApiRequest.getOrThrow("plaidCreateBankAccountApiRequest")

        fun asExternallyVerified(): ExternallyVerifiedCreateBankAccountApiRequest =
            externallyVerified.getOrThrow("externallyVerified")

        fun asUnverified(): UnverifiedCreateBankAccountApiRequest =
            unverified.getOrThrow("unverified")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                bankVerifiedCreateBankAccountApiRequest != null ->
                    visitor.visitBankVerifiedCreateBankAccountApiRequest(
                        bankVerifiedCreateBankAccountApiRequest
                    )
                plaidCreateBankAccountApiRequest != null ->
                    visitor.visitPlaidCreateBankAccountApiRequest(plaidCreateBankAccountApiRequest)
                externallyVerified != null -> visitor.visitExternallyVerified(externallyVerified)
                unverified != null -> visitor.visitUnverified(unverified)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitBankVerifiedCreateBankAccountApiRequest(
                        bankVerifiedCreateBankAccountApiRequest:
                            BankVerifiedCreateBankAccountApiRequest
                    ) {
                        bankVerifiedCreateBankAccountApiRequest.validate()
                    }

                    override fun visitPlaidCreateBankAccountApiRequest(
                        plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest
                    ) {
                        plaidCreateBankAccountApiRequest.validate()
                    }

                    override fun visitExternallyVerified(
                        externallyVerified: ExternallyVerifiedCreateBankAccountApiRequest
                    ) {
                        externallyVerified.validate()
                    }

                    override fun visitUnverified(
                        unverified: UnverifiedCreateBankAccountApiRequest
                    ) {
                        unverified.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitBankVerifiedCreateBankAccountApiRequest(
                        bankVerifiedCreateBankAccountApiRequest:
                            BankVerifiedCreateBankAccountApiRequest
                    ) = bankVerifiedCreateBankAccountApiRequest.validity()

                    override fun visitPlaidCreateBankAccountApiRequest(
                        plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest
                    ) = plaidCreateBankAccountApiRequest.validity()

                    override fun visitExternallyVerified(
                        externallyVerified: ExternallyVerifiedCreateBankAccountApiRequest
                    ) = externallyVerified.validity()

                    override fun visitUnverified(
                        unverified: UnverifiedCreateBankAccountApiRequest
                    ) = unverified.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                bankVerifiedCreateBankAccountApiRequest ==
                    other.bankVerifiedCreateBankAccountApiRequest &&
                plaidCreateBankAccountApiRequest == other.plaidCreateBankAccountApiRequest &&
                externallyVerified == other.externallyVerified &&
                unverified == other.unverified
        }

        override fun hashCode(): Int =
            Objects.hash(
                bankVerifiedCreateBankAccountApiRequest,
                plaidCreateBankAccountApiRequest,
                externallyVerified,
                unverified,
            )

        override fun toString(): String =
            when {
                bankVerifiedCreateBankAccountApiRequest != null ->
                    "Body{bankVerifiedCreateBankAccountApiRequest=$bankVerifiedCreateBankAccountApiRequest}"
                plaidCreateBankAccountApiRequest != null ->
                    "Body{plaidCreateBankAccountApiRequest=$plaidCreateBankAccountApiRequest}"
                externallyVerified != null -> "Body{externallyVerified=$externallyVerified}"
                unverified != null -> "Body{unverified=$unverified}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            @JvmStatic
            fun ofBankVerifiedCreateBankAccountApiRequest(
                bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest
            ) =
                Body(
                    bankVerifiedCreateBankAccountApiRequest =
                        bankVerifiedCreateBankAccountApiRequest
                )

            @JvmStatic
            fun ofPlaidCreateBankAccountApiRequest(
                plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest
            ) = Body(plaidCreateBankAccountApiRequest = plaidCreateBankAccountApiRequest)

            @JvmStatic
            fun ofExternallyVerified(
                externallyVerified: ExternallyVerifiedCreateBankAccountApiRequest
            ) = Body(externallyVerified = externallyVerified)

            @JvmStatic
            fun ofUnverified(unverified: UnverifiedCreateBankAccountApiRequest) =
                Body(unverified = unverified)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitBankVerifiedCreateBankAccountApiRequest(
                bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest
            ): T

            fun visitPlaidCreateBankAccountApiRequest(
                plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest
            ): T

            fun visitExternallyVerified(
                externallyVerified: ExternallyVerifiedCreateBankAccountApiRequest
            ): T

            fun visitUnverified(unverified: UnverifiedCreateBankAccountApiRequest): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LithicInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LithicInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)
                val verificationMethod =
                    json.asObject().getOrNull()?.get("verification_method")?.asString()?.getOrNull()

                when (verificationMethod) {
                    "EXTERNALLY_VERIFIED" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<ExternallyVerifiedCreateBankAccountApiRequest>(),
                            )
                            ?.let { Body(externallyVerified = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "UNVERIFIED" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<UnverifiedCreateBankAccountApiRequest>(),
                            )
                            ?.let { Body(unverified = it, _json = json) } ?: Body(_json = json)
                    }
                }

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<BankVerifiedCreateBankAccountApiRequest>(),
                                )
                                ?.let {
                                    Body(bankVerifiedCreateBankAccountApiRequest = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PlaidCreateBankAccountApiRequest>())
                                ?.let { Body(plaidCreateBankAccountApiRequest = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Body(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.bankVerifiedCreateBankAccountApiRequest != null ->
                        generator.writeObject(value.bankVerifiedCreateBankAccountApiRequest)
                    value.plaidCreateBankAccountApiRequest != null ->
                        generator.writeObject(value.plaidCreateBankAccountApiRequest)
                    value.externallyVerified != null ->
                        generator.writeObject(value.externallyVerified)
                    value.unverified != null -> generator.writeObject(value.unverified)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class BankVerifiedCreateBankAccountApiRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val country: JsonField<String>,
            private val currency: JsonField<String>,
            private val financialAccountToken: JsonField<String>,
            private val owner: JsonField<String>,
            private val ownerType: JsonField<OwnerType>,
            private val routingNumber: JsonField<String>,
            private val type: JsonField<AccountType>,
            private val verificationMethod: JsonField<VerificationMethod>,
            private val accountToken: JsonField<String>,
            private val address: JsonField<ExternalBankAccountAddress>,
            private val companyId: JsonField<String>,
            private val dob: JsonField<LocalDate>,
            private val doingBusinessAs: JsonField<String>,
            private val name: JsonField<String>,
            private val userDefinedId: JsonField<String>,
            private val verificationEnforcement: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("account_number")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("financial_account_token")
                @ExcludeMissing
                financialAccountToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("owner") @ExcludeMissing owner: JsonField<String> = JsonMissing.of(),
                @JsonProperty("owner_type")
                @ExcludeMissing
                ownerType: JsonField<OwnerType> = JsonMissing.of(),
                @JsonProperty("routing_number")
                @ExcludeMissing
                routingNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<AccountType> = JsonMissing.of(),
                @JsonProperty("verification_method")
                @ExcludeMissing
                verificationMethod: JsonField<VerificationMethod> = JsonMissing.of(),
                @JsonProperty("account_token")
                @ExcludeMissing
                accountToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<ExternalBankAccountAddress> = JsonMissing.of(),
                @JsonProperty("company_id")
                @ExcludeMissing
                companyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("dob") @ExcludeMissing dob: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("doing_business_as")
                @ExcludeMissing
                doingBusinessAs: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_defined_id")
                @ExcludeMissing
                userDefinedId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("verification_enforcement")
                @ExcludeMissing
                verificationEnforcement: JsonField<Boolean> = JsonMissing.of(),
            ) : this(
                accountNumber,
                country,
                currency,
                financialAccountToken,
                owner,
                ownerType,
                routingNumber,
                type,
                verificationMethod,
                accountToken,
                address,
                companyId,
                dob,
                doingBusinessAs,
                name,
                userDefinedId,
                verificationEnforcement,
                mutableMapOf(),
            )

            /**
             * Account Number
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("account_number")

            /**
             * The country that the bank account is located in using ISO 3166-1. We will only accept
             * USA bank accounts e.g., USA
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun country(): String = country.getRequired("country")

            /**
             * currency of the external account 3-character alphabetic ISO 4217 code
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * The financial account token of the operating account to fund the micro deposits
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun financialAccountToken(): String =
                financialAccountToken.getRequired("financial_account_token")

            /**
             * Legal Name of the business or individual who owns the external account. This will
             * appear in statements
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun owner(): String = owner.getRequired("owner")

            /**
             * Owner Type
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ownerType(): OwnerType = ownerType.getRequired("owner_type")

            /**
             * Routing Number
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun routingNumber(): String = routingNumber.getRequired("routing_number")

            /**
             * Account Type
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): AccountType = type.getRequired("type")

            /**
             * Verification Method
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun verificationMethod(): VerificationMethod =
                verificationMethod.getRequired("verification_method")

            /**
             * Indicates which Lithic account the external account is associated with. For external
             * accounts that are associated with the program, account_token field returned will be
             * null
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun accountToken(): Optional<String> = accountToken.getOptional("account_token")

            /**
             * Address
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun address(): Optional<ExternalBankAccountAddress> = address.getOptional("address")

            /**
             * Optional field that helps identify bank accounts in receipts
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun companyId(): Optional<String> = companyId.getOptional("company_id")

            /**
             * Date of Birth of the Individual that owns the external bank account
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun dob(): Optional<LocalDate> = dob.getOptional("dob")

            /**
             * Doing Business As
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun doingBusinessAs(): Optional<String> =
                doingBusinessAs.getOptional("doing_business_as")

            /**
             * The nickname for this External Bank Account
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * User Defined ID
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userDefinedId(): Optional<String> = userDefinedId.getOptional("user_defined_id")

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun verificationEnforcement(): Optional<Boolean> =
                verificationEnforcement.getOptional("verification_enforcement")

            /**
             * Returns the raw JSON value of [accountNumber].
             *
             * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("account_number")
            @ExcludeMissing
            fun _accountNumber(): JsonField<String> = accountNumber

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [financialAccountToken].
             *
             * Unlike [financialAccountToken], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("financial_account_token")
            @ExcludeMissing
            fun _financialAccountToken(): JsonField<String> = financialAccountToken

            /**
             * Returns the raw JSON value of [owner].
             *
             * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

            /**
             * Returns the raw JSON value of [ownerType].
             *
             * Unlike [ownerType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("owner_type")
            @ExcludeMissing
            fun _ownerType(): JsonField<OwnerType> = ownerType

            /**
             * Returns the raw JSON value of [routingNumber].
             *
             * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("routing_number")
            @ExcludeMissing
            fun _routingNumber(): JsonField<String> = routingNumber

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AccountType> = type

            /**
             * Returns the raw JSON value of [verificationMethod].
             *
             * Unlike [verificationMethod], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("verification_method")
            @ExcludeMissing
            fun _verificationMethod(): JsonField<VerificationMethod> = verificationMethod

            /**
             * Returns the raw JSON value of [accountToken].
             *
             * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("account_token")
            @ExcludeMissing
            fun _accountToken(): JsonField<String> = accountToken

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address")
            @ExcludeMissing
            fun _address(): JsonField<ExternalBankAccountAddress> = address

            /**
             * Returns the raw JSON value of [companyId].
             *
             * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("company_id")
            @ExcludeMissing
            fun _companyId(): JsonField<String> = companyId

            /**
             * Returns the raw JSON value of [dob].
             *
             * Unlike [dob], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<LocalDate> = dob

            /**
             * Returns the raw JSON value of [doingBusinessAs].
             *
             * Unlike [doingBusinessAs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("doing_business_as")
            @ExcludeMissing
            fun _doingBusinessAs(): JsonField<String> = doingBusinessAs

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [userDefinedId].
             *
             * Unlike [userDefinedId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_defined_id")
            @ExcludeMissing
            fun _userDefinedId(): JsonField<String> = userDefinedId

            /**
             * Returns the raw JSON value of [verificationEnforcement].
             *
             * Unlike [verificationEnforcement], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("verification_enforcement")
            @ExcludeMissing
            fun _verificationEnforcement(): JsonField<Boolean> = verificationEnforcement

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
                 * [BankVerifiedCreateBankAccountApiRequest].
                 *
                 * The following fields are required:
                 * ```java
                 * .accountNumber()
                 * .country()
                 * .currency()
                 * .financialAccountToken()
                 * .owner()
                 * .ownerType()
                 * .routingNumber()
                 * .type()
                 * .verificationMethod()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [BankVerifiedCreateBankAccountApiRequest]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var country: JsonField<String>? = null
                private var currency: JsonField<String>? = null
                private var financialAccountToken: JsonField<String>? = null
                private var owner: JsonField<String>? = null
                private var ownerType: JsonField<OwnerType>? = null
                private var routingNumber: JsonField<String>? = null
                private var type: JsonField<AccountType>? = null
                private var verificationMethod: JsonField<VerificationMethod>? = null
                private var accountToken: JsonField<String> = JsonMissing.of()
                private var address: JsonField<ExternalBankAccountAddress> = JsonMissing.of()
                private var companyId: JsonField<String> = JsonMissing.of()
                private var dob: JsonField<LocalDate> = JsonMissing.of()
                private var doingBusinessAs: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var userDefinedId: JsonField<String> = JsonMissing.of()
                private var verificationEnforcement: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    bankVerifiedCreateBankAccountApiRequest: BankVerifiedCreateBankAccountApiRequest
                ) = apply {
                    accountNumber = bankVerifiedCreateBankAccountApiRequest.accountNumber
                    country = bankVerifiedCreateBankAccountApiRequest.country
                    currency = bankVerifiedCreateBankAccountApiRequest.currency
                    financialAccountToken =
                        bankVerifiedCreateBankAccountApiRequest.financialAccountToken
                    owner = bankVerifiedCreateBankAccountApiRequest.owner
                    ownerType = bankVerifiedCreateBankAccountApiRequest.ownerType
                    routingNumber = bankVerifiedCreateBankAccountApiRequest.routingNumber
                    type = bankVerifiedCreateBankAccountApiRequest.type
                    verificationMethod = bankVerifiedCreateBankAccountApiRequest.verificationMethod
                    accountToken = bankVerifiedCreateBankAccountApiRequest.accountToken
                    address = bankVerifiedCreateBankAccountApiRequest.address
                    companyId = bankVerifiedCreateBankAccountApiRequest.companyId
                    dob = bankVerifiedCreateBankAccountApiRequest.dob
                    doingBusinessAs = bankVerifiedCreateBankAccountApiRequest.doingBusinessAs
                    name = bankVerifiedCreateBankAccountApiRequest.name
                    userDefinedId = bankVerifiedCreateBankAccountApiRequest.userDefinedId
                    verificationEnforcement =
                        bankVerifiedCreateBankAccountApiRequest.verificationEnforcement
                    additionalProperties =
                        bankVerifiedCreateBankAccountApiRequest.additionalProperties.toMutableMap()
                }

                /** Account Number */
                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /**
                 * Sets [Builder.accountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                /**
                 * The country that the bank account is located in using ISO 3166-1. We will only
                 * accept USA bank accounts e.g., USA
                 */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /** currency of the external account 3-character alphabetic ISO 4217 code */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /**
                 * The financial account token of the operating account to fund the micro deposits
                 */
                fun financialAccountToken(financialAccountToken: String) =
                    financialAccountToken(JsonField.of(financialAccountToken))

                /**
                 * Sets [Builder.financialAccountToken] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.financialAccountToken] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
                    this.financialAccountToken = financialAccountToken
                }

                /**
                 * Legal Name of the business or individual who owns the external account. This will
                 * appear in statements
                 */
                fun owner(owner: String) = owner(JsonField.of(owner))

                /**
                 * Sets [Builder.owner] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.owner] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun owner(owner: JsonField<String>) = apply { this.owner = owner }

                /** Owner Type */
                fun ownerType(ownerType: OwnerType) = ownerType(JsonField.of(ownerType))

                /**
                 * Sets [Builder.ownerType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ownerType] with a well-typed [OwnerType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ownerType(ownerType: JsonField<OwnerType>) = apply {
                    this.ownerType = ownerType
                }

                /** Routing Number */
                fun routingNumber(routingNumber: String) =
                    routingNumber(JsonField.of(routingNumber))

                /**
                 * Sets [Builder.routingNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routingNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun routingNumber(routingNumber: JsonField<String>) = apply {
                    this.routingNumber = routingNumber
                }

                /** Account Type */
                fun type(type: AccountType) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [AccountType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun type(type: JsonField<AccountType>) = apply { this.type = type }

                /** Verification Method */
                fun verificationMethod(verificationMethod: VerificationMethod) =
                    verificationMethod(JsonField.of(verificationMethod))

                /**
                 * Sets [Builder.verificationMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.verificationMethod] with a well-typed
                 * [VerificationMethod] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun verificationMethod(verificationMethod: JsonField<VerificationMethod>) = apply {
                    this.verificationMethod = verificationMethod
                }

                /**
                 * Indicates which Lithic account the external account is associated with. For
                 * external accounts that are associated with the program, account_token field
                 * returned will be null
                 */
                fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

                /**
                 * Sets [Builder.accountToken] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountToken] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountToken(accountToken: JsonField<String>) = apply {
                    this.accountToken = accountToken
                }

                /** Address */
                fun address(address: ExternalBankAccountAddress) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed
                 * [ExternalBankAccountAddress] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun address(address: JsonField<ExternalBankAccountAddress>) = apply {
                    this.address = address
                }

                /** Optional field that helps identify bank accounts in receipts */
                fun companyId(companyId: String) = companyId(JsonField.of(companyId))

                /**
                 * Sets [Builder.companyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.companyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

                /** Date of Birth of the Individual that owns the external bank account */
                fun dob(dob: LocalDate) = dob(JsonField.of(dob))

                /**
                 * Sets [Builder.dob] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dob] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dob(dob: JsonField<LocalDate>) = apply { this.dob = dob }

                /** Doing Business As */
                fun doingBusinessAs(doingBusinessAs: String) =
                    doingBusinessAs(JsonField.of(doingBusinessAs))

                /**
                 * Sets [Builder.doingBusinessAs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.doingBusinessAs] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
                    this.doingBusinessAs = doingBusinessAs
                }

                /** The nickname for this External Bank Account */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** User Defined ID */
                fun userDefinedId(userDefinedId: String) =
                    userDefinedId(JsonField.of(userDefinedId))

                /**
                 * Sets [Builder.userDefinedId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userDefinedId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userDefinedId(userDefinedId: JsonField<String>) = apply {
                    this.userDefinedId = userDefinedId
                }

                fun verificationEnforcement(verificationEnforcement: Boolean) =
                    verificationEnforcement(JsonField.of(verificationEnforcement))

                /**
                 * Sets [Builder.verificationEnforcement] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.verificationEnforcement] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun verificationEnforcement(verificationEnforcement: JsonField<Boolean>) = apply {
                    this.verificationEnforcement = verificationEnforcement
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
                 * Returns an immutable instance of [BankVerifiedCreateBankAccountApiRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .accountNumber()
                 * .country()
                 * .currency()
                 * .financialAccountToken()
                 * .owner()
                 * .ownerType()
                 * .routingNumber()
                 * .type()
                 * .verificationMethod()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BankVerifiedCreateBankAccountApiRequest =
                    BankVerifiedCreateBankAccountApiRequest(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("country", country),
                        checkRequired("currency", currency),
                        checkRequired("financialAccountToken", financialAccountToken),
                        checkRequired("owner", owner),
                        checkRequired("ownerType", ownerType),
                        checkRequired("routingNumber", routingNumber),
                        checkRequired("type", type),
                        checkRequired("verificationMethod", verificationMethod),
                        accountToken,
                        address,
                        companyId,
                        dob,
                        doingBusinessAs,
                        name,
                        userDefinedId,
                        verificationEnforcement,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): BankVerifiedCreateBankAccountApiRequest = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                country()
                currency()
                financialAccountToken()
                owner()
                ownerType().validate()
                routingNumber()
                type().validate()
                verificationMethod().validate()
                accountToken()
                address().ifPresent { it.validate() }
                companyId()
                dob()
                doingBusinessAs()
                name()
                userDefinedId()
                verificationEnforcement()
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
                (if (accountNumber.asKnown().isPresent) 1 else 0) +
                    (if (country.asKnown().isPresent) 1 else 0) +
                    (if (currency.asKnown().isPresent) 1 else 0) +
                    (if (financialAccountToken.asKnown().isPresent) 1 else 0) +
                    (if (owner.asKnown().isPresent) 1 else 0) +
                    (ownerType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (routingNumber.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (verificationMethod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (accountToken.asKnown().isPresent) 1 else 0) +
                    (address.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (companyId.asKnown().isPresent) 1 else 0) +
                    (if (dob.asKnown().isPresent) 1 else 0) +
                    (if (doingBusinessAs.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (userDefinedId.asKnown().isPresent) 1 else 0) +
                    (if (verificationEnforcement.asKnown().isPresent) 1 else 0)

            /** Account Type */
            class AccountType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CHECKING = of("CHECKING")

                    @JvmField val SAVINGS = of("SAVINGS")

                    @JvmStatic fun of(value: String) = AccountType(JsonField.of(value))
                }

                /** An enum containing [AccountType]'s known values. */
                enum class Known {
                    CHECKING,
                    SAVINGS,
                }

                /**
                 * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AccountType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CHECKING,
                    SAVINGS,
                    /**
                     * An enum member indicating that [AccountType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CHECKING -> Value.CHECKING
                        SAVINGS -> Value.SAVINGS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CHECKING -> Known.CHECKING
                        SAVINGS -> Known.SAVINGS
                        else -> throw LithicInvalidDataException("Unknown AccountType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): AccountType = apply {
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

                    return other is AccountType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BankVerifiedCreateBankAccountApiRequest &&
                    accountNumber == other.accountNumber &&
                    country == other.country &&
                    currency == other.currency &&
                    financialAccountToken == other.financialAccountToken &&
                    owner == other.owner &&
                    ownerType == other.ownerType &&
                    routingNumber == other.routingNumber &&
                    type == other.type &&
                    verificationMethod == other.verificationMethod &&
                    accountToken == other.accountToken &&
                    address == other.address &&
                    companyId == other.companyId &&
                    dob == other.dob &&
                    doingBusinessAs == other.doingBusinessAs &&
                    name == other.name &&
                    userDefinedId == other.userDefinedId &&
                    verificationEnforcement == other.verificationEnforcement &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    country,
                    currency,
                    financialAccountToken,
                    owner,
                    ownerType,
                    routingNumber,
                    type,
                    verificationMethod,
                    accountToken,
                    address,
                    companyId,
                    dob,
                    doingBusinessAs,
                    name,
                    userDefinedId,
                    verificationEnforcement,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BankVerifiedCreateBankAccountApiRequest{accountNumber=$accountNumber, country=$country, currency=$currency, financialAccountToken=$financialAccountToken, owner=$owner, ownerType=$ownerType, routingNumber=$routingNumber, type=$type, verificationMethod=$verificationMethod, accountToken=$accountToken, address=$address, companyId=$companyId, dob=$dob, doingBusinessAs=$doingBusinessAs, name=$name, userDefinedId=$userDefinedId, verificationEnforcement=$verificationEnforcement, additionalProperties=$additionalProperties}"
        }

        class PlaidCreateBankAccountApiRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val owner: JsonField<String>,
            private val ownerType: JsonField<OwnerType>,
            private val processorToken: JsonField<String>,
            private val verificationMethod: JsonField<VerificationMethod>,
            private val accountToken: JsonField<String>,
            private val companyId: JsonField<String>,
            private val dob: JsonField<LocalDate>,
            private val doingBusinessAs: JsonField<String>,
            private val userDefinedId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("owner") @ExcludeMissing owner: JsonField<String> = JsonMissing.of(),
                @JsonProperty("owner_type")
                @ExcludeMissing
                ownerType: JsonField<OwnerType> = JsonMissing.of(),
                @JsonProperty("processor_token")
                @ExcludeMissing
                processorToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("verification_method")
                @ExcludeMissing
                verificationMethod: JsonField<VerificationMethod> = JsonMissing.of(),
                @JsonProperty("account_token")
                @ExcludeMissing
                accountToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("company_id")
                @ExcludeMissing
                companyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("dob") @ExcludeMissing dob: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("doing_business_as")
                @ExcludeMissing
                doingBusinessAs: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_defined_id")
                @ExcludeMissing
                userDefinedId: JsonField<String> = JsonMissing.of(),
            ) : this(
                owner,
                ownerType,
                processorToken,
                verificationMethod,
                accountToken,
                companyId,
                dob,
                doingBusinessAs,
                userDefinedId,
                mutableMapOf(),
            )

            /**
             * Legal Name of the business or individual who owns the external account. This will
             * appear in statements
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun owner(): String = owner.getRequired("owner")

            /**
             * Owner Type
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ownerType(): OwnerType = ownerType.getRequired("owner_type")

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun processorToken(): String = processorToken.getRequired("processor_token")

            /**
             * Verification Method
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun verificationMethod(): VerificationMethod =
                verificationMethod.getRequired("verification_method")

            /**
             * Indicates which Lithic account the external account is associated with. For external
             * accounts that are associated with the program, account_token field returned will be
             * null
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun accountToken(): Optional<String> = accountToken.getOptional("account_token")

            /**
             * Optional field that helps identify bank accounts in receipts
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun companyId(): Optional<String> = companyId.getOptional("company_id")

            /**
             * Date of Birth of the Individual that owns the external bank account
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun dob(): Optional<LocalDate> = dob.getOptional("dob")

            /**
             * Doing Business As
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun doingBusinessAs(): Optional<String> =
                doingBusinessAs.getOptional("doing_business_as")

            /**
             * User Defined ID
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userDefinedId(): Optional<String> = userDefinedId.getOptional("user_defined_id")

            /**
             * Returns the raw JSON value of [owner].
             *
             * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

            /**
             * Returns the raw JSON value of [ownerType].
             *
             * Unlike [ownerType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("owner_type")
            @ExcludeMissing
            fun _ownerType(): JsonField<OwnerType> = ownerType

            /**
             * Returns the raw JSON value of [processorToken].
             *
             * Unlike [processorToken], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("processor_token")
            @ExcludeMissing
            fun _processorToken(): JsonField<String> = processorToken

            /**
             * Returns the raw JSON value of [verificationMethod].
             *
             * Unlike [verificationMethod], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("verification_method")
            @ExcludeMissing
            fun _verificationMethod(): JsonField<VerificationMethod> = verificationMethod

            /**
             * Returns the raw JSON value of [accountToken].
             *
             * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("account_token")
            @ExcludeMissing
            fun _accountToken(): JsonField<String> = accountToken

            /**
             * Returns the raw JSON value of [companyId].
             *
             * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("company_id")
            @ExcludeMissing
            fun _companyId(): JsonField<String> = companyId

            /**
             * Returns the raw JSON value of [dob].
             *
             * Unlike [dob], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<LocalDate> = dob

            /**
             * Returns the raw JSON value of [doingBusinessAs].
             *
             * Unlike [doingBusinessAs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("doing_business_as")
            @ExcludeMissing
            fun _doingBusinessAs(): JsonField<String> = doingBusinessAs

            /**
             * Returns the raw JSON value of [userDefinedId].
             *
             * Unlike [userDefinedId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_defined_id")
            @ExcludeMissing
            fun _userDefinedId(): JsonField<String> = userDefinedId

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
                 * [PlaidCreateBankAccountApiRequest].
                 *
                 * The following fields are required:
                 * ```java
                 * .owner()
                 * .ownerType()
                 * .processorToken()
                 * .verificationMethod()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PlaidCreateBankAccountApiRequest]. */
            class Builder internal constructor() {

                private var owner: JsonField<String>? = null
                private var ownerType: JsonField<OwnerType>? = null
                private var processorToken: JsonField<String>? = null
                private var verificationMethod: JsonField<VerificationMethod>? = null
                private var accountToken: JsonField<String> = JsonMissing.of()
                private var companyId: JsonField<String> = JsonMissing.of()
                private var dob: JsonField<LocalDate> = JsonMissing.of()
                private var doingBusinessAs: JsonField<String> = JsonMissing.of()
                private var userDefinedId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    plaidCreateBankAccountApiRequest: PlaidCreateBankAccountApiRequest
                ) = apply {
                    owner = plaidCreateBankAccountApiRequest.owner
                    ownerType = plaidCreateBankAccountApiRequest.ownerType
                    processorToken = plaidCreateBankAccountApiRequest.processorToken
                    verificationMethod = plaidCreateBankAccountApiRequest.verificationMethod
                    accountToken = plaidCreateBankAccountApiRequest.accountToken
                    companyId = plaidCreateBankAccountApiRequest.companyId
                    dob = plaidCreateBankAccountApiRequest.dob
                    doingBusinessAs = plaidCreateBankAccountApiRequest.doingBusinessAs
                    userDefinedId = plaidCreateBankAccountApiRequest.userDefinedId
                    additionalProperties =
                        plaidCreateBankAccountApiRequest.additionalProperties.toMutableMap()
                }

                /**
                 * Legal Name of the business or individual who owns the external account. This will
                 * appear in statements
                 */
                fun owner(owner: String) = owner(JsonField.of(owner))

                /**
                 * Sets [Builder.owner] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.owner] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun owner(owner: JsonField<String>) = apply { this.owner = owner }

                /** Owner Type */
                fun ownerType(ownerType: OwnerType) = ownerType(JsonField.of(ownerType))

                /**
                 * Sets [Builder.ownerType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ownerType] with a well-typed [OwnerType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ownerType(ownerType: JsonField<OwnerType>) = apply {
                    this.ownerType = ownerType
                }

                fun processorToken(processorToken: String) =
                    processorToken(JsonField.of(processorToken))

                /**
                 * Sets [Builder.processorToken] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.processorToken] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun processorToken(processorToken: JsonField<String>) = apply {
                    this.processorToken = processorToken
                }

                /** Verification Method */
                fun verificationMethod(verificationMethod: VerificationMethod) =
                    verificationMethod(JsonField.of(verificationMethod))

                /**
                 * Sets [Builder.verificationMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.verificationMethod] with a well-typed
                 * [VerificationMethod] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun verificationMethod(verificationMethod: JsonField<VerificationMethod>) = apply {
                    this.verificationMethod = verificationMethod
                }

                /**
                 * Indicates which Lithic account the external account is associated with. For
                 * external accounts that are associated with the program, account_token field
                 * returned will be null
                 */
                fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

                /**
                 * Sets [Builder.accountToken] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountToken] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountToken(accountToken: JsonField<String>) = apply {
                    this.accountToken = accountToken
                }

                /** Optional field that helps identify bank accounts in receipts */
                fun companyId(companyId: String) = companyId(JsonField.of(companyId))

                /**
                 * Sets [Builder.companyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.companyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

                /** Date of Birth of the Individual that owns the external bank account */
                fun dob(dob: LocalDate) = dob(JsonField.of(dob))

                /**
                 * Sets [Builder.dob] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dob] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dob(dob: JsonField<LocalDate>) = apply { this.dob = dob }

                /** Doing Business As */
                fun doingBusinessAs(doingBusinessAs: String) =
                    doingBusinessAs(JsonField.of(doingBusinessAs))

                /**
                 * Sets [Builder.doingBusinessAs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.doingBusinessAs] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
                    this.doingBusinessAs = doingBusinessAs
                }

                /** User Defined ID */
                fun userDefinedId(userDefinedId: String) =
                    userDefinedId(JsonField.of(userDefinedId))

                /**
                 * Sets [Builder.userDefinedId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userDefinedId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userDefinedId(userDefinedId: JsonField<String>) = apply {
                    this.userDefinedId = userDefinedId
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
                 * Returns an immutable instance of [PlaidCreateBankAccountApiRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .owner()
                 * .ownerType()
                 * .processorToken()
                 * .verificationMethod()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PlaidCreateBankAccountApiRequest =
                    PlaidCreateBankAccountApiRequest(
                        checkRequired("owner", owner),
                        checkRequired("ownerType", ownerType),
                        checkRequired("processorToken", processorToken),
                        checkRequired("verificationMethod", verificationMethod),
                        accountToken,
                        companyId,
                        dob,
                        doingBusinessAs,
                        userDefinedId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PlaidCreateBankAccountApiRequest = apply {
                if (validated) {
                    return@apply
                }

                owner()
                ownerType().validate()
                processorToken()
                verificationMethod().validate()
                accountToken()
                companyId()
                dob()
                doingBusinessAs()
                userDefinedId()
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
                (if (owner.asKnown().isPresent) 1 else 0) +
                    (ownerType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (processorToken.asKnown().isPresent) 1 else 0) +
                    (verificationMethod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (accountToken.asKnown().isPresent) 1 else 0) +
                    (if (companyId.asKnown().isPresent) 1 else 0) +
                    (if (dob.asKnown().isPresent) 1 else 0) +
                    (if (doingBusinessAs.asKnown().isPresent) 1 else 0) +
                    (if (userDefinedId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PlaidCreateBankAccountApiRequest &&
                    owner == other.owner &&
                    ownerType == other.ownerType &&
                    processorToken == other.processorToken &&
                    verificationMethod == other.verificationMethod &&
                    accountToken == other.accountToken &&
                    companyId == other.companyId &&
                    dob == other.dob &&
                    doingBusinessAs == other.doingBusinessAs &&
                    userDefinedId == other.userDefinedId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    owner,
                    ownerType,
                    processorToken,
                    verificationMethod,
                    accountToken,
                    companyId,
                    dob,
                    doingBusinessAs,
                    userDefinedId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PlaidCreateBankAccountApiRequest{owner=$owner, ownerType=$ownerType, processorToken=$processorToken, verificationMethod=$verificationMethod, accountToken=$accountToken, companyId=$companyId, dob=$dob, doingBusinessAs=$doingBusinessAs, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
        }

        class ExternallyVerifiedCreateBankAccountApiRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val country: JsonField<String>,
            private val currency: JsonField<String>,
            private val owner: JsonField<String>,
            private val ownerType: JsonField<OwnerType>,
            private val routingNumber: JsonField<String>,
            private val type: JsonField<AccountType>,
            private val verificationMethod: JsonField<ExternallyVerifiedVerificationMethod>,
            private val accountToken: JsonField<String>,
            private val address: JsonField<ExternalBankAccountAddress>,
            private val companyId: JsonField<String>,
            private val dob: JsonField<LocalDate>,
            private val doingBusinessAs: JsonField<String>,
            private val name: JsonField<String>,
            private val userDefinedId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("account_number")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("owner") @ExcludeMissing owner: JsonField<String> = JsonMissing.of(),
                @JsonProperty("owner_type")
                @ExcludeMissing
                ownerType: JsonField<OwnerType> = JsonMissing.of(),
                @JsonProperty("routing_number")
                @ExcludeMissing
                routingNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<AccountType> = JsonMissing.of(),
                @JsonProperty("verification_method")
                @ExcludeMissing
                verificationMethod: JsonField<ExternallyVerifiedVerificationMethod> =
                    JsonMissing.of(),
                @JsonProperty("account_token")
                @ExcludeMissing
                accountToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<ExternalBankAccountAddress> = JsonMissing.of(),
                @JsonProperty("company_id")
                @ExcludeMissing
                companyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("dob") @ExcludeMissing dob: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("doing_business_as")
                @ExcludeMissing
                doingBusinessAs: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_defined_id")
                @ExcludeMissing
                userDefinedId: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                country,
                currency,
                owner,
                ownerType,
                routingNumber,
                type,
                verificationMethod,
                accountToken,
                address,
                companyId,
                dob,
                doingBusinessAs,
                name,
                userDefinedId,
                mutableMapOf(),
            )

            /**
             * Account Number
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("account_number")

            /**
             * The country that the bank account is located in using ISO 3166-1. We will only accept
             * USA bank accounts e.g., USA
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun country(): String = country.getRequired("country")

            /**
             * currency of the external account 3-character alphabetic ISO 4217 code
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * Legal Name of the business or individual who owns the external account. This will
             * appear in statements
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun owner(): String = owner.getRequired("owner")

            /**
             * Owner Type
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ownerType(): OwnerType = ownerType.getRequired("owner_type")

            /**
             * Routing Number
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun routingNumber(): String = routingNumber.getRequired("routing_number")

            /**
             * Account Type
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): AccountType = type.getRequired("type")

            /**
             * Verification Method
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun verificationMethod(): ExternallyVerifiedVerificationMethod =
                verificationMethod.getRequired("verification_method")

            /**
             * Indicates which Lithic account the external account is associated with. For external
             * accounts that are associated with the program, account_token field returned will be
             * null
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun accountToken(): Optional<String> = accountToken.getOptional("account_token")

            /**
             * Address
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun address(): Optional<ExternalBankAccountAddress> = address.getOptional("address")

            /**
             * Optional field that helps identify bank accounts in receipts
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun companyId(): Optional<String> = companyId.getOptional("company_id")

            /**
             * Date of Birth of the Individual that owns the external bank account
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun dob(): Optional<LocalDate> = dob.getOptional("dob")

            /**
             * Doing Business As
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun doingBusinessAs(): Optional<String> =
                doingBusinessAs.getOptional("doing_business_as")

            /**
             * The nickname for this External Bank Account
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * User Defined ID
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userDefinedId(): Optional<String> = userDefinedId.getOptional("user_defined_id")

            /**
             * Returns the raw JSON value of [accountNumber].
             *
             * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("account_number")
            @ExcludeMissing
            fun _accountNumber(): JsonField<String> = accountNumber

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [owner].
             *
             * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

            /**
             * Returns the raw JSON value of [ownerType].
             *
             * Unlike [ownerType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("owner_type")
            @ExcludeMissing
            fun _ownerType(): JsonField<OwnerType> = ownerType

            /**
             * Returns the raw JSON value of [routingNumber].
             *
             * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("routing_number")
            @ExcludeMissing
            fun _routingNumber(): JsonField<String> = routingNumber

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AccountType> = type

            /**
             * Returns the raw JSON value of [verificationMethod].
             *
             * Unlike [verificationMethod], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("verification_method")
            @ExcludeMissing
            fun _verificationMethod(): JsonField<ExternallyVerifiedVerificationMethod> =
                verificationMethod

            /**
             * Returns the raw JSON value of [accountToken].
             *
             * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("account_token")
            @ExcludeMissing
            fun _accountToken(): JsonField<String> = accountToken

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address")
            @ExcludeMissing
            fun _address(): JsonField<ExternalBankAccountAddress> = address

            /**
             * Returns the raw JSON value of [companyId].
             *
             * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("company_id")
            @ExcludeMissing
            fun _companyId(): JsonField<String> = companyId

            /**
             * Returns the raw JSON value of [dob].
             *
             * Unlike [dob], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<LocalDate> = dob

            /**
             * Returns the raw JSON value of [doingBusinessAs].
             *
             * Unlike [doingBusinessAs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("doing_business_as")
            @ExcludeMissing
            fun _doingBusinessAs(): JsonField<String> = doingBusinessAs

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [userDefinedId].
             *
             * Unlike [userDefinedId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_defined_id")
            @ExcludeMissing
            fun _userDefinedId(): JsonField<String> = userDefinedId

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
                 * [ExternallyVerifiedCreateBankAccountApiRequest].
                 *
                 * The following fields are required:
                 * ```java
                 * .accountNumber()
                 * .country()
                 * .currency()
                 * .owner()
                 * .ownerType()
                 * .routingNumber()
                 * .type()
                 * .verificationMethod()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ExternallyVerifiedCreateBankAccountApiRequest]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var country: JsonField<String>? = null
                private var currency: JsonField<String>? = null
                private var owner: JsonField<String>? = null
                private var ownerType: JsonField<OwnerType>? = null
                private var routingNumber: JsonField<String>? = null
                private var type: JsonField<AccountType>? = null
                private var verificationMethod: JsonField<ExternallyVerifiedVerificationMethod>? =
                    null
                private var accountToken: JsonField<String> = JsonMissing.of()
                private var address: JsonField<ExternalBankAccountAddress> = JsonMissing.of()
                private var companyId: JsonField<String> = JsonMissing.of()
                private var dob: JsonField<LocalDate> = JsonMissing.of()
                private var doingBusinessAs: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var userDefinedId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    externallyVerifiedCreateBankAccountApiRequest:
                        ExternallyVerifiedCreateBankAccountApiRequest
                ) = apply {
                    accountNumber = externallyVerifiedCreateBankAccountApiRequest.accountNumber
                    country = externallyVerifiedCreateBankAccountApiRequest.country
                    currency = externallyVerifiedCreateBankAccountApiRequest.currency
                    owner = externallyVerifiedCreateBankAccountApiRequest.owner
                    ownerType = externallyVerifiedCreateBankAccountApiRequest.ownerType
                    routingNumber = externallyVerifiedCreateBankAccountApiRequest.routingNumber
                    type = externallyVerifiedCreateBankAccountApiRequest.type
                    verificationMethod =
                        externallyVerifiedCreateBankAccountApiRequest.verificationMethod
                    accountToken = externallyVerifiedCreateBankAccountApiRequest.accountToken
                    address = externallyVerifiedCreateBankAccountApiRequest.address
                    companyId = externallyVerifiedCreateBankAccountApiRequest.companyId
                    dob = externallyVerifiedCreateBankAccountApiRequest.dob
                    doingBusinessAs = externallyVerifiedCreateBankAccountApiRequest.doingBusinessAs
                    name = externallyVerifiedCreateBankAccountApiRequest.name
                    userDefinedId = externallyVerifiedCreateBankAccountApiRequest.userDefinedId
                    additionalProperties =
                        externallyVerifiedCreateBankAccountApiRequest.additionalProperties
                            .toMutableMap()
                }

                /** Account Number */
                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /**
                 * Sets [Builder.accountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                /**
                 * The country that the bank account is located in using ISO 3166-1. We will only
                 * accept USA bank accounts e.g., USA
                 */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /** currency of the external account 3-character alphabetic ISO 4217 code */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /**
                 * Legal Name of the business or individual who owns the external account. This will
                 * appear in statements
                 */
                fun owner(owner: String) = owner(JsonField.of(owner))

                /**
                 * Sets [Builder.owner] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.owner] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun owner(owner: JsonField<String>) = apply { this.owner = owner }

                /** Owner Type */
                fun ownerType(ownerType: OwnerType) = ownerType(JsonField.of(ownerType))

                /**
                 * Sets [Builder.ownerType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ownerType] with a well-typed [OwnerType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ownerType(ownerType: JsonField<OwnerType>) = apply {
                    this.ownerType = ownerType
                }

                /** Routing Number */
                fun routingNumber(routingNumber: String) =
                    routingNumber(JsonField.of(routingNumber))

                /**
                 * Sets [Builder.routingNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routingNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun routingNumber(routingNumber: JsonField<String>) = apply {
                    this.routingNumber = routingNumber
                }

                /** Account Type */
                fun type(type: AccountType) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [AccountType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun type(type: JsonField<AccountType>) = apply { this.type = type }

                /** Verification Method */
                fun verificationMethod(verificationMethod: ExternallyVerifiedVerificationMethod) =
                    verificationMethod(JsonField.of(verificationMethod))

                /**
                 * Sets [Builder.verificationMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.verificationMethod] with a well-typed
                 * [ExternallyVerifiedVerificationMethod] value instead. This method is primarily
                 * for setting the field to an undocumented or not yet supported value.
                 */
                fun verificationMethod(
                    verificationMethod: JsonField<ExternallyVerifiedVerificationMethod>
                ) = apply { this.verificationMethod = verificationMethod }

                /**
                 * Indicates which Lithic account the external account is associated with. For
                 * external accounts that are associated with the program, account_token field
                 * returned will be null
                 */
                fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

                /**
                 * Sets [Builder.accountToken] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountToken] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountToken(accountToken: JsonField<String>) = apply {
                    this.accountToken = accountToken
                }

                /** Address */
                fun address(address: ExternalBankAccountAddress) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed
                 * [ExternalBankAccountAddress] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun address(address: JsonField<ExternalBankAccountAddress>) = apply {
                    this.address = address
                }

                /** Optional field that helps identify bank accounts in receipts */
                fun companyId(companyId: String) = companyId(JsonField.of(companyId))

                /**
                 * Sets [Builder.companyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.companyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

                /** Date of Birth of the Individual that owns the external bank account */
                fun dob(dob: LocalDate) = dob(JsonField.of(dob))

                /**
                 * Sets [Builder.dob] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dob] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dob(dob: JsonField<LocalDate>) = apply { this.dob = dob }

                /** Doing Business As */
                fun doingBusinessAs(doingBusinessAs: String) =
                    doingBusinessAs(JsonField.of(doingBusinessAs))

                /**
                 * Sets [Builder.doingBusinessAs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.doingBusinessAs] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
                    this.doingBusinessAs = doingBusinessAs
                }

                /** The nickname for this External Bank Account */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** User Defined ID */
                fun userDefinedId(userDefinedId: String) =
                    userDefinedId(JsonField.of(userDefinedId))

                /**
                 * Sets [Builder.userDefinedId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userDefinedId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userDefinedId(userDefinedId: JsonField<String>) = apply {
                    this.userDefinedId = userDefinedId
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
                 * Returns an immutable instance of [ExternallyVerifiedCreateBankAccountApiRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .accountNumber()
                 * .country()
                 * .currency()
                 * .owner()
                 * .ownerType()
                 * .routingNumber()
                 * .type()
                 * .verificationMethod()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ExternallyVerifiedCreateBankAccountApiRequest =
                    ExternallyVerifiedCreateBankAccountApiRequest(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("country", country),
                        checkRequired("currency", currency),
                        checkRequired("owner", owner),
                        checkRequired("ownerType", ownerType),
                        checkRequired("routingNumber", routingNumber),
                        checkRequired("type", type),
                        checkRequired("verificationMethod", verificationMethod),
                        accountToken,
                        address,
                        companyId,
                        dob,
                        doingBusinessAs,
                        name,
                        userDefinedId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ExternallyVerifiedCreateBankAccountApiRequest = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                country()
                currency()
                owner()
                ownerType().validate()
                routingNumber()
                type().validate()
                verificationMethod().validate()
                accountToken()
                address().ifPresent { it.validate() }
                companyId()
                dob()
                doingBusinessAs()
                name()
                userDefinedId()
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
                (if (accountNumber.asKnown().isPresent) 1 else 0) +
                    (if (country.asKnown().isPresent) 1 else 0) +
                    (if (currency.asKnown().isPresent) 1 else 0) +
                    (if (owner.asKnown().isPresent) 1 else 0) +
                    (ownerType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (routingNumber.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (verificationMethod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (accountToken.asKnown().isPresent) 1 else 0) +
                    (address.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (companyId.asKnown().isPresent) 1 else 0) +
                    (if (dob.asKnown().isPresent) 1 else 0) +
                    (if (doingBusinessAs.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (userDefinedId.asKnown().isPresent) 1 else 0)

            /** Account Type */
            class AccountType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CHECKING = of("CHECKING")

                    @JvmField val SAVINGS = of("SAVINGS")

                    @JvmStatic fun of(value: String) = AccountType(JsonField.of(value))
                }

                /** An enum containing [AccountType]'s known values. */
                enum class Known {
                    CHECKING,
                    SAVINGS,
                }

                /**
                 * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AccountType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CHECKING,
                    SAVINGS,
                    /**
                     * An enum member indicating that [AccountType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CHECKING -> Value.CHECKING
                        SAVINGS -> Value.SAVINGS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CHECKING -> Known.CHECKING
                        SAVINGS -> Known.SAVINGS
                        else -> throw LithicInvalidDataException("Unknown AccountType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): AccountType = apply {
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

                    return other is AccountType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Verification Method */
            class ExternallyVerifiedVerificationMethod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val EXTERNALLY_VERIFIED = of("EXTERNALLY_VERIFIED")

                    @JvmStatic
                    fun of(value: String) =
                        ExternallyVerifiedVerificationMethod(JsonField.of(value))
                }

                /** An enum containing [ExternallyVerifiedVerificationMethod]'s known values. */
                enum class Known {
                    EXTERNALLY_VERIFIED
                }

                /**
                 * An enum containing [ExternallyVerifiedVerificationMethod]'s known values, as well
                 * as an [_UNKNOWN] member.
                 *
                 * An instance of [ExternallyVerifiedVerificationMethod] can contain an unknown
                 * value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EXTERNALLY_VERIFIED,
                    /**
                     * An enum member indicating that [ExternallyVerifiedVerificationMethod] was
                     * instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        EXTERNALLY_VERIFIED -> Value.EXTERNALLY_VERIFIED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        EXTERNALLY_VERIFIED -> Known.EXTERNALLY_VERIFIED
                        else ->
                            throw LithicInvalidDataException(
                                "Unknown ExternallyVerifiedVerificationMethod: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): ExternallyVerifiedVerificationMethod = apply {
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

                    return other is ExternallyVerifiedVerificationMethod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ExternallyVerifiedCreateBankAccountApiRequest &&
                    accountNumber == other.accountNumber &&
                    country == other.country &&
                    currency == other.currency &&
                    owner == other.owner &&
                    ownerType == other.ownerType &&
                    routingNumber == other.routingNumber &&
                    type == other.type &&
                    verificationMethod == other.verificationMethod &&
                    accountToken == other.accountToken &&
                    address == other.address &&
                    companyId == other.companyId &&
                    dob == other.dob &&
                    doingBusinessAs == other.doingBusinessAs &&
                    name == other.name &&
                    userDefinedId == other.userDefinedId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    country,
                    currency,
                    owner,
                    ownerType,
                    routingNumber,
                    type,
                    verificationMethod,
                    accountToken,
                    address,
                    companyId,
                    dob,
                    doingBusinessAs,
                    name,
                    userDefinedId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExternallyVerifiedCreateBankAccountApiRequest{accountNumber=$accountNumber, country=$country, currency=$currency, owner=$owner, ownerType=$ownerType, routingNumber=$routingNumber, type=$type, verificationMethod=$verificationMethod, accountToken=$accountToken, address=$address, companyId=$companyId, dob=$dob, doingBusinessAs=$doingBusinessAs, name=$name, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
        }

        class UnverifiedCreateBankAccountApiRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val country: JsonField<String>,
            private val currency: JsonField<String>,
            private val owner: JsonField<String>,
            private val ownerType: JsonField<OwnerType>,
            private val routingNumber: JsonField<String>,
            private val type: JsonField<AccountType>,
            private val verificationMethod: JsonField<UnverifiedVerificationMethod>,
            private val accountToken: JsonField<String>,
            private val address: JsonField<ExternalBankAccountAddress>,
            private val companyId: JsonField<String>,
            private val dob: JsonField<LocalDate>,
            private val doingBusinessAs: JsonField<String>,
            private val name: JsonField<String>,
            private val userDefinedId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("account_number")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("owner") @ExcludeMissing owner: JsonField<String> = JsonMissing.of(),
                @JsonProperty("owner_type")
                @ExcludeMissing
                ownerType: JsonField<OwnerType> = JsonMissing.of(),
                @JsonProperty("routing_number")
                @ExcludeMissing
                routingNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<AccountType> = JsonMissing.of(),
                @JsonProperty("verification_method")
                @ExcludeMissing
                verificationMethod: JsonField<UnverifiedVerificationMethod> = JsonMissing.of(),
                @JsonProperty("account_token")
                @ExcludeMissing
                accountToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<ExternalBankAccountAddress> = JsonMissing.of(),
                @JsonProperty("company_id")
                @ExcludeMissing
                companyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("dob") @ExcludeMissing dob: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("doing_business_as")
                @ExcludeMissing
                doingBusinessAs: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_defined_id")
                @ExcludeMissing
                userDefinedId: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                country,
                currency,
                owner,
                ownerType,
                routingNumber,
                type,
                verificationMethod,
                accountToken,
                address,
                companyId,
                dob,
                doingBusinessAs,
                name,
                userDefinedId,
                mutableMapOf(),
            )

            /**
             * Account Number
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("account_number")

            /**
             * The country that the bank account is located in using ISO 3166-1. We will only accept
             * USA bank accounts e.g., USA
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun country(): String = country.getRequired("country")

            /**
             * currency of the external account 3-character alphabetic ISO 4217 code
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * Legal Name of the business or individual who owns the external account. This will
             * appear in statements
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun owner(): String = owner.getRequired("owner")

            /**
             * Owner Type
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ownerType(): OwnerType = ownerType.getRequired("owner_type")

            /**
             * Routing Number
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun routingNumber(): String = routingNumber.getRequired("routing_number")

            /**
             * Account Type
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): AccountType = type.getRequired("type")

            /**
             * Verification Method
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun verificationMethod(): UnverifiedVerificationMethod =
                verificationMethod.getRequired("verification_method")

            /**
             * Indicates which Lithic account the external account is associated with. For external
             * accounts that are associated with the program, account_token field returned will be
             * null
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun accountToken(): Optional<String> = accountToken.getOptional("account_token")

            /**
             * Address
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun address(): Optional<ExternalBankAccountAddress> = address.getOptional("address")

            /**
             * Optional field that helps identify bank accounts in receipts
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun companyId(): Optional<String> = companyId.getOptional("company_id")

            /**
             * Date of Birth of the Individual that owns the external bank account
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun dob(): Optional<LocalDate> = dob.getOptional("dob")

            /**
             * Doing Business As
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun doingBusinessAs(): Optional<String> =
                doingBusinessAs.getOptional("doing_business_as")

            /**
             * The nickname for this External Bank Account
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * User Defined ID
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userDefinedId(): Optional<String> = userDefinedId.getOptional("user_defined_id")

            /**
             * Returns the raw JSON value of [accountNumber].
             *
             * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("account_number")
            @ExcludeMissing
            fun _accountNumber(): JsonField<String> = accountNumber

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [owner].
             *
             * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

            /**
             * Returns the raw JSON value of [ownerType].
             *
             * Unlike [ownerType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("owner_type")
            @ExcludeMissing
            fun _ownerType(): JsonField<OwnerType> = ownerType

            /**
             * Returns the raw JSON value of [routingNumber].
             *
             * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("routing_number")
            @ExcludeMissing
            fun _routingNumber(): JsonField<String> = routingNumber

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AccountType> = type

            /**
             * Returns the raw JSON value of [verificationMethod].
             *
             * Unlike [verificationMethod], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("verification_method")
            @ExcludeMissing
            fun _verificationMethod(): JsonField<UnverifiedVerificationMethod> = verificationMethod

            /**
             * Returns the raw JSON value of [accountToken].
             *
             * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("account_token")
            @ExcludeMissing
            fun _accountToken(): JsonField<String> = accountToken

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address")
            @ExcludeMissing
            fun _address(): JsonField<ExternalBankAccountAddress> = address

            /**
             * Returns the raw JSON value of [companyId].
             *
             * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("company_id")
            @ExcludeMissing
            fun _companyId(): JsonField<String> = companyId

            /**
             * Returns the raw JSON value of [dob].
             *
             * Unlike [dob], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<LocalDate> = dob

            /**
             * Returns the raw JSON value of [doingBusinessAs].
             *
             * Unlike [doingBusinessAs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("doing_business_as")
            @ExcludeMissing
            fun _doingBusinessAs(): JsonField<String> = doingBusinessAs

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [userDefinedId].
             *
             * Unlike [userDefinedId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_defined_id")
            @ExcludeMissing
            fun _userDefinedId(): JsonField<String> = userDefinedId

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
                 * [UnverifiedCreateBankAccountApiRequest].
                 *
                 * The following fields are required:
                 * ```java
                 * .accountNumber()
                 * .country()
                 * .currency()
                 * .owner()
                 * .ownerType()
                 * .routingNumber()
                 * .type()
                 * .verificationMethod()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnverifiedCreateBankAccountApiRequest]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var country: JsonField<String>? = null
                private var currency: JsonField<String>? = null
                private var owner: JsonField<String>? = null
                private var ownerType: JsonField<OwnerType>? = null
                private var routingNumber: JsonField<String>? = null
                private var type: JsonField<AccountType>? = null
                private var verificationMethod: JsonField<UnverifiedVerificationMethod>? = null
                private var accountToken: JsonField<String> = JsonMissing.of()
                private var address: JsonField<ExternalBankAccountAddress> = JsonMissing.of()
                private var companyId: JsonField<String> = JsonMissing.of()
                private var dob: JsonField<LocalDate> = JsonMissing.of()
                private var doingBusinessAs: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var userDefinedId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    unverifiedCreateBankAccountApiRequest: UnverifiedCreateBankAccountApiRequest
                ) = apply {
                    accountNumber = unverifiedCreateBankAccountApiRequest.accountNumber
                    country = unverifiedCreateBankAccountApiRequest.country
                    currency = unverifiedCreateBankAccountApiRequest.currency
                    owner = unverifiedCreateBankAccountApiRequest.owner
                    ownerType = unverifiedCreateBankAccountApiRequest.ownerType
                    routingNumber = unverifiedCreateBankAccountApiRequest.routingNumber
                    type = unverifiedCreateBankAccountApiRequest.type
                    verificationMethod = unverifiedCreateBankAccountApiRequest.verificationMethod
                    accountToken = unverifiedCreateBankAccountApiRequest.accountToken
                    address = unverifiedCreateBankAccountApiRequest.address
                    companyId = unverifiedCreateBankAccountApiRequest.companyId
                    dob = unverifiedCreateBankAccountApiRequest.dob
                    doingBusinessAs = unverifiedCreateBankAccountApiRequest.doingBusinessAs
                    name = unverifiedCreateBankAccountApiRequest.name
                    userDefinedId = unverifiedCreateBankAccountApiRequest.userDefinedId
                    additionalProperties =
                        unverifiedCreateBankAccountApiRequest.additionalProperties.toMutableMap()
                }

                /** Account Number */
                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /**
                 * Sets [Builder.accountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                /**
                 * The country that the bank account is located in using ISO 3166-1. We will only
                 * accept USA bank accounts e.g., USA
                 */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /** currency of the external account 3-character alphabetic ISO 4217 code */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /**
                 * Legal Name of the business or individual who owns the external account. This will
                 * appear in statements
                 */
                fun owner(owner: String) = owner(JsonField.of(owner))

                /**
                 * Sets [Builder.owner] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.owner] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun owner(owner: JsonField<String>) = apply { this.owner = owner }

                /** Owner Type */
                fun ownerType(ownerType: OwnerType) = ownerType(JsonField.of(ownerType))

                /**
                 * Sets [Builder.ownerType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ownerType] with a well-typed [OwnerType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ownerType(ownerType: JsonField<OwnerType>) = apply {
                    this.ownerType = ownerType
                }

                /** Routing Number */
                fun routingNumber(routingNumber: String) =
                    routingNumber(JsonField.of(routingNumber))

                /**
                 * Sets [Builder.routingNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routingNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun routingNumber(routingNumber: JsonField<String>) = apply {
                    this.routingNumber = routingNumber
                }

                /** Account Type */
                fun type(type: AccountType) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [AccountType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun type(type: JsonField<AccountType>) = apply { this.type = type }

                /** Verification Method */
                fun verificationMethod(verificationMethod: UnverifiedVerificationMethod) =
                    verificationMethod(JsonField.of(verificationMethod))

                /**
                 * Sets [Builder.verificationMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.verificationMethod] with a well-typed
                 * [UnverifiedVerificationMethod] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun verificationMethod(
                    verificationMethod: JsonField<UnverifiedVerificationMethod>
                ) = apply { this.verificationMethod = verificationMethod }

                /**
                 * Indicates which Lithic account the external account is associated with. For
                 * external accounts that are associated with the program, account_token field
                 * returned will be null
                 */
                fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

                /**
                 * Sets [Builder.accountToken] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountToken] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountToken(accountToken: JsonField<String>) = apply {
                    this.accountToken = accountToken
                }

                /** Address */
                fun address(address: ExternalBankAccountAddress) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed
                 * [ExternalBankAccountAddress] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun address(address: JsonField<ExternalBankAccountAddress>) = apply {
                    this.address = address
                }

                /** Optional field that helps identify bank accounts in receipts */
                fun companyId(companyId: String) = companyId(JsonField.of(companyId))

                /**
                 * Sets [Builder.companyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.companyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

                /** Date of Birth of the Individual that owns the external bank account */
                fun dob(dob: LocalDate) = dob(JsonField.of(dob))

                /**
                 * Sets [Builder.dob] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dob] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dob(dob: JsonField<LocalDate>) = apply { this.dob = dob }

                /** Doing Business As */
                fun doingBusinessAs(doingBusinessAs: String) =
                    doingBusinessAs(JsonField.of(doingBusinessAs))

                /**
                 * Sets [Builder.doingBusinessAs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.doingBusinessAs] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
                    this.doingBusinessAs = doingBusinessAs
                }

                /** The nickname for this External Bank Account */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** User Defined ID */
                fun userDefinedId(userDefinedId: String) =
                    userDefinedId(JsonField.of(userDefinedId))

                /**
                 * Sets [Builder.userDefinedId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userDefinedId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userDefinedId(userDefinedId: JsonField<String>) = apply {
                    this.userDefinedId = userDefinedId
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
                 * Returns an immutable instance of [UnverifiedCreateBankAccountApiRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .accountNumber()
                 * .country()
                 * .currency()
                 * .owner()
                 * .ownerType()
                 * .routingNumber()
                 * .type()
                 * .verificationMethod()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UnverifiedCreateBankAccountApiRequest =
                    UnverifiedCreateBankAccountApiRequest(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("country", country),
                        checkRequired("currency", currency),
                        checkRequired("owner", owner),
                        checkRequired("ownerType", ownerType),
                        checkRequired("routingNumber", routingNumber),
                        checkRequired("type", type),
                        checkRequired("verificationMethod", verificationMethod),
                        accountToken,
                        address,
                        companyId,
                        dob,
                        doingBusinessAs,
                        name,
                        userDefinedId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UnverifiedCreateBankAccountApiRequest = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                country()
                currency()
                owner()
                ownerType().validate()
                routingNumber()
                type().validate()
                verificationMethod().validate()
                accountToken()
                address().ifPresent { it.validate() }
                companyId()
                dob()
                doingBusinessAs()
                name()
                userDefinedId()
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
                (if (accountNumber.asKnown().isPresent) 1 else 0) +
                    (if (country.asKnown().isPresent) 1 else 0) +
                    (if (currency.asKnown().isPresent) 1 else 0) +
                    (if (owner.asKnown().isPresent) 1 else 0) +
                    (ownerType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (routingNumber.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (verificationMethod.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (accountToken.asKnown().isPresent) 1 else 0) +
                    (address.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (companyId.asKnown().isPresent) 1 else 0) +
                    (if (dob.asKnown().isPresent) 1 else 0) +
                    (if (doingBusinessAs.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (userDefinedId.asKnown().isPresent) 1 else 0)

            /** Account Type */
            class AccountType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CHECKING = of("CHECKING")

                    @JvmField val SAVINGS = of("SAVINGS")

                    @JvmStatic fun of(value: String) = AccountType(JsonField.of(value))
                }

                /** An enum containing [AccountType]'s known values. */
                enum class Known {
                    CHECKING,
                    SAVINGS,
                }

                /**
                 * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [AccountType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CHECKING,
                    SAVINGS,
                    /**
                     * An enum member indicating that [AccountType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CHECKING -> Value.CHECKING
                        SAVINGS -> Value.SAVINGS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CHECKING -> Known.CHECKING
                        SAVINGS -> Known.SAVINGS
                        else -> throw LithicInvalidDataException("Unknown AccountType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): AccountType = apply {
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

                    return other is AccountType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Verification Method */
            class UnverifiedVerificationMethod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val UNVERIFIED = of("UNVERIFIED")

                    @JvmStatic
                    fun of(value: String) = UnverifiedVerificationMethod(JsonField.of(value))
                }

                /** An enum containing [UnverifiedVerificationMethod]'s known values. */
                enum class Known {
                    UNVERIFIED
                }

                /**
                 * An enum containing [UnverifiedVerificationMethod]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [UnverifiedVerificationMethod] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    UNVERIFIED,
                    /**
                     * An enum member indicating that [UnverifiedVerificationMethod] was
                     * instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        UNVERIFIED -> Value.UNVERIFIED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        UNVERIFIED -> Known.UNVERIFIED
                        else ->
                            throw LithicInvalidDataException(
                                "Unknown UnverifiedVerificationMethod: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): UnverifiedVerificationMethod = apply {
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

                    return other is UnverifiedVerificationMethod && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnverifiedCreateBankAccountApiRequest &&
                    accountNumber == other.accountNumber &&
                    country == other.country &&
                    currency == other.currency &&
                    owner == other.owner &&
                    ownerType == other.ownerType &&
                    routingNumber == other.routingNumber &&
                    type == other.type &&
                    verificationMethod == other.verificationMethod &&
                    accountToken == other.accountToken &&
                    address == other.address &&
                    companyId == other.companyId &&
                    dob == other.dob &&
                    doingBusinessAs == other.doingBusinessAs &&
                    name == other.name &&
                    userDefinedId == other.userDefinedId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountNumber,
                    country,
                    currency,
                    owner,
                    ownerType,
                    routingNumber,
                    type,
                    verificationMethod,
                    accountToken,
                    address,
                    companyId,
                    dob,
                    doingBusinessAs,
                    name,
                    userDefinedId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnverifiedCreateBankAccountApiRequest{accountNumber=$accountNumber, country=$country, currency=$currency, owner=$owner, ownerType=$ownerType, routingNumber=$routingNumber, type=$type, verificationMethod=$verificationMethod, accountToken=$accountToken, address=$address, companyId=$companyId, dob=$dob, doingBusinessAs=$doingBusinessAs, name=$name, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalBankAccountCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExternalBankAccountCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
