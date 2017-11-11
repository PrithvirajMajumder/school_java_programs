import java.util.Scanner;
class FindTheS
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
        int m, n, u=0, d=0, s=0;
        System.out.print("Enter the value of m : ");
        m=sc.nextInt();
        System.out.print("Enter the value of n : ");
        n=sc.nextInt();
        u=getFactorial(n + n);
        d=getFactorial(n) * getFactorial(m-n);
        s=u/d;
        System.out.println("S = " + s);
    }
}