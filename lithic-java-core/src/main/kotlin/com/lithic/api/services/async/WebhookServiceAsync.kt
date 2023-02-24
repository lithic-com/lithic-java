@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.google.common.collect.ListMultimap
import com.lithic.api.models.Event

interface WebhookServiceAsync {

    fun unwrap(payload: String, headers: ListMultimap<String, String>, secret: String?): Event

    fun verifySignature(payload: String, headers: ListMultimap<String, String>, secret: String?)
}
