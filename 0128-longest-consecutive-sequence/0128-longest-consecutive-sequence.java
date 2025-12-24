class Solution {
    public int longestConsecutive(int[] nums) 
    {
        Arrays.sort(nums);
        int n = nums.length;
        if(n == 0)
        return 0;
        int i = 0;
        int j = 1;
        int ans = 0; 
        while(i < n - 1)
        {
            
            if(nums[j] == nums[i] + 1)
            {
                int count = 0;
                while((j < n && nums[j] == nums[i] + 1) || (j < n && nums[i] == nums[j]))
                {
                    if(nums[i] == nums[j])
                    {
                        i++;
                        j++;
                        continue;
                    }
                    count++;
                    i++;
                    j++;
                }
                if(count > ans)
                ans = count;
            }
            else
            {
                i++;
                j++;
            }
        }   
        return ans+1;
    }
}