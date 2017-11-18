package inheritence;
import java.util.Scanner;
class Officer extends staff
{
    String designation;
    staff s = new staff();
    void main()
    {
        Scanner sc = new Scanner(System.in);
        s.read();
        System.out.println("Enter the Designation of " + ": ");
        designation = sc.next();
        s.display();
        System.out.println("The Designation" + " is " + designation);
    }
}