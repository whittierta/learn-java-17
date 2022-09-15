package java17.tutorials.learnbyexample.java13;

import org.jetbrains.annotations.NotNull;

import java.util.stream.LongStream;

public class SwitchExpressions {

  public static final String SQUARE_ROOT = "square-root";
  public static final String SQUARE = "square";
  public static final String FACTORIAL = "factorial";
  public static final String NO_OP = "no-op";

  public static double math(@NotNull String operation, double number) {
    return switch (operation) {
      case SQUARE_ROOT -> Math.sqrt(number);
      case SQUARE -> number * number;
      case FACTORIAL -> LongStream.rangeClosed(1, (int) number)
          .reduce(1, (x, y) -> x * y);
      case NO_OP -> number;
      default -> throw new UnsupportedOperationException();
    };
  }
}
