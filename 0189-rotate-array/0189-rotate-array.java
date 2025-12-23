class Solution {
    public void rotate(int[] nums, int k) 
    {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[n];
        int j = n - k; 
        int i = 0;
        while(j < n)
        {
            temp[i] = nums[j];
            j++;
            i++;
        } 
        int x = 0;
        for(i = i ; i < n ; i++)
        {
            temp[i] = nums[x];
            x++;
        }   
        for(int z  = 0 ; z < n ; z++)
        {
            nums[z] = temp[z];
        }
    }
}