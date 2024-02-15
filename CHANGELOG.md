# Changelog

## 0.0.1 (2024-02-15)

Full Changelog: [...abc-v0.0.1](https://github.com/lithic-com/lithic-java/compare/...abc-v0.0.1)

### ⚠ BREAKING CHANGES

* **api:** change account holder creation response, new settlement detail type ([#145](https://github.com/lithic-com/lithic-java/issues/145))
* **api:** remove `post /webhooks/account_holders` endpoint ([#85](https://github.com/lithic-com/lithic-java/issues/85))
* **api:** change `key` to `secret` ([#57](https://github.com/lithic-com/lithic-java/issues/57))
* **api:** remove previous_auth_rule_tokens from auth rules ([#15](https://github.com/lithic-com/lithic-java/issues/15))
* **api:** remove avs_type property, add dispute evidence filename, and mark properties nullable ([#5](https://github.com/lithic-com/lithic-java/issues/5))
* **api:** replace `transactionToken` param in favour of `transactionTokens`
* the following types have been renamed:
    - Rename `com.lithic.api.models.EventsSubscriptionCreateParams`
          to `com.lithic.api.models.EventSubscriptionCreateParams`
    - Rename `com.lithic.api.models.EventsSubscriptionDeleteParams`
          to `com.lithic.api.models.EventSubscriptionDeleteParams`
    - Rename `com.lithic.api.models.EventsSubscriptionListPageAsync`
          to `com.lithic.api.models.EventSubscriptionListPageAsync`
    - Rename `com.lithic.api.models.EventsSubscriptionListPage`
          to `com.lithic.api.models.EventSubscriptionListPage`
    - Rename `com.lithic.api.models.EventsSubscriptionListParams`
          to `com.lithic.api.models.EventSubscriptionListParams`
    - Rename `com.lithic.api.models.EventsSubscriptionRecoverParams`
          to `com.lithic.api.models.EventSubscriptionRecoverParams`
    - Rename `com.lithic.api.models.EventsSubscriptionReplayMissingParams`
          to `com.lithic.api.models.EventSubscriptionReplayMissingParams`
    - Rename `com.lithic.api.models.EventsSubscriptionRetrieveParams`
          to `com.lithic.api.models.EventSubscriptionRetrieveParams`
    - Rename `com.lithic.api.models.EventsSubscriptionRetrieveSecretParams`
          to `com.lithic.api.models.EventSubscriptionRetrieveSecretParams`
    - Rename `com.lithic.api.models.EventsSubscriptionRotateSecretParams`
          to `com.lithic.api.models.EventSubscriptionRotateSecretParams`
    - Rename `com.lithic.api.models.EventsSubscriptionUpdateParams`
          to `com.lithic.api.models.EventSubscriptionUpdateParams`
    - Rename `com.lithic.api.models.FinancialAccountsBalanceListPageAsync`
          to `com.lithic.api.models.FinancialAccountBalanceListPageAsync`
    - Rename `com.lithic.api.models.FinancialAccountsBalanceListPage`
          to `com.lithic.api.models.FinancialAccountBalanceListPage`
    - Rename `com.lithic.api.models.FinancialAccountsBalanceListParams`
          to `com.lithic.api.models.FinancialAccountBalanceListParams`
    - Rename `com.lithic.api.models.FinancialAccountsFinancialTransactionListPageAsync`
          to `com.lithic.api.models.FinancialTransactionListPageAsync`
    - Rename `com.lithic.api.models.FinancialAccountsFinancialTransactionListPage`
          to `com.lithic.api.models.FinancialTransactionListPage`
    - Rename `com.lithic.api.models.FinancialAccountsFinancialTransactionListParams`
          to `com.lithic.api.models.FinancialTransactionListParams`
    - Rename `com.lithic.api.models.FinancialAccountsFinancialTransactionRetrieveParams`
          to `com.lithic.api.models.FinancialTransactionRetrieveParams`
* **api:** add tokenization decisioning endpoints and remove unused funding sources API
* **api:** add tokenization decisioning endpoints and remove unused funding sources API

### Features

* add async AutoPager implementation ([ed9601a](https://github.com/lithic-com/lithic-java/commit/ed9601aa17e609f1006f4b7aa1a48bd7c3767983))
* add async AutoPager implementation ([ed9601a](https://github.com/lithic-com/lithic-java/commit/ed9601aa17e609f1006f4b7aa1a48bd7c3767983))
* add better error message, internal cleanups ([142f5d8](https://github.com/lithic-com/lithic-java/commit/142f5d8c3a0f74343c206f112e15b6be5d48e4c3))
* add error message details ([4517221](https://github.com/lithic-com/lithic-java/commit/4517221f4c635fa05c570af122d04932b1bdcd8e))
* add example ([5d9d5f7](https://github.com/lithic-com/lithic-java/commit/5d9d5f7530cd00d6e203950f6fd64d43eb182120))
* add example ([5d9d5f7](https://github.com/lithic-com/lithic-java/commit/5d9d5f7530cd00d6e203950f6fd64d43eb182120))
* add JsonValue.convert method ([b144666](https://github.com/lithic-com/lithic-java/commit/b1446663636287da2bab6eebabfa0942c180e6b3))
* add LICENSE file ([ff7afcb](https://github.com/lithic-com/lithic-java/commit/ff7afcb2c108f83a45242161347600b933b14b94))
* add methods to convert between sync and async clients ([a520f2f](https://github.com/lithic-com/lithic-java/commit/a520f2ffbd371d82d10e62192aa2d28adaaef105))
* add new services and misc api updates ([8ae0f5a](https://github.com/lithic-com/lithic-java/commit/8ae0f5a050519adb118f8f2de3651200b42c8292))
* add support for proxies ([914e8d2](https://github.com/lithic-com/lithic-java/commit/914e8d2811cc9bcaeb823c4f2f4124db47c0c835))
* add support for proxies ([914e8d2](https://github.com/lithic-com/lithic-java/commit/914e8d2811cc9bcaeb823c4f2f4124db47c0c835))
* add webhook HMAC verification helper methods ([26320f0](https://github.com/lithic-com/lithic-java/commit/26320f072b35be072acd613384d8908e06878478))
* add webhook HMAC verification helper methods ([26320f0](https://github.com/lithic-com/lithic-java/commit/26320f072b35be072acd613384d8908e06878478))
* allOf models now have toXxx methods to access the separate allOf models ([#55](https://github.com/lithic-com/lithic-java/issues/55)) ([bd13b75](https://github.com/lithic-com/lithic-java/commit/bd13b7574f1bacae7d25c1749e6b80ed3aa9896d))
* **api:** add `account_token` and `card_program_token` to `Card` ([#150](https://github.com/lithic-com/lithic-java/issues/150)) ([985fd9d](https://github.com/lithic-com/lithic-java/commit/985fd9dafb5d3bc27fa2189924cb4a8b6a9499f9))
* **api:** add `get /auth_stream/secret` & `post /auth_stream/secret/rotate` ([5b76d5c](https://github.com/lithic-com/lithic-java/commit/5b76d5ce4fde44fee01a845bbdde8f6c3ceede16))
* **api:** add `get /auth_stream/secret` & `post /auth_stream/secret/rotate` ([5b76d5c](https://github.com/lithic-com/lithic-java/commit/5b76d5ce4fde44fee01a845bbdde8f6c3ceede16))
* **api:** add `get spend_limits` endpoints to `cards` and `accounts` ([#125](https://github.com/lithic-com/lithic-java/issues/125)) ([04694d7](https://github.com/lithic-com/lithic-java/commit/04694d71c37cb4b6af1b54b046e47281407f74a6))
* **api:** add `state` query param for cards ([#19](https://github.com/lithic-com/lithic-java/issues/19)) ([42a3e58](https://github.com/lithic-com/lithic-java/commit/42a3e58f1323ab63f0ced69d29e0b75957b3d7f0))
* **api:** add `with_content` param ([#31](https://github.com/lithic-com/lithic-java/issues/31)) ([fd23dc0](https://github.com/lithic-com/lithic-java/commit/fd23dc04b05b8d63a78cb2d6459e8faaca435a9e))
* **api:** add AUTH_STREAM_ACCESS to responder endpoints ([#105](https://github.com/lithic-com/lithic-java/issues/105)) ([1c5ceda](https://github.com/lithic-com/lithic-java/commit/1c5cedaecf8ce8ce99a3126a6667fb999bff5780))
* **api:** add card reissue shipping options ([#53](https://github.com/lithic-com/lithic-java/issues/53)) ([e5b2c1d](https://github.com/lithic-com/lithic-java/commit/e5b2c1d219284cc499e1a552c2d04205b9c55a02))
* **api:** add card renew endpoint ([#138](https://github.com/lithic-com/lithic-java/issues/138)) ([adea050](https://github.com/lithic-com/lithic-java/commit/adea0509b384087e420be680ab0c4e348cd4f35b))
* **api:** add CardProgram and DigitalCardArt resources ([#109](https://github.com/lithic-com/lithic-java/issues/109)) ([56429f0](https://github.com/lithic-com/lithic-java/commit/56429f0cf051d74607f4253b531446e8246f66a7))
* **api:** add carrier property to card create and reissue params ([#51](https://github.com/lithic-com/lithic-java/issues/51)) ([49865b3](https://github.com/lithic-com/lithic-java/commit/49865b397dce6faacd593dd19fd76e5846a46474))
* **api:** add digital wallet tokenization result event type ([#20](https://github.com/lithic-com/lithic-java/issues/20)) ([0deca73](https://github.com/lithic-com/lithic-java/commit/0deca739e1d69c37c09d5b7bbf62c18d8ba0a7e7))
* **api:** add downloadUrl property to dispute evidence ([d612550](https://github.com/lithic-com/lithic-java/commit/d612550a20015b7da9f2ecf6a448c67de62d057c))
* **api:** add event message attempts ([#28](https://github.com/lithic-com/lithic-java/issues/28)) ([3eab17c](https://github.com/lithic-com/lithic-java/commit/3eab17ceba644a586eeaa4272e600f5b859bf3d1))
* **api:** add event message attempts ([#28](https://github.com/lithic-com/lithic-java/issues/28)) ([e59ab16](https://github.com/lithic-com/lithic-java/commit/e59ab166436bb25b583d094e40ea267d0cbd7119))
* **api:** add mcc (merchant category code) properties ([63d8c9f](https://github.com/lithic-com/lithic-java/commit/63d8c9fbafe83e8cb56cb022239964cfe7ba2ec2))
* **api:** add more enum members to event types ([#22](https://github.com/lithic-com/lithic-java/issues/22)) ([3c3d46f](https://github.com/lithic-com/lithic-java/commit/3c3d46f0d8664ef31a5a330eea953c6be09c6c8a))
* **api:** add payment and external bank accounts resource ([#37](https://github.com/lithic-com/lithic-java/issues/37)) ([ab49de5](https://github.com/lithic-com/lithic-java/commit/ab49de582e24d6d6134f349017fe7392ba1cdfe5))
* **api:** add search_by_pan endpoint ([#146](https://github.com/lithic-com/lithic-java/issues/146)) ([9d71aad](https://github.com/lithic-com/lithic-java/commit/9d71aad7256248427b82c1059477db95db5c91d4))
* **api:** add Simulate Return Payment endpoint ([#77](https://github.com/lithic-com/lithic-java/issues/77)) ([ff57824](https://github.com/lithic-com/lithic-java/commit/ff5782410bef18bf91bb8e8c10d0931be2c0dcff))
* **api:** add simulation endpoints, event types, fix transfer request AuthRule ([#83](https://github.com/lithic-com/lithic-java/issues/83)) ([24429c7](https://github.com/lithic-com/lithic-java/commit/24429c7db53b5318086b1cf19ecca0482335c309))
* **api:** add tokenization decisioning endpoints and remove unused funding sources API ([6242df8](https://github.com/lithic-com/lithic-java/commit/6242df86ae5fbb85a882ac41ecb6e6f88363f041))
* **api:** add tokenization decisioning endpoints and remove unused funding sources API ([6242df8](https://github.com/lithic-com/lithic-java/commit/6242df86ae5fbb85a882ac41ecb6e6f88363f041))
* **api:** add tokenizations.simulate and correct typo'd enum  ([#76](https://github.com/lithic-com/lithic-java/issues/76)) ([eaf3d13](https://github.com/lithic-com/lithic-java/commit/eaf3d1339b224a0b198f720eed1c4619ff7892a6))
* **api:** add user defined id ([#75](https://github.com/lithic-com/lithic-java/issues/75)) ([9398fba](https://github.com/lithic-com/lithic-java/commit/9398fba07979f2bd1c6381a4042921dc1401b6e7))
* **api:** add verification_attempts response property ([#113](https://github.com/lithic-com/lithic-java/issues/113)) ([f2c7c8a](https://github.com/lithic-com/lithic-java/commit/f2c7c8a90c85b939273b7ae5415c931c4195a2d6))
* **api:** add verification_failed_reason ([#103](https://github.com/lithic-com/lithic-java/issues/103)) ([f4763cb](https://github.com/lithic-com/lithic-java/commit/f4763cb2687d61ba20f79b51f8e522ff952b9196))
* **api:** add with_content param, event message attempts, and auto-close responses ([d2c7e81](https://github.com/lithic-com/lithic-java/commit/d2c7e81d35005c4a7f5e67d4c39b42d86dcfb28e))
* **api:** change `key` to `secret` ([#57](https://github.com/lithic-com/lithic-java/issues/57)) ([b50b550](https://github.com/lithic-com/lithic-java/commit/b50b55076ab9d0368fa576c8d95e39960b45b935))
* **api:** change account holder creation response, new settlement detail type ([#145](https://github.com/lithic-com/lithic-java/issues/145)) ([d89ab88](https://github.com/lithic-com/lithic-java/commit/d89ab88b5851050f4ced4664e07ea99b64b6abab))
* **api:** dispute upload custom method ([ead6b82](https://github.com/lithic-com/lithic-java/commit/ead6b82248b1caf635e3a9f1218af2bcce887451))
* **api:** dispute upload custom method ([ead6b82](https://github.com/lithic-com/lithic-java/commit/ead6b82248b1caf635e3a9f1218af2bcce887451))
* **api:** disputes & mark url as a required param in `lithic.events().subscriptions().update()` ([264ddcb](https://github.com/lithic-com/lithic-java/commit/264ddcbaffe8454d2d42efa12bdc4ad921cc20da))
* **api:** enable more of the payments and external bank api ([#49](https://github.com/lithic-com/lithic-java/issues/49)) ([ef8b823](https://github.com/lithic-com/lithic-java/commit/ef8b8239e5c362456451038788af2fd24e5c4c49))
* **api:** more detailed `post /disputes/{dispute_token}/evidences` response ([def4fa4](https://github.com/lithic-com/lithic-java/commit/def4fa41f98f41f15da1b36634b464aac064d134))
* **api:** no longer require `website_url` property on KYB object ([#26](https://github.com/lithic-com/lithic-java/issues/26)) ([8db563f](https://github.com/lithic-com/lithic-java/commit/8db563f695577351e51f1734ab3154afd63878e0))
* **api:** remove /auth_stream enrollment endpoints ([#134](https://github.com/lithic-com/lithic-java/issues/134)) ([4ca2e0b](https://github.com/lithic-com/lithic-java/commit/4ca2e0b2c9ce48eed27746d04b9b6ee756c36431))
* **api:** remove `CLOSED` account enum and update docstrings ([#128](https://github.com/lithic-com/lithic-java/issues/128)) ([be0d415](https://github.com/lithic-com/lithic-java/commit/be0d415cb333213e79749c9bf09872f374ad1ec0))
* **api:** remove avs_type property, add dispute evidence filename, and mark properties nullable ([#5](https://github.com/lithic-com/lithic-java/issues/5)) ([47fd0cf](https://github.com/lithic-com/lithic-java/commit/47fd0cffb99220473aae9a9c3193f9870124c55c))
* **api:** rename `token` and `type` to `financial_account_token` and `financial_account_type` ([#131](https://github.com/lithic-com/lithic-java/issues/131)) ([815c889](https://github.com/lithic-com/lithic-java/commit/815c889afa69e9544e8303dd52e81d43b1cf5071))
* **api:** updates ([a0459e0](https://github.com/lithic-com/lithic-java/commit/a0459e0f1a2c3b0d596966f5b676eac2876173e9))
* **api:** updates ([5e1e7b0](https://github.com/lithic-com/lithic-java/commit/5e1e7b06c6914fb798d21a88a630c4a996dd2a78))
* **api:** updates ([5e1e7b0](https://github.com/lithic-com/lithic-java/commit/5e1e7b06c6914fb798d21a88a630c4a996dd2a78))
* **api:** updates ([63d8c9f](https://github.com/lithic-com/lithic-java/commit/63d8c9fbafe83e8cb56cb022239964cfe7ba2ec2))
* **api:** updates ([839af8d](https://github.com/lithic-com/lithic-java/commit/839af8d631d45671a503c26af6f453913f54dc47))
* **api:** updates ([9178322](https://github.com/lithic-com/lithic-java/commit/917832293f06bcedbacce3a12dd172987bf9a613))
* **api:** updates ([9178322](https://github.com/lithic-com/lithic-java/commit/917832293f06bcedbacce3a12dd172987bf9a613))
* **api:** updates ([edb5573](https://github.com/lithic-com/lithic-java/commit/edb55733f04f5648602a1740d6443d81abd3a975))
* **api:** updates ([#102](https://github.com/lithic-com/lithic-java/issues/102)) ([cc5f1bc](https://github.com/lithic-com/lithic-java/commit/cc5f1bc8d3baab98bc01f610986b2116788c94e6))
* **api:** updates ([#119](https://github.com/lithic-com/lithic-java/issues/119)) ([74c9827](https://github.com/lithic-com/lithic-java/commit/74c9827c7b10a61419a3e3bf35059807e615c5be))
* **api:** updates ([#121](https://github.com/lithic-com/lithic-java/issues/121)) ([3d2b816](https://github.com/lithic-com/lithic-java/commit/3d2b816d0e109f59cefdafd961a5d5806f1d7a8e))
* **api:** updates ([#141](https://github.com/lithic-com/lithic-java/issues/141)) ([69c6b67](https://github.com/lithic-com/lithic-java/commit/69c6b6748b132bf8c54990736c0c57be325c9b22))
* **api:** updates ([#155](https://github.com/lithic-com/lithic-java/issues/155)) ([a10af78](https://github.com/lithic-com/lithic-java/commit/a10af789d87f86b6c0192bbfbab93360d415df1c))
* **api:** updates ([#39](https://github.com/lithic-com/lithic-java/issues/39)) ([1625f99](https://github.com/lithic-com/lithic-java/commit/1625f9948bdb17640c98d4c70e7ccbf83b912a58))
* **api:** updates ([#93](https://github.com/lithic-com/lithic-java/issues/93)) ([28cfec9](https://github.com/lithic-com/lithic-java/commit/28cfec9a85c09bce58921084f0a0b78f0cba1a82))
* authorizations headers are now handled by default headers ([bb926e7](https://github.com/lithic-com/lithic-java/commit/bb926e7c7b9bec71c1c02bcb44957f56e02c5163))
* authorizations headers are now handled by default headers ([bb926e7](https://github.com/lithic-com/lithic-java/commit/bb926e7c7b9bec71c1c02bcb44957f56e02c5163))
* **ci:** add a publish-sonatype workflow for manual running ([#38](https://github.com/lithic-com/lithic-java/issues/38)) ([d9979a3](https://github.com/lithic-com/lithic-java/commit/d9979a3c0a7ea11645a37add75e72a6e11475109))
* **client:** adjust retry behavior ([#106](https://github.com/lithic-com/lithic-java/issues/106)) ([d98f4f6](https://github.com/lithic-com/lithic-java/commit/d98f4f6720cd337e49896bed60b6be1fefadd9a1))
* **client:** allow binary returns ([#114](https://github.com/lithic-com/lithic-java/issues/114)) ([1bea317](https://github.com/lithic-com/lithic-java/commit/1bea317ec037c80097e45685ec66cf6dfa0e290e))
* **client:** retry on 408 Request Timeout ([#80](https://github.com/lithic-com/lithic-java/issues/80)) ([90802a6](https://github.com/lithic-com/lithic-java/commit/90802a6b4136c3b324078f27d086fd00e618bb72))
* configure idempotency header ([71b3525](https://github.com/lithic-com/lithic-java/commit/71b352546600d582200166303caa905906646d3f))
* configure idempotency header ([71b3525](https://github.com/lithic-com/lithic-java/commit/71b352546600d582200166303caa905906646d3f))
* **core:** add `asUnknown` to `JsonField` ([a1105cc](https://github.com/lithic-com/lithic-java/commit/a1105cc774ec2c1d91380bbd79b303aa667b2892))
* default timeout is set for java clients ([#59](https://github.com/lithic-com/lithic-java/issues/59)) ([e9cb63c](https://github.com/lithic-com/lithic-java/commit/e9cb63cd6aef2d9153033983a8c3bce4d1bdb95a))
* **docs:** improve doc comments ([3150f04](https://github.com/lithic-com/lithic-java/commit/3150f04f3befbbca305d1865b8875caee3b41067))
* generate addXxx methods for array types ([#61](https://github.com/lithic-com/lithic-java/issues/61)) ([ae92a46](https://github.com/lithic-com/lithic-java/commit/ae92a462481307947f70bccc75dbd3e61c10c078))
* generate client interfaces and refactor client builder ([69b83cf](https://github.com/lithic-com/lithic-java/commit/69b83cf0d478c0d3347bc8533b0190fdc30331d5))
* **github:** include a devcontainer setup ([#111](https://github.com/lithic-com/lithic-java/issues/111)) ([2fa3348](https://github.com/lithic-com/lithic-java/commit/2fa3348f98582fc809720eb26286f8950da6edb9))
* handle empty success codes ([4716d76](https://github.com/lithic-com/lithic-java/commit/4716d76a6e49f6b22918828c9e737979af6ed957))
* handle empty success codes ([4716d76](https://github.com/lithic-com/lithic-java/commit/4716d76a6e49f6b22918828c9e737979af6ed957))
* implement improved auto-pagination ([1381e98](https://github.com/lithic-com/lithic-java/commit/1381e98084526094ee3f1b87d615db56970aad07))
* implement improved auto-pagination ([1381e98](https://github.com/lithic-com/lithic-java/commit/1381e98084526094ee3f1b87d615db56970aad07))
* improve KYC & KYB names ([d5e6d18](https://github.com/lithic-com/lithic-java/commit/d5e6d18c1b7c140ae4d58618f126e3fb8c84cf25))
* improve union body params ([205e976](https://github.com/lithic-com/lithic-java/commit/205e976c0cf876dfbea4f3cb0369765c8e132d05))
* improve union body params ([205e976](https://github.com/lithic-com/lithic-java/commit/205e976c0cf876dfbea4f3cb0369765c8e132d05))
* make webhook headers case insensitive ([#100](https://github.com/lithic-com/lithic-java/issues/100)) ([8bca517](https://github.com/lithic-com/lithic-java/commit/8bca51795b1ed7f443d6036ae10dffdb45367981))
* **pagination:** improve handling of response types ([812da74](https://github.com/lithic-com/lithic-java/commit/812da74f5d4aba2b17cf5a1218936ea347aa2d08))
* read options from environment and use auth headers ([08c4585](https://github.com/lithic-com/lithic-java/commit/08c4585681471e5bd490cb47860bf173f182fbcf))
* read options from environment and use auth headers ([08c4585](https://github.com/lithic-com/lithic-java/commit/08c4585681471e5bd490cb47860bf173f182fbcf))
* remove idempotency headers ([#149](https://github.com/lithic-com/lithic-java/issues/149)) ([df35070](https://github.com/lithic-com/lithic-java/commit/df3507088122c9fc5dfddaa85d2975031129f854))
* replace when adding query params or headers ([23ecd18](https://github.com/lithic-com/lithic-java/commit/23ecd184b13b76d18a989d44227259dd51228d2c))
* replace when adding query params or headers ([23ecd18](https://github.com/lithic-com/lithic-java/commit/23ecd184b13b76d18a989d44227259dd51228d2c))
* split types file into smaller files based on resources ([019303e](https://github.com/lithic-com/lithic-java/commit/019303ebb659412becf649163519cdc3fd684522))
* support cursor ID pagination ([688dead](https://github.com/lithic-com/lithic-java/commit/688deada600cd522490dd5f529c1da5aade83b50))
* support cursor ID pagination ([688dead](https://github.com/lithic-com/lithic-java/commit/688deada600cd522490dd5f529c1da5aade83b50))
* support global default headers ([71776fe](https://github.com/lithic-com/lithic-java/commit/71776fe4479ba7eb3e76f594814cea016b2d1f80))
* support global default headers ([71776fe](https://github.com/lithic-com/lithic-java/commit/71776fe4479ba7eb3e76f594814cea016b2d1f80))
* support overriding the base URL in tests ([a8e1637](https://github.com/lithic-com/lithic-java/commit/a8e1637c409268682775240be6486645e362de30))
* support overriding the base URL in tests ([a8e1637](https://github.com/lithic-com/lithic-java/commit/a8e1637c409268682775240be6486645e362de30))
* use coroutines for async services ([81b68b0](https://github.com/lithic-com/lithic-java/commit/81b68b0b369a5d693dbc3229736b024edc3c2a7e))
* use coroutines for async services ([81b68b0](https://github.com/lithic-com/lithic-java/commit/81b68b0b369a5d693dbc3229736b024edc3c2a7e))
* use Dokka to generate docs for Javadoc JAR ([efc1820](https://github.com/lithic-com/lithic-java/commit/efc1820cc6481bee8940a30027f7dcdf8ff7d8f4))
* use latest Java LTS to build SDK ([ce77a43](https://github.com/lithic-com/lithic-java/commit/ce77a431610383190a4eda5c279e82014889852c))
* use latest Java LTS to build SDK ([ce77a43](https://github.com/lithic-com/lithic-java/commit/ce77a431610383190a4eda5c279e82014889852c))
* use more specific types for string types with the date, date-time, and uuid formats ([630e9df](https://github.com/lithic-com/lithic-java/commit/630e9df9c00ba13fc6ff470c0a711d44784b963d))
* use more specific types for string types with the date, date-time, and uuid formats ([630e9df](https://github.com/lithic-com/lithic-java/commit/630e9df9c00ba13fc6ff470c0a711d44784b963d))


### Bug Fixes

* add missing properties to AuthRule ([c38dc03](https://github.com/lithic-com/lithic-java/commit/c38dc0351c5e00c1b58a3e85d8a70ee07219e35e))
* adjust typo of 'descisioning' to 'decisioning' ([#41](https://github.com/lithic-com/lithic-java/issues/41)) ([bf42abc](https://github.com/lithic-com/lithic-java/commit/bf42abce3866563d9143f4a628baee6d3b07eafb))
* **api:** correct type for other fees details ([#118](https://github.com/lithic-com/lithic-java/issues/118)) ([d23e0d8](https://github.com/lithic-com/lithic-java/commit/d23e0d808e781f6a5773c07dfc84581b700c02db))
* **api:** set default account holder create timeout to 5 minutes ([462f21e](https://github.com/lithic-com/lithic-java/commit/462f21eff3fd943e41f8cffe98ffb3ac31d36832))
* **api:** set default account holder create timeout to 5 minutes ([9df44cb](https://github.com/lithic-com/lithic-java/commit/9df44cbad9867bda91a89b81e358f055bb51f4d1))
* **api:** set default account holder create timeout to 5 minutes ([9df44cb](https://github.com/lithic-com/lithic-java/commit/9df44cbad9867bda91a89b81e358f055bb51f4d1))
* auto-close responses even if an exception is thrown during deserialization ([#33](https://github.com/lithic-com/lithic-java/issues/33)) ([e2f7088](https://github.com/lithic-com/lithic-java/commit/e2f70883f4197ddbd77f03ec54bc1e50717f1c1f))
* avoid name conflicts in equals ([4467e9f](https://github.com/lithic-com/lithic-java/commit/4467e9ffbe7c8e7fe53fd70c00f60aab449217c0))
* change names of `ThreeDDecision...` to `ThreeDSDecision...` ([#42](https://github.com/lithic-com/lithic-java/issues/42)) ([cc691fd](https://github.com/lithic-com/lithic-java/commit/cc691fd1c18d0c2aa8201eb6e4b2629f8fb84ec0))
* **client:** correctly send array query params ([6fb89c2](https://github.com/lithic-com/lithic-java/commit/6fb89c2f0cefd85fcf5870b1833ef14de3e4adb7))
* **docs:** wrong client import in readme usage example ([#157](https://github.com/lithic-com/lithic-java/issues/157)) ([86cf93c](https://github.com/lithic-com/lithic-java/commit/86cf93c58b1e25e14d5ce10570e2c38de9d1bda4))
* generate validate method for union types ([01c17aa](https://github.com/lithic-com/lithic-java/commit/01c17aae57b744ed46bedb1a26416a4cd23673e6))
* generate validate method for union types ([01c17aa](https://github.com/lithic-com/lithic-java/commit/01c17aae57b744ed46bedb1a26416a4cd23673e6))
* **pagination:** correct hasNextPage check ([#152](https://github.com/lithic-com/lithic-java/issues/152)) ([ed66f30](https://github.com/lithic-com/lithic-java/commit/ed66f3027a29c5dc45661eda443c4cfb894df868))
* set correct timeouts on okhttp client ([#64](https://github.com/lithic-com/lithic-java/issues/64)) ([e907386](https://github.com/lithic-com/lithic-java/commit/e907386ed0e69e1f608ca70aa89e3bff2d9631ec))
* sonatype repository url ([fd6cf6c](https://github.com/lithic-com/lithic-java/commit/fd6cf6cdeb0a3bd70479910bf7da2bd8848ad1ce))
* unwrap webhooks into payload, not event ([b2cea59](https://github.com/lithic-com/lithic-java/commit/b2cea59a4c3c94da5bd7b0a9ed21479d8b96467f))
* update README ([566f588](https://github.com/lithic-com/lithic-java/commit/566f5885538b3b52af950ee1349d6a79d1e7cef7))
* update README ([566f588](https://github.com/lithic-com/lithic-java/commit/566f5885538b3b52af950ee1349d6a79d1e7cef7))


### Code Refactoring

* **api:** remove `post /webhooks/account_holders` endpoint ([#85](https://github.com/lithic-com/lithic-java/issues/85)) ([d32474e](https://github.com/lithic-com/lithic-java/commit/d32474e2363344e06c36f3c15d984726c20bc3ad))
* **api:** remove previous_auth_rule_tokens from auth rules ([#15](https://github.com/lithic-com/lithic-java/issues/15)) ([32207a1](https://github.com/lithic-com/lithic-java/commit/32207a14d062c472ab2701a708898cdd8a4b2d0a))
* **api:** replace `transactionToken` param in favour of `transactionTokens` ([e9a29bf](https://github.com/lithic-com/lithic-java/commit/e9a29bf681511bfbc2360fde4cd7494490c45b96))
* rename nested param and page classes to use singular instead of plural ([c78a04c](https://github.com/lithic-com/lithic-java/commit/c78a04c43da2b52c816d274f956949e83b64f14e))

## 0.28.1 (2024-02-12)

Full Changelog: [v0.28.0...v0.28.1](https://github.com/lithic-com/lithic-java/compare/v0.28.0...v0.28.1)

### Bug Fixes

* **docs:** wrong client import in readme usage example ([#157](https://github.com/lithic-com/lithic-java/issues/157)) ([c872712](https://github.com/lithic-com/lithic-java/commit/c872712acdf033db633b958467be891fc1746110))

## 0.28.0 (2024-02-08)

Full Changelog: [v0.27.0...v0.28.0](https://github.com/lithic-com/lithic-java/compare/v0.27.0...v0.28.0)

### Features

* **api:** updates ([#155](https://github.com/lithic-com/lithic-java/issues/155)) ([95ae441](https://github.com/lithic-com/lithic-java/commit/95ae4418c860ea64d4cd05e76ff1cc0235619c8e))


### Chores

* **interal:** make link to api.md relative ([#153](https://github.com/lithic-com/lithic-java/issues/153)) ([c01249c](https://github.com/lithic-com/lithic-java/commit/c01249caf0c9bf2eb2c6caae15157ecb551d6724))
* **tests:** add integration test for pagination ([#156](https://github.com/lithic-com/lithic-java/issues/156)) ([6dc59fe](https://github.com/lithic-com/lithic-java/commit/6dc59fecd94472872cbe1901257566da256fbad1))

## 0.27.0 (2024-02-01)

Full Changelog: [v0.26.0...v0.27.0](https://github.com/lithic-com/lithic-java/compare/v0.26.0...v0.27.0)

### Features

* **api:** add `account_token` and `card_program_token` to `Card` ([#150](https://github.com/lithic-com/lithic-java/issues/150)) ([0d6a220](https://github.com/lithic-com/lithic-java/commit/0d6a22082601a74effca7bebbad3dd6c55ee0d80))


### Bug Fixes

* **pagination:** correct hasNextPage check ([#152](https://github.com/lithic-com/lithic-java/issues/152)) ([1bb997a](https://github.com/lithic-com/lithic-java/commit/1bb997a51cd629caadb5f12c23d40bd5c40e1d3e))

## 0.26.0 (2024-01-31)

Full Changelog: [v0.25.0...v0.26.0](https://github.com/lithic-com/lithic-java/compare/v0.25.0...v0.26.0)

### Features

* **api:** add search_by_pan endpoint ([#146](https://github.com/lithic-com/lithic-java/issues/146)) ([42445a9](https://github.com/lithic-com/lithic-java/commit/42445a92a268c016a3336fbe41d8e124e0c85ff0))
* remove idempotency headers ([#149](https://github.com/lithic-com/lithic-java/issues/149)) ([2441452](https://github.com/lithic-com/lithic-java/commit/244145266fb9a7efb226ed1451feb6a24c215771))


### Chores

* **internal:** support pre-release versioning ([#148](https://github.com/lithic-com/lithic-java/issues/148)) ([6d2e3e9](https://github.com/lithic-com/lithic-java/commit/6d2e3e99a4580fde8a8e59508628e1d1bac57bf3))

## 0.25.0 (2024-01-23)

Full Changelog: [v0.24.1...v0.25.0](https://github.com/lithic-com/lithic-java/compare/v0.24.1...v0.25.0)

### ⚠ BREAKING CHANGES

* **api:** change account holder creation response, new settlement detail type ([#145](https://github.com/lithic-com/lithic-java/issues/145))

### Features

* **api:** change account holder creation response, new settlement detail type ([#145](https://github.com/lithic-com/lithic-java/issues/145)) ([863fc82](https://github.com/lithic-com/lithic-java/commit/863fc82a19a5f07409742c309de57bbeb736d4a4))


### Chores

* **ci:** rely on Stainless GitHub App for releases ([#144](https://github.com/lithic-com/lithic-java/issues/144)) ([0018339](https://github.com/lithic-com/lithic-java/commit/001833965e7b95070ee06c40db82f73fadcd5aaa))
* **internal:** speculative retry-after-ms support ([#143](https://github.com/lithic-com/lithic-java/issues/143)) ([6998390](https://github.com/lithic-com/lithic-java/commit/69983900f22fa9c02d4e43690dd7590879f27bbb))

## 0.24.1 (2024-01-17)

Full Changelog: [v0.24.0...v0.24.1](https://github.com/lithic-com/lithic-java/compare/v0.24.0...v0.24.1)

### Features

* **api:** updates ([#141](https://github.com/lithic-com/lithic-java/issues/141)) ([c6d8a54](https://github.com/lithic-com/lithic-java/commit/c6d8a543eb9babd51900bf715193d9ec7c653d5d))


### Documentation

* **readme:** improve api reference ([#139](https://github.com/lithic-com/lithic-java/issues/139)) ([f315af6](https://github.com/lithic-com/lithic-java/commit/f315af620f526375d48ced3891157b41a78dc359))

## 0.24.0 (2024-01-09)

Full Changelog: [v0.23.0...v0.24.0](https://github.com/lithic-com/lithic-java/compare/v0.23.0...v0.24.0)

### Features

* **api:** add card renew endpoint ([#138](https://github.com/lithic-com/lithic-java/issues/138)) ([9b6576d](https://github.com/lithic-com/lithic-java/commit/9b6576d4abce29c770401d78882cc91204c911ab))


### Chores

* add .keep files for examples and custom code directories ([#137](https://github.com/lithic-com/lithic-java/issues/137)) ([eaa9cc3](https://github.com/lithic-com/lithic-java/commit/eaa9cc314c3e20a2a2aa778db9b5f3717cf823b7))
* **internal:** bump license ([#135](https://github.com/lithic-com/lithic-java/issues/135)) ([05eb588](https://github.com/lithic-com/lithic-java/commit/05eb588cdb015c268ed66f7c6671579bbf38085d))

## 0.23.0 (2023-12-18)

Full Changelog: [v0.22.0...v0.23.0](https://github.com/lithic-com/lithic-java/compare/v0.22.0...v0.23.0)

### Features

* **api:** remove /auth_stream enrollment endpoints ([#134](https://github.com/lithic-com/lithic-java/issues/134)) ([dd32a7e](https://github.com/lithic-com/lithic-java/commit/dd32a7e75ba37841e180e6d7272cadd5c34adf03))


### Chores

* **ci:** run release workflow once per day ([#132](https://github.com/lithic-com/lithic-java/issues/132)) ([74c5bba](https://github.com/lithic-com/lithic-java/commit/74c5bba79c6f3eeb2fb838470460a8257b7630c8))

## 0.22.0 (2023-12-15)

Full Changelog: [v0.21.0...v0.22.0](https://github.com/lithic-com/lithic-java/compare/v0.21.0...v0.22.0)

### Features

* **api:** rename `token` and `type` to `financial_account_token` and `financial_account_type` ([#131](https://github.com/lithic-com/lithic-java/issues/131)) ([0cd3a82](https://github.com/lithic-com/lithic-java/commit/0cd3a82bc66a6b17906b12c3ef7bb29ea305c2a2))

## 0.21.0 (2023-12-05)

Full Changelog: [v0.20.0...v0.21.0](https://github.com/lithic-com/lithic-java/compare/v0.20.0...v0.21.0)

### Features

* **api:** remove `CLOSED` account enum and update docstrings ([#128](https://github.com/lithic-com/lithic-java/issues/128)) ([ef7909d](https://github.com/lithic-com/lithic-java/commit/ef7909d435cab146bda53788a4363ebe12e617a9))

## 0.20.0 (2023-11-28)

Full Changelog: [v0.19.0...v0.20.0](https://github.com/lithic-com/lithic-java/compare/v0.19.0...v0.20.0)

### Features

* **api:** add `get spend_limits` endpoints to `cards` and `accounts` ([#125](https://github.com/lithic-com/lithic-java/issues/125)) ([09da657](https://github.com/lithic-com/lithic-java/commit/09da6575aed91a6028ed6ea86be3176c85401b94))


### Chores

* **internal:** update stats file ([#123](https://github.com/lithic-com/lithic-java/issues/123)) ([5c92da3](https://github.com/lithic-com/lithic-java/commit/5c92da33f724ff6776e4275a218ebae9bd1876d9))

## 0.19.0 (2023-11-16)

Full Changelog: [v0.18.0...v0.19.0](https://github.com/lithic-com/lithic-java/compare/v0.18.0...v0.19.0)

### Features

* **api:** updates ([#121](https://github.com/lithic-com/lithic-java/issues/121)) ([0bd4f73](https://github.com/lithic-com/lithic-java/commit/0bd4f730cfb8539e4df8a3734337b0074099b785))

## 0.18.0 (2023-11-09)

Full Changelog: [v0.17.0...v0.18.0](https://github.com/lithic-com/lithic-java/compare/v0.17.0...v0.18.0)

### Features

* **api:** updates ([#119](https://github.com/lithic-com/lithic-java/issues/119)) ([c805cba](https://github.com/lithic-com/lithic-java/commit/c805cbad5f1f3f427580e092e459dadc0fe0f780))

## 0.17.0 (2023-11-08)

Full Changelog: [v0.16.0...v0.17.0](https://github.com/lithic-com/lithic-java/compare/v0.16.0...v0.17.0)

### Features

* **client:** allow binary returns ([#114](https://github.com/lithic-com/lithic-java/issues/114)) ([050b48c](https://github.com/lithic-com/lithic-java/commit/050b48ca2018972730f068baaf073d294c97e8b6))


### Bug Fixes

* **api:** correct type for other fees details ([#118](https://github.com/lithic-com/lithic-java/issues/118)) ([625cc6d](https://github.com/lithic-com/lithic-java/commit/625cc6d2a70b7a9881ec9cb588745824cc89f3d1))


### Chores

* remove bad tests ([#117](https://github.com/lithic-com/lithic-java/issues/117)) ([2381c4c](https://github.com/lithic-com/lithic-java/commit/2381c4c9a03b94e6d58db1069d55e7f153d6ecd0))


### Documentation

* improve account holder control person documentation ([#116](https://github.com/lithic-com/lithic-java/issues/116)) ([b1cab62](https://github.com/lithic-com/lithic-java/commit/b1cab622b2e09fecb78156ff1cab93e61f06d839))

## 0.16.0 (2023-11-01)

Full Changelog: [v0.15.0...v0.16.0](https://github.com/lithic-com/lithic-java/compare/v0.15.0...v0.16.0)

### Features

* **api:** add verification_attempts response property ([#113](https://github.com/lithic-com/lithic-java/issues/113)) ([947713f](https://github.com/lithic-com/lithic-java/commit/947713f58e87023d2179c6cf1fd727f97f0547d3))
* **github:** include a devcontainer setup ([#111](https://github.com/lithic-com/lithic-java/issues/111)) ([799818f](https://github.com/lithic-com/lithic-java/commit/799818f12f21c5ed966c912ff79047e5292e9024))

## 0.15.0 (2023-10-26)

Full Changelog: [v0.14.0...v0.15.0](https://github.com/lithic-com/lithic-java/compare/v0.14.0...v0.15.0)

### Features

* **api:** add CardProgram and DigitalCardArt resources ([#109](https://github.com/lithic-com/lithic-java/issues/109)) ([1960910](https://github.com/lithic-com/lithic-java/commit/196091025bfbc7996ca8736709bb70feb45891e0))

## 0.14.0 (2023-10-24)

Full Changelog: [v0.13.2...v0.14.0](https://github.com/lithic-com/lithic-java/compare/v0.13.2...v0.14.0)

### Features

* **api:** add AUTH_STREAM_ACCESS to responder endpoints ([#105](https://github.com/lithic-com/lithic-java/issues/105)) ([b01cf1b](https://github.com/lithic-com/lithic-java/commit/b01cf1b36c665f0828edf1bf2dd2042391472a5e))
* **api:** add verification_failed_reason ([#103](https://github.com/lithic-com/lithic-java/issues/103)) ([618b16e](https://github.com/lithic-com/lithic-java/commit/618b16e0e8d1edcefdcd539a1798f8eccc32df0f))
* **api:** updates ([#102](https://github.com/lithic-com/lithic-java/issues/102)) ([61700a3](https://github.com/lithic-com/lithic-java/commit/61700a3cfc8046353fbdc608d9b76429115b1c2d))
* **client:** adjust retry behavior ([#106](https://github.com/lithic-com/lithic-java/issues/106)) ([e9552ac](https://github.com/lithic-com/lithic-java/commit/e9552ac88a91d55b0c7b6b2a8fbc85a265c7bbea))
* make webhook headers case insensitive ([#100](https://github.com/lithic-com/lithic-java/issues/100)) ([584b496](https://github.com/lithic-com/lithic-java/commit/584b4966f529f3fc17d0877ed4d83661d07d54ef))


### Chores

* **internal:** minor reformatting ([#98](https://github.com/lithic-com/lithic-java/issues/98)) ([f8fc0a6](https://github.com/lithic-com/lithic-java/commit/f8fc0a6a33e3a0655a3c749a197a9991b56214d8))
* **internal:** rearrange client arguments ([#97](https://github.com/lithic-com/lithic-java/issues/97)) ([c545e8b](https://github.com/lithic-com/lithic-java/commit/c545e8b9aa5efc21bb1eb6e1872198c5df1c49e6))
* update README ([#95](https://github.com/lithic-com/lithic-java/issues/95)) ([cc8fd59](https://github.com/lithic-com/lithic-java/commit/cc8fd59702d5ea7345f315504f68cb2f10137548))


### Documentation

* organisation -&gt; organization (UK to US English) ([#101](https://github.com/lithic-com/lithic-java/issues/101)) ([360cb24](https://github.com/lithic-com/lithic-java/commit/360cb2410b34676d6889747bda40cf24f5cd7a72))

## 0.13.2 (2023-10-05)

Full Changelog: [v0.13.1...v0.13.2](https://github.com/lithic-com/lithic-java/compare/v0.13.1...v0.13.2)

### Features

* **api:** updates ([#93](https://github.com/lithic-com/lithic-java/issues/93)) ([e05197f](https://github.com/lithic-com/lithic-java/commit/e05197ff8c588a74ad6e22033c0f335060f31ac3))

## 0.13.1 (2023-10-04)

Full Changelog: [v0.13.0...v0.13.1](https://github.com/lithic-com/lithic-java/compare/v0.13.0...v0.13.1)

### Chores

* **ci:** remove reviewer ([#88](https://github.com/lithic-com/lithic-java/issues/88)) ([74b27a7](https://github.com/lithic-com/lithic-java/commit/74b27a7120f5b004c7470710f2a77f50fb33e17e))
* **internal:** add a top-level generated comment to each file ([#92](https://github.com/lithic-com/lithic-java/issues/92)) ([4853bc2](https://github.com/lithic-com/lithic-java/commit/4853bc23264bfa141de4943f003f091c70eed6f4))
* **internal:** remove redundant namespacing in references ([#91](https://github.com/lithic-com/lithic-java/issues/91)) ([8e9f7fe](https://github.com/lithic-com/lithic-java/commit/8e9f7fe4f55c1e4ee6c062f34e0466f287502ace))

## 0.13.0 (2023-09-29)

Full Changelog: [v0.12.5...v0.13.0](https://github.com/lithic-com/lithic-java/compare/v0.12.5...v0.13.0)

### ⚠ BREAKING CHANGES

* **api:** remove `post /webhooks/account_holders` endpoint ([#85](https://github.com/lithic-com/lithic-java/issues/85))

### Refactors

* **api:** remove `post /webhooks/account_holders` endpoint ([#85](https://github.com/lithic-com/lithic-java/issues/85)) ([61e5703](https://github.com/lithic-com/lithic-java/commit/61e5703c0570a3914d3c863093216c68b35ee1c4))

## 0.12.5 (2023-09-20)

Full Changelog: [v0.12.4...v0.12.5](https://github.com/lithic-com/lithic-java/compare/v0.12.4...v0.12.5)

### Features

* **api:** add simulation endpoints, event types, fix transfer request AuthRule ([#83](https://github.com/lithic-com/lithic-java/issues/83)) ([d0fe9a6](https://github.com/lithic-com/lithic-java/commit/d0fe9a660622cd3b20c72edc5d6e4303815bed9f))

## 0.12.4 (2023-09-15)

Full Changelog: [v0.12.3...v0.12.4](https://github.com/lithic-com/lithic-java/compare/v0.12.3...v0.12.4)

### Features

* **client:** retry on 408 Request Timeout ([#80](https://github.com/lithic-com/lithic-java/issues/80)) ([9a993d3](https://github.com/lithic-com/lithic-java/commit/9a993d3137caa754d93b161d5cdc6c2d9ef1ca3a))

## 0.12.3 (2023-09-11)

Full Changelog: [v0.12.2...v0.12.3](https://github.com/lithic-com/lithic-java/compare/v0.12.2...v0.12.3)

### Features

* **api:** add Simulate Return Payment endpoint ([#77](https://github.com/lithic-com/lithic-java/issues/77)) ([8c3020c](https://github.com/lithic-com/lithic-java/commit/8c3020cc083e6d80b5f4f4279f51d2579aa342c1))
* **api:** add tokenizations.simulate and correct typo'd enum  ([#76](https://github.com/lithic-com/lithic-java/issues/76)) ([47fcbc5](https://github.com/lithic-com/lithic-java/commit/47fcbc54d06571787ec30eb515d2d2eb028c60a9))
* **api:** add user defined id ([#75](https://github.com/lithic-com/lithic-java/issues/75)) ([47418e4](https://github.com/lithic-com/lithic-java/commit/47418e43d6cd3f98a003e549032fc329a50898d2))


### Chores

* **ci:** setup workflows to create releases and release PRs ([#71](https://github.com/lithic-com/lithic-java/issues/71)) ([1102a84](https://github.com/lithic-com/lithic-java/commit/1102a840ddd431b4f36642392c71360156935b20))

## [0.12.2](https://github.com/lithic-com/lithic-java/compare/v0.12.1...v0.12.2) (2023-08-26)


### Chores

* **internal:** minor code re-ordering ([#69](https://github.com/lithic-com/lithic-java/issues/69)) ([ffb2691](https://github.com/lithic-com/lithic-java/commit/ffb2691166e098af85196a85e0b8791ea157e71d))

## [0.12.1](https://github.com/lithic-com/lithic-java/compare/v0.12.0...v0.12.1) (2023-08-16)


### Bug Fixes

* set correct timeouts on okhttp client ([#64](https://github.com/lithic-com/lithic-java/issues/64)) ([e907386](https://github.com/lithic-com/lithic-java/commit/e907386ed0e69e1f608ca70aa89e3bff2d9631ec))

## [0.12.0](https://github.com/lithic-com/lithic-java/compare/v0.11.7...v0.12.0) (2023-08-15)


### ⚠ BREAKING CHANGES

* **api:** change `key` to `secret` ([#57](https://github.com/lithic-com/lithic-java/issues/57))

### Features

* **api:** change `key` to `secret` ([#57](https://github.com/lithic-com/lithic-java/issues/57)) ([b50b550](https://github.com/lithic-com/lithic-java/commit/b50b55076ab9d0368fa576c8d95e39960b45b935))
* default timeout is set for java clients ([#59](https://github.com/lithic-com/lithic-java/issues/59)) ([e9cb63c](https://github.com/lithic-com/lithic-java/commit/e9cb63cd6aef2d9153033983a8c3bce4d1bdb95a))
* generate addXxx methods for array types ([#61](https://github.com/lithic-com/lithic-java/issues/61)) ([ae92a46](https://github.com/lithic-com/lithic-java/commit/ae92a462481307947f70bccc75dbd3e61c10c078))


### Chores

* assign default reviewers to release PRs ([#60](https://github.com/lithic-com/lithic-java/issues/60)) ([28f1275](https://github.com/lithic-com/lithic-java/commit/28f1275d159a8a1c98d41e33fec7dfa22a787079))
* **client:** send Idempotency-Key header ([#62](https://github.com/lithic-com/lithic-java/issues/62)) ([191655b](https://github.com/lithic-com/lithic-java/commit/191655b6d2c6e51111f6c25b77dde800a28143a7))

## [0.11.7](https://github.com/lithic-com/lithic-java/compare/v0.11.6...v0.11.7) (2023-08-11)


### Features

* allOf models now have toXxx methods to access the separate allOf models ([#55](https://github.com/lithic-com/lithic-java/issues/55)) ([bd13b75](https://github.com/lithic-com/lithic-java/commit/bd13b7574f1bacae7d25c1749e6b80ed3aa9896d))
* **api:** add card reissue shipping options ([#53](https://github.com/lithic-com/lithic-java/issues/53)) ([e5b2c1d](https://github.com/lithic-com/lithic-java/commit/e5b2c1d219284cc499e1a552c2d04205b9c55a02))

## [0.11.6](https://github.com/lithic-com/lithic-java/compare/v0.11.5...v0.11.6) (2023-08-08)


### Features

* **api:** add carrier property to card create and reissue params ([#51](https://github.com/lithic-com/lithic-java/issues/51)) ([49865b3](https://github.com/lithic-com/lithic-java/commit/49865b397dce6faacd593dd19fd76e5846a46474))
* **api:** enable more of the payments and external bank api ([#49](https://github.com/lithic-com/lithic-java/issues/49)) ([ef8b823](https://github.com/lithic-com/lithic-java/commit/ef8b8239e5c362456451038788af2fd24e5c4c49))


### Documentation

* **example:** reformat example application and stop hitting kyc by default ([#47](https://github.com/lithic-com/lithic-java/issues/47)) ([4421664](https://github.com/lithic-com/lithic-java/commit/442166436a94463f823626b8c6c9e2f8601f7849))


### Chores

* **ci:** allow release to proceed without signing key id secret ([#48](https://github.com/lithic-com/lithic-java/issues/48)) ([1e67b71](https://github.com/lithic-com/lithic-java/commit/1e67b71a2cf0127441e27bc42624ea2708731668))
* **internal:** publish with --stacktrace for more helpful error information ([#44](https://github.com/lithic-com/lithic-java/issues/44)) ([bfede6b](https://github.com/lithic-com/lithic-java/commit/bfede6b09d1b0c943e5a3b07aa6db846bc67bac0))
* **internal:** support passing GPG_SIGNING_KEY_ID from secrets ([#46](https://github.com/lithic-com/lithic-java/issues/46)) ([6bf2b13](https://github.com/lithic-com/lithic-java/commit/6bf2b135c26a734cf0310ed2479c5e308505f67e))

## [0.11.5](https://github.com/lithic-com/lithic-java/compare/v0.11.4...v0.11.5) (2023-08-01)


### Features

* **api:** updates ([#39](https://github.com/lithic-com/lithic-java/issues/39)) ([1625f99](https://github.com/lithic-com/lithic-java/commit/1625f9948bdb17640c98d4c70e7ccbf83b912a58))


### Bug Fixes

* adjust typo of 'descisioning' to 'decisioning' ([#41](https://github.com/lithic-com/lithic-java/issues/41)) ([bf42abc](https://github.com/lithic-com/lithic-java/commit/bf42abce3866563d9143f4a628baee6d3b07eafb))
* change names of `ThreeDDecision...` to `ThreeDSDecision...` ([#42](https://github.com/lithic-com/lithic-java/issues/42)) ([cc691fd](https://github.com/lithic-com/lithic-java/commit/cc691fd1c18d0c2aa8201eb6e4b2629f8fb84ec0))

## [0.11.4](https://github.com/lithic-com/lithic-java/compare/v0.11.3...v0.11.4) (2023-07-27)


### Features

* **api:** add `with_content` param ([#31](https://github.com/lithic-com/lithic-java/issues/31)) ([fd23dc0](https://github.com/lithic-com/lithic-java/commit/fd23dc04b05b8d63a78cb2d6459e8faaca435a9e))
* **api:** add payment and external bank accounts resource ([#37](https://github.com/lithic-com/lithic-java/issues/37)) ([ab49de5](https://github.com/lithic-com/lithic-java/commit/ab49de582e24d6d6134f349017fe7392ba1cdfe5))
* **api:** add with_content param, event message attempts, and auto-close responses ([d2c7e81](https://github.com/lithic-com/lithic-java/commit/d2c7e81d35005c4a7f5e67d4c39b42d86dcfb28e))
* **ci:** add a publish-sonatype workflow for manual running ([#38](https://github.com/lithic-com/lithic-java/issues/38)) ([d9979a3](https://github.com/lithic-com/lithic-java/commit/d9979a3c0a7ea11645a37add75e72a6e11475109))


### Bug Fixes

* auto-close responses even if an exception is thrown during deserialization ([#33](https://github.com/lithic-com/lithic-java/issues/33)) ([e2f7088](https://github.com/lithic-com/lithic-java/commit/e2f70883f4197ddbd77f03ec54bc1e50717f1c1f))


### Chores

* **internal:** add `codegen.log` to `.gitignore` ([#35](https://github.com/lithic-com/lithic-java/issues/35)) ([2233014](https://github.com/lithic-com/lithic-java/commit/2233014ba95076961d83641cadf668f18ef48bf0))
* unreleased changes ([d2c7e81](https://github.com/lithic-com/lithic-java/commit/d2c7e81d35005c4a7f5e67d4c39b42d86dcfb28e))

## [0.11.3](https://github.com/lithic-com/lithic-java/compare/v0.11.2...v0.11.3) (2023-07-18)


### Features

* **api:** add event message attempts ([#28](https://github.com/lithic-com/lithic-java/issues/28)) ([3eab17c](https://github.com/lithic-com/lithic-java/commit/3eab17ceba644a586eeaa4272e600f5b859bf3d1))

## [0.11.2](https://github.com/lithic-com/lithic-java/compare/v0.11.1...v0.11.2) (2023-07-17)


### Features

* **api:** add more enum members to event types ([#22](https://github.com/lithic-com/lithic-java/issues/22)) ([3c3d46f](https://github.com/lithic-com/lithic-java/commit/3c3d46f0d8664ef31a5a330eea953c6be09c6c8a))
* **api:** no longer require `website_url` property on KYB object ([#26](https://github.com/lithic-com/lithic-java/issues/26)) ([8db563f](https://github.com/lithic-com/lithic-java/commit/8db563f695577351e51f1734ab3154afd63878e0))


### Chores

* **internal:** minor reformatting ([#25](https://github.com/lithic-com/lithic-java/issues/25)) ([df89dd4](https://github.com/lithic-com/lithic-java/commit/df89dd4d2b710d45d1937aaf104434926f8ff870))
* **internal:** minor reformatting + remove internal examples classes ([#24](https://github.com/lithic-com/lithic-java/issues/24)) ([f73d039](https://github.com/lithic-com/lithic-java/commit/f73d039a2445be5bff09005c70c96497f532016c))

## [0.11.1](https://github.com/lithic-com/lithic-java/compare/v0.11.0...v0.11.1) (2023-07-12)


### Features

* **api:** add `state` query param for cards ([#19](https://github.com/lithic-com/lithic-java/issues/19)) ([42a3e58](https://github.com/lithic-com/lithic-java/commit/42a3e58f1323ab63f0ced69d29e0b75957b3d7f0))
* **api:** add digital wallet tokenization result event type ([#20](https://github.com/lithic-com/lithic-java/issues/20)) ([0deca73](https://github.com/lithic-com/lithic-java/commit/0deca739e1d69c37c09d5b7bbf62c18d8ba0a7e7))


### Documentation

* **webhooks:** clarify webhook signature validation ([#17](https://github.com/lithic-com/lithic-java/issues/17)) ([e3f6cbb](https://github.com/lithic-com/lithic-java/commit/e3f6cbba82b07b9f845b33dbd38419fbf7c2998f))

## [0.11.0](https://github.com/lithic-com/lithic-java/compare/v0.10.1...v0.11.0) (2023-07-05)


### ⚠ BREAKING CHANGES

* **api:** remove previous_auth_rule_tokens from auth rules ([#15](https://github.com/lithic-com/lithic-java/issues/15))

### Documentation

* add trailing newlines ([#13](https://github.com/lithic-com/lithic-java/issues/13)) ([39d4c66](https://github.com/lithic-com/lithic-java/commit/39d4c6606d38ac78f1455eb2a30f610540bbe918))
* **api:** update account limits docstrings ([#10](https://github.com/lithic-com/lithic-java/issues/10)) ([ba6d74c](https://github.com/lithic-com/lithic-java/commit/ba6d74cb783daaafff4cb59bd30c42a3cd0e6316))
* **api:** update limits docstrings ([#12](https://github.com/lithic-com/lithic-java/issues/12)) ([ab16470](https://github.com/lithic-com/lithic-java/commit/ab16470900f9d4d4069bdc477aa416714ecefc44))


### Refactors

* **api:** remove previous_auth_rule_tokens from auth rules ([#15](https://github.com/lithic-com/lithic-java/issues/15)) ([32207a1](https://github.com/lithic-com/lithic-java/commit/32207a14d062c472ab2701a708898cdd8a4b2d0a))

## [0.10.1](https://github.com/lithic-com/lithic-java/compare/v0.10.0...v0.10.1) (2023-06-19)


### Documentation

* **api:** clarify dispute evidence filename docstring ([#7](https://github.com/lithic-com/lithic-java/issues/7)) ([adf74fb](https://github.com/lithic-com/lithic-java/commit/adf74fbdf41b593305ec298cb1153c56c58dd759))

## [0.10.0](https://github.com/lithic-com/lithic-java/compare/v0.9.0...v0.10.0) (2023-06-15)


### ⚠ BREAKING CHANGES

* **api:** remove avs_type property, add dispute evidence filename, and mark properties nullable ([#5](https://github.com/lithic-com/lithic-java/issues/5))

### Features

* add JsonValue.convert method ([b144666](https://github.com/lithic-com/lithic-java/commit/b1446663636287da2bab6eebabfa0942c180e6b3))
* **api:** remove avs_type property, add dispute evidence filename, and mark properties nullable ([#5](https://github.com/lithic-com/lithic-java/issues/5)) ([47fd0cf](https://github.com/lithic-com/lithic-java/commit/47fd0cffb99220473aae9a9c3193f9870124c55c))
* **core:** add `asUnknown` to `JsonField` ([a1105cc](https://github.com/lithic-com/lithic-java/commit/a1105cc774ec2c1d91380bbd79b303aa667b2892))
* **pagination:** improve handling of response types ([812da74](https://github.com/lithic-com/lithic-java/commit/812da74f5d4aba2b17cf5a1218936ea347aa2d08))


### Chores

* **internal:** add explicit type annotations to `validate()` ([baffee8](https://github.com/lithic-com/lithic-java/commit/baffee823437c4568a85e13d354daed09c67f5bf))
* **internal:** added version comment ([5dfad4d](https://github.com/lithic-com/lithic-java/commit/5dfad4d7356af3b8f96e6eb34205792d7fc15d25))
* **internal:** cleaner asUnknown implementation ([62ea0dd](https://github.com/lithic-com/lithic-java/commit/62ea0ddf1e544dfd141760c3a576eb21c1b1f1c3))
* **internal:** remove unused check-test-server script ([c807ab7](https://github.com/lithic-com/lithic-java/commit/c807ab76a7ba5662982831999375a349069d7885))


### Documentation

* **api:** update docstrings ([67aa800](https://github.com/lithic-com/lithic-java/commit/67aa80027efbd7b690e0196f83b45173cb2d0029))
* point to github repo instead of email contact ([#4](https://github.com/lithic-com/lithic-java/issues/4)) ([9143442](https://github.com/lithic-com/lithic-java/commit/914344240d0ce2011488441d5b3b1c171c780e69))
