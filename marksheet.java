import java.util.Scanner;
class marksheet
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int marks;
        System.out.println("Enter the marks obtained");
        marks=sc.nextInt();
        if(marks>90&&marks<100)
        {System.out.println("The grade is A+");
        }
        else if(marks>80&&marks<90)
        {
            System.out.println("The grade is A");
        }
        else if(marks>70&&marks<80)
        {
            System.out.println("The grade is B+");
        }
        else if(marks>60&&marks<70)
        {
            System.out.println("The grade is B");
        }
        else if(marks>50&&marks<60)
        {
            System.out.println("The grade is C+");
        }
        else if(marks>40&&marks<50)
        {
            System.out.println("The grade is C");
        }
        else 
        {
            System.out.println("There is no grade");
        }
    }
}