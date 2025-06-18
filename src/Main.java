import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Banna");
        fruits.add("Cherry");
        fruits.add("Durian");
        fruits.add("Elderberry");
        fruits.add("Melon");
        fruits.add("Green Grape");

        /*
        for(int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        */

        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}