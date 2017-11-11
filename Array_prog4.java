import java.util.Scanner;
class Array_prog4//pg no. 426
{
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        int limit = 15, i, pos = -1, s=0, max;
        int year [] = {1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005,};
        int appointments [] = new int[limit];
            System.out.println("Enter the number of appointments : ");
        for(i=0; i<limit; i++)
        {
            appointments[i] = sc.nextInt();
        }
        max = appointments[0];
        for(i=0; i<limit; i++)
        {
            if(appointments[i] > max)
            {
                max = appointments[i];
                pos = i;
            }
        }
        System.out.print("The Year " + year[pos] + "carries the highest no. of appointments i.e, " + appointments[pos]);
    }
}