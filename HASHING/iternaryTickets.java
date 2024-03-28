import java.util.HashMap;

public class iternaryTickets {
    public static void main(String[] args) {
        HashMap<String, String> Tickets = new HashMap<>();
        Tickets.put("chennai", "bengaluru");
        Tickets.put("mumbai", "delhi");
        Tickets.put("goa", "chennai");
        Tickets.put("delhi", "goa");
  
        String start = start(Tickets);

        while (Tickets.containsKey(start)) {
            System.out.print(start + " -> ");
            start = Tickets.get(start);
        }
        System.out.print(start);
    }

    public static String start(HashMap<String, String> Tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : Tickets.keySet()) {
            revMap.put(Tickets.get(key), key);
        }

        for (String key : Tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
}
