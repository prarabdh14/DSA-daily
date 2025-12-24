class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int n = s.length();
        int max_len = 0;
        int i = 0;
        while(i < n)
        {
            int j = i;
            int count =0;
            HashSet<Character> present = new HashSet<>();
            while(j < n && present.add(s.charAt(j)))
            {
                count++;
                j++;
            }
            if(count > max_len)
            max_len = count;
            i++;
        }  
        return max_len;  
    }
}