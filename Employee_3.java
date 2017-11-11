import java.util.Scanner;
class Employee_3
{
    Scanner sc = new Scanner(System.in);
    String nm, add;
    int BasicPay;
    public void read()
    {
        System.out.print("\n\nEnter the name : ");
        nm = sc.nextLine();
        System.out.print("\n\nEnter the Address of " + nm + " : ");
        add = sc.nextLine();
        System.out.print("\n\nEnter the Basic Pay of " + nm + " : ");
        BasicPay = sc.nextInt();
    }
    
    public void display()
    {
        System.out.print("\nName : " + nm + "\nAddress of " + nm + " : " + add + "\nBasic Pay of " + nm + " : " + BasicPay);
    }
}