package stack;

import java.util.*;

public  class MaxAreaHistrogram {
    int key; int value;
  public  MaxAreaHistrogram(int key,int value)
    {

        this.key = key;
        this.value= value;
    }
   public MaxAreaHistrogram()
    {
        mah();
    }
    public void mah() {
                                            //array: {6,  2,   5,  4,  5 , 1,  6}
        int [] inputArray = {6,2,5,4,5,1,6};//nsl: {-1:0,-1:0, 2:1 ,2:1 ,4:3,-1:0,1:5};
                                            //nsr: {2:1,1:5,  4:3, 1:5, 1:5,-1:0,-1:0}
                                            //diff:{0,  -1,   1,  -2,   1 ,  0,   -4} {0,8,10,12,5,0,-24}
        Vector<Integer> nsl= new Vector<>();
        Vector<Integer> nsr= new Vector<>();
        Map<Integer,Integer> map = new HashMap<>();

        int max= 0;

        Stack<MaxAreaHistrogram> s = new Stack<>();

        //NSL
        for(int i = 0;i<=inputArray.length-1;i++)
        {

            if(s.empty())
            {
                nsl.add(-1);
            }
            else if(s.size()>0 && s.peek().key< inputArray[i])
            {
                nsl.add(s.peek().value);
            }
            else if(s.size()>0&&s.peek().key>=inputArray[i] )
            {
                while(s.size()>0&& s.peek().key>=inputArray[i]) {
                    s.pop();
                }

                    if (s.empty()) {
                        nsl.add(-1);
                    } else {
                        nsl.add(s.peek().value);

                }
            }
            s.push(new MaxAreaHistrogram(inputArray[i],i));
        }

        while(!s.isEmpty()) {
           s.pop();
        }

        //System.out.print(v);
        //NSR


        for(int i =inputArray.length-1;i>=0;i--)
        {

            if(s.empty())
            {
                nsr.add(-1);
            }
            else if(s.size()>0 && s.peek().key< inputArray[i])
            {
                nsr.add(s.peek().value);
            }
            else if(s.size()>0&&s.peek().key>=inputArray[i] )
            {
                while(s.size()>0&& s.peek().key>=inputArray[i]) {
                    s.pop();
                }

                if (s.empty()) {
                    nsr.add(-1);
                } else {
                    nsr.add(s.peek().value);

                }
            }
            s.push(new MaxAreaHistrogram(inputArray[i],i));
        }
        Collections.reverse(nsr);

        for (int i =0;i<inputArray.length-1;i++)
        {
          //  max = Math.max(max,((nsr.get(i) -nsl.get(i))-1)*inputArray[i]);
            map.put(inputArray[i], (((nsr.get(i) -nsl.get(i))-1)*inputArray[i]));
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {

            max = Math.max(max,entry.getValue());
          }
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(max== entry.getValue())
            {
                System.out.println(entry.getKey()+" Max Area: " +max );
            }
        }

    }
}