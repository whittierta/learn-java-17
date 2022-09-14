package java.tutorials.learnbyexample.java11;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class StringMethodsTest {

  @Test
  void lines() {
    final List<String> lines = StringMethods.lines("Baeldung helps \n \n developers \n explore Java.");
    assertThat(lines).containsExactly("Baeldung helps", "developers", "explore Java.");
  }

  @Test
  void repeat() {
    assertThat(StringMethods.repeat("Hello.", 3)).isEqualTo("Hello.Hello.Hello.");
  }

  @Test
  void strip() {
    assertThat(StringMethods.strip("  Hello  ")).isEqualTo("Hello");
    assertThat(StringMethods.strip("  Hello  ")).isEqualTo("  Hello     ".strip());
  }
}