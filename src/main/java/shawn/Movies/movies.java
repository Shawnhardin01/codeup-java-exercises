package shawn.Movies;

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

