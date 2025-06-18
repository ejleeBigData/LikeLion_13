import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banna");
        fruits.add("banna");
        fruits.add("Cherry");
        fruits.add("Tomato");
        fruits.add("Durian");
        fruits.add("Green Grape");
        fruits.add("tomato");

        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            String item = it.next();
            System.out.println(item);
        }
    }

}