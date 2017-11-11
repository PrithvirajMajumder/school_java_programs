package Assg11;
import java.util.Scanner;
class Stack
{
    Scanner sc = new Scanner(System.in);
    int a [], size, rear;
    Stack()
    {
        size = 15;
        rear = 0;
        a = new int [15];
    }
    void push(int n)
    {
        if(rear == size)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            a[rear++] = n; 
        }
    }
    int pop()
    {
        if(rear == 0)
        {
            return -99;
        }
        else
        {
            return a[-- rear];
        }
    }
    void list()
    {
        if(rear == 0)
        {
            System.out.println("Empty Stock");
        }
        else
        {
            for(int i = rear - 1; i >= 0; i--)
            {
                System.out.println(a[i]);
            }
        }
    }
}
