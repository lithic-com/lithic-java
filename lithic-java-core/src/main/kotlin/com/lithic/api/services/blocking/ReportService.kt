// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.services.blocking.reports.SettlementService

interface ReportService {

    fun settlement(): SettlementService
}
