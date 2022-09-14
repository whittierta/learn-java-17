package org.familysearch.tutorials.java14;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TextBlockTest {

  @Test
  void lines() {
    assertThat(TextBlock.lines(TextBlock.TEXT)).isEqualTo(TextBlock.lines(TextBlock.TEXT_BLOCK));
  }
}