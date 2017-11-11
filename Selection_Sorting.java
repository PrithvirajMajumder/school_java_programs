import java.util.Scanner;
class Selection_Sorting
{
    int[] selectionSort(int n[], boolean ascending)
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
        int limit, i;
        System.out.print("Enter the limit of the array : ");
        limit=sc.nextInt();
        int n[]=new int [limit];
        System.out.print("enter the elements of the array : ");
        for(i=0; i<limit; i++)
        {
            n[i]=sc.nextInt();
        }
        n=selectionSort(n, true);
        System.out.println("The sorted array is : ");
        for(i=0; i<limit; i++)
        {
            System.out.print(n[i] + ", ");
        }
    }
}
    