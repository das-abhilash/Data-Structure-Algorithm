package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCodeSolution {


    public void execute() {
        List<String> a = wordSubsets(new String[]{"amazon", "apple", "facebook", "google", "leetcode"}, new String[]{"e", "o"});
    }

    public List<String> wordSubsets(String[] A, String[] B) {
        List<int[]> a = new ArrayList<>();
        Set<String> answer = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            String s = A[i];

            int[] z = new int[26];
            Arrays.fill(z, 0);
            for (int j = 0; j < s.length(); j++) {
                z[s.charAt(j) - 'a']++;
            }
            a.add(z);
        }

        List<int[]> b = new ArrayList<>();

        for (int i = 0; i < B.length; i++) {
            String s = B[i];
            int[] z = new int[26];
            Arrays.fill(z, 0);
            for (int j = 0; j < s.length(); j++) {
                z[s.charAt(j) - 'a']++;
            }
            b.add(z);
        }


        for (int j = 0; j < a.size(); j++) {

            if(answer.contains(A[j])) continue;
            int[] x = a.get(j);
            boolean v = true;
            for (int i = 0; i < b.size(); i++) {
                int[] z = b.get(i);

                boolean is = true;

                for (int k = 0; k < 26; k++) {
                    if (x[k] < z[k]) {
                        is = false;
                        break;
                    }
                }
                if (!is) {
                    v = false;
                    break;
                }
            }
            if (v)
                answer.add(A[j]);
        }

        return new ArrayList<>(answer);
    }

}