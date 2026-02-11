class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){

                    if(
                       !hs.add(board[i][j]+"at row "+i) || 
                       !hs.add(board[i][j]+"at col "+j) ||
                       !hs.add(board[i][j]+"at box "+(i/3)+"-"+(j/3)) 
                      )
                    return false;
                }
            }
        }
        return true;
        
    }
}