// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnhancedDataTest {

    @Test
    fun create() {
        val enhancedData =
            EnhancedData.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .common(
                    EnhancedData.CommonData.builder()
                        .addLineItem(
                            EnhancedData.CommonData.LineItem.builder()
                                .amount("amount")
                                .description("description")
                                .productCode("product_code")
                                .quantity("quantity")
                                .build()
                        )
                        .tax(
                            EnhancedData.CommonData.TaxData.builder()
                                .amount(0L)
                                .exempt(
                                    EnhancedData.CommonData.TaxData.TaxExemptIndicator.TAX_INCLUDED
                                )
                                .merchantTaxId("merchant_tax_id")
                                .build()
                        )
                        .customerReferenceNumber("customer_reference_number")
                        .merchantReferenceNumber("merchant_reference_number")
                        .orderDate(LocalDate.parse("2019-12-27"))
                        .build()
                )
                .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addFleet(
                    EnhancedData.Fleet.builder()
                        .amountTotals(
                            EnhancedData.Fleet.AmountTotals.builder()
                                .discount(0L)
                                .grossSale(0L)
                                .netSale(0L)
                                .build()
                        )
                        .fuel(
                            EnhancedData.Fleet.FuelData.builder()
                                .quantity("quantity")
                                .type(EnhancedData.Fleet.FuelData.FuelType.UNKNOWN)
                                .unitOfMeasure(
                                    EnhancedData.Fleet.FuelData.FuelUnitOfMeasure.GALLONS
                                )
                                .unitPrice(0L)
                                .build()
                        )
                        .driverNumber("driver_number")
                        .odometer(0L)
                        .serviceType(EnhancedData.Fleet.ServiceType.UNKNOWN)
                        .vehicleNumber("vehicle_number")
                        .build()
                )
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(enhancedData.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(enhancedData.common())
            .isEqualTo(
                EnhancedData.CommonData.builder()
                    .addLineItem(
                        EnhancedData.CommonData.LineItem.builder()
                            .amount("amount")
                            .description("description")
                            .productCode("product_code")
                            .quantity("quantity")
                            .build()
                    )
                    .tax(
                        EnhancedData.CommonData.TaxData.builder()
                            .amount(0L)
                            .exempt(EnhancedData.CommonData.TaxData.TaxExemptIndicator.TAX_INCLUDED)
                            .merchantTaxId("merchant_tax_id")
                            .build()
                    )
                    .customerReferenceNumber("customer_reference_number")
                    .merchantReferenceNumber("merchant_reference_number")
                    .orderDate(LocalDate.parse("2019-12-27"))
                    .build()
            )
        assertThat(enhancedData.eventToken()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(enhancedData.fleet())
            .containsExactly(
                EnhancedData.Fleet.builder()
                    .amountTotals(
                        EnhancedData.Fleet.AmountTotals.builder()
                            .discount(0L)
                            .grossSale(0L)
                            .netSale(0L)
                            .build()
                    )
                    .fuel(
                        EnhancedData.Fleet.FuelData.builder()
                            .quantity("quantity")
                            .type(EnhancedData.Fleet.FuelData.FuelType.UNKNOWN)
                            .unitOfMeasure(EnhancedData.Fleet.FuelData.FuelUnitOfMeasure.GALLONS)
                            .unitPrice(0L)
                            .build()
                    )
                    .driverNumber("driver_number")
                    .odometer(0L)
                    .serviceType(EnhancedData.Fleet.ServiceType.UNKNOWN)
                    .vehicleNumber("vehicle_number")
                    .build()
            )
        assertThat(enhancedData.transactionToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val enhancedData =
            EnhancedData.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .common(
                    EnhancedData.CommonData.builder()
                        .addLineItem(
                            EnhancedData.CommonData.LineItem.builder()
                                .amount("amount")
                                .description("description")
                                .productCode("product_code")
                                .quantity("quantity")
                                .build()
                        )
                        .tax(
                            EnhancedData.CommonData.TaxData.builder()
                                .amount(0L)
                                .exempt(
                                    EnhancedData.CommonData.TaxData.TaxExemptIndicator.TAX_INCLUDED
                                )
                                .merchantTaxId("merchant_tax_id")
                                .build()
                        )
                        .customerReferenceNumber("customer_reference_number")
                        .merchantReferenceNumber("merchant_reference_number")
                        .orderDate(LocalDate.parse("2019-12-27"))
                        .build()
                )
                .eventToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addFleet(
                    EnhancedData.Fleet.builder()
                        .amountTotals(
                            EnhancedData.Fleet.AmountTotals.builder()
                                .discount(0L)
                                .grossSale(0L)
                                .netSale(0L)
                                .build()
                        )
                        .fuel(
                            EnhancedData.Fleet.FuelData.builder()
                                .quantity("quantity")
                                .type(EnhancedData.Fleet.FuelData.FuelType.UNKNOWN)
                                .unitOfMeasure(
                                    EnhancedData.Fleet.FuelData.FuelUnitOfMeasure.GALLONS
                                )
                                .unitPrice(0L)
                                .build()
                        )
                        .driverNumber("driver_number")
                        .odometer(0L)
                        .serviceType(EnhancedData.Fleet.ServiceType.UNKNOWN)
                        .vehicleNumber("vehicle_number")
                        .build()
                )
                .transactionToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedEnhancedData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enhancedData),
                jacksonTypeRef<EnhancedData>(),
            )

        assertThat(roundtrippedEnhancedData).isEqualTo(enhancedData)
    }
}
