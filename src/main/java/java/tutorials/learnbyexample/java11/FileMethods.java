package java.tutorials.learnbyexample.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Explore new {@link Files#readString(Path)} and new {@link Files#writeString} static methods from the Files class.
 */
public class FileMethods {

  public static Path createTempFile(String contents) throws IOException {
    return Files.writeString(Files.createTempFile(Path.of("."), "demo", ".txt"), contents);
  }

  public static String readTempFile(Path path) throws IOException {
    return Files.readString(path);
  }
}

