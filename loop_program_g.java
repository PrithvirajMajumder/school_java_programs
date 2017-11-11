import java.util.Scanner;
class loop_program_g
{
    public double getFactorial (double n)
    {
        double fact = 1;
        for(int i=1; i<=n; i++)
        {
            fact*=i;
        }
        return fact;
    }
    public boolean isPrime(double n)
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
    public boolean isEven(double n)
    {
        return n%2==0;
    }
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        double a, s = 0, denominator = 0, numerator = 0, i, sum=0;
        System.out.print("Enter the value of a : ");
        a=sc.nextInt();
        for(i=1; i<=11; i++)
        {
            sum=s;
            if(isPrime(i))
            {
                denominator=getFactorial(i);
            }
            if(isEven(i))
            {
                numerator = Math.pow(a, i);
            }
            s = numerator/denominator;
            sum+=s;            
        }
        System.out.println("S = " + sum);
    }
}