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

        String fruit = "Tomato";

        if( fruits.contains(fruit) ) {

            System.out.println(fruit + " 있음");

            //fruits.remove(fruit);
            fruits.remove(fruits.indexOf(fruit));

        } else {
            System.out.println(fruit + " 없음.");
        }

        for(String f : fruits) {
            System.out.println(f + "의 인덱스는 :" + fruits.indexOf(f));
        }

    }

}