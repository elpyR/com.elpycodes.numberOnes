import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class NumberOnes {
    public Map<String, Set<String>> artistsMap = new HashMap();

    public NumberOnes() {
        int size = this.artistsMap.size();
    }

    public void recordData() {
        Set<String> arctic = new TreeSet();
        arctic.add("I Bet You Look Good On The Dancefloor");
        arctic.add("When The Sun Goes Down");
        this.artistsMap.put("Arctic Monkeys", arctic);
        Set<String> bowie = new TreeSet();
        bowie.add("Space Oddity");
        bowie.add("Ashes to Ashes");
        bowie.add("Under Pressure");
        bowie.add("Let's Dance");
        bowie.add("Dancing In The Street");
        this.artistsMap.put("David Bowie", bowie);
        Set<String> mac = new TreeSet();
        mac.add("Albatross");
        this.artistsMap.put("Fleetwood Mac", mac);
        Set<String> oasis = new TreeSet();
        oasis.add("Some Might Say");
        oasis.add("Don't Look Back in Anger");
        oasis.add("D'You know What I Mean?");
        oasis.add("Go Let It Out");
        oasis.add("The Hindu Times");
        oasis.add("Lyla");
        oasis.add("The Importance of Being Idle");
        this.artistsMap.put("Oasis", oasis);
        Set<String> queen = new TreeSet();
        queen.add("Bohemian Rhapsody");
        queen.add("Under Pressure");
        queen.add("Innuendo");
        queen.add("These Are The Days Of Our Lives");
        queen.add("Five Live");
        queen.add("We Will Rock You");
        this.artistsMap.put("Queen", queen);
    }

    public void printMap() {
        Set<String> artistsKeys = this.artistsMap.keySet();
        Iterator i$ = artistsKeys.iterator();

        while(i$.hasNext()) {
            String eachArtist = (String)i$.next();
            System.out.println(eachArtist + " has had the following UK number one singles: " + this.artistsMap.get(eachArtist));
        }

    }

    public void printMapValue(String key) {
        if (this.artistsMap.containsKey(key)) {
            System.out.println(key + " is present in the map and has had the following UK number one singles: " + this.artistsMap.get(key));
        } else {
            System.out.println(key + " is not present in the map!");
        }

    }

    public void addMapEntry(String key, Set<String> value) {
        this.artistsMap.put(key, value);
    }

    public void deleteEntry(String key) {
        this.artistsMap.remove(key);
    }

    public void addToValue(String key, String value) {
        if (this.artistsMap.containsKey(key)) {
            Set<String> aValue = (Set)this.artistsMap.get(key);
            aValue.add(value);
        } else {
            System.out.println(key + " is not present in the map!");
        }

    }

    public void deleteFromValue(String key, String value) {
        if (this.artistsMap.containsKey(key)) {
            Set<String> aValue = (Set)this.artistsMap.get(key);
            aValue.remove(value);
        } else {
            System.out.println(key + " is not present in the map!");
        }

    }
}