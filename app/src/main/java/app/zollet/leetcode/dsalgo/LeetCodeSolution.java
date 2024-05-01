package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {
    }

    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();

        boolean shouldReverse = true;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (shouldReverse) {
                sb.append(c);
                if (c == ch) {
                    result.append(sb.reverse());
                    shouldReverse = false;
                }
            } else {
                result.append(c);
            }
        }
        return shouldReverse ? sb.toString() : result.toString();
    }

}


