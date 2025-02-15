import java.util.ArrayList;
import java.util.Collections;

public class BasicListing {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding Elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Insert at a specific index
        list.add(1, "Orange");

        //Accessing Elements
        System.out.println("Element at index 2: " + list.get(2));

        //Updating an Element
        list.set(1, "Grapes");

        // Removing Elements
        list.remove(2); // Removes "Banana"
        list.remove("Apple"); // Removes "Apple"

        //Checking Size
        System.out.println("List size: " + list.size());

        //Checking if an element exists
        System.out.println("Contains Mango? " + list.contains("Mango"));

        // Iterating Over ArrayList
        System.out.println("Final List:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Sorting in Ascending Order
        Collections.sort(list);
        System.out.println("Sorted List (Ascending): " + list);

        // Sorting in Descending Order
        list.sort(Collections.reverseOrder());
        System.out.println("Sorted List (Descending): " + list);

        // compareTo() Example (Comparing Strings)
        String str1 = "Apple";
        String str2 = "Banana";
        int result = str1.compareTo(str2);
        
        if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else if (result > 0) {
            System.out.println(str1 + " comes after " + str2);
        } else {
            System.out.println(str1 + " is equal to " + str2);
        }

        // repeat() Example (Repeating a String) - Available in Java 11+
        String repeatedStr = "Hello".repeat(3);
        System.out.println("Repeated String: " + repeatedStr); // Output: HelloHelloHello

        // Iterating Over ArrayList
        System.out.println("Final List:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        //Clearing the List
        list.clear();
        System.out.println("List after clear: " + list);
    }
}
