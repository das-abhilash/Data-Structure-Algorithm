package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCodeSolution {


    public void execute() {

    }

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums2.length; i++) {
            int count = map.getOrDefault(nums2[i], 0);
            if (count > 0) {
                ans.add(nums2[i]);
                map.put(nums2[i], count - 1);
            }
        }

        // Convert the list to an array and return
        int[] intersectionArray = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            intersectionArray[i] = ans.get(i);
        }

        return intersectionArray;
    }

}


