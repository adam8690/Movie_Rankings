package com.codeclan.moviesranking;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Adam Baxter on 13/03/2017.
 */

public class MovieTest {

    @Before
    Movie movie1 = new Movie("Space Jam", "Factual");

    @Test
    public void testMovieHasTitle(){
        assertEquals("Space Jam", movie.getTitle());
    }

}

