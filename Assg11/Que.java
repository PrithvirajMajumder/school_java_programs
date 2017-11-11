package Assg11;
import java.util.Scanner;
class Que
{
    int a [], size, rear;
    Que()
    {
        size = 10;
        rear = 0;
        a = new int [15];
    }
    void push(int n)
    {
        if(rear == size)
        {
            System.out.println("Quen overflow");
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
            int s = a[0];
            for(int i = 0; i < rear; i++)
            {
                a[i] = a[i + 1];
            }
            rear --;
            return s;
        }
    }
    void list()
    {
        if(rear == 0)
        {
            System.out.println("Empty Que");
        }
        else
        {
            for(int i = 0; i < rear; i ++)
            {
                System.out.println(a[i]);
            }
        }
    }
}