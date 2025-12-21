class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        if(nums.length == 0)
        return 0;

        int x=1;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] != nums[i-1])
            {
                nums[x]=nums[i];
                x++;
            }
        }
        return x;
    }
}