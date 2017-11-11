import java.util.Scanner;
import java.io.*;
public class Array_prog_1
{
    public void display()
    {
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        int limit=5, avg=0, sum=0, i;      
        int number[] = new int[limit];
        
        for(i=0; i < limit; i++)
        {
            number[i] = sc.nextInt();
            sum+=number[i];
        }
        System.out.println("The sum is : " + sum);
        
        avg = (int) sum/limit;
        
        System.out.println("The average is : " + avg);
        System.out.println("The numbers which are greater than " + avg + ": ");
        
        for(i=0; i < limit; i++)
        {
            if(number[i] > avg)
            {
                System.out.println(number[i]);
            }
        }
        
    }
      
}