package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0) return true;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) continue;
            boolean p = (i == 0) || flowerbed[i - 1] == 0;
            boolean a = (i == flowerbed.length - 1) || flowerbed[i + 1] == 0;
            if (p && a) {
                n--;
                flowerbed[i] = 1;
            }
            if (n == 0) return true;
        }
        return n == 0;
    }

}