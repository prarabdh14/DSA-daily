class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int n = nums1.length + nums2.length;
        int [] nums = new int[n];
        double median = 0;
        int j = 0, i = 0, n1 = nums1.length, n2 = nums2.length, k = 0;
        
        while(i <  n1 && j < n2)
        {
            if(nums1[i] < nums2[j])
            nums[k++] = nums1[i++];
            else
            nums[k++] = nums2[j++];
        }
        while (i < n1)
        nums[k++] = nums1[i++];
        while (j < n2)
        nums[k++] = nums2[j++];
        
        if(n % 2 != 0)
        {
            median = nums[n/2];
        }
        else
        {
            median = (nums[n/2] + nums[(n/2) - 1]) / 2.0;
        }
        return median;
    }
}