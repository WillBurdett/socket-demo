package com.will.socketapp.echo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.will.socketapp.models.EchoClient;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class EchoTest {

  @Test
  public void givenEchoClient_whenServerEchosMessage_thenCorrect() throws IOException {
    EchoClient client = new EchoClient();
    client.startConnection("127.0.0.1", 4444);

    String resp1 = client.sendMessage("hello");
    String resp2 = client.sendMessage("world");
    String resp3 = client.sendMessage("!");
    String resp4 = client.sendMessage(".");

    assertEquals("hello", resp1);
    assertEquals("world", resp2);
    assertEquals("!", resp3);
    assertEquals("good bye", resp4);

    client.stopConnection();
  }

}
