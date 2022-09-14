package java.tutorials.learnbyexample.java14;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class InstanceOfTest {

  @Test
  void size() {
    assertThat(InstanceOf.size(List.of("One", "Two"))).isEqualTo(2);
    assertThat(InstanceOf.size(Map.of("1", "One", "2", "Two"))).isEqualTo(2);
    assertThat(InstanceOf.size("123456")).isEqualTo(6);
  }
}