package Assg11;
import java.util.*;
class p1
{
    int[] selectionSort(int n[])
    {
        int limit = n.length, i, j, t, min;
        for(i = 0; i<(limit-1); i++)
        {
            min = i;
            for(j = i + 1; j<limit; j++)
            {
                if(n[j]<n[min])
                {
                    min = j;
                }
            }
            t=n[i];
            n[i]=n[min];
            n[min]=t;
        }
        return  n;
    }
    void display()
    {
        Scanner sc = new Scanner(System.in);
        int i;
        int num [] = new int [10];
        System.out.print("Enter 10 numbers : ");
        for(i=0; i<10; i++)
        {
            num[i]=sc.nextInt();
        }
        num=selectionSort(num);
        System.out.println("The array is now sorted : ");
        for(i=0; i<10; i++)
        {
            System.out.print(num[i] + ", ");
        }
    }
}