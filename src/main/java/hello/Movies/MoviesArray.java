package hello.Movies;

import java.util.ArrayList;
import java.util.List;

public class MoviesArray {


    public static movies.Movie[] findAll() {
        return new movies.Movie[]{
                new movies.Movie("Citizen Kane", "drama"),
                new movies.Movie("Casablanca", "drama"),
                new movies.Movie("The Godfather", "drama"),
                new movies.Movie("Gone With The Wind", "drama"),
                new movies.Movie("Lawrence Of Arabia", "drama"),
                new movies.Movie("The Wizard Of Oz", "musical"),
                new movies.Movie("The Graduate", "drama"),
                new movies.Movie("On The Waterfront", "drama"),
                new movies.Movie("Schindler's List", "drama"),
                new movies.Movie("Singin' In The Rain", "musical"),
                new movies.Movie("It's A Wonderful Life", "drama"),
                new movies.Movie("Sunset Boulevard", "drama"),
                new movies.Movie("The Bridge On The River Kwai", "drama"),
                new movies.Movie("Some Like It Hot", "drama"),
                new movies.Movie("Star Wars", "scifi"),
                new movies.Movie("All About Eve", "drama"),
                new movies.Movie("The African Queen", "drama"),
                new movies.Movie("Psycho", "horror"),
                new movies.Movie("Chinatown", "drama"),
                new movies.Movie("One Flew Over The Cuckoo's Nest", "drama"),
                new movies.Movie("The Grapes Of Wrath", "drama"),
                new movies.Movie("2001: A Space Odyssey", "scifi"),
                new movies.Movie("The Maltese Falcon", "drama"),
                new movies.Movie("Raging Bull", "drama"),
                new movies.Movie("E.T. The extra-terrestrial", "scifi"),
                new movies.Movie("Dr. Strangelove", "drama"),
                new movies.Movie("Bonnie And Clyde", "drama"),
                new movies.Movie("Apocalypse Now", "drama"),
                new movies.Movie("Mr. Smith Goes to Washington", "drama"),
                new movies.Movie("The Treasure Of The Sierra Madre", "drama"),
                new movies.Movie("Annie Hall", "comedy"),
                new movies.Movie("The Godfather Part II", "drama"),
                new movies.Movie("High Noon", "drama"),
                new movies.Movie("To Kill A Mockingbird", "drama"),
                new movies.Movie("It Happened One Night", "drama"),
                new movies.Movie("Midnight Cowboy", "drama"),
                new movies.Movie("The Best Years Of Our Lives", "drama"),
                new movies.Movie("Double Indemnity", "drama"),
                new movies.Movie("Doctor Zhivago", "drama"),
                new movies.Movie("North By Northwest", "drama"),
                new movies.Movie("West Side Story", "musical"),
                new movies.Movie("Rear Window", "drama"),
                new movies.Movie("King Kong", "horror"),
                new movies.Movie("The Birth Of A Nation", "drama"),
                new movies.Movie("A Streetcar Named Desire", "drama"),
                new movies.Movie("A Clockwork Orange", "scifi"),
                new movies.Movie("Taxi Driver", "drama"),
                new movies.Movie("Jaws", "horror"),
                new movies.Movie("Snow White And The Seven Dwarfs", "animated"),
                new movies.Movie("Butch Cassidy And The Sundance Kid", "drama"),
                new movies.Movie("The Philadelphia Story", "drama"),
                new movies.Movie("From Here To Eternity", "drama"),
                new movies.Movie("Amadeus", "drama"),
                new movies.Movie("All Quiet On The Western Front", "drama"),
                new movies.Movie("The Sound Of Music", "musical"),
                new movies.Movie("M*A*S*H", "comedy"),
                new movies.Movie("The Third Man", "drama"),
                new movies.Movie("Fantasia", "animated"),
                new movies.Movie("Rebel Without A Cause", "drama"),
                new movies.Movie("Raiders Of The Lost Ark", "drama"),
                new movies.Movie("Vertigo", "drama"),
                new movies.Movie("Tootsie", "comedy"),
                new movies.Movie("Stagecoach", "drama"),
                new movies.Movie("Close Encounters Of The Third Kind", "scifi"),
                new movies.Movie("The Silence Of The Lambs", "horror"),
                new movies.Movie("Network", "drama"),
                new movies.Movie("The Manchurian Candidate", "drama"),
                new movies.Movie("An American In Paris", "drama"),
                new movies.Movie("Shane", "drama"),
                new movies.Movie("The French Connection", "drama"),
                new movies.Movie("Forrest Gump", "drama"),
                new movies.Movie("Ben-Hur", "drama"),
                new movies.Movie("Wuthering Heights", "drama"),
                new movies.Movie("The Gold Rush", "drama"),
                new movies.Movie("Dances With Wolves", "drama"),
                new movies.Movie("City Lights", "drama"),
                new movies.Movie("American Graffiti", "drama"),
                new movies.Movie("Rocky", "drama"),
                new movies.Movie("The Deer Hunter", "drama"),
                new movies.Movie("The Wild Bunch", "drama"),
                new movies.Movie("Modern Times", "drama"),
                new movies.Movie("Giant", "drama"),
                new movies.Movie("Platoon", "drama"),
                new movies.Movie("Fargo", "drama"),
                new movies.Movie("Duck Soup", "comedy"),
                new movies.Movie("Mutiny On The Bounty", "drama"),
                new movies.Movie("Frankenstein", "horror"),
                new movies.Movie("Easy Rider", "drama"),
                new movies.Movie("Patton", "drama"),
                new movies.Movie("The Jazz Singer", "drama"),
                new movies.Movie("My Fair Lady", "musical"),
                new movies.Movie("A Place In The Sun", "drama"),
                new movies.Movie("The Apartment", "drama"),
                new movies.Movie("Goodfellas", "drama"),
                new movies.Movie("Pulp Fiction", "drama"),
                new movies.Movie("The Searchers", "drama"),
                new movies.Movie("Bringing Up Baby", "drama"),
                new movies.Movie("Unforgiven", "drama"),
                new movies.Movie("Guess Who's Coming To Dinner", "drama"),
                new movies.Movie("Yankee Doodle Dandy", "musical")
        };
    }
    public static movies.Movie[] findDramaMovies() {
        movies.Movie[] allMovies = findAll();
        List<movies.Movie> dramaMovies = new ArrayList<>();
        for (movies.Movie movie : allMovies) {
            if (movie.category.equals("drama")) {
                dramaMovies.add(movie);
            }
        }
        return dramaMovies.toArray(new movies.Movie[0]);
    }
    public static movies.Movie[] findAnimatedMovies() {
        movies.Movie[] allMovies = findAll();
        List<movies.Movie> animimatedMovies = new ArrayList<>();
        for (movies.Movie movie : allMovies) {
            if (movie.category.equals("animated")) {
                animimatedMovies.add(movie);
            }
        }
        return animimatedMovies.toArray(new movies.Movie[0]);
    }
    public static movies.Movie[] findHorrorMovies() {
        movies.Movie[] allMovies = findAll();
        List<movies.Movie> HorrorMovies = new ArrayList<>();
        for (movies.Movie movie : allMovies) {
            if (movie.category.equals("horror")) {
                HorrorMovies.add(movie);
            }
        }
        return HorrorMovies.toArray(new movies.Movie[0]);
    }
    public static movies.Movie[] findScifiMovies() {
        movies.Movie[] allMovies = findAll();
        List<movies.Movie> ScifiMovies = new ArrayList<>();
        for (movies.Movie movie : allMovies) {
            if (movie.category.equals("scifi")) {
                ScifiMovies.add(movie);
            }
        }
        return ScifiMovies.toArray(new movies.Movie[0]);
    }

}
