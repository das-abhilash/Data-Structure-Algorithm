package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {

    }

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {

        int[] answer = new int[A.length];
        int sum = 0;
        for (int value : A) {
            if (value % 2 == 0) sum += value;
        }

        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][1];
            int val = queries[i][0];

            int temp = A[index];

            if (temp % 2 == 0) sum -= temp;

            A[index] = val + temp;

            if (A[index] % 2 == 0) {
                sum -= A[index];
            }
            answer[i] = sum;
        }
        return answer;
    }

}