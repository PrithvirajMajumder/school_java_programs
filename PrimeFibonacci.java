import java.util.Scanner;
class PrimeFibonacci
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
        Scanner sc= new Scanner(System.in);
        int n, a=0, b=1, c;
        System.out.println("Enter The limit fd the series : ");
        n=sc.nextInt();
        System.out.print(a + " " + b + " " );
        for(int i=0; i<=n; i++)
        {
            if(isPrime(i))
            {
             c=a+b;
             System.out.print(c + " ");
             a=b;
             b=c;
            }
        }
        
    }
}