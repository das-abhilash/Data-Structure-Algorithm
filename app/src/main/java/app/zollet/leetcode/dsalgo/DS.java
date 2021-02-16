package app.zollet.leetcode.dsalgo;

import android.util.Log;

public class DS {

    /*
     * [20 , 30 , 5, 2, 100 ,50, 1]
     * [5,4,3,2,1]
     * [5,5,5,5,5]
     *
     * */


    public void run() {
        profit(new int[]{20, 30, 5, 2, 100, 50, 1});
        profit(new int[]{5, 4, 3, 2, 1});
        profit(new int[]{5, 5, 5, 5, 5});
        profit(new int[]{1, 2, 3, 4, 5});
        profit(new int[]{1, 1, 1, 1, 1, 1, 1});
    }

    private void profit(int[] stocks) {
        if (stocks.length < 1) {
            Log.d("sdf", "0");
            return;
        }

        int p = 0;
        int minP = -1;
        int maxP = -1;
        int min = 0;

        for (int i = 1; i < stocks.length; i++) {
            if (stocks[i] > stocks[min]) {
                int temp = stocks[i] - stocks[min];
                if (temp > p) {
                    p = temp;
                    minP = min;
                    maxP = i;
                }
            } else {
                min = i;
            }
        }
        String output;
        if (p > 0) {
            output = "max " + maxP + " min " + minP + " prfit " + p;
        } else {
            output = "max " + " NA" + " min " + "NA" + " prfit " + 0;
        }
        Log.d("sdf", output);
    }

}
