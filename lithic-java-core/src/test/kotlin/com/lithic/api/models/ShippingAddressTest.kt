package com.lithic.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.ShippingAddress

class ShippingAddressTest {

    @Test
    fun createShippingAddress() {
      val shippingAddress = ShippingAddress.builder()
          .firstName("Michael")
          .lastName("Bluth")
          .line2Text("The Bluth Company")
          .address1("5 Broad Street")
          .address2("Unit 25A")
          .city("NEW YORK")
          .state("NY")
          .postalCode("10001-1809")
          .country("USA")
          .email("johnny@appleseed.com")
          .phoneNumber("+12124007676")
          .build()
      assertThat(shippingAddress).isNotNull
      assertThat(shippingAddress.firstName()).isEqualTo("Michael")
      assertThat(shippingAddress.lastName()).isEqualTo("Bluth")
      assertThat(shippingAddress.line2Text()).contains("The Bluth Company")
      assertThat(shippingAddress.address1()).isEqualTo("5 Broad Street")
      assertThat(shippingAddress.address2()).contains("Unit 25A")
      assertThat(shippingAddress.city()).isEqualTo("NEW YORK")
      assertThat(shippingAddress.state()).isEqualTo("NY")
      assertThat(shippingAddress.postalCode()).isEqualTo("10001-1809")
      assertThat(shippingAddress.country()).isEqualTo("USA")
      assertThat(shippingAddress.email()).contains("johnny@appleseed.com")
      assertThat(shippingAddress.phoneNumber()).contains("+12124007676")
    }
}
