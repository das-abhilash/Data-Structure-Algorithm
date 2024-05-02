package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {
    }

    public String getSmallestString(String s, int k) {

        StringBuilder sb = new StringBuilder();

        int index = 0;
        for (; index < s.length(); index++) {
            char c = s.charAt(index);
            int left = c - 'a';
            int right = 'z' - c + 1;

            int dis = Math.min(left, right);

            if (k >= dis) {
                sb.append('a');
                k = k - dis;
            } else {
                sb.append((char) (c - k));
                break;
            }

        }

        for (int i = index+1; i <s.length() ; i++) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

}


