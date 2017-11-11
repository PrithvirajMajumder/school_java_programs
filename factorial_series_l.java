import java.util.Scanner;
class factorial_series_l
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
        double s=0, a, power=0, denominator=0, i, sum=0, sum1=0, n, sum2=0;
        System.out.print("Enter the value of n : ");
        a=sc.nextInt();
        System.out.print("Enter the limit of the series : ");
        n=sc.nextInt();
        for(i=1; i<=n; i++)
        {
            sum2=s;
            sum1=power;
            power=Math.pow(a, i);
            denominator = getFactorial(Math.pow(a, i));
            s=1/denominator;
            sum2+= s ;
            sum=sum2=sum1;
        }
        System.out.println("S = " + sum);
    }
}