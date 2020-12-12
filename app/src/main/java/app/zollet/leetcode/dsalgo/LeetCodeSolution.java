package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
        int a = countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab" });
    }

    public int countConsistentStrings(String allowed, String[] words) {

        int[] a = new int[26];

        for (char c : allowed.toCharArray()) {
            a[c - 'a']++;
        }

        int an = 0;
        for (String word : words) {
            int i = 0;
            for (; i < 26; i++) {
                char c = (char) (i + 'a');
                CharSequence cc = String.valueOf(c);
                if (a[i] > 0) continue;
                if (a[i] <= 0 && !word.contains(cc)) {
                } else {
                    break;
                }
            }
            if (i == 25) an++;
        }
        return an;
    }

}