package inheritence;
import java.util.Scanner;
class Account extends Bank
{
    double amt;
    Account(String n, int acn, double p)
    {
        super(n, acn, p);
    }
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press 1. for deposit \n2. for withdraw : ");
        int choice = sc.nextInt();
        /*
        try {
            
        } catch(Exception ex) {
            sop("Please enter 1 or 2" + ex.getMessage());
        }
        */
        System.out.print("Enter the amount : ");
        
        try {
          this.amt = sc.nextDouble();
        } catch(Exception e)
        {
            sop("Please enter intger values");
        }
        
        if(choice == 1)
        {
            this.deposit();
        }
        else if(choice == 2)
        {
            this.withdraw();
        }
        else
        {
            System.out.print("Invalid input");
        }
    }
    
    void deposit()
    {
        this.p += this.amt;
    }
    
    void withdraw()
    {
        if(this.p < this.amt)
        {
            System.out.print("Insufficient Balance");
        }
        else
        {
            this.p -= this.amt;
        }
        
        if(p < 500)
        {
            p = p * (500 - p)/100;
        }
    }
    
    void display()
    {
        super.display();
        sop("The Curent Account balance of " + name + "'s" + " is " + p);
    }
    
    void sop(String message)
    {
        System.out.print(message);
    }
    
}
    