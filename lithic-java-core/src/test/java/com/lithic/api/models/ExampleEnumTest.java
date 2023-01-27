package com.lithic.api.models;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.lithic.api.core.JsonField;
import com.lithic.api.core.ObjectMappers;
import com.lithic.api.errors.LithicInvalidDataException;
import org.junit.jupiter.api.Test;

final class ExampleEnumTest {

    private static final JsonMapper JSON_MAPPER = ObjectMappers.jsonMapper()
            .rebuild()
            .configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true)
            .build();

    @Test
    void switch_statement() {
        String json = "\"OPEN\"";

        ExampleEnum enumValue = fromJson(json);

        String result = "";
        switch (enumValue.known()) {
            case CLOSED:
                result = "closed";
                break;
            case OPEN:
                result = "open";
                break;
            case PAUSED:
                result = "paused";
                break;
        }
        assertThat(result).isEqualTo("open");
    }

    @Test
    void fromJson_known() {
        String json = "\"CLOSED\"";

        ExampleEnum enumValue = fromJson(json);

        assertThat(enumValue).isEqualTo(ExampleEnum.CLOSED);
        assertThat(enumValue.known()).isEqualTo(ExampleEnum.Known.CLOSED);
        assertThat(enumValue.value()).isEqualTo(ExampleEnum.Value.CLOSED);
        assertThat(enumValue._value()).isEqualTo(JsonField.of("CLOSED"));
    }

    @Test
    void fromJson_unknown() {
        String json = "\"FOO\"";

        ExampleEnum enumValue = fromJson(json);

        assertThatThrownBy(enumValue::known)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("Unknown ExampleEnum: FOO");
        assertThat(enumValue.value()).isEqualTo(ExampleEnum.Value._UNKNOWN);
        assertThat(enumValue._value()).isEqualTo(JsonField.of("FOO"));
    }

    @Test
    void fromJson_wrong_case() {
        String json = "\"cLosED\"";

        ExampleEnum enumValue = fromJson(json);

        assertThatThrownBy(enumValue::known)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("Unknown ExampleEnum: cLosED");
    }

    @Test
    void fromJson_lower_case_variant() {
        String json = "\"paused\"";

        ExampleEnum enumValue = fromJson(json);

        assertThat(enumValue).isEqualTo(ExampleEnum.PAUSED);
        assertThat(enumValue.known()).isEqualTo(ExampleEnum.Known.PAUSED);
        assertThat(enumValue.value()).isEqualTo(ExampleEnum.Value.PAUSED);
        assertThat(enumValue._value()).isEqualTo(JsonField.of("paused"));
    }

    @Test
    void toJson_known() {
        ExampleEnum enumValue = ExampleEnum.CLOSED;

        assertThat(toJson(enumValue)).isEqualTo("\"CLOSED\"");
    }

    @Test
    void toJson_unknown() {
        ExampleEnum enumValue = ExampleEnum.of("FOO");

        assertThat(toJson(enumValue)).isEqualTo("\"FOO\"");
    }

    @Test
    void toJson_wrong_case() {
        ExampleEnum enumValue = ExampleEnum.of("cLosED");

        assertThat(toJson(enumValue)).isEqualTo("\"cLosED\"");
    }

    @Test
    void toJson_lower_case_variant() {
        ExampleEnum enumValue = ExampleEnum.PAUSED;

        assertThat(toJson(enumValue)).isEqualTo("\"paused\"");
    }

    private ExampleEnum fromJson(String json) {
        try {
            return JSON_MAPPER.readValue(json, ExampleEnum.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private String toJson(ExampleEnum enumValue) {
        try {
            return JSON_MAPPER.writeValueAsString(enumValue);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
