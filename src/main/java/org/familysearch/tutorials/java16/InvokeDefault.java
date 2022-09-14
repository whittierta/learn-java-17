package org.familysearch.tutorials.java16;

public class InvokeDefault {

  public interface HelloWorld {
    default String hello() {
      return "world";
    }
  }
}
