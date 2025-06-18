import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> SnackPrices = new HashMap<>();

        SnackPrices.put("Juice", 2500);
        SnackPrices.put("Candy", 1500);
        SnackPrices.put("Coke",  2000);
        SnackPrices.put("Chip",  3500);
        SnackPrices.put("Jelly", 1800);

        for(Map.Entry<String, Integer> entry : SnackPrices.entrySet() ) {
            System.out.println(entry.getKey() + " 값 : " + entry.getValue() + " 원");
        }
    }

}