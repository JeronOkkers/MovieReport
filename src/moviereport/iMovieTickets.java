/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moviereport;

/**
 * This interface defines the methods for calculating total movie ticket sales and
 * identifying the top-performing movie.
 * 
 * @author okker
 */
public interface iMovieTickets {

    /**
     * Calculates the total ticket sales for a given movie.
     * 
     * @param movieTicketSales A 2D array representing the ticket sales.
     * @return The total ticket sales.
     */
    int TotalMovieSales(int[][] movieTicketSales);

    /**
     * Determines the top-performing movie based on total sales.
     * 
     * @param movies An array of movie titles.
     * @param totalSales An array of corresponding total sales for each movie.
     * @return The title of the top-performing movie.
     */
    String TopMovies(String[] movies, int[] totalSales);
}
//---------------------...ooo000 END OF FILE 000ooo...------------------------//