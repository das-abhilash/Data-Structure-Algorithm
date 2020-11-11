package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
        boolean a = validSquare(new int[]{1, 0}, new int[]{-1, 0}, new int[]{0, 1}, new int[]{0, -1});
    }

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {


        long a = dist(p1, p2);
        long b = dist(p1, p3);
        long c = dist(p1, p4);

        if (a == b && c != 2 * a) return false;
        if (b == c && a != 2 * b) return false;
        if (a == c && b != 2 * c) return false;
        if (a != b && b != c && a != c) return false;

        a = dist(p2, p1);
        b = dist(p2, p3);
        c = dist(p2, p4);

        if (a == b && c != 2 * a) return false;
        if (b == c && a != 2 * b) return false;
        if (a == c && b != 2 * c) return false;
        if (a != b && b != c && a != c) return false;

        a = dist(p3, p2);
        b = dist(p3, p1);
        c = dist(p3, p4);

        if (a == b && c != 2 * a) return false;
        if (b == c && a != 2 * b) return false;
        if (a == c && b != 2 * c) return false;
        if (a != b && b != c && a != c) return false;
        return true;
    }

    private long dist(int[] p1, int[] p2) {
        return ((long) (p1[0] - p2[0]) * (p1[0] - p2[0])) + ((long) (p1[1] - p2[1]) * (p1[1] - p2[1]));
    }

}