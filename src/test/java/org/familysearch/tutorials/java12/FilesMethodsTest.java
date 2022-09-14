package org.familysearch.tutorials.java12;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FilesMethodsTest {

  @Test
  void mismatch_identicalFiles() throws IOException {
    final Path file1 = Files.createTempFile("file1", ".txt");
    final Path file2 = Files.createTempFile("file2", ".txt");
    Files.writeString(file1, "Java 12 Article");
    Files.writeString(file2, "Java 12 Article");

    assertThat(FilesMethods.mismatch(file1, file2)).isEqualTo(-1);
  }

  @Test
  public void mismatch_differentFiles() throws IOException {
    Path file3 = Files.createTempFile("file3", ".txt");
    Path file4 = Files.createTempFile("file4", ".txt");
    Files.writeString(file3, "Java 12 Article");
    Files.writeString(file4, "Java 12 Tutorial");

    assertThat(FilesMethods.mismatch(file3, file4)).isEqualTo(8);
  }
}