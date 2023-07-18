@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.models.Event
import com.lithic.api.models.EventListAttemptsPage
import com.lithic.api.models.EventListAttemptsParams
import com.lithic.api.models.EventListPage
import com.lithic.api.models.EventListParams
import com.lithic.api.models.EventRetrieveParams
import com.lithic.api.services.blocking.events.SubscriptionService

interface EventService {

    fun subscriptions(): SubscriptionService

    /** Get an event. */
    @JvmOverloads
    fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Event

    /** List all events. */
    @JvmOverloads
    fun list(
        params: EventListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EventListPage

    /** List all the message attempts for a given event. */
    @JvmOverloads
    fun listAttempts(
        params: EventListAttemptsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EventListAttemptsPage

    fun resend(eventToken: String, eventSubscriptionToken: String, body: JsonValue)
}
