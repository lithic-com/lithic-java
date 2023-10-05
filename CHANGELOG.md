# Changelog

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
