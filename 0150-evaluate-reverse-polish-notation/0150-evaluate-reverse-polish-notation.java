class Solution {
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> st = new Stack<>();
        int n = tokens.length; 

        for(int i = 0 ; i < n ; i++)
        {
            if(tokens[i].equals("+"))
            {
                int x = st.pop();
                int y = st.pop();
                st.push(x + y);
            }
            else if(tokens[i].equals("-"))
            {
                int y = st.pop();
                int x = st.pop();
                st.push(x - y);
            }
            else if(tokens[i].equals("/"))
            {
                int y = st.pop();
                int x = st.pop();
                st.push(x / y);
            }
            else if(tokens[i].equals("*"))
            {
                int x = st.pop();
                int y = st.pop();
                st.push(x * y);
            }
            else
            {
                st.push(Integer.parseInt(tokens[i]));
                continue;
            }
        }  

        if(st.isEmpty())
        return -1;
        else
        return st.pop(); 
    }
}
