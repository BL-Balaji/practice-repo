package array;

import java.util.Arrays;

public class MaximumElementInEverySlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int n = arr.length;
        int[] result = new int[n -k +1];

        for(int i =0 ; i<= n -k ;i++)
        {
            int max = arr[i];
            for(int j = i;j < i+k;j++)
            {
                max = Math.max(max, arr[j]);
            }
            result[i] = max;
        }
        System.out.println(Arrays.toString(result));
    }
}
