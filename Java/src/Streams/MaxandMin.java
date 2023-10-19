package Streams;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxandMin {
    public void maxandmin() {
        List<Integer> nums = Arrays.asList(12, 15, 0, 8, 7, 9, -6);
        Optional<Integer> max= nums.stream().max((x, y)->x.compareTo(y));
        Optional<Integer>min = nums.stream().min((x,y)->x.compareTo(y));
        System.out.println("Max is  "+ max.orElse(0));
        System.out.println("Min is  "+ min.orElse(0));


    }
}