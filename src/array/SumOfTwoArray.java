package array;

import java.util.Arrays;

public class SumOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 ={5, 6, 7, 8, 9,0};
        int[] result = new int[arr1.length];
        int count = 0;
        for(int i = 0; i < result.length;i++)
        {
          result[i] = arr1[i] + arr2[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
