package array;

public class SumOfAllElement {
    public static void main(String[] args) {
        int[] arr = {10,50,42,30,12};
        int sum = 0;
        for(int n : arr)
        {
          sum = sum + n;
        }
        System.out.println("sum of all elements : "+sum);
    }
}
