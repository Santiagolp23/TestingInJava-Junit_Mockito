package com.platzi.javatests.movies.data;

import com.platzi.javatests.movies.model.Genre;
import com.platzi.javatests.movies.model.Movie;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class MovieRepositoryIntegrationTest {
    static MovieRepositoryJdbc movieRepository;
    static JdbcTemplate jdbcTemplate;

    @BeforeClass
    public static void start() throws SQLException {

        DataSource dataSource =
                new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL", "sa", "");

        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));

        jdbcTemplate = new JdbcTemplate(dataSource);
        movieRepository = new MovieRepositoryJdbc(jdbcTemplate);
    }

    @Test
    public void loadAllMovies() throws SQLException {

        Collection<Movie> movies = movieRepository.findAll();

        assertEquals(movies, Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "Matrix", 136, Genre.ACTION),
                new Movie(4, "Superman", 143, Genre.ACTION),
                new Movie(5, "Super 8", 112, Genre.THRILLER)

        ));
    }

    @Test
    public void loadMovieById() {
        Movie movie = movieRepository.findById(2);
        assertEquals(new Movie(2, "Memento", 113, Genre.THRILLER), movie);
    }

    @Test
    public void insertNewMovie() {
        Movie movie = new Movie(5, "Super 8", 112, Genre.THRILLER);

        movieRepository.saveOrUpdate(movie);

        assertEquals(movieRepository.findById(5), movie);
    }

    @Test
    public void searchMovieByName() {
        Collection<Movie> movies = movieRepository.findByName("Super");

        assertEquals(movies, Arrays.asList(
                new Movie(4, "Superman", 143, Genre.ACTION),
                new Movie(5, "Super 8", 112, Genre.THRILLER)
        ));

    }
}