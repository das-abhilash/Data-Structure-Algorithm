package app.zollet.leetcode.dsalgo;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class LeetCodeSolution {

    public void execute() {
        int a = openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202");
    }


    public int openLock(String[] deadends, String target) {
        // Map the next slot digit for each current slot digit.
        Map<Character, Character> nextSlot = Map.of(
                '0', '1',
                '1', '2',
                '2', '3',
                '3', '4',
                '4', '5',
                '5', '6',
                '6', '7',
                '7', '8',
                '8', '9',
                '9', '0'
        );
        // Map the previous slot digit for each current slot digit.
        Map<Character, Character> prevSlot = Map.of(
                '0', '9',
                '1', '0',
                '2', '1',
                '3', '2',
                '4', '3',
                '5', '4',
                '6', '5',
                '7', '6',
                '8', '7',
                '9', '8'
        );

        Set<String> visited = new HashSet<>(Arrays.asList(deadends));

        Queue<String> combinations = new LinkedList<>();

        if (visited.contains("0000"))
            return -1;

        combinations.add("0000");
        visited.add("0000");
        int count = 0;

        while (!combinations.isEmpty()) {

            int ite = combinations.size();
            for (int i = 0; i < ite; i++) {
                String c = combinations.poll();

                if (c.equals(target)) {
                    return count;
                }


                for (int j = 0; j < 4; j++) {

                    StringBuilder next = new StringBuilder(c);
                    next.setCharAt(j, nextSlot.get(next.charAt(j)));
                    if (!visited.contains(next.toString())) {
                        visited.add(next.toString());
                        combinations.add(next.toString());
                    }

                    StringBuilder prev = new StringBuilder(c);
                    prev.setCharAt(j, prevSlot.get(prev.charAt(j)));
                    if (!visited.contains(prev.toString())) {
                        visited.add(prev.toString());
                        combinations.add(prev.toString());
                    }
                }
                count++;
            }
        }

        return -1;
    }
}