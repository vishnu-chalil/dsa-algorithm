package com.learn.datastructures.array.medium;

import java.util.HashMap;
import java.util.Map;

public class ValidSudoku {

    Map<String, Integer> deduper = null;
    Map<String, Integer> deduper2 = null;
    Map<String, Integer> deduper3 = null;

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            deduper = new HashMap<String, Integer>();
            deduper2 = new HashMap<String, Integer>();
            for (int j = 0; j < 9; j++) {
                if (!(board[i][j] == '.')) {
                    if (!deduper.containsKey(String.valueOf(board[i][j]))) {
                        deduper.put(String.valueOf(board[i][j]), 1);
                    } else {
                        return false;
                    }
                }

                if (!(board[j][i] == '.')) {

                    if (!deduper2.containsKey(String.valueOf(board[j][i]))) {
                        deduper2.put(String.valueOf(board[j][i]), 1);
                    } else {
                        return false;
                    }

                }

                if (j % 3 == 0 && i % 3 == 0) {
                    deduper3 = new HashMap<String, Integer>();
                    if (!helper(String.valueOf(board[i][j]))) {
                        return false;
                    }

                    if (!helper(String.valueOf(board[i][j + 1]))) {
                        return false;
                    }

                    if (!helper(String.valueOf(board[i][j + 2]))) {
                        return false;
                    }

                    if (!helper(String.valueOf(board[i + 1][j]))) {
                        return false;
                    }

                    if (!helper(String.valueOf(board[i + 1][j + 1]))) {
                        return false;
                    }

                    if (!helper(String.valueOf(board[i + 1][j + 2]))) {
                        return false;
                    }

                    if (!helper(String.valueOf(board[i + 2][j]))) {
                        return false;
                    }

                    if (!helper(String.valueOf(board[i + 2][j + 1]))) {
                        return false;
                    }

                    if (!helper(String.valueOf(board[i + 2][j + 2]))) {
                        return false;
                    }

                }

            }
        }
        return true;
    }

    private boolean helper(String val) {

        if (!val.contentEquals(".")) {
            if (!deduper3.containsKey(val)) {
                deduper3.put(val, 1);
                return true;
            } else {
                return false;
            }

        } else {
            return true;
        }

    }
}
