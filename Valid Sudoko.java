class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> set = new HashSet();
        
        for(int col = 0 ; col < board.length ; col++){
            
            for(int row = 0 ; row < board.length ; row++){
                
                String c = String.valueOf(board[col][row]);
                if(!c.equals("."))
                { 
                    if(!set.add(c +" in " +col) || !set.add(c + row) || !set.add(c +" in " +col/3 +" in " + row/3) )  
                    {
                        return false;
                    }
                }
            }
        }
        return true;