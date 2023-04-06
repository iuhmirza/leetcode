package validSudoku;

import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>(9);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if ('.' == board[i][j]) {
                    continue;
                }
                if (!set.add(board[i][j])) {
                    return false;
                }
            }
            set.clear();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if ('.' == board[j][i]) {
                    continue;
                }
                if (!set.add(board[j][i])) {
                    return false;
                }
            }
            set.clear();
        }

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if ('.' == board[i+x*3][j+y*3]) {
                            continue;
                        }
                        if (!set.add(board[i+x*3][j+y*3])) {
                            return false;
                        }
                    }
                }
                set.clear();
            }
        }
        return true;
    }
}
