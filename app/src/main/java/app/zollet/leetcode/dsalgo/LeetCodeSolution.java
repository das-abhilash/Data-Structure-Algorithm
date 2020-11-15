package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCodeSolution {

    public void execute() {
        boolean a = closeStrings("cabbba", "abbccc");
    }

    public boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < word2.length(); i++) {
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0) + 1);
        }

        if (map1.size() != map2.size()) return false;

        List<Integer> list1 = new ArrayList<>(map1.values());
        List<Integer> list2 = new ArrayList<>(map2.values());

        Collections.sort(list1);
        Collections.sort(list2);

        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) return false;
        }

        List<Character> list11 = new ArrayList<>(map1.keySet());
        List<Character> list22 = new ArrayList<>(map2.keySet());
        Collections.sort(list11);
        Collections.sort(list22);

        for (int i = 0; i < list1.size(); i++) {
            if (!list11.get(i).equals(list22.get(i))) return false;
        }

        return true;
    }

}