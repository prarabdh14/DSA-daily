class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>() ;
        for(int i = 0 ; i < n - 2 ; i++)
        {
            if(i > 0 && nums[i] == nums[i - 1])
            continue;
            int find = 0 - nums[i];
            int left = i + 1;
            int right = n - 1;
            while(left < right)
            {
                int sum = nums[left] + nums[right];
                if(sum < find)
                {
                    left++;
                }
                else if(sum > find)
                {
                    right--;
                }
                else
                {
                    List<Integer> inner = new ArrayList<>();
                    inner.add(nums[i]);
                    inner.add(nums[left]);
                    inner.add(nums[right]);
                    ans.add(inner);
                    while (left < right && nums[left] == nums[left + 1]) 
                    left++;
                    while (left < right && nums[right] == nums[right - 1]) 
                    right--;

                    left++;
                    right--;
                }
            }
        }  
        return ans; 
    }
}