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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NetworkTotalRetrieveResponse
private constructor(
    private val token: JsonField<String>,
    private val amounts: JsonField<Amounts>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val institutionId: JsonField<String>,
    private val isComplete: JsonField<Boolean>,
    private val network: JsonField<Network>,
    private val reportDate: JsonField<LocalDate>,
    private val settlementInstitutionId: JsonField<String>,
    private val settlementService: JsonField<String>,
    private val updated: JsonField<OffsetDateTime>,
    private val cycle: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amounts") @ExcludeMissing amounts: JsonField<Amounts> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("institution_id")
        @ExcludeMissing
        institutionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_complete")
        @ExcludeMissing
        isComplete: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("network") @ExcludeMissing network: JsonField<Network> = JsonMissing.of(),
        @JsonProperty("report_date")
        @ExcludeMissing
        reportDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("settlement_institution_id")
        @ExcludeMissing
        settlementInstitutionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settlement_service")
        @ExcludeMissing
        settlementService: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("cycle") @ExcludeMissing cycle: JsonField<Long> = JsonMissing.of(),
    ) : this(
        token,
        amounts,
        created,
        currency,
        institutionId,
        isComplete,
        network,
        reportDate,
        settlementInstitutionId,
        settlementService,
        updated,
        cycle,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amounts(): Amounts = amounts.getRequired("amounts")

    /**
     * RFC 3339 timestamp for when the record was created. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * 3-character alphabetic ISO 4217 code.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * The institution that activity occurred on. For Mastercard: ICA (Interbank Card Association).
     * For Maestro: institution ID. For Visa: lowest level SRE (Settlement Reporting Entity).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun institutionId(): String = institutionId.getRequired("institution_id")

    /**
     * Indicates that all settlement records related to this Network Total are available in the
     * details endpoint.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isComplete(): Boolean = isComplete.getRequired("is_complete")

    /**
     * Card network where the transaction took place. AMEX, VISA, MASTERCARD, MAESTRO, or INTERLINK.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun network(): Network = network.getRequired("network")

    /**
     * Date that the network total record applies to. YYYY-MM-DD format.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reportDate(): LocalDate = reportDate.getRequired("report_date")

    /**
     * The institution responsible for settlement. For Mastercard: same as `institution_id`. For
     * Maestro: billing ICA. For Visa: Funds Transfer SRE (FTSRE).
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settlementInstitutionId(): String =
        settlementInstitutionId.getRequired("settlement_institution_id")

    /**
     * Settlement service.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settlementService(): String = settlementService.getRequired("settlement_service")

    /**
     * RFC 3339 timestamp for when the record was last updated. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * The clearing cycle that the network total record applies to. Mastercard only.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cycle(): Optional<Long> = cycle.getOptional("cycle")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [amounts].
     *
     * Unlike [amounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amounts") @ExcludeMissing fun _amounts(): JsonField<Amounts> = amounts

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [institutionId].
     *
     * Unlike [institutionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("institution_id")
    @ExcludeMissing
    fun _institutionId(): JsonField<String> = institutionId

    /**
     * Returns the raw JSON value of [isComplete].
     *
     * Unlike [isComplete], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_complete") @ExcludeMissing fun _isComplete(): JsonField<Boolean> = isComplete

    /**
     * Returns the raw JSON value of [network].
     *
     * Unlike [network], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<Network> = network

    /**
     * Returns the raw JSON value of [reportDate].
     *
     * Unlike [reportDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("report_date")
    @ExcludeMissing
    fun _reportDate(): JsonField<LocalDate> = reportDate

    /**
     * Returns the raw JSON value of [settlementInstitutionId].
     *
     * Unlike [settlementInstitutionId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("settlement_institution_id")
    @ExcludeMissing
    fun _settlementInstitutionId(): JsonField<String> = settlementInstitutionId

    /**
     * Returns the raw JSON value of [settlementService].
     *
     * Unlike [settlementService], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("settlement_service")
    @ExcludeMissing
    fun _settlementService(): JsonField<String> = settlementService

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /**
     * Returns the raw JSON value of [cycle].
     *
     * Unlike [cycle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cycle") @ExcludeMissing fun _cycle(): JsonField<Long> = cycle

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
         * Returns a mutable builder for constructing an instance of [NetworkTotalRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .amounts()
         * .created()
         * .currency()
         * .institutionId()
         * .isComplete()
         * .network()
         * .reportDate()
         * .settlementInstitutionId()
         * .settlementService()
         * .updated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NetworkTotalRetrieveResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var amounts: JsonField<Amounts>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var institutionId: JsonField<String>? = null
        private var isComplete: JsonField<Boolean>? = null
        private var network: JsonField<Network>? = null
        private var reportDate: JsonField<LocalDate>? = null
        private var settlementInstitutionId: JsonField<String>? = null
        private var settlementService: JsonField<String>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var cycle: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(networkTotalRetrieveResponse: NetworkTotalRetrieveResponse) = apply {
            token = networkTotalRetrieveResponse.token
            amounts = networkTotalRetrieveResponse.amounts
            created = networkTotalRetrieveResponse.created
            currency = networkTotalRetrieveResponse.currency
            institutionId = networkTotalRetrieveResponse.institutionId
            isComplete = networkTotalRetrieveResponse.isComplete
            network = networkTotalRetrieveResponse.network
            reportDate = networkTotalRetrieveResponse.reportDate
            settlementInstitutionId = networkTotalRetrieveResponse.settlementInstitutionId
            settlementService = networkTotalRetrieveResponse.settlementService
            updated = networkTotalRetrieveResponse.updated
            cycle = networkTotalRetrieveResponse.cycle
            additionalProperties = networkTotalRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun amounts(amounts: Amounts) = amounts(JsonField.of(amounts))

        /**
         * Sets [Builder.amounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amounts] with a well-typed [Amounts] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amounts(amounts: JsonField<Amounts>) = apply { this.amounts = amounts }

        /** RFC 3339 timestamp for when the record was created. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** 3-character alphabetic ISO 4217 code. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * The institution that activity occurred on. For Mastercard: ICA (Interbank Card
         * Association). For Maestro: institution ID. For Visa: lowest level SRE (Settlement
         * Reporting Entity).
         */
        fun institutionId(institutionId: String) = institutionId(JsonField.of(institutionId))

        /**
         * Sets [Builder.institutionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.institutionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun institutionId(institutionId: JsonField<String>) = apply {
            this.institutionId = institutionId
        }

        /**
         * Indicates that all settlement records related to this Network Total are available in the
         * details endpoint.
         */
        fun isComplete(isComplete: Boolean) = isComplete(JsonField.of(isComplete))

        /**
         * Sets [Builder.isComplete] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isComplete] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isComplete(isComplete: JsonField<Boolean>) = apply { this.isComplete = isComplete }

        /**
         * Card network where the transaction took place. AMEX, VISA, MASTERCARD, MAESTRO, or
         * INTERLINK.
         */
        fun network(network: Network) = network(JsonField.of(network))

        /**
         * Sets [Builder.network] to an arbitrary JSON value.
         *
         * You should usually call [Builder.network] with a well-typed [Network] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /** Date that the network total record applies to. YYYY-MM-DD format. */
        fun reportDate(reportDate: LocalDate) = reportDate(JsonField.of(reportDate))

        /**
         * Sets [Builder.reportDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reportDate(reportDate: JsonField<LocalDate>) = apply { this.reportDate = reportDate }

        /**
         * The institution responsible for settlement. For Mastercard: same as `institution_id`. For
         * Maestro: billing ICA. For Visa: Funds Transfer SRE (FTSRE).
         */
        fun settlementInstitutionId(settlementInstitutionId: String) =
            settlementInstitutionId(JsonField.of(settlementInstitutionId))

        /**
         * Sets [Builder.settlementInstitutionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementInstitutionId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun settlementInstitutionId(settlementInstitutionId: JsonField<String>) = apply {
            this.settlementInstitutionId = settlementInstitutionId
        }

        /** Settlement service. */
        fun settlementService(settlementService: String) =
            settlementService(JsonField.of(settlementService))

        /**
         * Sets [Builder.settlementService] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementService] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun settlementService(settlementService: JsonField<String>) = apply {
            this.settlementService = settlementService
        }

        /** RFC 3339 timestamp for when the record was last updated. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        /** The clearing cycle that the network total record applies to. Mastercard only. */
        fun cycle(cycle: Long) = cycle(JsonField.of(cycle))

        /**
         * Sets [Builder.cycle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cycle] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cycle(cycle: JsonField<Long>) = apply { this.cycle = cycle }

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
         * Returns an immutable instance of [NetworkTotalRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .amounts()
         * .created()
         * .currency()
         * .institutionId()
         * .isComplete()
         * .network()
         * .reportDate()
         * .settlementInstitutionId()
         * .settlementService()
         * .updated()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NetworkTotalRetrieveResponse =
            NetworkTotalRetrieveResponse(
                checkRequired("token", token),
                checkRequired("amounts", amounts),
                checkRequired("created", created),
                checkRequired("currency", currency),
                checkRequired("institutionId", institutionId),
                checkRequired("isComplete", isComplete),
                checkRequired("network", network),
                checkRequired("reportDate", reportDate),
                checkRequired("settlementInstitutionId", settlementInstitutionId),
                checkRequired("settlementService", settlementService),
                checkRequired("updated", updated),
                cycle,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NetworkTotalRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        amounts().validate()
        created()
        currency()
        institutionId()
        isComplete()
        network().validate()
        reportDate()
        settlementInstitutionId()
        settlementService()
        updated()
        cycle()
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
        (if (token.asKnown().isPresent) 1 else 0) +
            (amounts.asKnown().getOrNull()?.validity() ?: 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (institutionId.asKnown().isPresent) 1 else 0) +
            (if (isComplete.asKnown().isPresent) 1 else 0) +
            (network.asKnown().getOrNull()?.validity() ?: 0) +
            (if (reportDate.asKnown().isPresent) 1 else 0) +
            (if (settlementInstitutionId.asKnown().isPresent) 1 else 0) +
            (if (settlementService.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (if (cycle.asKnown().isPresent) 1 else 0)

    class Amounts
    private constructor(
        private val grossSettlement: JsonField<Long>,
        private val interchangeFees: JsonField<Long>,
        private val netSettlement: JsonField<Long>,
        private val visaCharges: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("gross_settlement")
            @ExcludeMissing
            grossSettlement: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("interchange_fees")
            @ExcludeMissing
            interchangeFees: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("net_settlement")
            @ExcludeMissing
            netSettlement: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("visa_charges")
            @ExcludeMissing
            visaCharges: JsonField<Long> = JsonMissing.of(),
        ) : this(grossSettlement, interchangeFees, netSettlement, visaCharges, mutableMapOf())

        /**
         * Total settlement amount excluding interchange, in currency's smallest unit.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun grossSettlement(): Long = grossSettlement.getRequired("gross_settlement")

        /**
         * Interchange amount, in currency's smallest unit.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun interchangeFees(): Long = interchangeFees.getRequired("interchange_fees")

        /**
         * `gross_settlement` net of `interchange_fees` and `visa_charges` (if applicable), in
         * currency's smallest unit.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun netSettlement(): Long = netSettlement.getRequired("net_settlement")

        /**
         * Charges specific to Visa/Interlink, in currency's smallest unit.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun visaCharges(): Optional<Long> = visaCharges.getOptional("visa_charges")

        /**
         * Returns the raw JSON value of [grossSettlement].
         *
         * Unlike [grossSettlement], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("gross_settlement")
        @ExcludeMissing
        fun _grossSettlement(): JsonField<Long> = grossSettlement

        /**
         * Returns the raw JSON value of [interchangeFees].
         *
         * Unlike [interchangeFees], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("interchange_fees")
        @ExcludeMissing
        fun _interchangeFees(): JsonField<Long> = interchangeFees

        /**
         * Returns the raw JSON value of [netSettlement].
         *
         * Unlike [netSettlement], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("net_settlement")
        @ExcludeMissing
        fun _netSettlement(): JsonField<Long> = netSettlement

        /**
         * Returns the raw JSON value of [visaCharges].
         *
         * Unlike [visaCharges], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("visa_charges")
        @ExcludeMissing
        fun _visaCharges(): JsonField<Long> = visaCharges

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
             * Returns a mutable builder for constructing an instance of [Amounts].
             *
             * The following fields are required:
             * ```java
             * .grossSettlement()
             * .interchangeFees()
             * .netSettlement()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Amounts]. */
        class Builder internal constructor() {

            private var grossSettlement: JsonField<Long>? = null
            private var interchangeFees: JsonField<Long>? = null
            private var netSettlement: JsonField<Long>? = null
            private var visaCharges: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(amounts: Amounts) = apply {
                grossSettlement = amounts.grossSettlement
                interchangeFees = amounts.interchangeFees
                netSettlement = amounts.netSettlement
                visaCharges = amounts.visaCharges
                additionalProperties = amounts.additionalProperties.toMutableMap()
            }

            /** Total settlement amount excluding interchange, in currency's smallest unit. */
            fun grossSettlement(grossSettlement: Long) =
                grossSettlement(JsonField.of(grossSettlement))

            /**
             * Sets [Builder.grossSettlement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.grossSettlement] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun grossSettlement(grossSettlement: JsonField<Long>) = apply {
                this.grossSettlement = grossSettlement
            }

            /** Interchange amount, in currency's smallest unit. */
            fun interchangeFees(interchangeFees: Long) =
                interchangeFees(JsonField.of(interchangeFees))

            /**
             * Sets [Builder.interchangeFees] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interchangeFees] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun interchangeFees(interchangeFees: JsonField<Long>) = apply {
                this.interchangeFees = interchangeFees
            }

            /**
             * `gross_settlement` net of `interchange_fees` and `visa_charges` (if applicable), in
             * currency's smallest unit.
             */
            fun netSettlement(netSettlement: Long) = netSettlement(JsonField.of(netSettlement))

            /**
             * Sets [Builder.netSettlement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netSettlement] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun netSettlement(netSettlement: JsonField<Long>) = apply {
                this.netSettlement = netSettlement
            }

            /** Charges specific to Visa/Interlink, in currency's smallest unit. */
            fun visaCharges(visaCharges: Long) = visaCharges(JsonField.of(visaCharges))

            /**
             * Sets [Builder.visaCharges] to an arbitrary JSON value.
             *
             * You should usually call [Builder.visaCharges] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun visaCharges(visaCharges: JsonField<Long>) = apply { this.visaCharges = visaCharges }

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
             * Returns an immutable instance of [Amounts].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .grossSettlement()
             * .interchangeFees()
             * .netSettlement()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Amounts =
                Amounts(
                    checkRequired("grossSettlement", grossSettlement),
                    checkRequired("interchangeFees", interchangeFees),
                    checkRequired("netSettlement", netSettlement),
                    visaCharges,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Amounts = apply {
            if (validated) {
                return@apply
            }

            grossSettlement()
            interchangeFees()
            netSettlement()
            visaCharges()
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
            (if (grossSettlement.asKnown().isPresent) 1 else 0) +
                (if (interchangeFees.asKnown().isPresent) 1 else 0) +
                (if (netSettlement.asKnown().isPresent) 1 else 0) +
                (if (visaCharges.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Amounts && grossSettlement == other.grossSettlement && interchangeFees == other.interchangeFees && netSettlement == other.netSettlement && visaCharges == other.visaCharges && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(grossSettlement, interchangeFees, netSettlement, visaCharges, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Amounts{grossSettlement=$grossSettlement, interchangeFees=$interchangeFees, netSettlement=$netSettlement, visaCharges=$visaCharges, additionalProperties=$additionalProperties}"
    }

    /**
     * Card network where the transaction took place. AMEX, VISA, MASTERCARD, MAESTRO, or INTERLINK.
     */
    class Network @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AMEX = of("AMEX")

            @JvmField val VISA = of("VISA")

            @JvmField val MASTERCARD = of("MASTERCARD")

            @JvmField val MAESTRO = of("MAESTRO")

            @JvmField val INTERLINK = of("INTERLINK")

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        /** An enum containing [Network]'s known values. */
        enum class Known {
            AMEX,
            VISA,
            MASTERCARD,
            MAESTRO,
            INTERLINK,
        }

        /**
         * An enum containing [Network]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Network] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AMEX,
            VISA,
            MASTERCARD,
            MAESTRO,
            INTERLINK,
            /** An enum member indicating that [Network] was instantiated with an unknown value. */
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
                AMEX -> Value.AMEX
                VISA -> Value.VISA
                MASTERCARD -> Value.MASTERCARD
                MAESTRO -> Value.MAESTRO
                INTERLINK -> Value.INTERLINK
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
                AMEX -> Known.AMEX
                VISA -> Known.VISA
                MASTERCARD -> Known.MASTERCARD
                MAESTRO -> Known.MAESTRO
                INTERLINK -> Known.INTERLINK
                else -> throw LithicInvalidDataException("Unknown Network: $value")
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

        fun validate(): Network = apply {
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

            return /* spotless:off */ other is Network && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NetworkTotalRetrieveResponse && token == other.token && amounts == other.amounts && created == other.created && currency == other.currency && institutionId == other.institutionId && isComplete == other.isComplete && network == other.network && reportDate == other.reportDate && settlementInstitutionId == other.settlementInstitutionId && settlementService == other.settlementService && updated == other.updated && cycle == other.cycle && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, amounts, created, currency, institutionId, isComplete, network, reportDate, settlementInstitutionId, settlementService, updated, cycle, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NetworkTotalRetrieveResponse{token=$token, amounts=$amounts, created=$created, currency=$currency, institutionId=$institutionId, isComplete=$isComplete, network=$network, reportDate=$reportDate, settlementInstitutionId=$settlementInstitutionId, settlementService=$settlementService, updated=$updated, cycle=$cycle, additionalProperties=$additionalProperties}"
}
