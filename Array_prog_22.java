import java.util.Scanner;
class Array_prog_22
{
    void sortByrank(int n[], String names[])
    {
        int limit = n.length, i, j, t, min;
        String newNames[] = new String[limit];
        
        for(i = 0; i<(limit-1); i++)
        {
            min = i;
            for(j = i + 1; j<limit; j++)
            {
                if(n[j]>n[min])
                {
                    min = j;
                }
            }
                t=n[i];
                n[i]=n[min];
                n[min]=t;
                
                
                newNames[i] = names[min];
            }
        
        for(i = 0; i<limit; i++)
        {
            System.out.print(newNames[i] + ", ");
            System.out.print(n[i] + ", ");            
        }
            
    }
    
    void display()
    {
        Scanner sc = new Scanner(System.in);
        int limit = 5, i; 
        String Names[] = new String[limit];
        int marks[] = new int[limit];
        
        for(i = 0; i<limit; i++)
        {
            System.out.print((i + 1) +") Enter a name: ");
            Names[i] = sc.next();
            System.out.print("  Enter the marks of : " + Names[i] + ": ");
            marks[i] = sc.nextInt();         
        }
        sortByrank(marks, Names);
        //marks = selectionSort(marks);
    }
}