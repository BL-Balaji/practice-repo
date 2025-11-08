package array;

public class FibonacciSeries {
    public static int fibonacci(int n)
    {
//        int a = 0;
//        int b = 1;
//        int c;
//        System.out.print(a+" "+b+" ");
//        for(int i =0;i<=n;i++)
//        {
//            c = a+b;
//            System.out.print(c+" ");
//            a = b;
//            b = c;
//        }
        if(n == 0)
        {
            return 0;
        }
        if(n == 1)
        {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
      int n = 5;
      for(int i = 0;i<=5;i++)
      {
          System.out.print(fibonacci(i)+" ");
      }
    }
}
