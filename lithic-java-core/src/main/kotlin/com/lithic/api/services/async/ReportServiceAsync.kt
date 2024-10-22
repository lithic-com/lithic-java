// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.services.async.reports.SettlementServiceAsync

interface ReportServiceAsync {

    fun settlement(): SettlementServiceAsync
}
