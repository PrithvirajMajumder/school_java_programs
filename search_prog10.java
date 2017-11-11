import java.util.Scanner;
class search_prog10
{
   public boolean isEven(int n)
   {
       return n%2==0;
   }
    
   public boolean isOdd(int n)
   {
       return n%2!=0;
   }
    
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        int finder, pos = -1, i, limit = 5;
        int num [] = new int [limit];
        System.out.print("Enter the all the numbers : ");
        for(i=0; i<limit; i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.print("Enter the number you want to search : ");
        finder=sc.nextInt();
        for(i=0; i<limit; i++)
        {
            if(num[i]==finder)
            {
                pos = i;
            }
        }
        if(isEven(num[pos]))
        {
            System.out.println("The position of the number is " + (pos + 1) + " and " + num[pos] + " is an even no.");
        }
        if(isOdd(num[pos]))
        {            
            System.out.println("The position of the number is " + (pos + 1) + " and " + num[pos] + " is an odd no.");
        }
        if(num[pos] > -1)
        {            
            System.out.println("The position of the number is " + (pos + 1) + " and " + num[pos] + " is a positive no.");
        }
        if(num[pos] < 0)
        {            
            System.out.println("The position of the number is " + (pos + 1) + " and " + num[pos] + " is a negetive no.");
        }
   }
}