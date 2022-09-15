package java17.tutorials.learnbyexample.java17;

import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Map;

public class PatternMatchingSwitch {

  public static int size(@Nullable Object object) {
    return switch (object) {
      case null -> 0;
      case Collection c -> c.size();
      case Map m -> m.size();
      case String s -> s.length();
      default -> throw new IllegalArgumentException("Type not supported " + object.getClass());
    };
  }
}
