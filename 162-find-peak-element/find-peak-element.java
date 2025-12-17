class Solution {
    public int findPeakElement(int[] nums) 
    {
        for(int i = 1 ; i < nums.length - 1 ; i++)
        {
            if(nums[i - 1] < nums[i] && nums[i + 1] < nums[i])
            return i;
        }  
        if(nums[0] > nums[nums.length - 1])  
        return 0;
        else 
        return nums.length - 1;
    }
}