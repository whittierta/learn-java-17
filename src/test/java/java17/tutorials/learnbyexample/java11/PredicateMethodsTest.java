package java17.tutorials.learnbyexample.java11;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PredicateMethodsTest {

  @Test
  void linesNotBlank() {
    assertThat(PredicateMethods.linesNotBlank("Java\n \nKotlin")).containsExactly("Java", "Kotlin");
  }
}