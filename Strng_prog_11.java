import java.util.Scanner;
class Strng_prog_11
{
    void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String sentence = sc.nextLine(), word = "";
        char ch;
        int i;
        sentence += " ";
        for(i = 0; i<sentence.length(); i++)
        {
            ch = sentence.charAt(i);

            if(ch != ' ')
            {
                word += ch;                
            }
            else
            {
                if(Character.isUpperCase(word.charAt(0)) && Character.isLowerCase(word.charAt(word.length() - 1)))
                {
                    System.out.print(word);
                }
                word = "";
            }
        }
    }
}