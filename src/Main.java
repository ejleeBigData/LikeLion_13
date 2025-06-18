import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();

        fruits.add("Elderberry");
        fruits.add("Melon");
        fruits.add("Apple");
        fruits.add("Banna");
        fruits.add("Cherry");
        fruits.add("Tomato");
        fruits.add("Durian");
        fruits.add("Green Grape");

        System.out.println(fruits.size());

        fruits.clear();

        System.out.println(fruits.size());

    }

}