import java.util.Scanner;    
class Arr_prog_23
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
    
    void display()
    {
        Scanner sc = new Scanner(System.in);
        int limit, i, j, storeValue;
        System.out.print("How much numbers you want to enter ? ");
        limit = sc.nextInt();
        int num [] = new int [limit];
        System.out.print("Enter all the numbers : ");
        for(i=0; i<limit; i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.print("All the Prime Numbers are now showing below : ");
        for(i=0; i<limit; i++)
        {
            if(isPrime(num[i]))
            {
                System.out.print(num[i] + ", ");
            }
        }
        
        for(i=num.length; i>=0; i--)
        {
            System.out.println(num[i] + ",  ");
        }
            
        }
}