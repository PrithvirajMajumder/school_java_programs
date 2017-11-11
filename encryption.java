class encryption
{
    public int length;
    
    encryption() {
        setLength();
    }
    
    char getNextChar(char ch)
    {
        return (char)((int)ch + 1);
    }
    /*boolean isLastCharacter(String s, char c)
    {
        return s.charAt(s.length() - 1) == c;
    }
    boolean isFirstCharacter(String s, char c)
    {
        return s.charAt(0) == c;
    }*/
    boolean isVowel(char c)
    {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';  
    }
    char changeCase(char ch)
    {
        return Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
    }
    String getEncrypted(String s)
    {
        String encryptedWord = "";
        int i;
        encryptedWord += this.getNextChar(this.changeCase(s.charAt(0)));
        for(i = 1; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            encryptedWord += this.isVowel(ch) ? this.changeCase(this.getNextChar(ch)) : this.getNextChar(ch);
        }
        
        return encryptedWord;
    }
    
    void setLength() {
        this.length = 10;
    }
}