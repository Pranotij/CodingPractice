package Streams;


import java.util.Arrays;
import java.util.List;

public class MultiplyListNumber {
    public void pns() {
        List<Integer> integers = Arrays.asList(1,2,3,0);
       int product=  integers.stream().reduce(1,(x,y)->x*y).intValue();
       int sum = integers.stream().reduce(0,(x,y)->x+y).intValue();
       System.out.println("Product is "+ product);
       System.out.println("Sum is "+ sum);


    }
}