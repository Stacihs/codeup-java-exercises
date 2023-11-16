package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {

        Movie[] movies = MoviesArray.findAll();

        System.out.println("What would you like to do?\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "Enter the number of your choice: "
        );

        Input input = new Input();
        int choice = input.getInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    for (Movie movie : movies) {
                        System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    }
                    break;
                case 2:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                        }
                    }
                    break;
                default:
                    choice = 0;
                    System.exit(0);
            }

        }
    }


}
