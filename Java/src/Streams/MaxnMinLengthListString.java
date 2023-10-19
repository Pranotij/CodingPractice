package Streams;

import java.util.Arrays;
import java.util.List;

public class MaxnMinLengthListString {
    public void maxmin() {
        boolean b= false;

        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");
       int max= colors.stream().mapToInt(String::length).max().orElse(0);
        int min = colors.stream().mapToInt(String::length).min().orElse(0);

        System.out.println("Max is"+ max);
        System.out.println("Min is"+ min);
    }
}