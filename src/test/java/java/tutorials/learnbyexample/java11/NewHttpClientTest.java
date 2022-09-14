package java.tutorials.learnbyexample.java11;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class NewHttpClientTest {

  static final MockWebServer mockWebServer = new MockWebServer();
  String url;

  @AfterAll
  static void shutDownServer() throws IOException {
    mockWebServer.shutdown();
  }

  @BeforeEach
  void setUp() throws InterruptedException {
    setupMockWebServer(mockWebServer);
    url = mockWebServer.url("/").toString();
  }

  @Test
  void get() throws IOException, InterruptedException {
    mockWebServer.enqueue(getMockResponseWithBody("Hello from the server!", 200));
    assertThat(NewHttpClient.get(url).body()).isEqualTo("Hello from the server!");
  }

  public static void setupMockWebServer(MockWebServer mockWebServer) throws InterruptedException {
    RecordedRequest request = mockWebServer.takeRequest(1, TimeUnit.MILLISECONDS);
    while (request != null) {
      request = mockWebServer.takeRequest(1, TimeUnit.MILLISECONDS);
    }
  }

  public static MockResponse getMockResponseWithBody(String body, int httpStatus) {
    return new MockResponse()
        .setResponseCode(httpStatus)
        .setBody(body);
  }
}