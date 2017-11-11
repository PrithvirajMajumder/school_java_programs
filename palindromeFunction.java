class palindromeFunction
{
    public boolean isPalindrome(int n)
    {
        int r, temp, sum=0;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n/=10;
        }
        return sum == temp;
    }
}