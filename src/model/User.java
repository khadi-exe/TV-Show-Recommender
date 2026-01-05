package model;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String name;
    private String preferredGenre;
    private Set<String> watchedShows;

    public User(String name, String preferredGenre) {
        this.name = name;
        this.preferredGenre = preferredGenre;
        this.watchedShows = new HashSet<>();
    }

    public String getPreferredGenre() {
        return preferredGenre;
    }

    public Set<String> getWatchedShows() {
        return watchedShows;
    }

    public void watchShow(String showTitle) {
        watchedShows.add(showTitle);
    }

    public String getName() {
        return name;
    }
}
