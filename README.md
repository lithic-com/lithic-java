# Lithic Java API Library

The Lithic Java SDK provides convenient access to the Lithic REST API from applications written in Java. It includes helper classes with helpful types and documentation for every request and response property.

## Documentation

The API documentation can be found [here](https://docs.lithic.com).

---

## Getting started

### Install dependencies

#### Gradle

```kotlin
implementation("com.lithic.api:lithic-java:0.0.0-alpha1")
```

#### Maven

```xml
<dependency>
    <groupId>com.lithic.api</groupId>
    <artifactId>lithic-java</artifactId>
    <version>0.0.0-alpha1</version>
</dependency>
```

### Configure the client

Use `LithicOkHttpClient.builder()` to configure the client. At a minimum you need to set `.apiKey()`:

```java
import com.lithic.api.client.LithicClient;
import com.lithic.api.client.okhttp.LithicOkHttpClient;

LithicClient client = LithicOkHttpClient.builder()
    .apiKey("<your API Key>")
    .build();
```

Alternately, set the environment variable `LITHIC_API_KEY` and use `LithicOkHttpClient.fromEnv()`:

```java
LithicClient client = LithicClient.fromEnv();
```

Read the documentation for more configuration options.

---

### Example: creating a resource

To create a new card, first use the `CardCreateParams` builder to specify attributes,
then pass that to the `create` method of the `cards` service.

```java
import com.lithic.api.models.Card;
import com.lithic.api.models.CardCreateParams;

CardCreateParams params = CardCreateParams.builder()
    .type("SINGLE_USE")
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
    case Card.State.Value.OPEN:
    case Card.State.Value.PAUSED:
    case Card.State.Value.PENDING_ACTIVATION:
    case Card.State.Value.PENDING_FULFILLMENT:
        // ... handle recognized enum values
        return;
    case Card.State.Value._UNKNOWN:
        // ... handle unrecognized enum value as string
        String cardState = card.state().asString();
        return;
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
CardCreateParams params = CardCreateParams.builder()
    // ... normal properties
    .putAdditionalProperty("secret_param", "4242")
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
card.cvv().isPresent(); // false
```

### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by
this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```java
JsonField state() = card._state();

if (state().isMissing()) {
  // Value was not specified in the JSON response
} else if (state().isNull()) {
  // Value was provided as a literall null
} else {
  // See if value was provided as a string
  Optional<String> jsonString = state().asString();
}
```

### Additional model properties

Sometimes, the server response may include additional properties that are not yet available in this library's types. You can access them using the model's `_additionalProperties` method:

```java
String secret = card._additionalProperties().get("secret_field");
```

---

## Pagination

For methods that return a paginated list of results, this library provides convenient ways access
the results either one page at a time, or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, you can use `autoPager`,
which automatically handles fetching more pages for you:

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

Note that fetching each page blocks the current thread.

### Manual pagination

If none of the above helpers meet your needs, you can also manually request pages one-by-one.
A page of results has a `data()` method to fetch the list of objects, as well as top-level
`response` and other methods to fetch top-level data about the page. It also has methods
`hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```java
CardListPage page = client.cards().list(params);
while (page != null) {
  System.out.println(page.FIXME());

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

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default.
You can provide a `maxRetries` on the client builder to configure this:

```java
LithicClient client = LithicOkHttpClient.builder().fromEnv().maxRetries(4).build();
```

### Timeouts

Requests time out after 60 seconds by default. You can configure this on the client builder:

```java
LithicClient client = LithicOkHttpClient.builder().fromEnv().timeout(Duration.ofSeconds(30)).build();
```

### Environments

Requests are made to the production environment by default. You can connect to other environments, like `sandbox`, via the client builder:

```java
LithicClient client = LithicOkHttpClient.builder().fromEnv().sandbox().build()
```