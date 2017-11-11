import java.util.Scanner;
class deletion
{
    void display()
    {
        Scanner sc = new Scanner(System.in);
        int i, j, limit = 5;
        int Arr1 [] = new int [limit];
        int Arr2 [] = new int [limit];
        for(i=0; i<limit; i++)
        {
            Arr1[i] = sc.nextInt();
        }
        
        for(i=0; i<limit; i++)
        {
            for(j=i+1; j<limit; i++)
            {
                if(Arr1[i] == Arr1[j])
                {
                    Arr1[j] = 0;
                }
            }
        }
        
        j=0;
        for(i=0; i<limit; i++)
        {
            if(Arr1[i]!=0)
            {
                Arr2[j]=Arr1[i];
                j++;
            }
        }
        System.out.println("Result after deleting duplicate number : ");
        
        for(i=0; i<limit; i++)        
        {
            System.out.println(Arr2[i] + ", ");
        }
        
    }
}
    