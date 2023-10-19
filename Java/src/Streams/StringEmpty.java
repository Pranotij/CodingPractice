package Streams;


import java.util.function.Predicate;

public class StringEmpty {
    public void se() {
        Predicate<String> p = str-> str.isEmpty();

        String str1 = "";
        String str2 = "Java";
        System.out.print(p.test(str1));


    }
}