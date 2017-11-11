import java.util.Scanner;
class officer extends staff
{
    String designation;
    public void readO()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter all the details of the officer : ");
        super.read();
        System.out.println("\nEnter the designation of the officer : ");
        designation = sc.nextLine();
    }
    
    public void displayO()
    {
        System.out.println("\nAll the details of the Officer is listed below : ");        
        super.display();
        System.out.println("\nDesignation of the Officer is " + designation);
    }
}