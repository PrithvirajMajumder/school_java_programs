import java.util.Scanner;
class stars
{
    void display()
    {
        int i, j, limit = 5;
        for(i=0; i<limit; i++)
        {          
            for(j=0; j<i; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");  
        }
    }
}