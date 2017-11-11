package Datastructure;
import java.util.Scanner;
class p5
{
    void display()
    {
        Scanner sc = new Scanner(System.in);
        int i = 0, j = 0, k = 0;
        int [] arr1 = new int [10];
        int [] arr2 = new int [15];
        int [] arr3 = new int [25];
        System.out.print("Enter the first ten numbers : ");
        for(i = 0; i < 10; i ++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Ebter the next 15 numbers : ");
        for(i = 0; i < 10; i ++)
        {
            arr2[i] = sc.nextInt();
        }
        i = 0;
        while(i < 10 && j < 15)
        {
            if(arr1[i] < arr2[j])
            {
                arr3[k++] = arr1[i++];
            }
            else if(arr2[j] < arr1[i])
            {
                arr3[k++] = arr2[j++];
            }
            else
            {
                arr3[k++] = arr1[i++];
                j++;
            }
        }
        if(i < 10)
        {
            
        }
    }
}