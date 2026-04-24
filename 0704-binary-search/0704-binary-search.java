class Solution {
    public int search(int[] nums, int target) {
        return bs(nums, 0, nums.length - 1, target);
    }

    public int bs(int[] arr, int st, int end, int target) {
        if (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                return bs(arr, st, mid - 1, target);
            else
                return bs(arr, mid + 1, end, target);
        } else {
            return -1;
        }
    }
}
