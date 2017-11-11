import java.util.Scanner;
class Array3_pg_no_426
{
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        int limit, max, i, pos = -1;
        double rate = 1.80;
        System.out.print("Enter the number of consumers : ");
        limit = sc.nextInt();
        int consumer_number[] = new int [limit];
        int units [] = new int [limit];
        
        // Get inputs from the user
        for(i=0; i < limit; i++)
        {
            System.out.print((i + 1) + ") Enter the Consumer Number : ");
            consumer_number[i] = sc.nextInt();
            System.out.print(" Enter units consumed by [" + consumer_number [i] + "] : ");
            units[i] =  sc.nextInt();
            System.out.print("\n");
        }
       
        max = units[0]; // Assign the max to units first value
        
        // Find the highest value & position from the units array
        for(i=0; i < limit; i++)
        {
            if(units[i] > max)
            {
                max = units[i];
                pos = i;
            }
        }
        //calculation
        double amt = units[pos] * rate;
        System.out.println("The total units consumed by " + consumer_number[pos] + " is " + units[pos] + " and has to pay Rs " + amt);
    }
}