import java.util.Scanner;
class SumOfTheSeries2
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
    public int getMultiply(int num)
    {
        int mul=0;
        for(int i=1; i<=num; i++)
        {
         mul = mul * i;
        }
        return mul;
    }
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        int n, series;
        System.out.print("Enter the limit of the series");
        n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
         series = getSum(n)/getMultiply(n);
        }
        System.out.println("S = " + n);
    }
}
