package array;

public class MissingNumber {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6; // first n natural number
        int sum = n * (n+1) / 2;
        int actualSum = 0;

        for(int num : arr)
        {
            actualSum = actualSum + num;
        }

        int result = sum - actualSum;
        System.out.println(result);

    }

}
