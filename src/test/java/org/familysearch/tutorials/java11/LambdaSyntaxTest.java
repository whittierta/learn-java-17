package org.familysearch.tutorials.java11;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LambdaSyntaxTest {

  @Test
  void joinUppercase() {
    assertThat(LambdaSyntax.joinUppercase(List.of("Java", "Kotlin"), ", ")).isEqualTo("JAVA, KOTLIN");
  }
}