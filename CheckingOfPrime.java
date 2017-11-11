import java.util.Scanner;
class CheckingOfPrime
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
        Scanner sc = new Scanner(System.in);
        int limit = 19, prime=0;
        int numbers [] = new int [limit];
        System.out.print("Enter the Numbers : ");
        for(int i = 0; i < limit; i ++)
        {
            numbers [i] = sc.nextInt();
            prime = numbers[i];
        }
        for(int j = 0; j < limit ; j ++)
        {
            System.out.println(isPrime(prime));
        }
    }
}

