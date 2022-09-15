package java17.tutorials.learnbyexample.java12;

import org.jetbrains.annotations.NotNull;

import java.util.function.Function;

public class StringMethods {

  /**
   * Explore the new {@link String#indent(int)} method.
   *
   * @param text single or multiline text string.
   * @param n number of characters to indent.
   * @return The string indented.
   */
  public static String indent(@NotNull String text, int n) {
    return text.indent(n);
  }


  /**
   * Explore the new {@link String#transform(Function)} method.
   *
   * @param text Text to transform
   * @param f function to transform the string.
   * @return The transformed string.
   */
  public static <R> R transform(@NotNull String text, @NotNull Function<? super String, ? extends R> f) {
    return text.transform(f);
  }

  /**
   * Just a static method to revers the order of the characters in a string.  This is used in the transform example test.
   */
  public static String reverse(@NotNull String text) {
    return new StringBuilder(text).reverse().toString();
  }
}
