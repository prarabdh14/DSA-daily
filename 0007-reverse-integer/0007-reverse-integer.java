class Solution {
    public int reverse(int x) 
    {
        int toreverse, digit;
        long reversed=0;
        
        if(x == 0)
        {
            return 0;
        }
        else if(x<0)
        {
            toreverse = -x;
            while(toreverse != 0)
            {
                digit = toreverse % 10 ;
                toreverse = toreverse / 10;
                reversed = (reversed * 10) + digit;
            }
            reversed = - reversed;
        }
        else if(x % 10 == 0)
        {
            toreverse = x / 10;
            while(toreverse != 0)
            {
                digit = toreverse % 10 ;
                toreverse = toreverse / 10;
                reversed = (reversed * 10) + digit;
            }
        }
        else
        {
            toreverse = x;
            while(toreverse != 0)
            {
                digit = toreverse % 10 ;
                toreverse = toreverse / 10;
                reversed = (reversed * 10) + digit;
            }
        }
        /*
        while(x != 0)
            {
                digit = x % 10 ;
                x = x / 10;
                reversed = (reversed * 10) + digit;
            }*/
        if(reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE)
        return 0;
        else
        return (int)reversed;    
    }
}