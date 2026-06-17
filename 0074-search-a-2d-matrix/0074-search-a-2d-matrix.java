class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    { 
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) 
        {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int targetRow = -1;

        for (int i = 0; i < rows; i++) 
        {
            if (target >= matrix[i][0] && target <= matrix[i][cols - 1]) 
            {
                targetRow = i;
                break;
            }
        }

        if (targetRow == -1) 
        {
            return false;
        }

        return binarySearch(matrix[targetRow], target, 0, cols - 1);
    }

    private boolean binarySearch(int[] arr, int target, int start, int end) 
    {
        while (start <= end) 
        {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) 
            {
                return true;
            } 
            else if (arr[mid] < target) 
            {
                start = mid + 1;
            } 
            else 
            {
                end = mid - 1;
            }
        }

        return false;
    }
}