package app.zollet.leetcode.dsalgo;


import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {


    public void execute() {

        String[] c = spellchecker(new String[]{"KiTe", "kite", "hare", "Hare"}, new String[]{"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"});
    }

    public String[] spellchecker(String[] wordlist, String[] queries) {

        Map<String, String> dict = new HashMap<>();

        for (String w :
                wordlist) {
            if (!dict.containsKey(w.toLowerCase() + '$'))
                dict.put(w.toLowerCase() + '$', w);
            dict.put(w, w);
            char[] chars = w.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (isVowel(c)) {
                    chars[i] = '#';
                }
            }
            String wo = new String(chars);
            if (!dict.containsKey(wo.toLowerCase() + '$'))
                dict.put(wo.toLowerCase() + '$', w);

        }

        String[] a = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {
            if (dict.containsKey(queries[i])) {
                a[i] = dict.get(queries[i]);
            } else if (dict.containsKey(queries[i].toLowerCase() + '$'))
                a[i] = dict.get(queries[i].toLowerCase() + '$');
            else {
                char[] chars = queries[i].toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char c = chars[j];
                    if (isVowel(c)) {
                        chars[j] = '#';
                    }
                    String wo = new String(chars);
                    if (dict.containsKey(wo))
                        a[i] = dict.get(wo);
                    else if (dict.containsKey(wo.toLowerCase() + '$')) {
                        a[i] = dict.get(wo.toLowerCase() + '$');
                    } else {
                        a[i] = "";
                    }
                }
            }
        }
        return a;
    }

    public boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

}