import java.util.Scanner;
class Function_of_BinarySearch
{
    int [] selectionSort(int n[])//function for sorting the array 
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
    
    //function for searching
    int BinarySearch(int n[], int item)
    {
        int limit = n.length, start = 0, mid = 0, end = 0, pos = -1, i;
        end = limit - 1;
        
        while(start<=end)
        {
            mid = (start + end) / 2;
            if(n[mid] == item)
            {
                pos = mid;
                break;
            }
            
            if(n[mid]<item)
            {
                end = mid + 1;
            }
            
            if(n[mid]>item)
            {
                start--;
            }
        }
        
        return pos;
    }
    
    void display()
    {
        Scanner sc = new Scanner(System.in);
        int limit, item, i, pos = 0, result = 0;
        System.out.print("Enter the limit of the array : ");
        limit = sc.nextInt();
        int numbers[] = new int [limit];
        System.out.print("Enter all the numbers : ");
        for(i=0; i<limit; i++)
        {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to search from the array : ");
        item = sc.nextInt();
        numbers = selectionSort(numbers);
        result = BinarySearch(numbers, item);
        if(result > -1)
        {
           System.out.println("The item is found in position : " + (result+1) );
        }
        else
        {
            System.out.println("Item is not found in the array");        
        }
            
    }
}