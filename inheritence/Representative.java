package inheritence;
import java.util.Scanner;
class Representative
{
    String name, address;
    Representative()
    {
        this.name = "";
        this.address = "";
    }
    
    void sop(String s)
    {
        System.out.print(s);
    }
    
    void read(String n, String add)
    {
        Scanner sc = new Scanner(System.in);
        sop("enter the name : ");
        n = sc.nextLine();
        sop("enter the address of " + n + ": ");
        add = sc.nextLine();
        this.name = n;
        this.address = add;
    }
    
    void display()
    {
        sop("\name = " + this.name + "\naddress of " + name + " is " + this.address);
    }
}
    