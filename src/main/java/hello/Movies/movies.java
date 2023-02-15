package hello.Movies;

import java.util.ArrayList;
import java.util.List;

import static hello.Movies.MoviesArray.findAll;

public class movies {
    static class Movie {
        public String name;

        @Override
        public String toString() {
            return "Movie{" +
                    "name='" + name + '\'' +
                    ", category='" + category + '\'' +
                    '}';
        }

        public Movie(String name, String category) {
            this.name = name;
            this.category = category;
        }

        public String category;


    }

}

