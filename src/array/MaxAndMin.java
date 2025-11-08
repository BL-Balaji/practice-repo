package array;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {10,50,12,24,40};
        int max = arr[0];
        int min = arr[arr.length-1];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("Max number from an array is : "+max);
        System.out.println("min number from an array is : "+min);
    }
}
