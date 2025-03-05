// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.async.reports.SettlementServiceAsync
import com.lithic.api.services.async.reports.SettlementServiceAsyncImpl

class ReportServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ReportServiceAsync {

    private val withRawResponse: ReportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val settlement: SettlementServiceAsync by lazy {
        SettlementServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ReportServiceAsync.WithRawResponse = withRawResponse

    override fun settlement(): SettlementServiceAsync = settlement

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReportServiceAsync.WithRawResponse {

        private val settlement: SettlementServiceAsync.WithRawResponse by lazy {
            SettlementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun settlement(): SettlementServiceAsync.WithRawResponse = settlement
    }
}
