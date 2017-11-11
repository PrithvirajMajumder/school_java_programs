//prog 26 pg 316 (Prime Palindrome Number
import java.util.Scanner;
class PrimePalindrome
{
    public boolean isPrime(int n)
    {
        int count=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        return count == 2;
    }
    
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
    
    public void display()
    {
        Scanner sc= new Scanner (System.in);
        int start, end;
        System.out.print("Enter the starting range: ");
        start=sc.nextInt();
        System.out.print("Enter the ending range: ");
        end=sc.nextInt();
       System.out.println(" Prime palindromes between " + start + " and " + end + " are: "); 
        for(int i=start; i<=end; i++)
        {
            if(isPrime(i) && isPalindrome(i))
            {
                System.out.print(i + ", ");
            } 
        }
    }
}