package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {

    }

    public String reformatNumber(String number) {
        String ph = number.replace(" ", "").replace("-", "");
        int length = ph.length();

        boolean should = length % 3 == 1;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (; i < length; i++) {
            if (i!= 0 &&i % 3 == 0 && i < length - 1) {
                sb.append("-");
            }
            if (should && i == length - 2) {
                 sb.append("-");
            }
            sb.append(ph.charAt(i));
        }
        return sb.toString();
    }
}