package ClassProgs;
import java.util.Scanner;
class Array_max
{
    int i, max;
    int arr [] = new int [10];
    void inputData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 numbers : ");
        for(i = 0; i< 10; i ++)
        {
            arr[i] = sc.nextInt();
        }
    }
    
    void findMax()
    {
        for(i = 0; i< 10; i ++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
    }
    
    void outputData()
    {
        System.out.print("The greatest numbers among the 10 numbers is " + max);
    }
}