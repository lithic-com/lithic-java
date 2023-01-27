package com.lithic.api.models;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.lithic.api.core.JsonArray;
import com.lithic.api.core.JsonObject;
import com.lithic.api.core.JsonString;
import com.lithic.api.core.ObjectMappers;
import com.lithic.api.errors.LithicInvalidDataException;
import java.util.List;
import org.junit.jupiter.api.Test;

final class ExampleOneOfTest {

    private static final JsonMapper JSON_MAPPER = ObjectMappers.jsonMapper()
            .rebuild()
            .configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true)
            .build();

    @Test
    void fromJson_empty() {
        ExampleOneOf value = fromJson("{}");

        assertThat(value.cat()).isEmpty();
        assertThat(value.dog()).isEmpty();
        assertThat(value.cats()).isEmpty();
        assertThat(value.petName()).isEmpty();

        assertThat(value.isCat()).isFalse();
        assertThat(value.isDog()).isFalse();
        assertThat(value.isCats()).isFalse();
        assertThat(value.isPetName()).isFalse();

        assertThatThrownBy(value::asCat)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'cat' is not present");
        assertThatThrownBy(value::asDog)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'dog' is not present");
        assertThatThrownBy(value::asCats)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'cats' is not present");
        assertThatThrownBy(value::asPetName)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'petName' is not present");

        assertThat(value._json()).contains(JsonObject.of(ImmutableMap.of()));
    }

    @Test
    void fromJson_cat() {
        String json = "{\"name\":\"whiskers\"}";

        ExampleOneOf value = fromJson(json);

        ExampleOneOf.Cat cat = ExampleOneOf.Cat.builder().name("whiskers").build();

        assertThat(value.cat()).contains(cat);
        assertThat(value.dog()).isEmpty();
        assertThat(value.cats()).isEmpty();
        assertThat(value.petName()).isEmpty();

        assertThat(value.isCat()).isTrue();
        assertThat(value.isDog()).isFalse();
        assertThat(value.isCats()).isFalse();
        assertThat(value.isPetName()).isFalse();

        assertThat(value.asCat()).isEqualTo(cat);
        assertThatThrownBy(value::asDog)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'dog' is not present");
        assertThatThrownBy(value::asCats)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'cats' is not present");
        assertThatThrownBy(value::asPetName)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'petName' is not present");

        assertThat(value._json()).contains(JsonObject.of(ImmutableMap.of("name", JsonString.of("whiskers"))));
    }

    @Test
    void fromJson_dog() {
        String json = "{\"breed\":\"poodle\"}";

        ExampleOneOf value = fromJson(json);

        ExampleOneOf.Dog dog = ExampleOneOf.Dog.builder().breed("poodle").build();

        assertThat(value.cat()).isEmpty();
        assertThat(value.dog()).contains(dog);
        assertThat(value.cats()).isEmpty();
        assertThat(value.petName()).isEmpty();

        assertThat(value.isCat()).isFalse();
        assertThat(value.isDog()).isTrue();
        assertThat(value.isCats()).isFalse();
        assertThat(value.isPetName()).isFalse();

        assertThatThrownBy(value::asCat)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'cat' is not present");
        assertThat(value.asDog()).isEqualTo(dog);
        assertThatThrownBy(value::asCats)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'cats' is not present");
        assertThatThrownBy(value::asPetName)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'petName' is not present");

        assertThat(value._json()).contains(JsonObject.of(ImmutableMap.of("breed", JsonString.of("poodle"))));
    }

    @Test
    void fromJson_cats() {
        String json = "[{\"name\":\"mittens\"},{\"name\":\"fluffy\"}]";

        ExampleOneOf value = fromJson(json);

        List<ExampleOneOf.Cat> cats = ImmutableList.of(
                ExampleOneOf.Cat.builder().name("mittens").build(),
                ExampleOneOf.Cat.builder().name("fluffy").build());

        assertThat(value.cat()).isEmpty();
        assertThat(value.dog()).isEmpty();
        assertThat(value.cats()).contains(cats);
        assertThat(value.petName()).isEmpty();

        assertThat(value.isCat()).isFalse();
        assertThat(value.isDog()).isFalse();
        assertThat(value.isCats()).isTrue();
        assertThat(value.isPetName()).isFalse();

        assertThatThrownBy(value::asCat)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'cat' is not present");
        assertThatThrownBy(value::asDog)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'dog' is not present");
        assertThat(value.asCats()).isEqualTo(cats);
        assertThatThrownBy(value::asPetName)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'petName' is not present");

        assertThat(value._json())
                .contains(JsonArray.of(ImmutableList.of(
                        JsonObject.of(ImmutableMap.of("name", JsonString.of("mittens"))),
                        JsonObject.of(ImmutableMap.of("name", JsonString.of("fluffy"))))));
    }

    @Test
    void fromJson_petName() {
        String json = "\"milou\"";

        ExampleOneOf value = fromJson(json);

        String petName = "milou";

        assertThat(value.cat()).isEmpty();
        assertThat(value.dog()).isEmpty();
        assertThat(value.cats()).isEmpty();
        assertThat(value.petName()).contains(petName);

        assertThat(value.isCat()).isFalse();
        assertThat(value.isDog()).isFalse();
        assertThat(value.isCats()).isFalse();
        assertThat(value.isPetName()).isTrue();

        assertThatThrownBy(value::asCat)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'cat' is not present");
        assertThatThrownBy(value::asDog)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'dog' is not present");
        assertThatThrownBy(value::asCats)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'cats' is not present");
        assertThat(value.asPetName()).isEqualTo(petName);

        assertThat(value._json()).contains(JsonString.of("milou"));
    }

    @Test
    void fromJson_catAndDog() {
        String json = "{\"name\":\"whiskers\",\"breed\":\"poodle\"}";

        ExampleOneOf value = fromJson(json);

        ExampleOneOf.Cat cat = ExampleOneOf.Cat.builder()
                .name("whiskers")
                .putAdditionalProperty("breed", JsonString.of("poodle"))
                .build();

        assertThat(value.cat()).contains(cat);
        assertThat(value.dog()).isEmpty();
        assertThat(value.cats()).isEmpty();
        assertThat(value.petName()).isEmpty();

        assertThat(value.isCat()).isTrue();
        assertThat(value.isDog()).isFalse();
        assertThat(value.isCats()).isFalse();
        assertThat(value.isPetName()).isFalse();

        assertThat(value.asCat()).isEqualTo(cat);
        assertThatThrownBy(value::asDog)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'dog' is not present");
        assertThatThrownBy(value::asCats)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'cats' is not present");
        assertThatThrownBy(value::asPetName)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'petName' is not present");

        assertThat(value._json())
                .contains(JsonObject.of(
                        ImmutableMap.of("name", JsonString.of("whiskers"), "breed", JsonString.of("poodle"))));
    }

    @Test
    void fromJson_additionalProperties() {
        String json = "{\"name\":\"whiskers\",\"key\":\"value\"}";

        ExampleOneOf value = fromJson(json);

        ExampleOneOf.Cat cat = ExampleOneOf.Cat.builder()
                .name("whiskers")
                .putAdditionalProperty("key", JsonString.of("value"))
                .build();

        assertThat(value.cat()).contains(cat);
        assertThat(value.dog()).isEmpty();
        assertThat(value.cats()).isEmpty();
        assertThat(value.petName()).isEmpty();

        assertThat(value.isCat()).isTrue();
        assertThat(value.isDog()).isFalse();
        assertThat(value.isCats()).isFalse();
        assertThat(value.isPetName()).isFalse();

        assertThat(value.asCat()).isEqualTo(cat);
        assertThatThrownBy(value::asDog)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'dog' is not present");
        assertThatThrownBy(value::asCats)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'cats' is not present");
        assertThatThrownBy(value::asPetName)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'petName' is not present");

        assertThat(value._json())
                .contains(JsonObject.of(
                        ImmutableMap.of("name", JsonString.of("whiskers"), "key", JsonString.of("value"))));
    }

    @Test
    void fromJson_incorrect() {
        String json = "{\"key\":\"value\"}";

        ExampleOneOf value = fromJson(json);

        assertThat(value.cat()).isEmpty();
        assertThat(value.dog()).isEmpty();
        assertThat(value.cats()).isEmpty();
        assertThat(value.petName()).isEmpty();

        assertThat(value.isCat()).isFalse();
        assertThat(value.isDog()).isFalse();
        assertThat(value.isCats()).isFalse();
        assertThat(value.isPetName()).isFalse();

        assertThatThrownBy(value::asCat)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'cat' is not present");
        assertThatThrownBy(value::asDog)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'dog' is not present");
        assertThatThrownBy(value::asCats)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'cats' is not present");
        assertThatThrownBy(value::asPetName)
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("'petName' is not present");

        assertThat(value._json()).contains(JsonObject.of(ImmutableMap.of("key", JsonString.of("value"))));
    }

    @Test
    void toJson_empty() {
        ExampleOneOf value = fromJson("{}");

        String json = toJson(value);

        assertThat(json).isEqualTo("{}");
    }

    @Test
    void toJson_cat() {
        ExampleOneOf value =
                ExampleOneOf.ofCat(ExampleOneOf.Cat.builder().name("whiskers").build());

        String json = toJson(value);

        assertThat(json).isEqualTo("{\"name\":\"whiskers\"}");
    }

    @Test
    void toJson_dog() {
        ExampleOneOf value = ExampleOneOf.ofDog(
                ExampleOneOf.Dog.builder().breed("poodle").build().validate());

        String json = toJson(value);

        assertThat(json).isEqualTo("{\"breed\":\"poodle\"}");
    }

    @Test
    void toJson_cats() {
        ExampleOneOf value = ExampleOneOf.ofCats(ImmutableList.of(
                ExampleOneOf.Cat.builder().name("mittens").build(),
                ExampleOneOf.Cat.builder().name("fluffy").build()));

        String json = toJson(value);

        assertThat(json).isEqualTo("[{\"name\":\"mittens\"},{\"name\":\"fluffy\"}]");
    }

    @Test
    void toJson_petName() {
        ExampleOneOf value = ExampleOneOf.ofPetName("milou");

        String json = toJson(value);

        assertThat(json).isEqualTo("\"milou\"");
    }

    @Test
    void toJson_additionalProperties() {
        ExampleOneOf value = ExampleOneOf.ofCat(ExampleOneOf.Cat.builder()
                .name("whiskers")
                .putAdditionalProperty("key", JsonString.of("value"))
                .build());

        String json = toJson(value);

        assertThat(json).isEqualTo("{\"name\":\"whiskers\",\"key\":\"value\"}");
    }

    @Test
    void visitor() {
        ExampleOneOf.Cat cat = ExampleOneOf.Cat.builder().name("whiskers").build();
        ExampleOneOf.Dog dog =
                ExampleOneOf.Dog.builder().breed("poodle").build().validate();
        List<ExampleOneOf.Cat> cats = ImmutableList.of(
                ExampleOneOf.Cat.builder().name("mittens").build(),
                ExampleOneOf.Cat.builder().name("fluffy").build());
        String petName = "milou";

        ExampleOneOf.Visitor<String> visitor = new ExampleOneOf.Visitor<String>() {
            @Override
            public String visitCat(ExampleOneOf.Cat visitorCat) {
                assertThat(visitorCat).isEqualTo(cat);
                return "cat";
            }

            @Override
            public String visitDog(ExampleOneOf.Dog visitorDog) {
                assertThat(visitorDog).isEqualTo(dog);
                return "dog";
            }

            @Override
            public String visitCats(List<ExampleOneOf.Cat> visitorCats) {
                assertThat(visitorCats).isEqualTo(cats);
                return "cats";
            }

            @Override
            public String visitPetName(String visitorPetName) {
                assertThat(visitorPetName).isEqualTo(petName);
                return "milou";
            }
        };

        assertThat(ExampleOneOf.ofCat(cat).accept(visitor)).isEqualTo("cat");
        assertThat(ExampleOneOf.ofDog(dog).accept(visitor)).isEqualTo("dog");
        assertThat(ExampleOneOf.ofCats(cats).accept(visitor)).isEqualTo("cats");
        assertThat(ExampleOneOf.ofPetName(petName).accept(visitor)).isEqualTo("milou");

        assertThatThrownBy(() -> fromJson("{}").accept(visitor))
                .isInstanceOf(LithicInvalidDataException.class)
                .hasMessage("Unknown ExampleOneOf value");
    }

    private ExampleOneOf fromJson(String json) {
        try {
            return JSON_MAPPER.readValue(json, ExampleOneOf.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private String toJson(ExampleOneOf value) {
        try {
            return JSON_MAPPER.writeValueAsString(value);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
