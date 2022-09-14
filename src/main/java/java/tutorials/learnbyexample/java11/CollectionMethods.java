package java.tutorials.learnbyexample.java11;

import java.util.List;
import java.util.function.IntFunction;

public class CollectionMethods {


  /**
   * Explore the new {@link java.util.Collection#toArray(IntFunction)} method.
   */
  public static String[] toArray(List<String> list) {
    return list.toArray(String[]::new);
  }
}
