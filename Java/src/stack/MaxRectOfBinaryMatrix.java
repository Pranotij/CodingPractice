package stack;

import java.util.*;

public  class MaxRectOfBinaryMatrix {
    int key; int value,max=0,m=0;
  public MaxRectOfBinaryMatrix(int key, int value)
    {

        this.key = key;
        this.value= value;
    }
   public MaxRectOfBinaryMatrix()
    {
        marbm();
    }

    public int mah(int [] inputArray,int temp) {
                                            //array: {6,  2,   5,  4,  5 , 1,  6}
        //int [] inputArray = {6,2,5,4,5,1,6};//nsl: {-1:0,-1:0, 2:1 ,2:1 ,4:3,-1:0,1:5};
                                            //nsr: {2:1,1:5,  4:3, 1:5, 1:5,-1:0,-1:0}
                                            //diff:{0,  -1,   1,  -2,   1 ,  0,   -4} {0,8,10,12,5,0,-24}
        Vector<Integer> nsl= new Vector<>();
        Vector<Integer> nsr= new Vector<>();
        Map<Integer,Integer> map = new HashMap<>();


        Stack<MaxRectOfBinaryMatrix> s = new Stack<>();

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
            s.push(new MaxRectOfBinaryMatrix(inputArray[i],i));
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
                while(s.size()>0&& s.peek().key>inputArray[i]) {
                    s.pop();
                }

                if (s.empty()) {
                    nsr.add(-1);
                } else {
                    nsr.add(s.peek().value);

                }
            }
            s.push(new MaxRectOfBinaryMatrix(inputArray[i],i));
        }
        Collections.reverse(nsr);

        for (int i =0;i<inputArray.length-1;i++)
        {

            max = Math.max(temp, (((nsr.get(i) -nsl.get(i))-1)*inputArray[i]));

        }

        return max;

    }
    public void marbm()
    {
        int [][] input = {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
        int area=0,temp=0;
        //Vector<Integer> v= new Vector<>();
        int [] result = new int[input.length];
        int k=0;
        for(int i =0; i<=input.length-1;i++)
        {
            for(int j=0 ;j<=input.length-1;j++)
            {
                if(i==input.length-1&&input[i][j]==0)
                {
                    //v.add(0);
                    result[k]= 0;
                }
                else {
                    result[k]=result[k]+input[i][j];
                }
int a= j;

                k++;
            }
            area=  mah(result,temp);
            temp =area;

            k=0;
        }

       System.out.println(area);
    }



}