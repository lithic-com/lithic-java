package com.lithic.api.models

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.lithic.api.models.Address

class AddressTest {

    @Test
    fun createAddress() {
      val address = Address.builder()
          .address1("123 Old Forest Way")
          .address2("string")
          .city("Omaha")
          .country("USA")
          .postalCode("68022")
          .state("NE")
          .build()
      assertThat(address).isNotNull
      assertThat(address.address1()).isEqualTo("123 Old Forest Way")
      assertThat(address.address2()).contains("string")
      assertThat(address.city()).isEqualTo("Omaha")
      assertThat(address.country()).isEqualTo("USA")
      assertThat(address.postalCode()).isEqualTo("68022")
      assertThat(address.state()).isEqualTo("NE")
    }
}
