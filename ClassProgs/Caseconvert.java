package ClassProgs;
import java.util.Scanner;
class Caseconvert 
{
    String str, finalword = "";
    void getStr()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence :");
        str = sc.nextLine();
    }
    
    void convert()
    {
        int i;
        char ch;
        for(i = 0; i < str.length(); i++)
        {
            ch = str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                finalword += Character.toLowerCase(ch);
            }
            if(Character.isLowerCase(ch))
            {
                finalword += Character.toUpperCase(ch);
            }
        }
    }
    
    void display()
    {
        System.out.print(finalword);
    }
}