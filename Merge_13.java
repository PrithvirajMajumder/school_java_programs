import java.util.Scanner;
class Merge_13
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
    
    void display()
    {
        Scanner sc = new Scanner(System.in);
        int i, store = 0, limit;
        System.out.print("Enter the limit of the Array : ");
        limit = sc.nextInt();
        int arr1[] = new int [limit];
        int arr2[] = new int [limit];
        int MergedArr[] = new int [limit * 2];
        System.out.print("Enter all the numbers of the first array ; ");
        for(i=0; i<limit; i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter all the numbers of the second array ; ");
        for(i=0; i<limit; i++)
        {
            arr2[i] = sc.nextInt();
        } 
        for(i=0; i<limit; i++)
        {
            MergedArr[i] = arr1[i];
        }
        for(i=limit; i<(limit * 2); i++)
        {
            MergedArr[i] = arr2[store];
            store+=1;
        }
        
        MergedArr = selectionSort(MergedArr);
        
        System.out.println("The Sorted list of numbers after merging are : ");
        for(i=0; i<(limit * 2); i++)
        {
            System.out.println(MergedArr[i] + " ");
        }        
    }
}