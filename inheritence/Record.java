package inheritence;
import java.util.Scanner;
class Record
{
    int limit = 5;
    String name [] = new String[limit];
    int rank [] = new int[limit];
    Record()
    {
        for(int i = 0; i < this.limit; i ++)
        {
            this.name[i] = "";
            this.rank[i] = 0; 
        }
    }
    
    void readvalues()
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < this.limit; i ++)
        {
            System.out.print((i + 1) +") Enter the name of the student: ");
            name[i] = sc.next();
            System.out.print("  Enter the rank of " + name[i] + ": ");
            rank[i] = sc.nextInt();
        }

    }
    
    void display()
    {
        for(int i = 0; i < this.limit; i++)
        {
            System.out.print((i + 1) +") " + this.name[i] + "\nthe rank of " + this.name[i] + " is " + this.rank[i]);
        }
    }
}
        