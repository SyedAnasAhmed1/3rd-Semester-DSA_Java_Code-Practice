import java.util.HashMap;
import java.util.Map;

public class Catalog {
    public static HashMap<String, Object> catalog = new HashMap<>();
    static {
        HashMap<String, Object> electronics = new HashMap<>();
        HashMap<String, Integer> phones = new HashMap<>();
        phones.put("iPhone", 20);
        phones.put("Samsung Galaxy", 15);
        electronics.put("Phones", phones);
        HashMap<String, Integer> laptops = new HashMap<>();
        laptops.put("MacBook Pro", 5);
        laptops.put("Dell XPS", 10);
        electronics.put("Laptops", laptops);
        catalog.put("Electronics", electronics);
        
        HashMap<String, Object> homeAppliances = new HashMap<>();
        HashMap<String, Integer> vacuums = new HashMap<>();
        vacuums.put("Dyson", 10);
        vacuums.put("Shark", 25);
        homeAppliances.put("Vacuum Cleaners", vacuums);
        HashMap<String, Integer> refrigerators = new HashMap<>();
        refrigerators.put("LG", 30);
        refrigerators.put("Samsung", 12);
        homeAppliances.put("Refrigerators", refrigerators);
        catalog.put("Home Appliances", homeAppliances);
    }
    // Recursive function to count items
    public static int countItems(Map<String, Object> catalog) {
        int count = 0;
        for (Object value : catalog.values()) {
            if (value instanceof Map) {
                // If the value is a nested map, recurse into it
                count += countItems((Map<String, Object>) value);
            } else if (value instanceof Integer) {
                // If the value is an integer, it's a product count
                count += (Integer) value;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int totalItems = countItems(catalog);
        System.out.println("Total number of items in the catalog: " + totalItems);
    }
}
