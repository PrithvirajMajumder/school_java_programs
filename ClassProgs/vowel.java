package ClassProgs;
import java.util.Scanner;
class vowel
{
    String str;
    int count;
    void getStr()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        str = sc.nextLine();
    }
    
    void getVowel()
    {
        int i;
        char ch;
        for(i = 0; i < str.length(); i++)
        {
            ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                count ++;
            }
        }
    }
     
    void display()
    {
        System.out.print("There are " + count + " vowels in your sentence.");
    }
}