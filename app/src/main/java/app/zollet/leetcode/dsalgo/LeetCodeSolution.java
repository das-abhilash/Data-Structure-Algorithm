package app.zollet.leetcode.dsalgo;


import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {

    public void execute() {
        int a = minimumAddedInteger(new int[]{4,7,5}, new int[]{5});
//        int a = minimumAddedInteger(new int[]{4,20,16,12,8}, new int[]{14,18,10});
//        int a = minimumAddedInteger(new int[]{3,5,5,3}, new int[]{7,7});
    }

    public int minimumAddedInteger(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int diff = nums2[j] - nums1[i];
                map.put(diff, map.getOrDefault(diff, 0) + 1);
            }
        }

        int ans = Integer.MAX_VALUE;
        int max = -1;
        for (Integer key : map.keySet()) {
            if(map.get(key)>max){
                ans = Math.min(ans,key);
                max = map.get(key);
            }
        }
        return ans;
    }


}