package app.zollet.leetcode.dsalgo;


import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {


    public void execute() {
        int a = threeSumMulti(new int[]{1,1,2,2,3,3,4,4,5,5},8);
    }

    public int threeSumMulti(int[] arr, int target) {

        int mod = 1000000007;
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            int t = target - arr[i];
            for (int j = i + 1; j < arr.length; j++) {

                if (map.containsKey(t - arr[j])) {
                    a = (a + map.get(t - arr[j]) % mod) % mod;
                }
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);

                /*for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target)
                        a++;
                }*/
            }
        }
        return a;
    }

}