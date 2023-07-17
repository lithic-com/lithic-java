# Changelog

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
