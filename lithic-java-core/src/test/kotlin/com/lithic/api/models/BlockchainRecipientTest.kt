// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lithic.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BlockchainRecipientTest {

    @Test
    fun create() {
        val blockchainRecipient =
            BlockchainRecipient.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addressTag("address_tag")
                .chain("chain")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .name("name")
                .owner("owner")
                .ownerType(OwnerType.INDIVIDUAL)
                .programId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .state(BlockchainRecipient.State.ENABLED)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .verificationState(BlockchainRecipient.VerificationState.PENDING)
                .build()

        assertThat(blockchainRecipient.token()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(blockchainRecipient.accountToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(blockchainRecipient.addressTag()).contains("address_tag")
        assertThat(blockchainRecipient.chain()).isEqualTo("chain")
        assertThat(blockchainRecipient.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(blockchainRecipient.externalId()).contains("external_id")
        assertThat(blockchainRecipient.name()).contains("name")
        assertThat(blockchainRecipient.owner()).isEqualTo("owner")
        assertThat(blockchainRecipient.ownerType()).isEqualTo(OwnerType.INDIVIDUAL)
        assertThat(blockchainRecipient.programId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(blockchainRecipient.state()).isEqualTo(BlockchainRecipient.State.ENABLED)
        assertThat(blockchainRecipient.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(blockchainRecipient.verificationState())
            .isEqualTo(BlockchainRecipient.VerificationState.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val blockchainRecipient =
            BlockchainRecipient.builder()
                .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addressTag("address_tag")
                .chain("chain")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .name("name")
                .owner("owner")
                .ownerType(OwnerType.INDIVIDUAL)
                .programId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .state(BlockchainRecipient.State.ENABLED)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .verificationState(BlockchainRecipient.VerificationState.PENDING)
                .build()

        val roundtrippedBlockchainRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blockchainRecipient),
                jacksonTypeRef<BlockchainRecipient>(),
            )

        assertThat(roundtrippedBlockchainRecipient).isEqualTo(blockchainRecipient)
    }
}
