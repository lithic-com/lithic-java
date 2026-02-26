// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountHolderEntityTest {

    @Test
    fun create() {
        val accountHolderEntity =
            AccountHolderEntity.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .address(
                    AccountHolderEntity.Address.builder()
                        .address1("123 Old Forest Way")
                        .city("Omaha")
                        .country("USA")
                        .postalCode("68022")
                        .state("NE")
                        .address2("address2")
                        .build()
                )
                .dob("1991-03-08 08:00:00")
                .email("tom@middle-earth.com")
                .firstName("Tom")
                .lastName("Bombadil")
                .phoneNumber("+15555555555")
                .status(AccountHolderEntity.EntityStatus.ACCEPTED)
                .type(AccountHolderEntity.EntityType.BENEFICIAL_OWNER_INDIVIDUAL)
                .build()

        assertThat(accountHolderEntity.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderEntity.accountHolderToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountHolderEntity.address())
            .isEqualTo(
                AccountHolderEntity.Address.builder()
                    .address1("123 Old Forest Way")
                    .city("Omaha")
                    .country("USA")
                    .postalCode("68022")
                    .state("NE")
                    .address2("address2")
                    .build()
            )
        assertThat(accountHolderEntity.dob()).contains("1991-03-08 08:00:00")
        assertThat(accountHolderEntity.email()).contains("tom@middle-earth.com")
        assertThat(accountHolderEntity.firstName()).contains("Tom")
        assertThat(accountHolderEntity.lastName()).contains("Bombadil")
        assertThat(accountHolderEntity.phoneNumber()).contains("+15555555555")
        assertThat(accountHolderEntity.status())
            .isEqualTo(AccountHolderEntity.EntityStatus.ACCEPTED)
        assertThat(accountHolderEntity.type())
            .isEqualTo(AccountHolderEntity.EntityType.BENEFICIAL_OWNER_INDIVIDUAL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountHolderEntity =
            AccountHolderEntity.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountHolderToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .address(
                    AccountHolderEntity.Address.builder()
                        .address1("123 Old Forest Way")
                        .city("Omaha")
                        .country("USA")
                        .postalCode("68022")
                        .state("NE")
                        .address2("address2")
                        .build()
                )
                .dob("1991-03-08 08:00:00")
                .email("tom@middle-earth.com")
                .firstName("Tom")
                .lastName("Bombadil")
                .phoneNumber("+15555555555")
                .status(AccountHolderEntity.EntityStatus.ACCEPTED)
                .type(AccountHolderEntity.EntityType.BENEFICIAL_OWNER_INDIVIDUAL)
                .build()

        val roundtrippedAccountHolderEntity =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountHolderEntity),
                jacksonTypeRef<AccountHolderEntity>(),
            )

        assertThat(roundtrippedAccountHolderEntity).isEqualTo(accountHolderEntity)
    }
}
