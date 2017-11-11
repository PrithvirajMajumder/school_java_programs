import java.util.Scanner;
class selection_sum
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
    
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        int i, sum = 0, limit = 5;
        int num [] = new int [limit];
        System.out.print("Enter the numbers you want to sort : ");
        for(i=0; i<limit; i++)
        {
            num[i]= sc.nextInt();
        }
        num=selectionSort(num);
        System.out.print("The sorted array are : ");
        for(i=0; i<limit; i++)
        {
            System.out.print(num[i] + ", ");
            System.out.print("The sum of all numbers are : ");
            sum+=num[i];
        }
        System.out.println(sum);
   }
}