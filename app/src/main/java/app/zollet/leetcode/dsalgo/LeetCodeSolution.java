package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {
        int a = maxTurbulenceSize(new int[]{9, 4, 2, 10, 7, 8, 8, 1, 9});
    }

    public int maxTurbulenceSize(int[] arr) {

        if (arr.length < 2) {
            return arr.length;
        }

        int start = 1;
        for (; start < arr.length; start++) {
            if (arr[start] != arr[start - 1]) break;
        }
        if (start == arr.length) return 1;


        boolean isGreater = arr[start] > arr[start - 1];
        int count = 2;
        int answer = 2;

        for (int i = 2; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                i++;
                if (i < arr.length) {
                    i++;
                    count = 2;
                    isGreater = arr[i] > arr[i - 1];
                }
                continue;
            }
            if (arr[i] > arr[i - 1] == !isGreater) {
                isGreater = !isGreater;
                count++;
                answer = Math.max(answer, count);
            } else {
                isGreater = arr[i] > arr[i - 1];
                count = 2;
            }

        }
        return answer;
    }

}