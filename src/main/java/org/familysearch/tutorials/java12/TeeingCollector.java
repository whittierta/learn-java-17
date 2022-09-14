package org.familysearch.tutorials.java12;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TeeingCollector {

  /**
   * Explore the new {@link Collectors#teeing(Collector, Collector, BiFunction)} method.
   *
   * @param list list of Integers to find the average.
   * @return The average of the numbers provided.
   */
  public static Double average(@NotNull List<Integer> list) {
    return list.stream()
        .collect(Collectors.teeing(Collectors.summingDouble(i -> i),
            Collectors.counting(), (sum, count) -> sum / count));
  }
}
