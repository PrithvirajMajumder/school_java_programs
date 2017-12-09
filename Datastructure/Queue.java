package Datastructure;
import java.util.Scanner;
class Queue
{
    int q[] = new int[20];
    int f, r, size;
    Queue(int n)
    {
        for(int i = 0; i<20; i++)
        {
            q[i] = 0;
            f = -1; r = 1;
            size = n;
        }
    }
    void insertQueue(int item)
    {
        if(r == size-1)
        {
            System.out.print("Queue Overflow !! ");
        }
        else
        {
            if(f == -1 && r == -1)
            {
                f = 0;
                r = 0;
            }
            else
            {
                r += 1;
                q[r] = item;
            }
        }
    }
    void deleteQueue()
    {
        if(f == -1 && r == -1)
        {
            System.out.println("Queue underflow !! ");
        }
        else
        {
            if(f == r)
            {
                f = -1;
                r = -1;
            }
            else
            {
                f += 1;
            }
        }
    }
    void display()
    {
        System.out.println("Elements of the queue");
        for(int j = f; j <= r; j++)
        {
            System.out.println(q[j]);
        }
    }
}