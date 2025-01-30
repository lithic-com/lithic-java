# Lithic Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.lithic.api/lithic-java)](https://central.sonatype.com/artifact/com.lithic.api/lithic-java/0.33.0)

<!-- x-release-please-end -->

The Lithic Java SDK provides convenient access to the Lithic REST API from applications written in Java.

The Lithic Java SDK is similar to the Lithic Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

The REST API documentation can be found on [docs.lithic.com](https://docs.lithic.com).

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.lithic.api:lithic-java:0.33.0")
```

### Maven

```xml
<dependency>
    <groupId>com.lithic.api</groupId>
    <artifactId>lithic-java</artifactId>
    <version>0.33.0</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

### Configure the client

Use `LithicOkHttpClient.builder()` to configure the client. At a minimum you need to set `.apiKey()`:

```java
import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;

LithicClient client = LithicOkHttpClient.builder()
    .apiKey("My Lithic API Key")
    .build();
```

Alternately, set the environment with `LITHIC_API_KEY` or `LITHIC_WEBHOOK_SECRET`, and use `LithicOkHttpClient.fromEnv()` to read from the environment.

```java
import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;

LithicClient client = LithicOkHttpClient.fromEnv();

// Note: you can also call fromEnv() from the client builder, for example if you need to set additional properties
LithicClient client = LithicOkHttpClient.builder()
    .fromEnv()
    // ... set properties on the builder
    .build();
```

| Property      | Environment variable    | Required | Default value |
| ------------- | ----------------------- | -------- | ------------- |
| apiKey        | `LITHIC_API_KEY`        | true     | —             |
| webhookSecret | `LITHIC_WEBHOOK_SECRET` | false    | —             |

Read the documentation for more configuration options.

---

### Example: creating a resource

To create a new card, first use the `CardCreateParams` builder to specify attributes, then pass that to the `create` method of the `cards` service.

```java
import com.lithic.api.models.Card;
import com.lithic.api.models.CardCreateParams;

CardCreateParams params = CardCreateParams.builder()
    .type(CardCreateParams.Type.SINGLE_USE)
    .build();
Card card = client.cards().create(params);
```

### Example: listing resources

The Lithic API provides a `list` method to get a paginated list of cards. You can retrieve the first page by:

```java
import com.lithic.api.models.Card;
import com.lithic.api.models.CardListPage;

CardListPage page = client.cards().list();
for (Card card : page.data()) {
    System.out.println(card);
}
```

Use the `CardListParams` builder to set parameters:

```java
import com.lithic.api.models.CardListPage;
import com.lithic.api.models.CardListParams;
import java.time.OffsetDateTime;

CardListParams params = CardListParams.builder()
    .accountToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    .begin(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    .endingBefore("ending_before")
    .pageSize(1L)
    .startingAfter("starting_after")
    .state(CardListParams.State.CLOSED)
    .build();
CardListPage page1 = client.cards().list(params);

// Using the `from` method of the builder you can reuse previous params values:
CardListPage page2 = client.cards().list(CardListParams.builder()
    .from(params)
    .build());

// Or easily get params for the next page by using the helper `getNextPageParams`:
CardListPage page3 = client.cards().list(params.getNextPageParams(page2));
```

See [Pagination](#pagination) below for more information on transparently working with lists of objects without worrying about fetching each page.

---

## Requests

### Parameters and bodies

To make a request to the Lithic API, you generally build an instance of the appropriate `Params` class.

See [Undocumented request params](#undocumented-request-params) for how to send arbitrary parameters.

## Responses

### Response validation

When receiving a response, the Lithic Java SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Java type. If you directly access the mistaken property, the SDK will throw an unchecked `LithicInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```java
import com.lithic.api.models.Card;

Card card = client.cards().create().validate();
```

### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```java
import com.lithic.api.core.JsonField;
import java.util.Optional;

JsonField field = responseObj._field();

if (field.isMissing()) {
  // Value was not specified in the JSON response
} else if (field.isNull()) {
  // Value was provided as a literal null
} else {
  // See if value was provided as a string
  Optional<String> jsonString = field.asString();

  // If the value given by the API did not match the shape that the SDK expects
  // you can deserialise into a custom type
  MyClass myObj = responseObj._field().asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Additional model properties

Sometimes, the server response may include additional properties that are not yet available in this library's types. You can access them using the model's `_additionalProperties` method:

```java
import com.lithic.api.core.JsonValue;

JsonValue secret = address._additionalProperties().get("secret_field");
```

---

## Pagination

For methods that return a paginated list of results, this library provides convenient ways access the results either one page at a time, or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, you can use `autoPager`, which automatically handles fetching more pages for you:

### Synchronous

```java
import com.lithic.api.models.Card;
import com.lithic.api.models.CardListPage;

// As an Iterable:
CardListPage page = client.cards().list(params);
for (Card card : page.autoPager()) {
    System.out.println(card);
};

// As a Stream:
client.cards().list(params).autoPager().stream()
    .limit(50)
    .forEach(card -> System.out.println(card));
```

### Asynchronous

```java
// Using forEach, which returns CompletableFuture<Void>:
asyncClient.cards().list(params).autoPager()
    .forEach(card -> System.out.println(card), executor);
```

### Manual pagination

If none of the above helpers meet your needs, you can also manually request pages one-by-one. A page of results has a `data()` method to fetch the list of objects, as well as top-level `response` and other methods to fetch top-level data about the page. It also has methods `hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```java
import com.lithic.api.models.Card;
import com.lithic.api.models.CardListPage;

CardListPage page = client.cards().list(params);
while (page != null) {
    for (Card card : page.data()) {
        System.out.println(card);
    }

    page = page.getNextPage().orElse(null);
}
```

---

## Error handling

This library throws exceptions in a single hierarchy for easy handling:

- **`LithicException`** - Base exception for all exceptions

- **`LithicServiceException`** - HTTP errors with a well-formed response body we were able to parse. The exception message and the `.debuggingRequestId()` will be set by the server.

  | 400    | BadRequestException           |
  | ------ | ----------------------------- |
  | 401    | AuthenticationException       |
  | 403    | PermissionDeniedException     |
  | 404    | NotFoundException             |
  | 422    | UnprocessableEntityException  |
  | 429    | RateLimitException            |
  | 5xx    | InternalServerException       |
  | others | UnexpectedStatusCodeException |

- **`LithicIoException`** - I/O networking errors
- **`LithicInvalidDataException`** - any other exceptions on the client side, e.g.:
  - We failed to serialize the request body
  - We failed to parse the response body (has access to response code and body)

## Network options

### Retries

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 408 Request Timeout, 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default. You can provide a `maxRetries` on the client builder to configure this:

```java
import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;

LithicClient client = LithicOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default. You can configure this on the client builder:

```java
import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;
import java.time.Duration;

LithicClient client = LithicOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

Requests can be routed through a proxy. You can configure this on the client builder:

```java
import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

LithicClient client = LithicOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("example.com", 8080)))
    .build();
```

### Environments

Requests are made to the production environment by default. You can connect to other environments, like `sandbox`, via the client builder:

```java
import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;

LithicClient client = LithicOkHttpClient.builder()
    .fromEnv()
    .sandbox()
    .build();
```

## Making custom/undocumented requests

This library is typed for convenient access to the documented API. If you need to access undocumented params or response properties, the library can still be used.

### Undocumented request params

In [Example: creating a resource](#example-creating-a-resource) above, we used the `CardCreateParams.builder()` to pass to the `create` method of the `cards` service.

Sometimes, the API may support other properties that are not yet supported in the Java SDK types. In that case, you can attach them using raw setters:

```java
import com.lithic.api.core.JsonValue;
import com.lithic.api.models.CardCreateParams;

CardCreateParams params = CardCreateParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

You can also use the `putAdditionalProperty` method on nested headers, query params, or body objects.

### Undocumented response properties

To access undocumented response properties, you can use `res._additionalProperties()` on a response object to get a map of untyped fields of type `Map<String, JsonValue>`. You can then access fields like `res._additionalProperties().get("secret_prop").asString()` or use other helpers defined on the `JsonValue` class to extract it to a desired type.

## Logging

We use the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

You can enable logging by setting the environment variable `LITHIC_LOG` to `info`.

```sh
$ export LITHIC_LOG=info
```

Or to `debug` for more verbose logging.

```sh
$ export LITHIC_LOG=debug
```

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/lithic-com/lithic-java/issues) with questions, bugs, or suggestions.
