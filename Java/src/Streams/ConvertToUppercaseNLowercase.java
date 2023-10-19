package Streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ConvertToUppercaseNLowercase {
    public void ctul() {
        List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");

      stringList.replaceAll(str -> str.toLowerCase());
        System.out.println(stringList);
        stringList.replaceAll((str->str.toUpperCase()));
        System.out.println(stringList);

    }
}