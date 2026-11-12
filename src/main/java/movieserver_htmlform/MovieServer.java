package movieserver_htmlform;

import org.eclipse.jetty.ee10.servlet.ServletContextHandler;
import org.eclipse.jetty.server.Server;

public class MovieServer {
    public static final int PORT = 6500;

    static void main(String[] args) {
        Server server = new Server(PORT);
        ServletContextHandler handler = new ServletContextHandler();
        handler.setContextPath("/");

        // when the user goes to http://localhost:6500/movies, the get request is
        // going to go to MovieServlet
        // Expects a parameter:  ?search=movieName
        handler.addServlet(MovieServlet.class, "/movies");
        server.setHandler(handler);

        try {
            server.start();
            server.join();
        } catch (Exception e) {
            System.out.println("Could not start the server: " + e);
        }
    }
}
