import java.util.Scanner;
class SumOfTheSeries
{
    public int getSum(int num)
    {
        int sum=0;
        for(int i=1; i<=num; i++)
        {
         sum = sum + i;
        }
        return sum;
    }
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
        Scanner sc = new Scanner(System.in);
        int n, series = 0;
        System.out.print("Enter the limit of the series = ");
        n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            series = getSum(i)/getFactorial(i);
        }
        System.out.println("S = " + series);
    }
}