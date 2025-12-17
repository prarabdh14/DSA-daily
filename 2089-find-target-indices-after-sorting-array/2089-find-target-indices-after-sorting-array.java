class Solution {
    public List<Integer> targetIndices(int[] nums, int target) 
    {
        List<Integer> ans = new ArrayList<>();
        int less = 0 ;
        int equal = 0 ;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == target)
            equal++;
            if(nums[i] < target)
            less++;
        }  
        while(equal != 0)
        {
            ans.add(less);
            less++;
            equal--;
        }
        return ans;  
    }
}