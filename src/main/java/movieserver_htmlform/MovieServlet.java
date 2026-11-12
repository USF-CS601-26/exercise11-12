package movieserver_htmlform;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringEscapeUtils;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MovieServlet extends HttpServlet {
    private List<Movie> movies = new ArrayList<>();

    public MovieServlet() {
        Movie m1 = new Movie("Inception", "Christopher Nolan", 2010);
        Movie m2 = new Movie("Titanic", "James Cameron", 1997);
        Movie m3 = new Movie("The Godfather", "Francis Ford Coppola", 1972);
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter out = response.getWriter();

        // TODO: Complete the HTML form.
        // Specify the method, action, and name of the input field.
        out.println("<form method=\"TODO\" action=\"TODO\">");
        out.println("Enter name:<br><input type=\"text\" name=\"TODO\"><br>");
        out.println("<p><input type=\"submit\" value=\"Enter\"></p>");
        out.println("</form>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter out = response.getWriter();

        // TODO: Read the search parameter from the form.

        // TODO: Escape the search parameter using
        // StringEscapeUtils.escapeHtml4().


        // TODO: Display the heading "Movies:" using an HTML h1 tag.

        // TODO: Find all movies whose names contain the search keyword.
        // Display each matching movie in an HTML paragraph.
    }
}