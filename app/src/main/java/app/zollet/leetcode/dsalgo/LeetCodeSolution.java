package app.zollet.leetcode.dsalgo;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCodeSolution {

    public String replaceWords(List<String> dictionary, String sentence) {

        Set<String> set = new HashSet<>(dictionary);

        String[] s = sentence.split(" ");


        for (int i = 0; i < s.length; i++) {

            String word = s[i];

            StringBuilder sb = new StringBuilder();

            String replace = "";

            for (int j = 0; j < word.length(); j++) {
                sb.append(word.charAt(j));
                if (set.contains(sb.toString())) {
                    if (replace.isEmpty() || replace.length() > sb.length()) {
                        replace = sb.toString();
                    }
                }
            }

            if (!replace.isEmpty()) {
                s[i] = replace;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length - 1; i++) {
            ans.append(s[i]);
            ans.append(" ");
        }
        ans.append(s[s.length - 1]);
        return ans.toString();
    }


}


