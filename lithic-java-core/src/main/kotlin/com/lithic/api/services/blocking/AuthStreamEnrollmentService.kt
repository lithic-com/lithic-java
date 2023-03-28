@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.AuthStreamEnrollment
import com.lithic.api.models.AuthStreamEnrollmentDisenrollParams
import com.lithic.api.models.AuthStreamEnrollmentEnrollParams
import com.lithic.api.models.AuthStreamEnrollmentRetrieveParams
import com.lithic.api.models.AuthStreamEnrollmentRetrieveSecretParams
import com.lithic.api.models.AuthStreamEnrollmentRotateSecretParams
import com.lithic.api.models.AuthStreamSecret

interface AuthStreamEnrollmentService {

    /**
     * Check status for whether you have enrolled in Authorization Stream Access (ASA) for your
     * program in Sandbox.
     */
    @JvmOverloads
    fun retrieve(
        params: AuthStreamEnrollmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthStreamEnrollment

    /** Disenroll Authorization Stream Access (ASA) in Sandbox. */
    @JvmOverloads
    fun disenroll(
        params: AuthStreamEnrollmentDisenrollParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    /**
     * Authorization Stream Access (ASA) provides the ability to make custom transaction approval
     * decisions through an HTTP interface to the ISO 8583 message stream.
     *
     * ASA requests are delivered as an HTTP POST during authorization. The ASA request body adheres
     * to the Lithic transaction schema, with some additional fields added for use in decisioning. A
     * response should be sent with HTTP response code 200 and the approval decision in the response
     * body. This response is converted by Lithic back into ISO 8583 format and forwarded to the
     * network.
     *
     * In Sandbox, users can self-enroll and disenroll in ASA. In production, onboarding requires
     * manual approval and setup.
     */
    @JvmOverloads
    fun enroll(
        params: AuthStreamEnrollmentEnrollParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    /**
     * Retrieve the ASA HMAC secret key. If one does not exist your program yet, calling this
     * endpoint will create one for you. The headers (which you can use to verify webhooks) will
     * begin appearing shortly after calling this endpoint for the first time. See
     * [this page](https://docs.lithic.com/docs/auth-stream-access-asa#asa-webhook-verification) for
     * more detail about verifying ASA webhooks.
     */
    @JvmOverloads
    fun retrieveSecret(
        params: AuthStreamEnrollmentRetrieveSecretParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthStreamSecret

    /**
     * Generate a new ASA HMAC secret key. The old ASA HMAC secret key will be deactivated 24 hours
     * after a successful request to this endpoint. Make a
     * [`GET /auth_stream/secret`](https://docs.lithic.com/reference/getauthstreamsecret) request to
     * retrieve the new secret key.
     */
    @JvmOverloads
    fun rotateSecret(
        params: AuthStreamEnrollmentRotateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
