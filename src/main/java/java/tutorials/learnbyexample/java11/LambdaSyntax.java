package java.tutorials.learnbyexample.java11;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaSyntax {

  /**
   * Explore using the new var keyword that is now included in the lambda syntax.
   *
   * @param list Strings to be joined.
   * @param delimiter The delimiter to join the string with.
   * @return The joined list in uppercase characters.
   */
  public static String joinUppercase(@NotNull List<String> list, String delimiter) {
    return list.stream()
        .map((@NotNull var x) -> x.toUpperCase())
        .collect(Collectors.joining(delimiter));
  }
}
