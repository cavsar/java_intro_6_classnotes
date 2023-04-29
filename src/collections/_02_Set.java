package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class _02_Set {
    public static void main(String[] args) {
        /*
        SET comes to mind when we talk about collections that has unique elements

        Set is an interface, and it has some class implementation as below
            -Set does not keep insertion order
            -Set does not allow duplicates
            -Set allow ONLY 1 null element

        1. HashSet: the most common Set implementation
               - It does not keep insertion order - unpredictable
               - It does not allow duplicates
               - It allows ONLY 1 null element

        2. LinkedHashSet
               - It keeps insertion order - predictable
               - It does not allow duplicates
               - It allows ONLY 1 null element

        3. TreeSet
               - It keeps insertion order - it sorts the elements
               - It does not allow duplicates
               - It DOES NOT ALLOW any null element as it does not know how to sort it with numbers and strings
         */

        System.out.println("\n----------HashSet---------\n");
        HashSet<String> objects = new HashSet<>();
        objects.add(null);
        objects.add("Sandina");
        objects.add(null);
        objects.add("Okan");
        objects.add("Alex");
        objects.add("Alex");
        objects.add("John");
        objects.add("abc");
        objects.add("123");
        objects.add("");
        objects.add("Sal");
        objects.add("Boo");


        System.out.println(objects); // [null, Sandina, , Alex, 123, abc, Boo, John, Okan, Sal]

        objects.remove(null);

        System.out.println(objects); // [Sandina, , Alex, 123, abc, Boo, John, Okan, Sal]

        objects.add(null);

        System.out.println(objects); // [Sandina, , null, Alex, 123, abc, Boo, John, Okan, Sal]
        ArrayList<String> list = new ArrayList<>(objects);
        System.out.println(list.get(2)); //


        System.out.println("\n----------LinkedHashSet---------\n");
        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add(null);
        words.add("Sandina");
        words.add(null);
        words.add("Okan");
        words.add("Alex");
        words.add("Alex");
        words.add("John");
        words.add("abc");
        words.add("123");
        words.add("");
        words.add("Sal");
        words.add("Boo");

        System.out.println(words); // [null, Sandina, Okan, Alex, John, abc, 123, , Sal, Boo]


    }
}
