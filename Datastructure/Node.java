package Datastructure;
import java.io.*;
import java.util.Scanner;
class Node
{
    int data;
    Node link;
    Node()
    {
        this.data = 0;
        this.link = null;
    }
    
    void sop(String s)
    {
        System.out.print(s);
    }
    
    //Creating a linked list Structure
    void create()throws IOException
    {
        int noOfNodes;
        Scanner sc = new Scanner(System.in);
        sop("Enter the first data : ");
        this.data = sc.nextInt();
        sop("Enter no. of nodes to be created : ");
        noOfNodes = sc.nextInt();
        Node temp;
        Node pointer = this;
        for(int i = 1; i < noOfNodes; i++)
        {
            temp = new Node();
            sop("Enter next data : ");
            temp.data = sc.nextInt();
            temp.link = null;
            pointer.link = temp;
            temp = null;
            pointer = pointer.link;
        }
    }
    
    //Inserting a list in the begining
    void insertBegining(Node start, int x)
    {
        Node temp = new Node();
        sop("Enter element for the new list");
        temp.data = x;
        temp.link = null;
        temp.link = start;
        start = temp;
        temp = null;
    }
    
    //Inserting a list in the middle of the linkde list
    void instertMid(Node start, int x, int n)
    {
        Node temp = new Node();
        sop("Enter element for the new list : ");
        temp.data = x;
        temp.link = null;
        Node pointer = start;
        int c = 0;
        while(c <= n)
        {
            pointer = pointer.link;
            c++;
        }
        temp.link = pointer.link;
        pointer.link = temp;
    }
    
    //Inserting a list at the end of the Linked List
    void insertEnd(Node start, int x)
    {
        Node temp = new Node();
        sop("Enter element for the new list : ");
        temp.data = x;
        temp.link = null;
        Node pointer = start;
        while(pointer.link!= null)
        {
            pointer = pointer.link;
        }
        pointer.link = temp;
        temp = pointer = null;
    }
    
    //Deleting a list from the linked list
    void delete(Node start, int n)
    {
        Node pointer = start;
        Node pointer1 = pointer;
        int c = 0;
        while(c <= n)
        {
            pointer1 = pointer;
            pointer = pointer.link;
        }
        pointer1.link = pointer.link;
        pointer.link = null;
        pointer = pointer1 = null;
    }
    
    //displaying the elements of the linkde list
    void display()
    {
        Node pointer = this;
        while(pointer!=null)
        {
            sop("" + pointer.data);
            pointer = pointer.link;
        }
    }
}