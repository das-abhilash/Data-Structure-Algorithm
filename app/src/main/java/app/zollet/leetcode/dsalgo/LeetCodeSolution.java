package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
        gameOfLife(new int[][]{{0, 0}});
    }

    public void gameOfLife(int[][] board) {
        if (board.length == 0) return;
        int[][] a = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                a[i][j] = -1;
            }
        }
        solve(a, board, 0, 0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = a[i][j];
            }
        }
    }

    private void solve(int[][] a, int[][] board, int x, int y) {

        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || a[x][y] > -1) return;
        int one = 0;
        int zero = 0;


        try {
            if (board[x][y - 1] == 1) one++;
            else zero++;
        } catch (Exception e) {

        }

        try {
            if (board[x - 1][y - 1] == 1) one++;
            else zero++;
        } catch (Exception e) {

        }

        try {
            if (board[x + 1][y - 1] == 1) one++;
            else zero++;
        } catch (Exception e) {

        }
        try {
            if (board[x - 1][y] == 1) one++;
            else zero++;
        } catch (Exception e) {

        }
        try {
            if (board[x + 1][y] == 1) one++;
            else zero++;
        } catch (Exception e) {

        }
        try {
            if (board[x - 1][y + 1] == 1) one++;
            else zero++;
        } catch (Exception e) {

        }
        try {
            if (board[x][y + 1] == 1) one++;
            else zero++;
        } catch (Exception e) {

        }

        try {
            if (board[x + 1][y + 1] == 1) one++;
            else zero++;
        } catch (Exception e) {

        }

        if (board[x][y] == 1) {
            if (one < 2) {
                a[x][y] = 0;
            } else if (one == 2 || one == 3) {
                a[x][y] = 1;
            } else {
                a[x][y] = 0;
            }
        } else {
            if (one == 3) {
                a[x][y] = 1;
            } else {
                a[x][y] = 0;
            }
        }

        solve(a, board, x - 1, y - 1);
        solve(a, board, x - 1, y);
        solve(a, board, x - 1, y + 1);

        solve(a, board, x, y - 1);
        solve(a, board, x, y + 1);

        solve(a, board, x + 1, y - 1);
        solve(a, board, x + 1, y);
        solve(a, board, x + 1, y + 1);
    }

}