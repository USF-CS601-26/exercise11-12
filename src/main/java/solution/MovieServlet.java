package solution;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
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

        String keyword = request.getParameter("search");
        if (keyword == null)
            keyword = "";
        //System.out.println(keyword);
        keyword =  StringEscapeUtils.escapeHtml4(keyword);

        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter out = response.getWriter();
        // Displays json with movies that contain this keyword:
        JsonObject moviesObj = new JsonObject();
        JsonArray allMovies = new JsonArray();
        for (Movie movie: movies) {
            if (movie.getName().contains(keyword)) {
                JsonObject oneMovieJsonObj = movie.serializeMovie();
                allMovies.add(oneMovieJsonObj);
            }
        }
        moviesObj.add("movies", allMovies);
        out.println(moviesObj);

    }

}
