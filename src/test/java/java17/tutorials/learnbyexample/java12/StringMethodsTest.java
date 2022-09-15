package java17.tutorials.learnbyexample.java12;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class StringMethodsTest {

  public static final String HELLO_JAVA_WORLD = "Hello\nJava\nWorld";

  @Test
  void indent() {
    assertThat(StringMethods.indent(HELLO_JAVA_WORLD, 3))
        .isEqualTo("   Hello\n   Java\n   World\n");
  }

  @Test
  void transform() {
      assertThat(StringMethods.transform("Baeldung", StringMethods::reverse)).isEqualTo("gnudleaB");
  }

}