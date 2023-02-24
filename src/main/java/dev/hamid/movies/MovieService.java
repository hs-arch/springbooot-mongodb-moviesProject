package dev.hamid.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRespository;
    public List<Movie> AllMovies(){
        return movieRespository.findAll();
    }
}
