package stack;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class NextSmallestNumberRight {
    public void nsnr() {
        int [] inputArray ={2,3,3,2};// {1,3,2,4};//{-1,2,-1,-1}
        Vector<Integer> v = new Vector<Integer>();
        Stack<Integer> s = new Stack<Integer>();
        for(int i = inputArray.length-1;i>=0;i--)
        {

            if(s.empty())
            {
                v.add(-1);
            }
            else if(s.size()>0 && s.peek()<inputArray[i])
            {
                v.add(s.peek());
            }
            else if(s.size()>0&&s.peek()>=inputArray[i] )
            {
                while(s.size()>0&& s.peek()>=inputArray[i]) {
                    s.pop();
                }

                    if (s.empty()) {
                        v.add(-1);
                    } else {
                        v.add(s.peek());

                }
            }
            s.push(inputArray[i]);
        }

        Collections.reverse(v);
        v.toArray();
        System.out.print(v);
    }
}