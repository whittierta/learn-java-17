package java17.tutorials.learnbyexample.java14;

import java.util.List;
import java.util.stream.Collectors;

public class TextBlock {
  public static final String TEXT = "FamilySearch is a free site to learn " +
                                    "more about your ancestors.";

  public static final String TEXT_BLOCK = """
      FamilySearch is a free site to learn \
      more about your ancestors.""";

  public static List<String> lines(String text) {
    return text.lines().collect(Collectors.toList());
  }
}
