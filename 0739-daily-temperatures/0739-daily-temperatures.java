class Solution {
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<int[]> st = new Stack<>();

        for(int i = 0 ; i < n ; i++)
        {
            int t = temperatures[i];
            while(!st.isEmpty() && t > st.peek()[0])
            {
                int temp[] = st.pop();
                result[temp[1]] = i - temp[1];
            }
            st.push(new int[]{t, i});
        }
        return result;


    }
}
