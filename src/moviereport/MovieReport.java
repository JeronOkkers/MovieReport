/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moviereport;

/**
 *
 * @author okker
 */
public class MovieReport {
    public static void main(String[] args) {
        // Initialize movie titles and their corresponding monthly ticket sales
        String[] movies = {"Napolean", "Oppenheimer"};
        int[][] ticketSales = {
            {3000, 1500, 1700}, // Napolean sales (Jan, Feb, Mar)
            {3500, 1200, 1600}  // Oppenheimer sales (Jan, Feb, Mar)
        };

        iMovieTickets movieTickets = new MovieTickets(); 
        int[] totalSales = new int[movies.length];

        // Calculate total sales for each movie
        for (int i = 0; i < movies.length; i++) {
            totalSales[i] = movieTickets.TotalMovieSales(new int[][]{ticketSales[i]}); 
        }

        // Display the report header
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        System.out.println("                               "); // Spacing for formatting
        System.out.println("\t\t\tJAN\t\tFEB\t\tMAR");
        System.out.println("------------------------------------------------------------");

        // Display monthly sales for each movie
        for (int i = 0; i < movies.length; i++) {
            System.out.print(movies[i] + "\t\t");
            for (int j = 0; j < ticketSales[i].length; j++) {
                System.out.print(ticketSales[i][j] + "\t\t");
            }
            System.out.println();
        }

        System.out.println(); // Spacing for formatting

        // Display total sales for each movie
        for (int i = 0; i < movies.length; i++) {
            System.out.println("Total movie ticket sales for " + movies[i] + ": " + totalSales[i]);
        }

        // Determine and display the top-performing movie
        String topMovie = movieTickets.TopMovies(movies, totalSales);
        System.out.println(); // Spacing for formatting
        System.out.println("Top performing movie: " + topMovie);

    }
}
//---------------------...ooo000 END OF FILE 000ooo...------------------------//