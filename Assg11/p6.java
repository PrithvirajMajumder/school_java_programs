package Assg11;
import java.util.Scanner;
class p6
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Stack ob = new Stack();
        int ch = 0;
        while(ch != 0)
        {
            System.out.println("\n1. Add \n2. Delete \n3. Display \n4. Exit \nEnter your choice");
            ch = sc.nextInt();
            if(ch == 1)
            {
                System.out.println("Enter your Number ");
                int n = sc.nextInt();
                ob.push(n);
            }
            else if(ch == 2)
            {
                int c = ob.pop();
                if(ch == 99)
                {
                    System.out.println("Deleted no." + c);
                }
            }
            else if(ch == 3)
            {
                ob.list();
            }
            else if(ch == 4)
            {
                System.out.println("Exit");
            }
            else
            {
                System.out.println("Invalid Choice");
            }
        }
    }
}