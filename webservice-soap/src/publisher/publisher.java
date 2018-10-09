package publisher;

import javax.xml.ws.Endpoint;
import webservice.Server;

public class publisher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/biblioteca", new Server());
    }
    
}
