package ClassProgs;
import java.util.Scanner;
class stringmanip
{
    String s, rev;
    void getStr()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        s = sc.nextLine();
    }
    
    void reverse()
    {
        int i;
        char ch;
        String word = "";
        for(i = s.length()-1; i >= 0; i --)
        {
            ch = s.charAt(i);
            rev += ch;
        }
        
        for(i = 0; i < s.length(); i ++)
        {
            ch = rev.charAt(i);
            if(ch != ' ')
            {
                word += ch;
            }
            else
            {
                System.out.println(word);
                word = "";
            }
        }
    }
}