package app.zollet.leetcode.dsalgo;


import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCodeSolution {

    public void execute() {
    }

    class Fraction {
        int nom;
        int dem;
        double val;

        Fraction(int nom, int dem, double val) {
            this.nom = nom;
            this.dem = dem;
            this.val = val;
        }

    }

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Fraction> pq = new PriorityQueue<>(Comparator.comparingDouble(o -> o.val));

        for (int i = 0; i < arr.length; i++) {
            pq.add(new Fraction(i, arr.length - 1, (double) arr[i] / arr[arr.length - 1]));
        }

        while (k > 1) {

            Fraction f = pq.poll();

            if (f.dem - 1 > f.nom)
                pq.add(new Fraction(f.nom, f.dem - 1, (double) arr[f.nom] / arr[f.dem - 1]));


            k--;
        }

        Fraction a = pq.poll();

        return new int[]{arr[a.nom], arr[a.dem]};

    }


}


