package Datastructure;
import java.util.Scanner;;
class Stack
{
    int stackPointer = -1, data[];
    Stack(int limit)
    {
        this.data = new int[limit];
        for(int i = 0; i < this.data.length; i++)
        {
            data[i] = 0;
        }
    }
    
    void push(int item)
    {
        if(this.stackPointer == (this.data.length - 1))
        {
            System.out.print("Stack Overflow !! ");
        }
        else
        {
            this.stackPointer++;
            this.data[this.stackPointer] = item;
        }
    }
    
    void pop()
    {
        if(this.stackPointer == -1)
        {
            System.out.print("Stack Underflow !! ");
        }
        else
        {
            int poppedElement = this.data[this.stackPointer];
            System.out.print("Popped out element is: " + poppedElement);
            this.data[this.stackPointer] = 0;
            this.stackPointer--;
        }
    }
    
    void display()
    {
        if(this.stackPointer == -1)
        {
            System.out.print("Stack is empty!!!");
        }
        else
        {
            System.out.println("Stack Pointer --->|" + this.data[stackPointer] + "|");
            for(int i = this.stackPointer-1; i >=0; i--)
            {
                System.out.print("\nStack Pointer --->|" + this.data[i] + "|");
                System.out.print("   --");
            }
        }
    }
    
    public static void clearConsole()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        Stack stk = new Stack(limit);
        int choice;
        while(true) 
        {
            System.out.print("\nStack Operations...\n1. PUSH\n2. POP\n3. PRINT\n4. CLEAR SCREEN\n5.EXIT\n Enter your choice: ");
            choice = sc.nextInt();
            int n;
            if(choice == 1)
            {
                n = sc.nextInt();
                stk.push(n);
            }
            else if(choice == 2)
            {
                n = sc.nextInt();
                stk.push(n);
            }
            else if(choice == 3)
            {
                stk.display();
            }
            else if(choice == 4)
            {
                stk.clearConsole();
            }
            
            else if(choice == 5)
            {
                break;
            }
            else
            {
                System.out.print("Invalid Choice Please Enter your choice correctly!!");
            }
        }
    }
}