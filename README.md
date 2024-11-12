# Movie Ticket Sales Report

This Java program generates a report of movie ticket sales for the year 2024. It analyzes sales data for multiple movies across different months, calculates total sales for each movie, and identifies the top-performing movie.

## Features

* **Sales Data:** Stores movie titles and their corresponding monthly ticket sales in a 2D array.
* **Total Sales Calculation:** Calculates the total ticket sales for each movie across all months.
* **Top Performer Identification:**  Determines the movie with the highest total sales.
* **Report Generation:**  Displays a formatted report showing monthly sales for each movie and the top-performing movie.

## Classes

* **`MovieReport`:** The main class that drives the program execution. It initializes data, performs calculations, and generates the report output.
* **`MovieTickets`:**  Implements the `iMovieTickets` interface and provides methods for calculating total sales and identifying the top-performing movie.
* **`iMovieTickets`:** An interface that defines the methods for interacting with movie ticket sales data.


## How to Run

1. **Compile:** Compile all Java files (MovieReport.java, MovieTickets.java, iMovieTickets.java) using a Java compiler.
2. **Run:** Execute the compiled `MovieReport` class.

## Example Output
## MOVIE TICKET SALES REPORT - 2024

| Movie        | JAN  | FEB  | MAR  | Total |
|--------------|------|------|------|-------|
| Napolean     | 3000 | 1500 | 1700 | 6200  |
| Oppenheimer | 3500 | 1200 | 1600 | 6300  |

**Top performing movie: Oppenheimer**
## Future Enhancements

* **Data Input:** Implement functionality to read sales data from a file or database.
* **Report Customization:** Allow users to specify the year and  months for the report.
* **Graphical User Interface (GUI):** Develop a user-friendly interface for interacting with the program.
* **Error Handling:**  Add robust error handling to gracefully handle invalid input or unexpected data.

## Contributing

Contributions are welcome! Feel free to submit pull requests for bug fixes, new features, or improvements.
