package java17.tutorials.learnbyexample.java14;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchExpressionsTest {

  @Test
  void isWeekend() {
    assertThat(SwitchExpressions.isWeekend(SwitchExpressions.Day.SUNDAY)).isTrue();
    assertThat(SwitchExpressions.isWeekend(SwitchExpressions.Day.MONDAY)).isFalse();
  }
}