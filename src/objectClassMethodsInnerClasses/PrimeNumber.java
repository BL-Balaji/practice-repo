package objectClassMethodsInnerClasses;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrimeNumber(int n)
    {
        boolean isPrime = true;
        for(int i = 2; i< n;i++)
        {
            if(n % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a range : ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        for(int i =a; i<=b;i++)
        {
            if(isPrimeNumber(i))
            {
                System.out.println(i);
            }
        }
    }
}
