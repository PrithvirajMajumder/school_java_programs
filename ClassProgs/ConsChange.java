package ClassProgs;
import java.util.Scanner;
class ConsChange
{
    String word;
    int len;
    ConsChange()
    {
        word = "";
        len = 0;
    }
    void readword()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        word = sc.nextLine();
        len = word.length();
    }
    void shiftcons()
    {
        int i;
        String shiftWord;
        for(i = 0; i < len; i++)
        {
            if(word.charAt(i) == word.charAt(i + 1))
            {
                shiftWord = word.charAt(i) + word.charAt(i + 1);
            }
        }
    }
}