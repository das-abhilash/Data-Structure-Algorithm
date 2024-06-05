package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeSolution {

    public void execute() {
        List<String> a = commonChars(new String[]{"bella", "label", "roller"});
    }


    public List<String> commonChars(String[] words) {


        int[] common = new int[26];
        Arrays.fill(common, 0);

        for (int i = 0; i < words[0].length(); i++) {
            char c = words[0].charAt(i);
            common[c - 'a']++;
        }

        int[] current = new int[26];

        for (int i = 1; i < words.length; i++) {

            Arrays.fill(current, 0);
            String word = words[i];

            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                current[c - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                common[j] = Math.min(current[j], common[j]);
            }
        }

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            while (common[i] > 0) {
                ans.add(String.valueOf((char) ('a' + i)));
                common[i]--;
            }
        }
        return ans;
    }


}


