package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestandSmallest {
    public void largesmall() {
        List<Integer> nums =Arrays.asList(1, 7, 18, 25, 77, 300, 101);
//        Collections.sort(nums);
//        System.out.println(" Second Smallest number is "+ nums.get(1));
//        Collections.reverse(nums);
//        System.out.println(" Second Largest number is "+ nums.get(1));
        //OR
       int large =  nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println(" Second Largest number is "+ large);
        int small = nums.stream().distinct().sorted().skip(1).findFirst().orElse(0);
        System.out.println(" Second Smallest number is "+ nums.get(1));

    }
}