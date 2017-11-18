package inheritence;
import java.util.Scanner;
class Clerk extends staff
{
    staff s = new staff();
    String grade;
    void main()
    {
        Scanner sc = new Scanner(System.in);
        s.read();
        System.out.println("Enter the grade of: ");
        this.grade = sc.next();
        s.display();
        System.out.println("The Grade is " + grade);
    }
}