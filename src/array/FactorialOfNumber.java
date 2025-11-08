package array;

public class FactorialOfNumber {
    public static int factorial(int a)
    {
        if(a == 0 || a == 1)   // base condition
        {
            return 1;
        }
        return a * factorial(a-1);
    }


    public static void main(String[] args) {
        int a = 5;
        System.out.println("Factorial of "+a+" is "+factorial(a));
    }
}
