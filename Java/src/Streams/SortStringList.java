package Streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringList {
    public void sortStringList() {
        List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");

        List<String> sl = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println(sl);

    }
}