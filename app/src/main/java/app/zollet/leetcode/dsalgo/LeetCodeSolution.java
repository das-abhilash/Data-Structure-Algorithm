package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
    }

    public int numRookCaptures(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    return find(board, i, j);
                }
            }
        }
        return 0;
    }

    private int find(char[][] board, int i, int j) {
        int a = 0;

        for (int k = i - 1; k >= 0; k--) {
            if (board[k][j] == 'p') {
                a++;
                break;
            } else if (board[k][j] == 'B') {
                break;
            }
        }

        for (int k = i + 1; k <8; k++) {
            if (board[k][j] == 'p') {
                a++;
                break;
            } else if (board[k][j] == 'B') {
                break;
            }
        }

        for (int k = j - 1; k >= 0; k--) {
            if (board[i][k] == 'p') {
                a++;
                break;
            } else if (board[i][k] == 'B') {
                break;
            }
        }

        for (int k = i + 1; k < 8; k++) {
            if (board[i][k] == 'p') {
                a++;
                break;
            } else if (board[i][k] == 'B') {
                break;
            }
        }

        return a;
    }

}