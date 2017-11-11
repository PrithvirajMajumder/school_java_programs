import java.util.Scanner;
class staff
{
    Scanner sc = new Scanner(System.in);
    String nm;
    int EmpCode, basic;
    
    public void read()
    {
        System.out.print("\n\nEnter the name : ");
        nm = sc.nextLine();
        System.out.print("\nEnter the basic : ");
        basic = sc.nextInt();
        System.out.print("\nEnter the Employe Code : ");        
        EmpCode = sc.nextInt();
    }
    
    public void display()
    {
        System.out.print("\nName = " + nm + "\nBasic of " + nm + " is " + basic + "\nEmployee Code of " + nm + " is " + EmpCode);
    }
    
}