package array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};

        int max = arr[0];
        int s_max = 0;

        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] > max)
            {
                s_max = max;
                max = arr[i];
            } else if (arr[i] > s_max && arr[i] != max) {
                s_max = arr[i];
            }
        }
        System.out.println("Second max number from an array is : "+s_max);
    }
}
