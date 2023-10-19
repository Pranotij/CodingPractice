package Streams;
import java.util.function.Predicate;

public class PrimeNumber {
    public void primeNu() {
        Predicate<Integer> prime = num->
        {
            boolean b = true;
            for(int i =2;i<= Math.sqrt(num);i++) {
                if(num%i==0)
                {
                    b= false;
                    break;
                }

            }
            return b ;
        };

   boolean b = prime.test(5);
    if(b==false)
    {
        System.out.println("Not Prime");
    }
    else {
        System.out.println("Prime");
    }

    }
}