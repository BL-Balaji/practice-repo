package array;

import java.util.Arrays;

public class CheckIfAnArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean isSorted = true;
        for(int i =0;i < arr.length;i++)
        {
            for(int j = i+1;j< arr.length;j++)
            if(arr[i] > arr[j])
            {
                isSorted = false;
                break;
            }
        }
        if(isSorted)
        {
            System.out.println("array is sorted");
        }else{
            System.out.println("Array is NOT sorted");
        }


    }
}
