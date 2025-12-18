class Solution {
    public int maximumCount(int[] nums) 
    {
        int neg = 0;
        int zero = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++)    
        {
            if(nums[i] < 0)
            neg++;
            else if(nums[i] == 0)
            zero++;
            else
            break;
        }
        int pos = n - (zero+neg);
        return Math.max(pos,neg);
    }
}