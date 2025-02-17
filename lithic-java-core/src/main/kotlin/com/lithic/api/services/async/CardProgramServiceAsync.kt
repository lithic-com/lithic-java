// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.CardProgram
import com.lithic.api.models.CardProgramListPageAsync
import com.lithic.api.models.CardProgramListParams
import com.lithic.api.models.CardProgramRetrieveParams
import java.util.concurrent.CompletableFuture

interface CardProgramServiceAsync {

    /** Get card program. */
    @JvmOverloads
    fun retrieve(
        params: CardProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardProgram>

    /** List card programs. */
    @JvmOverloads
    fun list(
        params: CardProgramListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardProgramListPageAsync>
}
