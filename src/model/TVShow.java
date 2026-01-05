package model;

public class TVShow {
    private String title;
    private String genre;
    private double rating;

    public TVShow(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return title + " (" + genre + ", Rating: " + rating + ")";
    }
}
