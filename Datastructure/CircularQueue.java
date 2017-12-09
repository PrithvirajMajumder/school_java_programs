package Datastructure;
import java.util.Scanner;
class CircularQueue
{
    int q[] = new int [20];
    int f, r, size;
    CircularQueue(int n)
    {
        for(int i= 0; i < 20; i++)
        {
            q[i] = 0;
            f = -1;
            r = -1;
            size = n;
        }
    }
    void insertQueue(int item)
    {
        if(f == 0 && r == size-1 || f == r + 1)
        {
            System.out.print("Queue Overflow : ");
        }
        else
        {
            if(f == -1 && r == -1)
            {
                f = 0;
                r = 0;
            }
            else if(r == size -1)
            {
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
            System.out.println("Queue Underflows !! ");
        }
        else
        {
            int val = q[f];
            if(f == size - 1)
            {
                f = 0;
            }
            else if(f == r)
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
        System.out.println("Elements of the queue ");
        for(int j = 0; j < size; j++)
        {
            System.out.println(q[j]);
        }
    }
}