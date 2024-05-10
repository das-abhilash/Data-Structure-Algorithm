package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.List;

public class LeetCodeSolution {

    public void execute() {
    }

    class Fraction {
        int nom;
        int dem;
        float val;

        Fraction(int nom, int dem, float val) {
            this.nom = nom;
            this.dem = dem;
            this.val = val;
        }

    }

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        List<Fraction> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                list.add(new Fraction(arr[i], arr[j], (float) arr[i] / arr[j]));
            }
        }

        list.sort((o1, o2) -> o1.val < o2.val ? -1 : (o1 == o2 ? 0 : 1));

        Fraction fraction = list.get(k-1);

        return new int[]{fraction.nom, fraction.dem};

    }


}


