import java.util.Scanner;
class Bubble_Sorting
{
    int[] bubbleSort(int n[], boolean ascending)
    {
        int limit = n.length, i, j, t;
        for(i = 0; i<(limit-1); i++)
        {
            for(j = 0; j<(limit-1)-i; j++)
            {
                if(ascending)
                {
                  if(n[j]>n[j+1])
                    {
                        t=n[j];
                        n[j] = n[j + 1];
                        n[j+1]= t;
                    }  
                }
                
                if(!ascending)
                {
                    if(n[j]<n[j+1])
                    {
                        t=n[j];
                        n[j] = n[j + 1];
                        n[j+1]= t;
                    }
                }
            }
        }
        return  n;
    }
    
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        int i, j, t, limit;
        System.out.print("Enter the number of elements : ");
        limit = sc.nextInt();
        int n [] = new int [limit];
        System.out.println("Enter the numbers : ");
        for(i=0; i<limit; i++)
        {
            n[i] = sc.nextInt();
        }
        n = bubbleSort(n, false);
        System.out.print("The numbers are arranged in ascending order are : ");
        for(i=0; i<limit;i++)
        {
            System.out.print(n[i] + ", ");
        }
    }
}