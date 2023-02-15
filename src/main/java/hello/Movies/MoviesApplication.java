package hello.Movies;
import java.util.Arrays;
import hello.util.Input;

import static hello.Movies.MoviesArray.*;

public class MoviesApplication {

    private static final Input input = new Input();

    public static void main(String[] args) {


        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n");

        int userInput;
        System.out.println("enter number");
        userInput = input.getInt(0, 5);
        if (userInput == 1) {
            System.out.println(Arrays.toString(findAll()));
        } else if (userInput == 2) {
            System.out.println(Arrays.toString(findAnimatedMovies()));
        } else if (userInput == 3)
        {    System.out.println(Arrays.toString(findDramaMovies()));
        }  else if (userInput == 4)
            System.out.println(Arrays.toString(findHorrorMovies()));
          else if (userInput == 5)
            System.out.println(Arrays.toString(findScifiMovies()));
          else if (userInput == 0)
            System.out.println("bye");

    }

}
