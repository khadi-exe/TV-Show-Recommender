package service;

import model.TVShow;
import model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RecommendationService {

    public List<TVShow> recommendShows(List<TVShow> allShows, User user) {
        List<TVShow> recommendations = new ArrayList<>();

        for (TVShow show : allShows) {
            if (show.getGenre().equalsIgnoreCase(user.getPreferredGenre())
                    && !user.getWatchedShows().contains(show.getTitle())) {
                recommendations.add(show);
            }
        }

        recommendations.sort(Comparator.comparingDouble(TVShow::getRating).reversed());
        return recommendations;
    }
}
