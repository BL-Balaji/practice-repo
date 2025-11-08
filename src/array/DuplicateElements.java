package array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 1};
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int num : arr)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > 1)
            {
                System.out.println(entry.getKey());
            }
        }
    }
}
