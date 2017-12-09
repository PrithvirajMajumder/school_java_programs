package inheritence;
import java.util.Scanner;
/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class User
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;
    /**
     * Constructor for objects of class User
     */
    public User()
    {
        this.name = "Alex";
        this.age = 25;
    }
    
    public User(String n, int a)
    {
        this.name = n;
        this.age = a;
    }
    
    public boolean isAdult()
    {
       return  this.age >= 18;
    }
    
    public void votingStatus()
    {
        String msg = "Cannot Vote";
        if(this.isAdult()) 
        {
            msg = "Can Vote";
        }
        System.out.println(msg);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void display()
    {
        System.out.println("Name: " + this.name + "\n Age: " + this.age);
    }
    
    public static void main()
    {
       Scanner sc = new Scanner(System.in);
       int limit = 3, age;
       String name;
       User users [] = new User [limit];
       for(int i = 0; i < limit; i++)
       {
          System.out.println("Enter a name: ");
          name = sc.next();
          System.out.println("Enter the age of " + name + ": ");
          age = sc.nextInt();
          User u = new User(name, age);
          users[i] = u;
       }
       
       System.out.println("Displaying ......");
       
       for(int i = 0; i < limit; i++)
       {
           users[i].display();
           users[i].votingStatus();
       }
    }
        
}
