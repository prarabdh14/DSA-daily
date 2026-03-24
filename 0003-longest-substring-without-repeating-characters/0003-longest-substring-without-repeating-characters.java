class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        /*
        int  max = 0;
        int n = s.length();
        for(int i = 0; i < n ; i++)
        {
            int count = 0;
            HashSet<Character> hash = new HashSet<>();
            for(int j = i ; j < n ; j++)
            {
                if(hash.contains(s.charAt(j)))
                {
                    break;
                }
                else
                {
                    hash.add(s.charAt(j));
                    count++;
                }
            }
            if(count > max)
            max = count;
        }    
        return max;*/
        int  max = 0, left =0;
        int n = s.length();
        int arr[] = new int[256];
        Arrays.fill(arr, -1);
        for(int right = 0 ; right < n ; right++)
        {
            if(arr[s.charAt(right)] != -1)
            {
                if(arr[s.charAt(right)] >= left)
                {
                    left = arr[s.charAt(right)] + 1;
                }
            }
            if((right - left + 1 ) > max)
            {
                max = right - left + 1;
            }
            arr[s.charAt(right)] = right;
        }
        return max;
    }
}