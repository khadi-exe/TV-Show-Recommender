import model.User;
import model.TVShow;
import service.RecommendationService;
import util.DataLoader;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<TVShow> shows = DataLoader.loadShows("data/tvshows.txt");

        User user = new User("Alex", "Drama");
        user.watchShow("Breaking Bad");

        RecommendationService service = new RecommendationService();
        List<TVShow> recommendations = service.recommendShows(shows, user);

        System.out.println("Recommended TV Shows for " + user.getName() + ":");
        for (TVShow show : recommendations) {
            System.out.println(show);
        }
    }
}
