package java17.tutorials.learnbyexample.java11;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateMethods {

  /**
   * Explore {@link Predicate#not(Predicate)} method.
   *
   * @param multilineText Text that may contain line breaks.
   * @return Lines that are not blank.
   */
  public static List<String> linesNotBlank(@NotNull String multilineText) {
    return multilineText.lines()
        .filter(Predicate.not(String::isBlank))
        .collect(Collectors.toList());
  }
}
