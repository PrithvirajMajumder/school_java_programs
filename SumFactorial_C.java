import java.util.Scanner;
class SumFactorial_C
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
        double a, n, s=0, u=0, d=0, sum=0, first_portion=1 + getFactorial(2)/getFactorial(3);//first portion is 1+2!/3!
        System.out.print("Enter the value of a : ");
        a=sc.nextDouble();
        System.out.print("Enter the limit of the series : ");
        n=sc.nextDouble();
        System.out.print(first_portion + " + ");
        for(double i=2; i<=n; i++)
        {
            sum=s;
            u=Math.pow(a,n);
            d=getFactorial(3);
            s=u/d;
            
        }
        System.out.print(sum + " + ");
    }
}