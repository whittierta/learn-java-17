package org.familysearch.tutorials.java11;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

class FileMethodsTest {

  @Test
  void createTempFile() throws IOException {
    final String contents = "Sample text\nLine2";
    final Path path = FileMethods.createTempFile(contents);
    assertThat(FileMethods.readTempFile(path)).isEqualTo(contents);

    Files.delete(path);

  }
}