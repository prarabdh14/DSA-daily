class Solution {
    public boolean isValidSudoku(char[][] board) 
    {   
        HashSet<String> present = new HashSet<>();
        /*HashSet<String> present_col = new HashSet<>();
        HashSet<String> present_grid = new HashSet<>();*/

        for(int i = 0 ; i < 9 ; i++)
        {
            for(int j = 0 ; j < 9 ; j++)
            {
                if(board[i][j]=='.')
                continue;
                else if(!present.add(board[i][j] + "inrow" + i))
                return false;
                else if(!present.add(board[i][j] + "incol" + j))
                return false;
                else if(!present.add(board[i][j] + "ingrid" + i/3 + j/3))
                return false;
            }
        } 
        return true;
    }
}