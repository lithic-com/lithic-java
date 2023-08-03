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
                .accountType(AuthenticationRetrieveResponse.AccountType.NOT_APPLICABLE)
                .additionalData(
                    AuthenticationRetrieveResponse.AdditionalData.builder()
                        .networkDecision(
                            AuthenticationRetrieveResponse.AdditionalData.NetworkDecision.LOW_RISK
                        )
                        .networkRiskScore(42.23)
                        .build()
                )
                .authenticationResult(AuthenticationRetrieveResponse.AuthenticationResult.SUCCESS)
                .cardExpiryCheck(AuthenticationRetrieveResponse.CardExpiryCheck.MATCH)
                .cardToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cardholder(
                    AuthenticationRetrieveResponse.Cardholder.builder()
                        .addressMatch(true)
                        .billingAddress(
                            AuthenticationRetrieveResponse.Cardholder.ThreeDSAddress.builder()
                                .address1("string")
                                .address2("string")
                                .address3("string")
                                .city("string")
                                .country("xxx")
                                .postalCode("string")
                                .build()
                        )
                        .email("x")
                        .name("x")
                        .phoneNumberHome("x")
                        .phoneNumberMobile("x")
                        .phoneNumberWork("x")
                        .shippingAddress(
                            AuthenticationRetrieveResponse.Cardholder.ThreeDSAddress.builder()
                                .address1("string")
                                .address2("string")
                                .address3("string")
                                .city("string")
                                .country("xxx")
                                .postalCode("string")
                                .build()
                        )
                        .build()
                )
                .channel(AuthenticationRetrieveResponse.Channel.APP_BASED)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .decisionMadeBy(AuthenticationRetrieveResponse.DecisionMadeBy.LITHIC_DEFAULT)
                .merchant(
                    AuthenticationRetrieveResponse.Merchant.builder()
                        .id("string")
                        .country("xxx")
                        .mcc("xxxx")
                        .name("string")
                        .riskIndicator(
                            AuthenticationRetrieveResponse.Merchant.RiskIndicator.builder()
                                .deliveryEmailAddress("string")
                                .deliveryTimeFrame(
                                    AuthenticationRetrieveResponse.Merchant.RiskIndicator
                                        .DeliveryTimeFrame
                                        .ELECTRONIC_DELIVERY
                                )
                                .giftCardAmount(42.23)
                                .giftCardCount(42.23)
                                .giftCardCurrency("xxx")
                                .orderAvailability(
                                    AuthenticationRetrieveResponse.Merchant.RiskIndicator
                                        .OrderAvailability
                                        .MERCHANDISE_AVAILABLE
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
                                        .SHIP_TO_BILLING_ADDRESS
                                )
                                .build()
                        )
                        .build()
                )
                .transaction(
                    AuthenticationRetrieveResponse.Transaction.builder()
                        .amount(42.23)
                        .currency("xxx")
                        .currencyExponent(42.23)
                        .dateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(
                            AuthenticationRetrieveResponse.Transaction.Type.GOODS_SERVICE_PURCHASE
                        )
                        .build()
                )
                .app(
                    AuthenticationRetrieveResponse.App.builder()
                        .deviceInfo("string")
                        .ip("string")
                        .build()
                )
                .authenticationRequestType(
                    AuthenticationRetrieveResponse.AuthenticationRequestType.PAYMENT_TRANSACTION
                )
                .browser(
                    AuthenticationRetrieveResponse.Browser.builder()
                        .ip("string")
                        .javaEnabled(true)
                        .javascriptEnabled(true)
                        .language("string")
                        .timeZone("string")
                        .userAgent("string")
                        .build()
                )
                .threeRiRequestType(
                    AuthenticationRetrieveResponse.ThreeRiRequestType.RECURRING_TRANSACTION
                )
                .build()
        assertThat(authenticationRetrieveResponse).isNotNull
        assertThat(authenticationRetrieveResponse.token())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(authenticationRetrieveResponse.accountType())
            .contains(AuthenticationRetrieveResponse.AccountType.NOT_APPLICABLE)
        assertThat(authenticationRetrieveResponse.additionalData())
            .isEqualTo(
                AuthenticationRetrieveResponse.AdditionalData.builder()
                    .networkDecision(
                        AuthenticationRetrieveResponse.AdditionalData.NetworkDecision.LOW_RISK
                    )
                    .networkRiskScore(42.23)
                    .build()
            )
        assertThat(authenticationRetrieveResponse.authenticationResult())
            .contains(AuthenticationRetrieveResponse.AuthenticationResult.SUCCESS)
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
                            .address1("string")
                            .address2("string")
                            .address3("string")
                            .city("string")
                            .country("xxx")
                            .postalCode("string")
                            .build()
                    )
                    .email("x")
                    .name("x")
                    .phoneNumberHome("x")
                    .phoneNumberMobile("x")
                    .phoneNumberWork("x")
                    .shippingAddress(
                        AuthenticationRetrieveResponse.Cardholder.ThreeDSAddress.builder()
                            .address1("string")
                            .address2("string")
                            .address3("string")
                            .city("string")
                            .country("xxx")
                            .postalCode("string")
                            .build()
                    )
                    .build()
            )
        assertThat(authenticationRetrieveResponse.channel())
            .isEqualTo(AuthenticationRetrieveResponse.Channel.APP_BASED)
        assertThat(authenticationRetrieveResponse.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(authenticationRetrieveResponse.decisionMadeBy())
            .contains(AuthenticationRetrieveResponse.DecisionMadeBy.LITHIC_DEFAULT)
        assertThat(authenticationRetrieveResponse.merchant())
            .isEqualTo(
                AuthenticationRetrieveResponse.Merchant.builder()
                    .id("string")
                    .country("xxx")
                    .mcc("xxxx")
                    .name("string")
                    .riskIndicator(
                        AuthenticationRetrieveResponse.Merchant.RiskIndicator.builder()
                            .deliveryEmailAddress("string")
                            .deliveryTimeFrame(
                                AuthenticationRetrieveResponse.Merchant.RiskIndicator
                                    .DeliveryTimeFrame
                                    .ELECTRONIC_DELIVERY
                            )
                            .giftCardAmount(42.23)
                            .giftCardCount(42.23)
                            .giftCardCurrency("xxx")
                            .orderAvailability(
                                AuthenticationRetrieveResponse.Merchant.RiskIndicator
                                    .OrderAvailability
                                    .MERCHANDISE_AVAILABLE
                            )
                            .preOrderAvailableDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .reorderItems(
                                AuthenticationRetrieveResponse.Merchant.RiskIndicator.ReorderItems
                                    .FIRST_TIME_ORDERED
                            )
                            .shippingMethod(
                                AuthenticationRetrieveResponse.Merchant.RiskIndicator.ShippingMethod
                                    .SHIP_TO_BILLING_ADDRESS
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(authenticationRetrieveResponse.transaction())
            .isEqualTo(
                AuthenticationRetrieveResponse.Transaction.builder()
                    .amount(42.23)
                    .currency("xxx")
                    .currencyExponent(42.23)
                    .dateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(AuthenticationRetrieveResponse.Transaction.Type.GOODS_SERVICE_PURCHASE)
                    .build()
            )
        assertThat(authenticationRetrieveResponse.app())
            .contains(
                AuthenticationRetrieveResponse.App.builder()
                    .deviceInfo("string")
                    .ip("string")
                    .build()
            )
        assertThat(authenticationRetrieveResponse.authenticationRequestType())
            .contains(AuthenticationRetrieveResponse.AuthenticationRequestType.PAYMENT_TRANSACTION)
        assertThat(authenticationRetrieveResponse.browser())
            .contains(
                AuthenticationRetrieveResponse.Browser.builder()
                    .ip("string")
                    .javaEnabled(true)
                    .javascriptEnabled(true)
                    .language("string")
                    .timeZone("string")
                    .userAgent("string")
                    .build()
            )
        assertThat(authenticationRetrieveResponse.threeRiRequestType())
            .contains(AuthenticationRetrieveResponse.ThreeRiRequestType.RECURRING_TRANSACTION)
    }
}