package array;

import java.util.Arrays;

public class ReverseTheElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        int temp;
//        int start = 0;
//        int end = arr.length -1;
//        while(start < end)
//        {
//            temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.toString(arr));
//    }

        int[] reversedArray = new int[arr.length];
        for(int i = arr.length -1,j =0; i >= 0; i--,j++)
        {
            reversedArray[j] = arr[i];
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
