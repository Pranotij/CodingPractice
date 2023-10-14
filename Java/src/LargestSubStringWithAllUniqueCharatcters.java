import java.util.*;

public class LargestSubStringWithAllUniqueCharatcters {
    public void lswauc() {
        String s = "pwwkew";
        int i = 0, j = 0, max = 0;


        Map<Character, Integer> map = new HashMap<>();
        int sizeOfMap = 0;
        int count = 1;

        for (char c : s.toCharArray())
        {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + count);
            }
            else
            {
                map.put(c, 1);
            }

            while (j < s.length()) {

                    sizeOfMap = map.size();

                    if (sizeOfMap == (j - i) + 1)
                    {

                        max = Math.max(max, (j - i) + 1);


                    } else if (sizeOfMap < (j - i) + 1) {
                        while (sizeOfMap < (j - i) + 1) {
                            map.put(c, map.get(c) - 1);

                            if (map.get(c) == 0) {
                                map.remove(c);
                            }
                            i++;
                        }

                    }
                    j++;

                }
            }
       for(Map.Entry entry: map.entrySet())
       {
           System.out.println( entry.getKey()+":"+entry.getValue());
       }
        System.out.println("My max number is "+max);
    }
}