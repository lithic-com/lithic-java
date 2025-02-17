// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.async.reports.SettlementServiceAsync
import com.lithic.api.services.async.reports.SettlementServiceAsyncImpl

class ReportServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ReportServiceAsync {

    private val settlement: SettlementServiceAsync by lazy {
        SettlementServiceAsyncImpl(clientOptions)
    }

    override fun settlement(): SettlementServiceAsync = settlement
}
