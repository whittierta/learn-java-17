package java.tutorials.learnbyexample.java17;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class PatternMatchingSwitchTest {

  @Test
  void size() {
    assertThat(PatternMatchingSwitch.size(List.of("One", "Two"))).isEqualTo(2);
    assertThat(PatternMatchingSwitch.size(Map.of("1", "One", "2", "Two"))).isEqualTo(2);
    assertThat(PatternMatchingSwitch.size("123456")).isEqualTo(6);
  }
}