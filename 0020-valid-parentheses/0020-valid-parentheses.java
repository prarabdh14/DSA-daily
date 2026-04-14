class Solution {
    public boolean isValid(String s) 
    {
        int n = s.length();

        if(n % 2 != 0)
        return false;
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();

        for(char x : arr)
        {
            if(x == '(' || x == '{' || x ==  '[')
            {
                st.push(x);
            }
            else if(x == ')' && st.isEmpty() == false && st.peek() == '(')
            {
                st.pop();
            }
            else if(x == '}' && st.isEmpty() == false && st.peek()  == '{')
            {
                st.pop();
            }
            else if(x == ']' && st.isEmpty() == false && st.peek() == '[')
            {
                st.pop();
            }
            else
            return false;
        }  
        if(st.isEmpty())
        return true;  

        return false;    }
}
