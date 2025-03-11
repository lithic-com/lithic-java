# Changelog

## 0.80.0 (2025-03-11)

Full Changelog: [v0.79.0...v0.80.0](https://github.com/lithic-com/lithic-java/compare/v0.79.0...v0.80.0)

### Features

* **client:** update currency data type ([#530](https://github.com/lithic-com/lithic-java/issues/530)) ([a37fb4a](https://github.com/lithic-com/lithic-java/commit/a37fb4af21471ac608dcf1bff357afb96a0fe2fb))
* generate and publish docs ([#521](https://github.com/lithic-com/lithic-java/issues/521)) ([76cf4d3](https://github.com/lithic-com/lithic-java/commit/76cf4d31918ccd99d11abb69858ca0ffbbff5d92))


### Chores

* **api:** release of Network Totals reporting and new filters for Velocity Limit Rules ([#529](https://github.com/lithic-com/lithic-java/issues/529)) ([18f2f49](https://github.com/lithic-com/lithic-java/commit/18f2f49e97bfce2781489c88a764b8977a5dea70))
* **client:** deprecate some fields ([a37fb4a](https://github.com/lithic-com/lithic-java/commit/a37fb4af21471ac608dcf1bff357afb96a0fe2fb))
* **internal:** add `.kotlin` to `.gitignore` ([#523](https://github.com/lithic-com/lithic-java/issues/523)) ([c4e8c64](https://github.com/lithic-com/lithic-java/commit/c4e8c6495ff31624826326dc79d990f09de6a693))
* **internal:** don't use `JvmOverloads` in interfaces ([8851dd1](https://github.com/lithic-com/lithic-java/commit/8851dd15c78b1faa438c4f1e926440514f6917f5))
* **internal:** reenable warnings as errors ([8851dd1](https://github.com/lithic-com/lithic-java/commit/8851dd15c78b1faa438c4f1e926440514f6917f5))
* **internal:** use `getOrNull` instead of `orElse(null)` ([#524](https://github.com/lithic-com/lithic-java/issues/524)) ([46f1df5](https://github.com/lithic-com/lithic-java/commit/46f1df5af71330bf324853e3264acabd33aa3849))


### Documentation

* document `JsonValue` construction in readme ([#528](https://github.com/lithic-com/lithic-java/issues/528)) ([017efa9](https://github.com/lithic-com/lithic-java/commit/017efa938d17c2d68de87afc36f8332c3e30ae28))
* revise readme docs about nested params ([#527](https://github.com/lithic-com/lithic-java/issues/527)) ([1b232a8](https://github.com/lithic-com/lithic-java/commit/1b232a8d0ca5baae3f71d6c38ffe8f9a72f33b6c))
* update some descriptions ([a37fb4a](https://github.com/lithic-com/lithic-java/commit/a37fb4af21471ac608dcf1bff357afb96a0fe2fb))

## 0.79.0 (2025-03-06)

Full Changelog: [v0.78.0...v0.79.0](https://github.com/lithic-com/lithic-java/compare/v0.78.0...v0.79.0)

### ⚠ BREAKING CHANGES

* **client:** refactor multipart formdata impl ([#513](https://github.com/lithic-com/lithic-java/issues/513))

### Features

* **api:** new Settlement API endpoints and changes to update Account Holder endpoint ([#514](https://github.com/lithic-com/lithic-java/issues/514)) ([553889a](https://github.com/lithic-com/lithic-java/commit/553889a4895f2d988d24bd66b4b61888d50be50a))
* **client:** accept `InputStream` and `Path` for file params ([#519](https://github.com/lithic-com/lithic-java/issues/519)) ([de0b778](https://github.com/lithic-com/lithic-java/commit/de0b778bf94a6a81ba38b4e00303c178a43a1a79))
* **client:** allow configuring timeouts granularly ([#510](https://github.com/lithic-com/lithic-java/issues/510)) ([17f97db](https://github.com/lithic-com/lithic-java/commit/17f97dbd49d489b786ba424f32043ddef5f0f57f))
* **client:** detect binary incompatible jackson versions ([#520](https://github.com/lithic-com/lithic-java/issues/520)) ([a726256](https://github.com/lithic-com/lithic-java/commit/a72625631feaa2eb7866140508d0d06210ab4e92))
* **client:** support raw response access ([#511](https://github.com/lithic-com/lithic-java/issues/511)) ([112fd32](https://github.com/lithic-com/lithic-java/commit/112fd32159c837de4bf3ab0e4e5d5a36bc448bcc))


### Bug Fixes

* compiler error ([9242559](https://github.com/lithic-com/lithic-java/commit/92425593f9f0b00ed9fe1cefb188308ce24c77bc))


### Chores

* **client:** expose `Optional`, not nullable, from `ClientOptions` ([#517](https://github.com/lithic-com/lithic-java/issues/517)) ([fa8d950](https://github.com/lithic-com/lithic-java/commit/fa8d950701c34a3d979533c7da7e68a484fcc53e))
* **client:** refactor multipart formdata impl ([#513](https://github.com/lithic-com/lithic-java/issues/513)) ([254306a](https://github.com/lithic-com/lithic-java/commit/254306a8ab49779549189651fafe5e360e9b1928))
* **client:** use deep identity methods for primitive array types ([#505](https://github.com/lithic-com/lithic-java/issues/505)) ([7a0b3ad](https://github.com/lithic-com/lithic-java/commit/7a0b3adf3d93425ed3911782a6b2ebc0a1824067))
* **internal:** add async service tests ([#503](https://github.com/lithic-com/lithic-java/issues/503)) ([c29ae5a](https://github.com/lithic-com/lithic-java/commit/c29ae5a3d1bfa17b9da4050ce150c38596705937))
* **internal:** improve sync service tests ([c29ae5a](https://github.com/lithic-com/lithic-java/commit/c29ae5a3d1bfa17b9da4050ce150c38596705937))
* **internal:** refactor `ErrorHandlingTest` ([#509](https://github.com/lithic-com/lithic-java/issues/509)) ([ecf5050](https://github.com/lithic-com/lithic-java/commit/ecf5050a51330609b6a7a7b1900d1e306db1e0c5))
* **internal:** refactor `ServiceParamsTest` ([#507](https://github.com/lithic-com/lithic-java/issues/507)) ([bab2b10](https://github.com/lithic-com/lithic-java/commit/bab2b10e1590ee2c673e9a74ab0a4e423c0a2b62))


### Documentation

* add raw response readme documentation ([#515](https://github.com/lithic-com/lithic-java/issues/515)) ([b4f0637](https://github.com/lithic-com/lithic-java/commit/b4f0637a2653aab13268555c2a9fda75a50bc721))
* note required fields in `builder` javadoc ([#516](https://github.com/lithic-com/lithic-java/issues/516)) ([7279322](https://github.com/lithic-com/lithic-java/commit/7279322a4264718aeea1a844e0adf4d2c40eb062))
* readme parameter tweaks ([c29ae5a](https://github.com/lithic-com/lithic-java/commit/c29ae5a3d1bfa17b9da4050ce150c38596705937))
* update URLs from stainlessapi.com to stainless.com ([#508](https://github.com/lithic-com/lithic-java/issues/508)) ([0182c4b](https://github.com/lithic-com/lithic-java/commit/0182c4b707a19ccf2e4d0784975346faff0ca27e))

## 0.78.0 (2025-02-26)

Full Changelog: [v0.77.0...v0.78.0](https://github.com/lithic-com/lithic-java/compare/v0.77.0...v0.78.0)

### Features

* **client:** allow omitting params object when none required ([#501](https://github.com/lithic-com/lithic-java/issues/501)) ([7327186](https://github.com/lithic-com/lithic-java/commit/73271863ffba792800e304e2bcdb69b28da2f063))


### Bug Fixes

* **client:** add missing `@JvmStatic` ([#502](https://github.com/lithic-com/lithic-java/issues/502)) ([98c3d49](https://github.com/lithic-com/lithic-java/commit/98c3d49f6f1a1509a18331ec41026ae3b009286f))


### Chores

* **api:** adds new `Internal` Category for FinancialTransactions ([#500](https://github.com/lithic-com/lithic-java/issues/500)) ([47e6474](https://github.com/lithic-com/lithic-java/commit/47e6474c8c064d275164dc80f42d473b710695fd))
* revert accidental test changes ([2c223cb](https://github.com/lithic-com/lithic-java/commit/2c223cb2c51fc7cd20b4ba8f7bb84f236e71ff7f))


### Documentation

* add source file links to readme ([#499](https://github.com/lithic-com/lithic-java/issues/499)) ([bfbcbe9](https://github.com/lithic-com/lithic-java/commit/bfbcbe9c791249ee6979eb52e2357996391579af))

## 0.77.0 (2025-02-21)

Full Changelog: [v0.76.0...v0.77.0](https://github.com/lithic-com/lithic-java/compare/v0.76.0...v0.77.0)

### ⚠ BREAKING CHANGES

* **client:** rename some params builder methods ([#485](https://github.com/lithic-com/lithic-java/issues/485))

### Features

* **client:** get rid of annoying checked exceptions ([#493](https://github.com/lithic-com/lithic-java/issues/493)) ([a10addc](https://github.com/lithic-com/lithic-java/commit/a10addcce92ce2693cc284c3ac045780cff823ab))
* **client:** support `JsonField#asX()` for known values ([#488](https://github.com/lithic-com/lithic-java/issues/488)) ([bbbebbc](https://github.com/lithic-com/lithic-java/commit/bbbebbc186cbe3ab470118517c0c723bda9b7b27))
* **client:** update enum `asX` methods ([#487](https://github.com/lithic-com/lithic-java/issues/487)) ([4f5cb79](https://github.com/lithic-com/lithic-java/commit/4f5cb798dffdb4a7189c458f8539341234c72027))


### Bug Fixes

* **client:** mark some request bodies as optional ([#495](https://github.com/lithic-com/lithic-java/issues/495)) ([8350303](https://github.com/lithic-com/lithic-java/commit/83503031b7e33553dec10b130029f4092df6cbba))


### Chores

* **api:** new 3DS Event and new `challenge_metadata` property on Authentications ([#481](https://github.com/lithic-com/lithic-java/issues/481)) ([aba327f](https://github.com/lithic-com/lithic-java/commit/aba327f3ca9ca59b89b16f69b364e3de727bcc33))
* **ci:** update gradle actions to v4 ([#492](https://github.com/lithic-com/lithic-java/issues/492)) ([5fa3f68](https://github.com/lithic-com/lithic-java/commit/5fa3f68a98301e539b8a8a2f7f38f864aa4b25a7))
* **client:** rename some params builder methods ([#485](https://github.com/lithic-com/lithic-java/issues/485)) ([3099f72](https://github.com/lithic-com/lithic-java/commit/3099f722f3e05718621c683e2f3c2de185f323c2))
* **docs:** add faq to readme ([#494](https://github.com/lithic-com/lithic-java/issues/494)) ([ddef161](https://github.com/lithic-com/lithic-java/commit/ddef161bdfa16d9ae7779169439d6e0aaecef8c1))
* **docs:** reorganize readme ([#489](https://github.com/lithic-com/lithic-java/issues/489)) ([2cc42ac](https://github.com/lithic-com/lithic-java/commit/2cc42ac93ff092c87c218544fdccdbd620aa2680))
* **internal:** get rid of configuration cache ([#491](https://github.com/lithic-com/lithic-java/issues/491)) ([fb47a73](https://github.com/lithic-com/lithic-java/commit/fb47a73f4bf0f876fd948e44add61ed8533e66b0))
* **internal:** optimize build and test perf ([e78b569](https://github.com/lithic-com/lithic-java/commit/e78b56923aca9e3371dd880ba7e2cb8fef2bc37e))
* **internal:** optimize build and test perf ([90326d4](https://github.com/lithic-com/lithic-java/commit/90326d49e84c99255879d0404f251a0b5a8cb5fe))
* **internal:** refactor `PhantomReachableClosingAsyncStreamResponse` impl ([#483](https://github.com/lithic-com/lithic-java/issues/483)) ([7baa3ec](https://github.com/lithic-com/lithic-java/commit/7baa3ecfca7a6f171e64e31aa7c7d689cd24da2d))
* **internal:** remove unnecessary non-null asserts in tests ([8350303](https://github.com/lithic-com/lithic-java/commit/83503031b7e33553dec10b130029f4092df6cbba))
* **internal:** update formatter ([e78b569](https://github.com/lithic-com/lithic-java/commit/e78b56923aca9e3371dd880ba7e2cb8fef2bc37e))
* **internal:** update formatter ([#484](https://github.com/lithic-com/lithic-java/issues/484)) ([90326d4](https://github.com/lithic-com/lithic-java/commit/90326d49e84c99255879d0404f251a0b5a8cb5fe))
* **internal:** update some formatting in `Values.kt` ([bbbebbc](https://github.com/lithic-com/lithic-java/commit/bbbebbc186cbe3ab470118517c0c723bda9b7b27))
* **internal:** use `assertNotNull` in tests for type narrowing ([8350303](https://github.com/lithic-com/lithic-java/commit/83503031b7e33553dec10b130029f4092df6cbba))


### Documentation

* add immutability explanation to readme ([#497](https://github.com/lithic-com/lithic-java/issues/497)) ([780afa6](https://github.com/lithic-com/lithic-java/commit/780afa6a5845d3f6d924f54be4f4d651f7c63180))
* add more phantom reachability docs ([7baa3ec](https://github.com/lithic-com/lithic-java/commit/7baa3ecfca7a6f171e64e31aa7c7d689cd24da2d))

## 0.76.0 (2025-02-06)

Full Changelog: [v0.75.0...v0.76.0](https://github.com/lithic-com/lithic-java/compare/v0.75.0...v0.76.0)

### Features

* **client:** send client-side timeout headers ([#476](https://github.com/lithic-com/lithic-java/issues/476)) ([c0b8b6d](https://github.com/lithic-com/lithic-java/commit/c0b8b6d4c4f8ac3d79010d494b1ea71ea900b201))


### Bug Fixes

* **api:** add missing `@MustBeClosed` annotations ([#479](https://github.com/lithic-com/lithic-java/issues/479)) ([ed2ddd0](https://github.com/lithic-com/lithic-java/commit/ed2ddd05b76a19143f05b2b3e09c2d9c4e4b55dc))
* **api:** switch `CompletableFuture&lt;Void&gt;` to `CompletableFuture<Void?>` ([ed2ddd0](https://github.com/lithic-com/lithic-java/commit/ed2ddd05b76a19143f05b2b3e09c2d9c4e4b55dc))
* **client:** add missing validation calls on response ([ed2ddd0](https://github.com/lithic-com/lithic-java/commit/ed2ddd05b76a19143f05b2b3e09c2d9c4e4b55dc))
* **client:** always provide a body for `PATCH` methods ([ed2ddd0](https://github.com/lithic-com/lithic-java/commit/ed2ddd05b76a19143f05b2b3e09c2d9c4e4b55dc))


### Chores

* **api:** new PaymentEventType for ACH Returns and small updates to 3DS AuthenticationResult ([#478](https://github.com/lithic-com/lithic-java/issues/478)) ([bf2fce6](https://github.com/lithic-com/lithic-java/commit/bf2fce6f9d9d6aae2744bb6fe46b7f138a2b6fec))
* **internal:** minor formatting/style changes ([ed2ddd0](https://github.com/lithic-com/lithic-java/commit/ed2ddd05b76a19143f05b2b3e09c2d9c4e4b55dc))
* **internal:** rename some tests ([ed2ddd0](https://github.com/lithic-com/lithic-java/commit/ed2ddd05b76a19143f05b2b3e09c2d9c4e4b55dc))

## 0.75.0 (2025-01-30)

Full Changelog: [v0.74.0...v0.75.0](https://github.com/lithic-com/lithic-java/compare/v0.74.0...v0.75.0)

### Features

* **client:** add `_queryParams` and `_headers` methods ([#469](https://github.com/lithic-com/lithic-java/issues/469)) ([6c324ca](https://github.com/lithic-com/lithic-java/commit/6c324ca06eeed02bd7d8654ab8f56f505a6238e6))


### Bug Fixes

* **client:** don't leak responses when retrying ([#474](https://github.com/lithic-com/lithic-java/issues/474)) ([947e6cf](https://github.com/lithic-com/lithic-java/commit/947e6cf907b4c23cf7e9354c3310014081198648))


### Chores

* **internal:** improve `RetryingHttpClientTest` ([#473](https://github.com/lithic-com/lithic-java/issues/473)) ([86a95b5](https://github.com/lithic-com/lithic-java/commit/86a95b5029712321355d9310f24c5970e20d2b5f))


### Documentation

* fix incorrect additional properties info ([#475](https://github.com/lithic-com/lithic-java/issues/475)) ([c08ecf2](https://github.com/lithic-com/lithic-java/commit/c08ecf2fb5082ec5a1f463341bdb20c6aada2a3c))


### Refactors

* **internal:** extract request preparation logic ([6c324ca](https://github.com/lithic-com/lithic-java/commit/6c324ca06eeed02bd7d8654ab8f56f505a6238e6))

## 0.74.0 (2025-01-28)

Full Changelog: [v0.73.0...v0.74.0](https://github.com/lithic-com/lithic-java/compare/v0.73.0...v0.74.0)

### ⚠ BREAKING CHANGES

* **client:** better union variant method and variable names ([#460](https://github.com/lithic-com/lithic-java/issues/460))

### Features

* **api:** adds additional fields to TransactionEvents ([#461](https://github.com/lithic-com/lithic-java/issues/461)) ([fd9ddcc](https://github.com/lithic-com/lithic-java/commit/fd9ddcc00f39bf88634758d5c3b5e7bd50be3d34))
* **api:** adds additional request types for updating an Auth Rule ([#468](https://github.com/lithic-com/lithic-java/issues/468)) ([ff1495c](https://github.com/lithic-com/lithic-java/commit/ff1495c47bbdc49146fe15c2cf4f52e6e54be531))
* **client:** add `close` method ([#463](https://github.com/lithic-com/lithic-java/issues/463)) ([e621cd6](https://github.com/lithic-com/lithic-java/commit/e621cd657a2862918e3689a4df802051008cf23d))
* **client:** better union variant method and variable names ([#460](https://github.com/lithic-com/lithic-java/issues/460)) ([47448bb](https://github.com/lithic-com/lithic-java/commit/47448bb9d0ed1c4c85d735da8e9219f989466794))


### Bug Fixes

* **client:** make some classes and constructors non-public ([#466](https://github.com/lithic-com/lithic-java/issues/466)) ([2e98bdf](https://github.com/lithic-com/lithic-java/commit/2e98bdfa2e9e93a00b93d5eb5cb8c3b7d88321a9))


### Chores

* add max retries to test ([#462](https://github.com/lithic-com/lithic-java/issues/462)) ([ce18db7](https://github.com/lithic-com/lithic-java/commit/ce18db777880b6030c5f9331635cd13e60be5ef7))
* **api:** additional field added to 3DS Responses and Tokenization ([#454](https://github.com/lithic-com/lithic-java/issues/454)) ([c7bcb9d](https://github.com/lithic-com/lithic-java/commit/c7bcb9d667f94b0700b1489697bad3d965ccd92c))
* **internal:** remove some unnecessary `constructor` keywords ([2e98bdf](https://github.com/lithic-com/lithic-java/commit/2e98bdfa2e9e93a00b93d5eb5cb8c3b7d88321a9))
* **internal:** swap `checkNotNull` to `checkRequired` ([#459](https://github.com/lithic-com/lithic-java/issues/459)) ([190676f](https://github.com/lithic-com/lithic-java/commit/190676f931b6b0a140f9794a1ccb0b3615d8c979))
* update tests ([#457](https://github.com/lithic-com/lithic-java/issues/457)) ([a937d5f](https://github.com/lithic-com/lithic-java/commit/a937d5ff36bf79255e9cdf3d94d0d21964a7614d))


### Documentation

* `async` and `sync` method comments ([#465](https://github.com/lithic-com/lithic-java/issues/465)) ([a6c1769](https://github.com/lithic-com/lithic-java/commit/a6c17699fa9e5bc713269a206b8f65cb79d2dc0e))
* add client documentation ([#464](https://github.com/lithic-com/lithic-java/issues/464)) ([3cb8525](https://github.com/lithic-com/lithic-java/commit/3cb8525162d8b1cd4b48c5c52f0b29f50b4676d4))
* builder, enum, and union comments ([#467](https://github.com/lithic-com/lithic-java/issues/467)) ([ac8eabd](https://github.com/lithic-com/lithic-java/commit/ac8eabd7d8248b349bce0c190d68eacee24a5099))
* move up requirements section ([#458](https://github.com/lithic-com/lithic-java/issues/458)) ([d779ba1](https://github.com/lithic-com/lithic-java/commit/d779ba14c6b1d9626561fe8c4f0401b717e0793e))
* update readme ([#456](https://github.com/lithic-com/lithic-java/issues/456)) ([a015030](https://github.com/lithic-com/lithic-java/commit/a01503000abe9e727b421638e112443d4a767218))

## 0.73.0 (2025-01-21)

Full Changelog: [v0.72.0...v0.73.0](https://github.com/lithic-com/lithic-java/compare/v0.72.0...v0.73.0)

### ⚠ BREAKING CHANGES

* **types:** improve auth rules types ([#444](https://github.com/lithic-com/lithic-java/issues/444))
* **client:** switch query params objects to use `QueryParams` ([#423](https://github.com/lithic-com/lithic-java/issues/423))
* **api:** removes AccountHolder `resubmit` endpoint and `KYC_ADVANCED` workflow ([#416](https://github.com/lithic-com/lithic-java/issues/416))

### Features

* **api:** adds EventRuleResult to Transaction Events ([#404](https://github.com/lithic-com/lithic-java/issues/404)) ([ec1ae4b](https://github.com/lithic-com/lithic-java/commit/ec1ae4bddb855ee78b4a39e15aaf4a611d7bd015))
* **api:** removes AccountHolder `resubmit` endpoint and `KYC_ADVANCED` workflow ([#416](https://github.com/lithic-com/lithic-java/issues/416)) ([36f4569](https://github.com/lithic-com/lithic-java/commit/36f45691c30512dbde47e02889ae0bb9a2908396))
* **client:** add various convenience setters to models ([#433](https://github.com/lithic-com/lithic-java/issues/433)) ([5545f01](https://github.com/lithic-com/lithic-java/commit/5545f01b18337808683137ca428854c3ec88fd4f))
* **client:** allow passing null or optional for nullable fields ([#430](https://github.com/lithic-com/lithic-java/issues/430)) ([ad4cb64](https://github.com/lithic-com/lithic-java/commit/ad4cb644d49093d132970a62af1f64457d0932b9))
* **client:** allow setting arbitrary JSON for top-level body params ([5545f01](https://github.com/lithic-com/lithic-java/commit/5545f01b18337808683137ca428854c3ec88fd4f))
* **client:** expose getters for `JsonField` of body params ([5545f01](https://github.com/lithic-com/lithic-java/commit/5545f01b18337808683137ca428854c3ec88fd4f))
* **client:** put body field in params, add more convenience methods, and add missing docs ([#427](https://github.com/lithic-com/lithic-java/issues/427)) ([c37cbfc](https://github.com/lithic-com/lithic-java/commit/c37cbfc281b2cb0d7402e295a62091c36494fd44))
* **types:** improve auth rules types ([#444](https://github.com/lithic-com/lithic-java/issues/444)) ([653fcbc](https://github.com/lithic-com/lithic-java/commit/653fcbc443426ba77d4f99cdc3f58183c864d82c))


### Bug Fixes

* **client:** add some missing `validate()` calls ([#437](https://github.com/lithic-com/lithic-java/issues/437)) ([bc2c608](https://github.com/lithic-com/lithic-java/commit/bc2c608f2a4b534225e3f594ab6e7bfce23f505a))
* **client:** consistently throw on omitting required fields ([5545f01](https://github.com/lithic-com/lithic-java/commit/5545f01b18337808683137ca428854c3ec88fd4f))
* **client:** convert `JsonField` containing list type to mutable in builder ([5545f01](https://github.com/lithic-com/lithic-java/commit/5545f01b18337808683137ca428854c3ec88fd4f))
* **client:** make service impl constructors internal ([#452](https://github.com/lithic-com/lithic-java/issues/452)) ([0c0d26a](https://github.com/lithic-com/lithic-java/commit/0c0d26aa82157e09d18a611f1e078e1ff48e3cd7))
* reuse model in pagination items type ([#453](https://github.com/lithic-com/lithic-java/issues/453)) ([02880e7](https://github.com/lithic-com/lithic-java/commit/02880e795ed193bbd3aaff56773d8a10b18fd007))


### Chores

* **api:** adds `dpan` property to Tokenization ([#448](https://github.com/lithic-com/lithic-java/issues/448)) ([a00b964](https://github.com/lithic-com/lithic-java/commit/a00b964860201b017c1454d2c60c836e267fc8b3))
* **api:** new ConvertPhysical endpoint to convert a virtual card to a physical card ([#415](https://github.com/lithic-com/lithic-java/issues/415)) ([b4b4afb](https://github.com/lithic-com/lithic-java/commit/b4b4afb8fc30bf9e8837157bec30eda375abc62e))
* **api:** updates to documentation and additional filter for status on Transactions ([#440](https://github.com/lithic-com/lithic-java/issues/440)) ([c0d9bec](https://github.com/lithic-com/lithic-java/commit/c0d9bec2ae0f5b384cf55de7ff7e229b7c51bf3e))
* bump license year ([#426](https://github.com/lithic-com/lithic-java/issues/426)) ([1b9fdcc](https://github.com/lithic-com/lithic-java/commit/1b9fdccaaf9358d382553a58a785a163186f99c7))
* **docs:** add example project ([#420](https://github.com/lithic-com/lithic-java/issues/420)) ([db5f757](https://github.com/lithic-com/lithic-java/commit/db5f757ec221320689ca2f304a6f9625bf3ecf55))
* **docs:** fix code block language ([#422](https://github.com/lithic-com/lithic-java/issues/422)) ([dc9ac39](https://github.com/lithic-com/lithic-java/commit/dc9ac398a751c4a80558a19bfb57fa38465f1514))
* **docs:** update readme ([#418](https://github.com/lithic-com/lithic-java/issues/418)) ([1002262](https://github.com/lithic-com/lithic-java/commit/10022629403dea6f789a89cfbacc454962a9346f))
* **docs:** updates documentation for DPANs ([#451](https://github.com/lithic-com/lithic-java/issues/451)) ([bf5dc17](https://github.com/lithic-com/lithic-java/commit/bf5dc17e64350d5ffddfa2e5d2df4bbd35c77b43))
* fix bad merge conflict resolution ([2712732](https://github.com/lithic-com/lithic-java/commit/27127321e959b162c19c2d5a55bc2ee3baae3a66))
* **internal:** add and tweak check functions ([#445](https://github.com/lithic-com/lithic-java/issues/445)) ([8fffede](https://github.com/lithic-com/lithic-java/commit/8fffedefa888b3c57dd921959d388f79d89828f1))
* **internal:** add some missing newlines between methods ([#436](https://github.com/lithic-com/lithic-java/issues/436)) ([0343b4b](https://github.com/lithic-com/lithic-java/commit/0343b4b30c8bff3ccde1e04b9463595aaea67496))
* **internal:** extract a `checkRequired` function ([#443](https://github.com/lithic-com/lithic-java/issues/443)) ([db55dc2](https://github.com/lithic-com/lithic-java/commit/db55dc22e80b0d2126e767f4a0ba978e85df942e))
* **internal:** fix up root `build.gradle.kts` formatting ([#438](https://github.com/lithic-com/lithic-java/issues/438)) ([6aa9afb](https://github.com/lithic-com/lithic-java/commit/6aa9afbf11ca6ddd2ef4ab2d7273d76d4864e528))
* **internal:** refactor `validate` methods ([bc2c608](https://github.com/lithic-com/lithic-java/commit/bc2c608f2a4b534225e3f594ab6e7bfce23f505a))
* **internal:** remove unused and expand used wildcard imports ([#412](https://github.com/lithic-com/lithic-java/issues/412)) ([5e267a3](https://github.com/lithic-com/lithic-java/commit/5e267a3685ebc8cd6a25dbb374c1010d5ccb5a27))
* **internal:** remove unused and expand used wildcard imports ([#414](https://github.com/lithic-com/lithic-java/issues/414)) ([1ca4834](https://github.com/lithic-com/lithic-java/commit/1ca48349b006983a828c4225ef9aa1ea411cfa34))
* **internal:** remove unused Gradle imports ([#439](https://github.com/lithic-com/lithic-java/issues/439)) ([43dc083](https://github.com/lithic-com/lithic-java/commit/43dc083dab158ca542ac51c52f861991569eeb11))
* **internal:** remove unused imports ([#409](https://github.com/lithic-com/lithic-java/issues/409)) ([ebba4c6](https://github.com/lithic-com/lithic-java/commit/ebba4c6a763a176f2e14281226cb87eaf4857dc0))
* **internal:** remove unused or unnecessary Gradle imports ([#441](https://github.com/lithic-com/lithic-java/issues/441)) ([490bf10](https://github.com/lithic-com/lithic-java/commit/490bf101c5d96b70e9415cf4563ac57769105e9e))
* **internal:** tweak client options nullability handling ([8fffede](https://github.com/lithic-com/lithic-java/commit/8fffedefa888b3c57dd921959d388f79d89828f1))
* **internal:** update examples ([#431](https://github.com/lithic-com/lithic-java/issues/431)) ([7318a08](https://github.com/lithic-com/lithic-java/commit/7318a08afe7e62e9cb33b90d143d1242091a8fb6))
* **internal:** update some gradle formatting ([#442](https://github.com/lithic-com/lithic-java/issues/442)) ([ec5f82a](https://github.com/lithic-com/lithic-java/commit/ec5f82ab370a590f7ded51bde8f96a0011f7c131))
* **internal:** upgrade kotlin compiler and gradle ([#449](https://github.com/lithic-com/lithic-java/issues/449)) ([7edecd8](https://github.com/lithic-com/lithic-java/commit/7edecd8f81dcf66f6cd98721c8c50660fabae874))
* simplify examples involving lists ([#446](https://github.com/lithic-com/lithic-java/issues/446)) ([abc4eaa](https://github.com/lithic-com/lithic-java/commit/abc4eaae58d4251498a5b3cf47fd89a51156b7d9))
* simplify examples involving unions ([#447](https://github.com/lithic-com/lithic-java/issues/447)) ([723cc08](https://github.com/lithic-com/lithic-java/commit/723cc08cad48d40eecb275fc5622b5de65b82f05))
* **test:** remove unused imports ([#410](https://github.com/lithic-com/lithic-java/issues/410)) ([8cea52f](https://github.com/lithic-com/lithic-java/commit/8cea52f7f3dbdd9c7052500d2e2af832ac251ab0))
* **test:** use `JsonValue` instead of `JsonString` ([#411](https://github.com/lithic-com/lithic-java/issues/411)) ([d363036](https://github.com/lithic-com/lithic-java/commit/d3630366ea4472454c510595cdd9c49d3f5113e0))
* update example values in tests and docs ([#406](https://github.com/lithic-com/lithic-java/issues/406)) ([d80d755](https://github.com/lithic-com/lithic-java/commit/d80d755a70027aace16d9f98639226fa1c47c082))


### Documentation

* add more documentation ([#450](https://github.com/lithic-com/lithic-java/issues/450)) ([88bdc78](https://github.com/lithic-com/lithic-java/commit/88bdc78098432435a9daf0a340de9a20e74bbfd8))
* add params class javadocs ([#432](https://github.com/lithic-com/lithic-java/issues/432)) ([3edb1a1](https://github.com/lithic-com/lithic-java/commit/3edb1a1893e88560ccdc7d2206a9199cb741bc7c))
* add some missing javadocs ([#428](https://github.com/lithic-com/lithic-java/issues/428)) ([440de6d](https://github.com/lithic-com/lithic-java/commit/440de6d98700e68300225bce43537fb46b823957))
* **readme:** fix misplaced period ([#434](https://github.com/lithic-com/lithic-java/issues/434)) ([df4c064](https://github.com/lithic-com/lithic-java/commit/df4c06496a03ce4f63f6b07e0c0cd5a4a265e896))
* update some builder method javadocs ([#435](https://github.com/lithic-com/lithic-java/issues/435)) ([683ba9d](https://github.com/lithic-com/lithic-java/commit/683ba9dd2c62722e356b28085e80c9c22ad15b95))


### Styles

* **internal:** explicitly add some method return types ([5545f01](https://github.com/lithic-com/lithic-java/commit/5545f01b18337808683137ca428854c3ec88fd4f))
* **internal:** make enum value definitions less verbose ([#407](https://github.com/lithic-com/lithic-java/issues/407)) ([8821e09](https://github.com/lithic-com/lithic-java/commit/8821e09d0a48fb626a4fd48cd01bb358934e800a))
* **internal:** move enum identity methods to bottom of class ([#408](https://github.com/lithic-com/lithic-java/issues/408)) ([0046a22](https://github.com/lithic-com/lithic-java/commit/0046a22074b408c85982be3f3764b436da786f0a))
* **internal:** move headers and query params setters below others ([5545f01](https://github.com/lithic-com/lithic-java/commit/5545f01b18337808683137ca428854c3ec88fd4f))
* **internal:** simplify existing convenience setters on params ([5545f01](https://github.com/lithic-com/lithic-java/commit/5545f01b18337808683137ca428854c3ec88fd4f))
* **internal:** sort fields ([#429](https://github.com/lithic-com/lithic-java/issues/429)) ([55373bb](https://github.com/lithic-com/lithic-java/commit/55373bb7719a015f60cdf716e545adc66158da89))


### Refactors

* **client:** switch query params objects to use `QueryParams` ([#423](https://github.com/lithic-com/lithic-java/issues/423)) ([5acf70b](https://github.com/lithic-com/lithic-java/commit/5acf70ba079b37b7c768928907c35e3bb5c59e81))
* **internal:** use constructor to deserialize json ([#425](https://github.com/lithic-com/lithic-java/issues/425)) ([a89baa6](https://github.com/lithic-com/lithic-java/commit/a89baa6e89aa440b9f94e0faa804529d89b39251))

## 0.72.0 (2024-11-26)

Full Changelog: [v0.71.0...v0.72.0](https://github.com/lithic-com/lithic-java/compare/v0.71.0...v0.72.0)

### Features

* **api:** updates to Auth Rules numeric types, new Card Types and Authorization Rule Backtests ([#400](https://github.com/lithic-com/lithic-java/issues/400)) ([03b0b21](https://github.com/lithic-com/lithic-java/commit/03b0b2120ee6f609f3c4603298100c59f90b8136))
* **client:** add logging when debug env is set ([#396](https://github.com/lithic-com/lithic-java/issues/396)) ([7699d3b](https://github.com/lithic-com/lithic-java/commit/7699d3b5744928055afd3d8e4d40c7c56d7926cf))
* **client:** add methods for header params ([#392](https://github.com/lithic-com/lithic-java/issues/392)) ([2c6e356](https://github.com/lithic-com/lithic-java/commit/2c6e3560a21bf578ca704d19a8628af64681732e))
* derive gpg release key's id via gpg itself ([#402](https://github.com/lithic-com/lithic-java/issues/402)) ([35b7ae5](https://github.com/lithic-com/lithic-java/commit/35b7ae5879764d03c1527f6cf973236f999c6ebe))


### Bug Fixes

* **internal:** use correct example string for test ([#398](https://github.com/lithic-com/lithic-java/issues/398)) ([56a9735](https://github.com/lithic-com/lithic-java/commit/56a97358ecb75bf9c7bc0265b65ede0355509c8a))


### Chores

* **api:** add backtest methods to AuthRules ([#401](https://github.com/lithic-com/lithic-java/issues/401)) ([5ab850e](https://github.com/lithic-com/lithic-java/commit/5ab850e42f48053fe9c418500c87752568b48451))
* **deps:** bump jackson to 2.18.1 ([#391](https://github.com/lithic-com/lithic-java/issues/391)) ([496b520](https://github.com/lithic-com/lithic-java/commit/496b520959f77f66798866a444f64198b97eb848))
* **internal:** update example values ([#399](https://github.com/lithic-com/lithic-java/issues/399)) ([fa0a7d7](https://github.com/lithic-com/lithic-java/commit/fa0a7d79e8da9423c19486f1143082726ea80fa3))
* publish to maven central portal ([#403](https://github.com/lithic-com/lithic-java/issues/403)) ([2fcca5a](https://github.com/lithic-com/lithic-java/commit/2fcca5ae525a9304982fa4ef8daa882d029ee5fa))


### Styles

* **internal:** move identity methods to bottom of error class ([#394](https://github.com/lithic-com/lithic-java/issues/394)) ([5f5d384](https://github.com/lithic-com/lithic-java/commit/5f5d384cf4d00fd68237f71163406c2b9fdb428d))
* **internal:** reduce verbosity of identity methods ([#393](https://github.com/lithic-com/lithic-java/issues/393)) ([54eb3bc](https://github.com/lithic-com/lithic-java/commit/54eb3bc04b57cc0a5f6b83fc8a1d1ec4c6898640))
* **internal:** reorder some params methods and improve consistency of implementations ([#395](https://github.com/lithic-com/lithic-java/issues/395)) ([01f6477](https://github.com/lithic-com/lithic-java/commit/01f64777f999906265478f87145cee97393b87ac))


### Refactors

* **internal:** split `closeWhenPhantomReachable` function ([#389](https://github.com/lithic-com/lithic-java/issues/389)) ([953fe96](https://github.com/lithic-com/lithic-java/commit/953fe9642218c8fa6b7539f122c055a52e06fae8))

## 0.71.0 (2024-11-14)

Full Changelog: [v0.70.0...v0.71.0](https://github.com/lithic-com/lithic-java/compare/v0.70.0...v0.71.0)

### Features

* **api:** adds PrimeRates API ([#388](https://github.com/lithic-com/lithic-java/issues/388)) ([1809330](https://github.com/lithic-com/lithic-java/commit/18093307feb69bbe69e0b7a09170330d3835d325))


### Performance Improvements

* **tests:** remove unused dependencies ([#387](https://github.com/lithic-com/lithic-java/issues/387)) ([f4b8b7d](https://github.com/lithic-com/lithic-java/commit/f4b8b7de2e26b392a70b715898a2fff78be790d8))


### Chores

* **api:** add business_account_token param for listing Balances ([#385](https://github.com/lithic-com/lithic-java/issues/385)) ([bf306c6](https://github.com/lithic-com/lithic-java/commit/bf306c6773d687d0abb2665aa9d2734d995b089b))

## 0.70.0 (2024-11-07)

Full Changelog: [v0.69.0...v0.70.0](https://github.com/lithic-com/lithic-java/compare/v0.69.0...v0.70.0)

### ⚠ BREAKING CHANGES

* **client:** replace multimaps with custom types ([#381](https://github.com/lithic-com/lithic-java/issues/381))

### Features

* **client:** additional builder setters for error class ([142b1f9](https://github.com/lithic-com/lithic-java/commit/142b1f935c0f611b8e8adc4822c0a6d3023a6be7))
* **client:** more additional body param setters ([#383](https://github.com/lithic-com/lithic-java/issues/383)) ([6f7cd8d](https://github.com/lithic-com/lithic-java/commit/6f7cd8dbfab6cb7e05f3ed09eb743d36efb91b2c))
* **client:** replace multimaps with custom types ([#381](https://github.com/lithic-com/lithic-java/issues/381)) ([dd6f587](https://github.com/lithic-com/lithic-java/commit/dd6f5871681fa6a2e9f41a00ba37db20335f39b9))


### Bug Fixes

* **client:** error class `toBuilder` not copying fields ([#384](https://github.com/lithic-com/lithic-java/issues/384)) ([142b1f9](https://github.com/lithic-com/lithic-java/commit/142b1f935c0f611b8e8adc4822c0a6d3023a6be7))


### Chores

* **api:** adds replacement_account_token to Card create parameters ([#379](https://github.com/lithic-com/lithic-java/issues/379)) ([227af0e](https://github.com/lithic-com/lithic-java/commit/227af0e80ac6a01d446b39ffcd1e43b8f8b0fae4))

## 0.69.0 (2024-11-05)

Full Changelog: [v0.68.0...v0.69.0](https://github.com/lithic-com/lithic-java/compare/v0.68.0...v0.69.0)

### ⚠ BREAKING CHANGES

* **api:** removes AuthRules V1 ([#378](https://github.com/lithic-com/lithic-java/issues/378))
* **client:** add/rename methods for headers/query params ([#376](https://github.com/lithic-com/lithic-java/issues/376))
* **client:** rename header and query params builder methods ([#375](https://github.com/lithic-com/lithic-java/issues/375))

### Features

* **api:** removes AuthRules V1 ([#378](https://github.com/lithic-com/lithic-java/issues/378)) ([e887e6c](https://github.com/lithic-com/lithic-java/commit/e887e6c438e321d2d7018f42f9b73f7c090e129a))
* **client:** add `QueryParams` class ([#372](https://github.com/lithic-com/lithic-java/issues/372)) ([e5750ed](https://github.com/lithic-com/lithic-java/commit/e5750ed502ac86d2402b922a94b5c73665239d3c))
* **client:** add/rename methods for headers/query params ([#376](https://github.com/lithic-com/lithic-java/issues/376)) ([adf420b](https://github.com/lithic-com/lithic-java/commit/adf420bea7a262affbef0d02e0b1ebe013fba7e3))
* **client:** propagate headers/query params methods to client builders ([#374](https://github.com/lithic-com/lithic-java/issues/374)) ([61b29b1](https://github.com/lithic-com/lithic-java/commit/61b29b1224795bd2fd458db49a6355f045006baa))


### Refactors

* **client:** http request methods ([7a10d7b](https://github.com/lithic-com/lithic-java/commit/7a10d7bc1798753b52c5f68434d073385989ba01))
* **client:** rename header and query params builder methods ([#375](https://github.com/lithic-com/lithic-java/issues/375)) ([381fdd4](https://github.com/lithic-com/lithic-java/commit/381fdd4dc87db2b002591da13f29ad270e754a30))

## 0.68.0 (2024-11-01)

Full Changelog: [v0.67.0...v0.68.0](https://github.com/lithic-com/lithic-java/compare/v0.67.0...v0.68.0)

### ⚠ BREAKING CHANGES

* **client:** rename some union classes ([#361](https://github.com/lithic-com/lithic-java/issues/361))

### Features

* **api:** add `interest_details` properties to LoanTapes ([#351](https://github.com/lithic-com/lithic-java/issues/351)) ([d71f9c2](https://github.com/lithic-com/lithic-java/commit/d71f9c23347095873f61b894095f954c65d50810))
* **api:** removes `transfer_transaction.created` webhook and updates to VerificationApplication ([#343](https://github.com/lithic-com/lithic-java/issues/343)) ([e6a1172](https://github.com/lithic-com/lithic-java/commit/e6a1172a01f186a463120ef05e24e1f5ed123918))
* **api:** updates ([#358](https://github.com/lithic-com/lithic-java/issues/358)) ([242b018](https://github.com/lithic-com/lithic-java/commit/242b018302a28cb76a3c7520c3633d8c9cebcfbd))
* **client:** add `Headers` class ([#369](https://github.com/lithic-com/lithic-java/issues/369)) ([de2ec32](https://github.com/lithic-com/lithic-java/commit/de2ec326be25bd1a14620b1ac324627a755bc480))
* **client:** add `User-Agent` header ([#356](https://github.com/lithic-com/lithic-java/issues/356)) ([2e54069](https://github.com/lithic-com/lithic-java/commit/2e54069d945eed47e7d01aac97b3e14e0fc3e3a2))
* **client:** clean up resource leaks when the resource becomes phantom reachable ([#359](https://github.com/lithic-com/lithic-java/issues/359)) ([0877b0e](https://github.com/lithic-com/lithic-java/commit/0877b0e3a81111a3d42cd2234ca5a2a44c3ee437))
* **client:** set `X-Stainless-Runtime` header ([#355](https://github.com/lithic-com/lithic-java/issues/355)) ([eb4c4e9](https://github.com/lithic-com/lithic-java/commit/eb4c4e99ca9689bffdf467024c1865890b05b1ca))
* **client:** support union discriminators in deserialization ([#339](https://github.com/lithic-com/lithic-java/issues/339)) ([520e3e8](https://github.com/lithic-com/lithic-java/commit/520e3e8da04806178bbbb6b521cda916825cef2e))


### Bug Fixes

* **client:** accidental double-wrapping with `RetryingHttpClient` ([#357](https://github.com/lithic-com/lithic-java/issues/357)) ([9454836](https://github.com/lithic-com/lithic-java/commit/9454836120ed95642eece9c3ecca47ee8629b72b))
* **client:** add `@JvmOverloads` to `HttpClient` methods ([#349](https://github.com/lithic-com/lithic-java/issues/349)) ([95928aa](https://github.com/lithic-com/lithic-java/commit/95928aa0478bafea335173b4a05e8801387a0c8e))
* **client:** ensure constructed objects are immutable ([#367](https://github.com/lithic-com/lithic-java/issues/367)) ([1a42aeb](https://github.com/lithic-com/lithic-java/commit/1a42aeb3c6794726bf9e9d303fc263f2531d571f))
* **client:** implement `hashCode` for `IsMissing` ([#352](https://github.com/lithic-com/lithic-java/issues/352)) ([c93d7f3](https://github.com/lithic-com/lithic-java/commit/c93d7f35d5c8412a27ee52b2af9e5f8d744a3290))
* **internal:** remove unnecessary error handlers ([#338](https://github.com/lithic-com/lithic-java/issues/338)) ([b9bf1e8](https://github.com/lithic-com/lithic-java/commit/b9bf1e8974d4205eeff9cba08ca9c5c78d1f56c0))
* merge conflicts ([#371](https://github.com/lithic-com/lithic-java/issues/371)) ([709b83e](https://github.com/lithic-com/lithic-java/commit/709b83ec8726fd3dd181af99e95442f888ec01f5))


### Chores

* **api:** add `PIN_BLOCKED` to `detailed_results` property on Event ([#353](https://github.com/lithic-com/lithic-java/issues/353)) ([20b0e70](https://github.com/lithic-com/lithic-java/commit/20b0e7092061a7326406e419c83a595e54ea5f61))
* **api:** adds `charge_off` functionality to FinancialAccounts ([#362](https://github.com/lithic-com/lithic-java/issues/362)) ([7bef93d](https://github.com/lithic-com/lithic-java/commit/7bef93dba4b1f28372cc1bcc2848fd283be9d692))
* **api:** adds new result types to Transactions and Events ([#354](https://github.com/lithic-com/lithic-java/issues/354)) ([01c894a](https://github.com/lithic-com/lithic-java/commit/01c894a136de6604b70a91f089faa1ad9039b529))
* **docs:** updates to documentation for V2 AuthRules ([#360](https://github.com/lithic-com/lithic-java/issues/360)) ([fa18412](https://github.com/lithic-com/lithic-java/commit/fa184129e5525eb6c9819772fd00effb50072ef6))
* **internal:** delete unused function ([#364](https://github.com/lithic-com/lithic-java/issues/364)) ([7f394be](https://github.com/lithic-com/lithic-java/commit/7f394be6d2b74c70f65937e7f46b8d36584a12e2))
* **internal:** omit unnecessary code ([#337](https://github.com/lithic-com/lithic-java/issues/337)) ([c8ede2e](https://github.com/lithic-com/lithic-java/commit/c8ede2e272e81446080e9f5346ea2381b71d61fb))
* **internal:** remove empty test files ([#342](https://github.com/lithic-com/lithic-java/issues/342)) ([31579db](https://github.com/lithic-com/lithic-java/commit/31579db038c5894ab24e3888e051ac8deaede967))
* **internal:** remove unnecessary `[@file](https://github.com/file):Suppress("OVERLOADS_INTERFACE")` ([#345](https://github.com/lithic-com/lithic-java/issues/345)) ([8517b69](https://github.com/lithic-com/lithic-java/commit/8517b69a6564fb718f43fec751d262f06cf90cb9))
* **internal:** remove useless `[@file](https://github.com/file):JvmSynthetic` ([#348](https://github.com/lithic-com/lithic-java/issues/348)) ([2be3a58](https://github.com/lithic-com/lithic-java/commit/2be3a58614b36238a8dff360e01d1bf2e61b254c))


### Documentation

* add docstrings ([#366](https://github.com/lithic-com/lithic-java/issues/366)) ([785be2c](https://github.com/lithic-com/lithic-java/commit/785be2ce93bf5c1277b1cb4a4728e10202d89300))


### Styles

* **client:** make toString methods consistent ([#341](https://github.com/lithic-com/lithic-java/issues/341)) ([395819c](https://github.com/lithic-com/lithic-java/commit/395819c9dd691f90c22cc74582c02923f2e16146))
* **client:** rename some union classes ([#361](https://github.com/lithic-com/lithic-java/issues/361)) ([a1e0c0a](https://github.com/lithic-com/lithic-java/commit/a1e0c0aa4315c2a89266e4523bb381adfef7c60f))
* **internal:** improve `OkHttpClient` formatting ([#346](https://github.com/lithic-com/lithic-java/issues/346)) ([6b64c87](https://github.com/lithic-com/lithic-java/commit/6b64c8747fb457bb22d84cfb1cd86aefff5927d1))
* **internal:** improve `RetryingHttpClient` formatting ([#350](https://github.com/lithic-com/lithic-java/issues/350)) ([81f81ab](https://github.com/lithic-com/lithic-java/commit/81f81ab88afe73e6cc1c74480b790c8a0b7b66dc))
* **internal:** improve terseness of handlers ([#332](https://github.com/lithic-com/lithic-java/issues/332)) ([cd04c59](https://github.com/lithic-com/lithic-java/commit/cd04c595411b9c6c69ff348435179f4e4e19ad11))
* **internal:** improve terseness of Properties.kt ([#334](https://github.com/lithic-com/lithic-java/issues/334)) ([6f7c5b1](https://github.com/lithic-com/lithic-java/commit/6f7c5b12ff3d95be3897db2480c7c88c16654ff9))
* **internal:** make `getOrThrow` terse and consistent ([#363](https://github.com/lithic-com/lithic-java/issues/363)) ([cfb64c1](https://github.com/lithic-com/lithic-java/commit/cfb64c10056287572a409f44b80a1207eadcdaee))
* **internal:** move Handlers.kt and HttpRequestBodies.kt to core ([#335](https://github.com/lithic-com/lithic-java/issues/335)) ([765897b](https://github.com/lithic-com/lithic-java/commit/765897b38e469868950b73fe324fbab50983cbf9))
* **internal:** simplify client build method ([#347](https://github.com/lithic-com/lithic-java/issues/347)) ([ed191e9](https://github.com/lithic-com/lithic-java/commit/ed191e98a7702e752eac089936c22039ceed405a))
* **internal:** update comment formatting ([#344](https://github.com/lithic-com/lithic-java/issues/344)) ([20fc451](https://github.com/lithic-com/lithic-java/commit/20fc451c1def2255fcc392afa9977df69961bd90))
* **internal:** use `if` and `if-else` instead of `when` idiomatically ([#340](https://github.com/lithic-com/lithic-java/issues/340)) ([2536dd7](https://github.com/lithic-com/lithic-java/commit/2536dd78664196f3f7d60f962c12d900a0fcb611))


### Refactors

* **internal:** inline `MoreExecutors` usage ([#365](https://github.com/lithic-com/lithic-java/issues/365)) ([3fd63b5](https://github.com/lithic-com/lithic-java/commit/3fd63b52bcdd51150815c0181869d872dd0882ec))
* **internal:** polish `ClientOptions` ([#368](https://github.com/lithic-com/lithic-java/issues/368)) ([5c45a3f](https://github.com/lithic-com/lithic-java/commit/5c45a3f8fe375256c37dea95b039518fc302f3a4))

## 0.67.0 (2024-10-11)

Full Changelog: [v0.66.0...v0.67.0](https://github.com/lithic-com/lithic-java/compare/v0.66.0...v0.67.0)

### Features

* **api:** updates to documentation and addition of new 3DS simulation methods ([#330](https://github.com/lithic-com/lithic-java/issues/330)) ([54c9c05](https://github.com/lithic-com/lithic-java/commit/54c9c051cfe5a603c4c2cc79bc39720d58955849))

## 0.66.0 (2024-10-09)

Full Changelog: [v0.65.0...v0.66.0](https://github.com/lithic-com/lithic-java/compare/v0.65.0...v0.66.0)

### ⚠ BREAKING CHANGES

* **client:** don't generate default variant field/method names with underscores ([#328](https://github.com/lithic-com/lithic-java/issues/328))

### Bug Fixes

* **client:** don't generate default variant field/method names with underscores ([#328](https://github.com/lithic-com/lithic-java/issues/328)) ([b57530c](https://github.com/lithic-com/lithic-java/commit/b57530cc42117808cd410a44c8e7d3ea93608ee1))

## 0.65.0 (2024-10-09)

Full Changelog: [v0.64.1...v0.65.0](https://github.com/lithic-com/lithic-java/compare/v0.64.1...v0.65.0)

### Features

* **api:** small updates to Documents, AccountHolders and LoanTapes ([#327](https://github.com/lithic-com/lithic-java/issues/327)) ([3717b31](https://github.com/lithic-com/lithic-java/commit/3717b3135cc213d4c1ea5cfe967cc391a3b062cd))


### Chores

* **api:** small updates to verification addresses and Statement and LoanTape fields ([#324](https://github.com/lithic-com/lithic-java/issues/324)) ([2e16bc7](https://github.com/lithic-com/lithic-java/commit/2e16bc74e4f043fddfa93e7aac643a83ceef586e))


### Styles

* **client:** disable formatting for java boilerplate ([#326](https://github.com/lithic-com/lithic-java/issues/326)) ([5ad2b48](https://github.com/lithic-com/lithic-java/commit/5ad2b48f06897200b4b4fc1d03446edcba215637))

## 0.64.1 (2024-10-02)

Full Changelog: [v0.64.0...v0.64.1](https://github.com/lithic-com/lithic-java/compare/v0.64.0...v0.64.1)

### Bug Fixes

* **client:** escape keywords reserved in java, but not in kotlin, for the java sdk ([#323](https://github.com/lithic-com/lithic-java/issues/323)) ([de90120](https://github.com/lithic-com/lithic-java/commit/de9012087e99f83f68ccc689b5380b28d046f2fa))


### Styles

* **client:** move equals, hashCode, and toString to the bottom of entity files ([#321](https://github.com/lithic-com/lithic-java/issues/321)) ([88d052f](https://github.com/lithic-com/lithic-java/commit/88d052f82390ba6540c971952f4def79fef78528))

## 0.64.0 (2024-10-01)

Full Changelog: [v0.63.0...v0.64.0](https://github.com/lithic-com/lithic-java/compare/v0.63.0...v0.64.0)

### Features

* **api:** rename `loan_tape_response.statement_balance` to `previous_statement_balance` ([#319](https://github.com/lithic-com/lithic-java/issues/319)) ([7cf1663](https://github.com/lithic-com/lithic-java/commit/7cf16633fc953843bf6229c938df21cde14ba1b6))

## 0.63.0 (2024-10-01)

Full Changelog: [v0.62.0...v0.63.0](https://github.com/lithic-com/lithic-java/compare/v0.62.0...v0.63.0)

### Features

* **api:** add Management Operations and Loan Tapes API ([#317](https://github.com/lithic-com/lithic-java/issues/317)) ([8da35f9](https://github.com/lithic-com/lithic-java/commit/8da35f9f44469f90eb1a8a4fa27eaee19cf6953e))

## 0.62.0 (2024-09-25)

Full Changelog: [v0.61.0...v0.62.0](https://github.com/lithic-com/lithic-java/compare/v0.61.0...v0.62.0)

### Features

* **api:** adds endpoint for migrating auth rules from v1 to V2. marks v1 auth rules as deprecated ([#316](https://github.com/lithic-com/lithic-java/issues/316)) ([c92d0b3](https://github.com/lithic-com/lithic-java/commit/c92d0b3f59740cfcd61a8e65b3fce8416b61fc30))
* **client:** send retry count header ([#314](https://github.com/lithic-com/lithic-java/issues/314)) ([c9476e0](https://github.com/lithic-com/lithic-java/commit/c9476e02998e623c7962180a07e5a6963d8a9ce5))

## 0.61.0 (2024-09-24)

Full Changelog: [v0.60.0...v0.61.0](https://github.com/lithic-com/lithic-java/compare/v0.60.0...v0.61.0)

### Features

* **api:** add `ACCOUNT_DELINQUENT` to `detailed_results` enum ([#312](https://github.com/lithic-com/lithic-java/issues/312)) ([2f7a283](https://github.com/lithic-com/lithic-java/commit/2f7a283c1ed7e093ba5e8847f0d2d586775d3c69))

## 0.60.0 (2024-09-23)

Full Changelog: [v0.59.0...v0.60.0](https://github.com/lithic-com/lithic-java/compare/v0.59.0...v0.60.0)

### Features

* **api:** add `canceled` to `transaction_status` enum values ([#310](https://github.com/lithic-com/lithic-java/issues/310)) ([e0d7dfc](https://github.com/lithic-com/lithic-java/commit/e0d7dfc79be405bfe1e3b80d769a9e398fdf7936))

## 0.59.0 (2024-09-19)

Full Changelog: [v0.58.1...v0.59.0](https://github.com/lithic-com/lithic-java/compare/v0.58.1...v0.59.0)

### ⚠ BREAKING CHANGES

* **api:** update model `FinancialAccount` ([#308](https://github.com/lithic-com/lithic-java/issues/308))

### Features

* **api:** update model `FinancialAccount` ([#308](https://github.com/lithic-com/lithic-java/issues/308)) ([47a3561](https://github.com/lithic-com/lithic-java/commit/47a35613b8c61bb3b2b2ad3b71759ce207624df4))

## 0.58.1 (2024-09-18)

Full Changelog: [v0.58.0...v0.58.1](https://github.com/lithic-com/lithic-java/compare/v0.58.0...v0.58.1)

### Chores

* **internal:** specify API version for each endpoints instead of hardcoded in base URLs ([#306](https://github.com/lithic-com/lithic-java/issues/306)) ([26d3b0a](https://github.com/lithic-com/lithic-java/commit/26d3b0ae5efa858680dc37501962573d88c6021d))
* **tests:** fix getEmbedURL to specify /v1/ prefix ([6659ab9](https://github.com/lithic-com/lithic-java/commit/6659ab9cd077311938b721333c2727436e49986b))

## 0.58.0 (2024-09-17)

Full Changelog: [v0.57.0...v0.58.0](https://github.com/lithic-com/lithic-java/compare/v0.57.0...v0.58.0)

### ⚠ BREAKING CHANGES

* **api:** updates book transfer status, updates to transactions, add currency model ([#305](https://github.com/lithic-com/lithic-java/issues/305))

### Features

* **api:** updates book transfer status, updates to transactions, add currency model ([#305](https://github.com/lithic-com/lithic-java/issues/305)) ([1f7d713](https://github.com/lithic-com/lithic-java/commit/1f7d71302e3d77f4e222b49ee380cbc4c537af2a))
* **client:** added structured fields to errors ([#304](https://github.com/lithic-com/lithic-java/issues/304)) ([17761b0](https://github.com/lithic-com/lithic-java/commit/17761b046af3fca3d4b9d4174c3b6230d8ba365e))


### Documentation

* adjust additional properties example ([#302](https://github.com/lithic-com/lithic-java/issues/302)) ([856180b](https://github.com/lithic-com/lithic-java/commit/856180bad6a65d3b41fa9ad1039705c05bf39200))

## 0.57.0 (2024-09-06)

Full Changelog: [v0.56.0...v0.57.0](https://github.com/lithic-com/lithic-java/compare/v0.56.0...v0.57.0)

### Features

* **api:** add tier and state to financial_accounts ([#301](https://github.com/lithic-com/lithic-java/issues/301)) ([76f3678](https://github.com/lithic-com/lithic-java/commit/76f367867e11a15bf96f06c9d7ff2400784b26cc))


### Chores

* **docs:** update description for postal codes ([#299](https://github.com/lithic-com/lithic-java/issues/299)) ([736626a](https://github.com/lithic-com/lithic-java/commit/736626aac4ddf4b7dff13b897b5a8b4aaffac47e))

## 0.56.0 (2024-09-03)

Full Changelog: [v0.55.0...v0.56.0](https://github.com/lithic-com/lithic-java/compare/v0.55.0...v0.56.0)

### Features

* **api:** declare AccountHolderBusinessResponse and remove entity_token from BusinessEntity ([#297](https://github.com/lithic-com/lithic-java/issues/297)) ([52a4f39](https://github.com/lithic-com/lithic-java/commit/52a4f39de4f4dd69a6df8d787e2cf17a01bcff60))

## 0.55.0 (2024-08-29)

Full Changelog: [v0.54.0...v0.55.0](https://github.com/lithic-com/lithic-java/compare/v0.54.0...v0.55.0)

### ⚠ BREAKING CHANGES

* **api:** add shared model Document ([#296](https://github.com/lithic-com/lithic-java/issues/296))

### Features

* **api:** add shared model Document ([#296](https://github.com/lithic-com/lithic-java/issues/296)) ([6421a0e](https://github.com/lithic-com/lithic-java/commit/6421a0ec80744b18ff57aba46cdc3afd9003c640))


### Chores

* use headless jdk for containers ([#294](https://github.com/lithic-com/lithic-java/issues/294)) ([014f899](https://github.com/lithic-com/lithic-java/commit/014f899ca1edb8ac96d07c924352b95cbe04d26e))

## 0.54.0 (2024-08-28)

Full Changelog: [v0.53.1...v0.54.0](https://github.com/lithic-com/lithic-java/compare/v0.53.1...v0.54.0)

### Features

* **api:** add 'pin status' and 'pending_commands' to Card model ([#292](https://github.com/lithic-com/lithic-java/issues/292)) ([292b3c4](https://github.com/lithic-com/lithic-java/commit/292b3c49015d63cca1b45f97577d694975b8e9d3))

## 0.53.1 (2024-08-26)

Full Changelog: [v0.53.0...v0.53.1](https://github.com/lithic-com/lithic-java/compare/v0.53.0...v0.53.1)

### Bug Fixes

* do not pass through `\` when escaping string literals ([#291](https://github.com/lithic-com/lithic-java/issues/291)) ([042bf96](https://github.com/lithic-com/lithic-java/commit/042bf9674056ffca3c878bdc683d4ad4bdfaab86))


### Chores

* **docs:** minor edits ([#289](https://github.com/lithic-com/lithic-java/issues/289)) ([f8dec8b](https://github.com/lithic-com/lithic-java/commit/f8dec8b022f0a0de3699b230e47887ddc670ba08))

## 0.53.0 (2024-08-23)

Full Changelog: [v0.52.0...v0.53.0](https://github.com/lithic-com/lithic-java/compare/v0.52.0...v0.53.0)

### Features

* **api:** add endpoints and webhooks for 3DS challenge decisions and challenges ([#287](https://github.com/lithic-com/lithic-java/issues/287)) ([a3df387](https://github.com/lithic-com/lithic-java/commit/a3df38765c7ec4487ae78a01d1f4b783fcd91309))

## 0.52.0 (2024-08-23)

Full Changelog: [v0.51.2...v0.52.0](https://github.com/lithic-com/lithic-java/compare/v0.51.2...v0.52.0)

### Features

* **api:** new book_transfer_transaction events and Settlement Report field deprecations ([#285](https://github.com/lithic-com/lithic-java/issues/285)) ([de673fe](https://github.com/lithic-com/lithic-java/commit/de673fee0f2bda8f2f5e0147e7da457b0893b4b0))

## 0.51.2 (2024-08-22)

Full Changelog: [v0.51.1...v0.51.2](https://github.com/lithic-com/lithic-java/compare/v0.51.1...v0.51.2)

### Bug Fixes

* remove additionalBodyProperties from methods that don't support request bodies ([#283](https://github.com/lithic-com/lithic-java/issues/283)) ([e49c446](https://github.com/lithic-com/lithic-java/commit/e49c4464409b65889419ab0598881ec8f0f934e2))

## 0.51.1 (2024-08-21)

Full Changelog: [v0.51.0...v0.51.1](https://github.com/lithic-com/lithic-java/compare/v0.51.0...v0.51.1)

### Bug Fixes

* **docs:** use correct putAdditionalProperty value ([#281](https://github.com/lithic-com/lithic-java/issues/281)) ([3b0e5f9](https://github.com/lithic-com/lithic-java/commit/3b0e5f9fb43ac70a572e03dfad33ca14de8574b6))

## 0.51.0 (2024-08-20)

Full Changelog: [v0.50.0...v0.51.0](https://github.com/lithic-com/lithic-java/compare/v0.50.0...v0.51.0)

### Features

* **api:** add property `next_payment_end_date` and `next_payment_due_date` to Statement model ([#280](https://github.com/lithic-com/lithic-java/issues/280)) ([a26ea58](https://github.com/lithic-com/lithic-java/commit/a26ea581309383474a9b1f9668ec32e5400dc5e3))


### Chores

* **docs:** update state description on Card ([#278](https://github.com/lithic-com/lithic-java/issues/278)) ([c68f905](https://github.com/lithic-com/lithic-java/commit/c68f905414f9252c91fdee5c08a6a639d038f798))

## 0.50.0 (2024-08-16)

Full Changelog: [v0.49.0...v0.50.0](https://github.com/lithic-com/lithic-java/compare/v0.49.0...v0.50.0)

### Features

* **api:** add StatementListParams property include_initial_statements ([#276](https://github.com/lithic-com/lithic-java/issues/276)) ([ee65441](https://github.com/lithic-com/lithic-java/commit/ee65441c4cf3fe0019246107405dfa414bbd4175))

## 0.49.0 (2024-08-14)

Full Changelog: [v0.48.0...v0.49.0](https://github.com/lithic-com/lithic-java/compare/v0.48.0...v0.49.0)

### Features

* **api:** add SettlementReport property `is_complete` ([#274](https://github.com/lithic-com/lithic-java/issues/274)) ([36ff643](https://github.com/lithic-com/lithic-java/commit/36ff6439de79e86e96ce0df17321ec0ccabcf1f4))

## 0.48.0 (2024-08-12)

Full Changelog: [v0.47.0...v0.48.0](https://github.com/lithic-com/lithic-java/compare/v0.47.0...v0.48.0)

### Features

* **api:** add property `Account.cardholderCurrency` ([#273](https://github.com/lithic-com/lithic-java/issues/273)) ([1fa76b6](https://github.com/lithic-com/lithic-java/commit/1fa76b6b13eb04f13715a1b9f2805e190af1a684))
* **api:** add property `Card.cardholderCurrency` ([1fa76b6](https://github.com/lithic-com/lithic-java/commit/1fa76b6b13eb04f13715a1b9f2805e190af1a684))
* **api:** add property `CardProgram.cardholderCurrencies` ([1fa76b6](https://github.com/lithic-com/lithic-java/commit/1fa76b6b13eb04f13715a1b9f2805e190af1a684))
* **api:** add property `CardProgram.cardholderCurrency` ([1fa76b6](https://github.com/lithic-com/lithic-java/commit/1fa76b6b13eb04f13715a1b9f2805e190af1a684))


### Chores

* **ci:** bump prism mock server version ([#271](https://github.com/lithic-com/lithic-java/issues/271)) ([29876cc](https://github.com/lithic-com/lithic-java/commit/29876cc20a6dce0d08e7d90aa265862dee9fb7b1))

## 0.47.0 (2024-08-09)

Full Changelog: [v0.46.0...v0.47.0](https://github.com/lithic-com/lithic-java/compare/v0.46.0...v0.47.0)

### ⚠ BREAKING CHANGES

* **api:** rename model property 'Statement.AccountStanding.state' to 'period_state' ([#270](https://github.com/lithic-com/lithic-java/issues/270))

### Features

* **api:** add event type 'card.reissued' ([#267](https://github.com/lithic-com/lithic-java/issues/267)) ([a9ba8d6](https://github.com/lithic-com/lithic-java/commit/a9ba8d694b9b2d46685670d6c6558819e435710e))
* **api:** add methods to simulate enrollment review and enrollment document review ([#269](https://github.com/lithic-com/lithic-java/issues/269)) ([5396ca9](https://github.com/lithic-com/lithic-java/commit/5396ca9032305f7fa7cbbb0eb0988d7c9cc1e8cf))
* **api:** rename model property 'Statement.AccountStanding.state' to 'period_state' ([#270](https://github.com/lithic-com/lithic-java/issues/270)) ([32b2597](https://github.com/lithic-com/lithic-java/commit/32b2597ccd6923c2d01c86a57d98add6fb55194d))

## 0.46.0 (2024-08-05)

Full Changelog: [v0.45.0...v0.46.0](https://github.com/lithic-com/lithic-java/compare/v0.45.0...v0.46.0)

### Features

* **api:** add event type 'statements.created' ([#265](https://github.com/lithic-com/lithic-java/issues/265)) ([f3ab648](https://github.com/lithic-com/lithic-java/commit/f3ab6485558df6b1efa611ae478e6dd2eb2e6a18))

## 0.45.0 (2024-07-30)

Full Changelog: [v0.44.0...v0.45.0](https://github.com/lithic-com/lithic-java/compare/v0.44.0...v0.45.0)

### Features

* **client:** improve binary return values ([#263](https://github.com/lithic-com/lithic-java/issues/263)) ([c74f890](https://github.com/lithic-com/lithic-java/commit/c74f890a757517bd76a7927bf5153b77e14db149))


### Chores

* **ci:** run tests in CI ([#264](https://github.com/lithic-com/lithic-java/issues/264)) ([b9ed756](https://github.com/lithic-com/lithic-java/commit/b9ed756d87b057964754a50f1dd72fc01aef4b89))
* **internal:** remove unused test file ([#261](https://github.com/lithic-com/lithic-java/issues/261)) ([d580e71](https://github.com/lithic-com/lithic-java/commit/d580e71186717291dbaa72df2de6926816dd8fe1))

## 0.44.0 (2024-07-26)

Full Changelog: [v0.43.0...v0.44.0](https://github.com/lithic-com/lithic-java/compare/v0.43.0...v0.44.0)

### Features

* **api:** add method to fetch the extended credit for a given credit product ([#260](https://github.com/lithic-com/lithic-java/issues/260)) ([92bbb89](https://github.com/lithic-com/lithic-java/commit/92bbb8902c7aba0e2d545f784fc7f31cf7928e9f))


### Chores

* **docs:** set of improvements ([#258](https://github.com/lithic-com/lithic-java/issues/258)) ([edd9482](https://github.com/lithic-com/lithic-java/commit/edd94824f3699b772793a2682db515ff9ac031e7))

## 0.43.0 (2024-07-23)

Full Changelog: [v0.42.0...v0.43.0](https://github.com/lithic-com/lithic-java/compare/v0.42.0...v0.43.0)

### ⚠ BREAKING CHANGES

* **api:** deprecate 'auth rule token' in 'card' and 'account holder' models ([#257](https://github.com/lithic-com/lithic-java/issues/257))

### Features

* **api:** deprecate 'auth rule token' in 'card' and 'account holder' models ([#257](https://github.com/lithic-com/lithic-java/issues/257)) ([45a7586](https://github.com/lithic-com/lithic-java/commit/45a7586ffb775b3dd42118e8ed6745cb44a86f92))


### Chores

* **tests:** update prism version ([#255](https://github.com/lithic-com/lithic-java/issues/255)) ([383cc43](https://github.com/lithic-com/lithic-java/commit/383cc43c95cc3eb03bfa6a877606b5585eb49f28))

## 0.42.0 (2024-07-19)

Full Changelog: [v0.41.0...v0.42.0](https://github.com/lithic-com/lithic-java/compare/v0.41.0...v0.42.0)

### Features

* **api:** add method to retrieve a transaction's enhanced commercial data ([#254](https://github.com/lithic-com/lithic-java/issues/254)) ([5e5d37d](https://github.com/lithic-com/lithic-java/commit/5e5d37d6e16328c2ec6d8452e68319cddfd78931))


### Chores

* **ci:** limit release doctor target branches ([#252](https://github.com/lithic-com/lithic-java/issues/252)) ([71508c8](https://github.com/lithic-com/lithic-java/commit/71508c82c7d49d2dbefe5f2306ff613a7b25bc6a))

## 0.41.0 (2024-07-17)

Full Changelog: [v0.40.0...v0.41.0](https://github.com/lithic-com/lithic-java/compare/v0.40.0...v0.41.0)

### Features

* **api:** updates ([#251](https://github.com/lithic-com/lithic-java/issues/251)) ([70faca6](https://github.com/lithic-com/lithic-java/commit/70faca65c6f2eea3dba615fd2bdafd35ca732c2e))


### Chores

* **docs:** minor update to formatting of API link in README ([#249](https://github.com/lithic-com/lithic-java/issues/249)) ([4bf0e0b](https://github.com/lithic-com/lithic-java/commit/4bf0e0b4f7fbd83a9c9bdf7c815ab5c085050550))

## 0.40.0 (2024-07-11)

Full Changelog: [v0.39.1...v0.40.0](https://github.com/lithic-com/lithic-java/compare/v0.39.1...v0.40.0)

### ⚠ BREAKING CHANGES

* **api:** param 'financial account token` when creating an external bank account is now required ([#247](https://github.com/lithic-com/lithic-java/issues/247))

### Features

* **api:** param 'financial account token` when creating an external bank account is now required ([#247](https://github.com/lithic-com/lithic-java/issues/247)) ([7b8108b](https://github.com/lithic-com/lithic-java/commit/7b8108be4b7e1374550b11940a3f81d9a7711e6b))

## 0.39.1 (2024-07-11)

Full Changelog: [v0.39.0...v0.39.1](https://github.com/lithic-com/lithic-java/compare/v0.39.0...v0.39.1)

### Chores

* **ci:** also run workflows for PRs targeting `next` ([#245](https://github.com/lithic-com/lithic-java/issues/245)) ([c54f42d](https://github.com/lithic-com/lithic-java/commit/c54f42dcfacd308ca991622ddc48cb336b3603d6))
* **docs:** document minimum Java version (Java 8) in README ([#244](https://github.com/lithic-com/lithic-java/issues/244)) ([a2abfe0](https://github.com/lithic-com/lithic-java/commit/a2abfe022b630885c368234d402777e943738929))
* gitignore test server logs ([#242](https://github.com/lithic-com/lithic-java/issues/242)) ([d162867](https://github.com/lithic-com/lithic-java/commit/d16286734a7dc979c021e1ca77554aba9277b3d3))


### Documentation

* **examples:** update example values ([#246](https://github.com/lithic-com/lithic-java/issues/246)) ([3a5e4b0](https://github.com/lithic-com/lithic-java/commit/3a5e4b081842ec1c391f114e28cac5223c957dc0))

## 0.39.0 (2024-06-21)

Full Changelog: [v0.38.0...v0.39.0](https://github.com/lithic-com/lithic-java/compare/v0.38.0...v0.39.0)

### ⚠ BREAKING CHANGES

* **api:** remove unused event type 'statement.created'
* **api:** remove unused business account type
* **api:** remove unused embed request params type
* **api:** updates ([#241](https://github.com/lithic-com/lithic-java/issues/241))

### Features

* **api:** add 'reverse' method for book transfers ([fbc75e3](https://github.com/lithic-com/lithic-java/commit/fbc75e3123ca33b65e78d7f5aa777b2efc5d8916))
* **api:** add field 'trace numbers' to payment method attribute model ([fbc75e3](https://github.com/lithic-com/lithic-java/commit/fbc75e3123ca33b65e78d7f5aa777b2efc5d8916))
* **api:** remove unused business account type ([fbc75e3](https://github.com/lithic-com/lithic-java/commit/fbc75e3123ca33b65e78d7f5aa777b2efc5d8916))
* **api:** remove unused embed request params type ([fbc75e3](https://github.com/lithic-com/lithic-java/commit/fbc75e3123ca33b65e78d7f5aa777b2efc5d8916))
* **api:** remove unused event type 'statement.created' ([fbc75e3](https://github.com/lithic-com/lithic-java/commit/fbc75e3123ca33b65e78d7f5aa777b2efc5d8916))
* **api:** updates ([#241](https://github.com/lithic-com/lithic-java/issues/241)) ([fbc75e3](https://github.com/lithic-com/lithic-java/commit/fbc75e3123ca33b65e78d7f5aa777b2efc5d8916))
* **client:** add support for `putQueryParam` on `ClientOptions` ([#239](https://github.com/lithic-com/lithic-java/issues/239)) ([2ed6c39](https://github.com/lithic-com/lithic-java/commit/2ed6c39b61ab95a9adb70ce6337eb94426dc9ee0))

## 0.38.0 (2024-06-12)

Full Changelog: [v0.37.0...v0.38.0](https://github.com/lithic-com/lithic-java/compare/v0.37.0...v0.38.0)

### Features

* **api:** updates ([#237](https://github.com/lithic-com/lithic-java/issues/237)) ([e37f7c1](https://github.com/lithic-com/lithic-java/commit/e37f7c16dcb61ad201f3fa48e38c08d5468a4d10))

## 0.37.0 (2024-06-05)

Full Changelog: [v0.36.2...v0.37.0](https://github.com/lithic-com/lithic-java/compare/v0.36.2...v0.37.0)

### ⚠ BREAKING CHANGES

* **api:** remove some endpoints and other API updates ([#235](https://github.com/lithic-com/lithic-java/issues/235))

### Features

* **api:** remove some endpoints and other API updates ([#235](https://github.com/lithic-com/lithic-java/issues/235)) ([aaf3ba8](https://github.com/lithic-com/lithic-java/commit/aaf3ba824662ed19162df5afff4a46cef97d8fa0))

## 0.36.2 (2024-06-03)

Full Changelog: [v0.36.1...v0.36.2](https://github.com/lithic-com/lithic-java/compare/v0.36.1...v0.36.2)

### Bug Fixes

* **examples:** numerical examples now respect [min, max] range ([#233](https://github.com/lithic-com/lithic-java/issues/233)) ([05d3f61](https://github.com/lithic-com/lithic-java/commit/05d3f61aaaa46e52c3d12d5895933a5e20349076))

## 0.36.1 (2024-05-30)

Full Changelog: [v0.36.0...v0.36.1](https://github.com/lithic-com/lithic-java/compare/v0.36.0...v0.36.1)

### Bug Fixes

* **examples:** generate correctly typed example snippets for enums ([#225](https://github.com/lithic-com/lithic-java/issues/225)) ([21db817](https://github.com/lithic-com/lithic-java/commit/21db81768b2f683554051b04f548ddb5a3a6217e))

## 0.36.0 (2024-05-30)

Full Changelog: [v0.35.0...v0.36.0](https://github.com/lithic-com/lithic-java/compare/v0.35.0...v0.36.0)

### Features

* **api:** add simulate_receipt and simulate_action endpoints ([#227](https://github.com/lithic-com/lithic-java/issues/227)) ([6c125a4](https://github.com/lithic-com/lithic-java/commit/6c125a42096459659b6b5d734fc947090c657575))
* **api:** update detailed_results enum values ([#229](https://github.com/lithic-com/lithic-java/issues/229)) ([764a1d8](https://github.com/lithic-com/lithic-java/commit/764a1d80360ef956050f3e394dfecf94d42bea43))

## 0.35.0 (2024-05-29)

Full Changelog: [v0.34.0...v0.35.0](https://github.com/lithic-com/lithic-java/compare/v0.34.0...v0.35.0)

### Features

* **api:** add simulate_receipt and simulate_action endpoints ([45e9e91](https://github.com/lithic-com/lithic-java/commit/45e9e91b51c81df391826be12c56ddb68375b760))

## 0.34.0 (2024-05-29)

Full Changelog: [v0.33.0...v0.33.1](https://github.com/lithic-com/lithic-java/compare/v0.33.0...v0.33.1)

### Bug Fixes

* **examples:** generate correctly typed example snippets for enums ([16e93fd](https://github.com/lithic-com/lithic-java/commit/16e93fd41e8f27656dd88f805726197f6d791dfa))

## 0.33.0 (2024-05-01)

Full Changelog: [v0.32.0...v0.33.0](https://github.com/lithic-com/lithic-java/compare/v0.32.0...v0.33.0)

### Features

* **api:** changes to balance-related return types and other API changes ([#210](https://github.com/lithic-com/lithic-java/issues/210)) ([765abc9](https://github.com/lithic-com/lithic-java/commit/765abc93751ccb837747909aed278e152a823553))
* **api:** updates ([#202](https://github.com/lithic-com/lithic-java/issues/202)) ([ecf291d](https://github.com/lithic-com/lithic-java/commit/ecf291d592616ae6098f8d8c92a5a7e07a9b3c06))
* **api:** updates ([#206](https://github.com/lithic-com/lithic-java/issues/206)) ([be204fd](https://github.com/lithic-com/lithic-java/commit/be204fd4a9f9e6998f6a7683b46424c63fb21cb0))
* **api:** updates ([#215](https://github.com/lithic-com/lithic-java/issues/215)) ([0548781](https://github.com/lithic-com/lithic-java/commit/05487815894082fcc2688f857c35598ac206e72b))
* **client:** implement support for multipart/form-data body requests ([#203](https://github.com/lithic-com/lithic-java/issues/203)) ([ce96c10](https://github.com/lithic-com/lithic-java/commit/ce96c108141f3047dd9b643a667a64edcefac908))


### Bug Fixes

* **client:** do not strip date-time 00 seconds when getQueryParams() is called ([#211](https://github.com/lithic-com/lithic-java/issues/211)) ([2a4cee0](https://github.com/lithic-com/lithic-java/commit/2a4cee0f66615eda7c21dbf5e2ebe254bd6b2866))
* **internal:** escape characters for POM description in gradle publish ([#212](https://github.com/lithic-com/lithic-java/issues/212)) ([8868340](https://github.com/lithic-com/lithic-java/commit/8868340af355b5f6f309d5e0e5c8fa22f66b139b))


### Chores

* add back uploadEvidence override ([272bb7f](https://github.com/lithic-com/lithic-java/commit/272bb7f1298bb1c10d8af3be21b517bd53320dc1))
* **ci:** validate Gradle wrapper ([#207](https://github.com/lithic-com/lithic-java/issues/207)) ([330e912](https://github.com/lithic-com/lithic-java/commit/330e9124c108fb6ec11cbc9a5db4bee5799a9c68))
* **internal:** add scripts/mock ([#213](https://github.com/lithic-com/lithic-java/issues/213)) ([477574c](https://github.com/lithic-com/lithic-java/commit/477574cd0bd596cc0207b51c6949c5753b36ab89))
* **internal:** bump mock server version to ~5.8.0 ([#214](https://github.com/lithic-com/lithic-java/issues/214)) ([961f319](https://github.com/lithic-com/lithic-java/commit/961f319f0e343ac9b4ba440097e9a1ef39bfe87f))
* **internal:** formatting ([#204](https://github.com/lithic-com/lithic-java/issues/204)) ([ebf705c](https://github.com/lithic-com/lithic-java/commit/ebf705cae57cfd8625fe677099c189c3964dbc17))
* **internal:** gradlew v8.7, use gradle task config avoidance APIs ([#208](https://github.com/lithic-com/lithic-java/issues/208)) ([9060f8f](https://github.com/lithic-com/lithic-java/commit/9060f8f5a150c81b38d40afab25a01e47d8a75b4))
* **internal:** use actions/checkout@v4 for codeflow ([#209](https://github.com/lithic-com/lithic-java/issues/209)) ([c00bd1d](https://github.com/lithic-com/lithic-java/commit/c00bd1d1b7cbef9a9d1ebaaa920a601252d7944a))
* temporarily remove custom code ([e98573c](https://github.com/lithic-com/lithic-java/commit/e98573cf90199028a5280e982c16ff19f5bfe86b))
* **tests:** import wiremock.client.WireMock.put ([#200](https://github.com/lithic-com/lithic-java/issues/200)) ([ffdcfaf](https://github.com/lithic-com/lithic-java/commit/ffdcfaf2e2d960f255a888e9cdb932fd7896c966))


### Build System

* configure UTF-8 locale in devcontainer ([#205](https://github.com/lithic-com/lithic-java/issues/205)) ([cbef1d4](https://github.com/lithic-com/lithic-java/commit/cbef1d4802bf40321ca9ca979cd175ca78b60184))

## 0.32.0 (2024-04-05)

Full Changelog: [v0.31.0...v0.32.0](https://github.com/lithic-com/lithic-java/compare/v0.31.0...v0.32.0)

### Features

* **api:** add detailed result CARD_NOT_ACTIVATED ([#198](https://github.com/lithic-com/lithic-java/issues/198)) ([35b805c](https://github.com/lithic-com/lithic-java/commit/35b805cf99f56ed225b8562a5f36f30b6086ad2d))
* **api:** add event type digital_wallet.tokenization_two_factor_authentication_code_sent ([#193](https://github.com/lithic-com/lithic-java/issues/193)) ([fa8644c](https://github.com/lithic-com/lithic-java/commit/fa8644c507647d445da2c88afbf68c7d9534db05))
* **api:** add params spend_limit and spend_velocity ([#197](https://github.com/lithic-com/lithic-java/issues/197)) ([f168da0](https://github.com/lithic-com/lithic-java/commit/f168da090ebb110cb7cd424d2c3c7fd6f6c983dd))
* **api:** add settlement_report.updated enum ([#188](https://github.com/lithic-com/lithic-java/issues/188)) ([72ee6c5](https://github.com/lithic-com/lithic-java/commit/72ee6c5353bac3114466aeff9a187f98b0756ccb))
* **api:** update financial transaction status enum ([#191](https://github.com/lithic-com/lithic-java/issues/191)) ([986ecb4](https://github.com/lithic-com/lithic-java/commit/986ecb4fee9af7746875c0f9df6ad957b93989c7))
* **api:** update link to encrypted PIN block docs ([#199](https://github.com/lithic-com/lithic-java/issues/199)) ([a815440](https://github.com/lithic-com/lithic-java/commit/a815440ee748a9dfaf165622d60ca5ccf9ae7bfa))
* **api:** updates ([#190](https://github.com/lithic-com/lithic-java/issues/190)) ([b29a277](https://github.com/lithic-com/lithic-java/commit/b29a277d02248ecc517772c2c42a4b48a9c1014a))


### Chores

* **deps:** update jackson to v2.14.3 ([#194](https://github.com/lithic-com/lithic-java/issues/194)) ([9482f43](https://github.com/lithic-com/lithic-java/commit/9482f435e2af0db1af3788bbaa07c1f4159654bb))
* **deps:** update junit5 to v5.9.3 ([#196](https://github.com/lithic-com/lithic-java/issues/196)) ([c80ac48](https://github.com/lithic-com/lithic-java/commit/c80ac48b88574cbecc2458099dcc6efb7d662916))
* **deps:** update kotlin-gradle-plugin to v1.9.23 ([#195](https://github.com/lithic-com/lithic-java/issues/195)) ([18c1542](https://github.com/lithic-com/lithic-java/commit/18c1542780cec2c3a2b055ab7fbbefd4cc52d5ab))

## 0.31.0 (2024-03-21)

Full Changelog: [v0.30.0...v0.31.0](https://github.com/lithic-com/lithic-java/compare/v0.30.0...v0.31.0)

### Features

* add HttpRequestBody.contentLength() ([#180](https://github.com/lithic-com/lithic-java/issues/180)) ([698e235](https://github.com/lithic-com/lithic-java/commit/698e23567ffc8ff173894e5626ab84b9580bcdf1))
* **api:** adds closed state ([#187](https://github.com/lithic-com/lithic-java/issues/187)) ([232277a](https://github.com/lithic-com/lithic-java/commit/232277af6ef161f108daa48589823c34efbda6f9))
* **api:** updates ([#186](https://github.com/lithic-com/lithic-java/issues/186)) ([2749351](https://github.com/lithic-com/lithic-java/commit/274935112e836c984352b470627c2359f43caccc))


### Chores

* add back removed code ([9965596](https://github.com/lithic-com/lithic-java/commit/99655967238020ff205d2812c48c93253b7f30f5))
* **docs:** add back custom readme code ([9361669](https://github.com/lithic-com/lithic-java/commit/9361669cb3f182827eb14336698ceaa5e4a4a3be))
* **docs:** temporarily remove custom readme code ([#183](https://github.com/lithic-com/lithic-java/issues/183)) ([ccda207](https://github.com/lithic-com/lithic-java/commit/ccda207ebcffb9344e427ae0e417b84c4489c4a3))
* temporarily remove various code as part of refactor ([#184](https://github.com/lithic-com/lithic-java/issues/184)) ([2023541](https://github.com/lithic-com/lithic-java/commit/202354150ffb3786029e17d92069de9e2018be62))


### Documentation

* **readme:** consistent use of sentence case in headings ([#185](https://github.com/lithic-com/lithic-java/issues/185)) ([15801dc](https://github.com/lithic-com/lithic-java/commit/15801dcd42824d272576e3db006748091937e05f))

## 0.30.0 (2024-03-05)

Full Changelog: [v0.29.0...v0.30.0](https://github.com/lithic-com/lithic-java/compare/v0.29.0...v0.30.0)

### Features

* **api:** tokenizations ([#177](https://github.com/lithic-com/lithic-java/issues/177)) ([12c5264](https://github.com/lithic-com/lithic-java/commit/12c52647d35ce9408805f71f31a3abf99f5be39a))
* **api:** updates ([#178](https://github.com/lithic-com/lithic-java/issues/178)) ([aee41c6](https://github.com/lithic-com/lithic-java/commit/aee41c639d51c73a9a5504e3b381011696f4664d))


### Chores

* add api.md ([#179](https://github.com/lithic-com/lithic-java/issues/179)) ([0c35055](https://github.com/lithic-com/lithic-java/commit/0c350554fcbb9421b9421cc5fa92361e68e2ac87))
* **ci:** update actions/setup-java action to v4 ([#171](https://github.com/lithic-com/lithic-java/issues/171)) ([83830bc](https://github.com/lithic-com/lithic-java/commit/83830bc19d675ca9e2deb5d319e200a09add39d7))
* **internal:** update deps ([#169](https://github.com/lithic-com/lithic-java/issues/169)) ([3ba398a](https://github.com/lithic-com/lithic-java/commit/3ba398a28cf0624da72d712dcb2507e6875d50c9))
* update dependency com.diffplug.spotless:spotless-plugin-gradle to v6.25.0 ([#173](https://github.com/lithic-com/lithic-java/issues/173)) ([2708ed7](https://github.com/lithic-com/lithic-java/commit/2708ed774b4b3041ee9031fd949bb426247d7f8e))
* update dependency com.github.tomakehurst:wiremock-jre8 to v2.35.2 ([#176](https://github.com/lithic-com/lithic-java/issues/176)) ([f4a9875](https://github.com/lithic-com/lithic-java/commit/f4a987543eec6ba921a6d1fa5669f383a53282fa))
* update dependency com.google.guava:guava to v33 ([#174](https://github.com/lithic-com/lithic-java/issues/174)) ([e6edce2](https://github.com/lithic-com/lithic-java/commit/e6edce2050523c8686011a214d9f49be77c86993))
* update dependency com.squareup.okhttp3:okhttp to v4.12.0 ([#172](https://github.com/lithic-com/lithic-java/issues/172)) ([2be1424](https://github.com/lithic-com/lithic-java/commit/2be14243904bb06757643cbfec9461443bf6c7b9))
* update dependency org.apache.httpcomponents.client5:httpclient5 to v5.3.1 ([#170](https://github.com/lithic-com/lithic-java/issues/170)) ([af9f5a3](https://github.com/lithic-com/lithic-java/commit/af9f5a35327c5d0185d5a41caf6e16be6c37f672))
* update dependency org.assertj:assertj-core to v3.25.3 ([#167](https://github.com/lithic-com/lithic-java/issues/167)) ([e5cebab](https://github.com/lithic-com/lithic-java/commit/e5cebabdf71f873d6712baa0b07959d420eb5384))
* update dependency org.assertj:assertj-guava to v3.25.3 ([#168](https://github.com/lithic-com/lithic-java/issues/168)) ([b7398b7](https://github.com/lithic-com/lithic-java/commit/b7398b79f7d442ae5d2ba7e193bc892540339912))
* update dependency org.slf4j:slf4j-simple to v1.7.36 ([#165](https://github.com/lithic-com/lithic-java/issues/165)) ([9a118d3](https://github.com/lithic-com/lithic-java/commit/9a118d3e5da59d2ae1d870daa7c2238f82900e19))
* update dependency org.slf4j:slf4j-simple to v2 ([#175](https://github.com/lithic-com/lithic-java/issues/175)) ([cb4c68e](https://github.com/lithic-com/lithic-java/commit/cb4c68e77d4eced0753f89905b46640c35fa7b60))

## 0.29.0 (2024-02-22)

Full Changelog: [v0.28.1...v0.29.0](https://github.com/lithic-com/lithic-java/compare/v0.28.1...v0.29.0)

### Features

* **api:** create financial account and retry microdeposits endpoints ([#163](https://github.com/lithic-com/lithic-java/issues/163)) ([d9cafd6](https://github.com/lithic-com/lithic-java/commit/d9cafd6f1944e9aec54d8a6603c3ca77f342345e))
* **api:** update financial_account_type and documentation ([#162](https://github.com/lithic-com/lithic-java/issues/162)) ([b30ed81](https://github.com/lithic-com/lithic-java/commit/b30ed8192e18a8aaac8e74da9521203e7fa01e75))


### Chores

* **internal:** refactor release environment script ([#159](https://github.com/lithic-com/lithic-java/issues/159)) ([f57f00d](https://github.com/lithic-com/lithic-java/commit/f57f00dcc0528ea707f3f2c48864e19f78e1080f))
* update dependency org.apache.httpcomponents.core5:httpcore5 to v5.2.4 ([#164](https://github.com/lithic-com/lithic-java/issues/164)) ([a98d5ba](https://github.com/lithic-com/lithic-java/commit/a98d5ba599f43e436391dfd97b1b528022b690c3))

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
