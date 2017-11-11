
//program to find bigger number among the 10 positive numer
import java.util.Scanner;
class largest_smallest
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of inputs:");
        int limit = sc.nextInt();
        int n, max_even = 0, min_odd = 99999;
        for(int i=1; i<=limit; i++)
        {
            System.out.print(i + ") Enter a number : ");
            n = sc.nextInt();
            
            if( n%2==0 && n > max_even)
            {
                max_even = n;
            }
            
            if(n%2!=0 && n < min_odd)
            {
                min_odd = n;
            }
        }
        System.out.println("the largest even number is " + max_even);
        System.out.println("the smallest odd number is " + min_odd);
        
    }
}