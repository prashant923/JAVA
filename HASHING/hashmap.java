import java.util.HashMap;
import java.util.HashSet;
import java.util.Map; // Importing Map interface
import java.util.*;
public class hashmap {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); // Creating a new HashMap instance

        // Inserting key-value pairs into the map
        map.put("china", 120);
        map.put("India", 140);
        map.put("USA", 80);

        // Printing the map
        System.out.println(map);

        // Updating the value associated with the key "china"
        map.put("china", 23);

        // Printing the updated map
        System.out.println(map);

        // Removing a key-value pair from the map
        map.remove("china");

        // Printing the map after removal
        System.out.println(map);

        // Iterating over the entries of the map and printing each key-value pair
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key+" "+ map.get(key));
        }
    }
}
