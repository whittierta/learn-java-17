package java.tutorials.learnbyexample.java13;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;

class SwitchExpressionsTest {

  @Test
  void math() {
    assertThat(SwitchExpressions.math(SwitchExpressions.SQUARE_ROOT, 5)).isCloseTo(2.236, offset(0.001));
    assertThat(SwitchExpressions.math(SwitchExpressions.SQUARE, 5)).isEqualTo(25);
    assertThat(SwitchExpressions.math(SwitchExpressions.FACTORIAL, 5)).isEqualTo(120);
    assertThat(SwitchExpressions.math(SwitchExpressions.NO_OP, 5)).isEqualTo(5);
  }
}