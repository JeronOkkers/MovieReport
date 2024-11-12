/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moviereport;

/**
 * This class provides methods for calculating total movie ticket sales and 
 * identifying the top-performing movie.
 * 
 * @author okker
 */
public class MovieTickets implements iMovieTickets {

    /**
     * Calculates the total ticket sales for a given movie across all months.
     * 
     * @param movieTicketSales A 2D array representing monthly ticket sales.
     * @return The total ticket sales for the movie.
     */
    @Override
    public int TotalMovieSales(int[][] movieTicketSales) {
        int totalSales = 0;
        for (int[] movieSales : movieTicketSales) {
            for (int monthSales : movieSales) {
                totalSales += monthSales;
            }
        }
        return totalSales;
    }

    /**
     * Determines the top-performing movie based on total ticket sales.
     * 
     * @param movies An array of movie titles.
     * @param totalSales An array of corresponding total sales for each movie.
     * @return The title of the top-performing movie.
     */
    @Override
    public String TopMovies(String[] movies, int[] totalSales) {
        int maxIndex = 0;
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > totalSales[maxIndex]) {
                maxIndex = i;
            }
        }
        return movies[maxIndex];
    }
}
//---------------------...ooo000 END OF FILE 000ooo...------------------------//