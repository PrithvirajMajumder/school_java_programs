package ClassProgs;
import java.util.Scanner;
class Saving_Acc
{
    String name, type;
    int acno;
    double money = 3245.25, depo, draw, balance;
    void withdrawl1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to State Bank of India");
        System.out.print("Your present balance in your account is Rs. " + (money + depo - draw));
        System.out.print("Enter the account no.");
        acno = sc.nextInt();
        System.out.print("Enter the name of the account holder : ");
        name = sc.nextLine();
        System.out.print("How much money you want to withdraw : ");
        draw = sc.nextDouble();
    }
    void deposit()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to State Bank of India");
        System.out.print("The present balance in your account is Rs." + (money + depo - draw));
        System.out.print("Enter the account no.");
        acno = sc.nextInt();
        System.out.print("How much money you want to deposit : ");
        depo = sc.nextDouble();
    }
    void display()
    {
        System.out.print("Welcome to the State Bank of India");
        System.out.print("The A/c no. : " + acno);
        System.out.print("The balance left in your bank account is Rs." + (money + depo - draw));
        System.out.print("Thak you Visit Again");
    }
}