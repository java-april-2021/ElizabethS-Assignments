

// Create a trackList of type HashMap
// Add in at least 4 songs that are stored by title
// Pull out one of the songs by its track title
// Print out all the track names and lyrics in the format Track: Lyrics

import java.util.HashMap;
import java.util.Set;

public class SongTracks {
    public static void main (String[] args) {
        HashMap<String, String> userMap = new Hashmap<String, String>();
        userMap.put("Bingo", "There was a farmer had a dog, and Bingo was his namo");
        userMap.put("ABC", "A, B, C, D, E, F, G");
        userMap.put("Sesame St Theme Song", "Sunny day, chasing the clouds away");
        userMap.put("Teapot", "I'm a little tea pot short and stout");

        String SongTracks = userMap.get("Teapot");
        Set<String> keys = userMap.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get (key));
        }
    }
}



