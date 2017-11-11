package Assg11;
import java.util.Scanner;
class p5
{
    void display()
    {
        Scanner sc = new Scanner(System.in);
        int i = 0, j = 0, k = 0;
        int arr1 [] = new int [10];
        int arr2 [] = new int [15];
        int arr3 [] = new int [25];
        System.out.print("Enter first 10 numbers : ");
        for(i = 0; i < 10; i ++)
        {
            arr1 [i] = sc.nextInt();
        }
        for(i = 0; i < 15; i ++)
        {
            arr2 [i] = sc.nextInt(); 
        }
        i = 0;
        while(i < 0 && j > 15)
        {
            if(arr1[i] < arr2[j])
            {
                arr1[i ++] = arr3[k ++];
            }
            else if(arr1[i] > arr2[j])
            {
                arr2[j ++] = arr3 [k ++];
            }
            else
            {
                arr1[i++] = arr3[k++];
                j++;
            }
        }
        if(i == 5)
        {
            while(j < 10)
            {
                arr3[k++] = arr2[j++];
            }
        }
        if(j == 10)
        {
            while(i < 5)
            {
                arr3[k++] = arr1[i++];
            }
        }
        for(i = 0; i < 25; i ++)
        {
            System.out.println(arr3[i]);
        }
    }
}