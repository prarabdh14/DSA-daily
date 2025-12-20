class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max_area = 0;

        while (left < right) {
            int area;

            if (height[left] <= height[right]) {
                area = height[left] * (right - left);
                left++;
            } else {
                area = height[right] * (right - left);
                right--;
            }

            if (area > max_area)
                max_area = area;
        }

        return max_area;
    }
}
