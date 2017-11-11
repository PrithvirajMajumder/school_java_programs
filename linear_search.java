import java.util.Scanner;
class linear_search
{
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        int item, limit = 5, i, pos = -1;
        int data [] = new int [limit];
        System.out.println("Enter the numbers : ");
        for(i=0; i<limit; i++)
        {
            data[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to find : ");
        item = sc.nextInt();
        for(i=0; i<limit; i++)
        {
            if(data[i] == item)
            {
                pos = i;
            }
        }
        if(pos > -1)
        {
            System.out.print("The position is " + pos );
        }
        else
        {
            System.out.print("The number not found");
        }
    }
}