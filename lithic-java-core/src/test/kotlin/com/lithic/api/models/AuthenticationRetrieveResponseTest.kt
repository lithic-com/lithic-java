// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthenticationRetrieveResponseTest {

    @Test
    fun createAuthenticationRetrieveResponse() {
        val authenticationRetrieveResponse =
            AuthenticationRetrieveResponse.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountType(AuthenticationRetrieveResponse.AccountType.CREDIT)
                .authenticationResult(AuthenticationRetrieveResponse.AuthenticationResult.DECLINE)
                .cardExpiryCheck(AuthenticationRetrieveResponse.CardExpiryCheck.MATCH)
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardholder(
                    AuthenticationRetrieveResponse.Cardholder.builder()
                        .addressMatch(true)
                        .billingAddress(
                            AuthenticationRetrieveResponse.Cardholder.ThreeDSAddress.builder()
                                .address1("address1")
                                .address2("address2")
                                .address3("address3")
                                .city("city")
                                .country("xxx")
                                .postalCode("postal_code")
                                .build()
                        )
                        .email("x")
                        .name("x")
                        .phoneNumberHome("x")
                        .phoneNumberMobile("x")
                        .phoneNumberWork("x")
                        .shippingAddress(
                            AuthenticationRetrieveResponse.Cardholder.ThreeDSAddress.builder()
                                .address1("address1")
                                .address2("address2")
                                .address3("address3")
                                .city("city")
                                .country("xxx")
                                .postalCode("postal_code")
                                .build()
                        )
                        .build()
                )
                .channel(AuthenticationRetrieveResponse.Channel.APP_BASED)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .merchant(
                    AuthenticationRetrieveResponse.Merchant.builder()
                        .id("id")
                        .country("xxx")
                        .mcc("xxxx")
                        .name("name")
                        .riskIndicator(
                            AuthenticationRetrieveResponse.Merchant.RiskIndicator.builder()
                                .deliveryEmailAddress("delivery_email_address")
                                .deliveryTimeFrame(
                                    AuthenticationRetrieveResponse.Merchant.RiskIndicator
                                        .DeliveryTimeFrame
                                        .ELECTRONIC_DELIVERY
                                )
                                .giftCardAmount(0L)
                                .giftCardCount(0L)
                                .giftCardCurrency("xxx")
                                .orderAvailability(
                                    AuthenticationRetrieveResponse.Merchant.RiskIndicator
                                        .OrderAvailability
                                        .FUTURE_AVAILABILITY
                                )
                                .preOrderAvailableDate(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .reorderItems(
                                    AuthenticationRetrieveResponse.Merchant.RiskIndicator
                                        .ReorderItems
                                        .FIRST_TIME_ORDERED
                                )
                                .shippingMethod(
                                    AuthenticationRetrieveResponse.Merchant.RiskIndicator
                                        .ShippingMethod
                                        .DIGITAL_GOODS
                                )
                                .build()
                        )
                        .build()
                )
                .messageCategory(
                    AuthenticationRetrieveResponse.MessageCategory.NON_PAYMENT_AUTHENTICATION
                )
                .threeDSRequestorChallengeIndicator(
                    AuthenticationRetrieveResponse.ThreeDSRequestorChallengeIndicator.NO_PREFERENCE
                )
                .additionalData(
                    AuthenticationRetrieveResponse.AdditionalData.builder()
                        .networkDecision(
                            AuthenticationRetrieveResponse.AdditionalData.NetworkDecision.LOW_RISK
                        )
                        .networkRiskScore(0L)
                        .build()
                )
                .app(
                    AuthenticationRetrieveResponse.App.builder()
                        .deviceInfo("device_info")
                        .ip("ip")
                        .build()
                )
                .authenticationRequestType(
                    AuthenticationRetrieveResponse.AuthenticationRequestType.ADD_CARD
                )
                .browser(
                    AuthenticationRetrieveResponse.Browser.builder()
                        .ip("ip")
                        .javaEnabled(true)
                        .javascriptEnabled(true)
                        .language("language")
                        .timeZone("time_zone")
                        .userAgent("user_agent")
                        .build()
                )
                .challengeMetadata(
                    AuthenticationRetrieveResponse.ChallengeMetadata.builder()
                        .methodType(
                            AuthenticationRetrieveResponse.ChallengeMetadata.MethodType.SMS_OTP
                        )
                        .phoneNumber("phone_number")
                        .build()
                )
                .challengeOrchestratedBy(
                    AuthenticationRetrieveResponse.ChallengeOrchestratedBy.LITHIC
                )
                .decisionMadeBy(AuthenticationRetrieveResponse.DecisionMadeBy.CUSTOMER_ENDPOINT)
                .threeRiRequestType(
                    AuthenticationRetrieveResponse.ThreeRiRequestType.ACCOUNT_VERIFICATION
                )
                .transaction(
                    AuthenticationRetrieveResponse.Transaction.builder()
                        .amount(0.0)
                        .currency("xxx")
                        .currencyExponent(0.0)
                        .dateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(AuthenticationRetrieveResponse.Transaction.Type.ACCOUNT_FUNDING)
                        .build()
                )
                .build()
        assertThat(authenticationRetrieveResponse).isNotNull
        assertThat(authenticationRetrieveResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(authenticationRetrieveResponse.accountType())
            .contains(AuthenticationRetrieveResponse.AccountType.CREDIT)
        assertThat(authenticationRetrieveResponse.authenticationResult())
            .isEqualTo(AuthenticationRetrieveResponse.AuthenticationResult.DECLINE)
        assertThat(authenticationRetrieveResponse.cardExpiryCheck())
            .isEqualTo(AuthenticationRetrieveResponse.CardExpiryCheck.MATCH)
        assertThat(authenticationRetrieveResponse.cardToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(authenticationRetrieveResponse.cardholder())
            .isEqualTo(
                AuthenticationRetrieveResponse.Cardholder.builder()
                    .addressMatch(true)
                    .billingAddress(
                        AuthenticationRetrieveResponse.Cardholder.ThreeDSAddress.builder()
                            .address1("address1")
                            .address2("address2")
                            .address3("address3")
                            .city("city")
                            .country("xxx")
                            .postalCode("postal_code")
                            .build()
                    )
                    .email("x")
                    .name("x")
                    .phoneNumberHome("x")
                    .phoneNumberMobile("x")
                    .phoneNumberWork("x")
                    .shippingAddress(
                        AuthenticationRetrieveResponse.Cardholder.ThreeDSAddress.builder()
                            .address1("address1")
                            .address2("address2")
                            .address3("address3")
                            .city("city")
                            .country("xxx")
                            .postalCode("postal_code")
                            .build()
                    )
                    .build()
            )
        assertThat(authenticationRetrieveResponse.channel())
            .isEqualTo(AuthenticationRetrieveResponse.Channel.APP_BASED)
        assertThat(authenticationRetrieveResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(authenticationRetrieveResponse.merchant())
            .isEqualTo(
                AuthenticationRetrieveResponse.Merchant.builder()
                    .id("id")
                    .country("xxx")
                    .mcc("xxxx")
                    .name("name")
                    .riskIndicator(
                        AuthenticationRetrieveResponse.Merchant.RiskIndicator.builder()
                            .deliveryEmailAddress("delivery_email_address")
                            .deliveryTimeFrame(
                                AuthenticationRetrieveResponse.Merchant.RiskIndicator
                                    .DeliveryTimeFrame
                                    .ELECTRONIC_DELIVERY
                            )
                            .giftCardAmount(0L)
                            .giftCardCount(0L)
                            .giftCardCurrency("xxx")
                            .orderAvailability(
                                AuthenticationRetrieveResponse.Merchant.RiskIndicator
                                    .OrderAvailability
                                    .FUTURE_AVAILABILITY
                            )
                            .preOrderAvailableDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .reorderItems(
                                AuthenticationRetrieveResponse.Merchant.RiskIndicator.ReorderItems
                                    .FIRST_TIME_ORDERED
                            )
                            .shippingMethod(
                                AuthenticationRetrieveResponse.Merchant.RiskIndicator.ShippingMethod
                                    .DIGITAL_GOODS
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(authenticationRetrieveResponse.messageCategory())
            .isEqualTo(AuthenticationRetrieveResponse.MessageCategory.NON_PAYMENT_AUTHENTICATION)
        assertThat(authenticationRetrieveResponse.threeDSRequestorChallengeIndicator())
            .isEqualTo(
                AuthenticationRetrieveResponse.ThreeDSRequestorChallengeIndicator.NO_PREFERENCE
            )
        assertThat(authenticationRetrieveResponse.additionalData())
            .contains(
                AuthenticationRetrieveResponse.AdditionalData.builder()
                    .networkDecision(
                        AuthenticationRetrieveResponse.AdditionalData.NetworkDecision.LOW_RISK
                    )
                    .networkRiskScore(0L)
                    .build()
            )
        assertThat(authenticationRetrieveResponse.app())
            .contains(
                AuthenticationRetrieveResponse.App.builder()
                    .deviceInfo("device_info")
                    .ip("ip")
                    .build()
            )
        assertThat(authenticationRetrieveResponse.authenticationRequestType())
            .contains(AuthenticationRetrieveResponse.AuthenticationRequestType.ADD_CARD)
        assertThat(authenticationRetrieveResponse.browser())
            .contains(
                AuthenticationRetrieveResponse.Browser.builder()
                    .ip("ip")
                    .javaEnabled(true)
                    .javascriptEnabled(true)
                    .language("language")
                    .timeZone("time_zone")
                    .userAgent("user_agent")
                    .build()
            )
        assertThat(authenticationRetrieveResponse.challengeMetadata())
            .contains(
                AuthenticationRetrieveResponse.ChallengeMetadata.builder()
                    .methodType(AuthenticationRetrieveResponse.ChallengeMetadata.MethodType.SMS_OTP)
                    .phoneNumber("phone_number")
                    .build()
            )
        assertThat(authenticationRetrieveResponse.challengeOrchestratedBy())
            .contains(AuthenticationRetrieveResponse.ChallengeOrchestratedBy.LITHIC)
        assertThat(authenticationRetrieveResponse.decisionMadeBy())
            .contains(AuthenticationRetrieveResponse.DecisionMadeBy.CUSTOMER_ENDPOINT)
        assertThat(authenticationRetrieveResponse.threeRiRequestType())
            .contains(AuthenticationRetrieveResponse.ThreeRiRequestType.ACCOUNT_VERIFICATION)
        assertThat(authenticationRetrieveResponse.transaction())
            .contains(
                AuthenticationRetrieveResponse.Transaction.builder()
                    .amount(0.0)
                    .currency("xxx")
                    .currencyExponent(0.0)
                    .dateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(AuthenticationRetrieveResponse.Transaction.Type.ACCOUNT_FUNDING)
                    .build()
            )
    }
}
