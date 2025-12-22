

class Solution {
    public String mergeAlternately(String word1, String word2) 
    {

        StringBuilder ans = new StringBuilder();
        //char [] ans = new char[word1.length() + word2.length()];
        int i = 0;
        int x = word1.length();
        int y = word2.length();
        //int j = 0;
        while(i < x || i < y)    
        {
            if(i < x)
            {
                ans.append(word1.charAt(i));
            }
            if(i < y)
            {
                ans.append(word2.charAt(i));
            }
            i++;
        }
        /*if(word1.length() <= word2.length())
        ans += word2.charAt(word2.length() - 1);
        else
        ans += word1.charAt(word1.length() - 1);*/

    
        return ans.toString();
    }
}