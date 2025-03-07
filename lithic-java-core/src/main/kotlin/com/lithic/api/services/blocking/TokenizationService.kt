// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.TokenizationActivateParams
import com.lithic.api.models.TokenizationDeactivateParams
import com.lithic.api.models.TokenizationListPage
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

interface TokenizationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get tokenization */
    fun retrieve(params: TokenizationRetrieveParams): TokenizationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TokenizationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenizationRetrieveResponse

    /** List card tokenizations */
    fun list(): TokenizationListPage = list(TokenizationListParams.none())

    /** @see [list] */
    fun list(
        params: TokenizationListParams = TokenizationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenizationListPage

    /** @see [list] */
    fun list(params: TokenizationListParams = TokenizationListParams.none()): TokenizationListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): TokenizationListPage =
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
    fun activate(params: TokenizationActivateParams) = activate(params, RequestOptions.none())

    /** @see [activate] */
    fun activate(
        params: TokenizationActivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

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
    fun deactivate(params: TokenizationDeactivateParams) = deactivate(params, RequestOptions.none())

    /** @see [deactivate] */
    fun deactivate(
        params: TokenizationDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * This endpoint is used to ask the card network to pause a tokenization. A successful response
     * indicates that the request was successfully delivered to the card network. When the card
     * network pauses the tokenization, the state will be updated and a tokenization.updated event
     * will be sent. The endpoint may only be used on tokenizations with status `ACTIVE`. A paused
     * token will prevent merchants from sending authorizations, and is a temporary status that can
     * be changed. Reach out at [lithic.com/contact](https://lithic.com/contact) for more
     * information.
     */
    fun pause(params: TokenizationPauseParams) = pause(params, RequestOptions.none())

    /** @see [pause] */
    fun pause(
        params: TokenizationPauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

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
    fun resendActivationCode(params: TokenizationResendActivationCodeParams) =
        resendActivationCode(params, RequestOptions.none())

    /** @see [resendActivationCode] */
    fun resendActivationCode(
        params: TokenizationResendActivationCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * This endpoint is used to simulate a card's tokenization in the Digital Wallet and merchant
     * tokenization ecosystem.
     */
    fun simulate(params: TokenizationSimulateParams): TokenizationSimulateResponse =
        simulate(params, RequestOptions.none())

    /** @see [simulate] */
    fun simulate(
        params: TokenizationSimulateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenizationSimulateResponse

    /**
     * This endpoint is used to ask the card network to unpause a tokenization. A successful
     * response indicates that the request was successfully delivered to the card network. When the
     * card network unpauses the tokenization, the state will be updated and a tokenization.updated
     * event will be sent. The endpoint may only be used on tokenizations with status `PAUSED`. This
     * will put the tokenization in an active state, and transactions may resume. Reach out at
     * [lithic.com/contact](https://lithic.com/contact) for more information.
     */
    fun unpause(params: TokenizationUnpauseParams) = unpause(params, RequestOptions.none())

    /** @see [unpause] */
    fun unpause(
        params: TokenizationUnpauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

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
        params: TokenizationUpdateDigitalCardArtParams
    ): TokenizationUpdateDigitalCardArtResponse =
        updateDigitalCardArt(params, RequestOptions.none())

    /** @see [updateDigitalCardArt] */
    fun updateDigitalCardArt(
        params: TokenizationUpdateDigitalCardArtParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenizationUpdateDigitalCardArtResponse

    /**
     * A view of [TokenizationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/tokenizations/{tokenization_token}`, but is
         * otherwise the same as [TokenizationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: TokenizationRetrieveParams
        ): HttpResponseFor<TokenizationRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TokenizationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenizationRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /v1/tokenizations`, but is otherwise the same as
         * [TokenizationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TokenizationListPage> = list(TokenizationListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TokenizationListParams = TokenizationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenizationListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TokenizationListParams = TokenizationListParams.none()
        ): HttpResponseFor<TokenizationListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TokenizationListPage> =
            list(TokenizationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/tokenizations/{tokenization_token}/activate`,
         * but is otherwise the same as [TokenizationService.activate].
         */
        @MustBeClosed
        fun activate(params: TokenizationActivateParams): HttpResponse =
            activate(params, RequestOptions.none())

        /** @see [activate] */
        @MustBeClosed
        fun activate(
            params: TokenizationActivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /v1/tokenizations/{tokenization_token}/deactivate`,
         * but is otherwise the same as [TokenizationService.deactivate].
         */
        @MustBeClosed
        fun deactivate(params: TokenizationDeactivateParams): HttpResponse =
            deactivate(params, RequestOptions.none())

        /** @see [deactivate] */
        @MustBeClosed
        fun deactivate(
            params: TokenizationDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /v1/tokenizations/{tokenization_token}/pause`, but
         * is otherwise the same as [TokenizationService.pause].
         */
        @MustBeClosed
        fun pause(params: TokenizationPauseParams): HttpResponse =
            pause(params, RequestOptions.none())

        /** @see [pause] */
        @MustBeClosed
        fun pause(
            params: TokenizationPauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/tokenizations/{tokenization_token}/resend_activation_code`, but is otherwise the same
         * as [TokenizationService.resendActivationCode].
         */
        @MustBeClosed
        fun resendActivationCode(params: TokenizationResendActivationCodeParams): HttpResponse =
            resendActivationCode(params, RequestOptions.none())

        /** @see [resendActivationCode] */
        @MustBeClosed
        fun resendActivationCode(
            params: TokenizationResendActivationCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /v1/simulate/tokenizations`, but is otherwise the
         * same as [TokenizationService.simulate].
         */
        @MustBeClosed
        fun simulate(
            params: TokenizationSimulateParams
        ): HttpResponseFor<TokenizationSimulateResponse> = simulate(params, RequestOptions.none())

        /** @see [simulate] */
        @MustBeClosed
        fun simulate(
            params: TokenizationSimulateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenizationSimulateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/tokenizations/{tokenization_token}/unpause`,
         * but is otherwise the same as [TokenizationService.unpause].
         */
        @MustBeClosed
        fun unpause(params: TokenizationUnpauseParams): HttpResponse =
            unpause(params, RequestOptions.none())

        /** @see [unpause] */
        @MustBeClosed
        fun unpause(
            params: TokenizationUnpauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/tokenizations/{tokenization_token}/update_digital_card_art`, but is otherwise the
         * same as [TokenizationService.updateDigitalCardArt].
         */
        @MustBeClosed
        fun updateDigitalCardArt(
            params: TokenizationUpdateDigitalCardArtParams
        ): HttpResponseFor<TokenizationUpdateDigitalCardArtResponse> =
            updateDigitalCardArt(params, RequestOptions.none())

        /** @see [updateDigitalCardArt] */
        @MustBeClosed
        fun updateDigitalCardArt(
            params: TokenizationUpdateDigitalCardArtParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenizationUpdateDigitalCardArtResponse>
    }
}
