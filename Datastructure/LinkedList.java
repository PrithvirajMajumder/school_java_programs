package Datastructure;
import java.util.Scanner;
class LinkedList
{
    void sop(String s)
    {
        System.out.print(s);
    }
    
    void main()
    {
        int k, p, ch;
        Scanner sc = new Scanner(System.in);
        Node first = new Node();
        Node abc = new Node();
        do
        {
            sop("main menu");
            sop("1.Create a linked list structure");
            sop("2.Insert a list of begining");
            sop("3.Insert a list at the end");
            sop("4.Insert a list at the middle");
            sop("5.Delete a list");
            sop("6.Display the list");
            sop("7.Exit");
            sop("Enter your choice");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                first.create();
                break;
                
                case 2:
                sop("Enter data for the new node");
                k = sc.nextInt();
                first.insertBegining(first, k);
                break;
                
                case 3:
                sop("Enter data for the new node");
                k = sc.nextInt();
                first.insertEnd(first, k);
                break;
                
                case 4:
                sop("Enter data for the new node");
                k = sc.nextInt();
                sop("Enter node number after which node is to be inserted");
                p = sc.nextInt();
                first.instertMid(first, k, p);
                break;
                
                case 5:
                sop("Enter node number to be deleted");
                k = sc.nextInt();
                first.delete(first, k);
                break;
                
                case 6:
                sop("Data in the linked list");
                first.display();
            }
        }
        while(ch != 7);
    }
        
}