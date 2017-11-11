
//program to find bigger number among the 10 positive numer
import java.util.Scanner;
class Bigger_number
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of inputs:");
        int limit = sc.nextInt();
        int n, max = 0;
        for(int i=1; i<=limit; i++)
        {
            System.out.print(i + ") Enter a number : ");
            n = sc.nextInt();
            
            if(n > max)
            {
                max = n;
            }
        }
        
        System.out.println("\n\nThe Bigger number is: " + max);
    }
}