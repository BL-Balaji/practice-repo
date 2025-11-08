package array;

import java.util.Arrays;

public class MoveAllZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4};
        int position = 0;
        //shift non zero number
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] != 0)
            {
                arr[position++] = arr[i];
            }
        }

        while(position < arr.length)
        {
            arr[position++] =0;
        }
            System.out.println(Arrays.toString(arr));
    }
}
