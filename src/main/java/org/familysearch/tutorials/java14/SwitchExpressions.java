package org.familysearch.tutorials.java14;

public class SwitchExpressions {
  public enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

  public static boolean isWeekend(Day day) {
    return switch (day) {
      case SUNDAY, SATURDAY -> true;
      case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> false;
    };
  }
}
