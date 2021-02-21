package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
    }

    public String mergeAlternately(String word1, String word2) {

        StringBuilder a = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < word1.length() && j < word2.length()) {

            a.append(word1.charAt(i++));
            a.append(word2.charAt(j++));
        }

        a.append(word1.substring(i));
        a.append(word2.substring(j));
        return a.toString();
    }

}