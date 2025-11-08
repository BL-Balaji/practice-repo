package array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {12,5,10,40,50,60};
        int[] reverseArray = new int[arr.length];
        int count = 0;
        for(int i = arr.length-1; i>=0;i--)
        {
            reverseArray[count++] = arr[i];

        }
        System.out.println("Reverse array is : "+ Arrays.toString(reverseArray));

    }
}
