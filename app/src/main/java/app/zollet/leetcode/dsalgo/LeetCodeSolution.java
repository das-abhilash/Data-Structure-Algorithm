package app.zollet.leetcode.dsalgo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCodeSolution {

    public void execute() {
        List<List<Integer>> a = permuteUnique(new int[]{1, 1, 2});
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> answer = new ArrayList<>();

        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            input.add(nums[i]);
        }

        solve(answer, input, new ArrayList<Integer>(), input.size());

        return answer;
    }

    private void solve(List<List<Integer>> answer, List<Integer> input, List<Integer> list, int size) {

        if (size == 0) {
            answer.add(new ArrayList<>(list));
            return;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) == -100 || set.contains(input.get(i))) continue;
            int v = input.get(i);
            list.add(v);
            set.add(v);
            input.set(i, -100);
            solve(answer, input, list, size - 1);
            list.remove(list.size() - 1);
            input.set(i, v);
        }
    }


}