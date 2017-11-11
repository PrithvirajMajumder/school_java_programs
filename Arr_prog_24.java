import java.util.Scanner;
class Arr_prog_24
{
    void display()
    {
        Scanner sc = new Scanner(System.in);
        int i, j, limit = 6, sum=0;
        double binaryArr [] = new double [limit];
        double Arr1 [] = new double [limit];
        double Arr2 [] = new double [limit];        
        double Arr3 [] = new double [limit];        
        System.out.print("Enter all the binary numbers : ");
        for(i = 0; i<limit; i++)
        {
            binaryArr[i]=sc.nextDouble();
        }
        for(i = 0; i<limit; i++)
        {
            Arr1 [i] = Math.pow(2, i);
        }
        for(i = 0; i<limit; i++)
        {
            Arr2 [i] = binaryArr[i] * Arr1[i];
        }
        for(i = 0; i<limit; i++)
        {
            sum+=Arr2[i];
        }
        System.out.print(sum);
    }
}