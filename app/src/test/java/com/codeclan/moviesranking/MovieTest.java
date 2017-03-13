package com.codeclan.moviesranking;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by Adam Baxter on 13/03/2017.
 */

public class MovieTest {

    Movie movie1;

    @Before
    public void before(){
        movie1 = new Movie("Space Jam", "Factual", 1);
    }

    @Test
    public void testMovieHasTitle(){
        assertEquals("Space Jam", movie1.getTitle() );
    }

    @Test
    public void testMovieGenre(){
        assertEquals("Factual", movie1.getGenre());
    }

    @Test
    public void testRanking(){
        assertEquals(1, movie1.getRanking());
    }

    @Test
    public void testToStringOverride(){
        assertEquals(movie.toString, "Not what to string does normally");
    }



}

