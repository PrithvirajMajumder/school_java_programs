import java.util.Scanner;
class Strng_prog_4
{
    boolean isPalindrome(String oldWord)
    {
        String newWord = "";
        // reverse loop and make a new word
        for(int i = oldWord.length() - 1 ; i >= 0; i--) 
        {
            char ch = oldWord.charAt(i);
            newWord+=ch;
        }
        // check the new word with the old word
        return newWord.equalsIgnoreCase(oldWord);
    }
    void display()
    {
        Scanner sc = new Scanner(System.in);
        int i, count=0;
        char ch;
        System.out.print("Enter the first Sentence : ");
        String str = sc.nextLine();
        str += " ";
        String word = "";
        for(i = 0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            if(ch != ' ')
            {
               word+=ch;
            }
            else
            {
                // Do the work with the word here 
               if(isPalindrome(word)) 
               {
                  System.out.print("\n" + word);
                  count++;
               }
                // Reset word
                word = "";
            }
        }
        System.out.print("\nTotal number of Palindrome Words is " + count);
    }
}