// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.services.blocking.reports.SettlementService
import com.lithic.api.services.blocking.reports.SettlementServiceImpl

class ReportServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ReportService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val settlement: SettlementService by lazy { SettlementServiceImpl(clientOptions) }

    override fun settlement(): SettlementService = settlement
}
