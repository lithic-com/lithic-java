// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.blocking.reports.SettlementService
import com.lithic.api.services.blocking.reports.SettlementServiceImpl

class ReportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReportService {

    private val settlement: SettlementService by lazy { SettlementServiceImpl(clientOptions) }

    override fun settlement(): SettlementService = settlement
}
