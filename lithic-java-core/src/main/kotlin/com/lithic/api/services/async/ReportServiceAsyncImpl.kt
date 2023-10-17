// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.services.async.reports.SettlementServiceAsync
import com.lithic.api.services.async.reports.SettlementServiceAsyncImpl
import com.lithic.api.services.errorHandler

class ReportServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ReportServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val settlement: SettlementServiceAsync by lazy {
        SettlementServiceAsyncImpl(clientOptions)
    }

    override fun settlement(): SettlementServiceAsync = settlement
}
