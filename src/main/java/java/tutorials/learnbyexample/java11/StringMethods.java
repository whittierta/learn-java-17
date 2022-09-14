package java.tutorials.learnbyexample.java11;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class StringMethods {

  /**
   * Explore new {@link String} methods including {@link String#lines()},  {@link String#isBlank()},
   * {@link String#strip()}.  The new {@link String#strip()}, {@link String#stripLeading()} and
   * {@link String#stripTrailing()} provide better Unicode support than the previous {@link String#trim()} method.
   *
   * @param multilineString A non-null string
   *
   * @return Split into multiple lines based on line-separators.
   */
  public static List<String> lines(@NotNull String multilineString) {
    return multilineString.lines()
        .filter(line -> !line.isBlank())
        .map(String::strip)
        .collect(Collectors.toList());
  }

  /**
   * Explore new {@link String#repeat(int)} method.
   */
  public static String repeat(String text, int count) {
    return text.repeat(count);
  }


  /**
   * Explore new  {@link String#stripLeading()} and {@link String#stripTrailing()} methods that
   * provide better Unicode support than the previous {@link String#trim()} method.
   */
  public static String strip(@NotNull String text) {
    return text.stripLeading().stripTrailing();
  }
}
