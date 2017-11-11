import java.util.Scanner;
class Strng_prog_13
{
    String ucFirst(String word)
    {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
    }
    void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence : ");
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
                System.out.print(ucFirst(word) + " ");
                word = "";
            }
        }
    }
}