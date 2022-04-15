import ws.BanqueServise;

import javax.xml.ws.Endpoint;

public class ServeuJaxWS {
    public static void main(String[] args) {
        String url = "http://localhost:8080/";
        Endpoint.publish(url,new BanqueServise());
        System.out.println("web service déploye sur "+url);
    }
}
