// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.ManagementOperationCreateParams
import com.lithic.api.models.ManagementOperationListPage
import com.lithic.api.models.ManagementOperationListParams
import com.lithic.api.models.ManagementOperationRetrieveParams
import com.lithic.api.models.ManagementOperationReverseParams
import com.lithic.api.models.ManagementOperationTransaction

interface ManagementOperationService {

    /** Create management operation */
    @JvmOverloads
    fun create(
        params: ManagementOperationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ManagementOperationTransaction

    /** Get management operation */
    @JvmOverloads
    fun retrieve(
        params: ManagementOperationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ManagementOperationTransaction

    /** List management operations */
    @JvmOverloads
    fun list(
        params: ManagementOperationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ManagementOperationListPage

    /** Reverse a management operation */
    @JvmOverloads
    fun reverse(
        params: ManagementOperationReverseParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ManagementOperationTransaction
}
