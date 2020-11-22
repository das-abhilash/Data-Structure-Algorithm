package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {
    public void execute() {
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb = new StringBuilder();
        for (String s : word1) {
            sb.append(s);
        }

        StringBuilder sb1 = new StringBuilder();
        for (String s : word2) {
            sb1.append(s);
        }

        return sb.toString().equals(sb1.toString());
    }

}