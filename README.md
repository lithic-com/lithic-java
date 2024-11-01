# Lithic Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.lithic.api/lithic-java)](https://central.sonatype.com/artifact/com.lithic.api/lithic-java/0.68.0)

<!-- x-release-please-end -->

The Lithic Java SDK provides convenient access to the Lithic REST API from applications written in Java. It includes helper classes with helpful types and documentation for every request and response property.

The Lithic Java SDK is similar to the Lithic Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

## Documentation

The REST API documentation can be found on [docs.lithic.com](https://docs.lithic.com).

---

## Getting started

### Install dependencies

#### Gradle

<!-- x-release-please-start-version -->

```kotlin
implementation("com.lithic.api:lithic-java:0.68.0")
```

#### Maven

```xml
<dependency>
    <groupId>com.lithic.api</groupId>
    <artifactId>lithic-java</artifactId>
    <version>0.68.0</version>
</dependency>
```

<!-- x-release-please-end -->

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

To create a new card, first use the `CardCreateParams` builder to specify attributes,
then pass that to the `create` method of the `cards` service.

```java
import com.lithic.api.models.Card;
import com.lithic.api.models.CardCreateParams;

CardCreateParams params = CardCreateParams.builder()
    .type(CardCreateParams.Type.SINGLE_USE)
    .build();
Card card = client.cards().create(params);
```

### Example: listing resources

The Lithic API provides a `list` method to get a paginated list of cards.
You can retrieve the first page by:

```java
import com.lithic.api.models.Card;
import com.lithic.api.models.Page;

CardListPage page = client.cards().list();
for (Card card : page.data()) {
    System.out.println(card);
}
```

See [Pagination](#pagination) below for more information on transparently working with lists of objects without worrying about fetching each page.

---

## Enums

The Lithic SDK generates wrapper classes for all enum properties in the API. You can read and write these
values directly using the static instances of the class:

```java
// Read an enum property
if (card.state().equals(Card.State.CLOSED)) {
  // ...
}

// Write an enum property
card.builder().state(Card.State.CLOSED).build();
```

Over time, the Lithic API may add new values to the property that are not yet represented by the enum type in
this SDK. If an unrecognized value is found, the enum is set to a special sentinel value `_UNKNOWN` and you can use `asString` to read the string that was received:

```java
switch (card.state().value()) {
    case Card.State.Value.CLOSED:
        // ... handle recognized enum values
        break;
    ...
    case Card.State.Value._UNKNOWN:
        String cardState = card.state().asString();
        // ... handle unrecognized enum value as string
        break;
}
```

To write an unrecognized enum value, pass a string to the wrapper class's `of` constructor method:

```java
Card.builder().state(State.of("NEW_STATE")).build()
```

## Requests

### Parameters and bodies

To make a request to the Lithic API, you generally build an instance of the appropriate `Params` class.

In [Example: creating a resource](#example-creating-a-resource) above, we used the `CardCreateParams.builder()` to pass to
the `create` method of the `cards` service.

Sometimes, the API may support other properties that are not yet supported in the Java SDK types. In that case,
you can attach them using the `putAdditionalProperty` method.

```java
import com.lithic.api.models.core.JsonValue;
CardCreateParams params = CardCreateParams.builder()
    // ... normal properties
    .putAdditionalProperty("secret_param", JsonValue.from("4242"))
    .build();
```

## Responses

### Response validation

When receiving a response, the Lithic Java SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Java type. If you directly access the mistaken property, the SDK will throw an unchecked `LithicInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```java
Card card = client.cards().create().validate();
```

### Nullable Properties

Model properties that are optional or allow a null value are represented as `Optional`. The empty case can represent either that the field was provided as null, or that it was simply not present.

```java
// Card.cvv() returns Optional<String>
card.cvv().isPresent(); // false;
```

### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by
this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```java
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
JsonValue secret = address._additionalProperties().get("secret_field");
```

---

## Pagination

For methods that return a paginated list of results, this library provides convenient ways access
the results either one page at a time, or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, you can use `autoPager`,
which automatically handles fetching more pages for you:

### Synchronous

```java
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

If none of the above helpers meet your needs, you can also manually request pages one-by-one.
A page of results has a `data()` method to fetch the list of objects, as well as top-level
`response` and other methods to fetch top-level data about the page. It also has methods
`hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```java
CardListPage page = client.cards().list(params);
while (page != null) {
    for (Card card : page.data()) {
        System.out.println(card);
    }

    page = page.getNextPage().orElse(null);
}
```

---

---

## Webhook Verification

We provide helper methods for verifying that a webhook request came from Lithic, and not a malicious third party.

You can use `lithic.webhooks().verifySignature(body, headers, secret?)` or `lithic.webhooks().unwrap(body, headers, secret?)`,
both of which will raise an error if the signature is invalid.

Note that the "body" parameter must be the raw JSON string sent from the server (do not parse it first).
The `.unwrap()` method can parse this JSON for you.

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

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 408 Request Timeout, 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default.
You can provide a `maxRetries` on the client builder to configure this:

```java
LithicClient client = LithicOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default. You can configure this on the client builder:

```java
LithicClient client = LithicOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

Requests can be routed through a proxy. You can configure this on the client builder:

```java
LithicClient client = LithicOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
        Type.HTTP,
        new InetSocketAddress("proxy.com", 8080)
    ))
    .build();
```

### Environments

Requests are made to the production environment by default. You can connect to other environments, like `sandbox`, via the client builder:

```java
LithicClient client = LithicOkHttpClient.builder()
    .fromEnv()
    .sandbox()
    .build();
```

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals)_.
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/lithic-com/lithic-java/issues) with questions, bugs, or suggestions.

## Requirements

This library requires Java 8 or later.
