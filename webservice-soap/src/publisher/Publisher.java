package publisher;

import javax.xml.ws.Endpoint;
import webservice.Server;

public class Publisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9876/webservice-soap", new Server());
    }
}
