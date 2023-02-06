package com.lithic.api.models;

import static org.assertj.core.api.Assertions.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.lithic.api.core.JsonArray;
import com.lithic.api.core.JsonField;
import com.lithic.api.core.JsonMissing;
import com.lithic.api.core.JsonNull;
import com.lithic.api.core.JsonNumber;
import com.lithic.api.core.JsonObject;
import com.lithic.api.core.JsonString;
import com.lithic.api.core.JsonValue;
import com.lithic.api.core.ObjectMappers;
import com.lithic.api.errors.LithicInvalidDataException;
import org.junit.jupiter.api.Test;

final class ExampleObjectJsonTest {

    private static final JsonMapper JSON_MAPPER = ObjectMappers.jsonMapper()
            .rebuild()
            .configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true)
            .build();

    @Test
    void fromJson_field_access() {
        String json =
                "{\"string_field\": \"foo\", \"number_field\": 42, \"integer_field\": 23, \"required_field\": \"bar\", \"nested_object\": {\"a\": \"baz\"}}";

        ExampleObject entity = fromJson(json);

        assertThat(entity.stringField()).contains("foo");
        assertThat(entity.numberField()).contains(42.0);
        assertThat(entity.integerField()).contains(23L);
        assertThat(entity.requiredField()).contains("bar");
        assertThat(entity.nestedObject().get().a()).contains("baz");
    }

    @Test
    void fromJson_required_valid_lenient() {
        String json = "{\"string_field\": \"foo\", \"number_field\": 42, \"required_field\": \"foo\"}";

        ExampleObject entity = fromJson(json);

        assertThat(entity.requiredField()).isEqualTo("foo");
        assertThat(entity._requiredField()).isEqualTo(JsonField.of("foo"));
    }

    @Test
    void fromJson_required_valid_strict() {
        String json = "{\"required_field\": \"foo\"}";

        ExampleObject entity = fromJson(json).validate();

        assertThat(entity.requiredField()).isEqualTo("foo");
        assertThat(entity._requiredField()).isEqualTo(JsonField.of("foo"));
    }

    @Test
    void fromJson_required_unset_lenient() {
        String json = "{}";

        ExampleObject entity = fromJson(json);

        assertThatThrownBy(entity::requiredField)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'required_field' is not set");
        assertThat(entity._requiredField()).isEqualTo(JsonMissing.of());
    }

    @Test
    void fromJson_required_unset_strict() {
        String json = "{}";

        ExampleObject entity = fromJson(json);

        assertThatThrownBy(entity::validate)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'required_field' is not set");
    }

    @Test
    void fromJson_required_null_lenient() {
        String json = "{\"required_field\": null}";

        ExampleObject entity = fromJson(json);

        assertThatThrownBy(entity::requiredField)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'required_field' is null");
        assertThat(entity._requiredField()).isEqualTo(JsonNull.of());
    }

    @Test
    void fromJson_required_null_strict() {
        String json = "{\"required_field\":null}";

        ExampleObject entity = fromJson(json);

        assertThatThrownBy(entity::validate)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'required_field' is null");
        assertThat(entity._requiredField()).isEqualTo(JsonNull.of());
    }

    @Test
    void fromJson_required_invalid_lenient() {
        String json = "{\"required_field\":{\"key\":\"value\"}}";

        ExampleObject entity = fromJson(json);

        assertThatThrownBy(entity::requiredField)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'required_field' is invalid; received {key=value}");
        assertThat(entity._requiredField()).isEqualTo(JsonValue.from(ImmutableMap.of("key", "value")));
    }

    @Test
    void fromJson_required_invalid_strict() {
        String json = "{\"required_field\":{\"key\":\"value\"}}";

        ExampleObject entity = fromJson(json);

        assertThatThrownBy(entity::validate)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'required_field' is invalid; received {key=value}");
    }

    @Test
    void fromJson_optional_valid_lenient() {
        String json = "{\"string_field\": \"foo\"}";

        ExampleObject entity = fromJson(json);

        assertThat(entity.stringField()).contains("foo");
        assertThat(entity._stringField()).isEqualTo(JsonField.of("foo"));
    }

    @Test
    void fromJson_optional_valid_strict() {
        String json = "{\"required_field\":\"foo\",\"string_field\":\"bar\"}";

        ExampleObject entity = fromJson(json).validate();

        assertThat(entity.stringField()).contains("bar");
        assertThat(entity._stringField()).isEqualTo(JsonField.of("bar"));
    }

    @Test
    void fromJson_optional_unset_lenient() {
        String json = "{\"required_field\":\"foo\"}";

        ExampleObject entity = fromJson(json);

        assertThat(entity.stringField()).isEmpty();
        assertThat(entity._stringField()).isEqualTo(JsonMissing.of());
    }

    @Test
    void fromJson_optional_unset_strict() {
        String json = "{\"required_field\":\"foo\"}";

        ExampleObject entity = fromJson(json).validate();

        assertThat(entity.stringField()).isEmpty();
        assertThat(entity._stringField()).isEqualTo(JsonMissing.of());
    }

    @Test
    void fromJson_optional_null_lenient() {
        String json = "{\"required_field\":\"foo\",\"string_field\":null}";

        ExampleObject entity = fromJson(json);

        assertThat(entity.stringField()).isEmpty();
        assertThat(entity._stringField()).isEqualTo(JsonNull.of());
    }

    @Test
    void fromJson_optional_null_strict() {
        String json = "{\"required_field\":\"foo\",\"string_field\":null}";

        ExampleObject entity = fromJson(json).validate();

        assertThat(entity.stringField()).isEmpty();
        assertThat(entity._stringField()).isEqualTo(JsonNull.of());
    }

    @Test
    void fromJson_optional_invalid_lenient() {
        String json = "{\"required_field\":\"foo\",\"string_field\":{\"key\":\"value\"}}";

        ExampleObject entity = fromJson(json);

        assertThatThrownBy(entity::stringField)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'string_field' is invalid; received {key=value}");
        assertThat(entity._stringField()).isEqualTo(JsonObject.of(ImmutableMap.of("key", JsonString.of("value"))));
    }

    @Test
    void fromJson_optional_invalid_strict() {
        String json = "{\"required_field\":\"foo\",\"string_field\":{\"key\":\"value\"}}";

        ExampleObject entity = fromJson(json);

        assertThatThrownBy(entity::validate)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'string_field' is invalid; received {key=value}");
    }

    @Test
    void fromJson_nested_valid_lenient() {
        String json = "{\"required_field\": \"foo\", \"nested_object\": {\"a\": \"foo\", \"b\": \"bar\"}}";

        ExampleObject entity = fromJson(json);

        assertThat(entity.nestedObject().get().a()).contains("foo");
        assertThat(entity.nestedObject().get().b()).contains("bar");
    }

    @Test
    void fromJson_nested_valid_strict() {
        String json = "{\"required_field\": \"foo\", \"nested_object\": {\"a\": \"foo\", \"b\": \"bar\"}}";

        ExampleObject entity = fromJson(json).validate();

        assertThat(entity.nestedObject().get().a()).contains("foo");
        assertThat(entity.nestedObject().get().b()).contains("bar");
    }

    @Test
    void fromJson_nested_invalid_lenient() {
        String json = "{\"required_field\": \"foo\", \"nested_object\": {\"a\": \"foo\", \"b\": [42]}}";

        ExampleObject entity = fromJson(json);

        assertThat(entity.nestedObject().get().a()).contains("foo");
        assertThatThrownBy(entity.nestedObject().get()::b)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'b' is invalid; received [42]");
        assertThat(entity.nestedObject().get()._b()).isEqualTo(JsonArray.of(ImmutableList.of(JsonNumber.of(42))));
    }

    @Test
    void fromJson_nested_invalid_strict() {
        String json = "{\"required_field\": \"foo\", \"nested_object\": {\"a\": \"foo\", \"b\": []}}";

        ExampleObject entity = fromJson(json);

        assertThatThrownBy(entity::validate)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'b' is invalid; received []");
    }

    @Test
    void fromJson_additionalProperties() {
        String json = "{\"required_field\":\"foo\",\"string_field\":\"bar\",\"key\":\"value\"}";

        ExampleObject entity = fromJson(json);

        assertThat(entity._additionalProperties()).isEqualTo(ImmutableMap.of("key", JsonString.of("value")));
    }

    @Test
    void toJson_all_fields_valid() {
        ExampleObject entity = ExampleObject.builder()
                .stringField("foo")
                .requiredField("bar")
                .numberField(42.0)
                .integerField(23)
                .nestedObject(ExampleObject.NestedObject.builder().a("baz").build())
                .build();

        assertThat(toJson(entity))
                .isEqualTo(
                        "{\"integer_field\":23,\"nested_object\":{\"a\":\"baz\"},\"number_field\":42.0,\"required_field\":\"bar\",\"string_field\":\"foo\"}");
    }

    @Test
    void toJson_required_valid() {
        ExampleObject entity = ExampleObject.builder().requiredField("foo").build();

        assertThat(toJson(entity)).isEqualTo("{\"required_field\":\"foo\"}");
    }

    @Test
    void toJson_required_unset() {
        ExampleObject entity = ExampleObject.builder().build();

        assertThat(toJson(entity)).isEqualTo("{}");
    }

    @Test
    void toJson_required_null() {
        ExampleObject entity =
                ExampleObject.builder().requiredField(JsonNull.of()).build();

        assertThat(toJson(entity)).isEqualTo("{\"required_field\":null}");
    }

    @Test
    void toJson_required_invalid() {
        ExampleObject entity = ExampleObject.builder()
                .requiredField(JsonObject.of(ImmutableMap.of("key", JsonString.of("value"))))
                .build();

        assertThat(toJson(entity)).isEqualTo("{\"required_field\":{\"key\":\"value\"}}");
    }

    @Test
    void toJson_optional_valid() {
        ExampleObject entity =
                ExampleObject.builder().requiredField("foo").stringField("bar").build();

        assertThat(toJson(entity)).isEqualTo("{\"required_field\":\"foo\",\"string_field\":\"bar\"}");
    }

    @Test
    void toJson_optional_unset() {
        ExampleObject entity = ExampleObject.builder().requiredField("foo").build();

        assertThat(toJson(entity)).isEqualTo("{\"required_field\":\"foo\"}");
    }

    @Test
    void toJson_optional_null() {
        ExampleObject entity = ExampleObject.builder()
                .requiredField("foo")
                .stringField(JsonNull.of())
                .build();

        assertThat(toJson(entity)).isEqualTo("{\"required_field\":\"foo\",\"string_field\":null}");
    }

    @Test
    void toJson_optional_invalid() {
        ExampleObject entity = ExampleObject.builder()
                .requiredField("foo")
                .stringField(JsonObject.of(ImmutableMap.of("key", JsonString.of("value"))))
                .build();

        assertThat(toJson(entity)).isEqualTo("{\"required_field\":\"foo\",\"string_field\":{\"key\":\"value\"}}");
    }

    @Test
    void toJson_additionalProperties() {
        ExampleObject entity = ExampleObject.builder()
                .requiredField("foo")
                .stringField("bar")
                .putAdditionalProperty("key", JsonString.of("value"))
                .build();

        assertThat(toJson(entity)).isEqualTo("{\"required_field\":\"foo\",\"string_field\":\"bar\",\"key\":\"value\"}");
    }

    @Test
    void buildValidated_required_valid() {
        ExampleObject entity = ExampleObject.builder().requiredField("foo").build();

        assertThatCode(entity::validate).doesNotThrowAnyException();
    }

    @Test
    void buildValidated_required_unset() {
        ExampleObject entity = ExampleObject.builder().build();

        assertThatThrownBy(entity::validate)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'required_field' is not set");
    }

    @Test
    void buildValidated_required_null() {
        ExampleObject entity =
                ExampleObject.builder().requiredField(JsonNull.of()).build();

        assertThatThrownBy(entity::validate)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'required_field' is null");
    }

    @Test
    void buildValidated_required_invalid() {
        ExampleObject entity = ExampleObject.builder()
                .requiredField(JsonObject.of(ImmutableMap.of("key", JsonString.of("value"))))
                .build();

        assertThatThrownBy(entity::validate)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'required_field' is invalid; received {key=value}");
    }

    @Test
    void equals_validatedAndUnvalidated() {
        ExampleObject unvalidatedEntity =
                ExampleObject.builder().requiredField("foo").stringField("bar").build();
        ExampleObject validatedEntity = ExampleObject.builder()
                .requiredField("foo")
                .stringField("bar")
                .build()
                .validate();

        assertThat(unvalidatedEntity).isEqualTo(validatedEntity);
        assertThat(validatedEntity).isEqualTo(unvalidatedEntity);
    }

    @Test
    void equals_additionalProperties_isEqual() {
        ExampleObject card1 = ExampleObject.builder()
                .requiredField("foo")
                .stringField("bar")
                .putAdditionalProperty("key", JsonString.of("value"))
                .build();
        ExampleObject card2 = ExampleObject.builder()
                .requiredField("foo")
                .stringField("bar")
                .putAdditionalProperty("key", JsonString.of("value"))
                .build();

        assertThat(card1).isEqualTo(card2);
    }

    @Test
    void equals_additionalProperties_isNotEqual() {
        ExampleObject card1 = ExampleObject.builder()
                .requiredField("foo")
                .stringField("bar")
                .putAdditionalProperty("key", JsonString.of("value1"))
                .build();
        ExampleObject card2 = ExampleObject.builder()
                .requiredField("foo")
                .stringField("bar")
                .putAdditionalProperty("key", JsonString.of("value2"))
                .build();

        assertThat(card1).isNotEqualTo(card2);
    }

    private ExampleObject fromJson(String json) {
        try {
            return JSON_MAPPER.readValue(json, ExampleObject.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private String toJson(ExampleObject entity) {
        try {
            return JSON_MAPPER.writeValueAsString(entity);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
