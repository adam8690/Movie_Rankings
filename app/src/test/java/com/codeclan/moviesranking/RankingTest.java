package com.codeclan.moviesranking;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by Adam Baxter on 13/03/2017.
 */

public class RankingTest {

    Movie movie;
    Ranking rankings;

    @Before
    public void before(){
    Movie movie = new Movie("Die Hard", "Action", 10);
    Ranking rankings = new Ranking();
    }

    @Test
    public void testMovieAddedToEnd(){
    rankings.addMovie(movie);
        assertEquals(movie, rankings.rankings[9]);
    }

    @Test
    public void testGetMovieByRanking(){
        assertEquals(movie, rankings.getMovie(10));
    }
}

