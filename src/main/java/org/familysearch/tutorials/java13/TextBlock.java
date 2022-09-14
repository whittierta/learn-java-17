package org.familysearch.tutorials.java13;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class TextBlock {

  /**
   * Explore the new {@link String#lines()} method.
   *
   * @param multilineText text to be split into separate lines.
   * @return lines returned as a list of strings.
   */
  public static List<String> lines(String multilineText) {
    return multilineText.lines().collect(Collectors.toList());
  }

  /**
   * Explore the new {@link String#stripIndent()} method.
   *
   * @param multilineText text to strip indentation.
   * @return string with text indentation removed.
   */
  public static String stripIndent(@NotNull String multilineText) {
    return multilineText.stripIndent();
  }

  /**
   * Explore the new {@link String#translateEscapes()} method.
   *
   * @param multilineText text to translate escapes.
   * @return string with escaped special characters translated.
   */
  public static String translateEscapes(@NotNull String multilineText) {
    return multilineText.translateEscapes();
  }

  /**
   * Explore the new {@link String#formatted(Object...)} method.
   *
   * @param multilineText text string to format.
   * @return formatted text string.
   */
  public static String formatted(@NotNull String multilineText, Object... args) {
    return multilineText.formatted(args);
  }
}
