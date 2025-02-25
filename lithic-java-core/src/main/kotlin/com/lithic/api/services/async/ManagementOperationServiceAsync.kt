// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.ManagementOperationCreateParams
import com.lithic.api.models.ManagementOperationListPageAsync
import com.lithic.api.models.ManagementOperationListParams
import com.lithic.api.models.ManagementOperationRetrieveParams
import com.lithic.api.models.ManagementOperationReverseParams
import com.lithic.api.models.ManagementOperationTransaction
import java.util.concurrent.CompletableFuture

interface ManagementOperationServiceAsync {

    /** Create management operation */
    @JvmOverloads
    fun create(
        params: ManagementOperationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagementOperationTransaction>

    /** Get management operation */
    @JvmOverloads
    fun retrieve(
        params: ManagementOperationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagementOperationTransaction>

    /** List management operations */
    @JvmOverloads
    fun list(
        params: ManagementOperationListParams = ManagementOperationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagementOperationListPageAsync>

    /** List management operations */
    fun list(requestOptions: RequestOptions): CompletableFuture<ManagementOperationListPageAsync> =
        list(ManagementOperationListParams.none(), requestOptions)

    /** Reverse a management operation */
    @JvmOverloads
    fun reverse(
        params: ManagementOperationReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagementOperationTransaction>
}
