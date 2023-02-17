@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.Event
import com.lithic.api.models.EventListPageAsync
import com.lithic.api.models.EventListParams
import com.lithic.api.models.EventRetrieveParams
import com.lithic.api.services.async.events.SubscriptionServiceAsync
import java.util.concurrent.CompletableFuture

interface EventServiceAsync {

    fun subscriptions(): SubscriptionServiceAsync

    /** Get an event. */
    @JvmOverloads
    fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Event>

    /** List all events. */
    @JvmOverloads
    fun list(
        params: EventListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EventListPageAsync>
}
