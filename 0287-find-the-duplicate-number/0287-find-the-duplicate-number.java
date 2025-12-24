class Solution {
    public int findDuplicate(int[] nums) 
    {
        HashSet<Integer> present = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(!present.add(nums[i]))
            return nums[i];
        }    
        return 0;
    }
}