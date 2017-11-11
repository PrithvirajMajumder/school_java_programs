import java.util.Scanner;
class merge_14
{
    int [] Deletion(int n[])
    {
        int i, j, limit = n.length;
        int Arr [] = new int [limit];
        for(i=0; i<limit; i++)
        {
            for(j=i+1; j<limit; i++)
            {
                if(n[i] == n[j])
                {
                    n[j] = 0;
                }
            }
        }
        
        j=0;
        for(i=0; i<limit; i++)
        {
            if(n[i]!=0)
            {
                Arr[j]=n[i];
                j++;
            }
        }
        return Arr;
    }
    
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
        int i, limit = 5, storeValue = 0, j, t;
        int FirstArr[] = new int[limit];
        int SecondArr[] = new int[limit];
        int FinalMergedArr[] = new int [limit * 2];
        System.out.print("Enter all the number of first series : ");        
        for(i=0; i<limit; i++)
        {
            FirstArr[i] = sc.nextInt();
        }
        System.out.print("Enter all the number of second series : ");
        for(i=0; i<limit; i++)
        {
            SecondArr[i] = sc.nextInt();
            FinalMergedArr[i] = FirstArr[i];
        }
        
        for(i=0; i<limit; i++)
        {
            FinalMergedArr[i] = FirstArr[i];
        }
        
        for(i=limit; i<(limit * 2); i++)
        {
            FinalMergedArr[i] = SecondArr[storeValue];
            storeValue++;
        }
        
        FinalMergedArr = selectionSort(FinalMergedArr);
        System.out.print("The Numbers are Sorted and Merged : ");        
        
        for(i=0; i<(limit * 2); i++)
        {
            System.out.print(FinalMergedArr[i] + ", ");
        }
        
        FinalMergedArr = Deletion(FinalMergedArr);
        
        System.out.print("\nAll the duplicate number from the sorted array are now deleted : ");
        
        for(i=0; i<(limit * 2); i++)
        {
            System.out.print(FinalMergedArr[i] + ", ");
        }        
    }
}