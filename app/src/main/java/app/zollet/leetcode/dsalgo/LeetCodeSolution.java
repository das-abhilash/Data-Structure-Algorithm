package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCodeSolution {

    public void execute() {
    }

    class OrderedStream {

        String[] a;
        int pointer;

        public OrderedStream(int n) {
            a = new String[n];
            pointer = 0;
            Arrays.fill(a, "");
        }

        public List<String> insert(int id, String value) {
            a[id - 1] = value;
            if (a[pointer].equals("")) {
                return Collections.emptyList();
            }

            List<String> list = new ArrayList<>();
            while (pointer < a.length && !a[pointer].equals("")) {
                list.add(a[pointer++]);
            }
            return list;
        }
    }


}