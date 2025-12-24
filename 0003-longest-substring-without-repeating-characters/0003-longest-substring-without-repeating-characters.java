class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int n = s.length();
        int max_len = 0;
        int i = 0;
        HashSet<Character> present = new HashSet<>();

        while(i < n)
        {
            int j = i;
            //int count =0;
            while(j < n && present.add(s.charAt(j)))
            {
                //count++;
                j++;
            }
            present.clear();
            if(j-i > max_len)
            max_len = j-i;
            i++;
            if(i > n - max_len)
            return max_len;
        }  
        return max_len;  
    }
}