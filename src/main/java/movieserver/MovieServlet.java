package movieserver;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
        PrintWriter out = response.getWriter(); // print writer of the response

        // TODO: Get the value of parameter "search" and clean the input by using StringEscapeUtils.escapeHtml4(param);
        // Treat the parameter as the title of the movie
        // Find the movie(s) with this title in the list of movies (if the search parameter is blank, include all the movies)
        JsonObject moviesObj = new JsonObject();
        JsonArray allMovies = new JsonArray();

        // Create a json object that contains movies and write it to the PrintWriter of the response


    }

}
