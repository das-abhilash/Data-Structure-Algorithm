package app.zollet.leetcode.dsalgo.util;

import java.util.PriorityQueue;

class CombinationIterator {

    PriorityQueue<String> q;

    public CombinationIterator(String characters, int combinationLength) {
        q = new PriorityQueue<>();
        findAllCombinations(characters, combinationLength, 0, "");
        int sf = 0;
    }

    private void findAllCombinations(String characters, int combinationLength, int index, String word) {

        if (combinationLength == 0) {
            q.add(word);
            return;
        }

        if (combinationLength < 0) return;

        for (int i = index; i < characters.length(); i++) {
            findAllCombinations(characters, combinationLength - 1, i + 1, word + characters.charAt(i));
        }
    }

    public String next() {
        return q.poll();
    }

    public boolean hasNext() {
        return !q.isEmpty();
    }
}