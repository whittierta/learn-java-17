package org.familysearch.tutorials.java14;

import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Map;

public class InstanceOf {

  public static int size(@Nullable Object object) {
    if (object == null) {
      return 0;
    } else if (object instanceof Collection collection) {
      return collection.size();
    } else if (object instanceof Map map) {
      return map.size();
    } else if (object instanceof String string){
      return string.length();
    } else {
      throw new IllegalArgumentException("Type not supported " + object.getClass());
    }
  }
}
