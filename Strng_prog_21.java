import java.util.Scanner;
class Strng_prog_21
{
    /**
     * Function to sort word in alphabetical order
     */
    String alphabeticOrder(String s)
    {
        int i, j, length;
        char chr;
        String word ="";
        length = s.length();
        for(i = 65; i<=90; i++)
        {
            for(j = 0; j<length; j++)
            {
                chr = s.charAt(j);
                if(chr == (char)(i) || chr == (char)(i+32))
                {
                    word += chr;
                }
            }
            
        }
        return word;
    }
    
    /**
     * Function to get an array of words from a sentence
     */
    String[] explode(String sentence)
    {
        char ch;
        String word = "";
        int k = 0;
        String[] wordsArr = new String[countWords(sentence)];
        for(int i = 0; i<sentence.length(); i++)
        {
            ch = sentence.charAt(i);
            if(ch != ' ')
            {
                word += ch;
            }
            else 
            {
                wordsArr[k++] = word;
                word = "";
            }
        }
        return wordsArr;
    }
    
    /**
     * Function to get the total number of words in a sentence
     */
    int countWords(String s)
    {
        int countSpace = 0;
        for(int i = 0; i<s.length(); i++)
        {
          char ch = s.charAt(i);  
          if(ch == ' ')
          {
              countSpace++;
          }
        }
        
        return (countSpace + 1);
    }
    
    void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence : ");
        String sentence = sc.nextLine(), word = "";
        char ch, ch2;
        int i;
        sentence += " ";
        int noOfWords = countWords(sentence);
        String arr [] = new String [noOfWords];
        int wordLength [] = new int [noOfWords];
        for(i = 0; i <= noOfWords; i++)
        {
            ch = sentence.charAt(i);
            if(ch != ' '){
                word += ch;
            }
            else{
                int WordLength = (word.length() - 1);
                wordLength[i] = WordLength;
                word = "";
            }
        }
        for(i = 0; i <= noOfWords; i++)
        {
            
        }
    }
}