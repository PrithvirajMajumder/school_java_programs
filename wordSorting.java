class wordSorting
{
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
}