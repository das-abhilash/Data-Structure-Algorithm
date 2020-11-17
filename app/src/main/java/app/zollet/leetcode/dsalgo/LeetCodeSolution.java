package app.zollet.leetcode.dsalgo;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LeetCodeSolution {

    public void execute() {
    }

    class TimeMap {

        Map<String, TreeMap<Integer, String>> map;

        /**
         * Initialize your data structure here.
         */
        public TimeMap() {
            map = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {

            TreeMap<Integer, String> treeMap = map.getOrDefault(key, new TreeMap<>());
            treeMap.put(timestamp, value);
            map.put(key, treeMap);
        }

        public String get(String key, int timestamp) {

            if (!map.containsKey(key)) return "";

            TreeMap<Integer, String> treeMap = map.get(key);

            Map.Entry<Integer, String> e = treeMap.floorEntry(timestamp);
            return e == null ? "" : e.getValue();
        }
    }

}