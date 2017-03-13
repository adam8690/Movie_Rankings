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
        movie1 = new Movie("Space Jam", "Factual");
    }

    @Test
    public void testMovieHasTitle(){
        assertEquals("Space Jam", movie1.getTitle() );
    }

}

