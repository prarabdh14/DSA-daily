class Solution {
    public double average(int[] salary) 
    {
        int n = salary.length;
        double sum = 0.0;
        double ans = 0.0;
        double max = 0;
        double min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++)
        {
            if(salary[i] > max)
            max = salary[i];
            if(salary[i] < min)
            min = salary[i];
            sum += salary[i];
        }
        ans = (sum - min - max) / (n - 2);
        return ans;
    }
}