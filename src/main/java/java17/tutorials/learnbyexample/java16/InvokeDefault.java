package java17.tutorials.learnbyexample.java16;

public class InvokeDefault {

  public interface HelloWorld {
    default String hello() {
      return "world";
    }
  }
}
