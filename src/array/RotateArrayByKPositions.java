package array;

import java.util.Arrays;

public class RotateArrayByKPositions {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        int k = 2;
//        int[] result = new int[arr.length];
//        int n = arr.length;
//        for(int i = 0; i< arr.length; i++)
//        {
//          result[(i+k)%n] = arr[i]; // (0+2)%5 = 2 ----> 1, 2, 1, 4,
//
//        }
//        System.out.println(Arrays.toString(result));
//    }
//    // (i + k)% n
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;
        int[] result = new int[arr.length];
        for(int i =0;i <arr.length;i++)
        {
            result[(i+k)%n] = arr[i];
        }
        System.out.println(Arrays.toString(result));







    }
}
