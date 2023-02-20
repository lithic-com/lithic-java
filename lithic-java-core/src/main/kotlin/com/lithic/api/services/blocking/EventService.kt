@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.Event
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
}
