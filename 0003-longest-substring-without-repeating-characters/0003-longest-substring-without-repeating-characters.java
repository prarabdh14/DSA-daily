class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max_len = 0;
        int i = 0;
        int j = 0;
        HashSet<Character> present = new HashSet<>();

        while (j < n) {
            //int j = i;
            //int count =0;
            while (present.contains(s.charAt(j))) {
                //count++;
                present.remove(s.charAt(i));
                i++;
            }
            present.add(s.charAt(j));
            if (j - i + 1 > max_len)
                max_len = j - i + 1;
            j++;
            if (i > n - max_len)
                return max_len;
        }
        return max_len;
    }
}