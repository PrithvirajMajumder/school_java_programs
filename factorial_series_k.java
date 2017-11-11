class factorial_series_k
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
        double s, numerator=0, denominator=0, sum=0, i;
        for(i=1; i<=11; i++)
        {
            if(i<=10)
            {
                numerator = Math.pow(i, 2);
            }
            if(i>=2)
            {
                denominator = getFactorial(i);
            }
            s = numerator/denominator;
            sum+=s;
        }
        System.out.println("S = " + sum);
    }
}