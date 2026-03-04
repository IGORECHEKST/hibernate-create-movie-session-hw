package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {

        Injector injector = Injector.getInstance("mate.academy");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie fastAndFurious = new Movie("Fast and Furious");
        fastAndFurious.setDescription("An action film about street racing, heists, and spies.");

        movieService.add(fastAndFurious);

        System.out.println("Get movie by ID: " + movieService.get(fastAndFurious.getId()));

        System.out.println("All movies list:");
        movieService.getAll().forEach(System.out::println);
    }
}
