package util;

import model.TVShow;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {

    public static List<TVShow> loadShows(String filePath) {
        List<TVShow> shows = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                shows.add(new TVShow(parts[0], parts[1], Double.parseDouble(parts[2])));
            }
        } catch (Exception e) {
            System.out.println("Error loading TV shows: " + e.getMessage());
        }

        return shows;
    }
}
