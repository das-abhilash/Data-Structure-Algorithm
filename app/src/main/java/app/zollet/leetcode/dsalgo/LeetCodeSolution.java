package app.zollet.leetcode.dsalgo;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Comparator;
import java.util.TreeMap;

public class LeetCodeSolution {

    public void execute() {
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums.length == 0) return nums;
        TreeMap<Integer, Integer> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return Integer.compare(integer, t1) * -1;
            }
        });
        int[] a = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < k && i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        a[index++] = map.firstKey();

        for (int i = k; i < nums.length; i++) {
            int v = map.getOrDefault(nums[i - k], 0);
            if (v == 1)
                map.remove(nums[i - k]);
            else
                map.put(nums[i - k], v - 1);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            a[index++] = (map.firstKey());
        }

        return a;
    }

}