package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
        String a = decodeAtIndex("a2b3c4d5e6f7g8h9", 10);
    }

    public String decodeAtIndex(String s, int K) {
        StringBuilder sb = new StringBuilder();

        int j = 0;
        for (int i = 0; j < K; i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                sb.append(s.charAt(i));
                j++;
            } else {
                int c = s.charAt(i) - '0';
                String ss = sb.toString();
                if (j >= K) break;
                while (c > 1) {
                    sb.append(ss);
                    c--;
                    j += ss.length();
                }
            }
        }
        return String.valueOf(sb.charAt(K - 1));
    }

}