import java.util.Scanner;
class clerk  extends staff
{
    String CGrade;
    public void readC()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nEnter all the details of the clerk");
        super.read();
        System.out.println("\nEnter the grade of the clerk : ");
        CGrade=sc.nextLine();        
    }
    
    public void displayC()
    {
        System.out.print("\n\nAll the details of the Clerk is listed below : ");
        super.display();
        System.out.println("\nThe Grade of the Clerk is " + CGrade);        
    }
}