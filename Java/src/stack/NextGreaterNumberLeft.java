package stack;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class NextGreaterNumberLeft {
    public void ngnl() {
        int [] inputArray = {1,3,2,4};
        Vector<Integer> v = new Vector<Integer>();
        Stack<Integer> s = new Stack<Integer>();
        for(int i = 0;i<=inputArray.length-1;i++)
        {

            if(s.empty())
            {
                v.add(-1);
            }
            else if(s.size()>0 && s.peek()> inputArray[i])
            {
                v.add(s.peek());
            }
            else if(s.size()>0&&s.peek()<=inputArray[i] )
            {
                while(s.size()>0&& s.peek()<=inputArray[i]) {
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
        System.out.print(v);
    }
}