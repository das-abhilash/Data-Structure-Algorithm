package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCodeSolution {

    public void execute() {
    }

    public int minAnagramLength(String s) {

        List<Integer> divisors = new ArrayList<>();

        int n = s.length();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int k = n / i;
                if (k == i) {
                    divisors.add(k);
                } else {
                    divisors.add(k);
                    divisors.add(i);
                }
            }
        }

        Collections.sort(divisors);


        for (int i = 0; i < divisors.size(); i++) {
            int ans = divisors.get(i);
            Map<Character, Integer> pre = new HashMap<>();
            for (int j = 0; j < ans; j++) {
                pre.put(s.charAt(j), pre.getOrDefault(s.charAt(j), 0) + 1);
            }

            boolean isMatched = true;

            for (int j = ans; j < n; j = j + ans) {
                Map<Character, Integer> post = new HashMap<>();
                for (int k = j; k < j + ans; k++) {
                    post.put(s.charAt(k), post.getOrDefault(s.charAt(k), 0) + 1);
                }

                if(!pre.equals(post)){
                    isMatched = false;
                    break;
                }
            }

            if(isMatched) return ans;

        }
        return n;
    }

}


