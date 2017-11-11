import java.util.Scanner;
class Strng_prog_6
{
    void display()
    {
        Scanner sc = new Scanner(System.in);
        String name, word = "";
        char ch;
        int i, countSpace=0;
        System.out.print("Enter a name : ");
        name = sc.nextLine();
        // Add a space in before the name
        name = " " + name.trim();
 
        for(i = 0; i<name.length(); i++)
        {
            ch = name.charAt(i);
            if(ch == ' ')
            {
                countSpace++;
                if(countSpace<=2)
                {
                    System.out.print(name.charAt(i+1) + ".");
                }
            
            } 
            else 
            {
                if(countSpace>2)
                {
                    System.out.print(name.charAt(i));
                }
            }
            
            
        }
    }
}