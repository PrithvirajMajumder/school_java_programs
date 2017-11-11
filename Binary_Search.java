import java.util.Scanner;
class Binary_Search
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
        int mid = 0, first = 0, last = 0, item, i, limit;
        boolean found = false;
        System.out.print("Enter the total number of elements : ");
        limit = sc.nextInt();
        last = limit - 1;
        int numbers[] = new int [limit];
        System.out.print("Enter all the numbers : ");
        for(i = 0; i<limit; i++)
        {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want search from the array : ");
        item = sc.nextInt();
        
        // sort the array here
        
        while(first<=last)
        {
            mid = (first + last) / 2;
            if(numbers[mid] == item)
            {
                found = true;
                break;
            }
            
            if(numbers[mid]<item)
            {
                last = mid + 1;
            }
            if(numbers[mid]>item)
            {
                first--;
            }
            
        }
        if(found)
        {
            System.out.print("Item has been found inthe array in the position " + (mid+1));
        }
        else
        {
            System.out.print("Number not found ");
        }
    }
}