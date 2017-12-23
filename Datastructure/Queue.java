package Datastructure;
import java.util.Scanner;
class Queue
{
    int queue[];
    int front, rear;
    Queue(int size)
    {
        this.queue = new int [size];
        front = -1; rear = -1;
        for(int i = 0; i<this.queue.length; i++)
        {
            queue[i] = 0;
        }
    }
    
    void insert(int item)
    {
        if(rear == this.queue.length-1)
        {
            System.out.print("Queue Overflow !! ");
        }
        else
        {
            if(front == -1 && rear == -1)
            {
                front = 0;
                rear = 0;
            }
            else
            {
                rear++;
            }
            queue[rear] = item;
        }
    }
    
    void delete()
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Queue underflow !! ");
        }
        else
        {
            if(front == rear)
            {
                front = -1;
                rear = -1;
            }
            
            else
            {
                this.queue[front] = 0;
                front++;
            }
        }
    }
    
    void display()
    {
        System.out.println("Elements of the queue");
        for(int j = front; j <= rear; j++)
        {
            System.out.println(queue[j]);
        }
    }
    
    static void main()
    {
        
    }
}