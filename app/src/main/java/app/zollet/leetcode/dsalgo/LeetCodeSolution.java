package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
    }

    public boolean canReach(int[] arr, int start) {

        return solve(arr, start);


    }

    private boolean solve(int[] arr, int index) {

        if (arr[index] == 0) return true;
        if (arr[index] == -1) return false;
        int v1 = arr[index] + index;
        int v2 = -arr[index] + index;

        int temp = arr[index];
        arr[index] = -1;

        boolean a1 = (v1 < arr.length && v1 >= 0) && solve(arr, v1);
        boolean a2 = (v2 < arr.length && v2 >= 0) && solve(arr, v2);
        arr[index] = temp;
        return a1 || a2;
    }

}