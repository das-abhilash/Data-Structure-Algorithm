package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
        int a = maxRepeating("aaa", "a");
    }

    public int maxRepeating(String sequence, String word) {
        if (word.length() > sequence.length()) return 0;
        if (sequence.length() == 0 || word.length() == 0) return 0;
        if (sequence.equals(word)) return 1;

        int t = 1;

        int a = 0;

        StringBuilder sb = new StringBuilder(sequence);
        for (int i = 0; i <= sequence.length() - word.length(); i++) {
            if (sb.substring(i, i+word.length()).equals(word)) {
                int l = 1;
                int j = i + word.length();
                while (j + word.length() <= sequence.length() && sb.toString().substring(j, j + word.length()).equals(word)) {
                    l++;
                    j = j + word.length();
                }
                a = Math.max(a, l);
            }
        }
        return a;
    }

}