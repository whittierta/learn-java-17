package org.familysearch.tutorials.java14;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RecordTest {

  public static final String ID = "1";
  public static final String NAME = "name";
  final Record record1 = new Record(ID, NAME);
  final Record record2 = new Record(ID, NAME);

  @Test
  void id() {
    assertThat(record1.id()).isEqualTo(ID);
  }

  @Test
  void name() {
    assertThat(record1.name()).isEqualTo(NAME);
  }

  @Test
  void equals() {
    assertThat(record1).isEqualTo(record2);
  }

  @Test
  void hasCode() {
    assertThat(record1.hashCode()).isEqualTo(record2.hashCode());
  }

  @Test
  void toStringMethod() {
    assertThat(record1.toString()).isEqualTo("Record[id=1, name=name]");
  }
}