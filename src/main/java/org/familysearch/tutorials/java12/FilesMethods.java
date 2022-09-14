package org.familysearch.tutorials.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMethods {
  public static long mismatch(Path file1, Path file2) throws IOException {
      return Files.mismatch(file1, file2);
  }
}
