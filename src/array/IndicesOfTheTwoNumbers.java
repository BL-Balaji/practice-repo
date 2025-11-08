package array;

import java.util.Arrays;

public class IndicesOfTheTwoNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int targetSum = 9;
        int x = 0;
        for(int i =0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[i] + arr[j] == targetSum)
                {
                    System.out.println(Arrays.toString(new int[]{i, j}));
                }
            }
        }
    }
}
