# Lithic Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.lithic.api/lithic-java)](https://central.sonatype.com/artifact/com.lithic.api/lithic-java/0.89.1)
[![javadoc](https://javadoc.io/badge2/com.lithic.api/lithic-java/0.89.1/javadoc.svg)](https://javadoc.io/doc/com.lithic.api/lithic-java/0.89.1)

<!-- x-release-please-end -->

The Lithic Java SDK provides convenient access to the [Lithic REST API](https://docs.lithic.com) from applications written in Java.

The Lithic Java SDK is similar to the Lithic Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

<!-- x-release-please-start-version -->

The REST API documentation can be found on [docs.lithic.com](https://docs.lithic.com). Javadocs are available on [javadoc.io](https://javadoc.io/doc/com.lithic.api/lithic-java/0.89.1).

<!-- x-release-please-end -->

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.lithic.api:lithic-java:0.89.1")
```

### Maven

```xml
<dependency>
  <groupId>com.lithic.api</groupId>
  <artifactId>lithic-java</artifactId>
  <version>0.89.1</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```java
import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;
import com.lithic.api.models.Card;
import com.lithic.api.models.CardCreateParams;

// Configures using the `LITHIC_API_KEY`, `LITHIC_WEBHOOK_SECRET` and `LITHIC_BASE_URL` environment variables
LithicClient client = LithicOkHttpClient.fromEnv();

CardCreateParams params = CardCreateParams.builder()
    .type(CardCreateParams.Type.SINGLE_USE)
    .build();
Card card = client.cards().create(params);
```

## Client configuration

Configure the client using environment variables:

```java
import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;

// Configures using the `LITHIC_API_KEY`, `LITHIC_WEBHOOK_SECRET` and `LITHIC_BASE_URL` environment variables
LithicClient client = LithicOkHttpClient.fromEnv();
```

Or manually:

```java
import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;

LithicClient client = LithicOkHttpClient.builder()
    .apiKey("My Lithic API Key")
    .build();
```

Or using a combination of the two approaches:

```java
import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;

LithicClient client = LithicOkHttpClient.builder()
    // Configures using the `LITHIC_API_KEY`, `LITHIC_WEBHOOK_SECRET` and `LITHIC_BASE_URL` environment variables
    .fromEnv()
    .apiKey("My Lithic API Key")
    .build();
```

See this table for the available options:

| Setter          | Environment variable    | Required | Default value              |
| --------------- | ----------------------- | -------- | -------------------------- |
| `apiKey`        | `LITHIC_API_KEY`        | true     | -                          |
| `webhookSecret` | `LITHIC_WEBHOOK_SECRET` | false    | -                          |
| `baseUrl`       | `LITHIC_BASE_URL`       | true     | `"https://api.lithic.com"` |

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

## Requests and responses

To send a request to the Lithic API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Java class.

For example, `client.cards().create(...)` should be called with an instance of `CardCreateParams`, and it will return an instance of `Card`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```java
import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;
import com.lithic.api.models.Card;
import com.lithic.api.models.CardCreateParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `LITHIC_API_KEY`, `LITHIC_WEBHOOK_SECRET` and `LITHIC_BASE_URL` environment variables
LithicClient client = LithicOkHttpClient.fromEnv();

CardCreateParams params = CardCreateParams.builder()
    .type(CardCreateParams.Type.SINGLE_USE)
    .build();
CompletableFuture<Card> card = client.async().cards().create(params);
```

Or create an asynchronous client from the beginning:

```java
import com.lithic.api.client.LithicClientAsync;
import com.lithic.api.client.okhttp.LithicOkHttpClientAsync;
import com.lithic.api.models.Card;
import com.lithic.api.models.CardCreateParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `LITHIC_API_KEY`, `LITHIC_WEBHOOK_SECRET` and `LITHIC_BASE_URL` environment variables
LithicClientAsync client = LithicOkHttpClientAsync.fromEnv();

CardCreateParams params = CardCreateParams.builder()
    .type(CardCreateParams.Type.SINGLE_USE)
    .build();
CompletableFuture<Card> card = client.cards().create(params);
```

The asynchronous client supports the same options as the synchronous one, except most methods return `CompletableFuture`s.

## Raw responses

The SDK defines methods that deserialize responses into instances of Java classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```java
import com.lithic.api.core.http.Headers;
import com.lithic.api.core.http.HttpResponseFor;
import com.lithic.api.models.Card;
import com.lithic.api.models.CardCreateParams;

CardCreateParams params = CardCreateParams.builder()
    .type(CardCreateParams.Type.SINGLE_USE)
    .build();
HttpResponseFor<Card> card = client.cards().withRawResponse().create(params);

int statusCode = card.statusCode();
Headers headers = card.headers();
```

You can still deserialize the response into an instance of a Java class if needed:

```java
import com.lithic.api.models.Card;

Card parsedCard = card.parse();
```

## Error handling

The SDK throws custom unchecked exception types:

- [`LithicServiceException`](lithic-java-core/src/main/kotlin/com/lithic/api/errors/LithicServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                                  |
  | ------ | -------------------------------------------------------------------------------------------------------------------------- |
  | 400    | [`BadRequestException`](lithic-java-core/src/main/kotlin/com/lithic/api/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](lithic-java-core/src/main/kotlin/com/lithic/api/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](lithic-java-core/src/main/kotlin/com/lithic/api/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](lithic-java-core/src/main/kotlin/com/lithic/api/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](lithic-java-core/src/main/kotlin/com/lithic/api/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](lithic-java-core/src/main/kotlin/com/lithic/api/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](lithic-java-core/src/main/kotlin/com/lithic/api/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](lithic-java-core/src/main/kotlin/com/lithic/api/errors/UnexpectedStatusCodeException.kt) |

- [`LithicIoException`](lithic-java-core/src/main/kotlin/com/lithic/api/errors/LithicIoException.kt): I/O networking errors.

- [`LithicInvalidDataException`](lithic-java-core/src/main/kotlin/com/lithic/api/errors/LithicInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`LithicException`](lithic-java-core/src/main/kotlin/com/lithic/api/errors/LithicException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Pagination

The SDK defines methods that return a paginated lists of results. It provides convenient ways to access the results either one page at a time or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, use the `autoPager()` method, which automatically fetches more pages as needed.

When using the synchronous client, the method returns an [`Iterable`](https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html)

```java
import com.lithic.api.models.CardListPage;
import com.lithic.api.models.NonPciCard;

CardListPage page = client.cards().list();

// Process as an Iterable
for (NonPciCard card : page.autoPager()) {
    System.out.println(card);
}

// Process as a Stream
page.autoPager()
    .stream()
    .limit(50)
    .forEach(card -> System.out.println(card));
```

When using the asynchronous client, the method returns an [`AsyncStreamResponse`](lithic-java-core/src/main/kotlin/com/lithic/api/core/http/AsyncStreamResponse.kt):

```java
import com.lithic.api.core.http.AsyncStreamResponse;
import com.lithic.api.models.CardListPageAsync;
import com.lithic.api.models.NonPciCard;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

CompletableFuture<CardListPageAsync> pageFuture = client.async().cards().list();

pageFuture.thenRun(page -> page.autoPager().subscribe(card -> {
    System.out.println(card);
}));

// If you need to handle errors or completion of the stream
pageFuture.thenRun(page -> page.autoPager().subscribe(new AsyncStreamResponse.Handler<>() {
    @Override
    public void onNext(NonPciCard card) {
        System.out.println(card);
    }

    @Override
    public void onComplete(Optional<Throwable> error) {
        if (error.isPresent()) {
            System.out.println("Something went wrong!");
            throw new RuntimeException(error.get());
        } else {
            System.out.println("No more!");
        }
    }
}));

// Or use futures
pageFuture.thenRun(page -> page.autoPager()
    .subscribe(card -> {
        System.out.println(card);
    })
    .onCompleteFuture()
    .whenComplete((unused, error) -> {
        if (error != null) {
            System.out.println("Something went wrong!");
            throw new RuntimeException(error);
        } else {
            System.out.println("No more!");
        }
    }));
```

### Manual pagination

To access individual page items and manually request the next page, use the `items()`,
`hasNextPage()`, and `nextPage()` methods:

```java
import com.lithic.api.models.CardListPage;
import com.lithic.api.models.NonPciCard;

CardListPage page = client.cards().list();
while (true) {
    for (NonPciCard card : page.items()) {
        System.out.println(card);
    }

    if (!page.hasNextPage()) {
        break;
    }

    page = page.nextPage();
}
```

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `LITHIC_LOG` environment variable to `info`:

```sh
$ export LITHIC_LOG=info
```

Or to `debug` for more verbose logging:

```sh
$ export LITHIC_LOG=debug
```

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`LithicOkHttpClient`](lithic-java-client-okhttp/src/main/kotlin/com/lithic/api/client/okhttp/LithicOkHttpClient.kt) or [`LithicOkHttpClientAsync`](lithic-java-client-okhttp/src/main/kotlin/com/lithic/api/client/okhttp/LithicOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a response.

To set a custom number of retries, configure the client using the `maxRetries` method:

```java
import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;

LithicClient client = LithicOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```java
import com.lithic.api.models.Card;

Card card = client.cards().create(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
);
```

Or configure the default for all method calls at the client level:

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

To route requests through a proxy, configure the client using the `proxy` method:

```java
import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

LithicClient client = LithicOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
      Proxy.Type.HTTP, new InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build();
```

### Environments

The SDK sends requests to the production by default. To send requests to a different environment, configure the client like so:

```java
import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;

LithicClient client = LithicOkHttpClient.builder()
    .fromEnv()
    .sandbox()
    .build();
```

### Custom HTTP client

The SDK consists of three artifacts:

- `lithic-java-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`LithicClient`](lithic-java-core/src/main/kotlin/com/lithic/api/client/LithicClient.kt), [`LithicClientAsync`](lithic-java-core/src/main/kotlin/com/lithic/api/client/LithicClientAsync.kt), [`LithicClientImpl`](lithic-java-core/src/main/kotlin/com/lithic/api/client/LithicClientImpl.kt), and [`LithicClientAsyncImpl`](lithic-java-core/src/main/kotlin/com/lithic/api/client/LithicClientAsyncImpl.kt), all of which can work with any HTTP client
- `lithic-java-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`LithicOkHttpClient`](lithic-java-client-okhttp/src/main/kotlin/com/lithic/api/client/okhttp/LithicOkHttpClient.kt) and [`LithicOkHttpClientAsync`](lithic-java-client-okhttp/src/main/kotlin/com/lithic/api/client/okhttp/LithicOkHttpClientAsync.kt), which provide a way to construct [`LithicClientImpl`](lithic-java-core/src/main/kotlin/com/lithic/api/client/LithicClientImpl.kt) and [`LithicClientAsyncImpl`](lithic-java-core/src/main/kotlin/com/lithic/api/client/LithicClientAsyncImpl.kt), respectively, using OkHttp
- `lithic-java`
  - Depends on and exposes the APIs of both `lithic-java-core` and `lithic-java-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`lithic-java` dependency](#installation) with `lithic-java-core`
2. Copy `lithic-java-client-okhttp`'s [`OkHttpClient`](lithic-java-client-okhttp/src/main/kotlin/com/lithic/api/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`LithicClientImpl`](lithic-java-core/src/main/kotlin/com/lithic/api/client/LithicClientImpl.kt) or [`LithicClientAsyncImpl`](lithic-java-core/src/main/kotlin/com/lithic/api/client/LithicClientAsyncImpl.kt), similarly to [`LithicOkHttpClient`](lithic-java-client-okhttp/src/main/kotlin/com/lithic/api/client/okhttp/LithicOkHttpClient.kt) or [`LithicOkHttpClientAsync`](lithic-java-client-okhttp/src/main/kotlin/com/lithic/api/client/okhttp/LithicOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`lithic-java` dependency](#installation) with `lithic-java-core`
2. Write a class that implements the [`HttpClient`](lithic-java-core/src/main/kotlin/com/lithic/api/core/http/HttpClient.kt) interface
3. Construct [`LithicClientImpl`](lithic-java-core/src/main/kotlin/com/lithic/api/client/LithicClientImpl.kt) or [`LithicClientAsyncImpl`](lithic-java-core/src/main/kotlin/com/lithic/api/client/LithicClientAsyncImpl.kt), similarly to [`LithicOkHttpClient`](lithic-java-client-okhttp/src/main/kotlin/com/lithic/api/client/okhttp/LithicOkHttpClient.kt) or [`LithicOkHttpClientAsync`](lithic-java-client-okhttp/src/main/kotlin/com/lithic/api/client/okhttp/LithicOkHttpClientAsync.kt), using your new client class

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```java
import com.lithic.api.core.JsonValue;
import com.lithic.api.models.CardCreateParams;

CardCreateParams params = CardCreateParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](lithic-java-core/src/main/kotlin/com/lithic/api/core/Values.kt) object to its setter:

```java
import com.lithic.api.core.JsonValue;
import com.lithic.api.models.CardCreateParams;

CardCreateParams params = CardCreateParams.builder()
    .type(JsonValue.from(42))
    .build();
```

The most straightforward way to create a [`JsonValue`](lithic-java-core/src/main/kotlin/com/lithic/api/core/Values.kt) is using its `from(...)` method:

```java
import com.lithic.api.core.JsonValue;
import java.util.List;
import java.util.Map;

// Create primitive JSON values
JsonValue nullValue = JsonValue.from(null);
JsonValue booleanValue = JsonValue.from(true);
JsonValue numberValue = JsonValue.from(42);
JsonValue stringValue = JsonValue.from("Hello World!");

// Create a JSON array value equivalent to `["Hello", "World"]`
JsonValue arrayValue = JsonValue.from(List.of(
  "Hello", "World"
));

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
JsonValue objectValue = JsonValue.from(Map.of(
  "a", 1,
  "b", 2
));

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
JsonValue complexValue = JsonValue.from(Map.of(
  "a", List.of(
    1, 2
  ),
  "b", List.of(
    3, 4
  )
));
```

Normally a `Builder` class's `build` method will throw [`IllegalStateException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalStateException.html) if any required parameter or property is unset.

To forcibly omit a required parameter or property, pass [`JsonMissing`](lithic-java-core/src/main/kotlin/com/lithic/api/core/Values.kt):

```java
import com.lithic.api.core.JsonMissing;
import com.lithic.api.models.CardCreateParams;

CardCreateParams params = CardCreateParams.builder()
    .type(JsonMissing.of())
    .build();
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```java
import com.lithic.api.core.JsonValue;
import java.util.Map;

Map<String, JsonValue> additionalProperties = client.cards().create(params)._additionalProperties();
JsonValue secretPropertyValue = additionalProperties.get("secretProperty");

String result = secretPropertyValue.accept(new JsonValue.Visitor<>() {
    @Override
    public String visitNull() {
        return "It's null!";
    }

    @Override
    public String visitBoolean(boolean value) {
        return "It's a boolean!";
    }

    @Override
    public String visitNumber(Number value) {
        return "It's a number!";
    }

    // Other methods include `visitMissing`, `visitString`, `visitArray`, and `visitObject`
    // The default implementation of each unimplemented method delegates to `visitDefault`, which throws by default, but can also be overridden
});
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```java
import com.lithic.api.core.JsonField;
import com.lithic.api.models.CardCreateParams;
import java.util.Optional;

JsonField<CardCreateParams.Type> type = client.cards().create(params)._type();

if (type.isMissing()) {
  // The property is absent from the JSON response
} else if (type.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  Optional<String> jsonString = type.asString();

  // Try to deserialize into a custom type
  MyClass myObject = type.asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`LithicInvalidDataException`](lithic-java-core/src/main/kotlin/com/lithic/api/errors/LithicInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```java
import com.lithic.api.models.Card;

Card card = client.cards().create(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import com.lithic.api.models.Card;

Card card = client.cards().create(
  params, RequestOptions.builder().responseValidation(true).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;

LithicClient client = LithicOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build();
```

## FAQ

### Why don't you use plain `enum` classes?

Java `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/lithic-com/lithic-java/issues) with questions, bugs, or suggestions.
