//1. Write a program that reads a list of strings and removes duplicate strings from the list using the Stream API. Avoid using lambda expressions for this task.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("banana");
        
        // Remove duplicates using Stream API
        List<String> uniqueStrings = stringList.stream()
                                               .distinct() // Using distinct() method
                                               .collect(Collectors.toList());
        
        // Print the list without duplicates
        System.out.println("List without duplicates:");
        uniqueStrings.forEach(System.out::println);
    }
}
