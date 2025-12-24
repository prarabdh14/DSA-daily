class Solution {
    public int findDuplicate(int[] nums) 
    {
        int n = nums.length;
        //HashSet<Integer> present = new HashSet<>();
        int[] present = new int [n];
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(present[nums[i]] == 0)
            present[nums[i]] = nums[i];
            else
            return nums[i];        }    
        return 0;
    }
}