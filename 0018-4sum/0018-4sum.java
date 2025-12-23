class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target)
    {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>() ;
        for(int j = 0 ; j < n - 2; j++)
        {
            if(j > 0 && nums[j] == nums[j - 1])
            continue;
        for(int i = j + 1 ; i < n - 2 ; i++)
        {
            if(i > j + 1 && nums[i] == nums[i - 1])
            continue;
            long find = (long) target - nums[j] - nums[i];
            int left = i + 1;
            int right = n - 1;
            while(left < right)
            {
                long sum = nums[left] + nums[right];
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
                    inner.add(nums[j]);
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
        }
        return ans; 
    }
}