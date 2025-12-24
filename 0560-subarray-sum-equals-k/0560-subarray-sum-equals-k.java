class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        int n = nums.length;
        int i = 0, ans = 0;
        while(i < n)
        {
            int x = i;
            int count = 0;
            while(x < n)
            {
                count += nums[x];
                if(count == k)
                ans++;
                x++;
            }
            i++;
        }
        return ans;
    }
}