package app.zollet.leetcode.dsalgo.util;

import java.util.ArrayList;
import java.util.List;

class WordDictionary {

    private TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public WordDictionary() {
        root = new TrieNode('$');
    }

    /**
     * Adds a word into the data structure.
     */

    public void addWord(String word) {
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            TrieNode node = find(c, cur);
            if (node == null) {
                node = new TrieNode(c);
                cur.children.add(node);
            }
            cur = node;
        }
        cur.isWord = true;
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        TrieNode cur = root;
        return findMatching(word, cur, 0);
    }

    private boolean findMatching(String word, TrieNode cur, int i) {

        if (i >= word.length()) {
            return cur.isWord;
        }

        char c = word.charAt(i);

        if (c == '.') {
            for (TrieNode node : cur.children) {
                if (findMatching(word, node, i + 1)) return true;
            }
            return false;
        } else {
            TrieNode node = find(c, cur);
            if (node == null) return false;
            return findMatching(word, node, i + 1);
        }
    }

    private TrieNode find(char c, TrieNode cur) {
        for (TrieNode node : cur.children) {
            if (node.c == c) return node;
        }
        return null;
    }

    class TrieNode {
        char c;
        List<TrieNode> children;
        boolean isWord;

        TrieNode(char c) {
            this.c = c;
            children = new ArrayList<>();
            isWord = false;
        }
    }
}