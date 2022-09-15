package java17.tutorials.learnbyexample.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class NewHttpClient {

  /**
   * Explore the new and improved {@link HttpClient}
   * @param url URL of the server.
   *
   * @return The response as a String.

   * @throws IOException – if an I/O error occurs when sending or receiving
   * @throws InterruptedException – if the operation is interrupted
   */
  public static HttpResponse<String> get(String url) throws IOException, InterruptedException {
    HttpClient httpClient = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_2)
        .connectTimeout(Duration.ofSeconds(20))
        .build();
    HttpRequest httpRequest = HttpRequest.newBuilder()
        .GET()
        .uri(URI.create(url))
        .build();
    return httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
  }
}
