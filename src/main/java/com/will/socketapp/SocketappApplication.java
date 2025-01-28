package com.will.socketapp;

import com.will.socketapp.models.EchoMultiServer;
import com.will.socketapp.models.EchoServer;
import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocketappApplication {

	public static void main(String[] args) throws IOException {SpringApplication.run(SocketappApplication.class, args);
		EchoMultiServer echoMultiServer = new EchoMultiServer();
		echoMultiServer.start(5555);
	}

}
