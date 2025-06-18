import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();

        fruits.add("Elderberry");
        fruits.add("Melon");
        fruits.add("Apple");
        fruits.add("Banna");
        fruits.add("Cherry");
        fruits.add("Durian");
        fruits.add("Green Grape");

        String fruit = "Kiwi";

        if( fruits.contains(fruit) ) {
            System.out.println(fruit + " 있음");
        } else {
            System.out.println(fruit + " 없음.");
        }

    }

}