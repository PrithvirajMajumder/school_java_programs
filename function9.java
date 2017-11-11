//program no. 9 pg no. 466
import java.util.Scanner;
class function9
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
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int m, n, numerator, denominator;
        System.out.print("Enter the value of m : ");
        m=sc.nextInt();
        System.out.print("Enter the value of n : ");
        n=sc.nextInt();
        numerator = getFactorial(m + n);
        denominator = getFactorial(n) * getFactorial(m-n);
        int s = numerator/denominator;
        System.out.println("S = " + s);
    }
}