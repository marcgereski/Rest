package kz.kase.webserver;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class GrizzlyServer {
    public static final String BASE_URI = "http://192.168.111.128:8080";

    public static HttpServer startServer() {


        final ResourceConfig rc = new ResourceConfig().packages("kz.kase.rest");
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }

    public static void main(String[] args) throws IOException {
        final HttpServer server = startServer();
        System.out.println("Visit: " + BASE_URI + "/actions");
        System.out.println("Hit enter to stop ...");

        System.in.read();
        server.shutdown();
    }

}
