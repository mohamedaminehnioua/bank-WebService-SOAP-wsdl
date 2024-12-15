package server;

import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class ServerJWS {
    public static void main(String[] args) {
        final String url = "http://0.0.0.0:6655/";
        Endpoint.publish(url, new BankService());
        System.out.println("Server started at " + url);
    }
}

