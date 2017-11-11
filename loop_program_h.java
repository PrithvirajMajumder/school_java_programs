import java.util.Scanner;
class loop_program_h
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
        double s = 0, a, numerator = 0, denominator = 0, i, n, sum=0;
        System.out.print("Enter the value of a : ");
        a=sc.nextInt();
        System.out.print("Enter the limit of the series : ");        
        n=sc.nextInt();
        for(i=1; i<=n; i++)
        {
            sum=s;
            numerator = getFactorial(i);
            denominator = Math.pow(a, i);
            s = numerator/denominator;
            sum+=s;
        }
        System.out.println("S = " + sum);        
    }
}