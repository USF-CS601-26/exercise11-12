# Exercise: Movie Search with an HTML Form

In this exercise, you will implement a servlet that displays an HTML form where the user can enter a movie title and then displays matching movies in HTML.

The starter code includes MovieServer and Movie classes. Your task is to complete the implementation of the MovieServlet class.

The MovieServlet class stores the following movies:
- Inception, Christopher Nolan, 2010
- Titanic, James Cameron, 1997
- The Godfather, Francis Ford Coppola, 1972

1. Implement the doGet() method:
   - Set the response content type to text/html and the HTTP status to 200.
   - Complete the HTML form by specifying the method, action, and name of the text input field. Use /movies or, better, use request.getServletPath() for the action.
   - The form should use the POST method and submit to the same servlet.
   - Add a submit button.

2. Implement the doPost() method:
   - Read the "search" parameter submitted through the form.
   - Clean the search parameter using StringEscapeUtils.escapeHtml4().
   - Set the response content type to text/html and the HTTP status to 200.
   - Find all movies whose names contain the search keyword (case-sensitive).
   - Generate an HTML response with the heading "Movies:" and display each matching movie in a separate paragraph.

# Testing

Run MovieServer and open:

http://localhost:6500/movies

You should see an HTML form where you can enter a movie title.

Enter "Titanic" and click the submit button.

The browser should display:

Movies:

Titanic James Cameron 1997
