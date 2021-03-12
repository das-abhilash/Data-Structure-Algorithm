package app.zollet.leetcode.dsalgo;


import java.util.HashSet;
import java.util.Set;

public class LeetCodeSolution {


    public void execute() {
        boolean a  = hasAllCodes("00110",2);
    }

    public boolean hasAllCodes(String s, int k) {

        Set<String> set = new HashSet<>();

        for (int i = 0; i <= s.length() - k; i++) {
            set.add(s.substring(i, i + k));
        }

        for (int i = 0; i < Math.pow(2, k); i++) {
            StringBuilder b = new StringBuilder();
            String binary = Integer.toBinaryString(i);
            for (int j = 0; j < k - binary.length(); j++) {
                b.append("0");
            }
            b.append(binary);
            if (!set.contains(b.toString())) return false;
        }

        return true;
    }

}