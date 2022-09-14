package java.tutorials.learnbyexample.java14;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TextBlockTest {

  @Test
  void lines() {
    assertThat(TextBlock.lines(TextBlock.TEXT)).isEqualTo(TextBlock.lines(TextBlock.TEXT_BLOCK));
  }
}