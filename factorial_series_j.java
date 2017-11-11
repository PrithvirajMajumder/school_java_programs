class factorial_series_j
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
        int s=0, numerator=0, denominator=0, i, sum=0;
        for(i=1; i<=10; i++)
        {
            sum=s;
            if(i<=9 && i>=2)
            {
                numerator = getFactorial(i);
            }
            if(i>=3)
            {
                denominator = getFactorial(i);
            }
            s = numerator/denominator;
            sum+=s;
        }
        System.out.println("S = " + sum);
    }
}