package lesson3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String args[]){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");
        arrayList.add("fourth");
        arrayList.add("fifth");
        arrayList.add("sixth");
        arrayList.remove("sixth");
        System.out.println("Is collection contains 'sixth'?: " + arrayList.contains("sixth"));
        System.out.println();
        System.out.println("Before sort:");

        for (String item:arrayList) {
            System.out.println("Collection item " + arrayList.indexOf(item) + ": " + item);
        }

        Collections.sort(arrayList);

        System.out.println();
        System.out.println("After sort:");

        for (String item:arrayList) {
            System.out.println("Collection item: " + arrayList.indexOf(item) + " " + item);
        }

    }
}
