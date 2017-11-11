package Assg11;
import java.util.Scanner;
class p7
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        Que ob = new Que();
        int ch = 0, n;
        while(ch != 4)
        {
            System.out.println("\n1. Add \n2. Delete \n3. Display \n4. Exit \nEnter your choice");
            ch = sc.nextInt();
            if(ch == 1)
            {
                System.out.println("Enter a no. ");
                n = sc.nextInt();
            }
            else if(ch == 2)
            {
                int c = ob.pop();
                if(c == -99)
                {
                    System.out.println("Empty Que");
                }
                else
                {
                    System.out.println("Deleted no. " + c);
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