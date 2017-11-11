import java.util.Scanner;
class array_prog_9
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
    
    boolean inArray(int haystack[], int key)
    {
        int i, limit = haystack.length;
        boolean found = false;
        for(i = 0; i<limit; i++)
        {
            if(key == haystack[i])
            {
                found = true;
                break;
            }
        }
        
        return found;
    }
    
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        int i, limit = 5;
        int num [] = new int [limit];
        System.out.print("Enter the numbers you wnat to sort : ");
        for(i=0; i<limit; i++)
        {
            num[i] = sc.nextInt();
        }
        
        num=selectionSort(num);
        System.out.print("The array is sorted in ascending order are in below : ");
        
        for(i=0; i<limit; i++)
        {
        System.out.println(num[i] + ", ");
        }
        
        System.out.println("All the numbers of the sorted array are listed in a countinuous series : ");
        
        for(i=num[0]+1; i<num[limit-1]; i++)
        {
            if(!inArray(num, i)) 
            {
              System.out.print(i + ", ");
            }
            
        }
    }
}