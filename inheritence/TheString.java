package inheritence;
import java.util.Scanner;
class TheString
{
    String str;
    int len, wordcount, con;
    TheString()
    {
        this.str = "";
        this.len = 0;
        this.wordcount = 0;
        this.con = 0;
    }
    
    TheString(String ds)
    {
        this.str = ds;
    }
    
    void countFreq()
    {
        char ch;
        len = str.length();
        str += " ";
        wordcount = 1;
        con = 1;
        for(int i = 0; i < len; i++)
        {
            ch = str.charAt(i);
            if(ch == ' ')
            {
                 wordcount ++;
            }
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                con ++;
            }
        }
    }
    
    void display()
    {
        System.out.print("The sentence is " + str);
        System.out.print("\nThe sentence has " + wordcount + " and " + con + " consonents ");;
    }
    
    void main()
    {
        TheString Thestr = new TheString("hello my name is prithviraj");
        Thestr.countFreq();
        Thestr.display();
    }
}