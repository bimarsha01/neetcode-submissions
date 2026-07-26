class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            seen.clear();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (seen.contains(board[i][j])) 
                        return false;
                    
                    seen.add(board[i][j]);
                
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            seen.clear();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (seen.contains(board[j][i])) 
                        return false;
                    
                    seen.add(board[j][i]);
                
                }
            }
        }

        for (int boxrow = 0; boxrow < 9; boxrow += 3) {
            for (int boxcol = 0; boxcol < 9; boxcol += 3) {
                seen.clear();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                         char c = board[boxrow + i][boxcol + j];
                        if( c != '.'){
                        if (seen.contains(c))
                            return false;  

                            seen.add(c);
                        
                         }
                    }
                }
            }
        }
        return true;
    }
}
