import java.util.Scanner;
class factorial_series_m
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
        double s=0, a, n, sum=0, i;
        System.out.print("Enter the value of a : ");
        a=sc.nextInt();
        System.out.print("Enter the limit of the series : ");
        n=sc.nextInt();
        for(i=2; i<=n; i++)
        {
            if(i%2 == 0) 
            {
                sum+= getFactorial(Math.pow(a, i));
            }
            else 
            {
                sum-= getFactorial(Math.pow(a, i));
            }
        }
        System.out.println("S = " + sum);
    }
}