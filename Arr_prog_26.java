import java.util.Scanner;
class Arr_prog_26
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
    
    void display()
    {
        Scanner sc = new Scanner(System.in);
        int i, limit = 5, storeValue = 0;
        int num [] = new int [limit];
        int num2 [] = new int [limit];
        int mergedArr [] = new int [(limit * 2)];
        int finalArr [] = new int [(limit * 2)];
        System.out.print("Enter the first series of the number : ");
        for(i = 0; i<limit; i++)
        {
            num[i] = sc.nextInt();
        }
        System.out.print("Enter the second series of the number : ");        
        for(i = 0; i<limit; i++)
        {
            num2[i] = sc.nextInt();
        }
        for(i = 0; i<limit; i++)
        {
            num[i] = mergedArr[i];
        }
        for(i = limit; i<(limit * 2); i++)        
        {
            mergedArr[i] = num2[storeValue];
            storeValue++;
        }
        System.out.print("Two Arrays are now merged : ");        
        for(i = 0; i<(limit * 2); i++)        
        {
            System.out.print(mergedArr[i] + " ");   
        }
        
        
        finalArr = Deletion(finalArr);
        for(i = 0; i<(limit * 2); i++)
        {
            System.out.print(finalArr[i] + " ");    
        }
        
        finalArr = selectionSort(finalArr);
        System.out.print("Deleted Array is now sorted : ");
        for(i = limit; i<(limit * 2); i++)
        {
            System.out.print(finalArr[i] + " ");    
        }
    }
}