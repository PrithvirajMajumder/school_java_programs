//pog 3, b pg 318
class SumFactorial_b
{
    public int getFactorial(int num)
    {
        int fact = 1; 
        for(int i=1; i<=num; i++)
        {
            fact*=i;
        }
        return fact;
    }
    
    public void display()
    {
        double sum=0;
        int n=10;
        for(int i=2; i<=n; i++)
        {
            sum += (double)(getFactorial(i) / getFactorial(i+1));
        }
            System.out.print(sum + 1);
    }
}