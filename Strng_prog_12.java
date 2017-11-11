//Question = remove all unwanted spaces from the sentence
import java.util.Scanner;
class Strng_prog_12
{
    void display()
    {
        Scanner sc = new Scanner(System.in);
        String Sentence, word = "", newSentence = "";
        char ch;
        int i;
        System.out.print("Enter a sentence with many spaces between the words : ");
        Sentence = sc.nextLine();
        Sentence += " ";
        for(i = 0; i<Sentence.length(); i++)
        {
            ch = Sentence.charAt(i);
            if(ch != ' ')
            {
                word += ch;
            }
            else
            {
                if(word.length() > 0) {
                    newSentence+= (word + " ");
                }
                word = "";
            }
        }
        System.out.println("The new sentence is: \n" + newSentence);
    }
}   