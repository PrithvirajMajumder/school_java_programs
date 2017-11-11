package ClassProgs;
import java.util.Scanner;
class Array_sum
{
    int arr [] = new int [10];
    int sum, i;
    void inputData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 numbers : ");
        for(i = 0; i < 10; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    
    void calculate()
    {
        for(i = 0; i < 10; i++)
        {
            sum += arr[i];
        }
    }
    
    void outputData()
    {
        System.out.print(sum);
    }
}