import java.util.Scanner;
class SumFactorial_D
{
    public int getFactorial (int n)
    {
        int fact = 1;
        for(int i=1; i<=n; i++)
        {
            fact*=i;
        }
        return fact;
    }
    public boolean isOdd (int n)
    {
        return n%2!=0;
    }
    public void display()
    {
        Scanner sc = new Scanner (System.in);
        double a, n, s=0, numerator=0, denominator=0;
        System.out.print("Enter the limit of this series : ");
        n=sc.nextInt();
        System.out.print("Enter the value of a : ");
        a=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            if(isOdd(i))
            {
                numerator=Math.pow(a,i);
                denominator=getFactorial(i);
                s=numerator/denominator;
            }
        }
        System.out.println("S = " + (s-a));
    }
}