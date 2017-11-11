import java.util.Scanner;
class Ascending_sum
{
    int[] bubbleSort(int n[])
    {
        int limit = n.length, i, j, t;
        for(i = 0; i<(limit-1); i++)
        {
            for(j = 0; j<(limit-1)-i; j++)
            {
                  if(n[j]>n[j+1])
                  {
                      t=n[j];
                      n[j] = n[j + 1];
                      n[j+1]= t;
                  }
            }
        }
        return n;
    }
    
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        int i, limit=5, sum_negative = 0, sum_positive = 0;
        int num []=new int [limit];
        System.out.print("Enter the numbers you want to sort : ");
        for(i=0; i<limit; i++)
        {
            num[i]=sc.nextInt();
        }
        num = bubbleSort(num);
        
        System.out.println("The array is sorted in ascending order : ");
        for(i=0; i<limit; i++)
        {
            if(num[i] > 0)
            {
                sum_positive = sum_positive + num[i];
            }
            
            if(num[i] < 0)
            {
                sum_negative = sum_negative + num[i];
            }
            System.out.println(num[i] + ", ");
        }
        
        System.out.println("Sum of all positive numbers are : " + sum_positive);
        System.out.println("Sum of all negetive numbers are : " + sum_negative);
    }
        
}