package stack;

import java.util.*;

public class NextGreaterNumberRight {
    public void ngnr() {
        int [] inputArray = {1,3,2,4};
        Vector<Integer> v = new Vector<Integer>();
        Stack<Integer> s = new Stack<Integer>();
        for(int i = inputArray.length-1;i>=0;i--)
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

        Collections.reverse(v);
        v.toArray();
        System.out.print(v);
    }
}