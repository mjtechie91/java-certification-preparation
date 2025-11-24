package strings;

import java.util.HashSet;
import java.util.Set;

public class LeetCodeValidSudoku36 {

    public static void main(String[] args) {

    }

    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for(int i =0; i< board.length; i++){
            for(int j=0; j < board[i].length; j++){
                 char num = board[i][j];
                if(String.valueOf(num).equals(".")) {
                    continue;
                };

                boolean isExist =
                        !seen.add(board[i][j] + "Row") ||
                                !seen.add(board[i][j] + "Col") ||
                                !seen.add(board[i][j] + "added to Box " + i/3 + '-' + j/3);
                if(isExist){
                    return false;
                }

            }
        }
        return true;
    }
}
