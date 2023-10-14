package stack;

import java.security.KeyPair;
import java.util.Stack;
import java.util.Vector;

public class StockSpanProblem {

    int key;
    int value;


    public StockSpanProblem(int key,int value){
        this.key = key;
        this.value = value;
    }
    public StockSpanProblem(){
        ssp();
    }
    public void ssp() {
        int [] inputArray = {100, 80, 60 ,70, 60, 75, 85};

        //Traversing the given input span for 100 will be 1,
        // 80 is smaller than 100 so the span is 1,
        // 60 is smaller than 80 so the span is 1,
        // 70 is greater than 60 so the span is 2 and so on.
        // Hence the output will be 1 1 1 2 1 4 6.
        Vector<Integer> v = new Vector<Integer>();
        Vector<Integer> output= new Vector<Integer>();
        Stack<StockSpanProblem> s = new Stack<>();

        for(int i = 0;i<=inputArray.length-1;i++)
        {

            if(s.empty())
            {
                v.add(-1);
            }
            else if(s.size()>0 && s.peek().key>inputArray[i])
            {
                v.add(s.peek().value);
            }
            else if(s.size()>0&&s.peek().key<=inputArray[i] )
            {
                while(s.size()>0&& s.peek().key<=inputArray[i]) {

                    s.pop();

                }

                    if (s.empty()) {
                        v.add(-1);
                    } else {
                        v.add(s.peek().value);

                }
            }
            s.push(new StockSpanProblem(inputArray[i],i));
        }


        for(int i =0;i<inputArray.length;i++) {
           output.add( i-v.get(i) );
        }
        System.out.print(output);
    }
}