//2.Create a program that reads a list of strings and concatenates them into a single string using the Stream API. Avoid using lambda expressions for concatenation.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStringsUsingStreamAPI {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");

        // Concatenate strings using Stream API
        String concatenatedString = stringList.stream()
                                              .collect(Collectors.joining());

        // Print the concatenated string
        System.out.println("Concatenated string: " + concatenatedString);
    }
}
