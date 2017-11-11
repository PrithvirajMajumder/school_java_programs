// prog 22 pg 316
import java.util.Scanner;
class PerfectNumber
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n, sum=0;
        System.out.print("Enter the limit: ");
        n=sc.nextInt();
        for(int i=1; i<n; i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum == n) 
        {
            System.out.print(n + " is a prefect number.");
        }
        else {
            System.out.print(n + " is not a prefect number.");
        }
        
    }
}