class ArmstrongFunction
{
    public boolean isArms(int n)
    {
        int rem, sum=0, temp = n;
        while(n>0)
        {
            rem = n%10;
            sum+=rem*rem*rem;
            n/=10;
        }
        return temp == sum;
    }
}