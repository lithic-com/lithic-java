// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.blocking.reports.SettlementService
import com.lithic.api.services.blocking.reports.SettlementServiceImpl

class ReportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReportService {

    private val withRawResponse: ReportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val settlement: SettlementService by lazy { SettlementServiceImpl(clientOptions) }

    override fun withRawResponse(): ReportService.WithRawResponse = withRawResponse

    override fun settlement(): SettlementService = settlement

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReportService.WithRawResponse {

        private val settlement: SettlementService.WithRawResponse by lazy {
            SettlementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun settlement(): SettlementService.WithRawResponse = settlement
    }
}
