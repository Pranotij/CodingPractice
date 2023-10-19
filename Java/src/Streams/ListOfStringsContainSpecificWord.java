package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListOfStringsContainSpecificWord {
    public void ps() {
        boolean b= false;

        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");
       String key ="Red";

       Predicate<String> p = value -> value.equals(key);

       System.out.println(colors.stream().anyMatch(p));
    }
}