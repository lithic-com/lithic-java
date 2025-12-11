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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AccountHolderDocumentUpdatedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val eventType: JsonField<EventType>,
    private val token: JsonField<String>,
    private val accountHolderToken: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val documentType: JsonField<DocumentType>,
    private val entityToken: JsonField<String>,
    private val requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_holder_token")
        @ExcludeMissing
        accountHolderToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("document_type")
        @ExcludeMissing
        documentType: JsonField<DocumentType> = JsonMissing.of(),
        @JsonProperty("entity_token")
        @ExcludeMissing
        entityToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("required_document_uploads")
        @ExcludeMissing
        requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>> = JsonMissing.of(),
    ) : this(
        eventType,
        token,
        accountHolderToken,
        created,
        documentType,
        entityToken,
        requiredDocumentUploads,
        mutableMapOf(),
    )

    /**
     * The type of event that occurred.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * The token of the account holder document
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun token(): Optional<String> = token.getOptional("token")

    /**
     * The token of the account_holder that the document belongs to
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountHolderToken(): Optional<String> =
        accountHolderToken.getOptional("account_holder_token")

    /**
     * When the account_holder was created
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun created(): Optional<OffsetDateTime> = created.getOptional("created")

    /**
     * Type of documentation to be submitted for verification of an account holder
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documentType(): Optional<DocumentType> = documentType.getOptional("document_type")

    /**
     * The token of the entity that the document belongs to
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entityToken(): Optional<String> = entityToken.getOptional("entity_token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requiredDocumentUploads(): Optional<List<RequiredDocumentUpload>> =
        requiredDocumentUploads.getOptional("required_document_uploads")

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [accountHolderToken].
     *
     * Unlike [accountHolderToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("account_holder_token")
    @ExcludeMissing
    fun _accountHolderToken(): JsonField<String> = accountHolderToken

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_type")
    @ExcludeMissing
    fun _documentType(): JsonField<DocumentType> = documentType

    /**
     * Returns the raw JSON value of [entityToken].
     *
     * Unlike [entityToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity_token")
    @ExcludeMissing
    fun _entityToken(): JsonField<String> = entityToken

    /**
     * Returns the raw JSON value of [requiredDocumentUploads].
     *
     * Unlike [requiredDocumentUploads], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("required_document_uploads")
    @ExcludeMissing
    fun _requiredDocumentUploads(): JsonField<List<RequiredDocumentUpload>> =
        requiredDocumentUploads

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
         * [AccountHolderDocumentUpdatedWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountHolderDocumentUpdatedWebhookEvent]. */
    class Builder internal constructor() {

        private var eventType: JsonField<EventType>? = null
        private var token: JsonField<String> = JsonMissing.of()
        private var accountHolderToken: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var documentType: JsonField<DocumentType> = JsonMissing.of()
        private var entityToken: JsonField<String> = JsonMissing.of()
        private var requiredDocumentUploads: JsonField<MutableList<RequiredDocumentUpload>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            accountHolderDocumentUpdatedWebhookEvent: AccountHolderDocumentUpdatedWebhookEvent
        ) = apply {
            eventType = accountHolderDocumentUpdatedWebhookEvent.eventType
            token = accountHolderDocumentUpdatedWebhookEvent.token
            accountHolderToken = accountHolderDocumentUpdatedWebhookEvent.accountHolderToken
            created = accountHolderDocumentUpdatedWebhookEvent.created
            documentType = accountHolderDocumentUpdatedWebhookEvent.documentType
            entityToken = accountHolderDocumentUpdatedWebhookEvent.entityToken
            requiredDocumentUploads =
                accountHolderDocumentUpdatedWebhookEvent.requiredDocumentUploads.map {
                    it.toMutableList()
                }
            additionalProperties =
                accountHolderDocumentUpdatedWebhookEvent.additionalProperties.toMutableMap()
        }

        /** The type of event that occurred. */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        /** The token of the account holder document */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** The token of the account_holder that the document belongs to */
        fun accountHolderToken(accountHolderToken: String) =
            accountHolderToken(JsonField.of(accountHolderToken))

        /**
         * Sets [Builder.accountHolderToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountHolderToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountHolderToken(accountHolderToken: JsonField<String>) = apply {
            this.accountHolderToken = accountHolderToken
        }

        /** When the account_holder was created */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** Type of documentation to be submitted for verification of an account holder */
        fun documentType(documentType: DocumentType) = documentType(JsonField.of(documentType))

        /**
         * Sets [Builder.documentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentType] with a well-typed [DocumentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentType(documentType: JsonField<DocumentType>) = apply {
            this.documentType = documentType
        }

        /** The token of the entity that the document belongs to */
        fun entityToken(entityToken: String) = entityToken(JsonField.of(entityToken))

        /**
         * Sets [Builder.entityToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entityToken(entityToken: JsonField<String>) = apply { this.entityToken = entityToken }

        fun requiredDocumentUploads(requiredDocumentUploads: List<RequiredDocumentUpload>) =
            requiredDocumentUploads(JsonField.of(requiredDocumentUploads))

        /**
         * Sets [Builder.requiredDocumentUploads] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiredDocumentUploads] with a well-typed
         * `List<RequiredDocumentUpload>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun requiredDocumentUploads(
            requiredDocumentUploads: JsonField<List<RequiredDocumentUpload>>
        ) = apply {
            this.requiredDocumentUploads = requiredDocumentUploads.map { it.toMutableList() }
        }

        /**
         * Adds a single [RequiredDocumentUpload] to [requiredDocumentUploads].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequiredDocumentUpload(requiredDocumentUpload: RequiredDocumentUpload) = apply {
            requiredDocumentUploads =
                (requiredDocumentUploads ?: JsonField.of(mutableListOf())).also {
                    checkKnown("requiredDocumentUploads", it).add(requiredDocumentUpload)
                }
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
         * Returns an immutable instance of [AccountHolderDocumentUpdatedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountHolderDocumentUpdatedWebhookEvent =
            AccountHolderDocumentUpdatedWebhookEvent(
                checkRequired("eventType", eventType),
                token,
                accountHolderToken,
                created,
                documentType,
                entityToken,
                (requiredDocumentUploads ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccountHolderDocumentUpdatedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        eventType().validate()
        token()
        accountHolderToken()
        created()
        documentType().ifPresent { it.validate() }
        entityToken()
        requiredDocumentUploads().ifPresent { it.forEach { it.validate() } }
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
        (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (token.asKnown().isPresent) 1 else 0) +
            (if (accountHolderToken.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (documentType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (entityToken.asKnown().isPresent) 1 else 0) +
            (requiredDocumentUploads.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** The type of event that occurred. */
    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACCOUNT_HOLDER_DOCUMENT_UPDATED = of("account_holder_document.updated")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            ACCOUNT_HOLDER_DOCUMENT_UPDATED
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCOUNT_HOLDER_DOCUMENT_UPDATED,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
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
                ACCOUNT_HOLDER_DOCUMENT_UPDATED -> Value.ACCOUNT_HOLDER_DOCUMENT_UPDATED
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
                ACCOUNT_HOLDER_DOCUMENT_UPDATED -> Known.ACCOUNT_HOLDER_DOCUMENT_UPDATED
                else -> throw LithicInvalidDataException("Unknown EventType: $value")
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

        fun validate(): EventType = apply {
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

            return other is EventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Type of documentation to be submitted for verification of an account holder */
    class DocumentType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val DRIVERS_LICENSE = of("DRIVERS_LICENSE")

            @JvmField val PASSPORT = of("PASSPORT")

            @JvmField val PASSPORT_CARD = of("PASSPORT_CARD")

            @JvmField val EIN_LETTER = of("EIN_LETTER")

            @JvmField val TAX_RETURN = of("TAX_RETURN")

            @JvmField val OPERATING_AGREEMENT = of("OPERATING_AGREEMENT")

            @JvmField val CERTIFICATE_OF_FORMATION = of("CERTIFICATE_OF_FORMATION")

            @JvmField val CERTIFICATE_OF_GOOD_STANDING = of("CERTIFICATE_OF_GOOD_STANDING")

            @JvmField val ARTICLES_OF_INCORPORATION = of("ARTICLES_OF_INCORPORATION")

            @JvmField val ARTICLES_OF_ORGANIZATION = of("ARTICLES_OF_ORGANIZATION")

            @JvmField val BYLAWS = of("BYLAWS")

            @JvmField val GOVERNMENT_BUSINESS_LICENSE = of("GOVERNMENT_BUSINESS_LICENSE")

            @JvmField val PARTNERSHIP_AGREEMENT = of("PARTNERSHIP_AGREEMENT")

            @JvmField val SS4_FORM = of("SS4_FORM")

            @JvmField val BANK_STATEMENT = of("BANK_STATEMENT")

            @JvmField val UTILITY_BILL_STATEMENT = of("UTILITY_BILL_STATEMENT")

            @JvmField val SSN_CARD = of("SSN_CARD")

            @JvmField val ITIN_LETTER = of("ITIN_LETTER")

            @JvmField val FINCEN_BOI_REPORT = of("FINCEN_BOI_REPORT")

            @JvmStatic fun of(value: String) = DocumentType(JsonField.of(value))
        }

        /** An enum containing [DocumentType]'s known values. */
        enum class Known {
            DRIVERS_LICENSE,
            PASSPORT,
            PASSPORT_CARD,
            EIN_LETTER,
            TAX_RETURN,
            OPERATING_AGREEMENT,
            CERTIFICATE_OF_FORMATION,
            CERTIFICATE_OF_GOOD_STANDING,
            ARTICLES_OF_INCORPORATION,
            ARTICLES_OF_ORGANIZATION,
            BYLAWS,
            GOVERNMENT_BUSINESS_LICENSE,
            PARTNERSHIP_AGREEMENT,
            SS4_FORM,
            BANK_STATEMENT,
            UTILITY_BILL_STATEMENT,
            SSN_CARD,
            ITIN_LETTER,
            FINCEN_BOI_REPORT,
        }

        /**
         * An enum containing [DocumentType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DocumentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DRIVERS_LICENSE,
            PASSPORT,
            PASSPORT_CARD,
            EIN_LETTER,
            TAX_RETURN,
            OPERATING_AGREEMENT,
            CERTIFICATE_OF_FORMATION,
            CERTIFICATE_OF_GOOD_STANDING,
            ARTICLES_OF_INCORPORATION,
            ARTICLES_OF_ORGANIZATION,
            BYLAWS,
            GOVERNMENT_BUSINESS_LICENSE,
            PARTNERSHIP_AGREEMENT,
            SS4_FORM,
            BANK_STATEMENT,
            UTILITY_BILL_STATEMENT,
            SSN_CARD,
            ITIN_LETTER,
            FINCEN_BOI_REPORT,
            /**
             * An enum member indicating that [DocumentType] was instantiated with an unknown value.
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
                DRIVERS_LICENSE -> Value.DRIVERS_LICENSE
                PASSPORT -> Value.PASSPORT
                PASSPORT_CARD -> Value.PASSPORT_CARD
                EIN_LETTER -> Value.EIN_LETTER
                TAX_RETURN -> Value.TAX_RETURN
                OPERATING_AGREEMENT -> Value.OPERATING_AGREEMENT
                CERTIFICATE_OF_FORMATION -> Value.CERTIFICATE_OF_FORMATION
                CERTIFICATE_OF_GOOD_STANDING -> Value.CERTIFICATE_OF_GOOD_STANDING
                ARTICLES_OF_INCORPORATION -> Value.ARTICLES_OF_INCORPORATION
                ARTICLES_OF_ORGANIZATION -> Value.ARTICLES_OF_ORGANIZATION
                BYLAWS -> Value.BYLAWS
                GOVERNMENT_BUSINESS_LICENSE -> Value.GOVERNMENT_BUSINESS_LICENSE
                PARTNERSHIP_AGREEMENT -> Value.PARTNERSHIP_AGREEMENT
                SS4_FORM -> Value.SS4_FORM
                BANK_STATEMENT -> Value.BANK_STATEMENT
                UTILITY_BILL_STATEMENT -> Value.UTILITY_BILL_STATEMENT
                SSN_CARD -> Value.SSN_CARD
                ITIN_LETTER -> Value.ITIN_LETTER
                FINCEN_BOI_REPORT -> Value.FINCEN_BOI_REPORT
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
                DRIVERS_LICENSE -> Known.DRIVERS_LICENSE
                PASSPORT -> Known.PASSPORT
                PASSPORT_CARD -> Known.PASSPORT_CARD
                EIN_LETTER -> Known.EIN_LETTER
                TAX_RETURN -> Known.TAX_RETURN
                OPERATING_AGREEMENT -> Known.OPERATING_AGREEMENT
                CERTIFICATE_OF_FORMATION -> Known.CERTIFICATE_OF_FORMATION
                CERTIFICATE_OF_GOOD_STANDING -> Known.CERTIFICATE_OF_GOOD_STANDING
                ARTICLES_OF_INCORPORATION -> Known.ARTICLES_OF_INCORPORATION
                ARTICLES_OF_ORGANIZATION -> Known.ARTICLES_OF_ORGANIZATION
                BYLAWS -> Known.BYLAWS
                GOVERNMENT_BUSINESS_LICENSE -> Known.GOVERNMENT_BUSINESS_LICENSE
                PARTNERSHIP_AGREEMENT -> Known.PARTNERSHIP_AGREEMENT
                SS4_FORM -> Known.SS4_FORM
                BANK_STATEMENT -> Known.BANK_STATEMENT
                UTILITY_BILL_STATEMENT -> Known.UTILITY_BILL_STATEMENT
                SSN_CARD -> Known.SSN_CARD
                ITIN_LETTER -> Known.ITIN_LETTER
                FINCEN_BOI_REPORT -> Known.FINCEN_BOI_REPORT
                else -> throw LithicInvalidDataException("Unknown DocumentType: $value")
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

        fun validate(): DocumentType = apply {
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

            return other is DocumentType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** A document upload that belongs to the overall account holder document */
    class RequiredDocumentUpload
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val acceptedEntityStatusReasons: JsonField<List<String>>,
        private val created: JsonField<OffsetDateTime>,
        private val imageType: JsonField<ImageType>,
        private val rejectedEntityStatusReasons: JsonField<List<String>>,
        private val status: JsonField<DocumentUploadStatus>,
        private val statusReasons: JsonField<List<String>>,
        private val updated: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accepted_entity_status_reasons")
            @ExcludeMissing
            acceptedEntityStatusReasons: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("created")
            @ExcludeMissing
            created: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("image_type")
            @ExcludeMissing
            imageType: JsonField<ImageType> = JsonMissing.of(),
            @JsonProperty("rejected_entity_status_reasons")
            @ExcludeMissing
            rejectedEntityStatusReasons: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<DocumentUploadStatus> = JsonMissing.of(),
            @JsonProperty("status_reasons")
            @ExcludeMissing
            statusReasons: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("updated")
            @ExcludeMissing
            updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            token,
            acceptedEntityStatusReasons,
            created,
            imageType,
            rejectedEntityStatusReasons,
            status,
            statusReasons,
            updated,
            mutableMapOf(),
        )

        /**
         * The token of the document upload
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun token(): Optional<String> = token.getOptional("token")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun acceptedEntityStatusReasons(): Optional<List<String>> =
            acceptedEntityStatusReasons.getOptional("accepted_entity_status_reasons")

        /**
         * When the document upload was created
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun created(): Optional<OffsetDateTime> = created.getOptional("created")

        /**
         * The type of image that was uploaded
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun imageType(): Optional<ImageType> = imageType.getOptional("image_type")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rejectedEntityStatusReasons(): Optional<List<String>> =
            rejectedEntityStatusReasons.getOptional("rejected_entity_status_reasons")

        /**
         * The status of the document upload
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<DocumentUploadStatus> = status.getOptional("status")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusReasons(): Optional<List<String>> = statusReasons.getOptional("status_reasons")

        /**
         * When the document upload was last updated
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updated(): Optional<OffsetDateTime> = updated.getOptional("updated")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [acceptedEntityStatusReasons].
         *
         * Unlike [acceptedEntityStatusReasons], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("accepted_entity_status_reasons")
        @ExcludeMissing
        fun _acceptedEntityStatusReasons(): JsonField<List<String>> = acceptedEntityStatusReasons

        /**
         * Returns the raw JSON value of [created].
         *
         * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        /**
         * Returns the raw JSON value of [imageType].
         *
         * Unlike [imageType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("image_type")
        @ExcludeMissing
        fun _imageType(): JsonField<ImageType> = imageType

        /**
         * Returns the raw JSON value of [rejectedEntityStatusReasons].
         *
         * Unlike [rejectedEntityStatusReasons], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("rejected_entity_status_reasons")
        @ExcludeMissing
        fun _rejectedEntityStatusReasons(): JsonField<List<String>> = rejectedEntityStatusReasons

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<DocumentUploadStatus> = status

        /**
         * Returns the raw JSON value of [statusReasons].
         *
         * Unlike [statusReasons], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("status_reasons")
        @ExcludeMissing
        fun _statusReasons(): JsonField<List<String>> = statusReasons

        /**
         * Returns the raw JSON value of [updated].
         *
         * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

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
             * Returns a mutable builder for constructing an instance of [RequiredDocumentUpload].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RequiredDocumentUpload]. */
        class Builder internal constructor() {

            private var token: JsonField<String> = JsonMissing.of()
            private var acceptedEntityStatusReasons: JsonField<MutableList<String>>? = null
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var imageType: JsonField<ImageType> = JsonMissing.of()
            private var rejectedEntityStatusReasons: JsonField<MutableList<String>>? = null
            private var status: JsonField<DocumentUploadStatus> = JsonMissing.of()
            private var statusReasons: JsonField<MutableList<String>>? = null
            private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(requiredDocumentUpload: RequiredDocumentUpload) = apply {
                token = requiredDocumentUpload.token
                acceptedEntityStatusReasons =
                    requiredDocumentUpload.acceptedEntityStatusReasons.map { it.toMutableList() }
                created = requiredDocumentUpload.created
                imageType = requiredDocumentUpload.imageType
                rejectedEntityStatusReasons =
                    requiredDocumentUpload.rejectedEntityStatusReasons.map { it.toMutableList() }
                status = requiredDocumentUpload.status
                statusReasons = requiredDocumentUpload.statusReasons.map { it.toMutableList() }
                updated = requiredDocumentUpload.updated
                additionalProperties = requiredDocumentUpload.additionalProperties.toMutableMap()
            }

            /** The token of the document upload */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            fun acceptedEntityStatusReasons(acceptedEntityStatusReasons: List<String>) =
                acceptedEntityStatusReasons(JsonField.of(acceptedEntityStatusReasons))

            /**
             * Sets [Builder.acceptedEntityStatusReasons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acceptedEntityStatusReasons] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun acceptedEntityStatusReasons(acceptedEntityStatusReasons: JsonField<List<String>>) =
                apply {
                    this.acceptedEntityStatusReasons =
                        acceptedEntityStatusReasons.map { it.toMutableList() }
                }

            /**
             * Adds a single [String] to [acceptedEntityStatusReasons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAcceptedEntityStatusReason(acceptedEntityStatusReason: String) = apply {
                acceptedEntityStatusReasons =
                    (acceptedEntityStatusReasons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("acceptedEntityStatusReasons", it)
                            .add(acceptedEntityStatusReason)
                    }
            }

            /** When the document upload was created */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /**
             * Sets [Builder.created] to an arbitrary JSON value.
             *
             * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /** The type of image that was uploaded */
            fun imageType(imageType: ImageType) = imageType(JsonField.of(imageType))

            /**
             * Sets [Builder.imageType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imageType] with a well-typed [ImageType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun imageType(imageType: JsonField<ImageType>) = apply { this.imageType = imageType }

            fun rejectedEntityStatusReasons(rejectedEntityStatusReasons: List<String>) =
                rejectedEntityStatusReasons(JsonField.of(rejectedEntityStatusReasons))

            /**
             * Sets [Builder.rejectedEntityStatusReasons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rejectedEntityStatusReasons] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun rejectedEntityStatusReasons(rejectedEntityStatusReasons: JsonField<List<String>>) =
                apply {
                    this.rejectedEntityStatusReasons =
                        rejectedEntityStatusReasons.map { it.toMutableList() }
                }

            /**
             * Adds a single [String] to [rejectedEntityStatusReasons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRejectedEntityStatusReason(rejectedEntityStatusReason: String) = apply {
                rejectedEntityStatusReasons =
                    (rejectedEntityStatusReasons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("rejectedEntityStatusReasons", it)
                            .add(rejectedEntityStatusReason)
                    }
            }

            /** The status of the document upload */
            fun status(status: DocumentUploadStatus) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [DocumentUploadStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun status(status: JsonField<DocumentUploadStatus>) = apply { this.status = status }

            fun statusReasons(statusReasons: List<String>) =
                statusReasons(JsonField.of(statusReasons))

            /**
             * Sets [Builder.statusReasons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusReasons] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun statusReasons(statusReasons: JsonField<List<String>>) = apply {
                this.statusReasons = statusReasons.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [statusReasons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStatusReason(statusReason: String) = apply {
                statusReasons =
                    (statusReasons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("statusReasons", it).add(statusReason)
                    }
            }

            /** When the document upload was last updated */
            fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

            /**
             * Sets [Builder.updated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

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
             * Returns an immutable instance of [RequiredDocumentUpload].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RequiredDocumentUpload =
                RequiredDocumentUpload(
                    token,
                    (acceptedEntityStatusReasons ?: JsonMissing.of()).map { it.toImmutable() },
                    created,
                    imageType,
                    (rejectedEntityStatusReasons ?: JsonMissing.of()).map { it.toImmutable() },
                    status,
                    (statusReasons ?: JsonMissing.of()).map { it.toImmutable() },
                    updated,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RequiredDocumentUpload = apply {
            if (validated) {
                return@apply
            }

            token()
            acceptedEntityStatusReasons()
            created()
            imageType().ifPresent { it.validate() }
            rejectedEntityStatusReasons()
            status().ifPresent { it.validate() }
            statusReasons()
            updated()
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
            (if (token.asKnown().isPresent) 1 else 0) +
                (acceptedEntityStatusReasons.asKnown().getOrNull()?.size ?: 0) +
                (if (created.asKnown().isPresent) 1 else 0) +
                (imageType.asKnown().getOrNull()?.validity() ?: 0) +
                (rejectedEntityStatusReasons.asKnown().getOrNull()?.size ?: 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (statusReasons.asKnown().getOrNull()?.size ?: 0) +
                (if (updated.asKnown().isPresent) 1 else 0)

        /** The type of image that was uploaded */
        class ImageType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val FRONT = of("FRONT")

                @JvmField val BACK = of("BACK")

                @JvmStatic fun of(value: String) = ImageType(JsonField.of(value))
            }

            /** An enum containing [ImageType]'s known values. */
            enum class Known {
                FRONT,
                BACK,
            }

            /**
             * An enum containing [ImageType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ImageType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FRONT,
                BACK,
                /**
                 * An enum member indicating that [ImageType] was instantiated with an unknown
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
                    FRONT -> Value.FRONT
                    BACK -> Value.BACK
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
                    FRONT -> Known.FRONT
                    BACK -> Known.BACK
                    else -> throw LithicInvalidDataException("Unknown ImageType: $value")
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

            fun validate(): ImageType = apply {
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

                return other is ImageType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The status of the document upload */
        class DocumentUploadStatus
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ACCEPTED = of("ACCEPTED")

                @JvmField val REJECTED = of("REJECTED")

                @JvmField val PENDING_UPLOAD = of("PENDING_UPLOAD")

                @JvmField val UPLOADED = of("UPLOADED")

                @JvmField val PARTIAL_APPROVAL = of("PARTIAL_APPROVAL")

                @JvmStatic fun of(value: String) = DocumentUploadStatus(JsonField.of(value))
            }

            /** An enum containing [DocumentUploadStatus]'s known values. */
            enum class Known {
                ACCEPTED,
                REJECTED,
                PENDING_UPLOAD,
                UPLOADED,
                PARTIAL_APPROVAL,
            }

            /**
             * An enum containing [DocumentUploadStatus]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [DocumentUploadStatus] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACCEPTED,
                REJECTED,
                PENDING_UPLOAD,
                UPLOADED,
                PARTIAL_APPROVAL,
                /**
                 * An enum member indicating that [DocumentUploadStatus] was instantiated with an
                 * unknown value.
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
                    ACCEPTED -> Value.ACCEPTED
                    REJECTED -> Value.REJECTED
                    PENDING_UPLOAD -> Value.PENDING_UPLOAD
                    UPLOADED -> Value.UPLOADED
                    PARTIAL_APPROVAL -> Value.PARTIAL_APPROVAL
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
                    ACCEPTED -> Known.ACCEPTED
                    REJECTED -> Known.REJECTED
                    PENDING_UPLOAD -> Known.PENDING_UPLOAD
                    UPLOADED -> Known.UPLOADED
                    PARTIAL_APPROVAL -> Known.PARTIAL_APPROVAL
                    else -> throw LithicInvalidDataException("Unknown DocumentUploadStatus: $value")
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

            fun validate(): DocumentUploadStatus = apply {
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

                return other is DocumentUploadStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RequiredDocumentUpload &&
                token == other.token &&
                acceptedEntityStatusReasons == other.acceptedEntityStatusReasons &&
                created == other.created &&
                imageType == other.imageType &&
                rejectedEntityStatusReasons == other.rejectedEntityStatusReasons &&
                status == other.status &&
                statusReasons == other.statusReasons &&
                updated == other.updated &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                token,
                acceptedEntityStatusReasons,
                created,
                imageType,
                rejectedEntityStatusReasons,
                status,
                statusReasons,
                updated,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RequiredDocumentUpload{token=$token, acceptedEntityStatusReasons=$acceptedEntityStatusReasons, created=$created, imageType=$imageType, rejectedEntityStatusReasons=$rejectedEntityStatusReasons, status=$status, statusReasons=$statusReasons, updated=$updated, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountHolderDocumentUpdatedWebhookEvent &&
            eventType == other.eventType &&
            token == other.token &&
            accountHolderToken == other.accountHolderToken &&
            created == other.created &&
            documentType == other.documentType &&
            entityToken == other.entityToken &&
            requiredDocumentUploads == other.requiredDocumentUploads &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            eventType,
            token,
            accountHolderToken,
            created,
            documentType,
            entityToken,
            requiredDocumentUploads,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountHolderDocumentUpdatedWebhookEvent{eventType=$eventType, token=$token, accountHolderToken=$accountHolderToken, created=$created, documentType=$documentType, entityToken=$entityToken, requiredDocumentUploads=$requiredDocumentUploads, additionalProperties=$additionalProperties}"
}
