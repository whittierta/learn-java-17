package java17.tutorials.learnbyexample.java11;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CollectionMethodsTest {

  @Test
  void toArray() {
    assertThat(CollectionMethods.toArray(List.of("Java", "Kotlin"))).containsExactly("Java", "Kotlin");
  }
}