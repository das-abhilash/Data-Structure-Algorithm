package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCodeSolution {


    public void execute() {


        subsetsWithDup(new int[]{1, 2, 2});
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Set<List<Integer>> answer = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);
        solve(answer, list, nums, 0);


        return new ArrayList<>(answer);
    }

    private void solve(Set<List<Integer>> answer, List<Integer> list, int[] nums, int i) {
        List<Integer> l = new ArrayList<>(list);
        answer.add(l);
        for (int j = i; j < nums.length; j++) {
            list.add(nums[j]);
            solve(answer, list, nums, j + 1);
            list.remove(list.size() - 1);
        }
    }

}