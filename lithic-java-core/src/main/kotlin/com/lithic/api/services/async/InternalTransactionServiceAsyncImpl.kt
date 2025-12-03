// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import java.util.function.Consumer

class InternalTransactionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InternalTransactionServiceAsync {

    private val withRawResponse: InternalTransactionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InternalTransactionServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): InternalTransactionServiceAsync =
        InternalTransactionServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InternalTransactionServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InternalTransactionServiceAsync.WithRawResponse =
            InternalTransactionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
