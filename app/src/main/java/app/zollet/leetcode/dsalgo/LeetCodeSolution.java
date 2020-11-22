package app.zollet.leetcode.dsalgo;

import java.util.HashSet;
import java.util.Set;

public class LeetCodeSolution {
    public void execute() {

    }


    public int uniqueMorseRepresentations(String[] words) {

        String[] m = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> set = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            set.add(code(words[i], m));
        }
        return set.size();
    }

    private String code(String words, String[] m) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length(); i++) {
            sb.append(sb.charAt(i) - 'a');
        }
        return sb.toString();
    }

}