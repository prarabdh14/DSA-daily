class Solution {
    static {
        for(int i=0 ; i< 500; i++)
        {
            isPalindrome(i);
        }
        
    }
    public static boolean isPalindrome(int x) 
    {
        int rev=0;
        int rem=0;
        int o = x;

        while(x>0)
        {
            rem = x%10;
            rev = (rev*10)+rem;
            x=x/10;
        }

        if(o==rev)
        return true;
        else
        return false;
        
    }
}