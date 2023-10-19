package Streams;


import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatefromList {
    public void functionn() {
        List<Integer> integers = Arrays.asList(1,6,34,4,2,4,1,2,6,7,7,7,9,3,5);

    List<Integer> result = integers.stream().sorted().distinct().collect(Collectors.toList());
    System.out.println(result);

    }
}