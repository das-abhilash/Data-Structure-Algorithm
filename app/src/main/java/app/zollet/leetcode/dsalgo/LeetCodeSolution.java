package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class LeetCodeSolution {

    public void execute() {
    }


    public class Pair {
        double first;
        int second;

        public Pair(double first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {

        List<Pair> list = new ArrayList<>();

        for (int i = 0; i < quality.length; i++) {
            list.add(new Pair((1.0 * (wage[i]) / quality[i]), quality[i]));
        }

        Collections.sort(list, Comparator.comparingDouble(o -> o.first));

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        double ans = Double.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {

            double ratio = list.get(i).first;
            int q = list.get(i).second;

            queue.add(q);
            sum = sum + q;

            if (queue.size() > k) {
                sum = sum - queue.poll();
            }

            if (queue.size() == k) {
                ans = Math.min(ans, sum * ratio);
            }


        }

        return ans;
    }

}


