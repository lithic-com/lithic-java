// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.TokenizationActivateParams
import com.lithic.api.models.TokenizationDeactivateParams
import com.lithic.api.models.TokenizationListPageAsync
import com.lithic.api.models.TokenizationListParams
import com.lithic.api.models.TokenizationPauseParams
import com.lithic.api.models.TokenizationResendActivationCodeParams
import com.lithic.api.models.TokenizationRetrieveParams
import com.lithic.api.models.TokenizationRetrieveResponse
import com.lithic.api.models.TokenizationSimulateParams
import com.lithic.api.models.TokenizationSimulateResponse
import com.lithic.api.models.TokenizationUnpauseParams
import com.lithic.api.models.TokenizationUpdateDigitalCardArtParams
import com.lithic.api.models.TokenizationUpdateDigitalCardArtResponse
import java.util.concurrent.CompletableFuture

interface TokenizationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get tokenization */
    fun retrieve(tokenizationToken: String): CompletableFuture<TokenizationRetrieveResponse> =
        retrieve(tokenizationToken, TokenizationRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        tokenizationToken: String,
        params: TokenizationRetrieveParams = TokenizationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenizationRetrieveResponse> =
        retrieve(params.toBuilder().tokenizationToken(tokenizationToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        tokenizationToken: String,
        params: TokenizationRetrieveParams = TokenizationRetrieveParams.none(),
    ): CompletableFuture<TokenizationRetrieveResponse> =
        retrieve(tokenizationToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TokenizationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenizationRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: TokenizationRetrieveParams
    ): CompletableFuture<TokenizationRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        tokenizationToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenizationRetrieveResponse> =
        retrieve(tokenizationToken, TokenizationRetrieveParams.none(), requestOptions)

    /** List card tokenizations */
    fun list(): CompletableFuture<TokenizationListPageAsync> = list(TokenizationListParams.none())

    /** @see [list] */
    fun list(
        params: TokenizationListParams = TokenizationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenizationListPageAsync>

    /** @see [list] */
    fun list(
        params: TokenizationListParams = TokenizationListParams.none()
    ): CompletableFuture<TokenizationListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<TokenizationListPageAsync> =
        list(TokenizationListParams.none(), requestOptions)

    /**
     * This endpoint is used to ask the card network to activate a tokenization. A successful
     * response indicates that the request was successfully delivered to the card network. When the
     * card network activates the tokenization, the state will be updated and a tokenization.updated
     * event will be sent. The endpoint may only be used on digital wallet tokenizations with status
     * `INACTIVE`, `PENDING_ACTIVATION`, or `PENDING_2FA`. This will put the tokenization in an
     * active state, and transactions will be allowed. Reach out at
     * [lithic.com/contact](https://lithic.com/contact) for more information.
     */
    fun activate(tokenizationToken: String): CompletableFuture<Void?> =
        activate(tokenizationToken, TokenizationActivateParams.none())

    /** @see [activate] */
    fun activate(
        tokenizationToken: String,
        params: TokenizationActivateParams = TokenizationActivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        activate(params.toBuilder().tokenizationToken(tokenizationToken).build(), requestOptions)

    /** @see [activate] */
    fun activate(
        tokenizationToken: String,
        params: TokenizationActivateParams = TokenizationActivateParams.none(),
    ): CompletableFuture<Void?> = activate(tokenizationToken, params, RequestOptions.none())

    /** @see [activate] */
    fun activate(
        params: TokenizationActivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [activate] */
    fun activate(params: TokenizationActivateParams): CompletableFuture<Void?> =
        activate(params, RequestOptions.none())

    /** @see [activate] */
    fun activate(
        tokenizationToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        activate(tokenizationToken, TokenizationActivateParams.none(), requestOptions)

    /**
     * This endpoint is used to ask the card network to deactivate a tokenization. A successful
     * response indicates that the request was successfully delivered to the card network. When the
     * card network deactivates the tokenization, the state will be updated and a
     * tokenization.updated event will be sent. Authorizations attempted with a deactivated
     * tokenization will be blocked and will not be forwarded to Lithic from the network.
     * Deactivating the token is a permanent operation. If the target is a digital wallet
     * tokenization, it will be removed from its device. Reach out at
     * [lithic.com/contact](https://lithic.com/contact) for more information.
     */
    fun deactivate(tokenizationToken: String): CompletableFuture<Void?> =
        deactivate(tokenizationToken, TokenizationDeactivateParams.none())

    /** @see [deactivate] */
    fun deactivate(
        tokenizationToken: String,
        params: TokenizationDeactivateParams = TokenizationDeactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deactivate(params.toBuilder().tokenizationToken(tokenizationToken).build(), requestOptions)

    /** @see [deactivate] */
    fun deactivate(
        tokenizationToken: String,
        params: TokenizationDeactivateParams = TokenizationDeactivateParams.none(),
    ): CompletableFuture<Void?> = deactivate(tokenizationToken, params, RequestOptions.none())

    /** @see [deactivate] */
    fun deactivate(
        params: TokenizationDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [deactivate] */
    fun deactivate(params: TokenizationDeactivateParams): CompletableFuture<Void?> =
        deactivate(params, RequestOptions.none())

    /** @see [deactivate] */
    fun deactivate(
        tokenizationToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        deactivate(tokenizationToken, TokenizationDeactivateParams.none(), requestOptions)

    /**
     * This endpoint is used to ask the card network to pause a tokenization. A successful response
     * indicates that the request was successfully delivered to the card network. When the card
     * network pauses the tokenization, the state will be updated and a tokenization.updated event
     * will be sent. The endpoint may only be used on tokenizations with status `ACTIVE`. A paused
     * token will prevent merchants from sending authorizations, and is a temporary status that can
     * be changed. Reach out at [lithic.com/contact](https://lithic.com/contact) for more
     * information.
     */
    fun pause(tokenizationToken: String): CompletableFuture<Void?> =
        pause(tokenizationToken, TokenizationPauseParams.none())

    /** @see [pause] */
    fun pause(
        tokenizationToken: String,
        params: TokenizationPauseParams = TokenizationPauseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        pause(params.toBuilder().tokenizationToken(tokenizationToken).build(), requestOptions)

    /** @see [pause] */
    fun pause(
        tokenizationToken: String,
        params: TokenizationPauseParams = TokenizationPauseParams.none(),
    ): CompletableFuture<Void?> = pause(tokenizationToken, params, RequestOptions.none())

    /** @see [pause] */
    fun pause(
        params: TokenizationPauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [pause] */
    fun pause(params: TokenizationPauseParams): CompletableFuture<Void?> =
        pause(params, RequestOptions.none())

    /** @see [pause] */
    fun pause(tokenizationToken: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        pause(tokenizationToken, TokenizationPauseParams.none(), requestOptions)

    /**
     * This endpoint is used to ask the card network to send another activation code to a cardholder
     * that has already tried tokenizing a card. A successful response indicates that the request
     * was successfully delivered to the card network. The endpoint may only be used on Mastercard
     * digital wallet tokenizations with status `INACTIVE`, `PENDING_ACTIVATION`, or `PENDING_2FA`.
     * The network will send a new activation code to the one of the contact methods provided in the
     * initial tokenization flow. If a user fails to enter the code correctly 3 times, the contact
     * method will not be eligible for resending the activation code, and the cardholder must
     * restart the provision process. Reach out at [lithic.com/contact](https://lithic.com/contact)
     * for more information.
     */
    fun resendActivationCode(tokenizationToken: String): CompletableFuture<Void?> =
        resendActivationCode(tokenizationToken, TokenizationResendActivationCodeParams.none())

    /** @see [resendActivationCode] */
    fun resendActivationCode(
        tokenizationToken: String,
        params: TokenizationResendActivationCodeParams =
            TokenizationResendActivationCodeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        resendActivationCode(
            params.toBuilder().tokenizationToken(tokenizationToken).build(),
            requestOptions,
        )

    /** @see [resendActivationCode] */
    fun resendActivationCode(
        tokenizationToken: String,
        params: TokenizationResendActivationCodeParams =
            TokenizationResendActivationCodeParams.none(),
    ): CompletableFuture<Void?> =
        resendActivationCode(tokenizationToken, params, RequestOptions.none())

    /** @see [resendActivationCode] */
    fun resendActivationCode(
        params: TokenizationResendActivationCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [resendActivationCode] */
    fun resendActivationCode(
        params: TokenizationResendActivationCodeParams
    ): CompletableFuture<Void?> = resendActivationCode(params, RequestOptions.none())

    /** @see [resendActivationCode] */
    fun resendActivationCode(
        tokenizationToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        resendActivationCode(
            tokenizationToken,
            TokenizationResendActivationCodeParams.none(),
            requestOptions,
        )

    /**
     * This endpoint is used to simulate a card's tokenization in the Digital Wallet and merchant
     * tokenization ecosystem.
     */
    fun simulate(
        params: TokenizationSimulateParams
    ): CompletableFuture<TokenizationSimulateResponse> = simulate(params, RequestOptions.none())

    /** @see [simulate] */
    fun simulate(
        params: TokenizationSimulateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenizationSimulateResponse>

    /**
     * This endpoint is used to ask the card network to unpause a tokenization. A successful
     * response indicates that the request was successfully delivered to the card network. When the
     * card network unpauses the tokenization, the state will be updated and a tokenization.updated
     * event will be sent. The endpoint may only be used on tokenizations with status `PAUSED`. This
     * will put the tokenization in an active state, and transactions may resume. Reach out at
     * [lithic.com/contact](https://lithic.com/contact) for more information.
     */
    fun unpause(tokenizationToken: String): CompletableFuture<Void?> =
        unpause(tokenizationToken, TokenizationUnpauseParams.none())

    /** @see [unpause] */
    fun unpause(
        tokenizationToken: String,
        params: TokenizationUnpauseParams = TokenizationUnpauseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        unpause(params.toBuilder().tokenizationToken(tokenizationToken).build(), requestOptions)

    /** @see [unpause] */
    fun unpause(
        tokenizationToken: String,
        params: TokenizationUnpauseParams = TokenizationUnpauseParams.none(),
    ): CompletableFuture<Void?> = unpause(tokenizationToken, params, RequestOptions.none())

    /** @see [unpause] */
    fun unpause(
        params: TokenizationUnpauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [unpause] */
    fun unpause(params: TokenizationUnpauseParams): CompletableFuture<Void?> =
        unpause(params, RequestOptions.none())

    /** @see [unpause] */
    fun unpause(
        tokenizationToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        unpause(tokenizationToken, TokenizationUnpauseParams.none(), requestOptions)

    /**
     * This endpoint is used update the digital card art for a digital wallet tokenization. A
     * successful response indicates that the card network has updated the tokenization's art, and
     * the tokenization's `digital_cart_art_token` field was updated. The endpoint may not be used
     * on tokenizations with status `DEACTIVATED`. Note that this updates the art for one specific
     * tokenization, not all tokenizations for a card. New tokenizations for a card will be created
     * with the art referenced in the card object's `digital_card_art_token` field. Reach out at
     * [lithic.com/contact](https://lithic.com/contact) for more information.
     */
    fun updateDigitalCardArt(
        tokenizationToken: String
    ): CompletableFuture<TokenizationUpdateDigitalCardArtResponse> =
        updateDigitalCardArt(tokenizationToken, TokenizationUpdateDigitalCardArtParams.none())

    /** @see [updateDigitalCardArt] */
    fun updateDigitalCardArt(
        tokenizationToken: String,
        params: TokenizationUpdateDigitalCardArtParams =
            TokenizationUpdateDigitalCardArtParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenizationUpdateDigitalCardArtResponse> =
        updateDigitalCardArt(
            params.toBuilder().tokenizationToken(tokenizationToken).build(),
            requestOptions,
        )

    /** @see [updateDigitalCardArt] */
    fun updateDigitalCardArt(
        tokenizationToken: String,
        params: TokenizationUpdateDigitalCardArtParams =
            TokenizationUpdateDigitalCardArtParams.none(),
    ): CompletableFuture<TokenizationUpdateDigitalCardArtResponse> =
        updateDigitalCardArt(tokenizationToken, params, RequestOptions.none())

    /** @see [updateDigitalCardArt] */
    fun updateDigitalCardArt(
        params: TokenizationUpdateDigitalCardArtParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenizationUpdateDigitalCardArtResponse>

    /** @see [updateDigitalCardArt] */
    fun updateDigitalCardArt(
        params: TokenizationUpdateDigitalCardArtParams
    ): CompletableFuture<TokenizationUpdateDigitalCardArtResponse> =
        updateDigitalCardArt(params, RequestOptions.none())

    /** @see [updateDigitalCardArt] */
    fun updateDigitalCardArt(
        tokenizationToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenizationUpdateDigitalCardArtResponse> =
        updateDigitalCardArt(
            tokenizationToken,
            TokenizationUpdateDigitalCardArtParams.none(),
            requestOptions,
        )

    /**
     * A view of [TokenizationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/tokenizations/{tokenization_token}`, but is
         * otherwise the same as [TokenizationServiceAsync.retrieve].
         */
        fun retrieve(
            tokenizationToken: String
        ): CompletableFuture<HttpResponseFor<TokenizationRetrieveResponse>> =
            retrieve(tokenizationToken, TokenizationRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            tokenizationToken: String,
            params: TokenizationRetrieveParams = TokenizationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenizationRetrieveResponse>> =
            retrieve(
                params.toBuilder().tokenizationToken(tokenizationToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        fun retrieve(
            tokenizationToken: String,
            params: TokenizationRetrieveParams = TokenizationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TokenizationRetrieveResponse>> =
            retrieve(tokenizationToken, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: TokenizationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenizationRetrieveResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: TokenizationRetrieveParams
        ): CompletableFuture<HttpResponseFor<TokenizationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            tokenizationToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenizationRetrieveResponse>> =
            retrieve(tokenizationToken, TokenizationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/tokenizations`, but is otherwise the same as
         * [TokenizationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TokenizationListPageAsync>> =
            list(TokenizationListParams.none())

        /** @see [list] */
        fun list(
            params: TokenizationListParams = TokenizationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenizationListPageAsync>>

        /** @see [list] */
        fun list(
            params: TokenizationListParams = TokenizationListParams.none()
        ): CompletableFuture<HttpResponseFor<TokenizationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TokenizationListPageAsync>> =
            list(TokenizationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/tokenizations/{tokenization_token}/activate`,
         * but is otherwise the same as [TokenizationServiceAsync.activate].
         */
        fun activate(tokenizationToken: String): CompletableFuture<HttpResponse> =
            activate(tokenizationToken, TokenizationActivateParams.none())

        /** @see [activate] */
        fun activate(
            tokenizationToken: String,
            params: TokenizationActivateParams = TokenizationActivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            activate(
                params.toBuilder().tokenizationToken(tokenizationToken).build(),
                requestOptions,
            )

        /** @see [activate] */
        fun activate(
            tokenizationToken: String,
            params: TokenizationActivateParams = TokenizationActivateParams.none(),
        ): CompletableFuture<HttpResponse> =
            activate(tokenizationToken, params, RequestOptions.none())

        /** @see [activate] */
        fun activate(
            params: TokenizationActivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [activate] */
        fun activate(params: TokenizationActivateParams): CompletableFuture<HttpResponse> =
            activate(params, RequestOptions.none())

        /** @see [activate] */
        fun activate(
            tokenizationToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            activate(tokenizationToken, TokenizationActivateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/tokenizations/{tokenization_token}/deactivate`,
         * but is otherwise the same as [TokenizationServiceAsync.deactivate].
         */
        fun deactivate(tokenizationToken: String): CompletableFuture<HttpResponse> =
            deactivate(tokenizationToken, TokenizationDeactivateParams.none())

        /** @see [deactivate] */
        fun deactivate(
            tokenizationToken: String,
            params: TokenizationDeactivateParams = TokenizationDeactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deactivate(
                params.toBuilder().tokenizationToken(tokenizationToken).build(),
                requestOptions,
            )

        /** @see [deactivate] */
        fun deactivate(
            tokenizationToken: String,
            params: TokenizationDeactivateParams = TokenizationDeactivateParams.none(),
        ): CompletableFuture<HttpResponse> =
            deactivate(tokenizationToken, params, RequestOptions.none())

        /** @see [deactivate] */
        fun deactivate(
            params: TokenizationDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [deactivate] */
        fun deactivate(params: TokenizationDeactivateParams): CompletableFuture<HttpResponse> =
            deactivate(params, RequestOptions.none())

        /** @see [deactivate] */
        fun deactivate(
            tokenizationToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deactivate(tokenizationToken, TokenizationDeactivateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/tokenizations/{tokenization_token}/pause`, but
         * is otherwise the same as [TokenizationServiceAsync.pause].
         */
        fun pause(tokenizationToken: String): CompletableFuture<HttpResponse> =
            pause(tokenizationToken, TokenizationPauseParams.none())

        /** @see [pause] */
        fun pause(
            tokenizationToken: String,
            params: TokenizationPauseParams = TokenizationPauseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            pause(params.toBuilder().tokenizationToken(tokenizationToken).build(), requestOptions)

        /** @see [pause] */
        fun pause(
            tokenizationToken: String,
            params: TokenizationPauseParams = TokenizationPauseParams.none(),
        ): CompletableFuture<HttpResponse> = pause(tokenizationToken, params, RequestOptions.none())

        /** @see [pause] */
        fun pause(
            params: TokenizationPauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [pause] */
        fun pause(params: TokenizationPauseParams): CompletableFuture<HttpResponse> =
            pause(params, RequestOptions.none())

        /** @see [pause] */
        fun pause(
            tokenizationToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            pause(tokenizationToken, TokenizationPauseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/tokenizations/{tokenization_token}/resend_activation_code`, but is otherwise the same
         * as [TokenizationServiceAsync.resendActivationCode].
         */
        fun resendActivationCode(tokenizationToken: String): CompletableFuture<HttpResponse> =
            resendActivationCode(tokenizationToken, TokenizationResendActivationCodeParams.none())

        /** @see [resendActivationCode] */
        fun resendActivationCode(
            tokenizationToken: String,
            params: TokenizationResendActivationCodeParams =
                TokenizationResendActivationCodeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            resendActivationCode(
                params.toBuilder().tokenizationToken(tokenizationToken).build(),
                requestOptions,
            )

        /** @see [resendActivationCode] */
        fun resendActivationCode(
            tokenizationToken: String,
            params: TokenizationResendActivationCodeParams =
                TokenizationResendActivationCodeParams.none(),
        ): CompletableFuture<HttpResponse> =
            resendActivationCode(tokenizationToken, params, RequestOptions.none())

        /** @see [resendActivationCode] */
        fun resendActivationCode(
            params: TokenizationResendActivationCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [resendActivationCode] */
        fun resendActivationCode(
            params: TokenizationResendActivationCodeParams
        ): CompletableFuture<HttpResponse> = resendActivationCode(params, RequestOptions.none())

        /** @see [resendActivationCode] */
        fun resendActivationCode(
            tokenizationToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            resendActivationCode(
                tokenizationToken,
                TokenizationResendActivationCodeParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /v1/simulate/tokenizations`, but is otherwise the
         * same as [TokenizationServiceAsync.simulate].
         */
        fun simulate(
            params: TokenizationSimulateParams
        ): CompletableFuture<HttpResponseFor<TokenizationSimulateResponse>> =
            simulate(params, RequestOptions.none())

        /** @see [simulate] */
        fun simulate(
            params: TokenizationSimulateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenizationSimulateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/tokenizations/{tokenization_token}/unpause`,
         * but is otherwise the same as [TokenizationServiceAsync.unpause].
         */
        fun unpause(tokenizationToken: String): CompletableFuture<HttpResponse> =
            unpause(tokenizationToken, TokenizationUnpauseParams.none())

        /** @see [unpause] */
        fun unpause(
            tokenizationToken: String,
            params: TokenizationUnpauseParams = TokenizationUnpauseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            unpause(params.toBuilder().tokenizationToken(tokenizationToken).build(), requestOptions)

        /** @see [unpause] */
        fun unpause(
            tokenizationToken: String,
            params: TokenizationUnpauseParams = TokenizationUnpauseParams.none(),
        ): CompletableFuture<HttpResponse> =
            unpause(tokenizationToken, params, RequestOptions.none())

        /** @see [unpause] */
        fun unpause(
            params: TokenizationUnpauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [unpause] */
        fun unpause(params: TokenizationUnpauseParams): CompletableFuture<HttpResponse> =
            unpause(params, RequestOptions.none())

        /** @see [unpause] */
        fun unpause(
            tokenizationToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            unpause(tokenizationToken, TokenizationUnpauseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/tokenizations/{tokenization_token}/update_digital_card_art`, but is otherwise the
         * same as [TokenizationServiceAsync.updateDigitalCardArt].
         */
        fun updateDigitalCardArt(
            tokenizationToken: String
        ): CompletableFuture<HttpResponseFor<TokenizationUpdateDigitalCardArtResponse>> =
            updateDigitalCardArt(tokenizationToken, TokenizationUpdateDigitalCardArtParams.none())

        /** @see [updateDigitalCardArt] */
        fun updateDigitalCardArt(
            tokenizationToken: String,
            params: TokenizationUpdateDigitalCardArtParams =
                TokenizationUpdateDigitalCardArtParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenizationUpdateDigitalCardArtResponse>> =
            updateDigitalCardArt(
                params.toBuilder().tokenizationToken(tokenizationToken).build(),
                requestOptions,
            )

        /** @see [updateDigitalCardArt] */
        fun updateDigitalCardArt(
            tokenizationToken: String,
            params: TokenizationUpdateDigitalCardArtParams =
                TokenizationUpdateDigitalCardArtParams.none(),
        ): CompletableFuture<HttpResponseFor<TokenizationUpdateDigitalCardArtResponse>> =
            updateDigitalCardArt(tokenizationToken, params, RequestOptions.none())

        /** @see [updateDigitalCardArt] */
        fun updateDigitalCardArt(
            params: TokenizationUpdateDigitalCardArtParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenizationUpdateDigitalCardArtResponse>>

        /** @see [updateDigitalCardArt] */
        fun updateDigitalCardArt(
            params: TokenizationUpdateDigitalCardArtParams
        ): CompletableFuture<HttpResponseFor<TokenizationUpdateDigitalCardArtResponse>> =
            updateDigitalCardArt(params, RequestOptions.none())

        /** @see [updateDigitalCardArt] */
        fun updateDigitalCardArt(
            tokenizationToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenizationUpdateDigitalCardArtResponse>> =
            updateDigitalCardArt(
                tokenizationToken,
                TokenizationUpdateDigitalCardArtParams.none(),
                requestOptions,
            )
    }
}
