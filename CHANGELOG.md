# Changelog

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
