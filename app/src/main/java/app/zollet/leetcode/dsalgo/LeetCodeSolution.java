package app.zollet.leetcode.dsalgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCodeSolution {

    public void execute() {

    }

    public int removeDuplicates(int[] nums) {

        Map<Integer, Integer> set = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            set.put(nums[i], set.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>(set.keySet());
        Collections.sort(list);
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            int c = set.get(list.get(i));
            nums[index++] = list.get(i);
            if (c > 1)
                nums[index++] = list.get(i);
        }
        return index;
    }

}