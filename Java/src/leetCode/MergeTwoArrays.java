package leetCode;

import java.util.*;


public class MergeTwoArrays {
    public void mta() {
        int [] nums1 = {1,3,2,4};
        int [] nums2 = {1,0,0,5,6,7,2};
        List<Integer> li = new ArrayList<>();
        int l1= nums1.length;
        int l2= nums2.length;

        int[] result = new int[l1+l2];
        System.arraycopy(nums1, 0, result, 0, l1);
        System.arraycopy(nums2, 0, result, l1, l2);

        for(int i=0;i<=(l1+l2)-1;i++)
        {
            if(result[i]!=0) {
                li.add(result[i]);
            }

        }
        Collections.sort(li);
        System.out.println(li);

    }
}