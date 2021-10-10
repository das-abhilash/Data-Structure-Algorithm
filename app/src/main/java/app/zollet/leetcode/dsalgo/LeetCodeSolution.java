package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.List;

public class LeetCodeSolution {


    public void execute() {
    }

    public List<String> findWords(char[][] board, String[] words) {

        List<String> answer = new ArrayList<>();
        for (int k = 0; k < words.length; k++) {
            boolean found = false;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == words[k].charAt(0)) {
                        if (solve(board, words[k], 0, i, j)) {
                            found = true;
                            break;
                        }
                    }
                }
                if (found) break;
            }
            if (found) answer.add(words[k]);
        }
        return answer;
    }

    private boolean solve(char[][] board, String word, int index, int i, int j) {
        if (index >= word.length()) return true;
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == '$')
            return false;
        if (word.charAt(index) != board[i][j]) return false;
        char c = board[i][j];
        board[i][j] = '$';
        boolean a = solve(board, word, index + 1, i + 1, j)
                || solve(board, word, index + 1, i - 1, j)
                || solve(board, word, index + 1, i, j + 1)
                || solve(board, word, index + 1, i, j - 1);

        board[i][j] = c;
        return a;
    }


}