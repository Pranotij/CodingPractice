package Streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class factorial {
    public void fact() {
        LongUnaryOperator factorial = n->
        {
            long fac =1;
            for(int i =1;i<=n;i++)
            {
                fac= fac*i;
            }
            return fac;
        };
    long result = factorial.applyAsLong(5);
    System.out.println(result);

    }
}