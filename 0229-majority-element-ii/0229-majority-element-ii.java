class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer> count = new HashMap<>();
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < n; i++)
        {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }    
        for(Map.Entry<Integer,Integer> entry : count.entrySet())
        {
            if(entry.getValue() > n / 3)
            ans.add(entry.getKey());
        }
        return ans;
    }
}