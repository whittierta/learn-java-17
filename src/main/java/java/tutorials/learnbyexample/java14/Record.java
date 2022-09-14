package java.tutorials.learnbyexample.java14;

/**
 * Example of an immutable data object where the constructor, getters, toString,
 * equals and hashCode are defined by default.
 * <a href="https://www.baeldung.com/java-15-new">Learn more about record types.</a>
 */
public record Record(String id, String name) {
}
