/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package moviereport;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author okker
 */
public class MovieTicketsTest {
    
    public MovieTicketsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Test of TotalMovieSales method, of class MovieTickets.
     */
    @Test
    public void CalculateTotalSales_ReturnsExpectedTotalSales() {
        iMovieTickets movieTickets = new MovieTickets();
        int[][] movieTicketSales = {{3000, 1500, 1700}};
        int expectedTotalSales = 6200;
        int actualTotalSales = movieTickets.TotalMovieSales(movieTicketSales);
        assertEquals(expectedTotalSales, actualTotalSales);
    }
    
    /**
     * Test of TotalMovieSales method, of class MovieTickets.
     */
    @Test
    public void TopMovieSales_ReturnsTopMovie() {
        iMovieTickets movieTickets = new MovieTickets();
        String[] movies = {"Napolean", "Oppenheimer"};
        int[] totalSales = {6200, 6300};
        String expectedTopMovie = "Oppenheimer";
        String actualTopMovie = movieTickets.TopMovies(movies, totalSales);
        assertEquals(expectedTopMovie, actualTopMovie);
    }
    

}
//---------------------...ooo000 END OF FILE 000ooo...------------------------//
