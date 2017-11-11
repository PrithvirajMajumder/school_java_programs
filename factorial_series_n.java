import java.util.Scanner;
class factorial_series_n
{
    public int getFactorial (double n)
    {
        int fact = 1;
        for(int i=1; i<=n; i++)
        {
            fact*=i;
        }
        return fact;
    }
    
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        double a, i, numerator=0, denominator=0, sum=0;
        System.out.print("Enter the value of a : ");
        a=sc.nextInt();
        for(i=10; i>=1; i--)
        {
            numerator   = Math.pow(a, i);
            denominator = getFactorial(i-1);
            sum+= numerator/denominator;
        }
       // Math.ceil, Math.floor, Math.random, all math functions 
        System.out.println("S = " + sum);
    }
}