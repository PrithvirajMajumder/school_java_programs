import java.util.Scanner;
class SumFactorial_f
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
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        int a, n, d=0, s=0;
        System.out.print("Enter the value of : ");
        a=sc.nextInt();
        System.out.print("Enter the limit of the series : ");
        n=sc.nextInt();
        int sum=0;
        for(int i=2; i<=n; i++)
        {
            sum=s;
            d=getFactorial(i);
            s=a/d;
        }
        System.out.println("S = " + s);
    }
}