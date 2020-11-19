package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {
        String s = decodeString("3[a2[c]]");
    }

    public String decodeString(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); ) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                sb.append(s.charAt(i++));
            } else {
                StringBuilder a = new StringBuilder();
                while (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    a.append(s.charAt(i));
                    i++;
                }

                int count = Integer.parseInt(a.toString());

                StringBuilder aa = new StringBuilder();
                int b = 1;
                i++;
                while (b > 0) {
                    if (s.charAt(i) == '[')
                        b++;
                    else if (s.charAt(i) == ']')
                        b--;
                    aa.append(s.charAt(i));
                    i++;
                }
                aa.deleteCharAt(aa.length() - 1);
                String d = decodeString(aa.toString());

                for (int k = 0; k < count; k++) {
                    sb.append(d);
                }
            }
        }
        return sb.toString();
    }

}