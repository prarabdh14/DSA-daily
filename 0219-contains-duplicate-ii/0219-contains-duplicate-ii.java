class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        HashMap<Integer,Integer> present = new HashMap<>(); 
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(present.containsKey(nums[i]) && i - present.get(nums[i]) <= k)
            {
                return true;
            }
            else
            present.put(nums[i], i);
        }
        return false;
    }
}