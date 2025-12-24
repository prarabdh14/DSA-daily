class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int n = s.length();
        int max_len = 0;
        int i = 0;
        while(i < n)
        {
            int j = i;
            //int count =0;
            HashSet<Character> present = new HashSet<>();
            while(j < n && present.add(s.charAt(j)))
            {
                //count++;
                j++;
            }
            if(j-i > max_len)
            max_len = j-i;
            i++;
        }  
        return max_len;  
    }
}