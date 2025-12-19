class Solution {
    public boolean isValidSudoku(char[][] board) 
    {   
        HashSet<String> present_row = new HashSet<>();
        HashSet<String> present_col = new HashSet<>();
        HashSet<String> present_grid = new HashSet<>();

        for(int i = 0 ; i < 9 ; i++)
        {
            for(int j = 0 ; j < 9 ; j++)
            {
                if(board[i][j]=='.')
                continue;
                if((!present_row.add(board[i][j] + "inrow" + i)) ||
                (!present_col.add(board[i][j] + "incol" + j)) ||
                (!present_grid.add(board[i][j] + "ingrid" + i/3 + j/3))) 
                return false;
            }
        } 
        return true;
    }
}