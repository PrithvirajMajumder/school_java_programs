package Datastructure;
import java.util.Scanner;
class Stack
{
    int s[] = new int[20];
    int sp, n, i;
    Stack(int nn)
    {
        for(int i = 0; i<20; i++)
        {
            s[i] = 0;
            sp = -1;
            n = nn;
        }
    }
    void pushdata(int item)
    {
        if(sp == (n - 1))
        {
            System.out.print("Stack Overflow !! ");
        }
        else
        {
            sp++;
            s[sp] = item;
        }
    }
    void popdata()
    {
        int v;
        if(sp == -1)
        {
            System.out.print("Stack Underflow !! ");
        }
        else
        {
            v = s[sp];
            System.out.print("Popped out element is " + v);
            sp --;
        }
    }
    void display()
    {
        if(sp == -1)
        {
            System.out.print("Stack Empty : ");
        }
        else
        {
            System.out.println("SP--->|" + s[sp] + "|");
            System.out.println("   __");
        }
        for(i = sp-1; i >=0; i--)
        {
            System.out.print("       |");
        }
    }
}