package Streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOddNEven {
    public void oddeven() {
        List<Integer> integers = Arrays.asList(1,6,34,4,2,4,1,2,6,7,7,7,9,3,5);

      List even=   integers.stream().sorted().filter(i->i%2==0).collect(Collectors.toList());
      List odd=   integers.stream().sorted().filter(i->i%2==1).collect(Collectors.toList());
      System.out.println("Even Numbers"+ even);
        System.out.println("Odd Numbers"+ odd);

    }
}