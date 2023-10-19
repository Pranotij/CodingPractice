package Streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntAvg {
    public void avgd() {
        List<Double> nums = Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1);
        double result = nums.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println(result);


    }
    public void avg() {
        List<Integer> nums = Arrays.asList(3, 7, 3, 4, 5);
        double result = nums.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(result);


    }
}