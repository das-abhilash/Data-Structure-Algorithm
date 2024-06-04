package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {
        int s = appendCharacters("z", "abcde");
    }

    public int appendCharacters(String s, String t) {

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }

        return t.length() - j;
    }

    private int solve(int start, String s, String t) {
        int i = 0;

        for (; i < s.length() && i < t.length(); i++) {
            if (s.charAt(start + i) != t.charAt(i)) {
                break;
            }
        }

        return t.length() - i;
    }


}


