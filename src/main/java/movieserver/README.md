# Exercise: Movie Search Servlet

In this exercise, you will implement a servlet that handles HTTP GET requests and returns movie information in JSON format.

The starter code includes MovieServer, which starts the Jetty server on port 6500, and Movie, which represents a movie and provides a method to convert it to JSON.

Your task is to complete the implementation of the MovieServlet class.

First, take a look at the MovieServlet class that extends HttpServlet. It stores the list of movies.
In the constructor, we add the following movies to the list:
   - Inception, Christopher Nolan, 2010
   - Titanic, James Cameron, 1997
   - The Godfather, Francis Ford Coppola, 1972

1. Fill in code in the doGet() of MovieServlet:
   - Read the "search" query parameter. If it is missing, use an empty string.
   - Clean the search parameter using StringEscapeUtils.escapeHtml4() before searching for matching movies.
   - Find all movies whose names contain the search keyword (case-sensitive).
   - Use serializeMovie() in class Movie and Gson's JsonArray and JsonObject to build the JSON response.
   - Set the content type to application/json and the HTTP status to 200 using methods response.setContentType(..)
     and response.setStatus(HttpServletResponse.SC_OK).
   - Send the JSON response to the browser.

# Testing

Run MovieServer and test these URLs:

http://localhost:6500/movies

Returns JSON containing all three movies.

http://localhost:6500/movies?search=Titanic

Returns JSON containing only Titanic.

http://localhost:6500/movies?search=Avatar

Returns JSON with an empty movies array.

The JSON response should have the following structure:

```json
{
  "movies": [
    {
      "name": "Titanic",
      "director": "James Cameron",
      "year": 1997
    }
  ]
}
```