import java.util.Scanner;
public class Array_prog19
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
    
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int limit = 5, count = 0, key, index = 0;
        int n [] = new int [limit];
        System.out.print("Enter the first number : ");
        key = sc.nextInt();
        while(!exit)
        {
            if(isPrime(key))
            {
                n[index] = key;
                index++;
            }
            
            key++;
            
            if(index == (limit - 1) ) 
            {
                exit = true;
            }
        }
        for(int i=0; i<limit; i++)
        {
            System.out.println(n[i]);
        }
    }
}