import java.util.Scanner;
class FiftyPrimeNumber
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
        int num;
        System.out.println("Enter the starting number");
        num=sc.nextInt();
        int n=num+50;
        for(int j=num; j<=n; j++)
        {
            if(isPrime(j))
            {
                System.out.println(j);
            }
        }
    }
}

