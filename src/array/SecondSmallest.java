package array;

public class SecondSmallest {
    public static void main(String[] args)
    {
        int[] arr ={10, 20, 4, 45, 99};
        int min = arr[0];
        int s_min = arr[0];

        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                s_min = min;
                min = arr[i];
            }else if (arr[i] < s_min && arr[i] != min)
            {
                s_min = arr[i];
            }
        }
        System.out.println("minimum number from an array is : "+min);
        System.out.println("second minimum number from an array is : "+s_min);
    }

}
