package java17.tutorials.learnbyexample.java13;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TextBlockTest {

  public static final String JSON = "{\n  \"name\": \"Text Block\",\n  \"description\": \"Texts blocks are easier to read and maintain\"\n}\n";
  public static final String JSON_TEXT_BLOCK = """
      {
        "name": "Text Block",
        "description": "Texts blocks are easier to read and maintain"
      }
      """;

  @SuppressWarnings("TextBlockMigration")
  public static final String JSON_INDENTED = "" +
                                             "{\n" +
                                             "  \"name\": \"Text Block\",\n" +
                                             "  \"description\": \"Texts blocks are easier to read and maintain\"" +
                                             " \n}" +
                                             "\n";

  @Test
  void lines() {
    assertThat(TextBlock.lines(JSON)).isEqualTo(TextBlock.lines(JSON_TEXT_BLOCK));
  }


  @Test
  void stripIndent() {
    assertThat(JSON_INDENTED).isNotEqualTo(JSON_TEXT_BLOCK);
    assertThat(TextBlock.stripIndent(JSON_INDENTED)).isEqualTo(JSON_TEXT_BLOCK);
  }

  @Test
  void translateEscapes() {
    // TODO
  }

  @Test
  void formatted() {
    // TODO
  }

}