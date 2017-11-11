//WAP to display all the twin prime numbers within a given range
import java.util.Scanner;
class TwinPrime
{
    public boolean isPrime(int n)
    {
        int count=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        return count == 2;
    }
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        int start, end;
        System.out.print("Enter the starting range: ");
        start=sc.nextInt();
        System.out.print("Enter the ending range: ");
        end=sc.nextInt();
        for(int i=start; i<=end; i++)
        {
            if(isPrime(i) && isPrime(i+2))
            {
                 System.out.print("(" + i  + ", " + (i+2) +"), ");
                //System.out.print(i + ", "+ (i+2));
            }
        }
    }
}

