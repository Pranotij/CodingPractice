package hackerEarth;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PlusMinus {
    public void pm() {
        int arr[] = {1,1,0,-1,-1};
        float countPositive=0,countNegative=0,countZero=0;
        float size = arr.length;

        for(int i :arr)
        {
            if(i<0)
            {
                countNegative++;
            }
            else if(i>0)
            {
                countPositive++;
            }
            else
            {
                countZero++;
            }


        }
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(6);
        float p = countPositive/size;
        float n = countNegative/size;
        float z= countZero/size;

        System.out.println(df.format(p));
        System.out.println(df.format(n));
        System.out.println(df.format(z));




    }
}