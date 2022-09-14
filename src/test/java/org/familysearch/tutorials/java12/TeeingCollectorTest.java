package org.familysearch.tutorials.java12;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TeeingCollectorTest {

  @Test
  void average() {
    assertThat(TeeingCollector.average(List.of(1, 2, 3, 4, 5))).isEqualTo(3.0);
  }
}